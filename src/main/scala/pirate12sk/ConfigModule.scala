package pirate12sk

import com.google.inject.name.Names
import com.google.inject.{Binder, Module}
import com.typesafe.config.{Config, ConfigFactory}

class ConfigModule extends Module {
  override def configure(binder: Binder): Unit = {
    val togglesConfig = ConfigFactory.load("toggles")

    binder
      .bind(classOf[Config])
      .annotatedWith(Names.named("toggles"))
      .toInstance(togglesConfig)
  }
}
