package live.hms.video.connection.degredation;

import hms.webrtc.RTCStats;
import java.math.BigInteger;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015Jz\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015¨\u0006/"}, m65681d2 = {"Llive/hms/video/connection/degredation/Peer;", "Llive/hms/video/connection/degredation/WebrtcStats;", "bytesSent", "Ljava/math/BigInteger;", "packetsSent", "bytesReceived", "packetsReceived", "totalRoundTripTime", "", "currentRoundTripTime", "availableOutgoingBitrate", "availableIncomingBitrate", "timestampUs", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getBytesSent", "()Ljava/math/BigInteger;", "getPacketsSent", "getBytesReceived", "getPacketsReceived", "getTotalRoundTripTime", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrentRoundTripTime", "getAvailableOutgoingBitrate", "getAvailableIncomingBitrate", "getTimestampUs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Llive/hms/video/connection/degredation/Peer;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Peer extends WebrtcStats {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String LOCAL_PEER = "LOCAL_PEER";
    private final Double availableIncomingBitrate;
    private final Double availableOutgoingBitrate;
    private final BigInteger bytesReceived;
    private final BigInteger bytesSent;
    private final Double currentRoundTripTime;
    private final BigInteger packetsReceived;
    private final BigInteger packetsSent;
    private final Double timestampUs;
    private final Double totalRoundTripTime;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m65681d2 = {"Llive/hms/video/connection/degredation/Peer$Companion;", "", "<init>", "()V", "LOCAL_PEER", "", "getLOCAL_PEER", "()Ljava/lang/String;", "from", "Llive/hms/video/connection/degredation/Peer;", "transportInfo", "Lhms/webrtc/RTCStats;", "icePairInfo", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Peer from(RTCStats transportInfo, RTCStats icePairInfo) {
            AbstractC22676k.m65750j(transportInfo, "transportInfo");
            AbstractC22676k.m65750j(icePairInfo, "icePairInfo");
            double timestampUs = transportInfo.getTimestampUs();
            Map<String, Object> members = icePairInfo.getMembers();
            return new Peer((BigInteger) members.get("bytesSent"), (BigInteger) transportInfo.getMembers().get("packetsSent"), (BigInteger) members.get("bytesReceived"), (BigInteger) transportInfo.getMembers().get("packetsReceived"), (Double) members.get("totalRoundTripTime"), (Double) members.get("currentRoundTripTime"), (Double) members.get("availableOutgoingBitrate"), (Double) members.get("availableIncomingBitrate"), Double.valueOf(timestampUs));
        }

        public final String getLOCAL_PEER() {
            return Peer.LOCAL_PEER;
        }

        private Companion() {
        }
    }

    public Peer(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, Double d3, Double d14, Double d15, Double d16, Double d17) {
        super(null);
        this.bytesSent = bigInteger;
        this.packetsSent = bigInteger2;
        this.bytesReceived = bigInteger3;
        this.packetsReceived = bigInteger4;
        this.totalRoundTripTime = d3;
        this.currentRoundTripTime = d14;
        this.availableOutgoingBitrate = d15;
        this.availableIncomingBitrate = d16;
        this.timestampUs = d17;
    }

    public static /* synthetic */ Peer copy$default(Peer peer, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, Double d3, Double d14, Double d15, Double d16, Double d17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bigInteger = peer.bytesSent;
        }
        if ((i13 & 2) != 0) {
            bigInteger2 = peer.packetsSent;
        }
        if ((i13 & 4) != 0) {
            bigInteger3 = peer.bytesReceived;
        }
        if ((i13 & 8) != 0) {
            bigInteger4 = peer.packetsReceived;
        }
        if ((i13 & 16) != 0) {
            d3 = peer.totalRoundTripTime;
        }
        if ((i13 & 32) != 0) {
            d14 = peer.currentRoundTripTime;
        }
        if ((i13 & 64) != 0) {
            d15 = peer.availableOutgoingBitrate;
        }
        if ((i13 & 128) != 0) {
            d16 = peer.availableIncomingBitrate;
        }
        if ((i13 & 256) != 0) {
            d17 = peer.timestampUs;
        }
        Double d18 = d16;
        Double d19 = d17;
        Double d24 = d14;
        Double d25 = d15;
        Double d26 = d3;
        BigInteger bigInteger5 = bigInteger3;
        return peer.copy(bigInteger, bigInteger2, bigInteger5, bigInteger4, d26, d24, d25, d18, d19);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigInteger getBytesSent() {
        return this.bytesSent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigInteger getPacketsSent() {
        return this.packetsSent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigInteger getBytesReceived() {
        return this.bytesReceived;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigInteger getPacketsReceived() {
        return this.packetsReceived;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getTotalRoundTripTime() {
        return this.totalRoundTripTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getCurrentRoundTripTime() {
        return this.currentRoundTripTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getAvailableOutgoingBitrate() {
        return this.availableOutgoingBitrate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getAvailableIncomingBitrate() {
        return this.availableIncomingBitrate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getTimestampUs() {
        return this.timestampUs;
    }

    public final Peer copy(BigInteger bytesSent, BigInteger packetsSent, BigInteger bytesReceived, BigInteger packetsReceived, Double totalRoundTripTime, Double currentRoundTripTime, Double availableOutgoingBitrate, Double availableIncomingBitrate, Double timestampUs) {
        return new Peer(bytesSent, packetsSent, bytesReceived, packetsReceived, totalRoundTripTime, currentRoundTripTime, availableOutgoingBitrate, availableIncomingBitrate, timestampUs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Peer)) {
            return false;
        }
        Peer peer = (Peer) other;
        return AbstractC22676k.m65745e(this.bytesSent, peer.bytesSent) && AbstractC22676k.m65745e(this.packetsSent, peer.packetsSent) && AbstractC22676k.m65745e(this.bytesReceived, peer.bytesReceived) && AbstractC22676k.m65745e(this.packetsReceived, peer.packetsReceived) && AbstractC22676k.m65745e(this.totalRoundTripTime, peer.totalRoundTripTime) && AbstractC22676k.m65745e(this.currentRoundTripTime, peer.currentRoundTripTime) && AbstractC22676k.m65745e(this.availableOutgoingBitrate, peer.availableOutgoingBitrate) && AbstractC22676k.m65745e(this.availableIncomingBitrate, peer.availableIncomingBitrate) && AbstractC22676k.m65745e(this.timestampUs, peer.timestampUs);
    }

    public final Double getAvailableIncomingBitrate() {
        return this.availableIncomingBitrate;
    }

    public final Double getAvailableOutgoingBitrate() {
        return this.availableOutgoingBitrate;
    }

    public final BigInteger getBytesReceived() {
        return this.bytesReceived;
    }

    public final BigInteger getBytesSent() {
        return this.bytesSent;
    }

    public final Double getCurrentRoundTripTime() {
        return this.currentRoundTripTime;
    }

    public final BigInteger getPacketsReceived() {
        return this.packetsReceived;
    }

    public final BigInteger getPacketsSent() {
        return this.packetsSent;
    }

    public final Double getTimestampUs() {
        return this.timestampUs;
    }

    public final Double getTotalRoundTripTime() {
        return this.totalRoundTripTime;
    }

    public int hashCode() {
        BigInteger bigInteger = this.bytesSent;
        int iHashCode = (bigInteger == null ? 0 : bigInteger.hashCode()) * 31;
        BigInteger bigInteger2 = this.packetsSent;
        int iHashCode2 = (iHashCode + (bigInteger2 == null ? 0 : bigInteger2.hashCode())) * 31;
        BigInteger bigInteger3 = this.bytesReceived;
        int iHashCode3 = (iHashCode2 + (bigInteger3 == null ? 0 : bigInteger3.hashCode())) * 31;
        BigInteger bigInteger4 = this.packetsReceived;
        int iHashCode4 = (iHashCode3 + (bigInteger4 == null ? 0 : bigInteger4.hashCode())) * 31;
        Double d3 = this.totalRoundTripTime;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.currentRoundTripTime;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.availableOutgoingBitrate;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.availableIncomingBitrate;
        int iHashCode8 = (iHashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.timestampUs;
        return iHashCode8 + (d17 != null ? d17.hashCode() : 0);
    }

    public String toString() {
        return "Peer(bytesSent=" + this.bytesSent + ", packetsSent=" + this.packetsSent + ", bytesReceived=" + this.bytesReceived + ", packetsReceived=" + this.packetsReceived + ", totalRoundTripTime=" + this.totalRoundTripTime + ", currentRoundTripTime=" + this.currentRoundTripTime + ", availableOutgoingBitrate=" + this.availableOutgoingBitrate + ", availableIncomingBitrate=" + this.availableIncomingBitrate + ", timestampUs=" + this.timestampUs + ')';
    }
}
