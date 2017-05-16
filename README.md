# French Tarot

A round of French Tarot, modelled in Java, using AndroidStudio.

This project aimed to consolidate what I had learned of object-orientated programming by running complex game logic.

The Tarot deck is 78 cards - the familiar four playing card suits, but with one more royal card (the 'knight' or 'chevalier') and a suite of 23 bout (trump) cards. 

French Tarot is a trick-taking game where players deal into a central pile under certain conditions. A round, at least in the version of the game in this program, goes as follows:

+ A player lays down a card into the trick.
+ The next player must play a card of the same suit as the top of the trick that is worth more. 
+ If they do not have one, they must play a bout card. 
+ The next player must then play a bout card of higher value, if they have one. 
+ Once we reach a player who does not have a bout of sufficient value, the trick goes to the previous player.

As of this version, the program is a series of Java files and run in its test files.
