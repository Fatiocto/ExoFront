'use strict'

let admin;
let me;

admin = me;
me='john';



console.log(admin);

//exo 2

let firstname='Fatima';
let lastname='Kaaouan';

let fullname= firstname + '   '+ lastname;
//ou concaténation 
//let fullname1= ${firstname1} ${lastname1};
console.log(fullname);
console.log(fullname1);

//ex 3

const age = prompt ('Quel est votre âge?');
console.log ('Quel est votre âge?');

    if (age < 18) {
        alert= ('Sorry, you are too young')

    }else if (age === 18){
        alert=('Congratulations for your first driving year, good luck!');

    }else {
        alert=('Enjoy your car');
    }

