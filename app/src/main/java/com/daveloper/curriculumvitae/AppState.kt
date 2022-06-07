package com.daveloper.curriculumvitae

import android.content.res.Resources
import androidx.compose.material.ScaffoldState
import androidx.navigation.NavController

class AppState(
    val scaffoldState: ScaffoldState,
    val navController: NavController,
    val resources: Resources
)