package com.example.practica_4_tiendanavidad

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Producto(
    val nombre: String,
    val descripcion: String,
    val imagen: Int,
    val precio: String
)
@Preview
@Composable
fun Electronica() {

    Text(
        text = "Electrónica",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = Color.DarkGray,
        modifier = Modifier
            .padding(bottom = 10.dp, top = 7.dp, start = 1.dp)
    )

    val productos = listOf(

        Producto(
            "Teclado inalámbrico Logitech",
            "Teclado mecánico inalámbrico con emojis Logitech POP Keys",
            R.drawable.tecladologitech,
            "130,00 €"
        ),
        Producto(
            "Logitech Lift Ratón Ergonómico",
            "Ratón ergonómico de Logitech para mayor comodidad y productividad.",
            R.drawable.raton_logitech,
            "125,00 €"
        ),
        Producto(
            "Pro Hub Mini",
            "Conectividad versátil y diseño compacto.",
            R.drawable.hub,
            "39,99 €"
        ),
        Producto(
            "Cargrador MegaSafe",
            "Base de carga inalámbrica 3 en 1  PRO de Belkin con MagSafe",
            R.drawable.cargador,
            "169,95 €"
        ),
        Producto(
                "Airpods",
        "Auriculares inalámbricos premium con cancelación de ruido de Apple.",
        R.drawable.airpods,
        "579,00 €"
        )
    )
    LazyColumn {
        items(productos) { producto ->
            ProductoItem(producto = producto)
        }
    }
}

@Composable
fun ProductoItem(producto: Producto) {

    Column(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = producto.imagen),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(shape = MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = producto.nombre,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = producto.descripcion,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = producto.precio,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
