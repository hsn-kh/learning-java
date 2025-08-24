// インプット引数なし
// アウトプットなし

function test(){
  console.log('テスト');
}

test();

// インプット引数あり
// アウトプット戻り値なし

const comment = 'コメント';
const comment_2 = 'コメント2';


function getComment(string){
  console.log(string);
}

getComment(comment_2);

// インプット引数なし
// アウトプット戻り値あり

function getNumberOfComment(){
  return 5;
}

console.log(getNumberOfComment());

const NumberOfComment = getNumberOfComment();

console.log(NumberOfComment);

// インプット 2つ
// アウトプットもあり

function sumPrice(int1, int2){
  let int3 = int1 + int2;
  return int3;
}

const total = sumPrice(3,5);

console.log(total);

