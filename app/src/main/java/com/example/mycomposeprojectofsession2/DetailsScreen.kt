package com.example.mycomposeprojectofsession2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun DetailsScreen(){
 
    var scrollstate = rememberScrollState()
    var textValue by remember { mutableStateOf("") }
    var isClicked :Boolean by remember { mutableStateOf(false) }
    var showPassword :Boolean by remember { mutableStateOf(false) }
    var pass by remember { mutableStateOf("") }
  Column(modifier = Modifier
      .fillMaxSize()
      .background(Color.LightGray)
      .verticalScroll(scrollstate),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally

  ) {
      Image(painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24), contentDescription = ""
      , modifier = Modifier.size(250.dp))
      Spacer(modifier = Modifier.height(12.dp))
      OutlinedTextField(value = textValue, onValueChange = {
              newValue->textValue=newValue
          if(textValue.isEmpty()) isClicked=false
                                                   },
          label = {
              Text(text = "UserName")
          }
      , leadingIcon = {
          Icon(painter = painterResource(id = R.drawable.baseline_textsms_24), contentDescription ="" ,Modifier.padding(3.dp))
          }
      )
      Spacer(modifier = Modifier.height(12.dp))
      OutlinedTextField(value = pass, onValueChange = {
              newValue->pass=newValue
          if(textValue.isEmpty()) isClicked=false
      },
          label = {
              Text(text = "Password")
          },
          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
          visualTransformation =if(showPassword) VisualTransformation .None else PasswordVisualTransformation()
          , trailingIcon = {
             IconButton(onClick = {
                 showPassword=showPassword.not()
             }) {
               Icon(imageVector = Icons.Filled.Lock, contentDescription ="" )
             }
          }
      )
      Spacer(modifier = Modifier.height(12.dp))
      Button(
          enabled = textValue.isNotEmpty(),
          colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
          onClick = {
              isClicked=true
          }
      ) {
          Image(painter = painterResource(id = android.R.drawable.ic_input_add), contentDescription = "")
          Text(text = "OK")

      }
      if(isClicked){
      Text(text = "Hello $textValue",
          Modifier.alpha(.5f))
  }}
}