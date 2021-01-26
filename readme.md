

General information:
1. Card deck is 52 cards. Suits - diamonds, hearts, spades, clubs. Each suit has cards values from 2 two ACE. 
Each face card has value of ten.
2. Each time server takes card from card deck, card deck size is reduced.
3. When card deck becomes empty game is over.
4. Cards in the deck must be shuffled.

Game flow:
1. Server must have startup option to be started in automated or manual mode:
- automatic mode. Server will automatically control game flow as described below
- manual mode. Server will accept commands from command line. 
  * Command 1 - Start round. Mandatory parameter - base card. Server will send this card to player.
  * Command 2 - Finish round. Mandatory parameter - result card. Server will use this to calculate win and send result to player.

1. When round is started server sends to player StartRoundRequest. Client must display base card from StartRoundRequest.
2. Client has 10 seconds to make an action. During this time player has a choice of three actions - 'higher', 'lower' or 'equal'.  
3. Client must display countdown values to player. 
4. When countdown reaches zero client stops accepting actions
5. If player does not make an action, go to point 7
6. Server checks internally player action and compares base card value to result card.
                   - If player action was correct, player wins
                   - If player action was incorrect, player loses 
7. Server sends FinishRoundRequest to client
8. Client must display win result to player
9. Previous result card became new 'base card'
10. Repeat steps 1 to 10.

