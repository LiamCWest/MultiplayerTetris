from piece.piece import Piece
from utils.vector2 import Vector2

class GhostPiece(Piece):
    def __init__(self, piece):
        Piece.__init__(self, piece.board, piece.shape, piece.pos)
        self.ghost = True
        self.piece = piece
        self.update()
        
    def lowestPos(self):
        lowest = Vector2(0,0)
        for part in self.parts:
            if(part.relPos.y > lowest.y): lowest = part.relPos
        return lowest
        
    def checkBelow(self, selfPos):
        # lowest = self.lowestPos()
        for part in self.parts:
            part.setRelPos(self.piece.rotation)
            y = part.relPos.y + selfPos.y
            x = part.relPos.x + selfPos.x
            if(y >= self.board.size[1] - 1): 
                return False
            if((self.board.board[y][x].occupied) 
            and (self.board.board[y][x].piecePart.piece != self.piece
            and self.board.board[y][x].piecePart.piece != self)): 
            # if((self.board.board[y][x].occupied) and self.board.board[y][x].piecePart.piece.placed):
                return False
        return True
    
    def update(self):
        newPos = self.piece.pos
        self.rotation = self.piece.rotation
        canMove = self.checkBelow(newPos)  
        while(canMove):
            newPos += Vector2(0,1)
            canMove = self.checkBelow(newPos)
            if not canMove: newPos -= Vector2(0,1)
        self.pos = newPos
        self.partUpdate()
        self.addToBoard()
        self.piece.addToBoard()