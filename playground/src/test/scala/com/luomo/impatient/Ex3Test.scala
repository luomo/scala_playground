package com.luomo.impatient

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite

/**
  * User: joao.cunha
  */
@RunWith(classOf[JUnitRunner])
class Ex3Test extends FunSuite {

   test("TwoPlusTwo") {
     val twoPlusTwo = 2 + 2
     assert(twoPlusTwo == 4)
   }


 }
