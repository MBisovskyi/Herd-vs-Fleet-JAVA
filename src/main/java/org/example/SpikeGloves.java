package org.example;

public class SpikeGloves extends Weapon{
    public SpikeGloves() {
        super("Spike Gloves", (int)Math.floor(Math.random()*(65-30+1)+30), 15);
    }
}
