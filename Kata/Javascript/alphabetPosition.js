function alphabetPosition(text) {
    var result = [];
    var alpha = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
      "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
      "w", "x", "y", "z"]
    text = text.replace(/\W*\d+/g, '').toLowerCase().split('');
    for (var i = 0; i < text.length; i++) {
      var index = alpha.indexOf(text[i]) + 1;
      if(index > 0) result.push(index);
      }
    return result.join(' ');
  }

  //Accepts a string and returns the numerical index in the alphabet of each char in the string
  //Ignores non alphabetical chars, separates all returned nums with spaces