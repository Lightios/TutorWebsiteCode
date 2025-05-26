package pl.michal_cyran.tutor_website.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NavigationDrawer(
    onDismiss: () -> Unit,
    onNavigate: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.5f))
            .clickable { onDismiss() },
        contentAlignment = Alignment.CenterStart
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(250.dp)
                .background(MaterialTheme.colorScheme.surface)
                .clickable(enabled = false) { }
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "MatemaProf",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            HorizontalDivider()
            
            NavigationItem("Strona główna") { onNavigate("home") }
            NavigationItem("O mnie") { onNavigate("about") }
            NavigationItem("Oferta") { onNavigate("offer") }
            NavigationItem("Opinie") { onNavigate("testimonials") }
            NavigationItem("Galeria") { onNavigate("gallery") }
            NavigationItem("Kontakt") { onNavigate("contact") }
            
            Spacer(modifier = Modifier.weight(1f))

            HorizontalDivider()
            
            Button(
                onClick = { /* Handle booking */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Text("Umów lekcję")
            }
        }
    }
}

@Composable
private fun NavigationItem(text: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 12.dp)
    ) {
        Text(
            text = text,
            fontSize = 16.sp
        )
    }
}
