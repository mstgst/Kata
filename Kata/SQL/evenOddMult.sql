SELECT number,
CASE
    WHEN number%2=0 THEN number*8
    ELSE number*9
  END  AS res FROM multiplication

--returns two columns, a given number and n*8 if even, n*9 if odd