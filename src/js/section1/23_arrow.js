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

// 一般的な関数の作り方
//function getItem (){}

// コールバック関数 名前がない関数 (無名関数・匿名関数)

// ES6 アロー関数
// 関数の名前あり
//const getItem = () => {console.log('アロー')};
const getItem = () => console.log('アロー');
getItem();

// 関数の名前なし

fruits.forEach(input => console.log(input));

