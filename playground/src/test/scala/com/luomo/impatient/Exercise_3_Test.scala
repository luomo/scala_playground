package com.luomo.impatient

import com.luomo.util.UnitSpec

/**
 * User: joao.cunha
 */
class Exercise_3_Test extends UnitSpec {

  "An Ex" should "populate random ints from 0 to n" in {
    val res = new Exercise_3().random(3)
    assert(res.size == 3)
  }

  it should "swap adjacent elements of an array of Integer" in {
    new Exercise_3().swap(Array(1, 3, 4, 5, 6)) should equal(Array(3, 1, 5, 4, 6))
    new Exercise_3().swap(Array(1)) should equal(Array(1))
    new Exercise_3().swap(Array()) should equal(Array())
  }

  it should "swap adjacent elements of an array of Integer with for/yield expression" in {
    new Exercise_3().swapYield(Array(1, 3, 4, 5, 6)) should equal(Array(3, 1, 5, 4, 6))
    new Exercise_3().swapYield(Array(1)) should equal(Array(1))
    new Exercise_3().swapYield(Array()) should equal(Array())
  }

  it should "partition an array of int by positive values, 0, and negative in the right order in" in {
    new Exercise_3().partition(Array(1, -3, 4, -5, 6)) should equal(Array(1, 4, 6, -3, -5))
    new Exercise_3().partition(Array(1, -3, 0, -5, 6)) should equal(Array(1, 6, -3, 0, -5))
  }

  it should "calc the average of an array of doubles" in {
    new Exercise_3().avg(Array(1, 4)) should equal(2.5)
    new Exercise_3().avg(Array(2, 4)) should equal(3)
    new Exercise_3().avg(Array(1)) should equal(1)
  }

  it should " first sort and then reverse an array" in {
    new Exercise_3().reverse(Array(1, 4)) should equal(Array(4, 1))
    new Exercise_3().reverse(Array(1, 4, 2, 4, 5)) should equal(Array(5, 4, 4, 2, 1))
  }

  it should " remove all duplicates from an array" in {
    new Exercise_3().filterDuplicates(Array(1, 4)) should equal(Array(1, 4))
    new Exercise_3().filterDuplicates(Array(1, 4, 2, 4, 5)) should equal(Array(1, 4, 2, 5))
    new Exercise_3().filterDuplicatesMyVersion(Array(1, 4)) should equal(Array(1, 4))
    new Exercise_3().filterDuplicatesMyVersion(Array(1, 4, 2, 4, 5)) should equal(Array(1, 4, 2, 5))
  }

}
