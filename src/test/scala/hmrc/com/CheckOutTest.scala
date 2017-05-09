package hmrc.com

/**
  * Created by Myilvahanan on 09/05/2017.
  */
import org.scalatest.{ Matchers, GivenWhenThen, FeatureSpec }

class CheckOutTest extends FeatureSpec with GivenWhenThen with Matchers {
  feature("Shopping with out offers") {
    scenario("Empty Shopping Bucket Test") {
      val checkOut = new CheckOut(List())
      checkOut.calcBill() should be(0.0)
    }

    scenario("Non Empty Shopping Bucket Test") {
      val checkOut = new CheckOut(List(Apple(), Orange()))
      checkOut.calcBill() should be(0.85)

    }

    scenario("Adding Items to the list Test") {
      val checkOut = new CheckOut(List(Apple(), Orange()))
      checkOut.addItem(List(Apple(),Apple()))
      checkOut.calcBill() should be(2.05)
    }
  }
  feature("Shopping with offers") {
    scenario("Empty Shopping Bucket Test") {
      //This shoudl resolve to 0
      val checkOut = new CheckOut(List())
      checkOut.calcBill() should be(0.0)
    }

    scenario("Shopping with one offer per item") {
      // This should resolve to (2x0.6)+(2*0.25) = 1.70
      val checkOut = new CheckOut(List(Apple(), Apple(), Apple(), Orange(), Orange(), Orange()))
      checkOut.calcBillwithOffer() should be(1.70)
    }

    scenario("Shopping with multiple offers for apples and Oranges") {
      // This should resolve to (3x0.6)+(5*0.25) = 3.05
      val checkOut = new CheckOut(List(Apple(), Apple(), Apple(), Apple(), Apple(), Orange(), Orange(), Orange(),
        Orange(), Orange(), Orange(), Orange()))
      checkOut.calcBillwithOffer() should be(3.05)
    }

    scenario("Shopping with multiple offers for apple No Oranges") {
      // This should resolve to (3x0.6)+(0*0.25) = 1.80
      val checkOut = new CheckOut(List(Apple(), Apple(), Apple(), Apple(), Apple(), Apple()))
      checkOut.calcBillwithOffer() should be(1.80)
    }

    scenario("Shopping with no apples and multiple offers for Oranges") {
      // This should resolve to (0x0.6)+(5*0.25) = 1.25
      val checkOut = new CheckOut(List(Orange(), Orange(), Orange(), Orange(), Orange(), Orange(), Orange()))
      checkOut.calcBillwithOffer() should be(1.25)
    }
  }
}
