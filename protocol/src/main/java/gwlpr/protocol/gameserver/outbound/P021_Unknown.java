
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P021_Unknown
    extends GWMessage
{

    private long unknown1;
    private long unknown2;
    private short unknown3;
    private short unknown4;
    private Vector2 unknown5;
    private int unknown6;
    private Vector2 unknown7;
    private short unknown8;
    private float unknown9;
    private float unknown10;
    private long unknown11;
    private long unknown12;
    private long unknown13;
    private long unknown14;
    private long unknown15;
    private long unknown16;
    private long unknown17;
    private Vector2 unknown18;
    private Vector2 unknown19;
    private int unknown20;
    private long unknown21;
    private Vector2 unknown22;
    private int unknown23;

    @Override
    public short getHeader() {
        return  21;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(short unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(short unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(Vector2 unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(int unknown6) {
        this.unknown6 = unknown6;
    }

    public void setUnknown7(Vector2 unknown7) {
        this.unknown7 = unknown7;
    }

    public void setUnknown8(short unknown8) {
        this.unknown8 = unknown8;
    }

    public void setUnknown9(float unknown9) {
        this.unknown9 = unknown9;
    }

    public void setUnknown10(float unknown10) {
        this.unknown10 = unknown10;
    }

    public void setUnknown11(long unknown11) {
        this.unknown11 = unknown11;
    }

    public void setUnknown12(long unknown12) {
        this.unknown12 = unknown12;
    }

    public void setUnknown13(long unknown13) {
        this.unknown13 = unknown13;
    }

    public void setUnknown14(long unknown14) {
        this.unknown14 = unknown14;
    }

    public void setUnknown15(long unknown15) {
        this.unknown15 = unknown15;
    }

    public void setUnknown16(long unknown16) {
        this.unknown16 = unknown16;
    }

    public void setUnknown17(long unknown17) {
        this.unknown17 = unknown17;
    }

    public void setUnknown18(Vector2 unknown18) {
        this.unknown18 = unknown18;
    }

    public void setUnknown19(Vector2 unknown19) {
        this.unknown19 = unknown19;
    }

    public void setUnknown20(int unknown20) {
        this.unknown20 = unknown20;
    }

    public void setUnknown21(long unknown21) {
        this.unknown21 = unknown21;
    }

    public void setUnknown22(Vector2 unknown22) {
        this.unknown22 = unknown22;
    }

    public void setUnknown23(int unknown23) {
        this.unknown23 = unknown23;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P021_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5 .toString()).append(",unknown6=").append(this.unknown6).append(",unknown7=").append(this.unknown7 .toString()).append(",unknown8=").append(this.unknown8).append(",unknown9=").append(this.unknown9).append(",unknown10=").append(this.unknown10).append(",unknown11=").append(this.unknown11).append(",unknown12=").append(this.unknown12).append(",unknown13=").append(this.unknown13).append(",unknown14=").append(this.unknown14).append(",unknown15=").append(this.unknown15).append(",unknown16=").append(this.unknown16).append(",unknown17=").append(this.unknown17).append(",unknown18=").append(this.unknown18 .toString()).append(",unknown19=").append(this.unknown19 .toString()).append(",unknown20=").append(this.unknown20).append(",unknown21=").append(this.unknown21).append(",unknown22=").append(this.unknown22 .toString()).append(",unknown23=").append(this.unknown23).append("]");
        return sb.toString();
    }

}
