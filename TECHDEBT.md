# Technical debt 📣 📉

- 🤷‍♂ Track.getGameBoard is hard-coded for SIZE==3. If requirements will change (SIZE>3), this will fail.
- 🤷‍♂ Diagonal line hard coded for 2 players and for SIZE
- 🤷‍♂ Diagonal lines checks and flags can be deleted, we are interested only in who wins, not how.
