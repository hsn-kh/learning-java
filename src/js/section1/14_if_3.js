// if (条件){
//   条件が真なら実行
// } else {
//  条件が偽なら実行
//}

const height = 91;

//console.log(typeof height);

// if(height >= 91){
//   console.log('身長は' + height + 'cmです');
// } 

// if(height <= 90){
//   console.log('身長は' + height + 'cmになります');
// } 

if(height !== 90){ //否定 // !== 型も判定
  console.log('身長は' + height + 'cmになっています');
} 

// AND, OR

const signal_1 = 'red';
const signal_2 = 'yellow';

// if(signal_1 === 'red' && signal_2 === 'blue'){
//   console.log('赤と青');
//}

if(signal_1 === 'red' || signal_2 === 'blue'){
  console.log('赤');
}

// 三項演算子
//if else
//条件 ? 真 : 偽

const score = 80;

const comment = score >= 80 ? 'good' : 'not good';

console.log(comment);

