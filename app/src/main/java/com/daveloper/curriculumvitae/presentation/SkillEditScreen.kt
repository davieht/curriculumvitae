package com.daveloper.curriculumvitae.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daveloper.curriculumvitae.AppState
import com.daveloper.curriculumvitae.ChipVerticalGrid
import com.daveloper.curriculumvitae.R
import com.daveloper.curriculumvitae.data.entities.Profile
import com.daveloper.curriculumvitae.sampleProfile

@Composable
fun SkillScreen(
    appState: AppState,
    // Viewmodel
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Save Skill")
            }
        },
        scaffoldState = appState.scaffoldState
    ) { paddingValues ->
        LazyColumn(modifier = Modifier
            .padding(paddingValues)
            .fillMaxWidth()
            ) {

        }
    }
}

@Composable
fun ProfileEditView(profile: Profile) {
    Column(Modifier.fillMaxWidth()) {
        OutlinedTextField(
            value = profile.name,
            label = { Text(text = stringResource(R.string.name_label)) },
            placeholder = { Text(text = stringResource(R.string.username_placeholder)) },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = profile.birthdate,
            label = { Text(text = stringResource(R.string.birthdate_label)) },
            placeholder = { Text(text = stringResource(R.string.birthdate_placeholder)) },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = profile.address,
            label = { Text(text = stringResource(R.string.address_label)) },
            placeholder = { Text(text = stringResource(R.string.address_placeholder)) },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = profile.email,
            label = { Text(text = stringResource(R.string.email_label)) },
            placeholder = { Text(text = stringResource(R.string.email_placeholder)) },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = profile.phone,
            label = { Text(text = stringResource(R.string.phone_label)) },
            placeholder = { Text(text = stringResource(R.string.phone_placeholder)) },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun ProfileEditViewPreview() {
    ProfileEditView(profile = sampleProfile)
}

@Composable
fun SkillEditItem(
    label: String,
    percentage: Float,
    onTextValueChange: (String) -> Unit,
    onSliderValueChange: (Float) -> Unit
) {
    Column(Modifier.fillMaxWidth()) {
        OutlinedTextField(
            value = label,
            onValueChange = onTextValueChange,
            label = { Text(text = "Skill") },
            placeholder = { Text(text = "skill") },
            modifier = Modifier.fillMaxWidth()
        )
        Slider(
            value = percentage,
            onValueChange = onSliderValueChange,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun SkillEditItemPreview() {
    SkillEditItem(label = "test", percentage = .5f, {}, {})
}

//@OptIn(ExperimentalMaterialApi::class)
//@Composable
//fun ChipSkillItem(skills: List<String>) {
//    ChipVerticalGrid(spacing = 2.dp) {
//        skills.forEach { skill ->
//            Chip(onClick = { }) {
//                Row {
//                    Text(text = skill)
//                    Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete Skill")
//                }
//            }
//        }
//    }
//}
//
//@Preview
//@Composable
//fun ChipSkillItemPreview() {
//    ChipSkillItem(listOf("as", "blaksd", "reqw"))
//}