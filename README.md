# **PRM2T Project – Mastermind Game**

Project contents:
1. Board generator
    - Automatic generation based on selected difficulty level
    - Manual input provided by users
2. Solver
3. Functions defined by the team:
4. The program should allow:
    - Undoing moves
    - Saving the game state and loading it later
    - Saving the board to a file that allows a clear printed version of the puzzle

###### Generator
1. Variables affecting board difficulty
    - Beginner mode / Classic mode
        - Beginner mode – shows for a specific position whether a given color is in the code / is correct in that position
        - Classic mode – the game simply shows the number of correct colors / colors in the correct position, without indicating which position is correct
    - Number of fields
    - Number of colors (relative to fields)
    - Number of attempts
    - Additional options
        - Extra color
        - Minus one attempt
        - Facilitation – non-repeating colors
2. Preset settings – automatic board generation with the option to select additional features
    - Beginner mode
        - Easy
            - 4 fields, 5 colors, 10 attempts
        - Medium
            - 5 fields, 6 colors, 10 attempts
        - Hard
            - 6 fields, 8 colors, 12 attempts
    - Classic mode
        - Easy
            - 4 fields, 5 colors, 10 attempts
        - Medium
            - 4 fields, 6 colors, 10 attempts
        - Hard
            - 5 fields, 8 colors, 12 attempts
3. Manual input – available fields and restrictions
    - Number of fields
        - Minimum 4, maximum 6
    - Number of attempts
        - Even number, minimum 8, maximum 14
    - Number of colors
        - Minimum 4, maximum 10
    - Boolean for facilitation – non-repeating colors
        - In this case, the number of colors must not be smaller than the number of fields

###### Solver
1. Hints
    - The game design eliminates the possibility of hints; the game is simple enough that providing more hints than intended could negatively affect the experience
2. Clues
    - Mastermind uses a clue system that allows the puzzle to be solved
    - Distinction between beginner and classic mode (see Generator 1.a)

###### Additional features
1. Undoing moves
    - Undoing moves is possible until the row is confirmed and clues are revealed – a mechanism that allows changing positions and colors in a given attempt
    - Further undoing after receiving clues would allow the user to win the game “in one move”
2. Saving the game state and loading it later
3. Saving the board to a file that allows a clear printed version of the puzzle
    - Export appearance – GUI
