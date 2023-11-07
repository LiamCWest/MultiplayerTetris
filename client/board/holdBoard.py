from board.board import Board
from utils.vector2 import Vector2

class HoldBoard(Board):
    def __init__(self, screen):
        Board.__init__(self, screen, [6,4])
        self.piece = None
        self.xoffset = (self.screen.gui.width // 4) - (self.size[0] * self.blockSize // 2) - self.blockSize
        self.yoffset = (self.screen.gui.height // 4) - (self.size[1] * self.blockSize // 2)
        
    def swap(self, piece):
        outPiece = self.piece
        self.piece = piece
        self.piece.changeBoard(self, Vector2(1,0))
        if (outPiece != None):
            outPiece.changeBoard(self.screen.board, Vector2(2,0))
        return outPiece