const hoy = new Date();
console.log(hoy);
const nacimiento = new Date(1995, 03, 07);
console.log(nacimiento);
const comparacion = hoy > nacimiento;

const diaNacimiento = nacimiento.getDate();
console.log(diaNacimiento);
const mesNacimiento = nacimiento.getMonth() + 1;
console.log(mesNacimiento);
const anyoNacimiento = nacimiento.getFullYear();
console.log(anyoNacimiento);
