package org.mockito.exceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class MockitoAssertionErrorTest {

    private void throwIt() {
        throw new MockitoAssertionError("boom");
    }
    
    @Test
    public void shouldKeepUnfilteredStackTrace() {
        try {
            throwIt();
            fail();
        } catch (MockitoAssertionError e) {
            assertEquals("throwIt", e.getUnfilteredStackTrace()[0].getMethodName());
        }
    }
}