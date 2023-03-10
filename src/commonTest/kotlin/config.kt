import io.kotest.core.config.AbstractProjectConfig
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds


object KotestProjectConfig : AbstractProjectConfig() {
    override val timeout: Duration = 5.seconds
    override val invocationTimeout: Long = 5000
    override val projectTimeout: Duration = 5.seconds
    override val parallelism: Int = 4
}