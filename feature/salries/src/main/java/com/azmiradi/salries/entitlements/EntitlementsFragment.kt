package com.azmiradi.salries.entitlements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.viewbinding.ViewBinding
import com.azmiradi.salries.BaseFragment
import com.azmiradi.salries.R
import com.azmiradi.salries.databinding.FragmentEntitlementsBinding
import com.azmiradi.salries.insurances.InsurancesViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class EntitlementsFragment : BaseFragment<FragmentEntitlementsBinding>() {
    override val bindingInitializer: (LayoutInflater) -> ViewBinding =
        FragmentEntitlementsBinding::inflate

    val viewModel: EntitlementsViewModel by hiltNavGraphViewModels(R.id.main_navigation)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}