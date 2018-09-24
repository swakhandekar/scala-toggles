package pirate12sk.repository

import javax.inject.Inject
import pirate12sk.Toggles

class FruitsRepository @Inject()(toggles: Toggles) {
  private val availableFruits = List("Mango", "Apple", "Orange", "Grapes")

  def get: List[String] = {
    if (toggles.sortedResponsesEnabled)
      availableFruits.sorted
    else
      availableFruits
  }
}
