package com.azmiradi.salries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding
import com.azmiradi.salries.databinding.FragmentSaleriesBinding
import com.azmiradi.salries.salaries_category.SalariesCategoriesAdaptor


class SalariesFragment : BaseFragment<FragmentSaleriesBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding =
        FragmentSaleriesBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val navController = mainNavigationHost.getFragment<NavHostFragment>().navController
            salariesCategoriesRv.adapter =
                SalariesCategoriesAdaptor {
                    navController.navigate(it)
                }

            addOnBackPressedCallback(navController = navController)
        }
    }

    private fun addOnBackPressedCallback(navController: NavController) {
        val onBack = activity?.onBackPressedDispatcher
        onBack?.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    navController.run {
                        val startDestinationId = graph.findStartDestination().id
                        isEnabled = currentBackStackEntry?.destination?.id != startDestinationId
                        if (isEnabled) {
                            popBackStack(startDestinationId, false)
                        } else {
                            activity?.onBackPressed()
                        }
                    }
                }
            })
    }

}