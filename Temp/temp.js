var T = "temperature";
let c = "celsius";
let f = "farhenheit";

//conversion farhenheit celsius

function converterFtoC(valNum){
    valNum = parseFloat(valNum);
    document.getElementById("celsius").innerHTML = Math.round ((valNum-32) /1.8);
}

function converterCtoF(valNum){
    valNum = parseFloat (valNum);
    document.getElementById("farhenheit").innerHTML = Math.round((valNum*1.8)+32);
}