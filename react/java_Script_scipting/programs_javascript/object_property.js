const person = [
    {name: "Jeet", age: 22},
    {name: "zedion", age: 24},
    {name: "drill", age: 32},
    {name: "quety", age: 21}
];
// This is using the name....
const property = person.sort((a,b) => a.name.localeCompare(b.name));
console.log(property);

// This is for age.....
const age_property = person.sort((a,b) => a.age - b.age); console.log(property);