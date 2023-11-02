from utils.vector2 import Vector2

pieceTable = {
    "O": {
        "N": [Vector2(1, 0), Vector2(2, 0), Vector2(1, 1), Vector2(2, 1)],
        "E": [Vector2(1, 0), Vector2(2, 0), Vector2(1, 1), Vector2(2, 1)],
        "S": [Vector2(1, 0), Vector2(2, 0), Vector2(1, 1), Vector2(2, 1)],
        "W": [Vector2(1, 0), Vector2(2, 0), Vector2(1, 1), Vector2(2, 1)]
    },
    "I": {
        "N": [Vector2(0, 1), Vector2(1, 1), Vector2(2, 1), Vector2(3, 1)],
        "E": [Vector2(2, 0), Vector2(2, 1), Vector2(2, 2), Vector2(2, 3)],
        "S": [Vector2(0, 2), Vector2(1, 2), Vector2(2, 2), Vector2(3, 2)],
        "W": [Vector2(1, 0), Vector2(1, 1), Vector2(1, 2), Vector2(1, 3)]
    },
    "L": {
        "N": [Vector2(0, 1), Vector2(1, 1), Vector2(2, 0), Vector2(2, 1)],
        "E": [Vector2(2, 0), Vector2(2, 1), Vector2(2, 2), Vector2(3, 2)],
        "S": [Vector2(0, 2), Vector2(0, 3), Vector2(1, 2), Vector2(2, 2)],
        "W": [Vector2(0, 0), Vector2(1, 0), Vector2(1, 1), Vector2(1, 2)]
    },
    "J": {
        "N": [Vector2(1, 0), Vector2(1, 1), Vector2(2, 1), Vector2(3, 1)],
        "E": [Vector2(1, 0), Vector2(1, 1), Vector2(1, 2), Vector2(2, 0)],
        "S": [Vector2(1, 2), Vector2(2, 2), Vector2(3, 2), Vector2(3, 3)],
        "W": [Vector2(0, 2), Vector2(1, 0), Vector2(1, 1), Vector2(1, 2)]
    },
    "Z": {
        "W": [Vector2(1, 1), Vector2(1, 2), Vector2(2, 0), Vector2(2, 1)],
        "N": [Vector2(1, 1), Vector2(2, 1), Vector2(2, 2), Vector2(3, 2)],
        "E": [Vector2(1, 2), Vector2(1, 3), Vector2(2, 1), Vector2(2, 2)],
        "S": [Vector2(1, 1), Vector2(2, 1), Vector2(2, 2), Vector2(3, 2)]
    },
    "S": {
        "W": [Vector2(1, 0), Vector2(1, 1), Vector2(2, 1), Vector2(2, 2)],
        "N": [Vector2(1, 2), Vector2(2, 1), Vector2(2, 2), Vector2(3, 1)],
        "E": [Vector2(1, 1), Vector2(1, 2), Vector2(2, 2), Vector2(2, 3)],
        "S": [Vector2(0, 2), Vector2(1, 1), Vector2(1, 2), Vector2(2, 1)]
    },
    "T": {
        "N": [Vector2(1, 1), Vector2(2, 0), Vector2(2, 1), Vector2(3, 1)],
        "E": [Vector2(2, 0), Vector2(2, 1), Vector2(2, 2), Vector2(3, 1)],
        "S": [Vector2(1, 1), Vector2(2, 1), Vector2(2, 2), Vector2(3, 1)],
        "W": [Vector2(1, 1), Vector2(2, 0), Vector2(2, 1), Vector2(2, 2)]
    }
}