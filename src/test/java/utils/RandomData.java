package utils;

import java.util.UUID;

public class RandomData {

    public static String randomInvalidPassword() {
        return "wrong-" + UUID.randomUUID();
    }
}