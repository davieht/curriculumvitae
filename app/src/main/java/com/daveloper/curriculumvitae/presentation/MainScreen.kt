package com.daveloper.curriculumvitae.presentation.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daveloper.curriculumvitae.presentation.*
import com.daveloper.curriculumvitae.sampleProfile
import kotlinx.coroutines.launch

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainScreen() {
    val modifier = Modifier.padding(16.dp)
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val isVisibleState by derivedStateOf {
        scrollState.value > 100
    }

    Scaffold(
        topBar = {
            TopAppBar() {
                Spacer(Modifier.weight(1f, true))
                IconButton(onClick = {

                }) {
                    Icon(Icons.Default.Info, contentDescription = null)
                }
            }
        },
        floatingActionButton = {
            AnimatedVisibility(
                visible = isVisibleState,
                enter = scaleIn(),
                exit = scaleOut()
            ) {
                FloatingActionButton(onClick = {
                    coroutineScope.launch {
                        scrollState.animateScrollTo(0)
                    }
                }) {
                    Icon(imageVector = Icons.Default.ExpandLess, contentDescription = null)
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .verticalScroll(state = scrollState)
                .padding(paddingValues = paddingValues)
        ) {
            Spacer(modifier = modifier)
            PersonalDataView(profile = sampleProfile)
            Divider(modifier = modifier)
            SkillsSection(skills = sampleProfile.skills)
            Divider(modifier = modifier)
            SkillCloudSection(skills = sampleProfile.additionalSkills)
            Divider(modifier = modifier)
            LanguageSection(languages = sampleProfile.languages)
            Divider(modifier = modifier)
            InterestsSection(interests = sampleProfile.interests)
            Divider(modifier = modifier)
            MiscSection(misc = sampleProfile.misc)
            Divider(modifier = modifier)
            ExperienceSection(experiences = sampleProfile.experiences)
            Divider(modifier = modifier)
            EducationSection(educations = sampleProfile.educations)
            Spacer(modifier = modifier)
        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}