//Ejercicio 2 MTG
const nombre = ["Milton Toalombo"];
const edad = [27];
const programador = [true];
const anio = 1995;
const mes = 3;
const dia = 7;
// const nacimiento = new Date(anio, mes, dia);
const nacimientomio = [dia, mes + 1, anio];

const librofavorito = {
  titulo: "The Witcher - The Time of Contempt ",
  autor: "Andrzej Sapkowski",
  fecha: 1995,
  url: "https://www.amazon.com/-/es/Andrzej-Sapkowski/dp/031645155X/ref=sr_1_8?__mk_es_US=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2UI4WHEV9JP6B&keywords=The+Witcher+book&qid=1667875191&sprefix=the+witcher+boo%2Caps%2C190&sr=8-8",
};

const lista = [nombre, edad, programador, nacimientomio];
const lista2 = [librofavorito];
const list3 = [lista, lista2];
console.log(lista);
console.log(lista2);
console.log(list3);
