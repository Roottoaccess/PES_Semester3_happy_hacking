// First program....
const greetings = (name = "server") => {
    msg = `Hello ${name}`;
    return msg;
}; console.log(greetings());

// Second program....

for(let i = 1; i <= 5; i++){
    // let count = 1; // This will not be acccess outside the loop....
    var count = 1;
}; console.log(count);

// Third program....
function cal_total(...price){
    let sum = 0;
    for(i of price){
        sum += i;
    }
    return sum;
}
console.log(cal_total(12,14,22,24));

// Spread operator.....
arr = [1,2,3,4];
arr1 = [...arr,5,6,7,8]; console.log(arr1);

// for...of
x = [10,20,30,40]; for(let i of x){
    console.log(i);
}

// Template literal....
let OrderId = 1234;
let username = "John";
let amount = 200;

console.log(`Order${OrderId} for ${username} has been placed. Total: $${amount}`)

// object literals
let id = 1;
let names = "server";

let demo = {
    id,
    names
};

console.log(`id: ${id} and name: ${names}`);