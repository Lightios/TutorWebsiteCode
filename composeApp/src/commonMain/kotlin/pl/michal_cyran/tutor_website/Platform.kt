package pl.michal_cyran.tutor_website

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform