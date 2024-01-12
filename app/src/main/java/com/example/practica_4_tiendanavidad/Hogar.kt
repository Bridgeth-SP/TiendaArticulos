package com.example.practica_4_tiendanavidad

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Hogar() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        //Encabezado "HOME"
        item {
            Text(
                text = "HOME",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        //Item Electrónica
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth() // Ocupa el ancho máximo dicponible
                    .padding(vertical = 8.dp) // Espaciado vertical
                    .border(    // Bordes
                        width = 2.dp, // Grosor del borde
                        color = Color(0xFFFF3E3E), // Color del borde
                        shape = RoundedCornerShape(8.dp) // Forma del borde (redondeada)
                    )
            ) {
                //Título "Electrónica"
                Text(
                    text = "Electrónica",
                    fontSize = 24.sp, // Tamaño de la fuente
                    fontWeight = FontWeight.Bold, // Grosor de la fuente (negrita)
                    color = Color(0xFF2E2D2D),  // Color del texto
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp) // Alineación y espacio
                )
                //Imagen Electrónica
                Image(
                    painter = painterResource(id = R.drawable.electronica),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth() // Ancho máximo disponible
                        .height(210.dp) // Altura fija de la imagen
                        .scale(1f, 1f) // Escala de la imagen
                )
            }
        }

        //Item Ropa
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFFE68A57),
                        shape = RoundedCornerShape(8.dp)
                    )
            ) {
                //Título "Ropa"
                Text(
                    text = "Ropa",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E2D2D),
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )
                //Imagen Ropa
                Image(
                    painter = painterResource(id = R.drawable.ropa),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .scale(1f, 1f)
                )
            }
        }

        //Item Decoración
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFFF1DF7F),
                        shape = RoundedCornerShape(8.dp)
                    )
            ) {
                //Título "Decoración"
                Text(
                    text = "Decoración",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E2D2D),
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )
                //Imagen Decoración
                Image(
                    painter = painterResource(id = R.drawable.decoracion),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .scale(1f, 1f)
                )
            }
        }

        //Item Cocina
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFF79BD54),
                        shape = RoundedCornerShape(8.dp)
                    )
            ) {
                //Título "Cocina"
                Text(
                    text = "Cocina",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E2D2D),
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )
                //Imagen Cocina
                Image(
                    painter = painterResource(id = R.drawable.cocina),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .scale(1f, 1f)
                )
            }
        }

        //Item Juguetes
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .border(
                        width = 2.dp,
                        color = Color(0xFF4C93CA),
                        shape = RoundedCornerShape(8.dp)
                    )
            ) {
                //Título "Jueguetes"
                Text(
                    text = "Juguetes",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E2D2D),
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )
                //Imagen Juguetes
                Image(
                    painter = painterResource(id = R.drawable.juguetes),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .scale(1f, 1f)
                )
            }
        }
    }
}

