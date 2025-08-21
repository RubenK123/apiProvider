package com.example.apiProvider;

import java.util.UUID;

public class ApiKeyGen {
    public static String generateApiKey() {
        return UUID.randomUUID().toString();  // e.g., "3f1c2e48-0a7d-4b12-b8c1-2c4e1b5f7a9f"
    }
}
