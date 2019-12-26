package com.myfirstcomposeapp.data

import android.content.res.Resources
import androidx.ui.graphics.imageFromResource
import com.myfirstcomposeapp.R

class ProfileData {

}

var profile = Profile(
    id = "dc523f0ed25c",
    title = "A Little Thing about Android Module Paths",
    subtitle = "How to configure your module paths, instead of using Gradle’s default.",
    url = "https://medium.com/androiddevelopers/gradle-path-configuration-dc523f0ed25c",
    metadata = Metadata(
        date = "August 02",
        readTimeMinutes = 1
    ),
    imageId = R.drawable.android,
    imageThumbId = R.drawable.android
)

var project1 = Project(
    id = "1",
    name = "ABC",
    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
    logoUrl = "",
    imageId = R.drawable.lorem_ipsum
)
var project2 = Project(
    id = "2",
    name = "ABC",
    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
    logoUrl = "",
    imageId = R.drawable.lorem_ipsum
)
var project3 = Project(
    id = "3",
    name = "ABC",
    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
    logoUrl = "",
    imageId = R.drawable.lorem_ipsum
)
var project4 = Project(
    id = "4",
    name = "ABC",
    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
    logoUrl = "",
    imageId = R.drawable.lorem_ipsum
)
var project5 = Project(
    id = "5",
    name = "ABC",
    description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.",
    logoUrl = "",
    imageId = R.drawable.lorem_ipsum
)

var projects= listOf(
    project1,
    project2,
    project3,
    project4,
    project5
)

fun getProfileWithImagesLoaded(profile: Profile, resources: Resources): Profile {
    return profile.apply {
        this.image = imageFromResource(resources, profile.imageId)
        this.imageThumb = imageFromResource(resources, profile.imageThumbId)
    }
}

fun getProjectsWithImagesLoaded(projects: List<Project>, resources: Resources): List<Project> {
    return projects.map {
        it.copy(
            image = imageFromResource(resources, it.imageId)
        )
    }
}