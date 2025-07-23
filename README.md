# Home Run Derby Simulator

A fun, interactive Java console game where you challenge "Handsome Ron" in a home run showdown. Perfect for demonstrating core Java concepts like user input, randomness, conditionals, and loops — all wrapped in a baseball-themed experience.

---

## Game Overview

- Choose a bat size (31", 32", or 33") — each affects your hitting range.
- Flip a coin to determine who bats first: you or Handsome Ron.
- Take 10 swings and try to hit as many home runs as possible (450+ feet)!
- Compete against Ron and see who comes out on top.

---

## Features

- Coin toss logic for turn order
- Randomized hit distances using `Math.random()`
- Custom swing logic based on bat size
- Console prompts and user interaction
- Score tracking and win/loss announcement

## How to Run

1. Make sure you have Java (JDK) installed on your machine.

2. Clone or download this repository:
   ```bash
   git clone https://github.com/gabrielf159/HomerunDerby.git
   cd HomerunDerby/src

Compile the game:

bash
javac HomerunDerby.java

Launch the game:
java HomerunDerby


Sample Gameplay

*** Welcome to the Show's Annual Home Run Derby! ***
Enter name: Gabriel
Gabriel, your opponent today is Handsome Ron.
Choose your bat size: 32
Coin toss... You flipped Heads! You bat first!
Hit 1 is 465 ft. — Home Run!!!
Hit 2 is 428 ft. — Not a Home Run
...
Final Score: Gabriel: 5 | Handsome Ron: 3
You are a winner! Come back next year to defend your title.


Author

Gabriel Flores
Crafted as a fun way to apply Java programming fundamentals in a creative game.