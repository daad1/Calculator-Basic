import java.lang.Exception

  fun main(args: Array<String>) {

      //First compiler will go to the function name 'add'
      add()

      // After compiler finish function 'add'  will come here to see what we have

      while (true) { // ask user if the want  to add more numbers

          print("Would you like to add more numbers? (Y/N)")
          var guss = readLine()!!.toString()

          // if user says yes
          // will compiler back to function add

          if (guss == "y") {
              add()

          }

          //if says no will break the project.
          if (guss == "n") {
              break
          }
      }

      println("Bye")
  }

 // The compiler will come here and see what function have .
  fun add() {

     //First declare First Number , Second Number
     var numberOne: Int
     var numberTwo: Int

     // Ask to user enter first number
     print("Enter your first number: ")
     //and here will see if user enter be mistake letter will replace the letter to a number Zero
     try {
         numberOne = readLine()!!.toInt()
     } catch (e: Exception) {
         numberOne = 0
     }
     // Ask to user enter second number
     print("Enter your second number: ")

     // like First number replace number zero if user enter letter
     try {
         numberTwo = readLine()!!.toInt()

     } catch (e: Exception) {
         numberTwo = 0
     }
     // Declare constance to sum First number and second
     val addition = numberOne + numberTwo
     println("$numberOne + $numberTwo = $addition ")


 }



