package com.daveloper.curriculumvitae

import com.daveloper.curriculumvitae.data.entities.*

val sampleProfile = Profile1(
    "1",
    name = "Jane Doe",
    birthdate = "01.01.2000",
    address = "Lagergasse 2, 1030, Wien",
    email = "jane.doe@email.com",
    phone = "+43 650 2343345",
    "Android Developer",
    "This is Sparta!",
    skills = listOf(
        Skill("Kotlin", 1f),
        Skill("Java", .9f),
        Skill("C#", .7f),
        Skill("JavaScript", .4f),
    ),
    additionalSkills = listOf(
        "Jetpack Compose", "Clean Architecture", "Scrum", "REST", "Git", "php"
    ),
    languages = listOf(
        Language("English", .9f),
        Language("German", 1f),
        Language("Spanish", .5f)
    ),
    interests = listOf(
        "Programming", "Gaming", "Literature", "Ai", "Science"
    ),
    misc = listOf(
        Misc("OS of choice", "Ubuntu"),
        Misc("IDE of choice", "Android Studio"),
        Misc("Driving Licence", "B"),
    ),
    educations = listOf(
        Education(
            0,
            "08/2011",
            "07/2013",
            "Programming",
            "Programming School",
            "Learn how to code"
        ),
        Education(
            1,
            "08/2013",
            "12/2017",
            "Computer Science - Bachelor Studies",
            "University of Austria",
            "Studying the art of how to produce bugs"
        ),
        Education(
            2,
            "01/2018",
            "07/2021",
            "Software Enineering - Master Studies",
            "Technical University of Austria",
            "Studying the science of produced bugs"
        ),
    ),
    experiences = listOf(
        Experience(
            0,
            "08/2011",
            "07/2013",
            "Junior Java Developer",
            "AI Tech Inc.",
            "Coding AI products"
        ),
        Experience(
            1,
            "08/2011",
            "07/2013",
            "Regular Java Developer",
            "IoT Tech Inc.",
            "Coding Internet of Things Things"
        ),
        Experience(
            2,
            "08/2011",
            "07/2013",
            "Senior Java Developer",
            "Java Tech Inc.",
            "Coding Java Stuff"
        ),
    )
)