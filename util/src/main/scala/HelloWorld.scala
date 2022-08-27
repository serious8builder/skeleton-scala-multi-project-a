package org.example

import model.Person

object HelloWorld {
  def sayHi(person: Person) = s"Hi ${person.name}"
}
