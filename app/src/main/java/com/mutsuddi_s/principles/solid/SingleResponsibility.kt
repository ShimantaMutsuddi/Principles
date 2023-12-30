package com.mutsuddi_s.principles.solid

class Square {

    fun calculateArea(side:Int): Int{
        return side*side
    }

    fun calculatePerimer(side: Int):Int{
        return 4*side
    }


}

class SquareUi{
    fun renderSquare(){
        println( " Render Square")
    }
    fun renderLargeSquare(){
        println( " Render Large Square")
    }

}