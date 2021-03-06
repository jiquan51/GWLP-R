
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P391_InstanceLoadSpawnPoint
    extends GWMessage
{

    private long mapFile;
    private Vector2 position;
    private int plane;
    private short unknown1;
    private short isCinematic;

    @Override
    public short getHeader() {
        return  391;
    }

    public void setMapFile(long mapFile) {
        this.mapFile = mapFile;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setPlane(int plane) {
        this.plane = plane;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

    public void setIsCinematic(short isCinematic) {
        this.isCinematic = isCinematic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P391_InstanceLoadSpawnPoint[");
        sb.append("mapFile=").append(this.mapFile).append(",position=").append(this.position.toString()).append(",plane=").append(this.plane).append(",unknown1=").append(this.unknown1).append(",isCinematic=").append(this.isCinematic).append("]");
        return sb.toString();
    }

}
