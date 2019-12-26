package com.myfirstcomposeapp.ui.home

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Card
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import com.myfirstcomposeapp.R
import com.myfirstcomposeapp.data.Project
import com.myfirstcomposeapp.ui.Screen
import com.myfirstcomposeapp.ui.navigateTo

@Composable
fun ProjectCard(project: Project){
    Card(shape = RoundedCornerShape(3.dp)) {
        Ripple(bounded = true) {
            Clickable(onClick = {
                navigateTo(Screen.Project(project.id))
            }) {
                Container(modifier = Size(300.dp, 200.dp)) {
                    Column(modifier = Expanded) {
                        val projectImage= project.image?: +imageResource(R.drawable.no_image_placeholder)
                        Container(modifier = Height(100.dp) wraps Expanded) {
                            DrawImage(projectImage)
                        }
                            Column(modifier = Spacing(16.dp)) {
                                Text(
                                    text = project.name,
                                    style = ((+MaterialTheme.typography()).h6).withOpacity(0.87f),
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Text(
                                    text = project.description,
                                    style = ((+MaterialTheme.typography()).body2).withOpacity(0.87f),
                                    maxLines = 3,
                                    overflow = TextOverflow.Ellipsis
                                )
                        }
                    }
                }
            
            }
        }
    }
}