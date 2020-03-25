package chess.domain.piece.exception;

public class NotMovableException extends RuntimeException {
    private static final String NOT_MOVABLE_MESSAGE = "이동 가능한 위치가 아닙니다.";

    public NotMovableException() {
        super(NOT_MOVABLE_MESSAGE);
    }

    public NotMovableException(String message) {
        super(message);
    }
}
