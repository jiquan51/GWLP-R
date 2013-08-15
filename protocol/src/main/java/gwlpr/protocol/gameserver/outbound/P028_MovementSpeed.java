
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P028_MovementSpeed
    extends GWMessage
{

    private long agent;
    private float speed;

    @Override
    public short getHeader() {
        return  28;
    }

    public void setAgent(long agent) {
        this.agent = agent;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P028_MovementSpeed[");
        sb.append("agent=").append(this.agent).append(",speed=").append(this.speed).append("]");
        return sb.toString();
    }

}