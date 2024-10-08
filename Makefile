# Define the source and output directories
SRC_DIR = src/main/java
OUT_DIR = target/classes

# List of Java source files
SOURCES = \
    $(SRC_DIR)/com/chess/runner/Game.java \
    $(SRC_DIR)/com/chess/board/Board.java \
    $(SRC_DIR)/com/chess/common/File.java \
    $(SRC_DIR)/com/chess/common/Location.java \
    $(SRC_DIR)/com/chess/piece/Bishop.java \
    $(SRC_DIR)/com/chess/piece/King.java \
    $(SRC_DIR)/com/chess/piece/Knight.java \
    $(SRC_DIR)/com/chess/piece/Move.java \
    $(SRC_DIR)/com/chess/piece/Pawn.java \
    $(SRC_DIR)/com/chess/piece/Piece.java \
    $(SRC_DIR)/com/chess/piece/PieceType.java \
    $(SRC_DIR)/com/chess/piece/Queen.java \
    $(SRC_DIR)/com/chess/piece/Rook.java \
    $(SRC_DIR)/com/chess/piece/TestPiece.java

# Corresponding class files
CLASSES = $(patsubst $(SRC_DIR)/%.java, $(OUT_DIR)/%.class, $(SOURCES))

# Main class to run
MAIN_CLASS = com.chess.runner.Game

# Default target
all: build

# Build the project
build: $(CLASSES)

# Pattern rule to compile Java files
$(OUT_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(OUT_DIR)/com/chess/runner
	@mkdir -p $(OUT_DIR)/com/chess/common
	@mkdir -p $(OUT_DIR)/com/chess/piece
	javac -d $(OUT_DIR) $(SOURCES)  # Compile all sources to the output directory

# Run the program
run: build
	java -cp $(OUT_DIR) $(MAIN_CLASS)

# Clean the output directory
clean:
	rm -rf target
