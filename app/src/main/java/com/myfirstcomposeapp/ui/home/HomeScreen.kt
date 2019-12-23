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

import android.content.res.Resources
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Opacity
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Image
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.withOpacity
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview


@Composable
fun HomeScreen(openDrawer: () -> Unit) {
    Column {
        TopAppBar(
            title = { Text(text = "Shivam Yadav") },
            navigationIcon = {
                /*VectorImageButton(R.drawable.ic_jetnews_logo) {
                    openDrawer()
                }*/
            }
        )
        VerticalScroller(modifier = Flexible(1f)) {
            Column {
                HomeScreenTopSection()
                HomeScreenSimpleSection()
                HomeScreenPopularSection()
                HomeScreenHistorySection()
            }
        }
    }
}

@Composable
private fun HomeScreenTopSection() {

    Text(
        modifier = Spacing(top = 16.dp, left = 16.dp, right = 16.dp),
        text = "Top stories for you",
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

}

@Composable
private fun HomeScreenPopularSection() {
    Text(
        modifier = Spacing(16.dp),
        text = "Popular on Jetnews",
        style = ((+MaterialTheme.typography()).subtitle1).withOpacity(0.87f)
    )

    val image = imageFromResource(res = Resources.getSystem())
    Container( Size(40.dp, 40.dp)) {
        DrawImage(image)
    }

    HorizontalScroller {
        Row(modifier = Spacing(bottom = 16.dp, right = 16.dp)) {

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
    HomeScreen {}
}
