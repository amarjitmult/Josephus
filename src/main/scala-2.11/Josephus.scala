/**
  * Created by amarjits on 9/19/2016.
  */
object Josephus extends App {
  require(args.size == 2, "Please provide - Number of people in circle and step count")
  val totalPeople = args(0).toInt  //Number of people in circle
  val stepCount = args(1).toInt  // Step COunt
  require(stepCount >=1, "Step count should be more than 1")
  require(totalPeople >= 1, "Numnber of people should be more than 1")
  val lastPerson = largeN(totalPeople,stepCount)
  println(s"Last remining person is .....$lastPerson")

  // To calculate small values
  def smallN(totalPeople:Int, stepCount:Int) :Int = {
    if(totalPeople < 1)
      1
    else
      (smallN(totalPeople-1,stepCount)+stepCount-1)%totalPeople+1}

  //Can calculate large values
  def largeN(totalPeople:Int, k:Int) :Int ={
    var last=1
    for (i <- 1 to totalPeople) {
      last = (last+k-1)%i+1
    }
    last
  }

}
