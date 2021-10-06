const coursForm = document.querySelector("#btn");
const coursInput = document.querySelector("#cours-input");
const coursList = document.querySelector("#cours-list");
const coursError = document.querySelector("#err-cours");
const showError = document.querySelector("#err-student");
const nameError = document.querySelector("#err-nom");
const prenomError = document.querySelector("#err-prenom");

coursForm.addEventListener("click", function (event) {
  event.preventDefault();
  if (coursInput.value.length < 2) {
    coursError.innerText = "Ce champs doit avoir au moin 2 caractères";
    coursError.classList.add("text-red");
  } else {
    const cours = document.createElement("li");
    const deletecoursButton = document.createElement("button");
    deletecoursButton.innerText = "X";

    // Ajout de l'event de suppression sur le bouton
    deletecoursButton.addEventListener("click", function () {
      deletecoursButton.parentElement.parentElement.removeChild(
        deletecoursButton.parentElement
      );
    });
    cours.innerText = coursInput.value;
    cours.appendChild(deletecoursButton);

    coursList.appendChild(cours);
    coursInput.value = "";
    coursError.innerText = "";
    coursError.classList.remove("text-red");
  }
});

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
const nomInput = document.querySelector("#nm");
const prenomInput = document.querySelector("#prenm");
const ageInput = document.querySelector("#age");
const genreInputM = document.querySelector("#m");
const genreInputF = document.querySelector("#mme");
const paysInput = document.querySelector("#pays");
const optionInput = document.querySelector("#option");
const form = document.querySelector("#form");
const contacts = document.querySelector("#contacts");
const querySelector = [
  nomInput,
  prenomInput,
  ageInput,
  genreInputF,
  paysInput,
  optionInput,
];
form.addEventListener("submit", function (e) {
  e.preventDefault();
  const tr = document.createElement("tr");
  if (
    nomInput.value.length === 0 ||
    prenomInput.value.length === 0 ||
    ageInput.value.length === 0 ||
    paysInput.value.length === 0 ||
    optionInput.value.length === 0
  ) {
    //validation du nom
    if (nomInput.value.length < 5) {
      nameError.innerText = "Ce champs doit contenir au moins 5 caractères";
      nameError.classList.add("text-red");
    } else {
      nameError.innerText = "";
      nameError.classList.remove("text-red");
    }
    //validation du prenom
    if (prenomInput.value.length < 5) {
      prenomError.innerText = "Ce champs doit contenir au moins 5 caractères";
      prenomError.classList.add("text-red");
    } else {
      prenomError.innerText = "";
      prenomError.classList.remove("text-red");
    }
    showError.innerText = "Veuillez remplir tous les champs";
    showError.classList.add("text-red");
  } else {
    const nom = document.createElement("td");
    nom.innerText = nomInput.value;

    const prenom = document.createElement("td");
    prenom.innerText = prenomInput.value;

    const age = document.createElement("td");
    age.innerText = ageInput.value;

    const genre = document.createElement("td");
    genre.innerText = genreInputF.checked ? "F" : "M";

    const pays = document.createElement("td");
    pays.innerText = paysInput.value;

    const option = document.createElement("td");
    option.innerText = optionInput.value;

    const liste_cours = [];
    const liElements = document.querySelectorAll("li");
    for (let i = 0; i < liElements.length; i++) {
      liste_cours.push(...liElements[i].innerText.split("\t"));
    }
    const cours = document.createElement("td");
    cours.innerText = liste_cours;

    contacts.append(tr);
    tr.append(nom, prenom, age, genre, pays, option, cours);

    for (queryElement of querySelector) {
      queryElement.value = "";
    }

    showError.innerText = "";
    coursError.innerText = "";
    showError.classList.remove("text-red");
    coursError.classList.remove("text-red");
  }
});

const etudiant = new Etudiant(
  nomInput.value,
  prenomInput.value,
  ageInput.value,
  genre.value,
  paysInput.value,
  optionInput.value,
  coursList
);

etudiants.push(etudiant);
console.log(etudiants);
