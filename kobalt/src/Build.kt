import com.beust.kobalt.*
import com.beust.kobalt.api.productFlavor
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val repos = repos()


val p = project {
    name = "kobalt-productFlavor-experiment"
    group = "com.example"
    artifactId = name
    version = "0.1"

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.example.MainKt"
    }

    productFlavor("feature1") {
    }

    productFlavor("feature2") {
    }
}
