package pl.michal_cyran.tutor_website.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object AppTypography2 {
    // Headings
    val heading1 = TextStyle(
        fontSize = 48.sp,        // text-4xl (4rem = 64px) -> scaled for mobile
        fontWeight = FontWeight.Bold,
        lineHeight = 52.sp       // leading-tight
    )

    val heading1Large = TextStyle(
        fontSize = 56.sp,        // text-5xl (5rem = 80px) -> scaled for mobile
        fontWeight = FontWeight.Bold,
        lineHeight = 60.sp
    )

    val heading1XLarge = TextStyle(
        fontSize = 64.sp,        // text-6xl (6rem = 96px) -> scaled for mobile
        fontWeight = FontWeight.Bold,
        lineHeight = 68.sp
    )

    val heading2 = TextStyle(
        fontSize = 32.sp,        // text-3xl (3rem = 48px) -> scaled
        fontWeight = FontWeight.Bold,
        lineHeight = 36.sp
    )

    val heading2Large = TextStyle(
        fontSize = 40.sp,        // text-4xl for lg screens -> scaled
        fontWeight = FontWeight.Bold,
        lineHeight = 44.sp
    )

    val heading3 = TextStyle(
        fontSize = 24.sp,        // text-2xl (2rem = 32px) -> scaled
        fontWeight = FontWeight.Bold,
        lineHeight = 28.sp
    )

    val heading4 = TextStyle(
        fontSize = 20.sp,        // text-xl (1.5rem = 24px) -> scaled
        fontWeight = FontWeight.Bold,
        lineHeight = 24.sp
    )

    val heading5 = TextStyle(
        fontSize = 18.sp,        // text-lg (1.125rem = 18px)
        fontWeight = FontWeight.SemiBold,
        lineHeight = 22.sp
    )

    // Body text
    val bodyLarge = TextStyle(
        fontSize = 18.sp,        // text-lg (1.125rem = 18px)
        fontWeight = FontWeight.Normal,
        lineHeight = 28.sp       // leading-relaxed
    )

    val bodyLargeXL = TextStyle(
        fontSize = 20.sp,        // text-xl on lg screens
        fontWeight = FontWeight.Normal,
        lineHeight = 30.sp
    )

    val bodyMedium = TextStyle(
        fontSize = 16.sp,        // text-base (1rem = 16px)
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp       // leading-relaxed
    )

    val bodySmall = TextStyle(
        fontSize = 14.sp,        // text-sm (0.875rem = 14px)
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp
    )

    // Navigation
    val navigationLink = TextStyle(
        fontSize = 16.sp,        // Default navigation size
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp
    )

    // Buttons
    val buttonLarge = TextStyle(
        fontSize = 18.sp,        // text-lg for large buttons
        fontWeight = FontWeight.SemiBold,
        lineHeight = 22.sp
    )

    val buttonMedium = TextStyle(
        fontSize = 16.sp,        // Default button size
        fontWeight = FontWeight.SemiBold,
        lineHeight = 20.sp
    )

    // Stats/Numbers
    val statsNumber = TextStyle(
        fontSize = 30.sp,        // text-3xl for stats
        fontWeight = FontWeight.Bold,
        lineHeight = 34.sp
    )

    // Pricing
    val priceNumber = TextStyle(
        fontSize = 24.sp,        // text-2xl for pricing
        fontWeight = FontWeight.Bold,
        lineHeight = 28.sp
    )

    val priceLabel = TextStyle(
        fontSize = 14.sp,        // text-sm for price labels
        fontWeight = FontWeight.Normal,
        lineHeight = 18.sp
    )

    // Testimonials
    val testimonialQuote = TextStyle(
        fontSize = 16.sp,        // Base size for quotes
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp       // leading-relaxed
    )

    val testimonialAuthor = TextStyle(
        fontSize = 14.sp,        // text-sm for author names
        fontWeight = FontWeight.Medium,
        lineHeight = 18.sp
    )
}

// Usage in Compose
@Composable
fun AppTypography() = Typography(
    displayLarge = AppTypography2.heading1XLarge,
    displayMedium = AppTypography2.heading1Large,
    displaySmall = AppTypography2.heading1,
    headlineLarge = AppTypography2.heading2Large,
    headlineMedium = AppTypography2.heading2,
    headlineSmall = AppTypography2.heading3,
    titleLarge = AppTypography2.heading4,
    titleMedium = AppTypography2.heading5,
    bodyLarge = AppTypography2.bodyLarge,
    bodyMedium = AppTypography2.bodyMedium,
    bodySmall = AppTypography2.bodySmall,
    labelLarge = AppTypography2.buttonLarge,
    labelMedium = AppTypography2.buttonMedium,
    labelSmall = AppTypography2.bodySmall
)