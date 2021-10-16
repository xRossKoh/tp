package seedu.duke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlashCardCategoryManagerTest {

    @Test
    public void trimToPass_enterValidAddLine_success() {
        String input = "1 /fro good morning /bac ohayo";
        assertEquals("good morning /bac ohayo", FlashCardCategoryManager.trimToPass(input, "/fro"));

    }
}