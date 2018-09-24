import repository.FruitsRepository

object Application extends App {
  val fruitsRepository = new FruitsRepository()
  println(fruitsRepository.get.mkString(", "))
}
