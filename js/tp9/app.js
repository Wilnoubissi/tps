let n = prompt("Entrer la valeur du dernier nombre de la liste")
for (let i=1;i<=n;i++){
    if(i%5==0){
        message = "buzz";
    }
        else if(i%3==0){
            message = "fizz";
            }
        else if(i%3==0 && i%5==0) {
            message = "fizzbuzz"
            }
        document.write(message)
        else {
            document.write(i)
        }
}
