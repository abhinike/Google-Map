package com.example.googlemap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.googlemap.BottomSheetPresentation.BottomSheetDrawer
import com.example.googlemap.ui.theme.GoogleMapTheme
import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory.zoomTo
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.maps.android.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleMapTheme {


                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

//                    BottomSheetDrawer()
                    val source = LatLng(19.403, 72.8312)
                    val destination = LatLng(19.1074, 72.8372)
                    val vasai = LatLng(19.403, 72.8312)
                    val cameraPositionState = rememberCameraPositionState {
                        position = CameraPosition.fromLatLngZoom(vasai, 15f)
                    }
                    GoogleMap(
                        modifier = Modifier.fillMaxSize(),
                        cameraPositionState = cameraPositionState
                    ) {
                        
                        com.google.maps.android.compose.Marker(position = vasai, title = "your location")
//                        Marker(
//                            state = MarkerState(position = singapore),
//                            title = "Singapore",
//                            snippet = "Marker in Singapore"
//                        )



                            Polyline(
                                points = listOf(
                                    source, destination
                                )
                            )

                    }










                }
            }
        }
    }
}

