// Js as dynamic

let x = 26; console.log(`for number: ${typeof x}`);

x = "Server up"; console.log(`for string: ${typeof x}`);

// Object literals

let person = {
    name : "something",
    status : "up and running" 
}; console.log(person);

// for...of loop....
const arr = [10,20,30,40]
for(let i of arr){
    console.log(i);
}

for(let i in arr){ // giving the index....
    console.log(i);
}

// normal funciton....
function display1(){
    let msg = "Running status init";
    return msg;
}; console.log(display1());

// Arrow function....
const display = () => {
    let name = "running init";
    return name;
}; console.log(display());
