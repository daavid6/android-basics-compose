package com.example.f1calendar.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.f1calendar.R

data class GrandPrix(
    @StringRes val countryNameRes: Int,
    @DrawableRes val countryImageRes: Int,
    val days: String,
    val month: String,
    @StringRes val gpNameRes: Int,
    @DrawableRes val trackImageRes: Int

)

val preSeasonTesting_GP =
    GrandPrix(
        countryNameRes = R.string.bahrain,
        countryImageRes = R.drawable.flag_of_bahrain,
        days = "21-23",
        month = "FEB",
        gpNameRes = R.string._00_name,
        trackImageRes = R.drawable._01_circuit_image
    )

val bahrain_GP =
    GrandPrix(
        countryNameRes = R.string.bahrain,
        countryImageRes = R.drawable.flag_of_bahrain,
        days = "29-02",
        month = "FEB-MAR",
        gpNameRes = R.string._01_name,
        trackImageRes = R.drawable._01_circuit_image
    )

val saudiArabia_GP =
    GrandPrix(
        countryNameRes = R.string.saudi_arabia,
        countryImageRes = R.drawable.flag_of_saudi_arabia,
        days = "07-09",
        month = "MAR",
        gpNameRes = R.string._02_name,
        trackImageRes = R.drawable._02_circuit_image
    )

val australia_GP =
    GrandPrix(
        countryNameRes = R.string.australia,
        countryImageRes = R.drawable.flag_of_australia,
        days = "22-24",
        month = "MAR",
        gpNameRes = R.string._03_name,
        trackImageRes = R.drawable._03_circuit_image
    )

val japan_GP =
    GrandPrix(
        countryNameRes = R.string.japan,
        countryImageRes = R.drawable.flag_of_japan,
        days = "05-07",
        month = "APR",
        gpNameRes = R.string._04_name,
        trackImageRes = R.drawable._04_circuit_image
    )

val china_GP =
    GrandPrix(
        countryNameRes = R.string.china,
        countryImageRes = R.drawable.flag_of_china,
        days = "19-21",
        month = "APR",
        gpNameRes = R.string._05_name,
        trackImageRes = R.drawable._05_circuit_image
    )

val unitedStates_GP =
    GrandPrix(
        countryNameRes = R.string.united_states,
        countryImageRes = R.drawable.flag_of_united_states,
        days = "03-05",
        month = "MAY",
        gpNameRes = R.string._06_name,
        trackImageRes = R.drawable._06_circuit_image
    )

val italy_GP =
    GrandPrix(
        countryNameRes = R.string.italy,
        countryImageRes = R.drawable.flag_of_italy,
        days = "17-19",
        month = "MAY",
        gpNameRes = R.string._07_name,
        trackImageRes = R.drawable._07_circuit_image
    )

val monaco_GP =
    GrandPrix(
        countryNameRes = R.string.monaco,
        countryImageRes = R.drawable.flag_of_monaco,
        days = "24-26",
        month = "MAY",
        gpNameRes = R.string._08_name,
        trackImageRes = R.drawable._08_circuit_image
    )

val canada_GP =
    GrandPrix(
        countryNameRes = R.string.canada,
        countryImageRes = R.drawable.flag_of_canada,
        days = "07-09",
        month = "JUN",
        gpNameRes = R.string._09_name,
        trackImageRes = R.drawable._09_circuit_image
    )

val spain_GP =
    GrandPrix(
        countryNameRes = R.string.spain,
        countryImageRes = R.drawable.flag_of_spain,
        days = "21-23",
        month = "JUN",
        gpNameRes = R.string._10_name,
        trackImageRes = R.drawable._10_circuit_image
    )

val austria_GP =
    GrandPrix(
        countryNameRes = R.string.austria,
        countryImageRes = R.drawable.flag_of_austria,
        days = "28-30",
        month = "JUN",
        gpNameRes = R.string._11_name,
        trackImageRes = R.drawable._11_circuit_image
    )

val britain_GP = GrandPrix(
    countryNameRes = R.string.great_britain,
    countryImageRes = R.drawable.flag_of_united_kingdom,
    days = "05-07",
    month = "JUL",
    gpNameRes = R.string._12_name,
    trackImageRes = R.drawable._12_circuit_image
)

