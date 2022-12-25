function reverseUnique(word) {
  let revers = '';
  for (let i = 0; i < word.length -1; i++) {
    revers += word[i];
  }
  for (let i = word.length - 1; i >=0; i--){
    if(word[i] != word [i+1]){
      revers += word[i];
    }
  }
  return revers;
}

console.log(reverseUnique('PHOBIA')); //gnitaerg

module.exports = reverseUnique;
