package com.example.f1calendar.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.f1calendar.R

val F1FontFamily = FontFamily(
    Font(R.font.formula1_regular),
    Font(R.font.formula1_bold, weight = FontWeight.Bold),
    Font(R.font.formula1_wide, weight = FontWeight.ExtraBold)
)


// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        color = Color.Black,
        fontFamily = F1FontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 25.sp
    ),

    displayMedium = TextStyle(
        color = Color.Black,
        fontFamily = F1FontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 17.sp
    ),

    titleLarge = TextStyle(
        color = Color.Black,
        fontFamily = F1FontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),

    bodyLarge = TextStyle(
        color = Color.Black,
        fontFamily = F1FontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    )
)