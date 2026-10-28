package live.hms.video.connection.degredation;

import androidx.profileinstaller.ProfileVerifier;
import hms.webrtc.RTCStats;
import java.math.BigInteger;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\bR\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 d2\u00020\u0001:\u0001dB\u0083\u0002\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010G\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010O\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010V\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010W\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010Y\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#Jº\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020\u0005HÖ\u0001J\t\u0010c\u001a\u00020\fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b(\u0010#R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b0\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b1\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b2\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b3\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010'\u001a\u0004\b4\u0010&R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b5\u0010#R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b6\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b7\u0010*R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b8\u0010#R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b9\u0010#R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\b:\u0010#R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b;\u0010*R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b<\u0010*R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b=\u0010*R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b>\u0010*R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b?\u0010*R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b@\u0010*R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\bA\u0010#R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010$\u001a\u0004\bB\u0010#¨\u0006e"}, m65681d2 = {"Llive/hms/video/connection/degredation/Video;", "Llive/hms/video/connection/degredation/RemoteTrack;", "jitter", "", "packetsLost", "", "timestampUs", "packetsReceived", "", "bytesTransported", "Ljava/math/BigInteger;", "trackIdentifier", "", "remoteTimestamp", "ssrc", "lastPacketReceivedTimestamp", "jitterBufferDelay", "framesReceived", "framesPerSecond", "framesDecoded", "framesDropped", "totalDecodeTime", "totalInterFrameDelay", "totalSquaredInterFrameDelay", "firCount", "pliCount", "nackCount", "frameWidth", "frameHeight", "freezeCount", "totalFreezesDuration", "totalFramesDuration", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)V", "getJitter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPacketsLost", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimestampUs", "getPacketsReceived", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBytesTransported", "()Ljava/math/BigInteger;", "getTrackIdentifier", "()Ljava/lang/String;", "getRemoteTimestamp", "getSsrc", "getLastPacketReceivedTimestamp", "getJitterBufferDelay", "getFramesReceived", "getFramesPerSecond", "getFramesDecoded", "getFramesDropped", "getTotalDecodeTime", "getTotalInterFrameDelay", "getTotalSquaredInterFrameDelay", "getFirCount", "getPliCount", "getNackCount", "getFrameWidth", "getFrameHeight", "getFreezeCount", "getTotalFreezesDuration", "getTotalFramesDuration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/math/BigInteger;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)Llive/hms/video/connection/degredation/Video;", "equals", "", "other", "", "hashCode", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Video extends RemoteTrack {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BigInteger bytesTransported;
    private final Long firCount;
    private final Long frameHeight;
    private final Long frameWidth;
    private final Long framesDecoded;
    private final Long framesDropped;
    private final Double framesPerSecond;
    private final Integer framesReceived;
    private final Long freezeCount;
    private final Double jitter;
    private final Double jitterBufferDelay;
    private final Double lastPacketReceivedTimestamp;
    private final Long nackCount;
    private final Integer packetsLost;
    private final Long packetsReceived;
    private final Long pliCount;
    private final Double remoteTimestamp;
    private final Long ssrc;
    private final Double timestampUs;
    private final Double totalDecodeTime;
    private final Double totalFramesDuration;
    private final Double totalFreezesDuration;
    private final Double totalInterFrameDelay;
    private final Double totalSquaredInterFrameDelay;
    private final String trackIdentifier;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m65681d2 = {"Llive/hms/video/connection/degredation/Video$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/connection/degredation/Video;", "videoStat", "", "", "extraData", "Lhms/webrtc/RTCStats;", "primaryTimestamp", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Video from(Map<String, Object> videoStat, RTCStats extraData, double primaryTimestamp) {
            Map<String, Object> members;
            Map<String, Object> members2;
            Map<String, Object> members3;
            Map<String, Object> members4;
            AbstractC22676k.m65750j(videoStat, "videoStat");
            Object obj = null;
            Double dValueOf = extraData != null ? Double.valueOf(extraData.getTimestampUs()) : null;
            Double d3 = (Double) videoStat.get("jitter");
            Integer num = (Integer) videoStat.get("packetsLost");
            BigInteger bigInteger = (BigInteger) videoStat.get("bytesReceived");
            Long l7 = (Long) videoStat.get("packetsReceived");
            Long l12 = (Long) videoStat.get("ssrc");
            Double d14 = (Double) videoStat.get("lastPacketReceivedTimestamp");
            String str = (String) ((extraData == null || (members4 = extraData.getMembers()) == null) ? null : members4.get("trackIdentifier"));
            Double d15 = (Double) videoStat.get("jitterBufferDelay");
            Integer num2 = (Integer) videoStat.get("framesReceived");
            Double d16 = (Double) videoStat.get("framesPerSecond");
            Long l13 = (Long) videoStat.get("framesDecoded");
            Long l14 = (Long) videoStat.get("framesDropped");
            Double d17 = (Double) videoStat.get("totalDecodeTime");
            Double d18 = (Double) videoStat.get("totalInterFrameDelay");
            Double d19 = (Double) videoStat.get("totalSquaredInterFrameDelay");
            Long l15 = (Long) videoStat.get("firCount");
            Long l16 = (Long) videoStat.get("pliCount");
            Long l17 = (Long) videoStat.get("nackCount");
            Long l18 = (Long) videoStat.get("frameHeight");
            Long l19 = (Long) videoStat.get("frameWidth");
            Long l24 = (Long) ((extraData == null || (members3 = extraData.getMembers()) == null) ? null : members3.get("freezeCount"));
            Double d24 = (Double) ((extraData == null || (members2 = extraData.getMembers()) == null) ? null : members2.get("totalFreezesDuration"));
            if (extraData != null && (members = extraData.getMembers()) != null) {
                obj = members.get("totalFramesDuration");
            }
            return new Video(d3, num, Double.valueOf(primaryTimestamp), l7, bigInteger, str, dValueOf, l12, d14, d15, num2, d16, l13, l14, d17, d18, d19, l15, l16, l17, l19, l18, l24, d24, (Double) obj, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Video(Double d3, Integer num, Double d14, Long l7, BigInteger bigInteger, String str, Double d15, Long l12, Double d16, Double d17, Integer num2, Double d18, Long l13, Long l14, Double d19, Double d24, Double d25, Long l15, Long l16, Long l17, Long l18, Long l19, Long l24, Double d26, Double d27, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, num, d14, l7, bigInteger, str, d15, l12, d16, d17, num2, d18, l13, l14, d19, d24, d25, l15, l16, l17, l18, l19, l24, d26, d27);
    }

    public static /* synthetic */ Video copy$default(Video video, Double d3, Integer num, Double d14, Long l7, BigInteger bigInteger, String str, Double d15, Long l12, Double d16, Double d17, Integer num2, Double d18, Long l13, Long l14, Double d19, Double d24, Double d25, Long l15, Long l16, Long l17, Long l18, Long l19, Long l24, Double d26, Double d27, int i13, Object obj) {
        Double d28;
        Double d29;
        Double d32 = (i13 & 1) != 0 ? video.jitter : d3;
        Integer num3 = (i13 & 2) != 0 ? video.packetsLost : num;
        Double d34 = (i13 & 4) != 0 ? video.timestampUs : d14;
        Long l25 = (i13 & 8) != 0 ? video.packetsReceived : l7;
        BigInteger bigInteger2 = (i13 & 16) != 0 ? video.bytesTransported : bigInteger;
        String str2 = (i13 & 32) != 0 ? video.trackIdentifier : str;
        Double d35 = (i13 & 64) != 0 ? video.remoteTimestamp : d15;
        Long l26 = (i13 & 128) != 0 ? video.ssrc : l12;
        Double d36 = (i13 & 256) != 0 ? video.lastPacketReceivedTimestamp : d16;
        Double d37 = (i13 & 512) != 0 ? video.jitterBufferDelay : d17;
        Integer num4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? video.framesReceived : num2;
        Double d38 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? video.framesPerSecond : d18;
        Long l27 = (i13 & 4096) != 0 ? video.framesDecoded : l13;
        Long l28 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? video.framesDropped : l14;
        Double d39 = d32;
        Double d44 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? video.totalDecodeTime : d19;
        Double d45 = (i13 & 32768) != 0 ? video.totalInterFrameDelay : d24;
        Double d46 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? video.totalSquaredInterFrameDelay : d25;
        Long l29 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? video.firCount : l15;
        Long l34 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? video.pliCount : l16;
        Long l35 = (i13 & 524288) != 0 ? video.nackCount : l17;
        Long l36 = (i13 & 1048576) != 0 ? video.frameWidth : l18;
        Long l37 = (i13 & 2097152) != 0 ? video.frameHeight : l19;
        Long l38 = (i13 & 4194304) != 0 ? video.freezeCount : l24;
        Double d47 = (i13 & 8388608) != 0 ? video.totalFreezesDuration : d26;
        if ((i13 & 16777216) != 0) {
            d29 = d47;
            d28 = video.totalFramesDuration;
        } else {
            d28 = d27;
            d29 = d47;
        }
        return video.copy(d39, num3, d34, l25, bigInteger2, str2, d35, l26, d36, d37, num4, d38, l27, l28, d44, d45, d46, l29, l34, l35, l36, l37, l38, d29, d28);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getJitter() {
        return this.jitter;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getJitterBufferDelay() {
        return this.jitterBufferDelay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getFramesReceived() {
        return this.framesReceived;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getFramesPerSecond() {
        return this.framesPerSecond;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getFramesDecoded() {
        return this.framesDecoded;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getFramesDropped() {
        return this.framesDropped;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getTotalDecodeTime() {
        return this.totalDecodeTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getTotalInterFrameDelay() {
        return this.totalInterFrameDelay;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Double getTotalSquaredInterFrameDelay() {
        return this.totalSquaredInterFrameDelay;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getFirCount() {
        return this.firCount;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getPliCount() {
        return this.pliCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPacketsLost() {
        return this.packetsLost;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Long getNackCount() {
        return this.nackCount;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getFrameWidth() {
        return this.frameWidth;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getFrameHeight() {
        return this.frameHeight;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getFreezeCount() {
        return this.freezeCount;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Double getTotalFreezesDuration() {
        return this.totalFreezesDuration;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Double getTotalFramesDuration() {
        return this.totalFramesDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getTimestampUs() {
        return this.timestampUs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getPacketsReceived() {
        return this.packetsReceived;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigInteger getBytesTransported() {
        return this.bytesTransported;
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
    public final Long getSsrc() {
        return this.ssrc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getLastPacketReceivedTimestamp() {
        return this.lastPacketReceivedTimestamp;
    }

    public final Video copy(Double jitter, Integer packetsLost, Double timestampUs, Long packetsReceived, BigInteger bytesTransported, String trackIdentifier, Double remoteTimestamp, Long ssrc, Double lastPacketReceivedTimestamp, Double jitterBufferDelay, Integer framesReceived, Double framesPerSecond, Long framesDecoded, Long framesDropped, Double totalDecodeTime, Double totalInterFrameDelay, Double totalSquaredInterFrameDelay, Long firCount, Long pliCount, Long nackCount, Long frameWidth, Long frameHeight, Long freezeCount, Double totalFreezesDuration, Double totalFramesDuration) {
        return new Video(jitter, packetsLost, timestampUs, packetsReceived, bytesTransported, trackIdentifier, remoteTimestamp, ssrc, lastPacketReceivedTimestamp, jitterBufferDelay, framesReceived, framesPerSecond, framesDecoded, framesDropped, totalDecodeTime, totalInterFrameDelay, totalSquaredInterFrameDelay, firCount, pliCount, nackCount, frameWidth, frameHeight, freezeCount, totalFreezesDuration, totalFramesDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Video)) {
            return false;
        }
        Video video = (Video) other;
        return AbstractC22676k.m65745e(this.jitter, video.jitter) && AbstractC22676k.m65745e(this.packetsLost, video.packetsLost) && AbstractC22676k.m65745e(this.timestampUs, video.timestampUs) && AbstractC22676k.m65745e(this.packetsReceived, video.packetsReceived) && AbstractC22676k.m65745e(this.bytesTransported, video.bytesTransported) && AbstractC22676k.m65745e(this.trackIdentifier, video.trackIdentifier) && AbstractC22676k.m65745e(this.remoteTimestamp, video.remoteTimestamp) && AbstractC22676k.m65745e(this.ssrc, video.ssrc) && AbstractC22676k.m65745e(this.lastPacketReceivedTimestamp, video.lastPacketReceivedTimestamp) && AbstractC22676k.m65745e(this.jitterBufferDelay, video.jitterBufferDelay) && AbstractC22676k.m65745e(this.framesReceived, video.framesReceived) && AbstractC22676k.m65745e(this.framesPerSecond, video.framesPerSecond) && AbstractC22676k.m65745e(this.framesDecoded, video.framesDecoded) && AbstractC22676k.m65745e(this.framesDropped, video.framesDropped) && AbstractC22676k.m65745e(this.totalDecodeTime, video.totalDecodeTime) && AbstractC22676k.m65745e(this.totalInterFrameDelay, video.totalInterFrameDelay) && AbstractC22676k.m65745e(this.totalSquaredInterFrameDelay, video.totalSquaredInterFrameDelay) && AbstractC22676k.m65745e(this.firCount, video.firCount) && AbstractC22676k.m65745e(this.pliCount, video.pliCount) && AbstractC22676k.m65745e(this.nackCount, video.nackCount) && AbstractC22676k.m65745e(this.frameWidth, video.frameWidth) && AbstractC22676k.m65745e(this.frameHeight, video.frameHeight) && AbstractC22676k.m65745e(this.freezeCount, video.freezeCount) && AbstractC22676k.m65745e(this.totalFreezesDuration, video.totalFreezesDuration) && AbstractC22676k.m65745e(this.totalFramesDuration, video.totalFramesDuration);
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack, live.hms.video.connection.degredation.Track
    public BigInteger getBytesTransported() {
        return this.bytesTransported;
    }

    public final Long getFirCount() {
        return this.firCount;
    }

    public final Long getFrameHeight() {
        return this.frameHeight;
    }

    public final Long getFrameWidth() {
        return this.frameWidth;
    }

    public final Long getFramesDecoded() {
        return this.framesDecoded;
    }

    public final Long getFramesDropped() {
        return this.framesDropped;
    }

    public final Double getFramesPerSecond() {
        return this.framesPerSecond;
    }

    public final Integer getFramesReceived() {
        return this.framesReceived;
    }

    public final Long getFreezeCount() {
        return this.freezeCount;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Double getJitter() {
        return this.jitter;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Double getJitterBufferDelay() {
        return this.jitterBufferDelay;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Double getLastPacketReceivedTimestamp() {
        return this.lastPacketReceivedTimestamp;
    }

    public final Long getNackCount() {
        return this.nackCount;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Integer getPacketsLost() {
        return this.packetsLost;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Long getPacketsReceived() {
        return this.packetsReceived;
    }

    public final Long getPliCount() {
        return this.pliCount;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack, live.hms.video.connection.degredation.Track
    public Double getRemoteTimestamp() {
        return this.remoteTimestamp;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Long getSsrc() {
        return this.ssrc;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Double getTimestampUs() {
        return this.timestampUs;
    }

    public final Double getTotalDecodeTime() {
        return this.totalDecodeTime;
    }

    public final Double getTotalFramesDuration() {
        return this.totalFramesDuration;
    }

    public final Double getTotalFreezesDuration() {
        return this.totalFreezesDuration;
    }

    public final Double getTotalInterFrameDelay() {
        return this.totalInterFrameDelay;
    }

    public final Double getTotalSquaredInterFrameDelay() {
        return this.totalSquaredInterFrameDelay;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack, live.hms.video.connection.degredation.Track
    public String getTrackIdentifier() {
        return this.trackIdentifier;
    }

    public int hashCode() {
        Double d3 = this.jitter;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        Integer num = this.packetsLost;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.timestampUs;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l7 = this.packetsReceived;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        BigInteger bigInteger = this.bytesTransported;
        int iHashCode5 = (iHashCode4 + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        String str = this.trackIdentifier;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Double d15 = this.remoteTimestamp;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Long l12 = this.ssrc;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Double d16 = this.lastPacketReceivedTimestamp;
        int iHashCode9 = (iHashCode8 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.jitterBufferDelay;
        int iHashCode10 = (iHashCode9 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num2 = this.framesReceived;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d18 = this.framesPerSecond;
        int iHashCode12 = (iHashCode11 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Long l13 = this.framesDecoded;
        int iHashCode13 = (iHashCode12 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.framesDropped;
        int iHashCode14 = (iHashCode13 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d19 = this.totalDecodeTime;
        int iHashCode15 = (iHashCode14 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.totalInterFrameDelay;
        int iHashCode16 = (iHashCode15 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.totalSquaredInterFrameDelay;
        int iHashCode17 = (iHashCode16 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Long l15 = this.firCount;
        int iHashCode18 = (iHashCode17 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.pliCount;
        int iHashCode19 = (iHashCode18 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.nackCount;
        int iHashCode20 = (iHashCode19 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.frameWidth;
        int iHashCode21 = (iHashCode20 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.frameHeight;
        int iHashCode22 = (iHashCode21 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Long l24 = this.freezeCount;
        int iHashCode23 = (iHashCode22 + (l24 == null ? 0 : l24.hashCode())) * 31;
        Double d26 = this.totalFreezesDuration;
        int iHashCode24 = (iHashCode23 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.totalFramesDuration;
        return iHashCode24 + (d27 != null ? d27.hashCode() : 0);
    }

    public String toString() {
        return "Video(jitter=" + this.jitter + ", packetsLost=" + this.packetsLost + ", timestampUs=" + this.timestampUs + ", packetsReceived=" + this.packetsReceived + ", bytesTransported=" + this.bytesTransported + ", trackIdentifier=" + this.trackIdentifier + ", remoteTimestamp=" + this.remoteTimestamp + ", ssrc=" + this.ssrc + ", lastPacketReceivedTimestamp=" + this.lastPacketReceivedTimestamp + ", jitterBufferDelay=" + this.jitterBufferDelay + ", framesReceived=" + this.framesReceived + ", framesPerSecond=" + this.framesPerSecond + ", framesDecoded=" + this.framesDecoded + ", framesDropped=" + this.framesDropped + ", totalDecodeTime=" + this.totalDecodeTime + ", totalInterFrameDelay=" + this.totalInterFrameDelay + ", totalSquaredInterFrameDelay=" + this.totalSquaredInterFrameDelay + ", firCount=" + this.firCount + ", pliCount=" + this.pliCount + ", nackCount=" + this.nackCount + ", frameWidth=" + this.frameWidth + ", frameHeight=" + this.frameHeight + ", freezeCount=" + this.freezeCount + ", totalFreezesDuration=" + this.totalFreezesDuration + ", totalFramesDuration=" + this.totalFramesDuration + ')';
    }

    private Video(Double d3, Integer num, Double d14, Long l7, BigInteger bigInteger, String str, Double d15, Long l12, Double d16, Double d17, Integer num2, Double d18, Long l13, Long l14, Double d19, Double d24, Double d25, Long l15, Long l16, Long l17, Long l18, Long l19, Long l24, Double d26, Double d27) {
        this.jitter = d3;
        this.packetsLost = num;
        this.timestampUs = d14;
        this.packetsReceived = l7;
        this.bytesTransported = bigInteger;
        this.trackIdentifier = str;
        this.remoteTimestamp = d15;
        this.ssrc = l12;
        this.lastPacketReceivedTimestamp = d16;
        this.jitterBufferDelay = d17;
        this.framesReceived = num2;
        this.framesPerSecond = d18;
        this.framesDecoded = l13;
        this.framesDropped = l14;
        this.totalDecodeTime = d19;
        this.totalInterFrameDelay = d24;
        this.totalSquaredInterFrameDelay = d25;
        this.firCount = l15;
        this.pliCount = l16;
        this.nackCount = l17;
        this.frameWidth = l18;
        this.frameHeight = l19;
        this.freezeCount = l24;
        this.totalFreezesDuration = d26;
        this.totalFramesDuration = d27;
    }
}
