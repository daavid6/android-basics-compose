package com.example.f1calendar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.f1calendar.data.GrandPrix
import com.example.f1calendar.data.Seasson2024Repository.seasson_2024
import com.example.f1calendar.ui.theme.Dark
import com.example.f1calendar.ui.theme.F1CalendarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            F1CalendarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Red
                ) {
                    CalendarApp()
                }
            }
        }
    }
}

@Composable
fun CalendarApp(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) {
        CalendarList(
            grandPrixes = seasson_2024,
            contentPadding = it,
            modifier = Modifier.background(Dark)
        )
    }

}

@Composable
fun CalendarList(
    grandPrixes: List<GrandPrix>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
){
    LazyColumn(
        contentPadding = contentPadding,
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(grandPrixes) {
            GpCard(
                grandPrix = it,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Red),
        title = {
            Icon(
                painter = painterResource(R.drawable.logo_f1),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.width(100.dp)
            )
        },
        modifier = modifier
    )
}




@Preview(showBackground = true)
@Composable
fun CalendarAppPreview() {
    F1CalendarTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.LightGray
        ) {
            CalendarApp()
        }
    }
}