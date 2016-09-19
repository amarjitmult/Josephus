import org.junit.Assert._
import org.junit.Test

/**
  * Created by amarjits on 9/19/2016.
  */
class Testcases {

  @Test
  def testJ: Unit = {

    assertEquals(147,Josephus.largeN(200,4))
    assertEquals(249,Josephus.largeN(500,10))
    assertEquals(1297,Josephus.largeN(2000,10))

  }

}
