package hmrc.com

/**
  * Created by Myilvahanan on 09/05/2017.
  */
object Apple{
  val price:Double = 0.6
  def apply() = {
    new Apple(price)
  }
}
class Apple(price:Double) extends Item(name="Apple",price=price)