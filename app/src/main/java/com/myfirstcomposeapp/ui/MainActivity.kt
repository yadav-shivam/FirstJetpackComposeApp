package com.myfirstcomposeapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import com.myfirstcomposeapp.data.getProfileWithImagesLoaded
import com.myfirstcomposeapp.data.getProjectsWithImagesLoaded
import com.myfirstcomposeapp.data.profile
import com.myfirstcomposeapp.data.projects
import com.myfirstcomposeapp.ui.home.HomeScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        profile= getProfileWithImagesLoaded(profile,resources)
        projects= getProjectsWithImagesLoaded(projects,resources)

        setContent {
            MaterialTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
HomeScreen()
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Greeting()
    }
}
