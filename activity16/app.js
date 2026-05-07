const outputBox = document.getElementById("output");
let operands = [];
let currentOperand = "";
let operator = "";

const updateDisplay = (val) => {
    outputBox.textContent = val;
};

const processNumClick = (num) => {
    currentOperand += num;
    updateDisplay(currentOperand);
};

const handleOperator = (op) => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
        currentOperand = "";
        operator = op;
    }
};

const calculate = () => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
    }

    if (operands.length < 2) return;

    let a = operands[0];
    let b = operands[1];
    let res = 0;

    if (operator === "+") res = a + b;
    if (operator === "-") res = a - b;
    if (operator === "*") res = a * b;

    updateDisplay(res);
    operands = [];
    currentOperand = res.toString();
    operator = "";
};

document.querySelectorAll("button").forEach(btn => {
    btn.addEventListener("click", () => {
        const id = btn.id;
        if (id.startsWith("btn") && id.length === 4 && !isNaN(id[3])) {
            processNumClick(id[3]);
        }
    });
});

document.getElementById("btnplus").addEventListener("click", () => handleOperator("+"));

document.getElementById("btnminus").addEventListener("click", () => handleOperator("-"));

document.getElementById("btntimes").addEventListener("click", () => handleOperator("*"));

document.getElementById("btnequal").addEventListener("click", calculate);