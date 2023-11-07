from board.board import Board
from board.bagBoard import BagBoard
from board.holdBoard import HoldBoard

class GameMode:
    def __init__(self, game_screen):
        self.game_screen = game_screen
        self.board = Board(game_screen, [10, 20])
        self.bag_board = BagBoard(game_screen)
        self.hold_board = HoldBoard(game_screen)

    def update(self):
        pass

class SingleplayerMode(GameMode):
    def __init__(self, game_screen):
        GameMode.__init__(self, game_screen)
        self.game_over = False

    def update(self):
        # if not self.game_over:
        #     if self.board.is_game_over():
        #         self.game_over = True
        pass

class MultiplayerMode(GameMode):
    def __init__(self, game_screen, player_id):
        GameMode.__init__(self, game_screen)
        self.player_id = player_id
        self.opponent_board = Board(game_screen, [10, 20], 10)
        self.opponent_score = 0

    def update(self):
        self.board.update()
        # Update opponent board and score
        # Send game state to opponent
        # Receive game state from opponent
        # Update game state based on opponent's move