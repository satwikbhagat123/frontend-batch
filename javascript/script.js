// let i = 0;
// do {
//   i += 1;
//   document.write(i);
// } while (i < 5);

// function myfunction(){
//   let num = 45;
//   document.write(num)
// }
// myfunction();

// // It store object data (objects are represented in the below way mainly)

// let Student = {
//   firstName:"Johnny",
//    lastName:"Diaz",
//    age:35,
//    mark:"blueEYE"
//   }

//   let Car ={
//     name: "BMW",
//     company: "Bayerische Motoren Werke AG",
//     headquarter: "Munich"
//   }
//   document.write(Car);
//   document.write(Student);

// How to create objects  in javascript
// let user = {
//   name: "John",
//   age: 30,
//   height: 5,
// }
//  document.write(user)

// How to add two numbers using javascript

//  function sum(a, b){
//   return a+b;
//  }
//    let result1 = sum(2, 20);
//   document.write(result1);

// create array using Javascript
// var house = new Array(41,20,30,40,50)
// document.write(house);

// Create an array with element 1BHK
//  var house1 = Array(5);
//  document.write(house1);

//  var house3 = new Array("1BHK");
//  document.write(house3);

// String written inside Quotes
// var x = "Welcome to 60 Days challenge";
// document.write(x);

// Arrays Methods

// const arr = ['apple', 'banana', 'cherry', 'orrange'];
// // const str = arr.join('');
// document.write(arr.join(" "));

// Push method
// let fruits = ['apple', 'banana', 'cherry'];
// fruits.push('guava', 'orange');
// document.write(fruits);
// Reverse Method
// fruits.reverse();
// document.write(fruits);

// Sort Method

// fruits.sort(' ');
// document.write(fruits);

// Objects

// let college ={
//     name: 'jkjm',
//     location: 'Lucknow',
//     established:'2010',
//     displayInfo: function(){
//         document.write(`${college.name} was established in
//          ${college.established} at ${college.location}`
//          );
//     }
// }
// college.displayInfo();

// Iterating over all key of an object

// let person = {
//     gender: "male"
// }

// let person1 = Object.create(person);
// person1.name = "John";
// person1.age = 45;
// person1.location = "Mumbai";

// for( let key in person1){
//     document.write(key);
// }

//Async Function
// const getData = async() =>{
//   let data = "Narendra";
//   return data;
// }
// getData().then(data => document.write(data));

//Await Function
// const getData = async () =>{
//     let x = await "Narendra";
//     document.write(x);
// }
// document.write(1);
// getData();
// document.write(30);

/*for(i= 1; i<=5; i++){
  console.log(i)  
}
const numbers = [1, 2, 3, 4, 5];
for (i = 0; i <= numbers.length; i++) {
  if (numbers[i] % 2 === 0)
  {
    console.log(numbers[i] + " is even number");
  }
}

var i=10;
while(i<=20){
  console.log(i);
  i++;
}

 var i = 10;
 do{
  console.log(i);
  i++;
 }
 while(i<=20);*/

//  a = 5;
//  a=--a;
//  a=--a;
//  a= --a;
//  a=--a;
//  console.log(a);
//  b = -5;
//  b = --b;
//  b = --b;
//  console.log(b);
// let a = 10;
// a= --a + ++a;
// let b = (++a * 2 + --a* 2)/++a*2;
// b = ++b;
// console.log(a);
// console.log(b);
//  let a = 5;
//  a= ++a*3 + --a*2 - ++a*2;
//  a=(++a*3/2)+(--a*2/3);
//  let b = (++a + --a)*3/2;
//  b = (++b*2 - --b*2 + ++b*2)/(++a + --a);
//  console.log(a);
//  console.log(b);
// Arithmatic operator
// let a = 10;
// let b = 5;
// let addition = a + b;
// console.log(addition);
// let substraction = a - b;
// console.log(substraction);
// let divide = a / b;
// console.log(divide);
// let multiply = a * b;
// console.log(multiply);
// let exponantiation = a ** b;
// console.log(exponantiation);
// console.log(a++);
// console.log(a--);

//  Comparison operator
//  let x = 50;
//  let y = 5;
//  console.log(x==y);
//  console.log(x!=y);
// console.log(x===y);
// console.log(x!==y);
// console.log(x>y);
// console.log(x<y);
// console.log(x>=y);
// console.log(x<=y);
// Bitwise operator
// let m = 5;
// let n = 3;

// console.log(m&n);
// console.log(m|n);
// console.log(m^n);
// console.log(m<<1);

// let z = 10;
// console.log(z =50);
// console.log(z+=5);
// console.log(z-=5);
// console.log(z*=5);  
// console.log(z/=5);
// console.log(z%=5);   // modulus operator
// console.log(z**5);  // exponentiation operator
// console.log(z**5);  // exponentiation operator

// if(x>20){
  //   console.log("a is greater than 20");
  // }
  //   else{
    //   console.log("a is less than 20");
    // }
//     var x = 20;
// if(a==10){
//   console.log("a is equal to 20")
// }
// else if(a==15){
//   console.log("a is equal to 15")
// }
// else if(a==20){
//   console.log("a is equal to 20")
// }
// else{
//   console.log("a is not equal to 20, 15, 20")
// }



// let a=1;
// a=a++;
// a=a++;
// console.log(a);

// let a=5;
// a=a++; //5+1=6
// a=a++;// 5+1=6
// a=a++;//5+1=6
// a=a++;//5+1=6
// let b=a++; //a=5+1=6,b=5
// b++;//b=6
// console.log(a)//6
// console.log(b)//6


// let a=5;
// a=a++; //5+1=6
// a=a++;// 5+1=6
// a=a++;//5+1=6
// a=a++;//5+1=6
// let b=a++*2; //a=5+1=6
// b++;//b=6
// console.log(a)//6
// console.log(b)//6

// question 7 post decrement operator
// let a=5;
// a=a--;
// a=a--;
// a=a--;
// let b=++a + a-- -a++
//     b--;
// console.log(a)
// console.log(b)


// let a=1;
// a=a++*2;
// a=a++*2;
// a=a++*2;
// a=a++*2;

// let b=(++a*3 - a++*2 + a--*2)/(a++*2)
// b=(b++ + b--)*3/2
// console.log(a)
// console.log(b)


