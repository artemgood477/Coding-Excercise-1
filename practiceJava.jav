// YOU have to use a HOF.

// 1. Write a function that takes a string parameter, and it console "YES" if the string,
// contains 'y' other wise it console "NO".
// Example - 'Crazyy'

const checkForY = (str) => {
    const containsY = str.includes('y');
    console.log(containsY ? 'YES' : 'NO');
  };
  
  // Example usage:
  checkForY('Crazyy');
  checkForY('Hello'); 
  

// 2. Write a function that finds a factorial of a number.
// Example - 5! = 120 (Use a normal loop for this one.)

// function getFactorial(num) {
// logic
// return the value;
// }

const getFactorial = (num) => {
    let result = 1;
    for (let i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  };
  
  // Example usage:
  console.log(getFactorial(5)); 
  

//3. You have an array of students
// let studentList = [
//   { name: "Mike", marks: [80, 50, 60, 100] },
//   { name: "Daniel", marks: [40, 50, 100, 100] },
//   {
//     name: "Stacy",
//     marks: [20, 100, 50, 70],
//   },
// ];

// function getHighestAverageStudent() {
    // returns the student name with highest average marks
// }

const getHighestAverageStudent = (studentList) => {
    const averageMarks = (marks) => marks.reduce((sum, mark) => sum + mark, 0) / marks.length;
    
    const highestAverage = Math.max(...studentList.map(student => averageMarks(student.marks)));
    
    const highestAverageStudent = studentList.find(student => averageMarks(student.marks) === highestAverage);
    
    return highestAverageStudent.name;
  };
  
  // Example usage:
  const studentList = [
    { name: "Mike", marks: [80, 50, 60, 100] },
    { name: "Daniel", marks: [40, 50, 100, 100] },
    { name: "Stacy", marks: [20, 100, 50, 70] },
  ];
  
  console.log(getHighestAverageStudent(studentList)); 
  

//4. HARD Question - You have to write a function that has the highest number of occurrences
// [ 20, 4, -10, 4, 11, 20, 4, 2]; // 4

const findMostOccurrences = (arr) => {
    const countMap = arr.reduce((acc, val) => {
      acc[val] = (acc[val] || 0) + 1;
      return acc;
    }, {});
  
    const mostOccurrences = Math.max(...Object.values(countMap));
    
    const mostOccurrencesElement = Object.keys(countMap).find(key => countMap[key] === mostOccurrences);
  
    return parseInt(mostOccurrencesElement);
  };
  
  // Example usage:
  const array1 = [20, 4, -10, 4, 11, 20, 4, 2];
  console.log(findMostOccurrences(array1)); 
  


//5. You have to write a function that has to find a number which is unique in the array (I.e Only occured once)
// [20, 20, 11, 4, 11, 20, 2, 4]

const findUniqueNumber = (arr) => {
    const countMap = arr.reduce((acc, val) => {
      acc[val] = (acc[val] || 0) + 1;
      return acc;
    }, {});
  
    const uniqueNumber = Object.keys(countMap).find(key => countMap[key] === 1);
  
    return parseInt(uniqueNumber);
  };
  
  // Example usage:
  const array2 = [20, 20, 11, 4, 11, 20, 2, 4];
  console.log(findUniqueNumber(array2)); 
  


//6. You have an arryay of palindromes and not palindromes,  and you have to return only palindromes array

// ['abc', 'aba', 'ccc', 'dca', 'a']

// ['aba', 'ccc', 'a']

const filterPalindromes = (arr) => arr.filter(word => word === word.split('').reverse().join(''));

// Example usage:
const wordsArray = ['abc', 'aba', 'ccc', 'dca', 'a'];
console.log(filterPalindromes(wordsArray)); 
