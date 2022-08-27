package org.example
package model

final case class Person(name: String, age: Int)

object Person {
  val peter = Person("Peter", 88)
}
