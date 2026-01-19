package dev.hytalemodding.shared.protocol;

import java.util.UUID;

public class S2CMarkerCreatedPacket implements MarkerPacket {
    public UUID markerId;
    public UUID owner;
    public String name;
    public String iconId;
    public double x;
    public double y;
    public double z;
}
