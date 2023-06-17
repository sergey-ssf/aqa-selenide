plugins {
    id("java")
}

java {
    this.sourceCompatibility = JavaVersion.VERSION_11
    this.targetCompatibility = JavaVersion.VERSION_17
}

// кодировка файлов (если используете русский язык в файлах)
tasks.withType<JavaCompile> {
    "UTF-8".also { options.encoding = it }
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.codeborne:selenide:6.15.0")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.3.3")

}

tasks.test {
    useJUnitPlatform()
}

