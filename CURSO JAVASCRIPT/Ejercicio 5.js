const listacompra = ["leche", "mantequilla", "yogurt", "pan", "queso"];
listacompra.push("aceite de girasol");
console.log(listacompra);
listacompra.pop();
console.log(listacompra);

const pelicula = [
  {
    titulo: "El efecto mariposa",
    director: "Eric Bress",
    fecha: new Date(2004, 3, 30),
  },
  {
    titulo: "Spider-Man: No Way Home",
    director: "Jon Watts",
    fecha: new Date(2021, 11, 16),
  },
  {
    titulo: "Pulp Fiction",
    director: "Quentin Tarantino",
    fecha: new Date(1995, 0, 13),
  },
];

const peliculasNuevas = pelicula.filter(
  (valor) => valor.fecha > new Date(2010, 0, 1)
);
console.log(peliculasNuevas);

const directores = pelicula.map((valor) => {
  return valor.director;
});
console.log(directores);

const titulo = pelicula.map((valor) => {
  return valor.titulo;
});
console.log(titulo);

const direct_titulo = directores.concat(titulo);
console.log(direct_titulo);

const directores_titulos_prop = [...directores, ...titulo];
console.log(directores_titulos_prop);
