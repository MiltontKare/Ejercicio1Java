/* - factorial-break.js -> 
Este archivo debe calcular el factorial
 de 10 utilizando un bucle while, una bifurcación if y una sentencia break */
//Milton TG
var i = 9;
var num = 10;
var factorial = 0;
// I es el la cantidad de veces a multiplicar
// J es el numero de factorial
//factorial es la variable donde almacena el resultado del for
Facto: while (true) {
  if (i > 0) {
    break Facto;
  }
  factorial = num * i;
  num = factorial;
  console.log(factorial);
  i--;
}
console.log("El factorial de 10 es " + factorial);
