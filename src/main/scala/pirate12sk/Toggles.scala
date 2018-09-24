package pirate12sk

import com.google.inject.name.Named
import com.typesafe.config.Config
import javax.inject.Inject

class Toggles @Inject()(@Named("toggles") config: Config) {
  private lazy val `enable-sorted-responses` =
    config.getBoolean("fruits-shop.toggles.enable-sorted-responses")

  def sortedResponsesEnabled: Boolean = `enable-sorted-responses`
}
