class GameStateManager:
    def __init__(self):
        self.mode = None

    def set_mode(self, mode):
        self.mode = mode

    def update(self):
        if self.mode is not None:
            self.mode.update()