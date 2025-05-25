package pl.michal_cyran.tutor_website.sections.offer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.tutor_website.HEADLINE_SIZE
import pl.michal_cyran.tutor_website.SUBHEADLINE_SIZE
import tutorwebsite.composeapp.generated.resources.Res
import tutorwebsite.composeapp.generated.resources.calculate
import tutorwebsite.composeapp.generated.resources.desktop
import tutorwebsite.composeapp.generated.resources.schedule
import tutorwebsite.composeapp.generated.resources.school

@Composable
fun OfferSection(
    modifier: Modifier = Modifier
)  {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(horizontal = 100.dp, vertical = 64.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Moja oferta",
            fontSize = HEADLINE_SIZE,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        Text(
            text = "Oferuję korepetycje z matematyki dostosowane do Twoich potrzeb i poziomu zaawansowania.",
            fontSize = SUBHEADLINE_SIZE,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            OfferCard(
                title = "Szkoła podstawowa",
                description = "Pomoc w zrozumieniu podstawowych pojęć matematycznych i przygotowanie do egzaminu ósmoklasisty.",
                icon = painterResource(Res.drawable.calculate),
                modifier = Modifier.weight(1f)
            )
            
            OfferCard(
                title = "Szkoła średnia",
                description = "Pomoc w bieżących lekcjach i/lub przygotowanie do matury. Zarówno poziom podstawowy jak i rozszerzony.",
                icon = painterResource(Res.drawable.school),
                modifier = Modifier.weight(1f)
            )
            
            OfferCard(
                title = "Informatyka",
                description = "Pomoc w przygotowaniu do egzaminu lub bieżących lekcji z poziomu kwalifikacji E.13 i E.14 (lub EE.08 i EE.09).",
                icon = painterResource(Res.drawable.desktop),
                modifier = Modifier.weight(1f)
            )
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Text(
            text = "Cennik",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp),
            color = MaterialTheme.colorScheme.primary,
        )
        
        Row(
            modifier = Modifier.fillMaxWidth(0.8f),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            PriceCard(duration = "30 minut", price = "35 zł")
            PriceCard(duration = "60 minut", price = "70 zł")
            PriceCard(duration = "90 minut", price = "105 zł")
            PriceCard(duration = "120 minut", price = "140 zł")
        }

        Spacer(modifier = Modifier.height(24.dp))

    }
}


