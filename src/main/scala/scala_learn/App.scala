package scala_learn

/**
 * @author ${user.name}
 */
object App {
  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback()
      Thread sleep (1000)
    }
  }

  def main(args: Array[String]) {
    oncePerSecond(() => println("ololo"))
  }
}