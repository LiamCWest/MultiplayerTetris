import grpc
from generated import tetris_pb2, tetris_pb2_grpc

class API:
    def __init__(self, server_address):
        # Initialize channel and stub
        self.channel = grpc.insecure_channel(server_address)
        self.stub = tetris_pb2_grpc.TetrisStub(self.channel)

    def connect(self, request):
        # Call the RPC method on the stub
        response = self.stub.Connect(request)
        return response
    
    def disconnect(self, request):
        # Call the RPC method on the stub
        response = self.stub.Disconnect(request)
        return response
    
    def newGame(self, request):
        # Call the RPC method on the stub
        response = self.stub.NewGame(request)
        return response

    def joinGame(self, request):
        # Call the RPC method on the stub
        response = self.stub.JoinGame(request)
        return response
    
    def movePiece(self, request):
        # Call the RPC method on the stub
        response = self.stub.MovePiece(request)
        return response
    
    def updateGame(self, request):
        # Call the RPC method on the stub
        response = self.stub.UpdateGame(request)
        return response