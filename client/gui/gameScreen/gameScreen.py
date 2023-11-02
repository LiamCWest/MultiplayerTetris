import pygame
from gui.screen import Screen
from board.board import Board
from board.bagBoard import BagBoard
from board.holdBoard import HoldBoard
from utils.vector2 import Vector2

class GameScreen(Screen):
    def __init__(self, gui):
        Screen.__init__(self, gui, "game")
        self.selectedPiece = None
        self.board = Board(self, [10, 20])
        self.bagBoard = BagBoard(self)
        self.holdBoard = HoldBoard(self)
        
    def handle_input(self, event):
        if event.type == pygame.KEYDOWN and self.selectedPiece != None:
            if event.key == pygame.K_DOWN:
                self.selectedPiece.move(Vector2(0,1))
            if event.key == pygame.K_LEFT:
                self.selectedPiece.move(Vector2(-1,0))
            if event.key == pygame.K_RIGHT:
                self.selectedPiece.move(Vector2(1,0))
            keys = pygame.key.get_pressed()
            if keys[pygame.K_z]:
                self.selectedPiece.rotate(-1)
            if keys[pygame.K_x]:
                self.selectedPiece.rotate(1)
            if keys[pygame.K_c] and self.selectedPiece != None:
                self.swap()
    
    def draw(self):
        self.gui.draw_text("Tetris", 64, self.gui.width // 2, self.gui.height // 8)
        self.board.draw()
        self.bagBoard.draw()
        self.holdBoard.draw()
    
    def show(self):
        Screen.show(self)
        self.next()
        
    def next(self, piece = None):
        self.selectedPiece = self.bagBoard.nextPiece(self.board) if piece == None else piece
        self.selectedPiece.pos = Vector2(2,0)
        self.selectedPiece.addToBoard()
    
    def swap(self):
        self.next(self.holdBoard.swap(self.selectedPiece))