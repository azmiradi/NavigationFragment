package com.azmiradi.salries.deductions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.viewbinding.ViewBinding
import com.azmiradi.salries.BaseFragment
import com.azmiradi.salries.R
import com.azmiradi.salries.databinding.FragmentDeductionsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DeductionsFragment : BaseFragment<FragmentDeductionsBinding>() {
    override val bindingInitializer: (LayoutInflater) -> ViewBinding =
        FragmentDeductionsBinding::inflate

    val viewModel: DeductionsViewModel by hiltNavGraphViewModels(R.id.main_navigation)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}