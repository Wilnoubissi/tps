let n = parseInt(prompt("Entrez votre nombre entre 10 et 20"));
while (n < 10 || n > 20) {
  if (n < 10) {
    n = parseInt(prompt("Entrez un nombre plus grand"));
  } else if (n > 20) {
    n = parseInt(prompt("Entrez un nombre plus petit"));
  }
}
alert("C'est parfait votre nombre est entre 10 et 20 !");
