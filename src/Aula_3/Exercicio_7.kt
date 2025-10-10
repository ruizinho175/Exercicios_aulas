package Aula_3

fun main() {
    val password = "123456"
    var password_length = false
    var password_number = false
    var password_contents = false

     if (password.length > 7) {
        password_length = true
     }
    else {
        password_length = false
        println("Password must be at least 8 characters long")
     }

    if (password.any{it.isDigit()}) {
         password_number = true
    }
    else {
        password_number = false
        println("Password must contain at least 1 digit")
    }

    if (password.contains("123456") || password.contains("password")) {
        password_contents = false
       println("Password can't be 123456 or password")
        }
    else {
           password_contents = true
    }

       var passwordAccepted = password_number  && password_contents  && password_length

    if (passwordAccepted) {
        println("Password accepted")
    }
}