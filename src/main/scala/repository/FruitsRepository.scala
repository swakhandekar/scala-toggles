package repository

class FruitsRepository() {
  private val availableFruits = List("Mango", "Apple", "Orange", "Grapes")

  def get: List[String] = availableFruits
}
