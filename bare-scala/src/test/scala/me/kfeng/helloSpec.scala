package me.kfeng.hello


import org.scalatest.{WordSpec, Matchers}

class HelloSpec extends WordSpec with Matchers {
  "Hello" should {
    "return properly" in {
      val w = Hello.sayHello()
      w should equal ("Hello")
    }
  }
}
