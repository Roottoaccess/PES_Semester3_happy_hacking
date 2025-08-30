// Defiing a strng first
// For array and string we are going to use the for-of loop
let str = "Server is up and running";
let size = 0;
for(let i of str){
    // console.log(`i: ${i}`);
    size += 1;
}; console.log(`The size of the array: ${size}`);

// for object we are going to use the for-in loop
let student = {
    name: "Biswarup Dutta",
    age: 22,
    department: "Master of computer application",
    cgpa: 7.9
}

// Applying the for in loop
for(let key in student){
    console.log(`key = ${key}, value = ${student[key]}`); // Accessing the elements inside the object....
}

// Practise questions....
let i = 0
while(i <= 100){
    if(i % 2 == 0) // Condition checking
        console.log(i);
    i++; // Increment operations.....
}