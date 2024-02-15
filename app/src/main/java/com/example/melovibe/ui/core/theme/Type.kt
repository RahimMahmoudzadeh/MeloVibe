package com.example.melovibe.ui.core.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.melovibe.R

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        lineHeight = 15.sp,
        letterSpacing = 0.5.sp
    )

)

val robotoSlab = FontFamily(
    Font(R.font.roboto_slab_extrabold, FontWeight.ExtraBold),
    Font(R.font.roboto_slab_black, FontWeight.Black),
    Font(R.font.roboto_slab_bold, FontWeight.Bold),
    Font(R.font.roboto_slab_semibold, FontWeight.SemiBold),
    Font(R.font.roboto_slab_medium, FontWeight.Medium),
    Font(R.font.roboto_slab_regular, FontWeight.Normal),
    Font(R.font.roboto_slab_light, FontWeight.Light),
)