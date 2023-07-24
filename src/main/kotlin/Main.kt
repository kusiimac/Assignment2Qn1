import kotlin.math.sqrt
/**
 * Solve the equation x^2+10x+25 = 0
 * x = (-b+-sqrt(b^2-4ac))/2a
 */
fun main() {
    //This program will calculate the roots of the above quadratic equation
    val a = 1
    val b = 10
    val c = 25
    val x: String
    val y = ((b * b) - (4 * a * c)).toDouble()
    val root1 = (-b + sqrt(y)) / (2 * a)
    val root2 = (-b - sqrt(y)) / (2 * a)
    if (y == 0.0) {
        //x = root1 = root2
        x = "x = %.2f and x = %.2f".format(root1, root2)
    }
    else {
        //x = root1 and root2
        x = "x = %.2f and  x = %.2f".format(root1, root2)
    }
        print ("The roots of the equation are: $x")
    }