const reverseString = (txt) => {
  let arr = txt.split("");
  let myRev = [];

  for (let i = arr.length - 1; i >= 0; i--) {
    myRev.push(arr[i]);
  }

  return myRev.join("");
};

let myText = reverseString("Khaled");
