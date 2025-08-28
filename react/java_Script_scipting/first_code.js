console.log("Server running and up");

let server = "down shift" // This is a normal variable
// console.log(server)
const service = "This is a constant server"; // This is a constant variable
// console.log(service)
// Construct a fuinction and then the demo script
function Demo(a,b){
    { // This is the block....
        let a = 5; // This is the new value inside the block
        var b = 10; // Value will be printed outside the block
    }
    console.log(a); console.log(b); // Printing the values
}

// Defining the function....

// Demo();
// Implementation of the Destructuring feature....
function getScores(){
    return [70,80,90];
}
// EC5 -> older javascript
// let x = getScores(); console.log(x[0]);
// ES6 -> Array Destructions
let [a,b,c] = getScores();
console.log(a,b,c);
const fruits = ["apple","banana","grapes","orange"];
let [x,y] = fruits;
console.log(fruits[2],x,y);

// Object Destructors....
// ES5 -> for the older version....
const person = {name: "Delta", department: "airforce"}
console.log(person.name, person.department);
// Using the ES6 concept (new version)
const person1 = {name: "Alpha", department: "army", callsign: "SharpMaster"}
const {name,department,callsign} = person1; console.log(name,department,callsign);