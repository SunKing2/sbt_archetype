package com.example.test
 
import org.scalatest.Suite
  
class TestTemplate extends Suite {
     
  def testAddition() {
    var resultSum = 2 + 1
    assert(3 === resultSum)
  }
  def testEmpty() {
    var myCollection = List()
    assert(myCollection.isEmpty)
  }
  def testException() {
    intercept[java.lang.ArrayIndexOutOfBoundsException] {
      // TODO call a method in the src tree instead!
      methodUnderTestGet(3);
    }
  }
  // This method doesn't belong in a test suite
  // It is here for illustration purposes.
  // TODO remove me!
  def methodUnderTestGet(element : Int) = {
    val myArray = Array(1,2,3);
    myArray(element)
  }
}

