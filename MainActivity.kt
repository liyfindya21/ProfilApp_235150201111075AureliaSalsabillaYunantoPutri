// In C:/Users/Yuvili/AndroidStudioProjects/ProfilApp_235150201111075AureliaSalsabillaYunantoPutri/app/src/main/java/com/example/profilapp_235150201111075aureliasalsabillayunantoputri/MainActivity.kt
package com.example.profilapp_235150201111075aureliasalsabillayunantoputri // <-- CHANGE THIS

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// import com.example.profilapp.R // Make sure this import is also updated or removed if not needed explicitly

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilApp()
        }
    }
}

@Composable
fun ProfilApp() {
    // State tombol follow
    var isFollowed by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFECEFF1))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Foto profil
        Image(
            painter = painterResource(id = R.drawable.profil), // ganti dengan nama file gambar kamu
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Nama
        Text(
            text = "Nama: Mashayu Permatahati ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        // NIM
        Text(text = "NIM: 235150201111076")

        // Deskripsi
        Text(text = "Mahasiswa Teknik Informatika")

        Spacer(modifier = Modifier.height(16.dp))

        
        // Tombol Follow/Unfollow
        Button(onClick = { isFollowed = !isFollowed }) {
            Text(text = if (isFollowed) "Unfollow" else "Follow")
        }
    }
}
    