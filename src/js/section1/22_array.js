//const fruits = new Array();
const fruits = [ //シンタックスシュガー(簡単に書く書き方)
  'りんご','バナナ'
];

console.log(fruits);

fruits.push('みかん');

console.log(fruits);

// callback 折り返し電話
fruits.forEach(function(input){
  console.log(input);
});