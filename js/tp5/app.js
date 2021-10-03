email = prompt("Entrer votre email");
mdp = prompt("Entrer votre mot de passe");
let i = 1;
do {
  document.write(i + " tentative");
  document.write("<br/>");
  emailverif = prompt("Saisissez à nouveau votre email");
  mdpverif = prompt("Saisissez à nouveau votre mot de passe");
  i = i + 1;
} while ((email != emailverif || mdp != mdpverif) && i < 6);
document.write("vous avez atteint 5 tentatives, plus d'essais");
