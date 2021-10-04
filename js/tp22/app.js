let countChinoise = 0; // 1
const PeopleNameEndWithA = []; // 2
const womenChinese = [];
let countEndWithA = 0;
const allNames = []; // 3
const menRussian = []; // 4
const womenStartWithK = [];
const menStartWithK = [];

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
    menStartWithK.push(etudiants[i]);
  }
}
