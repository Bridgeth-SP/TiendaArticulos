package com.example.practica_4_tiendanavidad
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica_4_tiendanavidad.ui.theme.Practica4_TiendaNavidadTheme

data class Juguete(val nombre: String, val precio: String, val imagen: Int)

val listaJuguetes = listOf(
    Juguete("Barbie", "75,99 €", R.drawable.barbie),
    Juguete("Nerf", "29,99 €", R.drawable.nerf),
    Juguete("Lego", "89,99 €", R.drawable.lego),
    Juguete("Monopoly", "25,99 €", R.drawable.monopoly),
    Juguete("Playmobile", "18,99 €", R.drawable.playmobile),
    Juguete("Nenuco", "46,99 €", R.drawable.nenuco),
)

@Composable
fun Juguetes() {
    LazyColumn {

        item {
            Image(
                painter = painterResource(id = R.drawable.puzzles),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
        }

        items(listaJuguetes) { juguete ->
            JuguetesItem(juguete = juguete)
        }
    }
}

@Composable
fun JuguetesItem(juguete: Juguete) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        //Imagen juguetes
        Image(
            painter = painterResource(id = juguete.imagen),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .clip(MaterialTheme.shapes.small)
        )

        // Descripción y precio
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(text = juguete.nombre, style = MaterialTheme.typography.headlineSmall)
            Text(text = "Precio: ${juguete.precio}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JuguetesPreview() {
    Practica4_TiendaNavidadTheme {
        Juguetes()
    }
}