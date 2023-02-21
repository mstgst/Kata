-- In this game, the hero moves from left to right.
-- The player rolls the dice and moves the number of spaces indicated by the dice two times.
-- write your statement here: you will be given a table 'moves' with
-- columns 'position' and 'roll'. return a table with a column 'res'.

SELECT (position + (roll * 2)) AS res FROM moves