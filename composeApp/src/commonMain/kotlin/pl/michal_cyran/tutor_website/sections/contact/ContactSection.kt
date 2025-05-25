package pl.michal_cyran.tutor_website.sections.contact

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.tutor_website.HEADLINE_SIZE
import pl.michal_cyran.tutor_website.SUBHEADLINE_SIZE
import pl.michal_cyran.tutor_website.core.ContactButton
import tutorwebsite.composeapp.generated.resources.Res
import tutorwebsite.composeapp.generated.resources.date_range

@Composable
fun ContactSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 240.dp, vertical = 64.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Kontakt",
            fontSize = HEADLINE_SIZE,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        Text(
            text = "Skontaktuj się ze mną, aby umówić lekcję lub zadać pytanie.",
            fontSize = SUBHEADLINE_SIZE,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Text(
                            text = "Informacje kontaktowe",
                            fontSize = SUBHEADLINE_SIZE,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Left,
                        )

                        Text(
                            text = "Aby umówić lekcję, skontaktuj się ze mną używając poniższego przycisku.",
                        )

                        ContactButton()

                        ContactItem(
                            painterResource(Res.drawable.date_range),
                            title = "Godziny pracy",
                            value = "Poniedziałek - Sobota: 10:00 - 20:00\n"
                        )
                    }
                }
            }
//            Card(
//                modifier = Modifier.weight(1f),
//                shape = RoundedCornerShape(8.dp)
//            ) {
//                Column(
//                    modifier = Modifier.padding(16.dp)
//                ) {
//                    Text(
//                        text = "Formularz kontaktowy",
//                        fontSize = 18.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier.padding(bottom = 16.dp)
//                    )
//
//                    var name by remember { mutableStateOf("") }
//                    var email by remember { mutableStateOf("") }
//                    var message by remember { mutableStateOf("") }
//
//                    OutlinedTextField(
//                        value = name,
//                        onValueChange = { name = it },
//                        label = { Text("Imię i nazwisko") },
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(bottom = 8.dp)
//                    )
//
//                    OutlinedTextField(
//                        value = email,
//                        onValueChange = { email = it },
//                        label = { Text("Email") },
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(bottom = 8.dp)
//                    )
//
//                    OutlinedTextField(
//                        value = message,
//                        onValueChange = { message = it },
//                        label = { Text("Wiadomość") },
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(120.dp)
//                            .padding(bottom = 16.dp),
//                        maxLines = 5
//                    )
//
//                    Button(
//                        onClick = { /* Handle form submission */ },
//                        modifier = Modifier.fillMaxWidth()
//                    ) {
//                        Text("Wyślij wiadomość")
//                    }
//                }
//            }
        }
    }
}
