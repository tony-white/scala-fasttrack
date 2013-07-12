package com.typesafe.training.scalatrain

/**
 * Created with IntelliJ IDEA.
 * User: tonywhite
 * Date: 12/07/2013
 * com.typesafe.training.scalatrain.Time: 10:48
 * To change this template use File | Settings | File Templates.
 */
case class Train(number: Int, kind: String) {
  println("kind - " + kind + ", number - " + number)
}