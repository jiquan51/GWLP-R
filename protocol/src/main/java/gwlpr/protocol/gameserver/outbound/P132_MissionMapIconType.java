
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P132_MissionMapIconType
    extends GWMessage
{

    private long localID;
    private long iconHash;

    @Override
    public short getHeader() {
        return  132;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    public void setIconHash(long iconHash) {
        this.iconHash = iconHash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P132_MissionMapIconType[");
        sb.append("localID=").append(this.localID).append(",iconHash=").append(this.iconHash).append("]");
        return sb.toString();
    }

}
