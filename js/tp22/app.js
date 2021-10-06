function Etudiant(nom, prenom, age, genre, pays, option, listeCours) {
  this.nom = nom;
  this.prenom = prenom;
  this.age = age;
  this.genre = genre;
  this.pays = pays;
  this.option = option;
  this.listeCours = listeCours;
}

Etudiant.prototype.setnom = function (valeur) {
  this.nom = valeur;
};

Etudiant.prototype.setprenom = function (valeur) {
  this.prenom = valeur;
};

Etudiant.prototype.setoption = function (valeur) {
  this.option = valeur;
};

const etudiants = [];
const liste_cours = [];
const qteEtudiant = parseInt(prompt("Combien d'étudiants dans la liste :"));

for (let i = 1; i <= qteEtudiant; i++) {
  const nom = prompt("Nom :");
  const prenom = prompt("Prénom :");
  const age = parseInt(prompt("Age : "));
  const genre = prompt("Genre : ");
  const pays = prompt("Pays :");
  const option = prompt("Option :");
  for (let j = 1; j <= 3; j++) {
    liste_cours[j] = prompt("cours " + j);
  }
  const etudiant = new Etudiant(
    nom,
    prenom,
    age,
    genre,
    pays,
    option,
    liste_cours
  );
  etudiants.push(etudiant);
}

for (let i = 0; i < etudiants.length; i++) {
  console.log(etudiants[i]);
}

let countChinoise = 0; // 1
const PeopleNameEndWithA = []; // 2
const womenChinese = [];
let countEndWithA = 0;
const allNames = []; // 3
const menRussian = []; // 4
const womenStartWithK = [];
const menStartWithM = [];

for (let i = 0; i < etudiants.length; i++) {
  allNames.push(etudiants[i].nom); // 3
  if (
    etudiants[i].pays.toLowerCase() === "chine" &&
    etudiants[i].genre.toLowerCase() === "f"
  ) {
    womenChinese.push(etudiants[i]);
    countChinoise++; // 1
  }
  if (
    etudiants[i].prenom[etudiants[i].prenom.length - 1].toLowerCase() === "a"
  ) {
    PeopleNameEndWithA.push(etudiants[i]); // 2
  }

  if (
    etudiants[i].pays.toLowerCase() === "russie" &&
    etudiants[i].genre.toLowerCase() === "m"
  ) {
    menRussian.push(etudiants[i]); // 4
  }
  if (
    etudiants[i].nom.toLowerCase()[0] === "k" &&
    etudiants[i].genre.toLowerCase() === "f"
  ) {
    womenStartWithK.push(etudiants[i]);
  }
  if (
    etudiants[i].prenom.toLowerCase()[0] === "m" &&
    etudiants[i].genre.toLowerCase() === "m"
  ) {
    menStartWithM.push(etudiants[i]);
  }
}
