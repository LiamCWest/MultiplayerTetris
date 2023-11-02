import pygame

from gui.gui import GUI
from gui.menu.menu import Menu
from gui.gameScreen.gameScreen import GameScreen

def main():
    gui = GUI(640, 480)
    menu = Menu(gui)
    gameScreen = GameScreen(gui)
    menu.show()
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                gui.quit()
                return
            gui.handle_input(event)
        gui.update()

if __name__ == "__main__":
    main()