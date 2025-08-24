const postalCode = '123-45678';

// JavaScriptはcamelCase 
// HTML/CSS 大文字小文字区別しない snake_case 
// 英語 動詞+名詞
function checkPostalCode(string){
  const replaced = string.replace('-','');
  const length = replaced.length;

  if(length === 7){
    return true;
  }
  return false;
}

console.log(checkPostalCode(postalCode));
