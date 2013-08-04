
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P225_UpdateMaxImperialFaction
    extends GWMessage
{

    private long maxFaction;

    @Override
    public short getHeader() {
        return  225;
    }

    public void setMaxFaction(long maxFaction) {
        this.maxFaction = maxFaction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P225_UpdateMaxImperialFaction[");
        sb.append("maxFaction=").append(this.maxFaction).append("]");
        return sb.toString();
    }

}
