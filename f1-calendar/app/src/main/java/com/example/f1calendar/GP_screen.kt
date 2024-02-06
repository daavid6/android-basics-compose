package com.example.f1calendar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.f1calendar.data.GrandPrix
import com.example.f1calendar.data.Seasson2024Repository.seasson_2024
import com.example.f1calendar.ui.theme.F1CalendarTheme


@Composable
fun GpCard (grandPrix: GrandPrix, modifier: Modifier = Modifier){
    Card (
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(2.dp, Color.Black),
        modifier = modifier
    ) {
        Column (Modifier.padding(16.dp)) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Column {
                    Text(
                        text = grandPrix.days,
                        style = MaterialTheme.typography.displayLarge,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Surface (
                        color = Color.Black,
                        modifier = Modifier
                            .clip(RoundedCornerShape(20f))
                    ) {
                        Text(
                            text = grandPrix.month,
                            style = MaterialTheme.typography.displayMedium,
                            color = Color.White,
                            modifier = Modifier.padding(4.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                Card (
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .size(height = 30.dp, width = 50.dp)
                ){
                    Image(
                        painter = painterResource(grandPrix.countryImageRes),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                }
            }

            Divider(
                color = Color.Black,
                thickness = 0.5.dp,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            Row (
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(grandPrix.countryNameRes),
                    style = MaterialTheme.typography.titleLarge
                )

                Icon(
                    painter = painterResource(R.drawable.arrow_right),
                    contentDescription = null,
                    tint = Color.Red
                )
            }

            Text(
                text = stringResource(grandPrix.gpNameRes),
                style = MaterialTheme.typography.bodyLarge
            )


            Divider(
                color = Color.Black,
                thickness = 0.5.dp,
                modifier = Modifier.padding(vertical = 16.dp)
            )



            CircuitCard(
                imageRes = grandPrix.trackImageRes,
                modifier = Modifier,
                backgroudRes = R.drawable.grid
            )
        }

    }
}


@Composable
fun CircuitCard(
    modifier: Modifier = Modifier,
    backgroudRes: Int,
    imageRes: Int
) {
    Card (
        colors = CardDefaults.cardColors(containerColor = Color.White),
        modifier = modifier
    ) {
        Box (modifier = Modifier.height(163.dp)) {

            Image(
                painter = painterResource(backgroudRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(400.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Spacer(modifier = Modifier.weight(1f))

                Box(
                    modifier = Modifier
                        .weight(2f)
                ) {
                    Image(
                        painter = painterResource(imageRes),
                        contentDescription = null,
                        modifier = Modifier.height(150.dp)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CircuitCard1Preview() {
    F1CalendarTheme {
        CircuitCard(
            backgroudRes = R.drawable.grid,
            imageRes = R.drawable._11_circuit_image
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GpCardPreview() {
    F1CalendarTheme {
        GpCard(seasson_2024[21])
    }
}