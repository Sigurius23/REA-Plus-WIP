package live.hms.video.connection.degredation;

import hms.webrtc.RTCStats;
import java.math.BigInteger;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/connection/degredation/ConnectionInfo;", "Llive/hms/video/connection/degredation/WebrtcStats;", "<init>", "()V", "PacketLossTracks", "PublishConnection", "SubscribeConnection", "Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;", "Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class ConnectionInfo extends WebrtcStats {

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;", "", "ssrc", "", "packetLoss", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;)V", "getSsrc", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPacketLoss", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;)Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PacketLossTracks {
        private final Integer packetLoss;
        private final Long ssrc;

        public PacketLossTracks(Long l7, Integer num) {
            this.ssrc = l7;
            this.packetLoss = num;
        }

        public static /* synthetic */ PacketLossTracks copy$default(PacketLossTracks packetLossTracks, Long l7, Integer num, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                l7 = packetLossTracks.ssrc;
            }
            if ((i13 & 2) != 0) {
                num = packetLossTracks.packetLoss;
            }
            return packetLossTracks.copy(l7, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getSsrc() {
            return this.ssrc;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getPacketLoss() {
            return this.packetLoss;
        }

        public final PacketLossTracks copy(Long ssrc, Integer packetLoss) {
            return new PacketLossTracks(ssrc, packetLoss);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PacketLossTracks)) {
                return false;
            }
            PacketLossTracks packetLossTracks = (PacketLossTracks) other;
            return AbstractC22676k.m65745e(this.ssrc, packetLossTracks.ssrc) && AbstractC22676k.m65745e(this.packetLoss, packetLossTracks.packetLoss);
        }

        public final Integer getPacketLoss() {
            return this.packetLoss;
        }

        public final Long getSsrc() {
            return this.ssrc;
        }

        public int hashCode() {
            Long l7 = this.ssrc;
            int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
            Integer num = this.packetLoss;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "PacketLossTracks(ssrc=" + this.ssrc + ", packetLoss=" + this.packetLoss + ')';
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006*"}, m65681d2 = {"Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;", "Llive/hms/video/connection/degredation/ConnectionInfo;", "bytesSent", "Ljava/math/BigInteger;", "availableOutgoingBitrate", "", "totalRoundTripTime", "currentRoundTripTime", "packetsSent", "<init>", "(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)V", "getBytesSent", "()Ljava/math/BigInteger;", "setBytesSent", "(Ljava/math/BigInteger;)V", "getAvailableOutgoingBitrate", "()Ljava/lang/Double;", "setAvailableOutgoingBitrate", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTotalRoundTripTime", "setTotalRoundTripTime", "getCurrentRoundTripTime", "setCurrentRoundTripTime", "getPacketsSent", "setPacketsSent", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class PublishConnection extends ConnectionInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String PUBLISH_CONNECTION = "PUBLISH_CONNECTION";
        private Double availableOutgoingBitrate;
        private BigInteger bytesSent;
        private Double currentRoundTripTime;
        private BigInteger packetsSent;
        private Double totalRoundTripTime;

        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m65681d2 = {"Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection$Companion;", "", "<init>", "()V", "PUBLISH_CONNECTION", "", "getPUBLISH_CONNECTION", "()Ljava/lang/String;", "from", "Llive/hms/video/connection/degredation/ConnectionInfo$PublishConnection;", "publishInfo", "Lhms/webrtc/RTCStats;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PublishConnection from(RTCStats publishInfo) {
                AbstractC22676k.m65750j(publishInfo, "publishInfo");
                Map<String, Object> members = publishInfo.getMembers();
                return new PublishConnection((BigInteger) members.get("bytesSent"), (Double) members.get("availableOutgoingBitrate"), (Double) members.get("totalRoundTripTime"), (Double) members.get("currentRoundTripTime"), (BigInteger) members.get("packetsSent"));
            }

            public final String getPUBLISH_CONNECTION() {
                return PublishConnection.PUBLISH_CONNECTION;
            }

            private Companion() {
            }
        }

        public PublishConnection(BigInteger bigInteger, Double d3, Double d14, Double d15, BigInteger bigInteger2) {
            super(null);
            this.bytesSent = bigInteger;
            this.availableOutgoingBitrate = d3;
            this.totalRoundTripTime = d14;
            this.currentRoundTripTime = d15;
            this.packetsSent = bigInteger2;
        }

        public static /* synthetic */ PublishConnection copy$default(PublishConnection publishConnection, BigInteger bigInteger, Double d3, Double d14, Double d15, BigInteger bigInteger2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                bigInteger = publishConnection.bytesSent;
            }
            if ((i13 & 2) != 0) {
                d3 = publishConnection.availableOutgoingBitrate;
            }
            if ((i13 & 4) != 0) {
                d14 = publishConnection.totalRoundTripTime;
            }
            if ((i13 & 8) != 0) {
                d15 = publishConnection.currentRoundTripTime;
            }
            if ((i13 & 16) != 0) {
                bigInteger2 = publishConnection.packetsSent;
            }
            BigInteger bigInteger3 = bigInteger2;
            Double d16 = d14;
            return publishConnection.copy(bigInteger, d3, d16, d15, bigInteger3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BigInteger getBytesSent() {
            return this.bytesSent;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Double getAvailableOutgoingBitrate() {
            return this.availableOutgoingBitrate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Double getTotalRoundTripTime() {
            return this.totalRoundTripTime;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Double getCurrentRoundTripTime() {
            return this.currentRoundTripTime;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BigInteger getPacketsSent() {
            return this.packetsSent;
        }

        public final PublishConnection copy(BigInteger bytesSent, Double availableOutgoingBitrate, Double totalRoundTripTime, Double currentRoundTripTime, BigInteger packetsSent) {
            return new PublishConnection(bytesSent, availableOutgoingBitrate, totalRoundTripTime, currentRoundTripTime, packetsSent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PublishConnection)) {
                return false;
            }
            PublishConnection publishConnection = (PublishConnection) other;
            return AbstractC22676k.m65745e(this.bytesSent, publishConnection.bytesSent) && AbstractC22676k.m65745e(this.availableOutgoingBitrate, publishConnection.availableOutgoingBitrate) && AbstractC22676k.m65745e(this.totalRoundTripTime, publishConnection.totalRoundTripTime) && AbstractC22676k.m65745e(this.currentRoundTripTime, publishConnection.currentRoundTripTime) && AbstractC22676k.m65745e(this.packetsSent, publishConnection.packetsSent);
        }

        public final Double getAvailableOutgoingBitrate() {
            return this.availableOutgoingBitrate;
        }

        public final BigInteger getBytesSent() {
            return this.bytesSent;
        }

        public final Double getCurrentRoundTripTime() {
            return this.currentRoundTripTime;
        }

        public final BigInteger getPacketsSent() {
            return this.packetsSent;
        }

        public final Double getTotalRoundTripTime() {
            return this.totalRoundTripTime;
        }

        public int hashCode() {
            BigInteger bigInteger = this.bytesSent;
            int iHashCode = (bigInteger == null ? 0 : bigInteger.hashCode()) * 31;
            Double d3 = this.availableOutgoingBitrate;
            int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
            Double d14 = this.totalRoundTripTime;
            int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.currentRoundTripTime;
            int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
            BigInteger bigInteger2 = this.packetsSent;
            return iHashCode4 + (bigInteger2 != null ? bigInteger2.hashCode() : 0);
        }

        public final void setAvailableOutgoingBitrate(Double d3) {
            this.availableOutgoingBitrate = d3;
        }

        public final void setBytesSent(BigInteger bigInteger) {
            this.bytesSent = bigInteger;
        }

        public final void setCurrentRoundTripTime(Double d3) {
            this.currentRoundTripTime = d3;
        }

        public final void setPacketsSent(BigInteger bigInteger) {
            this.packetsSent = bigInteger;
        }

        public final void setTotalRoundTripTime(Double d3) {
            this.totalRoundTripTime = d3;
        }

        public String toString() {
            return "PublishConnection(bytesSent=" + this.bytesSent + ", availableOutgoingBitrate=" + this.availableOutgoingBitrate + ", totalRoundTripTime=" + this.totalRoundTripTime + ", currentRoundTripTime=" + this.currentRoundTripTime + ", packetsSent=" + this.packetsSent + ')';
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006*"}, m65681d2 = {"Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;", "Llive/hms/video/connection/degredation/ConnectionInfo;", "bytesReceived", "Ljava/math/BigInteger;", "availableIncomingBitrate", "", "totalRoundTripTime", "currentRoundTripTime", "packetsReceived", "<init>", "(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)V", "getBytesReceived", "()Ljava/math/BigInteger;", "setBytesReceived", "(Ljava/math/BigInteger;)V", "getAvailableIncomingBitrate", "()Ljava/lang/Double;", "setAvailableIncomingBitrate", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTotalRoundTripTime", "setTotalRoundTripTime", "getCurrentRoundTripTime", "setCurrentRoundTripTime", "getPacketsReceived", "setPacketsReceived", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;)Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class SubscribeConnection extends ConnectionInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String SUBSCRIBE_CONNECTION = "SUBSCRIBE-CONNECTION";
        private Double availableIncomingBitrate;
        private BigInteger bytesReceived;
        private Double currentRoundTripTime;
        private BigInteger packetsReceived;
        private Double totalRoundTripTime;

        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m65681d2 = {"Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection$Companion;", "", "<init>", "()V", "SUBSCRIBE_CONNECTION", "", "getSUBSCRIBE_CONNECTION", "()Ljava/lang/String;", "from", "Llive/hms/video/connection/degredation/ConnectionInfo$SubscribeConnection;", "subscribeInfo", "Lhms/webrtc/RTCStats;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SubscribeConnection from(RTCStats subscribeInfo) {
                AbstractC22676k.m65750j(subscribeInfo, "subscribeInfo");
                Map<String, Object> members = subscribeInfo.getMembers();
                return new SubscribeConnection((BigInteger) members.get("bytesReceived"), (Double) members.get("availableIncomingBitrate"), (Double) members.get("totalRoundTripTime"), (Double) members.get("currentRoundTripTime"), (BigInteger) members.get("packetsReceived"));
            }

            public final String getSUBSCRIBE_CONNECTION() {
                return SubscribeConnection.SUBSCRIBE_CONNECTION;
            }

            private Companion() {
            }
        }

        public SubscribeConnection(BigInteger bigInteger, Double d3, Double d14, Double d15, BigInteger bigInteger2) {
            super(null);
            this.bytesReceived = bigInteger;
            this.availableIncomingBitrate = d3;
            this.totalRoundTripTime = d14;
            this.currentRoundTripTime = d15;
            this.packetsReceived = bigInteger2;
        }

        public static /* synthetic */ SubscribeConnection copy$default(SubscribeConnection subscribeConnection, BigInteger bigInteger, Double d3, Double d14, Double d15, BigInteger bigInteger2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                bigInteger = subscribeConnection.bytesReceived;
            }
            if ((i13 & 2) != 0) {
                d3 = subscribeConnection.availableIncomingBitrate;
            }
            if ((i13 & 4) != 0) {
                d14 = subscribeConnection.totalRoundTripTime;
            }
            if ((i13 & 8) != 0) {
                d15 = subscribeConnection.currentRoundTripTime;
            }
            if ((i13 & 16) != 0) {
                bigInteger2 = subscribeConnection.packetsReceived;
            }
            BigInteger bigInteger3 = bigInteger2;
            Double d16 = d14;
            return subscribeConnection.copy(bigInteger, d3, d16, d15, bigInteger3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BigInteger getBytesReceived() {
            return this.bytesReceived;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Double getAvailableIncomingBitrate() {
            return this.availableIncomingBitrate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Double getTotalRoundTripTime() {
            return this.totalRoundTripTime;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Double getCurrentRoundTripTime() {
            return this.currentRoundTripTime;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final BigInteger getPacketsReceived() {
            return this.packetsReceived;
        }

        public final SubscribeConnection copy(BigInteger bytesReceived, Double availableIncomingBitrate, Double totalRoundTripTime, Double currentRoundTripTime, BigInteger packetsReceived) {
            return new SubscribeConnection(bytesReceived, availableIncomingBitrate, totalRoundTripTime, currentRoundTripTime, packetsReceived);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubscribeConnection)) {
                return false;
            }
            SubscribeConnection subscribeConnection = (SubscribeConnection) other;
            return AbstractC22676k.m65745e(this.bytesReceived, subscribeConnection.bytesReceived) && AbstractC22676k.m65745e(this.availableIncomingBitrate, subscribeConnection.availableIncomingBitrate) && AbstractC22676k.m65745e(this.totalRoundTripTime, subscribeConnection.totalRoundTripTime) && AbstractC22676k.m65745e(this.currentRoundTripTime, subscribeConnection.currentRoundTripTime) && AbstractC22676k.m65745e(this.packetsReceived, subscribeConnection.packetsReceived);
        }

        public final Double getAvailableIncomingBitrate() {
            return this.availableIncomingBitrate;
        }

        public final BigInteger getBytesReceived() {
            return this.bytesReceived;
        }

        public final Double getCurrentRoundTripTime() {
            return this.currentRoundTripTime;
        }

        public final BigInteger getPacketsReceived() {
            return this.packetsReceived;
        }

        public final Double getTotalRoundTripTime() {
            return this.totalRoundTripTime;
        }

        public int hashCode() {
            BigInteger bigInteger = this.bytesReceived;
            int iHashCode = (bigInteger == null ? 0 : bigInteger.hashCode()) * 31;
            Double d3 = this.availableIncomingBitrate;
            int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
            Double d14 = this.totalRoundTripTime;
            int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.currentRoundTripTime;
            int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
            BigInteger bigInteger2 = this.packetsReceived;
            return iHashCode4 + (bigInteger2 != null ? bigInteger2.hashCode() : 0);
        }

        public final void setAvailableIncomingBitrate(Double d3) {
            this.availableIncomingBitrate = d3;
        }

        public final void setBytesReceived(BigInteger bigInteger) {
            this.bytesReceived = bigInteger;
        }

        public final void setCurrentRoundTripTime(Double d3) {
            this.currentRoundTripTime = d3;
        }

        public final void setPacketsReceived(BigInteger bigInteger) {
            this.packetsReceived = bigInteger;
        }

        public final void setTotalRoundTripTime(Double d3) {
            this.totalRoundTripTime = d3;
        }

        public String toString() {
            return "SubscribeConnection(bytesReceived=" + this.bytesReceived + ", availableIncomingBitrate=" + this.availableIncomingBitrate + ", totalRoundTripTime=" + this.totalRoundTripTime + ", currentRoundTripTime=" + this.currentRoundTripTime + ", packetsReceived=" + this.packetsReceived + ')';
        }
    }

    public /* synthetic */ ConnectionInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConnectionInfo() {
        super(null);
    }
}
