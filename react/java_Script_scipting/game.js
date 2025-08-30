let gameNum = 24; // Game fixed number....

let userNum = prompt("Enter and guess the correct number: ");
while(userNum !== gameNum){
    userNum = prompt("Wrong number, guess it again: ");
}
// success....
console.log("Successfully guessed the correct number.....");