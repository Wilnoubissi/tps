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
  const souhait_1 = prompt("souhaitez vous modifier de nom: oui ou non");
  if (souhait_1 == "oui") {
    etudiant.setnom(prompt("entrer votre nouveau nom"));
  }
  const souhait_2 = prompt("souhaitez vous modifier de prénom: oui ou non");
  if (souhait_2 == "oui") {
    etudiant.setprenom(prompt("entrer votre nouveau nom"));
  }
  const souhait_3 = prompt("souhaitez vous modifier de d'option: oui ou non");
  if (souhait_3 == "oui") {
    etudiant.setoption(prompt("entrer votre nouveau nom"));
  }
  etudiants.push(etudiant);
}

for (let i = 0; i < etudiants.length; i++) {
  console.log(etudiants[i]);
}

//Nombre de chinois dans la collection
//toutes les personnes dont les prénoms se terminent par a
//liste des noms

// let nombre_chinois = 0;
// let nombre_personne = 0;
// const list_noms = [];
// for (let i = 0; i < etudiants.length; i++) {
//   if (etudiants[i].pays.toLocaleLowerCase() === "chine") {
//     nombre_chinois += 1;
//   }
//   if (etudiants[i].prenom[etudiants[i].prenom.length - 1] === "a") {
//     nombre_personne += 1;
//   }
//   list_noms.push(etudiants[i].nom);
// }
