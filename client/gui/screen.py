class Screen:
    def __init__(self, gui, name):
        self.gui = gui
        self.name = name
        self.gui.screens[self.name] = self
        
    def show(self):
        self.gui.currentScreen = self.name
        self.gui.clear()
        
    def hide(self):
        if(self.gui.currentScreen == self.name):
            self.gui.currentScreen = None
            self.gui.clear()