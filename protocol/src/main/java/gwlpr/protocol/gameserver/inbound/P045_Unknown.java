
package gwlpr.protocol.gameserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P045_Unknown
    extends GWMessage
{

    private long unknown1;
    private short unknown2;
    @IsArray(constant = false, size = 4, prefixLength = 2)
    private P045_Unknown.NestedUnknown3 [] unknown3;

    @Override
    public short getHeader() {
        return  45;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public short getUnknown2() {
        return unknown2;
    }

    public P045_Unknown.NestedUnknown3 [] getUnknown3() {
        return unknown3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P045_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(Arrays.toString(this.unknown3)).append("]");
        return sb.toString();
    }

    public final static class NestedUnknown3
        implements NestedMarker
    {

        private long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown3[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
