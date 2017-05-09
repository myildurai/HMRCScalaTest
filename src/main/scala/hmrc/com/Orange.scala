package hmrc.com

/**
  * Created by Myilvahanan on 09/05/2017.
  */
object Orange{
  val price:Double = 0.25
  def apply() = {
    new Orange(price)
  }
}
class Orange(price:Double) extends Item(name="Orange",price=price)
