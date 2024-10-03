const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    const [aNum, bNum] = input.map(a => Number(a))
    console.log(`${aNum} + ${bNum} = ${aNum + bNum}`);
});