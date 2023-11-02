import pygame

class GUI:
    def __init__(self, width, height):
        pygame.init()
        self.width = width
        self.height = height
        self.screen = pygame.display.set_mode((width, height))
        self.screens = {}
        self.currentScreen = None
        pygame.display.set_caption("Tetris")

    def draw_text(self, text, size, x, y, color=(255, 255, 255)):
        font = pygame.font.Font(None, size)
        text_surface = font.render(text, True, color)
        text_rect = text_surface.get_rect()
        text_rect.center = (x, y)
        self.screen.blit(text_surface, text_rect)

    def handle_input(self, event):
        if self.currentScreen:
            self.screens[self.currentScreen].handle_input(event)

    def update(self):
        pygame.display.update()
        if self.currentScreen:
            self.screens[self.currentScreen].draw()

    def clear(self):
        self.screen.fill((0, 0, 0))

    def quit(self):
        pygame.quit()