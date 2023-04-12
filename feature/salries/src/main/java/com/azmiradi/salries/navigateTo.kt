package com.azmiradi.salries

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.navOptions

fun NavController.navigateTo(destinationId: Int) {
        navigate(destinationId, null, navOptions {
            launchSingleTop = true
            restoreState = true
            popUpTo(graph.findStartDestination().id) {
                saveState = true
            }
        })
    }

