//Ejercicio - MiltonTG
let nombre = "Milton";
let apellido = "Toalombo";
let estudiante = nombre.concat(" ", apellido);
console.log(estudiante);
let estudianteMayus = estudiante.toUpperCase();
console.log(estudianteMayus);
let estudianteMinus = estudiante.toLowerCase();
console.log(estudianteMinus);
const inicialNombre = nombre.substring(0, 1);
console.log(inicialNombre);
const finalApellido = apellido.substring(apellido.length - 1, apellido.length);
console.log(finalApellido);
const estudianteSinEspacios = estudiante.replace(/ /g, "");
console.log(estudianteSinEspacios);
const nombreEnEstudiante = estudiante.includes(nombre);
console.log(nombreEnEstudiante);
