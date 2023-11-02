from piece.pieceTable import pieceTable
from utils.vector2 import Vector2

class Piece:
    def __init__(self, board, shape, pos : Vector2):
        self.board = board
        self.shape = shape
        self.pos = pos
        self.rotation = "N"
        self.parts = [PiecePart(self, pieceTable[self.shape][self.rotation][i], i) for i in range(4)]
        for part in self.parts: part.updatePos()
        self.placed = False
        
    def rotate(self, direction):
        rotations = ["N", "E", "S", "W"]
        current_rotation = rotations.index(self.rotation)
        new_rotation = rotations[(current_rotation + direction) % len(rotations)]
        if(self.checkPieceBounds(Vector2(0,0), True, new_rotation)):
            self.rotation = new_rotation
            self.partUpdate()

    def move(self, direction):
        if(self.checkPieceBounds(direction)):
            self.pos += direction
            self.partUpdate()
            
    def partUpdate(self):
        for part in self.parts:
                part.updatePos()        
    
    def addToBoard(self):
        for part in self.parts:
            part.block = self.board.board[part.pos.y][part.pos.x]
            part.block.setOccupied(True, part)
    
    def removeFromBoard(self):
        for part in self.parts:
            if(part.block != None): part.block.setOccupied(False)
            
    def changeBoard(self, board, pos = Vector2(0,0)):
        self.removeFromBoard()
        self.board = board
        self.pos = pos
        self.partUpdate()
        self.addToBoard()
            
    def checkPieceBounds(self, direction, rot = False, new_rot = None):
        temp_parts = [PiecePart(self, pieceTable[self.shape][new_rot][i], i) for i in range(4)] if rot else self.parts
        return all(part.checkBounds(direction, rot) for part in temp_parts)
        
class PiecePart():
    def __init__(self, piece : Piece, pos : Vector2, num):
        self.piece = piece
        self.pos = pos
        self.block = None
        self.num = num
        
    def updatePos(self):
        self.pos = pieceTable[self.piece.shape][self.piece.rotation][self.num] + self.piece.pos
        if(self.block != None): self.block.setOccupied(False)
        self.block = self.piece.board.board[self.pos.y][self.pos.x]
        self.block.setOccupied(True, self)
        
    def checkBounds(self, direction, rot = False):
        new_pos = self.pos + direction
        if rot: new_pos += self.piece.pos
        return 0 <= new_pos.x < self.piece.board.size[0] and 0 <= new_pos.y < self.piece.board.size[1]