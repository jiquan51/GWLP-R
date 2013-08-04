
package gwlpr.protocol.loginserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P023_Unknown
    extends GWMessage
{

    @IsArray(constant = false, size = 4096, prefixLength = 2)
    private byte[] unknown1;

    @Override
    public short getHeader() {
        return  23;
    }

    public void setUnknown1(byte[] unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P023_Unknown[");
        sb.append("unknown1=").append(Arrays.toString(this.unknown1)).append("]");
        return sb.toString();
    }

}
