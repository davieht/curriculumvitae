package com.daveloper.curriculumvitae.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daveloper.curriculumvitae.R
import com.daveloper.curriculumvitae.core.Dimensions
import com.daveloper.curriculumvitae.data.entities.*
import com.daveloper.curriculumvitae.sampleProfile
import com.google.accompanist.flowlayout.FlowRow

@Composable
fun PersonalDataView(profile: Profile1) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(16.dp, 0.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.person),
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Spacer(modifier = Modifier.height(16.dp))
        PersonalDataItem(
            icon = Icons.Default.Person,
            text = profile.name
        )
        PersonalDataItem(
            icon = Icons.Default.Work,
            text = profile.profession
        )
        PersonalDataItem(
            icon = Icons.Default.Cake,
            text = profile.birthdate
        )
//        PersonalDataItem(
//            icon = Icons.Default.Home,
//            text = profile.address
//        )
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
        Icon(imageVector = icon, tint = MaterialTheme.colors.primary, contentDescription = null)
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
fun TitleView(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = icon, tint = MaterialTheme.colors.primary, contentDescription = null)
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = text, style = MaterialTheme.typography.h6)
    }
}

@Preview
@Composable
private fun TitleViewPreview() {
    TitleView(Icons.Default.Person, "Skills")
}

@Composable
fun SkillsSection(skills: List<Skill>) {
    Column(
        modifier = Modifier.padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TitleView(icon = Icons.Default.MilitaryTech, text = "Skills")
        skills.forEach {
            SkillItem(label = it.name, progress = it.percent)
        }
    }
}

@Preview
@Composable
fun SkillsSectionPreview() {
    SkillsSection(skills = sampleProfile.skills)
}

@Composable
fun SkillCloudSection(skills: List<String>) {
    Column(
        modifier = Modifier.padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TitleView(icon = Icons.Default.Verified, text = "Additional Experiences")
        FlowRow(
            mainAxisSpacing = 8.dp,
            crossAxisSpacing = 8.dp
        ) {
            skills.forEach {
                BubbleView(text = it)
            }
        }
    }
}

@Preview
@Composable
private fun SkillCloudSectionPreview() {
    SkillCloudSection(sampleProfile.additionalSkills)
}

@Composable
fun LanguageSection(languages: List<Language>) {
    Column(
        modifier = Modifier.padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TitleView(icon = Icons.Default.Flag, text = "Languages")
        languages.forEach {
            SkillItem(label = it.name, progress = it.classification)
        }
    }
}

@Preview
@Composable
private fun LanguageSectionPreview() {
    LanguageSection(sampleProfile.languages)
}

@Composable
fun InterestsSection(interests: List<String>) {
    Column(
        modifier = Modifier.padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TitleView(icon = Icons.Default.Favorite, text = "Interests")
        FlowRow(
            mainAxisSpacing = 8.dp,
            crossAxisSpacing = 8.dp
        ) {
            interests.forEach {
                BubbleView(text = it)
            }
        }
    }
}

@Preview
@Composable
private fun InterestsSectionPreview() {
    InterestsSection(sampleProfile.interests)
}

@Composable
fun MiscSection(misc: List<Misc>) {
    Column(
        modifier = Modifier.padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TitleView(icon = Icons.Default.Add, text = "Misc.")
        misc.forEach {
            MiscItem(key = it.text, value = it.description)
        }
    }
}

@Preview
@Composable
private fun MiscSectionPreview() {
    MiscSection(sampleProfile.misc)
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
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = label)
        Spacer(modifier = Modifier.height(8.dp))
        LinearProgressIndicator(
            progress = progress, Modifier
                .height(16.dp)
                .fillMaxWidth()
                .background(Color.Transparent)
                .clip(CircleShape)
        )
    }
}

@Preview
@Composable
fun SkillItemPreview() {
    SkillItem(label = "Kotlin", progress = .4f)
}

@Composable
fun MiscItem(key: String, value: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text = key)
        Spacer(Modifier.width(16.dp))
        BubbleView(text = value)
    }
}

@Preview
@Composable
fun MiscItemPreview() {
    MiscItem("Os of choice", "Zorin Linux")
}

@Composable
fun BubbleView(text: String) {
    Text(
        text = text,
        Modifier
            .background(
                color = MaterialTheme.colors.primary,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp, 4.dp), color = MaterialTheme.colors.onPrimary
    )
}

@Preview
@Composable
private fun BubbleViewPreview() {
    BubbleView("Zorin Linux")
}

@Composable
fun EducationSection(educations: List<Education>) {
    Column(
        modifier = Modifier.padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TitleView(icon = Icons.Default.School, text = "Education")
        Spacer(modifier = Modifier.height(8.dp))
        educations.forEach {
            CvItem(
                startDate = it.startDate,
                endDate = it.endDate,
                title = it.name,
                subtitle = it.fieldOfStudy,
                description = it.description
            )
        }
    }
}

@Preview
@Composable
private fun EducationSectionPreview() {
    EducationSection(sampleProfile.educations)
}

@Composable
fun ExperienceSection(experiences: List<Experience>) {
    Column(
        modifier = Modifier.padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TitleView(icon = Icons.Default.Work, text = "Experience")
        Spacer(modifier = Modifier.height(8.dp))
        experiences.forEach {
            CvItem(
                startDate = it.startDate,
                endDate = it.endDate,
                title = it.employer,
                subtitle = it.profession,
                description = it.description
            )
        }
    }
}

@Preview
@Composable
private fun ExperienceSectionPreview() {
    ExperienceSection(sampleProfile.experiences)
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
            Icon(
                imageVector = Icons.Default.CalendarMonth,
                tint = MaterialTheme.colors.primary,
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "$startDate - $endDate")
        }
        Text(text = title, style = MaterialTheme.typography.body1)
        Text(text = subtitle, style = MaterialTheme.typography.body2)
        Text(text = description, style = MaterialTheme.typography.caption)
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