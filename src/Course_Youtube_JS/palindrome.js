const checkPalindrome = (txt) => {
  let arr = txt.split("");
  let myRev = [];

  for (let i = arr.length - 1; i >= 0; i--) {
    myRev.push(arr[i]);
  }

  let pal = myRev.join("");

  if (pal === txt) {
    return true;
  } else {
    return false;
  }
};

// let res = checkPalindrome("Khaled");
// let res = checkPalindrome("123321");
