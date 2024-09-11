// print even numbers from 0 to 100 using for loop

// for (let i=0;i<=100;i++) {
//     if (i%2=== 0){
//         console.log("i=",i);
//     }

// }


//print odd numbers from 0 to 100 using for loop
// for (let i=0;i<=100;i++) {
//     if (i%2!== 0){
//         console.log("i=",i);
//     }

// }

//create a game where you start with any random game number .ask the user to keep guessing the game number until the usder enters correct value
// let gameNumber=25;

// let userNumber=prompt("guess the game number:");
// while (userNumber!= gameNumber){
//     userNumber=prompt("you entered wrong number.guess again:");
// }
//   console.log("congratulations, you entered the right number");


//strings
// let str="ApnaCollege";

//   console.log(str[8]);
//   console.log(str[0]);
//   console.log(str[5]);
//     console.log(str.length);
  

    //template literals
    // let specialString=`this is a template literals`;
    //   console.log(typeof specialString);

    //   let obj={
    //     item:"pen",
    //     price:10,
    //   };
    //     // console.log("the cost of",obj.item,"is",obj.price,"rupees");
    //     //instead of writting this line we can simply write it in this way it is simpler
    //   let output=`the cost of ${obj.item} is ${obj.price} rupees`;
    //   console.log(output);

// //here if we want to print apna in one line and college in next line then we can use \n it means new line and it will not print it will just change the line 
//   console.log("apna \n college");
//   //and if we wnat to give one tab space then we can write it like this
//   console.log("apna \t college");

//   // here if someone ask a question that what should be the length of this string then we say 12 because \t will count only one character so it will be 12

//   let str="apna\tcollege";
//     console.log(str.length);

// let str= "Apna College";
// // str.toUpperCase();   //this will not change the orignal strring it will create a new string and then change that b/c strings are immutable
// let newStr=str.toUpperCase();
// console.log(str);
//   console.log(newStr);

// //or we can do it like this in short
// let str= "Apna College";

// str=str.toUpperCase();
// console.log(str);

// //toLowerCase
// let str= "APNA COLLEGE";

// str=str.toLowerCase();
// console.log(str);

// //str.trim()  it removes whitespaces from starting and at ending but not in the middle like the space b/w js is nnot trimmed
// let str="     apna college      js       ";
//   console.log(str.trim());

// // str.slice(start,end?)     it returns the part b/w the start and end of the string
// let str="0123456";
//   console.log(str.slice(1,6));
//   console.log(str.slice(2,3));
//   console.log(str.slice(2,9));

// let str="hello world";
//   console.log(str.slice(0,8));
//   console.log(str.slice(0,10));
//   console.log(str.slice(0,11)); // if we acced the size of the string then it will only print till the last word
//   console.log(str.slice(3,8));

// //str.concat(str2);  it will join the 2 strings together
// let str1="apna";
// let str2="college";

// let res=str1.concat(str2);
//   console.log(res);

// let str1="apna";
// let str2="college";

// // let res=str2.concat(str1);
// //or in js we can simplty concat the 2 strings in this way also 
// // let res=str1+str2;
// //or
// // let res=str2+str1;
// //or
// let res="i am learning coading from" + str1+str2;


//   console.log(res);

// let res="hello"+123;
//   console.log(res);


// //str.replace(searchVal,newVal)
// let str="hello";

//   console.log(str.replace("h","m"));
//   console.log(str.replace("lo","p"));

// let str="hellololo";

//   console.log(str.replace("lo","p"));// this will replace the first matching lo then rest will be same to replace all the matching word with the word we have to use replaceAll() 
//     console.log(str.replaceAll("lo","p"));

// //str.charAt(index value)

// let str="ilovejs";
//   console.log(str.charAt(0));
//   console.log(str.charAt(6));
//   console.log(str.charAt(-1)); // if we acced the value from negative index value then it will show error
//   console.log(str.charAt(10)); // if we acced the value from index value which is not present then it will show undefined

// // let str="ilovejs";
// // str[0]="s";

// // console.log(str);// it will not show slovejs b/c string is immutable and it will not change iyt in the present string it will change in the new string

// //to show that we have to write it like this 
// let str="ilovejs"
// str=str.replace("i","s");
//   console.log(str);

// //prompt the user to enter their full name .generate a username for them based on the input start username with @, followed by their full name and ending with the full name length.
// // eg:- user name="satwikbhagat", username should be "@satwikbhagat12"
// //here the length of satwikbhagat is 12 so we have to concat that in the end of the username like "satwikbhagat12"

// // let userName=prompt("enter the fullname without spaces:");

// // let length=userName.length;

// // let username="@"+userName+length;

// // console.log(username);

// //or we can write in in this way 
// let userName=prompt("enter the fullname without spaces:");

// let username="@"+userName+userName.length;;

// console.log(username);





// arrays in js
// //it is a collection of items
// let marks= [97,82,45,67,89];
//   console.log(marks); 
//   console.log(marks.length); //property of arrays


//   let heroes=["ironman","thor","hulk","shaktiman","spiderman","antman"];
//     console.log(heroes);
//       console.log(typeof heroes);//it will be stored as an object
//       console.log(heroes[0]); //0 index value will be ironman
//       console.log(heroes[5]); //5 index value will be antman
//       console.log(heroes[6]); //if we try to access the index which is not present then it will show undefined
//         console.log(heroes[0]="batman");
//           console.log(heroes);

// let str=["hello"]
//     console.log(str);//here we can see that array is mutable here we can change the array length from "hello" to "y" but we cannot change the string which is written in array i.e. "hello" b/c it is immutable


// let heroes=["ironman","thor","hulk","shaktiman","spiderman","antman"];
// // //for loop
// // for (let i=0; i<heroes.length; i++){
// //       console.log(heroes[i]);
// // }

// //for of

// for (let hero of heroes){
//       console.log(hero);
// }

// let cities=["delhi","pune","mumbai","hyderabad","gurgaon"];
// for(let city of cities){
//       console.log(city.toUpperCase());
// }

// //for a given array with marks of students-->[85,97,44,37,76,60]
// //find the average marks of the entire class.

// let marks=[85,97,44,37,76,60];

// let sum=0;

// for(let val of marks){
//     sum+=val;
// }
// let avg=sum/marks.length;
//   console.log(`avg marks of the class=${avg}`);

//for a given array with prices of 5 items-->[250,645,300,900,50]
//all items have an offer of 10% off on them. change the array to store final price after applying offer.

// let items=[250,645,300,900,50];

// // let i=0;
// // for(let val of items){
// //     //   console.log(`value at index ${i}=${val}`);
// //       let offer=val/10;
// //       items[i]=items[i]-offer;
// //         console.log(`value after offer=${items[i]}`);
// //       i++;
// // }

// //or we can do it in this way
// for(let i=0;i<items.length;i++) {
//     let offer=items[i]/10;
//     items[i]=items[i]-offer;
// }
//   console.log(items);
