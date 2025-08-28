// Spread operator functionalities
const even = [2,4,6]; const odd = [1,3,5];console.log(10,20,...even,...odd); // merge

const x = [22,44,66,88]; const y = [...x]; console.log(y); // copy

const z = ["hello","server"]; console.log(...z); // unpack