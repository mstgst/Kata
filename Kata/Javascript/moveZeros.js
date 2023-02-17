function moveZeros(arr) {
    let zeroCount = 0;
    const result = [];
    for(let i=0; i < arr.length; i++) {
      if(arr[i] === 0) {
        zeroCount++
      } else {
        result.push(arr[i]);
        }
    } while(zeroCount > 0) {
      result.push(0);
      zeroCount -= 1;
    }
    return result;
  }

  // Takes an array of objects, pushes all 0s to the end of the array,
  // leaving all other objects in place.
