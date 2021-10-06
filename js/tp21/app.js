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
