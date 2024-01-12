package com.example.practica_4_tiendanavidad

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Decoracion() {
    LazyColumn {
        item {
            Text(
                text = "DECORACIÓN",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier
                    .padding(bottom = 10.dp, top = 7.dp, start = 120.dp)
            )
            Column {
                Row {
                    // Imagen 1 a la derecha
                    Image(
                        painter = painterResource(id = R.drawable.deco1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(190.dp)
                            .weight(1f)
                    )

                    // Imagen 2 a la izquierda
                    Image(
                        painter = painterResource(id = R.drawable.deco2),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(190.dp)
                            .weight(1f)
                    )
                }

                Spacer(modifier = Modifier.height(3.dp))

                // Imagen 3 en la parte inferior
                Image(
                    painter = painterResource(id = R.drawable.deco3),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(69.dp)
                )
            }
        }


        // Producto 1
        item {
            CocinaItem(
                imageRes = R.drawable.jarron,
                nombre = "LIVSVERK",
                descripcion = "Florero / jarrón, gris azulado claro",
                precio = "8,99 €"
            )
        }
        // Producto 2
        item {
            CocinaItem(
                imageRes = R.drawable.alfombra,
                nombre = "SIDOREMSA",
                descripcion = "Alfombra, marrón claro",
                precio = "24.99 €"
            )
        }
        // Producto 3
        item {
            CocinaItem(
                imageRes = R.drawable.pizarra,
                nombre = "SKÅDIS",
                descripcion = "Tablero perforado, blanco",
                precio = "20.00 €"
            )
        }
        // Producto 4
        item {
            CocinaItem(
                imageRes = R.drawable.espejo,
                nombre = "STOCKHOLM",
                descripcion = "Espejo, chapa nogal",
                precio = "69.99 €"
            )
        }
    }
}

// Función para representar un elemento individual de decoración
@Composable
fun DecoracionItem(
    imageRes: Int,
    nombre: String,
    descripcion: String,
    precio: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Imagen del producto
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(3.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Nombre del producto
        Text(text = nombre, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))

        // Descripción del producto
        Text(text = descripcion, fontSize = 14.sp)
        Spacer(modifier = Modifier.height(8.dp))

        // Precio del producto
        Text(text = "Precio: $precio", fontWeight = FontWeight.Bold, fontSize = 16.sp)
    }
}
