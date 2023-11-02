import pygame
from gui.screen import Screen

class Menu(Screen):
    def __init__(self, gui):
        Screen.__init__(self, gui, "menu")
        self.options = ["Play", "Options", "Quit"]
        self.selected_option = 0

    def handle_input(self, event):
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_UP:
                self.selected_option = (self.selected_option - 1) % len(self.options)
            elif event.key == pygame.K_DOWN:
                self.selected_option = (self.selected_option + 1) % len(self.options)
            elif event.key == pygame.K_RETURN:
                if self.selected_option == 0:
                    print("Starting game...")
                    self.gui.screens["game"].show()
                elif self.selected_option == 1:
                    print("Opening options menu...")
                elif self.selected_option == 2:
                    self.gui.quit()

    def draw(self):
        self.gui.draw_text("Tetris", 64, self.gui.width // 2, self.gui.height // 4)
        for i, option in enumerate(self.options):
            color = (255, 255, 0) if i == self.selected_option else (255, 255, 255)
            self.gui.draw_text(option, 32, self.gui.width // 2, self.gui.height // 2 + i * 32, color)