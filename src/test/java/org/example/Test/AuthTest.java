package org.example.Test;

import org.example.Application;
import org.junit.jupiter.api.Test;

public class AuthTest extends Application {

    @Test
    void authTest() {
        app.getLogin().login();
    }
}
