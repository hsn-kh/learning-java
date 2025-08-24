const test = 'テスト';
const test_2 = 'です';

console.log(test.length);

console.log(test.concat(test_2));

const greeting = '   Hello world!   ';

console.log(greeting);
// expected output: "   Hello world!   ";

console.log(greeting.trim());
// expected output: "Hello world!";


const str = 'Mozilla';

console.log(str.substring(1, 3));
// expected output: "oz"

console.log(str.substring(2));
// expected output: "zilla"

const test_3 = 'テストです';

console.log(test_3.replace('テスト','ファイト'));