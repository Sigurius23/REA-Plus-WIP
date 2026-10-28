package live.hms.video.connection.degredation;

import hms.webrtc.RTCStats;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import live.hms.video.media.settings.HMSLayer;
import live.hms.video.media.settings.HMSVideoResolution;
import live.hms.video.utils.HMSUtils;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/connection/degredation/Track;", "Llive/hms/video/connection/degredation/WebrtcStats;", "<init>", "()V", "bytesTransported", "Ljava/math/BigInteger;", "getBytesTransported", "()Ljava/math/BigInteger;", "trackIdentifier", "", "getTrackIdentifier", "()Ljava/lang/String;", "remoteTimestamp", "", "getRemoteTimestamp", "()Ljava/lang/Double;", "LocalTrack", "Llive/hms/video/connection/degredation/RemoteTrack;", "Llive/hms/video/connection/degredation/Track$LocalTrack;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class Track extends WebrtcStats {

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/connection/degredation/Track$LocalTrack;", "Llive/hms/video/connection/degredation/Track;", "<init>", "()V", "ssrc", "", "getSsrc", "()Ljava/lang/Long;", "jitter", "", "getJitter", "()Ljava/lang/Double;", "packetLoss", "getPacketLoss", "()J", "setPacketLoss", "(J)V", "LocalAudio", "LocalVideo", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static abstract class LocalTrack extends Track {
        private long packetLoss;

        @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,BO\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019Jb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019¨\u0006-"}, m65681d2 = {"Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;", "Llive/hms/video/connection/degredation/Track$LocalTrack;", "jitter", "", "roundTripTime", "bytesTransported", "Ljava/math/BigInteger;", "remoteTimestamp", "trackIdentifier", "", "packetsSent", "", "ssrc", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getJitter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRoundTripTime", "getBytesTransported", "()Ljava/math/BigInteger;", "getRemoteTimestamp", "getTrackIdentifier", "()Ljava/lang/String;", "getPacketsSent", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSsrc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final /* data */ class LocalAudio extends LocalTrack {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BigInteger bytesTransported;
            private final Double jitter;
            private final Long packetsSent;
            private final Double remoteTimestamp;
            private final Double roundTripTime;
            private final Long ssrc;
            private final String trackIdentifier;

            @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;", "audioStat", "", "", "extraData", "Lhms/webrtc/RTCStats;", "candidatePairInfo", "primaryTimestamp", "", "localTracksJitter", "", "(Ljava/util/Map;Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;Ljava/lang/Double;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final LocalAudio from(Map<String, Object> audioStat, RTCStats extraData, RTCStats candidatePairInfo, Double primaryTimestamp, Map<Long, Double> localTracksJitter) {
                    Map<String, Object> members;
                    Map<String, Object> members2;
                    AbstractC22676k.m65750j(audioStat, "audioStat");
                    AbstractC22676k.m65750j(localTracksJitter, "localTracksJitter");
                    Object obj = null;
                    Double dValueOf = extraData != null ? Double.valueOf(extraData.getTimestampUs()) : null;
                    Long l7 = (Long) audioStat.get("ssrc");
                    Long l12 = l7 != null ? l7 : null;
                    Double d3 = l12 != null ? localTracksJitter.get(Long.valueOf(l12.longValue())) : null;
                    Double d14 = (Double) ((candidatePairInfo == null || (members2 = candidatePairInfo.getMembers()) == null) ? null : members2.get("currentRoundTripTime"));
                    BigInteger bigInteger = (BigInteger) audioStat.get("bytesSent");
                    if (extraData != null && (members = extraData.getMembers()) != null) {
                        obj = members.get("trackIdentifier");
                    }
                    return new LocalAudio(d3, d14, bigInteger, dValueOf, (String) obj, (Long) audioStat.get("packetsSent"), l12, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ LocalAudio(Double d3, Double d14, BigInteger bigInteger, Double d15, String str, Long l7, Long l12, DefaultConstructorMarker defaultConstructorMarker) {
                this(d3, d14, bigInteger, d15, str, l7, l12);
            }

            public static /* synthetic */ LocalAudio copy$default(LocalAudio localAudio, Double d3, Double d14, BigInteger bigInteger, Double d15, String str, Long l7, Long l12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    d3 = localAudio.jitter;
                }
                if ((i13 & 2) != 0) {
                    d14 = localAudio.roundTripTime;
                }
                if ((i13 & 4) != 0) {
                    bigInteger = localAudio.bytesTransported;
                }
                if ((i13 & 8) != 0) {
                    d15 = localAudio.remoteTimestamp;
                }
                if ((i13 & 16) != 0) {
                    str = localAudio.trackIdentifier;
                }
                if ((i13 & 32) != 0) {
                    l7 = localAudio.packetsSent;
                }
                if ((i13 & 64) != 0) {
                    l12 = localAudio.ssrc;
                }
                Long l13 = l7;
                Long l14 = l12;
                String str2 = str;
                BigInteger bigInteger2 = bigInteger;
                return localAudio.copy(d3, d14, bigInteger2, d15, str2, l13, l14);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Double getJitter() {
                return this.jitter;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Double getRoundTripTime() {
                return this.roundTripTime;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final BigInteger getBytesTransported() {
                return this.bytesTransported;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Double getRemoteTimestamp() {
                return this.remoteTimestamp;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getTrackIdentifier() {
                return this.trackIdentifier;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final Long getPacketsSent() {
                return this.packetsSent;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Long getSsrc() {
                return this.ssrc;
            }

            public final LocalAudio copy(Double jitter, Double roundTripTime, BigInteger bytesTransported, Double remoteTimestamp, String trackIdentifier, Long packetsSent, Long ssrc) {
                return new LocalAudio(jitter, roundTripTime, bytesTransported, remoteTimestamp, trackIdentifier, packetsSent, ssrc);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocalAudio)) {
                    return false;
                }
                LocalAudio localAudio = (LocalAudio) other;
                return AbstractC22676k.m65745e(this.jitter, localAudio.jitter) && AbstractC22676k.m65745e(this.roundTripTime, localAudio.roundTripTime) && AbstractC22676k.m65745e(this.bytesTransported, localAudio.bytesTransported) && AbstractC22676k.m65745e(this.remoteTimestamp, localAudio.remoteTimestamp) && AbstractC22676k.m65745e(this.trackIdentifier, localAudio.trackIdentifier) && AbstractC22676k.m65745e(this.packetsSent, localAudio.packetsSent) && AbstractC22676k.m65745e(this.ssrc, localAudio.ssrc);
            }

            @Override // live.hms.video.connection.degredation.Track
            public BigInteger getBytesTransported() {
                return this.bytesTransported;
            }

            @Override // live.hms.video.connection.degredation.Track.LocalTrack
            public Double getJitter() {
                return this.jitter;
            }

            public final Long getPacketsSent() {
                return this.packetsSent;
            }

            @Override // live.hms.video.connection.degredation.Track
            public Double getRemoteTimestamp() {
                return this.remoteTimestamp;
            }

            public final Double getRoundTripTime() {
                return this.roundTripTime;
            }

            @Override // live.hms.video.connection.degredation.Track.LocalTrack
            public Long getSsrc() {
                return this.ssrc;
            }

            @Override // live.hms.video.connection.degredation.Track
            public String getTrackIdentifier() {
                return this.trackIdentifier;
            }

            public int hashCode() {
                Double d3 = this.jitter;
                int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
                Double d14 = this.roundTripTime;
                int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
                BigInteger bigInteger = this.bytesTransported;
                int iHashCode3 = (iHashCode2 + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
                Double d15 = this.remoteTimestamp;
                int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
                String str = this.trackIdentifier;
                int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                Long l7 = this.packetsSent;
                int iHashCode6 = (iHashCode5 + (l7 == null ? 0 : l7.hashCode())) * 31;
                Long l12 = this.ssrc;
                return iHashCode6 + (l12 != null ? l12.hashCode() : 0);
            }

            public String toString() {
                return "LocalAudio(jitter=" + this.jitter + ", roundTripTime=" + this.roundTripTime + ", bytesTransported=" + this.bytesTransported + ", remoteTimestamp=" + this.remoteTimestamp + ", trackIdentifier=" + this.trackIdentifier + ", packetsSent=" + this.packetsSent + ", ssrc=" + this.ssrc + ')';
            }

            private LocalAudio(Double d3, Double d14, BigInteger bigInteger, Double d15, String str, Long l7, Long l12) {
                this.jitter = d3;
                this.roundTripTime = d14;
                this.bytesTransported = bigInteger;
                this.remoteTimestamp = d15;
                this.trackIdentifier = str;
                this.packetsSent = l7;
                this.ssrc = l12;
            }
        }

        @Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@Bu\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\t\u00104\u001a\u00020\u0011HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u0090\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b+\u0010%¨\u0006A"}, m65681d2 = {"Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;", "Llive/hms/video/connection/degredation/Track$LocalTrack;", "jitter", "", "roundTripTime", "bytesTransported", "Ljava/math/BigInteger;", "resolution", "Llive/hms/video/media/settings/HMSVideoResolution;", "frameRate", "", "trackIdentifier", "", "remoteTimestamp", "packetsSent", "", "qualityLimitations", "Llive/hms/video/connection/degredation/QualityLimitationReasons;", "hmsLayer", "Llive/hms/video/media/settings/HMSLayer;", "ssrc", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Number;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;)V", "getJitter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRoundTripTime", "getBytesTransported", "()Ljava/math/BigInteger;", "getResolution", "()Llive/hms/video/media/settings/HMSVideoResolution;", "getFrameRate", "()Ljava/lang/Number;", "getTrackIdentifier", "()Ljava/lang/String;", "getRemoteTimestamp", "getPacketsSent", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQualityLimitations", "()Llive/hms/video/connection/degredation/QualityLimitationReasons;", "getHmsLayer", "()Llive/hms/video/media/settings/HMSLayer;", "getSsrc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Number;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final /* data */ class LocalVideo extends LocalTrack {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BigInteger bytesTransported;
            private final Number frameRate;
            private final HMSLayer hmsLayer;
            private final Double jitter;
            private final Long packetsSent;
            private final QualityLimitationReasons qualityLimitations;
            private final Double remoteTimestamp;
            private final HMSVideoResolution resolution;
            private final Double roundTripTime;
            private final Long ssrc;
            private final String trackIdentifier;

            @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;", "videoStat", "", "", "extraData", "Lhms/webrtc/RTCStats;", "candidatePairInfo", "primaryTimestamp", "", "localTracksJitter", "", "(Ljava/util/Map;Lhms/webrtc/RTCStats;Lhms/webrtc/RTCStats;Ljava/lang/Double;Ljava/util/Map;)Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final LocalVideo from(Map<String, Object> videoStat, RTCStats extraData, RTCStats candidatePairInfo, Double primaryTimestamp, Map<Long, Double> localTracksJitter) {
                    Map<String, Object> members;
                    Map<String, Object> members2;
                    AbstractC22676k.m65750j(videoStat, "videoStat");
                    AbstractC22676k.m65750j(localTracksJitter, "localTracksJitter");
                    Long l7 = (Long) videoStat.get("frameWidth");
                    Integer numValueOf = l7 != null ? Integer.valueOf((int) l7.longValue()) : null;
                    Long l12 = (Long) videoStat.get("frameHeight");
                    Integer numValueOf2 = l12 != null ? Integer.valueOf((int) l12.longValue()) : null;
                    HMSVideoResolution hMSVideoResolution = (numValueOf == null || numValueOf2 == null) ? null : new HMSVideoResolution(numValueOf.intValue(), numValueOf2.intValue());
                    HashMap map = (HashMap) videoStat.get("qualityLimitationDurations");
                    Long l13 = (Long) videoStat.get("ssrc");
                    Long l14 = l13 != null ? l13 : null;
                    Double d3 = l14 != null ? localTracksJitter.get(Long.valueOf(l14.longValue())) : null;
                    Number number = (Number) videoStat.get("framesPerSecond");
                    return new LocalVideo(d3, (Double) ((candidatePairInfo == null || (members2 = candidatePairInfo.getMembers()) == null) ? null : members2.get("currentRoundTripTime")), (BigInteger) videoStat.get("bytesSent"), hMSVideoResolution, number, (String) ((extraData == null || (members = extraData.getMembers()) == null) ? null : members.get("trackIdentifier")), primaryTimestamp, (Long) videoStat.get("packetsSent"), new QualityLimitationReasons((String) videoStat.get("qualityLimitationReason"), map != null ? (Double) map.get("bandwidth") : null, map != null ? (Double) map.get("cpu") : null, map != null ? (Double) map.get("none") : null, map != null ? (Double) map.get("other") : null, null, 32, null), HMSUtils.INSTANCE.ridToHMSLayerMapper$lib_release((String) videoStat.get("rid")), l14, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ LocalVideo(Double d3, Double d14, BigInteger bigInteger, HMSVideoResolution hMSVideoResolution, Number number, String str, Double d15, Long l7, QualityLimitationReasons qualityLimitationReasons, HMSLayer hMSLayer, Long l12, DefaultConstructorMarker defaultConstructorMarker) {
                this(d3, d14, bigInteger, hMSVideoResolution, number, str, d15, l7, qualityLimitationReasons, hMSLayer, l12);
            }

            public static /* synthetic */ LocalVideo copy$default(LocalVideo localVideo, Double d3, Double d14, BigInteger bigInteger, HMSVideoResolution hMSVideoResolution, Number number, String str, Double d15, Long l7, QualityLimitationReasons qualityLimitationReasons, HMSLayer hMSLayer, Long l12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    d3 = localVideo.jitter;
                }
                if ((i13 & 2) != 0) {
                    d14 = localVideo.roundTripTime;
                }
                if ((i13 & 4) != 0) {
                    bigInteger = localVideo.bytesTransported;
                }
                if ((i13 & 8) != 0) {
                    hMSVideoResolution = localVideo.resolution;
                }
                if ((i13 & 16) != 0) {
                    number = localVideo.frameRate;
                }
                if ((i13 & 32) != 0) {
                    str = localVideo.trackIdentifier;
                }
                if ((i13 & 64) != 0) {
                    d15 = localVideo.remoteTimestamp;
                }
                if ((i13 & 128) != 0) {
                    l7 = localVideo.packetsSent;
                }
                if ((i13 & 256) != 0) {
                    qualityLimitationReasons = localVideo.qualityLimitations;
                }
                if ((i13 & 512) != 0) {
                    hMSLayer = localVideo.hmsLayer;
                }
                if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    l12 = localVideo.ssrc;
                }
                HMSLayer hMSLayer2 = hMSLayer;
                Long l13 = l12;
                Long l14 = l7;
                QualityLimitationReasons qualityLimitationReasons2 = qualityLimitationReasons;
                String str2 = str;
                Double d16 = d15;
                Number number2 = number;
                BigInteger bigInteger2 = bigInteger;
                return localVideo.copy(d3, d14, bigInteger2, hMSVideoResolution, number2, str2, d16, l14, qualityLimitationReasons2, hMSLayer2, l13);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Double getJitter() {
                return this.jitter;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final HMSLayer getHmsLayer() {
                return this.hmsLayer;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final Long getSsrc() {
                return this.ssrc;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Double getRoundTripTime() {
                return this.roundTripTime;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final BigInteger getBytesTransported() {
                return this.bytesTransported;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final HMSVideoResolution getResolution() {
                return this.resolution;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Number getFrameRate() {
                return this.frameRate;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getTrackIdentifier() {
                return this.trackIdentifier;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Double getRemoteTimestamp() {
                return this.remoteTimestamp;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final Long getPacketsSent() {
                return this.packetsSent;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final QualityLimitationReasons getQualityLimitations() {
                return this.qualityLimitations;
            }

            public final LocalVideo copy(Double jitter, Double roundTripTime, BigInteger bytesTransported, HMSVideoResolution resolution, Number frameRate, String trackIdentifier, Double remoteTimestamp, Long packetsSent, QualityLimitationReasons qualityLimitations, HMSLayer hmsLayer, Long ssrc) {
                AbstractC22676k.m65750j(qualityLimitations, "qualityLimitations");
                return new LocalVideo(jitter, roundTripTime, bytesTransported, resolution, frameRate, trackIdentifier, remoteTimestamp, packetsSent, qualityLimitations, hmsLayer, ssrc);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocalVideo)) {
                    return false;
                }
                LocalVideo localVideo = (LocalVideo) other;
                return AbstractC22676k.m65745e(this.jitter, localVideo.jitter) && AbstractC22676k.m65745e(this.roundTripTime, localVideo.roundTripTime) && AbstractC22676k.m65745e(this.bytesTransported, localVideo.bytesTransported) && AbstractC22676k.m65745e(this.resolution, localVideo.resolution) && AbstractC22676k.m65745e(this.frameRate, localVideo.frameRate) && AbstractC22676k.m65745e(this.trackIdentifier, localVideo.trackIdentifier) && AbstractC22676k.m65745e(this.remoteTimestamp, localVideo.remoteTimestamp) && AbstractC22676k.m65745e(this.packetsSent, localVideo.packetsSent) && AbstractC22676k.m65745e(this.qualityLimitations, localVideo.qualityLimitations) && this.hmsLayer == localVideo.hmsLayer && AbstractC22676k.m65745e(this.ssrc, localVideo.ssrc);
            }

            @Override // live.hms.video.connection.degredation.Track
            public BigInteger getBytesTransported() {
                return this.bytesTransported;
            }

            public final Number getFrameRate() {
                return this.frameRate;
            }

            public final HMSLayer getHmsLayer() {
                return this.hmsLayer;
            }

            @Override // live.hms.video.connection.degredation.Track.LocalTrack
            public Double getJitter() {
                return this.jitter;
            }

            public final Long getPacketsSent() {
                return this.packetsSent;
            }

            public final QualityLimitationReasons getQualityLimitations() {
                return this.qualityLimitations;
            }

            @Override // live.hms.video.connection.degredation.Track
            public Double getRemoteTimestamp() {
                return this.remoteTimestamp;
            }

            public final HMSVideoResolution getResolution() {
                return this.resolution;
            }

            public final Double getRoundTripTime() {
                return this.roundTripTime;
            }

            @Override // live.hms.video.connection.degredation.Track.LocalTrack
            public Long getSsrc() {
                return this.ssrc;
            }

            @Override // live.hms.video.connection.degredation.Track
            public String getTrackIdentifier() {
                return this.trackIdentifier;
            }

            public int hashCode() {
                Double d3 = this.jitter;
                int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
                Double d14 = this.roundTripTime;
                int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
                BigInteger bigInteger = this.bytesTransported;
                int iHashCode3 = (iHashCode2 + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
                HMSVideoResolution hMSVideoResolution = this.resolution;
                int iHashCode4 = (iHashCode3 + (hMSVideoResolution == null ? 0 : hMSVideoResolution.hashCode())) * 31;
                Number number = this.frameRate;
                int iHashCode5 = (iHashCode4 + (number == null ? 0 : number.hashCode())) * 31;
                String str = this.trackIdentifier;
                int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
                Double d15 = this.remoteTimestamp;
                int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
                Long l7 = this.packetsSent;
                int iHashCode8 = (this.qualityLimitations.hashCode() + ((iHashCode7 + (l7 == null ? 0 : l7.hashCode())) * 31)) * 31;
                HMSLayer hMSLayer = this.hmsLayer;
                int iHashCode9 = (iHashCode8 + (hMSLayer == null ? 0 : hMSLayer.hashCode())) * 31;
                Long l12 = this.ssrc;
                return iHashCode9 + (l12 != null ? l12.hashCode() : 0);
            }

            public String toString() {
                return "LocalVideo(jitter=" + this.jitter + ", roundTripTime=" + this.roundTripTime + ", bytesTransported=" + this.bytesTransported + ", resolution=" + this.resolution + ", frameRate=" + this.frameRate + ", trackIdentifier=" + this.trackIdentifier + ", remoteTimestamp=" + this.remoteTimestamp + ", packetsSent=" + this.packetsSent + ", qualityLimitations=" + this.qualityLimitations + ", hmsLayer=" + this.hmsLayer + ", ssrc=" + this.ssrc + ')';
            }

            private LocalVideo(Double d3, Double d14, BigInteger bigInteger, HMSVideoResolution hMSVideoResolution, Number number, String str, Double d15, Long l7, QualityLimitationReasons qualityLimitationReasons, HMSLayer hMSLayer, Long l12) {
                this.jitter = d3;
                this.roundTripTime = d14;
                this.bytesTransported = bigInteger;
                this.resolution = hMSVideoResolution;
                this.frameRate = number;
                this.trackIdentifier = str;
                this.remoteTimestamp = d15;
                this.packetsSent = l7;
                this.qualityLimitations = qualityLimitationReasons;
                this.hmsLayer = hMSLayer;
                this.ssrc = l12;
            }
        }

        public LocalTrack() {
            super(null);
        }

        public abstract Double getJitter();

        public long getPacketLoss() {
            return this.packetLoss;
        }

        public abstract Long getSsrc();

        public void setPacketLoss(long j7) {
            this.packetLoss = j7;
        }
    }

    public /* synthetic */ Track(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract BigInteger getBytesTransported();

    public abstract Double getRemoteTimestamp();

    public abstract String getTrackIdentifier();

    private Track() {
        super(null);
    }
}
