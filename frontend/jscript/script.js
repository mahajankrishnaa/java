// Console log example
console.log("External script connected successfully");

// Alert
function showAlert() {
    alert("This is an alert box");
}

// Confirm
function showConfirm() {
    let result = confirm("Do you want to continue?");
    console.log("User choice:", result);
}

// Rectangle Area using prompt
function rectangleArea() {
    let length = prompt("Enter length:");
    let breadth = prompt("Enter breadth:");

    length = parseFloat(length);
    breadth = parseFloat(breadth);

    let area = length * breadth;

    alert("Area of Rectangle = " + area);
}

// Sum of two numbers
function findSum() {
    let num1 = prompt("Enter first number:");
    let num2 = prompt("Enter second number:");

    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    let sum = num1 + num2;

    alert("Sum = " + sum);
}

// Factorial function
function calculateFactorial() {
    let n = prompt("Enter number:");

    n = parseInt(n);
    let fact = 1;

    for (let i = 1; i <= n; i++) {
        fact *= i;
    }

    alert("Factorial = " + fact);
}

// Total Marks from form
function calculateTotal() {
    let m1 = parseInt(document.getElementById("m1").value);
    let m2 = parseInt(document.getElementById("m2").value);
    let m3 = parseInt(document.getElementById("m3").value);

    let total = m1 + m2 + m3;

    document.getElementById("result").innerHTML = "Total Marks = " + total;
}

// DOM manipulation
function changeContent() {
    document.getElementById("domText").innerHTML = "Content Changed Using DOM!";
}
