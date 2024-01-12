package com.example.practica_4_tiendanavidad

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Ropa() {
    LazyColumn {
        item {
            // Imagen Encabezado
            Image(
                painter = painterResource(id = R.drawable.ferragamo_1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
        }

        //Filas de productos de Ropa
        items(1) { rowIndex ->
            Row {
                CeldaRopa(imageRes = R.drawable.ferragamo_bolso1, nombre = "Bolso", descripcion = "FERRAGAMO", precio = "1.254,99 €")
                CeldaRopa(imageRes = R.drawable.acmedelavie, nombre = "Camiseta", descripcion = "ADLV", precio = "65,99 €")
                CeldaRopa(imageRes = R.drawable.burberry_dress, nombre = "Vestido", descripcion = "BURBERRY", precio = "112,00 €")
            }
            Row {
                CeldaRopa(imageRes = R.drawable.fendi, nombre = "Zapatos", descripcion = "FENDI", precio = "985,99 €")
                CeldaRopa(imageRes = R.drawable.armani, nombre = "Sudadera", descripcion = "ARMANI", precio = "95,99 €")
                CeldaRopa(imageRes = R.drawable.balmain, nombre = "Abrigo", descripcion = "BALMAIN", precio = "254,00 €")
            }
            Row {
                CeldaRopa(imageRes = R.drawable.versace, nombre = "Camisa", descripcion = "VERSACE", precio = "349,99 €")
                CeldaRopa(imageRes = R.drawable.hermes, nombre = "Falda", descripcion = "Hermès", precio = "95,99 €")
                CeldaRopa(imageRes = R.drawable.acnestudios, nombre = "Bufanda", descripcion = "Acne Studios", precio = "106,00 €")
            }
        }
    }
}

@Composable
// Representar uan celda individual de cada producto de la sección Ropa
fun CeldaRopa(imageRes: Int, nombre: String, descripcion: String, precio: String) {
    Column {

        // Imagen del producto Ropa
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier
                .size(130.dp) // Tamaño de la imagen
                .clip(shape = RoundedCornerShape(4.dp)) // esquinas redondeadas
                .padding(start = 40.dp)
        )

        // Nombre del producto Ropa
        Text(
            text = nombre,
            modifier = Modifier.padding(top = 8.dp, start = 40.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

        )

        // Descripción del producto Ropa
        Text(
            text = descripcion,
            modifier = Modifier.padding(top = 4.dp, start = 40.dp),
            textAlign = TextAlign.Center,
            color = Color.DarkGray
        )

        // Precio del producto Ropa
        Text(
            text = precio,
            modifier = Modifier.padding(top = 4.dp, start = 40.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
    }
}
