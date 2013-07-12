package com.typesafe.training.scalatrain

import org.scalatest._

/**
 * Created with IntelliJ IDEA.
 * User: tonywhite
 * Date: 12/07/2013
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */
class TimeSpec extends WordSpec with Matchers {

  "Creating a time" should {

    "with defaults return the given values" in {
      val expectedTime = Time(0,0)
      Time().asMinutes shouldEqual expectedTime.asMinutes
    }
    "asMinutes return the given values" in {
      val minusVal = Time(1,40).minus(Time(1))
      val minusVal2 = Time(1,40).minus(Time(1))
      minusVal shouldEqual minusVal2
    }
    "calling - and minus return the same value" in {
      Time(1,40).asMinutes shouldEqual 100
    }
    "throw an exception for a invalid hour argument" in {
      evaluating(Time(24,45)) should produce[IllegalArgumentException]
    }
    "throw an exception for a invalid minute argument" in {
      evaluating(Time(22,61)) should produce[IllegalArgumentException]
    }
  }
}
