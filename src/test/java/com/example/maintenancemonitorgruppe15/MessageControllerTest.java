package com.example.maintenancemonitorgruppe15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageControllerTest {

    @Test
    void showMessage() { //test1  shows the correct message gets returned
            MessageController mCont = new MessageController();
            assertEquals("Everything works as expected", mCont.showMessage());
    }
}