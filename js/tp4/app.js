email = prompt("Entrer votre email");
mdp = prompt("Entrer votre mot de passe");
emailverif = prompt("Saisissez à nouveau votre email");
mdpverif = prompt("Saisissez à nouveau votre mot de passe");
while (email != emailverif || mdp != mdpverif) {
  alert("Identifiants incorrects");
  emailverif = prompt("Saisissez à nouveau votre email");
  mdpverif = prompt("Saisissez à nouveau votre mot de passe");
}
document.write("Bienvenue dans votre espace");
