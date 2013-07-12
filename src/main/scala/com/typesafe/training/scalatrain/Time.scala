package com.typesafe.training.scalatrain

/**
 * Created with IntelliJ IDEA.
 * User: tonywhite
 * Date: 12/07/2013
 * com.typesafe.training.scalatrain.Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
class Time(val hours: Int = 0, val minutes: Int = 0) {
  //TODO: Verify that hours is within 0 and 23
  require(hours >= 0 && hours < 24)
  //TODO: Verify that minutes is within 0 and 59

  println("asMinutes - " + asMinutes)

  val asMinutes: Int = hours * 60 + minutes

  def minus(that: Time): Int = asMinutes - that.asMinutes

  def -(that: Time): Int = minus(that)

  def fromMinutes(): Time = Time.fromMinutes(minutes)
}

object Time {

  private def fromMinutes(minutes: Int): Time = {
    new Time(minutes / 60, minutes % 60)
  }

}
