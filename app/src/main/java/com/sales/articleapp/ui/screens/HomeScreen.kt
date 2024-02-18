package com.sales.articleapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.sales.articleapp.ui.viewmodel.ArticleViewModel

@Composable
fun HomeScreen(
    articleViewModel: ArticleViewModel = hiltViewModel()
) {

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
