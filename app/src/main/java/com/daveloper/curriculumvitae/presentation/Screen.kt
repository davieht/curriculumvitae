package com.daveloper.curriculumvitae.presentation

sealed class Screen(val route: String) {
    object MainScreen: Screen("main")
    object EducationScreen: Screen("education")
    object ExperienceScreen: Screen("experience")
    object LanguageScreen: Screen("language")
    object MiscScreen: Screen("language")
    object PersonalDataScreen: Screen("personal")
    object SkillScreen: Screen("skill")
    object SkillBubblesScreen: Screen("skill_bubbles")
    object InterestScreen: Screen("interest")
    object ReferenceScreen: Screen("reference")
}