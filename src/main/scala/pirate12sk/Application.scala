package pirate12sk

import com.google.inject.Guice
import pirate12sk.repository.FruitsRepository

object Application extends App {
  val injector = Guice.createInjector(new ConfigModule())

  val fruitsRepository = injector.getInstance(classOf[FruitsRepository])

  println(fruitsRepository.get.mkString(", "))
}

