package pl.michal_cyran.tutor_website.sections.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pl.michal_cyran.tutor_website.SUBHEADLINE_SIZE
import pl.michal_cyran.tutor_website.TEXT_SIZE
import pl.michal_cyran.tutor_website.core.BodyText
import pl.michal_cyran.tutor_website.core.SectionHeading
import tutorwebsite.composeapp.generated.resources.Res
import tutorwebsite.composeapp.generated.resources._2
import tutorwebsite.composeapp.generated.resources.j_weisner_eq2dAPn1qio_unsplash
import tutorwebsite.composeapp.generated.resources.nick_hillier_yD5rv8_WzxA_unsplash
import tutorwebsite.composeapp.generated.resources.thomas_t_OPpCbAAKWv8_unsplash

@Composable
fun AboutSection() {
    val uriHandler = LocalUriHandler.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 100.dp, vertical = 64.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(36.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(Res.drawable.thomas_t_OPpCbAAKWv8_unsplash),
                contentDescription = "Zdjęcie korepetytora",
                modifier = Modifier
                    .weight(1f)
                    .height(500.dp)
                    .clip(RectangleShape),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
                ,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                SectionHeading(
                    text = "O mnie",
                )

                BodyText(
                    text = buildAnnotatedString {
                        append("Jestem absolwentem ")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append("Uniwersytetu Jagiellońskiego")
                        }
                        append(". Matematyka i informatyka to moje pasje od wielu lat. Lubię zdobywać wiedzę z tych dziedzin, a także pomagać innym w ich poznawaniu.")
                    }
                )

                BodyText(
                    text = buildAnnotatedString {
                        append("Posiadam ")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append("cztery lata doświadczenia")
                        }
                        append(" w udzielaniu profesjonalnych korepetycji oraz wieloletnie doświadczenie w nauczaniu swoich koleżanek i kolegów z klasy.")
                    }
                )

                BodyText(
                    text = buildAnnotatedString {
                        append("Już w technikum prowadziłem zajęcia z ")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append("programowania dla szkół podstawowych.")
                        }
                    }
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(36.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f).padding(bottom = 24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                BodyText(
                    buildAnnotatedString {
                        append("Z natury jestem bardzo ")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append("empatyczną")
                        }
                        append(" osobą, dzięki czemu łatwo zrozumieć mi sposób myślenia innych; wiem, które zagadnienia mogą sprawić problem.")
                    },
                )

                BodyText(
                    buildAnnotatedString {
                        append("Posiadam także ")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append("ogromną cierpliwość")
                        }
                        append(", więc każdemu jestem w stanie wszystko od początku wyjaśnić, tyle razy, ile trzeba.")
                    },
                )

                BodyText(
                    buildAnnotatedString {
                        append("Moje umiejętności dydaktyczne stale rozwijam, czytając książki na temat ")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append("psychologii i nauczania")
                        }
                        append(" oraz przeglądając strony z propozycjami ciekawych lekcji matematyki. Dzięki psychologii lepiej rozumiem potrzeby i motywacje moich uczniów, co pozwala mi skuteczniej przekazywać wiedzę.")
                    },
                )
            }

            Image(
                painter = painterResource(Res.drawable.j_weisner_eq2dAPn1qio_unsplash),
                contentDescription = "Zdjęcie korepetytora",
                modifier = Modifier
                    .weight(1f)
                    .height(500.dp)
                    .clip(RectangleShape),
                contentScale = ContentScale.Crop
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(36.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(Res.drawable._2),
                contentDescription = "Zdjęcie korepetytora",
                modifier = Modifier
                    .weight(1f)
                    .height(500.dp)
                    .clip(RectangleShape),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
                ,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                BodyText(
                    buildAnnotatedString {
                        append("Jeśli chcesz zobaczyć moje projekty i umiejętności")
                        withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                            append(" informatyczne")
                        }
                        append(", to zapraszam do mojej strony internetowej.")
                    },
                    modifier = Modifier.padding(bottom = 24.dp),
                )
                OutlinedButton(
                    onClick = {
                        uriHandler.openUri("https://lightios.github.io/")
                    },
                    shape = RectangleShape
                ) {
                    Text(
                        text = "Otwórz stronę",
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }
    }
}

