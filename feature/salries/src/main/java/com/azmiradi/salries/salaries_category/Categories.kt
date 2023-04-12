package com.azmiradi.salries.salaries_category

import androidx.annotation.IdRes
import androidx.annotation.StringRes
import com.azmiradi.salries.R

enum class Categories(@StringRes val title:Int, @IdRes val fragmentId:Int){
    Entitlements(R.string.entitlements, R.id.entitlements_fragment),
    Insurances(R.string.insurances, R.id.insurances_fragment),
    Deductions(R.string.deductions, R.id.deductions_fragment)
}