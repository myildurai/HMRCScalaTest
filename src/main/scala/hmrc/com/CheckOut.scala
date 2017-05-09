package hmrc.com

/**
  * Created by Myilvahanan on 09/05/2017.
  */
class CheckOut (var itemList: List[Item]){

  /*
  * Method that calculates the bill value of the checkout
  * */
  def calcBill():Double ={
    val amt = itemList.foldLeft(0.0)((acc,elem)=>acc+elem.price)
    amt
  }

  /*
  * This to iterate the purchase list
  * */
  def addItem(item:List[Item]):Unit={
    itemList=itemList++item
  }
}
