package repository

import org.scalatest.{BeforeAndAfter, Matchers, WordSpec}

class FruitsRepositoryTest extends WordSpec with Matchers with BeforeAndAfter {
  private val fruitsRepository = new FruitsRepository()

  "get" should {
    "return list of fruits" when {
      "fruits are available in the shop" in {
        val expectedList: List[String] = List("Mango", "Apple", "Orange", "Grapes")

        val fruitsList = fruitsRepository.get

        fruitsList should contain theSameElementsAs expectedList
      }
    }
  }
}
