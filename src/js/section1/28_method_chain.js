//const postalCode = '123-4567';

const postal = {

  postalCode:'123-4567',

  // this.postalCode
  checkPostalCode(){
    const replaced = this.postalCode.replace('-','').length;
//const length = replaced.length;
  
    if(replaced === 7){
      return true;
    }
    return false;
  }
};


console.log(postal.checkPostalCode());


const person = {
  name: '本田',
  age: 30,
  
  getName() {
      console.log( this.name );
      return this;
  },
  getAge() {
      console.log( this.age );
      return this;
  }
};

person.getName().getAge();


