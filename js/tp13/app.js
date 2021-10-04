let l = parseInt(prompt("Entrez le nombre de ligne de votre taleau"));
let c = parseInt(prompt("Entrez le nombre de colonnes de votre tableau"));
let sum = 0;
let k = 0;
let moyene = 0;
for (let j = 0; j < l; j++) {
  for (let i = 0; i < c; i++) {
    int = j + 1;
    k = parseInt(prompt("Entrez les valeurs de la " + int + " ère ligne "));
    sum = sum + k;
  }
}
moyene = sum / (l * c);
document.write("la somme des éléments de votre tableau est " + sum);
document.write("<br/>");
document.write("la moyenne des éléments de votre tableau est " + moyene);
