
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P389_ChallengeRecordsDisplay
    extends GWMessage
{

    private int mission;
    private short type;

    @Override
    public short getHeader() {
        return  389;
    }

    public void setMission(int mission) {
        this.mission = mission;
    }

    public void setType(short type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P389_ChallengeRecordsDisplay[");
        sb.append("mission=").append(this.mission).append(",type=").append(this.type).append("]");
        return sb.toString();
    }

}