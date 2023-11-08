from piece.pieceTable import pieceTable
from utils.vector2 import Vector2

class Piece:
    def __init__(self, board, shape, pos : Vector2):
        self.ghost = False
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
        if(self.checkPieceCol(Vector2(0,0), True, new_rotation)):
            self.rotation = new_rotation
            self.partUpdate()

    def move(self, direction):
        if(self.checkPieceCol(direction)):
            self.pos += direction
            self.partUpdate()
        else:
            return "hit"
            
    def partUpdate(self, uBlock = True):
        for part in self.parts:
            part.updatePos(uBlock)        
    
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
            
    def checkPieceCol(self, direction, rot = False, new_rot = None):
        temp_parts = [PiecePart(self, pieceTable[self.shape][new_rot][i], i) for i in range(4)] if rot else self.parts
        return all(part.checkCol(direction, rot) for part in temp_parts)
    
    def place(self):
        self.placed = True
        while(True):
            hit = self.move(Vector2(0,1))
            if(hit == "hit"): break
        # self.board.checkLines()
    
    # def checkBelow(self):
    #     lowest = self.lowestPos()
    #     y = lowest.y + self.pos.y
    #     x = lowest.x + self.pos.x
    #     print(y)
    #     if(y >= self.board.size[1] - 1): 
    #         return False
    #     if((self.board.board[y][x].occupied) 
    #     and self.board.board[y][x].piecePart.piece != self): 
    #         return False
    #     return True
        
class PiecePart():
    def __init__(self, piece : Piece, pos : Vector2, num):
        self.piece = piece
        self.pos = pos
        self.num = num
        self.block = None
        self.setRelPos(self.piece.rotation)
                
    def updatePos(self, uBlock = True):
        self.setRelPos(self.piece.rotation)
        self.pos = self.relPos + self.piece.pos
        if(uBlock):
            if(self.block != None): self.block.setOccupied(False)
            self.block = self.piece.board.board[self.pos.y][self.pos.x]
            if(not self.piece.ghost): self.block.setOccupied(True, self)
        
    def setRelPos(self, rot):
        self.relPos = pieceTable[self.piece.shape][rot][self.num]
    
    def checkCol(self, direction, rot = False):
        new_pos = self.pos + direction
        if rot: new_pos += self.piece.pos
        bound = 0 <= new_pos.x < self.piece.board.size[0] and 0 <= new_pos.y < self.piece.board.size[1]
        pieceCol = True
        if(bound):
            pieceCol = self.piece.board.board[new_pos.y][new_pos.x].occupied
            if pieceCol: 
                piece = self.piece.board.board[new_pos.y][new_pos.x].piecePart.piece
                if piece == self.piece or piece.ghost: pieceCol = False
        return bound and (not pieceCol or self.piece.ghost)