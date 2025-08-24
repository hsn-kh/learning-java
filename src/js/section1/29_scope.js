'use strict';

const globalVariable = 'グローバル';

function checkScope(){
  const localVariable = 'ローカル'; //グローバル

  //console.log(localVariable);
  console.log(globalVariable);
}

//console.log(globalVariable);

checkScope();

console.log(localVariable);
