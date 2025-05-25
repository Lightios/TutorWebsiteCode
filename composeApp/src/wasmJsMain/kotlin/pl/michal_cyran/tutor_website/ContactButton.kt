package pl.michal_cyran.tutor_website

import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.RectangleShape

@JsFun("address => window.open(address)")
external fun openMailto(address: String)


actual fun sendEmail() {
    openMailto(PRIVATE_EMAIL)
}