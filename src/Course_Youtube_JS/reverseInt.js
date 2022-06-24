const reverseInt = (num) => {
  let myStr = num.toString();
  let reversed = [];

  myStr = myStr.split("");

  for (let i = myStr.length - 1; i >= 0; i--) {
    reversed.push(myStr[i]);
  }

  reversed = parseInt(reversed.join(""));

  if (num < 0) {
    reversed *= -1;
  }

  return reversed;
};

console.log(reverseInt(-143));
