// 6. Haga un algoritmo que solicite n cantidad de números hasta que el usuario ingrese el número 5.
// (Ciclo while)


fun main() { 
var numero = 0
while (numero != 5){
print("Ingrese un número: ")
numero = readLine()!!.toInt()
}
println("Ha ingresado el número 5.")
}