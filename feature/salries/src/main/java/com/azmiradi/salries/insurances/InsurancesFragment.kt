package com.azmiradi.salries.insurances

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.viewbinding.ViewBinding
import com.azmiradi.salries.BaseFragment
import com.azmiradi.salries.R
import com.azmiradi.salries.databinding.FragmentInsurancesBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class InsurancesFragment : BaseFragment<FragmentInsurancesBinding>() {
    override val bindingInitializer: (LayoutInflater) -> ViewBinding =
        FragmentInsurancesBinding::inflate

    val viewModel: InsurancesViewModel by hiltNavGraphViewModels(R.id.main_navigation)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}