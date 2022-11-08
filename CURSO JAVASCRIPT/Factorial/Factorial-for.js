//factorial-for.js -> Este archivo debe calcular el factorial de 10 utilizando un solo bucle for
//Milton TG
var num = 10;
var factorial = 0;
// I es el la cantidad de veces a multiplicar
// J es el numero de factorial
//factorial es la variable donde almacena el resultado del for
for (let i = 9; i > 0; i--) {
  factorial = num * i;
  num = factorial;
  console.log(factorial);
}
console.log("El factorial de 10 es " + factorial);
