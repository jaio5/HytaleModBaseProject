package dev.hytalemodding.shared.protocol;

public class C2SCreateMarkerPacket implements MarkerPacket{

    public String name;
    public String iconId;
    public double x;
    public double y;
    public double z;

    public C2SCreateMarkerPacket(){}

    public C2SCreateMarkerPacket(
            String name,
            String iconId,
            double x,
            double y,
            double z
    ){
        this.name = name;
        this.iconId= iconId;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
