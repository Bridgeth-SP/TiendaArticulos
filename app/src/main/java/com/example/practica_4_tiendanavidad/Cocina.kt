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
fun Cocina() {
    LazyColumn {
        item {
                Text(
                    text = "Cocina",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    modifier = Modifier
                        .padding(bottom = 10.dp, top = 7.dp, start = 150.dp)
                )

            Column {
                // Imagen en la parte inferior
                Image(
                    painter = painterResource(id = R.drawable.cocina2),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                )

                Spacer(modifier = Modifier.height(1.dp))
            }
        }
        // Producto 1
        item {
            CocinaItem(
                imageRes = R.drawable.organizador,
                nombre = "Organizador",
                descripcion = "Organizador regulable para cajón, gris",
                precio = "12.99 €"
            )
        }
        // Producto 2
        item {
            CocinaItem(
                imageRes = R.drawable.forgon,
                nombre = "Forgón Portatil",
                descripcion = "Placa inducción portátil, 2 zonas blanco",
                precio = "99.00 €"
            )
        }
        // Producto 3
        item {
            CocinaItem(
                imageRes = R.drawable.horno,
                nombre = "Horno-Microondas",
                descripcion = "Microondas combi+horno aire forzado",
                precio = "69.99 €"
            )
        }
        // Producto 4
        item {
            CocinaItem(
                imageRes = R.drawable.botellero,
                nombre = "Botellero",
                descripcion = "Botellero, grisl",
                precio = "108.99 €"
            )
        }
        // Producto 5
        item {
            CocinaItem(
                imageRes = R.drawable.grifo,
                nombre = "Grifo",
                descripcion = "Grifo de cocina con rociador, col acinox",
                precio = "239.99 €"
            )
        }
    }
}

// Función para representar un elemento individual de cocina
@Composable
fun CocinaItem(
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
