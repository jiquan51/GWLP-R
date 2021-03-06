
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P465_PartySearchSize
    extends GWMessage
{

    private int localID;
    private short partySize;
    private short heroes;

    @Override
    public short getHeader() {
        return  465;
    }

    public void setLocalID(int localID) {
        this.localID = localID;
    }

    public void setPartySize(short partySize) {
        this.partySize = partySize;
    }

    public void setHeroes(short heroes) {
        this.heroes = heroes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P465_PartySearchSize[");
        sb.append("localID=").append(this.localID).append(",partySize=").append(this.partySize).append(",heroes=").append(this.heroes).append("]");
        return sb.toString();
    }

}
