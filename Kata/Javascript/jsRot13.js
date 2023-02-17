function rot13(message) {
    const alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    const cipher = "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM"
    return message.replace(/[a-z]/gi, letter => cipher[alpha.indexOf(letter)])
  }

  //Accepts a message and returns it translated through the ROT13 cipher
  //all non alphabetic characters remain the same