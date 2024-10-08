plugins {
    `kotlin-dsl`
}
group = "com.composablecode.modulesStudy.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "modulesStudy.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "modulesStudy.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

    }
}