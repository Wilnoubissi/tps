const rayon = document.querySelector("#rayon");
const diametre = document.querySelector("#diametre");
const formulaire = document.querySelector("#calcul-form");
const circonference = document.querySelector("#circ");
const aire = document.querySelector("#aire");

formulaire.addEventListener("submit", function (event) {
  event.preventDefault();
  diametre.value = 2 * rayon.value;
  circonference.value = 3.14 * diametre.value;
  aire.value = 3.14 * diametre.value * diametre.value * 0.25;
});
