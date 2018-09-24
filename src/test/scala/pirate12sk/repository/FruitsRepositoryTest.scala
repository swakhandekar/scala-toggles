package pirate12sk.repository

import org.mockito.Mockito.{mock, when}
import org.scalatest.{BeforeAndAfter, Matchers, WordSpec}
import pirate12sk.Toggles

class FruitsRepositoryTest extends WordSpec with Matchers with BeforeAndAfter {
  "get" when {
    "sorted-responses toggle is enabled" should {
      "return sorted list of fruits" when {
        "fruits are available in the shop" in {
          val fruitsRepository = repositoryWithToggleEnabled()
          val expectedList: List[String] = List("Apple", "Grapes", "Mango", "Orange")

          val fruitsList = fruitsRepository.get

          fruitsList should contain theSameElementsInOrderAs expectedList
        }
      }
    }

    "sorted-responses toggle is disabled" should {
      "return list of fruits" when {
        "fruits are available in the shop" in {
          val fruitsRepository = repositoryWithToggleDisabled()
          val expectedList: List[String] = List("Mango", "Apple", "Orange", "Grapes")

          val fruitsList = fruitsRepository.get

          fruitsList should contain theSameElementsAs expectedList
        }
      }
    }
  }

  private def repositoryWithToggleEnabled() = {
    val toggles = mock(classOf[Toggles])
    when(toggles.sortedResponsesEnabled).thenReturn(true)
    new FruitsRepository(toggles)
  }

  private def repositoryWithToggleDisabled() = {
    val toggles = mock(classOf[Toggles])
    when(toggles.sortedResponsesEnabled).thenReturn(false)
    new FruitsRepository(toggles)
  }
}
