var currentNumberWrapper = document.getElementById("currentNumber")
var currentNumber = 0;

function increment(){
    currentNumber = currentNumnber  + 1;
    currentNumberWrapper.innerHTML = currentNumber;
}

function decrement(){
    currentNumber = currentNumnber  - 1;
    currentNumberWrapper.innerHTML = currentNumber;
}