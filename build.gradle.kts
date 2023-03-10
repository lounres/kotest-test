@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    with(libs.plugins) {
        alias(kotlin.multiplatform)
        alias(kotest.multiplatform)
    }
}

repositories {
    mavenCentral()
}

val jvmTargetVersion : String by properties

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = jvmTargetVersion
                freeCompilerArgs += listOf(
//                                "-Xlambdas=indy"
                )
            }
        }
        testRuns.all {
            executionTask {
                useJUnitPlatform()
            }
        }
    }

    @Suppress("UNUSED_VARIABLE")
    sourceSets {
        val commonTest by getting {
            dependencies {
                with(rootProject.libs.kotest) {
                    implementation(framework.engine)
                    implementation(framework.datatest)
                    implementation(assertions.core)
                    implementation(property)
                }
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(rootProject.libs.kotest.runner.junit5)
            }
        }
    }
}