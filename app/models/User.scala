package models

import java.sql.Date

case class User(id: Option[Int], name: String, email: String, password: String, phoneNumber: String, role: String )

import play.api.libs.json._

object User {
  implicit val userFormat: OFormat[User] = Json.format[User]
}

