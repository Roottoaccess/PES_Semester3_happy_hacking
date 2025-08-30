// calculating the factorial

let num = 5;

let fact = 1;

for(let i = num; i >= 1; i--){
    fact *= i;
}
console.log(`factorial: ${fact}`);