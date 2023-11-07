import pygame

from utils.vector2 import Vector2
from piece.piece import Piece

pieceColors = {
    "O": (255, 255, 0),
    "I": (0, 255, 255),
    "L": (255, 165, 0),
    "J": (0, 0, 255),
    "Z": (255, 0, 0),
    "S": (0, 255, 0),
    "T": (128, 0, 128)
}

class Board:
    def __init__(self, screen, size, blockSize = 20):
        self.screen = screen
        self.size = size
        self.blockSize = blockSize
        self.board = [[Block(Vector2(x,y)) for x in range(size[0])] for y in range(size[1])]
        self.xoffset = (self.screen.gui.width // 2) - (self.size[0] * self.blockSize // 2)
        self.yoffset = (self.screen.gui.height) - (self.size[1] * self.blockSize)
        
    def draw(self):
        for row in self.board:
            for b in row:
                pygame.draw.rect(self.screen.gui.screen, b.color, ((b.pos.x * self.blockSize) + self.xoffset, (b.pos.y * self.blockSize) + self.yoffset, self.blockSize, self.blockSize))
        
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
            self.color = pieceColors[piecePart.piece.shape]
        if(not occupied):
            self.color = (100, 100, 100)