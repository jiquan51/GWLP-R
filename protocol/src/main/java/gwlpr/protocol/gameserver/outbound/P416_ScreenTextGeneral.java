
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P416_ScreenTextGeneral
    extends GWMessage
{

    private String text;

    @Override
    public short getHeader() {
        return  416;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P416_ScreenTextGeneral[");
        sb.append("text=").append(this.text.toString()).append("]");
        return sb.toString();
    }

}
