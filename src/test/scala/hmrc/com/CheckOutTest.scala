package hmrc.com

/**
  * Created by Myilvahanan on 09/05/2017.
  */
import org.scalatest.{ Matchers, GivenWhenThen, FeatureSpec }

class ShoppingTest extends FeatureSpec with GivenWhenThen with Matchers {
  feature("Shopping Bucket with out offers") {
    scenario("Constructing a Empty Shopping Bucket") {
      val checkOut = new CheckOut(List())
      checkOut.calcBill() should be(0.0)
    }

    scenario("Constructing a non Empty Shopping Bucket") {
      val checkOut = new CheckOut(List(Apple(), Orange()))
      checkOut.calcBill() should be(0.85)

    }

    scenario("Adding Items to the list after consturctor") {
      val checkOut = new CheckOut(List(Apple(), Orange()))
      checkOut.addItem(List(Apple(),Apple()))
      checkOut.calcBill() should be(2.05)
    }
  }
}
