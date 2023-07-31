package com.example.mycomposeprojectofsession2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
 fun Design(){
 Box(modifier = Modifier.fillMaxSize()){
    Card(modifier = Modifier
     .width(250.dp)
     .height(250.dp).padding(20.dp)
     .background(Color.LightGray)


     ) {
   Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
    Image(painter = painterResource(id = R.drawable.user), contentDescription ="",Modifier.padding( 12.dp))
    Text(text = "Johan Doe",Modifier.padding(12.dp))
    Text(text = "Software Engineer",Modifier.padding(12.dp))
   }
    }
 }}