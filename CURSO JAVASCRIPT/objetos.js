const datos_personales = {
  nombre: "milton",
  apellido: "toalombo",
  edad: 27,
  altura: 160,
  eresdesarrollador: true,
};

let edad = datos_personales.edad;

console.log(edad);

const lista = [
  { ...datos_personales },
  {
    nombre: "ana",
    apellido: "goyes",
    edad: 66,
    altura: 160,
    eresdesarrollador: false,
  },
  {
    nombre: "fanit",
    apellido: "goyes",
    edad: 77,
    altura: 160,
    eresdesarrollador: false,
  },
];
console.log(lista);

const lista_ordenada = lista.sort((a, b) => b.edad - a.edad);

console.log(lista_ordenada);
