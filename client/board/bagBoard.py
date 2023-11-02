import random

from board.board import Board
from piece.piece import Piece
from utils.vector2 import Vector2

class BagBoard(Board):
    def __init__(self, screen):
        self.bag = self.fillBag()
        self.backBag = self.fillBag()
        Board.__init__(self,screen, [6, 16])
        self.pieceBag = [Piece(self, shape, Vector2(1, 4*i)) for i, shape in enumerate(self.bag[:4])]
        self.xoffset = (self.screen.gui.width // 4*3) - (self.size[0] * 20 //2) + 20
        self.yoffset = (self.screen.gui.height // 2) - (self.size[1] * 20 // 2)
        for piece in self.pieceBag: piece.addToBoard()
                
    def fillBag(self):
        bag = ["O", "I", "L", "J", "Z", "S", "T"]
        random.shuffle(bag)
        return bag
    
    def nextPiece(self, board):
        if (len(self.backBag) == 0):
            self.backBag = self.fillBag()
        outPiece = self.pieceBag.pop(0)
        outPiece.changeBoard(board)
        self.bag.pop(0)
        self.bag.append(self.backBag.pop())
        for piece in self.pieceBag: piece.move(Vector2(0, -4))
        self.pieceBag.append(Piece(self, self.bag[4], Vector2(1, 12)))
        self.pieceBag[-1].addToBoard()
        return outPiece