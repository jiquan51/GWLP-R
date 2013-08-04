
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P046_Unknown
    extends GWMessage
{

    private long unknown1;
    private short unknown2;
    private long unknown3;

    @Override
    public short getHeader() {
        return  46;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public short getUnknown2() {
        return unknown2;
    }

    public long getUnknown3() {
        return unknown3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P046_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append("]");
        return sb.toString();
    }

}
