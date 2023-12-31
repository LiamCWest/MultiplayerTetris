import pygame

from utils.vector2 import Vector2
from piece.piece import Piece
from piece.ghostPiece import GhostPiece

pieceColors = {
    "O": (255, 255, 0),
    "I": (0, 255, 255),
    "L": (255, 165, 0),
    "J": (0, 0, 255),
    "Z": (255, 0, 0),
    "S": (0, 255, 0),
    "T": (128, 0, 128,),
    "G": (200, 200, 200)
}

class Board:
    def __init__(self, screen, size, blockSize = 20):
        self.screen = screen
        self.size = size
        self.blockSize = blockSize
        self.board = [[Block(Vector2(x,y)) for x in range(size[0])] for y in range(size[1])]
        self.xoffset = (self.screen.gui.width // 2) - (self.size[0] * self.blockSize // 2)
        self.yoffset = (self.screen.gui.height) - (self.size[1] * self.blockSize)
        self.piecesOnBoard = []
        
    def draw(self):
        for row in self.board:
            for b in row:
                pygame.draw.rect(self.screen.gui.screen, b.color, ((b.pos.x * self.blockSize) + self.xoffset, (b.pos.y * self.blockSize) + self.yoffset, self.blockSize, self.blockSize))
    
    def checkLines(self):
        for y in range(self.size[1]):
            if(all(self.board[y][x].occupied for x in range(self.size[0]))):
                self.clearLine(y)
                self.moveLines(y)
    
    def clearLine(self, y):
        for x in range(self.size[0]):
            self.board[y][x].setOccupied(False)
            
    def moveLines(self, y):
        for i in range(y, 0, -1):
            for x in range(self.size[0]):
                self.board[i][x].setOccupied(self.board[i-1][x].occupied, self.board[i-1][x].piecePart)
    
class Block:
    def __init__(self, pos, color = (100, 100, 100)):
        self.pos = pos
        self.color = color
        self.occupied = False
        self.piecePart = None
    
    def setOccupied(self, occupied, piecePart = None):
        if (self.piecePart != None and piecePart != self.piecePart):
            self.piecePart.block = None
        self.occupied = occupied
        self.piecePart = piecePart
        if (piecePart != None):
            self.color = pieceColors[piecePart.piece.shape if type(piecePart.piece) != GhostPiece else "G"]
        if(not occupied):
            self.color = (100, 100, 100)
            if (self.piecePart != None):
                self.piecePart.piece.parts.remove(self.piecePart)
                self.piecePart.block = None
                self.piecePart = None