package com.example;

import net.minecraft.client.Minecraft;

public final class ExampleMod {
    public static final String MOD_ID = "examplemod";

    public static void init() {
        // Write common init code here.
        Minecraft.getInstance();
    }
}
