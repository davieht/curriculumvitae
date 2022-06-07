package com.daveloper.curriculumvitae.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daveloper.curriculumvitae.core.Dimensions
import com.daveloper.curriculumvitae.data.entities.Profile
import com.daveloper.curriculumvitae.data.entities.Skill
import com.daveloper.curriculumvitae.sampleProfile

@Composable
fun PersonalDataView(profile: Profile) {
    Column(Modifier.fillMaxWidth()) {
        //Image(painter = , contentDescription = )
        PersonalDataItem(
            icon = Icons.Default.Work,
            text = profile.profession
        )
        PersonalDataItem(
            icon = Icons.Default.Cake,
            text = profile.birthdate
        )
        PersonalDataItem(
            icon = Icons.Default.Home,
            text = profile.address
        )
        PersonalDataItem(
            icon = Icons.Default.Mail,
            text = profile.email
        )
        PersonalDataItem(
            icon = Icons.Default.Phone,
            text = profile.phone
        )
    }
}

@Preview
@Composable
fun PersonalDataViewPreview() {
    PersonalDataView(profile = sampleProfile)
}

@Composable
fun PersonalDataItem(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(imageVector = icon, tint = MaterialTheme.colors.primary, contentDescription = "")
        Spacer(Modifier.width(Dimensions.ICON_TEXT_PADDING))
        Text(text = text)
    }
}

@Preview
@Composable
fun PersonalDataItemPreview() {
    PersonalDataItem(icon = Icons.Default.Person, text = "Android Developer")
}

@Composable
fun SkillsView(skills: List<Skill>) {
    Column {

    }
}

@Composable
fun ViewHeaderView(icon: ImageVector, title: String) {
    Row {
        Icon(imageVector = icon, contentDescription = "")
        Text(text = title)
    }
}

@Preview
@Composable
fun ViewHeaderViewPreview() {
    ViewHeaderView(icon = Icons.Default.Person, title = "Skills")
}

@Composable
fun SkillItem(label: String, progress: Float) {
    Column {
        Text(text = label)
        Spacer(Modifier.height(4.dp))
        LinearProgressIndicator(
            progress = progress, Modifier
                .height(16.dp)
        )
    }
}

@Preview
@Composable
fun SkillItemPreview() {
    SkillItem(label = "Kotlin", progress = .4f)
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MiscItem(key: String, value: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = key)
        Spacer(Modifier.width(16.dp))
        Text(
            text = value,
            Modifier
                .background(
                    color = MaterialTheme.colors.primary,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp, 4.dp), color = MaterialTheme.colors.onPrimary
        )
    }
}

@Preview
@Composable
fun MiscItemPreview() {
    MiscItem("Os of choice", "Zorin Linux")
}

@Composable
fun CvItem(
    startDate: String,
    endDate: String,
    title: String,
    subtitle: String,
    description: String
) {
    Column {
        Row {
            Icon(imageVector = Icons.Default.Call, contentDescription = "")
            Text(text = "$startDate - $endDate")
        }
        Text(text = title)
        Text(text = subtitle)
        Text(text = description)
    }
}

@Preview
@Composable
fun CvItemPreview() {
    CvItem(
        startDate = "08/2012",
        endDate = "02/2015",
        title = "Android Developer",
        subtitle = "Google",
        description = "Implementing fancy apps."
    )
}