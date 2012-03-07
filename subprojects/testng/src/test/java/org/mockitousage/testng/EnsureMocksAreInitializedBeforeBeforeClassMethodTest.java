package org.mockitousage.testng;

import org.junit.BeforeClass;
import org.mockito.Mock;
import org.mockito.testng.MockitoTestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Observer;

import static org.fest.assertions.Assertions.assertThat;

@Listeners(MockitoTestNGListener.class)
public class EnsureMocksAreInitializedBeforeBeforeClassMethodTest {
    
    @Mock Observer observer;

    @BeforeClass
    private void make_sure_mock_is_initialized() {
        assertThat(observer).isNotNull();
    }

    @Test
    public void dummy_test_see_BeforeClass_code() throws Exception {
    }
}