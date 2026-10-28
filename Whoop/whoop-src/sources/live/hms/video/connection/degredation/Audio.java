package live.hms.video.connection.degredation;

import androidx.profileinstaller.ProfileVerifier;
import hms.webrtc.RTCStats;
import java.math.BigInteger;
import java.util.Map;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bZ\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 o2\u00020\u0001:\u0001oB¡\u0002\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010R\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010U\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010V\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'JÞ\u0002\u0010h\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010iJ\u0013\u0010j\u001a\u00020\u00112\b\u0010k\u001a\u0004\u0018\u00010lHÖ\u0003J\t\u0010m\u001a\u00020\u0005HÖ\u0001J\t\u0010n\u001a\u00020\rHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0018\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b1\u0010'R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b2\u0010'R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b5\u0010/R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b6\u0010'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00109\u001a\u0004\b:\u00108R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b;\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b=\u0010'R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b>\u0010'R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u0010-R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b@\u0010'R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010-R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010-R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bG\u0010-R\u0015\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\bH\u0010'R\u0015\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\bI\u0010'R\u0015\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00100\u001a\u0004\bJ\u0010/R\u0015\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\bK\u0010'¨\u0006p"}, m65681d2 = {"Llive/hms/video/connection/degredation/Audio;", "Llive/hms/video/connection/degredation/RemoteTrack;", "jitter", "", "packetsLost", "", "bytesTransported", "Ljava/math/BigInteger;", "packetsReceived", "", "remoteTimestamp", "timestampUs", "trackIdentifier", "", "ssrc", "lastPacketReceivedTimestamp", "ended", "", "detached", "jitterBufferDelay", "jitterBufferEmittedCount", "audioLevel", "totalAudioEnergy", "totalSamplesReceived", "totalSamplesDuration", "concealedSamples", "silentConcealedSamples", "concealmentEvents", "insertedSamplesForDeceleration", "removedSamplesForAcceleration", "jitterBufferFlushes", "delayedPacketOutageSamples", "relativePacketArrivalDelay", "jitterBufferTargetDelay", "interruptionCount", "totalInterruptionDuration", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/math/BigInteger;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;)V", "getJitter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPacketsLost", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBytesTransported", "()Ljava/math/BigInteger;", "getPacketsReceived", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRemoteTimestamp", "getTimestampUs", "getTrackIdentifier", "()Ljava/lang/String;", "getSsrc", "getLastPacketReceivedTimestamp", "getEnded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDetached", "getJitterBufferDelay", "getJitterBufferEmittedCount", "getAudioLevel", "getTotalAudioEnergy", "getTotalSamplesReceived", "getTotalSamplesDuration", "getConcealedSamples", "getSilentConcealedSamples", "getConcealmentEvents", "getInsertedSamplesForDeceleration", "getRemovedSamplesForAcceleration", "getJitterBufferFlushes", "getDelayedPacketOutageSamples", "getRelativePacketArrivalDelay", "getJitterBufferTargetDelay", "getInterruptionCount", "getTotalInterruptionDuration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/math/BigInteger;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;)Llive/hms/video/connection/degredation/Audio;", "equals", "other", "", "hashCode", "toString", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Audio extends RemoteTrack {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double audioLevel;
    private final BigInteger bytesTransported;
    private final BigInteger concealedSamples;
    private final BigInteger concealmentEvents;
    private final BigInteger delayedPacketOutageSamples;
    private final Boolean detached;
    private final Boolean ended;
    private final BigInteger insertedSamplesForDeceleration;
    private final Long interruptionCount;
    private final Double jitter;
    private final Double jitterBufferDelay;
    private final BigInteger jitterBufferEmittedCount;
    private final BigInteger jitterBufferFlushes;
    private final Double jitterBufferTargetDelay;
    private final Double lastPacketReceivedTimestamp;
    private final Integer packetsLost;
    private final Long packetsReceived;
    private final Double relativePacketArrivalDelay;
    private final Double remoteTimestamp;
    private final BigInteger removedSamplesForAcceleration;
    private final BigInteger silentConcealedSamples;
    private final Long ssrc;
    private final Double timestampUs;
    private final Double totalAudioEnergy;
    private final Double totalInterruptionDuration;
    private final Double totalSamplesDuration;
    private final BigInteger totalSamplesReceived;
    private final String trackIdentifier;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m65681d2 = {"Llive/hms/video/connection/degredation/Audio$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/connection/degredation/Audio;", "audioStat", "", "", "extraData", "Lhms/webrtc/RTCStats;", "primaryTimestamp", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Audio from(Map<String, Object> audioStat, RTCStats extraData, double primaryTimestamp) {
            Map<String, Object> members;
            Map<String, Object> members2;
            Map<String, Object> members3;
            Map<String, Object> members4;
            Map<String, Object> members5;
            Map<String, Object> members6;
            Map<String, Object> members7;
            Map<String, Object> members8;
            Map<String, Object> members9;
            AbstractC22676k.m65750j(audioStat, "audioStat");
            Object obj = null;
            Double dValueOf = extraData != null ? Double.valueOf(extraData.getTimestampUs()) : null;
            Double d3 = (Double) audioStat.get("jitter");
            Integer num = (Integer) audioStat.get("packetsLost");
            BigInteger bigInteger = (BigInteger) audioStat.get("bytesReceived");
            Long l7 = (Long) audioStat.get("packetsReceived");
            Long l12 = (Long) audioStat.get("ssrc");
            Double d14 = (Double) audioStat.get("lastPacketReceivedTimestamp");
            Double d15 = (Double) audioStat.get("jitterBufferDelay");
            BigInteger bigInteger2 = (BigInteger) audioStat.get("jitterBufferEmittedCount");
            BigInteger bigInteger3 = (BigInteger) audioStat.get("totalSamplesReceived");
            Double d16 = (Double) audioStat.get("totalSamplesDuration");
            BigInteger bigInteger4 = (BigInteger) audioStat.get("concealedSamples");
            BigInteger bigInteger5 = (BigInteger) audioStat.get("silentConcealedSamples");
            BigInteger bigInteger6 = (BigInteger) audioStat.get("concealmentEvents");
            BigInteger bigInteger7 = (BigInteger) audioStat.get("insertedSamplesForDeceleration");
            BigInteger bigInteger8 = (BigInteger) audioStat.get("removedSamplesForAcceleration");
            Double d17 = (Double) audioStat.get("audioLevel");
            Double d18 = (Double) audioStat.get("totalAudioEnergy");
            Boolean bool = (Boolean) ((extraData == null || (members9 = extraData.getMembers()) == null) ? null : members9.get("ended"));
            Boolean bool2 = (Boolean) ((extraData == null || (members8 = extraData.getMembers()) == null) ? null : members8.get("detached"));
            String str = (String) ((extraData == null || (members7 = extraData.getMembers()) == null) ? null : members7.get("trackIdentifier"));
            BigInteger bigInteger9 = (BigInteger) ((extraData == null || (members6 = extraData.getMembers()) == null) ? null : members6.get("jitterBufferFlushes"));
            BigInteger bigInteger10 = (BigInteger) ((extraData == null || (members5 = extraData.getMembers()) == null) ? null : members5.get("delayedPacketOutageSamples"));
            Double d19 = (Double) ((extraData == null || (members4 = extraData.getMembers()) == null) ? null : members4.get("relativePacketArrivalDelay"));
            Double d24 = (Double) ((extraData == null || (members3 = extraData.getMembers()) == null) ? null : members3.get("jitterBufferTargetDelay"));
            Long l13 = (Long) ((extraData == null || (members2 = extraData.getMembers()) == null) ? null : members2.get("interruptionCount"));
            if (extraData != null && (members = extraData.getMembers()) != null) {
                obj = members.get("totalInterruptionDuration");
            }
            return new Audio(d3, num, bigInteger, l7, dValueOf, Double.valueOf(primaryTimestamp), str, l12, d14, bool, bool2, d15, bigInteger2, d17, d18, bigInteger3, d16, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, bigInteger9, bigInteger10, d19, d24, l13, (Double) obj, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Audio(Double d3, Integer num, BigInteger bigInteger, Long l7, Double d14, Double d15, String str, Long l12, Double d16, Boolean bool, Boolean bool2, Double d17, BigInteger bigInteger2, Double d18, Double d19, BigInteger bigInteger3, Double d24, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8, BigInteger bigInteger9, BigInteger bigInteger10, Double d25, Double d26, Long l13, Double d27, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, num, bigInteger, l7, d14, d15, str, l12, d16, bool, bool2, d17, bigInteger2, d18, d19, bigInteger3, d24, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, bigInteger9, bigInteger10, d25, d26, l13, d27);
    }

    public static /* synthetic */ Audio copy$default(Audio audio, Double d3, Integer num, BigInteger bigInteger, Long l7, Double d14, Double d15, String str, Long l12, Double d16, Boolean bool, Boolean bool2, Double d17, BigInteger bigInteger2, Double d18, Double d19, BigInteger bigInteger3, Double d24, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8, BigInteger bigInteger9, BigInteger bigInteger10, Double d25, Double d26, Long l13, Double d27, int i13, Object obj) {
        Double d28;
        Long l14;
        Double d29 = (i13 & 1) != 0 ? audio.jitter : d3;
        Integer num2 = (i13 & 2) != 0 ? audio.packetsLost : num;
        BigInteger bigInteger11 = (i13 & 4) != 0 ? audio.bytesTransported : bigInteger;
        Long l15 = (i13 & 8) != 0 ? audio.packetsReceived : l7;
        Double d32 = (i13 & 16) != 0 ? audio.remoteTimestamp : d14;
        Double d34 = (i13 & 32) != 0 ? audio.timestampUs : d15;
        String str2 = (i13 & 64) != 0 ? audio.trackIdentifier : str;
        Long l16 = (i13 & 128) != 0 ? audio.ssrc : l12;
        Double d35 = (i13 & 256) != 0 ? audio.lastPacketReceivedTimestamp : d16;
        Boolean bool3 = (i13 & 512) != 0 ? audio.ended : bool;
        Boolean bool4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? audio.detached : bool2;
        Double d36 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? audio.jitterBufferDelay : d17;
        BigInteger bigInteger12 = (i13 & 4096) != 0 ? audio.jitterBufferEmittedCount : bigInteger2;
        Double d37 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? audio.audioLevel : d18;
        Double d38 = d29;
        Double d39 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? audio.totalAudioEnergy : d19;
        BigInteger bigInteger13 = (i13 & 32768) != 0 ? audio.totalSamplesReceived : bigInteger3;
        Double d44 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? audio.totalSamplesDuration : d24;
        BigInteger bigInteger14 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? audio.concealedSamples : bigInteger4;
        BigInteger bigInteger15 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? audio.silentConcealedSamples : bigInteger5;
        BigInteger bigInteger16 = (i13 & 524288) != 0 ? audio.concealmentEvents : bigInteger6;
        BigInteger bigInteger17 = (i13 & 1048576) != 0 ? audio.insertedSamplesForDeceleration : bigInteger7;
        BigInteger bigInteger18 = (i13 & 2097152) != 0 ? audio.removedSamplesForAcceleration : bigInteger8;
        BigInteger bigInteger19 = (i13 & 4194304) != 0 ? audio.jitterBufferFlushes : bigInteger9;
        BigInteger bigInteger20 = (i13 & 8388608) != 0 ? audio.delayedPacketOutageSamples : bigInteger10;
        Double d45 = (i13 & 16777216) != 0 ? audio.relativePacketArrivalDelay : d25;
        Double d46 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? audio.jitterBufferTargetDelay : d26;
        Long l17 = (i13 & 67108864) != 0 ? audio.interruptionCount : l13;
        if ((i13 & 134217728) != 0) {
            l14 = l17;
            d28 = audio.totalInterruptionDuration;
        } else {
            d28 = d27;
            l14 = l17;
        }
        return audio.copy(d38, num2, bigInteger11, l15, d32, d34, str2, l16, d35, bool3, bool4, d36, bigInteger12, d37, d39, bigInteger13, d44, bigInteger14, bigInteger15, bigInteger16, bigInteger17, bigInteger18, bigInteger19, bigInteger20, d45, d46, l14, d28);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getJitter() {
        return this.jitter;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getEnded() {
        return this.ended;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getDetached() {
        return this.detached;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getJitterBufferDelay() {
        return this.jitterBufferDelay;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigInteger getJitterBufferEmittedCount() {
        return this.jitterBufferEmittedCount;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Double getAudioLevel() {
        return this.audioLevel;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getTotalAudioEnergy() {
        return this.totalAudioEnergy;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigInteger getTotalSamplesReceived() {
        return this.totalSamplesReceived;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Double getTotalSamplesDuration() {
        return this.totalSamplesDuration;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigInteger getConcealedSamples() {
        return this.concealedSamples;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigInteger getSilentConcealedSamples() {
        return this.silentConcealedSamples;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPacketsLost() {
        return this.packetsLost;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigInteger getConcealmentEvents() {
        return this.concealmentEvents;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigInteger getInsertedSamplesForDeceleration() {
        return this.insertedSamplesForDeceleration;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigInteger getRemovedSamplesForAcceleration() {
        return this.removedSamplesForAcceleration;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BigInteger getJitterBufferFlushes() {
        return this.jitterBufferFlushes;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final BigInteger getDelayedPacketOutageSamples() {
        return this.delayedPacketOutageSamples;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Double getRelativePacketArrivalDelay() {
        return this.relativePacketArrivalDelay;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Double getJitterBufferTargetDelay() {
        return this.jitterBufferTargetDelay;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getInterruptionCount() {
        return this.interruptionCount;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Double getTotalInterruptionDuration() {
        return this.totalInterruptionDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigInteger getBytesTransported() {
        return this.bytesTransported;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getPacketsReceived() {
        return this.packetsReceived;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getRemoteTimestamp() {
        return this.remoteTimestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getTimestampUs() {
        return this.timestampUs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrackIdentifier() {
        return this.trackIdentifier;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getSsrc() {
        return this.ssrc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getLastPacketReceivedTimestamp() {
        return this.lastPacketReceivedTimestamp;
    }

    public final Audio copy(Double jitter, Integer packetsLost, BigInteger bytesTransported, Long packetsReceived, Double remoteTimestamp, Double timestampUs, String trackIdentifier, Long ssrc, Double lastPacketReceivedTimestamp, Boolean ended, Boolean detached, Double jitterBufferDelay, BigInteger jitterBufferEmittedCount, Double audioLevel, Double totalAudioEnergy, BigInteger totalSamplesReceived, Double totalSamplesDuration, BigInteger concealedSamples, BigInteger silentConcealedSamples, BigInteger concealmentEvents, BigInteger insertedSamplesForDeceleration, BigInteger removedSamplesForAcceleration, BigInteger jitterBufferFlushes, BigInteger delayedPacketOutageSamples, Double relativePacketArrivalDelay, Double jitterBufferTargetDelay, Long interruptionCount, Double totalInterruptionDuration) {
        return new Audio(jitter, packetsLost, bytesTransported, packetsReceived, remoteTimestamp, timestampUs, trackIdentifier, ssrc, lastPacketReceivedTimestamp, ended, detached, jitterBufferDelay, jitterBufferEmittedCount, audioLevel, totalAudioEnergy, totalSamplesReceived, totalSamplesDuration, concealedSamples, silentConcealedSamples, concealmentEvents, insertedSamplesForDeceleration, removedSamplesForAcceleration, jitterBufferFlushes, delayedPacketOutageSamples, relativePacketArrivalDelay, jitterBufferTargetDelay, interruptionCount, totalInterruptionDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Audio)) {
            return false;
        }
        Audio audio = (Audio) other;
        return AbstractC22676k.m65745e(this.jitter, audio.jitter) && AbstractC22676k.m65745e(this.packetsLost, audio.packetsLost) && AbstractC22676k.m65745e(this.bytesTransported, audio.bytesTransported) && AbstractC22676k.m65745e(this.packetsReceived, audio.packetsReceived) && AbstractC22676k.m65745e(this.remoteTimestamp, audio.remoteTimestamp) && AbstractC22676k.m65745e(this.timestampUs, audio.timestampUs) && AbstractC22676k.m65745e(this.trackIdentifier, audio.trackIdentifier) && AbstractC22676k.m65745e(this.ssrc, audio.ssrc) && AbstractC22676k.m65745e(this.lastPacketReceivedTimestamp, audio.lastPacketReceivedTimestamp) && AbstractC22676k.m65745e(this.ended, audio.ended) && AbstractC22676k.m65745e(this.detached, audio.detached) && AbstractC22676k.m65745e(this.jitterBufferDelay, audio.jitterBufferDelay) && AbstractC22676k.m65745e(this.jitterBufferEmittedCount, audio.jitterBufferEmittedCount) && AbstractC22676k.m65745e(this.audioLevel, audio.audioLevel) && AbstractC22676k.m65745e(this.totalAudioEnergy, audio.totalAudioEnergy) && AbstractC22676k.m65745e(this.totalSamplesReceived, audio.totalSamplesReceived) && AbstractC22676k.m65745e(this.totalSamplesDuration, audio.totalSamplesDuration) && AbstractC22676k.m65745e(this.concealedSamples, audio.concealedSamples) && AbstractC22676k.m65745e(this.silentConcealedSamples, audio.silentConcealedSamples) && AbstractC22676k.m65745e(this.concealmentEvents, audio.concealmentEvents) && AbstractC22676k.m65745e(this.insertedSamplesForDeceleration, audio.insertedSamplesForDeceleration) && AbstractC22676k.m65745e(this.removedSamplesForAcceleration, audio.removedSamplesForAcceleration) && AbstractC22676k.m65745e(this.jitterBufferFlushes, audio.jitterBufferFlushes) && AbstractC22676k.m65745e(this.delayedPacketOutageSamples, audio.delayedPacketOutageSamples) && AbstractC22676k.m65745e(this.relativePacketArrivalDelay, audio.relativePacketArrivalDelay) && AbstractC22676k.m65745e(this.jitterBufferTargetDelay, audio.jitterBufferTargetDelay) && AbstractC22676k.m65745e(this.interruptionCount, audio.interruptionCount) && AbstractC22676k.m65745e(this.totalInterruptionDuration, audio.totalInterruptionDuration);
    }

    public final Double getAudioLevel() {
        return this.audioLevel;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack, live.hms.video.connection.degredation.Track
    public BigInteger getBytesTransported() {
        return this.bytesTransported;
    }

    public final BigInteger getConcealedSamples() {
        return this.concealedSamples;
    }

    public final BigInteger getConcealmentEvents() {
        return this.concealmentEvents;
    }

    public final BigInteger getDelayedPacketOutageSamples() {
        return this.delayedPacketOutageSamples;
    }

    public final Boolean getDetached() {
        return this.detached;
    }

    public final Boolean getEnded() {
        return this.ended;
    }

    public final BigInteger getInsertedSamplesForDeceleration() {
        return this.insertedSamplesForDeceleration;
    }

    public final Long getInterruptionCount() {
        return this.interruptionCount;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Double getJitter() {
        return this.jitter;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Double getJitterBufferDelay() {
        return this.jitterBufferDelay;
    }

    public final BigInteger getJitterBufferEmittedCount() {
        return this.jitterBufferEmittedCount;
    }

    public final BigInteger getJitterBufferFlushes() {
        return this.jitterBufferFlushes;
    }

    public final Double getJitterBufferTargetDelay() {
        return this.jitterBufferTargetDelay;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Double getLastPacketReceivedTimestamp() {
        return this.lastPacketReceivedTimestamp;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Integer getPacketsLost() {
        return this.packetsLost;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Long getPacketsReceived() {
        return this.packetsReceived;
    }

    public final Double getRelativePacketArrivalDelay() {
        return this.relativePacketArrivalDelay;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack, live.hms.video.connection.degredation.Track
    public Double getRemoteTimestamp() {
        return this.remoteTimestamp;
    }

    public final BigInteger getRemovedSamplesForAcceleration() {
        return this.removedSamplesForAcceleration;
    }

    public final BigInteger getSilentConcealedSamples() {
        return this.silentConcealedSamples;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Long getSsrc() {
        return this.ssrc;
    }

    @Override // live.hms.video.connection.degredation.RemoteTrack
    public Double getTimestampUs() {
        return this.timestampUs;
    }

    public final Double getTotalAudioEnergy() {
        return this.totalAudioEnergy;
    }

    public final Double getTotalInterruptionDuration() {
        return this.totalInterruptionDuration;
    }

    public final Double getTotalSamplesDuration() {
        return this.totalSamplesDuration;
    }

    public final BigInteger getTotalSamplesReceived() {
        return this.totalSamplesReceived;
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
        BigInteger bigInteger = this.bytesTransported;
        int iHashCode3 = (iHashCode2 + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        Long l7 = this.packetsReceived;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Double d14 = this.remoteTimestamp;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.timestampUs;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str = this.trackIdentifier;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.ssrc;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Double d16 = this.lastPacketReceivedTimestamp;
        int iHashCode9 = (iHashCode8 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Boolean bool = this.ended;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.detached;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d17 = this.jitterBufferDelay;
        int iHashCode12 = (iHashCode11 + (d17 == null ? 0 : d17.hashCode())) * 31;
        BigInteger bigInteger2 = this.jitterBufferEmittedCount;
        int iHashCode13 = (iHashCode12 + (bigInteger2 == null ? 0 : bigInteger2.hashCode())) * 31;
        Double d18 = this.audioLevel;
        int iHashCode14 = (iHashCode13 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.totalAudioEnergy;
        int iHashCode15 = (iHashCode14 + (d19 == null ? 0 : d19.hashCode())) * 31;
        BigInteger bigInteger3 = this.totalSamplesReceived;
        int iHashCode16 = (iHashCode15 + (bigInteger3 == null ? 0 : bigInteger3.hashCode())) * 31;
        Double d24 = this.totalSamplesDuration;
        int iHashCode17 = (iHashCode16 + (d24 == null ? 0 : d24.hashCode())) * 31;
        BigInteger bigInteger4 = this.concealedSamples;
        int iHashCode18 = (iHashCode17 + (bigInteger4 == null ? 0 : bigInteger4.hashCode())) * 31;
        BigInteger bigInteger5 = this.silentConcealedSamples;
        int iHashCode19 = (iHashCode18 + (bigInteger5 == null ? 0 : bigInteger5.hashCode())) * 31;
        BigInteger bigInteger6 = this.concealmentEvents;
        int iHashCode20 = (iHashCode19 + (bigInteger6 == null ? 0 : bigInteger6.hashCode())) * 31;
        BigInteger bigInteger7 = this.insertedSamplesForDeceleration;
        int iHashCode21 = (iHashCode20 + (bigInteger7 == null ? 0 : bigInteger7.hashCode())) * 31;
        BigInteger bigInteger8 = this.removedSamplesForAcceleration;
        int iHashCode22 = (iHashCode21 + (bigInteger8 == null ? 0 : bigInteger8.hashCode())) * 31;
        BigInteger bigInteger9 = this.jitterBufferFlushes;
        int iHashCode23 = (iHashCode22 + (bigInteger9 == null ? 0 : bigInteger9.hashCode())) * 31;
        BigInteger bigInteger10 = this.delayedPacketOutageSamples;
        int iHashCode24 = (iHashCode23 + (bigInteger10 == null ? 0 : bigInteger10.hashCode())) * 31;
        Double d25 = this.relativePacketArrivalDelay;
        int iHashCode25 = (iHashCode24 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.jitterBufferTargetDelay;
        int iHashCode26 = (iHashCode25 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Long l13 = this.interruptionCount;
        int iHashCode27 = (iHashCode26 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Double d27 = this.totalInterruptionDuration;
        return iHashCode27 + (d27 != null ? d27.hashCode() : 0);
    }

    public String toString() {
        return "Audio(jitter=" + this.jitter + ", packetsLost=" + this.packetsLost + ", bytesTransported=" + this.bytesTransported + ", packetsReceived=" + this.packetsReceived + ", remoteTimestamp=" + this.remoteTimestamp + ", timestampUs=" + this.timestampUs + ", trackIdentifier=" + this.trackIdentifier + ", ssrc=" + this.ssrc + ", lastPacketReceivedTimestamp=" + this.lastPacketReceivedTimestamp + ", ended=" + this.ended + ", detached=" + this.detached + ", jitterBufferDelay=" + this.jitterBufferDelay + ", jitterBufferEmittedCount=" + this.jitterBufferEmittedCount + ", audioLevel=" + this.audioLevel + ", totalAudioEnergy=" + this.totalAudioEnergy + ", totalSamplesReceived=" + this.totalSamplesReceived + ", totalSamplesDuration=" + this.totalSamplesDuration + ", concealedSamples=" + this.concealedSamples + ", silentConcealedSamples=" + this.silentConcealedSamples + ", concealmentEvents=" + this.concealmentEvents + ", insertedSamplesForDeceleration=" + this.insertedSamplesForDeceleration + ", removedSamplesForAcceleration=" + this.removedSamplesForAcceleration + ", jitterBufferFlushes=" + this.jitterBufferFlushes + ", delayedPacketOutageSamples=" + this.delayedPacketOutageSamples + ", relativePacketArrivalDelay=" + this.relativePacketArrivalDelay + ", jitterBufferTargetDelay=" + this.jitterBufferTargetDelay + ", interruptionCount=" + this.interruptionCount + ", totalInterruptionDuration=" + this.totalInterruptionDuration + ')';
    }

    private Audio(Double d3, Integer num, BigInteger bigInteger, Long l7, Double d14, Double d15, String str, Long l12, Double d16, Boolean bool, Boolean bool2, Double d17, BigInteger bigInteger2, Double d18, Double d19, BigInteger bigInteger3, Double d24, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8, BigInteger bigInteger9, BigInteger bigInteger10, Double d25, Double d26, Long l13, Double d27) {
        this.jitter = d3;
        this.packetsLost = num;
        this.bytesTransported = bigInteger;
        this.packetsReceived = l7;
        this.remoteTimestamp = d14;
        this.timestampUs = d15;
        this.trackIdentifier = str;
        this.ssrc = l12;
        this.lastPacketReceivedTimestamp = d16;
        this.ended = bool;
        this.detached = bool2;
        this.jitterBufferDelay = d17;
        this.jitterBufferEmittedCount = bigInteger2;
        this.audioLevel = d18;
        this.totalAudioEnergy = d19;
        this.totalSamplesReceived = bigInteger3;
        this.totalSamplesDuration = d24;
        this.concealedSamples = bigInteger4;
        this.silentConcealedSamples = bigInteger5;
        this.concealmentEvents = bigInteger6;
        this.insertedSamplesForDeceleration = bigInteger7;
        this.removedSamplesForAcceleration = bigInteger8;
        this.jitterBufferFlushes = bigInteger9;
        this.delayedPacketOutageSamples = bigInteger10;
        this.relativePacketArrivalDelay = d25;
        this.jitterBufferTargetDelay = d26;
        this.interruptionCount = l13;
        this.totalInterruptionDuration = d27;
    }
}
