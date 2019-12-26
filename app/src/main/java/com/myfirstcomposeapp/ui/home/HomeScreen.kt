/*
 * Copyright 2019 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.myfirstcomposeapp.ui.home

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Opacity
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.withOpacity
import androidx.ui.tooling.preview.Preview
import com.myfirstcomposeapp.data.profile
import com.myfirstcomposeapp.data.projects


@Composable
fun HomeScreen() {
    Column {
        TopAppBar(
            title = { Text(text = "Shivam Yadav") }
        )
        VerticalScroller(modifier = Flexible(1f)) {
            Column {
                HomeScreenTopSection()
                HomeScreenSimpleSection()
                Projects()
                HomeScreenHistorySection()
            }
        }
    }
}

@Composable
private fun HomeScreenTopSection() {

    Text(
        modifier = Spacing(top = 16.dp, left = 16.dp, right = 16.dp),
        text = "This is the top section.",
        style = ((+MaterialTheme.typography()).subtitle1).withOpacity(0.87f)
    )
    Ripple(bounded = true) {
        Clickable(onClick = {
//            navigateTo(Screen.Article(post.id))
        }) {
//            PostCardTop(post = post)
        }
    }
    HomeScreenDivider()
}

@Composable
private fun HomeScreenSimpleSection() {
    profile.image?.let { image ->
        Container(modifier = MinHeight(180.dp) wraps ExpandedWidth) {
            Clip(shape = RoundedCornerShape(4.dp)) {
                DrawImage(image)
            }
        }
        HeightSpacer(height = 16.dp)
    }

}

@Composable
private fun Projects() {
    Text(
        modifier = Spacing(16.dp),
        text = "Projects",
        style = ((+MaterialTheme.typography()).subtitle1).withOpacity(0.87f)
    )

    HorizontalScroller {
        Row(modifier = Spacing(bottom = 16.dp, right = 16.dp)) {
            projects.forEach{ project ->
                WidthSpacer(width = 16.dp)
                ProjectCard(project = project)
            }
        }
    }
    HomeScreenDivider()
}

@Composable
private fun HomeScreenHistorySection() {

}

@Composable
private fun HomeScreenDivider() {
    Opacity(0.08f) {
        Divider(modifier = Spacing(left = 14.dp, right = 14.dp))
    }
}

@Preview
@Composable
fun preview() {
    HomeScreen ()
}
