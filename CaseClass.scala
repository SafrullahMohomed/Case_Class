//19000995

import scala.math._

object CaseClass extends App{
    val p1 = Point(1,2)
    val p2 = Point(3,5)
    val p3 = p1.move(4,6)
    val p4 = p1.invert()


    println("p1 is " + p1)
    println("p2 is " + p2)
    
    println("Addition of p1 and p2 are " + (p1 + p2))
    println("p1 is moved by (4,6), final value is " + p3)
    println("Distance between p1 and p2 is " + p1.distance(p2))
    println("p1 is inverted " + p4)
    
}

case class Point(x:Int, y:Int)
{
    // Q1 addition
    def +(that:Point) = Point((this.x + that.x), (this.y + that.y))

    // Q2 move
    def move(dx:Int, dy:Int) = Point((this.x + dx), (this.y + dy))

    //Q3 distance between two points
    def distance(that:Point):Double = {
        math.sqrt(math.pow(math.abs(this.x - that.x), 2) + math.pow(math.abs(this.y - that.y), 2))    
    }

    //Q4 invertion
    def invert() = Point(this.y, this.x)
}
