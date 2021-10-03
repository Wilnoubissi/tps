let nb = prompt(
  "Entrer le 1er nombre dont vous voulez la table de multiplication"
);
let nb_max = prompt(
  "Entrer le dernier nombre dont vous voulez la table de multiplication"
);
let prem_nb = prompt("Entrer le 1er nombre de la table");
let last_nb = prompt("Entrer le dernier nombre de la table");
for (let i = nb; i <= nb_max; i++) {
  for (let k = prem_nb; k <= last_nb; k++) {
    document.write(i + " x " + k + " = " + k * i);
    document.write("<br/>");
  }
  document.write("<br/>");
}
