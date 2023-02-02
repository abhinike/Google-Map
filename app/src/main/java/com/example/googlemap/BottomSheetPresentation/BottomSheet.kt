package com.example.googlemap.BottomSheetPresentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory.zoomTo
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetDrawer() {

    val googleMap = GoogleMap()




    BottomSheetScaffold(
        sheetBackgroundColor = Color.Transparent,
        sheetPeekHeight = 350.dp,
        sheetContent = {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),

            shape = RoundedCornerShape(20.dp)

        ) {
            Column(modifier = Modifier
                .fillMaxHeight()
                .padding(10.dp)) {
                Row( modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = { /*TODO*/ },
                    modifier = Modifier.padding(10.dp).weight(1f)
                        ) {
                        Text(text = "Electrician")
                    }
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.padding(10.dp).weight(1f)
                    ) {
                        Text(text = "Electrician")
                    }


                }
                Row( modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {


                }
            }

        }

    }) {
        GoogleMap(modifier = Modifier.fillMaxSize(),
            properties = MapProperties(),
            uiSettings = MapUiSettings(zoomControlsEnabled = false)
        )



    }
}