val hungary_GP = GrandPrix(
    countryNameRes = R.string.hungary,
    countryImageRes = R.drawable.flag_of_hungary,
    days = "19-21",
    month = "JUL",
    gpNameRes = R.string._13_name,
    trackImageRes = R.drawable._13_circuit_image
)

val belgium_GP = GrandPrix(
    countryNameRes = R.string.belgium,
    countryImageRes = R.drawable.flag_of_belgium,
    days = "26-28",
    month = "JUL",
    gpNameRes = R.string._14_name,
    trackImageRes = R.drawable._14_circuit_image
)

val netherlands_GP = GrandPrix(
    countryNameRes = R.string.netherlands,
    countryImageRes = R.drawable.flag_of_netherlands,
    days = "23-25",
    month = "AUG",
    gpNameRes = R.string._15_name,
    trackImageRes = R.drawable._15_circuit_image
)

val monza_GP = GrandPrix(
    countryNameRes = R.string.italy,
    countryImageRes = R.drawable.flag_of_italy,
    days = "30-01",
    month = "AUG-SEP",
    gpNameRes = R.string._16_name,
    trackImageRes = R.drawable._16_circuit_image
)

val azerbaijan_GP = GrandPrix(
    countryNameRes = R.string.azerbaijan,
    countryImageRes = R.drawable.flag_of_azerbaijan,
    days = "13-15",
    month = "SEP",
    gpNameRes = R.string._17_name,
    trackImageRes = R.drawable._17_circuit_image
)

val singapore_GP = GrandPrix(
    countryNameRes = R.string.singapore,
    countryImageRes = R.drawable.flag_of_singapore,
    days = "20-22",
    month = "SEP",
    gpNameRes = R.string._18_name,
    trackImageRes = R.drawable._18_circuit_image
)

val austin_GP = GrandPrix(
    countryNameRes = R.string.united_states,
    countryImageRes = R.drawable.flag_of_united_states,
    days = "18-20",
    month = "OCT",
    gpNameRes = R.string._19_name,
    trackImageRes = R.drawable._19_circuit_image
)

val mexico_GP = GrandPrix(
    countryNameRes = R.string.mexico,
    countryImageRes = R.drawable.flag_of_mexico,
    days = "25-27",
    month = "OCT",
    gpNameRes = R.string._20_name,
    trackImageRes = R.drawable._20_circuit_image
)

val brazil_GP = GrandPrix(
    countryNameRes = R.string.brazil,
    countryImageRes = R.drawable.flag_of_brazil,
    days = "01-03",
    month = "NOV",
    gpNameRes = R.string._21_name,
    trackImageRes = R.drawable._21_circuit_image
)

val las_vegas_GP = GrandPrix(
    countryNameRes = R.string.united_states,
    countryImageRes = R.drawable.flag_of_united_states,
    days = "21-23",
    month = "NOV",
    gpNameRes = R.string._22_name,
    trackImageRes = R.drawable._22_circuit_image
)

val qatar_GP = GrandPrix(
    countryNameRes = R.string.qatar,
    countryImageRes = R.drawable.flag_of_qatar,
    days = "29-01",
    month = "NOV-DEC",
    gpNameRes = R.string._23_name,
    trackImageRes = R.drawable._23_circuit_image
)

val abu_dhabi_GP = GrandPrix(
    countryNameRes = R.string.united_arab_emirates,
    countryImageRes = R.drawable.flag_of_united_arab_emirates,
    days = "06-08",
    month = "DEC",
    gpNameRes = R.string._24_name,
    trackImageRes = R.drawable._24_circuit_image
)

object Seasson2024Repository {
    val seasson_2024 = listOf(
        preSeasonTesting_GP,
        bahrain_GP,
        saudiArabia_GP,
        australia_GP,
        japan_GP,
        china_GP,
        unitedStates_GP,
        italy_GP,
        monaco_GP,
        canada_GP,
        spain_GP,
        austria_GP,
        britain_GP,
        hungary_GP,
        belgium_GP,
        netherlands_GP,
        monza_GP,
        azerbaijan_GP,
        singapore_GP,
        austin_GP,
        mexico_GP,
        brazil_GP,
        las_vegas_GP,
        qatar_GP,
        abu_dhabi_GP
    )
}

