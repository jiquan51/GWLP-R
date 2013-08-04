
package gwlpr.protocol.gameserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P132_Unknown
    extends GWMessage
{

    private String unknown1;
    @IsArray(constant = true, size = 8, prefixLength = -1)
    private byte[] unknown2;

    @Override
    public short getHeader() {
        return  132;
    }

    public String getUnknown1() {
        return unknown1;
    }

    public byte[] getUnknown2() {
        return unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P132_Unknown[");
        sb.append("unknown1=").append(this.unknown1 .toString()).append(",unknown2=").append(Arrays.toString(this.unknown2)).append("]");
        return sb.toString();
    }

}
