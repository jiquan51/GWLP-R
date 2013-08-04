
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P135_AgentMinions
    extends GWMessage
{

    private long agent;
    private long amount;

    @Override
    public short getHeader() {
        return  135;
    }

    public void setAgent(long agent) {
        this.agent = agent;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P135_AgentMinions[");
        sb.append("agent=").append(this.agent).append(",amount=").append(this.amount).append("]");
        return sb.toString();
    }

}
