
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P317_WeaponBarItem
    extends GWMessage
{

    private int itemStreamID;
    private short slot;
    private long leadHand;
    private long offHand;

    @Override
    public short getHeader() {
        return  317;
    }

    public void setItemStreamID(int itemStreamID) {
        this.itemStreamID = itemStreamID;
    }

    public void setSlot(short slot) {
        this.slot = slot;
    }

    public void setLeadHand(long leadHand) {
        this.leadHand = leadHand;
    }

    public void setOffHand(long offHand) {
        this.offHand = offHand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P317_WeaponBarItem[");
        sb.append("itemStreamID=").append(this.itemStreamID).append(",slot=").append(this.slot).append(",leadHand=").append(this.leadHand).append(",offHand=").append(this.offHand).append("]");
        return sb.toString();
    }

}
