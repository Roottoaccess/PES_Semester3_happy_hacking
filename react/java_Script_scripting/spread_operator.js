// Scripting the Spred operator concept using javascript....
/*
    Spread operator can perform -> unpack, copy, merge
*/
// Array spread operator....
const num = [1,2,3,4,5]; console.log(...num); // unplacking

const num1 = [1,3,5,7,9]; const num2 = [...num1,2,4,6,8,10]; console.log(num2) // merging

const num3 = [1,2,5,8]; const num4 = [...num3]; console.log(num4) // copying
// Object spread operator....
let p1 = {
    name: 'Robo',
    environment: 'clear'
}
console.log(...p1.name, ...p1.environment); // unpacking in object

let p2 = {
    m: "high",
    n: "low"
}
let p3 = {
    ...p2,
    j : "hello"
}; console.log(p3); // Merging concept....

// Copying  in Object using spread operator....
let q1 = {
    voltage: "high",
    register: "low-power"
}

let q2 = {
    ...q1
}; console.log(q2);