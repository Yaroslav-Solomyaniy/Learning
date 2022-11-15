const numberOfFilms = +prompt("Скільки фільмів ви уже переглянули?", "");
const personalMovieDB = {
  count: 0,
  movies: {},
  actors: {},
  genres: [],
  privat: false,
};
personalMovieDB.count = numberOfFilms;
const a = prompt("Один з останніх переглянутих фільмів?", ""),
        b = prompt("На скільки ви його оціните?", ""),
        c = prompt("Один з останніх переглянутих фільмів?", ""),
        d = prompt("На скільки ви його оціните?", "");


personalMovieDB.movies[a] = b;
personalMovieDB.movies[c] = d;

console.log(personalMovieDB);
