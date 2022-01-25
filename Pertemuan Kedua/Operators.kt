import java.time.Year

fun main()
{
    /* jenis operator :
    1. aritmathic operators(+ , - , * , / , % , ++ , --)
    2. assigment operators(+= , -= , *= , /= , %= , =)
    3. comparison operators(== , != , < , > , <= , >=)
    4. logical operators(&& , || , !)
     */

//  1. aritmathic operators

    var x = 10
    var y = 5
    var z = 50
    var w = 50
    var v = 50
    var u = 50

    var a = x + y
    var b = x - y
    var c = x * y
    var d = x / y
    var e = x % y
    var f = ++x
    var g = --y

    println("Hasilnya dari X + Y " + a)
    println("Hasilnya dari X - Y " + b)
    println("Hasilnya dari X * Y " + c)
    println("Hasilnya dari X / Y " + d)
    println("Hasilnya dari X % Y " + e)
    println("Hasilnya dari ++ " + f)
    println("Hasilnya dari -- " + g)
    println("----------------------------------")

//  2. assigment operators

    x -= 5
    y += 5
    z *= 2
    w /= 2
    v %= 2
//    var u : int 2

    println("Hasilnya dari -= " + x)
    println("Hasilnya dari += " + y)
    println("Hasilnya dari *= " + z)
    println("Hasilnya dari /= " + w)
    println("Hasilnya dari %= " + v)
//    println("Hasilnya dari = " + u)
    println("----------------------------------")

//  3. comparison operators

    var aa = x == y
    var ab = x != y
    var ac = x < y
    var ad = x > y
    var ae = x <= y
    var af = x >= y

    println("Hasilnya dari == " + aa)
    println("Hasilnya dari != " + ab)
    println("Hasilnya dari < " + ac)
    println("Hasilnya dari > " + ad)
    println("Hasilnya dari <= " + ae)
    println("Hasilnya dari >= " + af)
    println("----------------------------------")


//  4. logical operators

    var ba = (x > 5) && (y < 5)
    var bb = (x > 5) || (y < 5)
    var bc = !(x > 5)

    println("Hasilnya dari && " + ba)
    println("Hasilnya dari || " + bb)
    println("Hasilnya dari ! " + bc)









}