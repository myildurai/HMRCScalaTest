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
    BigDecimal(amt).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  /*
  * This to iterate the purchase list
  * */
  def addItem(item:List[Item]):Unit={
    itemList=itemList++item
  }

  /*
  * To calculate the bill value after the offer is considered
  * */
  def calcBillwithOffer():Double={
    val amt = calcBill()
    var appleCount:Int=0
    var orangeCount:Int=0
    var discount:Double=0.0
    for(item<-itemList){
      item match{
        case item: Apple=> appleCount+=1
        case item: Orange=> orangeCount+=1
        case others=> 0
      }
      discount=(appleCount/2)*Apple.price+(orangeCount/3)*Orange.price
    }
    BigDecimal(amt-discount).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }
}
