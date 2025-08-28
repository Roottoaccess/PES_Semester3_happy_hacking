// Spread operator functionalities
const even = [2,4,6]; const odd = [1,3,5];console.log(10,20,...even,...odd); // merge

const x = [22,44,66,88]; const y = [...x]; console.log(y); // copy

const z = ["hello","server"]; console.log(...z); // unpack

let zz = {
    name: "zezon",
    department: "core"
}
let ff = { // merging
    ...zz,
    age: 42
}

console.log(...zz.name) // unpacking
console.log(...zz.department) // unpacking

console.log(ff)

// copy using spread operator
copy1 = {
    money: 12000,
    loan: 0
}

copy2 = {
    ...copy1
}; console.log(copy2);