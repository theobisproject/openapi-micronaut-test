package com.example;

import com.example.openapi.api.DefaultApi;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

@MicronautTest
class DefaultApiTest {

    @Inject
    DefaultApi defaultApi;

    @Test
    void sendRequest() {
        defaultApi.fileAvailable("test-crc32", "test-sha512", 100L);
    }

}
