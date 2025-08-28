function add(a,b){
    return console.log("Result sum:",a + b);
}

// Calling the function
add(12,15);


/* 
default parameter

    function add(a = 50, b = 60){
        return console.log("Result: ",a + b);
    }

    add();
*/

// Constant -> the value will not be changed
// const A1 = 10;


// Rest parameter -> someone handels the extra arguments
function display(...names){
    console.log("name:",names);
    // console.log(names,...arguments); // another way
}

display("ram","seta","laxman","rawan");

function fn(a1,b1, ...args) // Rest parameters
{
    console.log(a1);
    console.log(b1);
    console.log(args);
}

fn(10,20,30,40,50,"server");