package live.hms.video.connection.stats.clientside.sampler;

import ga1.C15620a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.QualityLimitationReasons;
import live.hms.video.connection.stats.clientside.model.QualityLimitation;
import live.hms.video.connection.stats.clientside.model.Size;
import live.hms.video.connection.stats.clientside.model.VideoAnalytics;
import live.hms.video.connection.stats.clientside.model.VideoSamplesPublish;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJa\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\"J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u001c¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010*J\u0017\u0010-\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b6\u00104R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b7\u00104R!\u0010>\u001a\b\u0012\u0004\u0012\u000209088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0019088\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010=R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010=R\"\u0010G\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010/\u001a\u0004\bM\u00101\"\u0004\bN\u0010OR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010H\u001a\u0004\bP\u0010J\"\u0004\bQ\u0010LR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020\u0019088\u0006¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bS\u0010=R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0010088\u0006¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\bT\u0010=R\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\u0019088\u0006¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bV\u0010=R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010/\u001a\u0004\b]\u00101\"\u0004\b^\u0010O¨\u0006_"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/sampler/PublishVideoStatsSampler;", "", "", "SAMPLE_DURATION", "", "trackId", "rid", "ssrc", "source", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "currentTimeStamp", "", "isForceSample", "shouldSample", "(DZ)Z", "", "width", "height", "Llive/hms/video/connection/degredation/QualityLimitationReasons;", "qualityReasons", "availableOutgoingBitrate", "fps", "bitRate", "totalPacketSendDelay", "", "packetsSent", "timestamp", "Ll83/a0;", "add", "(Ljava/lang/Integer;Ljava/lang/Integer;Llive/hms/video/connection/degredation/QualityLimitationReasons;DILjava/lang/String;DDJD)V", "jitter", "packetLoss", "roundTripTime", "(DID)V", "hasSample", "()Z", "force", "Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;", "getCollectedSamples", "(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;", "resetSamples", "()V", "clearCurrentSampledStats", "reset", "shouldSampleVideo", "(D)Z", "D", "getSAMPLE_DURATION", "()D", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "getRid", "getSsrc", "getSource", "", "Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;", "localVideoSamples$delegate", "Ll83/h;", "getLocalVideoSamples", "()Ljava/util/List;", "localVideoSamples", "lastKnownWidth", "Ljava/lang/Integer;", "lastKnownHeight", "roundTripTimeMs", "Ljava/util/List;", "getRoundTripTimeMs", "jitterMs", "getJitterMs", "totalPacketsLost", "J", "getTotalPacketsLost", "()J", "setTotalPacketsLost", "(J)V", "getTotalPacketSendDelay", "setTotalPacketSendDelay", "(D)V", "getPacketsSent", "setPacketsSent", "avgBitrateBps", "getAvgBitrateBps", "getFps", "avgAvailableOutgoingBitrateBps", "getAvgAvailableOutgoingBitrateBps", "Llive/hms/video/connection/degredation/QualityLimitationReasons;", "getQualityReasons", "()Llive/hms/video/connection/degredation/QualityLimitationReasons;", "setQualityReasons", "(Llive/hms/video/connection/degredation/QualityLimitationReasons;)V", "START_VIDEO_SAMPLE_DURATION", "getSTART_VIDEO_SAMPLE_DURATION", "setSTART_VIDEO_SAMPLE_DURATION", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PublishVideoStatsSampler {
    private final double SAMPLE_DURATION;
    private double START_VIDEO_SAMPLE_DURATION;
    private final List<Long> avgAvailableOutgoingBitrateBps;
    private final List<Long> avgBitrateBps;
    private final List<Integer> fps;
    private final List<Double> jitterMs;
    private Integer lastKnownHeight;
    private Integer lastKnownWidth;

    /* JADX INFO: renamed from: localVideoSamples$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h localVideoSamples;
    private long packetsSent;
    private QualityLimitationReasons qualityReasons;
    private final String rid;
    private final List<Long> roundTripTimeMs;
    private final String source;
    private final String ssrc;
    private double totalPacketSendDelay;
    private long totalPacketsLost;
    private final String trackId;

    public PublishVideoStatsSampler(double d3, String trackId, String str, String ssrc, String source) {
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(ssrc, "ssrc");
        AbstractC22676k.m65750j(source, "source");
        this.SAMPLE_DURATION = d3;
        this.trackId = trackId;
        this.rid = str;
        this.ssrc = ssrc;
        this.source = source;
        this.localVideoSamples = AbstractC30060g.m92088H(new C15620a(10));
        this.roundTripTimeMs = new ArrayList();
        this.jitterMs = new ArrayList();
        this.avgBitrateBps = new ArrayList();
        this.fps = new ArrayList();
        this.avgAvailableOutgoingBitrateBps = new ArrayList();
        this.START_VIDEO_SAMPLE_DURATION = -1.0d;
    }

    public static /* synthetic */ VideoAnalytics getCollectedSamples$default(PublishVideoStatsSampler publishVideoStatsSampler, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return publishVideoStatsSampler.getCollectedSamples(z4);
    }

    private final List<VideoSamplesPublish> getLocalVideoSamples() {
        return (List) this.localVideoSamples.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List localVideoSamples_delegate$lambda$0() {
        return new ArrayList();
    }

    private final void reset() {
        this.START_VIDEO_SAMPLE_DURATION = 0.0d;
        this.roundTripTimeMs.clear();
        this.avgAvailableOutgoingBitrateBps.clear();
        this.fps.clear();
        this.jitterMs.clear();
        this.totalPacketsLost = 0L;
        this.avgBitrateBps.clear();
    }

    public static /* synthetic */ boolean shouldSample$default(PublishVideoStatsSampler publishVideoStatsSampler, double d3, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return publishVideoStatsSampler.shouldSample(d3, z4);
    }

    private final boolean shouldSampleVideo(double currentTimeStamp) {
        double d3 = this.START_VIDEO_SAMPLE_DURATION;
        if (d3 <= 0.0d) {
            this.START_VIDEO_SAMPLE_DURATION = currentTimeStamp;
            return false;
        }
        if (currentTimeStamp - d3 < this.SAMPLE_DURATION) {
            return false;
        }
        this.START_VIDEO_SAMPLE_DURATION = currentTimeStamp;
        return true;
    }

    public final void add(Integer width, Integer height, QualityLimitationReasons qualityReasons, double availableOutgoingBitrate, int fps, String trackId, double bitRate, double totalPacketSendDelay, long packetsSent, double timestamp) {
        AbstractC22676k.m65750j(qualityReasons, "qualityReasons");
        AbstractC22676k.m65750j(trackId, "trackId");
        Integer num = this.lastKnownWidth;
        if (num == null || this.lastKnownHeight == null || AbstractC22676k.m65745e(num, width) || AbstractC22676k.m65745e(this.lastKnownHeight, height)) {
            this.lastKnownWidth = width;
            this.lastKnownHeight = height;
            if (availableOutgoingBitrate != 0.0d) {
                this.avgAvailableOutgoingBitrateBps.add(Long.valueOf((long) availableOutgoingBitrate));
            }
            this.qualityReasons = qualityReasons;
            this.fps.add(Integer.valueOf(fps));
            this.avgBitrateBps.add(Long.valueOf(((long) bitRate) * 1000));
        } else {
            this.lastKnownWidth = width;
            this.lastKnownHeight = height;
            shouldSample(timestamp, true);
        }
        this.packetsSent = packetsSent;
        this.totalPacketSendDelay = totalPacketSendDelay;
    }

    public final void clearCurrentSampledStats() {
        resetSamples();
        reset();
    }

    public final List<Long> getAvgAvailableOutgoingBitrateBps() {
        return this.avgAvailableOutgoingBitrateBps;
    }

    public final List<Long> getAvgBitrateBps() {
        return this.avgBitrateBps;
    }

    public final VideoAnalytics getCollectedSamples(boolean force) {
        if (force) {
            shouldSample(System.currentTimeMillis(), true);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getLocalVideoSamples().iterator();
        while (it.hasNext()) {
            arrayList.add(VideoSamplesPublish.copy$default((VideoSamplesPublish) it.next(), null, 0, null, 0L, 0, 0.0f, 0L, 0L, 0L, 0.0d, 0L, 2047, null));
        }
        return new VideoAnalytics(this.rid, arrayList, this.trackId, this.ssrc, this.source);
    }

    public final List<Integer> getFps() {
        return this.fps;
    }

    public final List<Double> getJitterMs() {
        return this.jitterMs;
    }

    public final long getPacketsSent() {
        return this.packetsSent;
    }

    public final QualityLimitationReasons getQualityReasons() {
        return this.qualityReasons;
    }

    public final String getRid() {
        return this.rid;
    }

    public final List<Long> getRoundTripTimeMs() {
        return this.roundTripTimeMs;
    }

    public final double getSAMPLE_DURATION() {
        return this.SAMPLE_DURATION;
    }

    public final double getSTART_VIDEO_SAMPLE_DURATION() {
        return this.START_VIDEO_SAMPLE_DURATION;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSsrc() {
        return this.ssrc;
    }

    public final double getTotalPacketSendDelay() {
        return this.totalPacketSendDelay;
    }

    public final long getTotalPacketsLost() {
        return this.totalPacketsLost;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final boolean hasSample() {
        return !getLocalVideoSamples().isEmpty();
    }

    public final void resetSamples() {
        getLocalVideoSamples().clear();
    }

    public final void setPacketsSent(long j7) {
        this.packetsSent = j7;
    }

    public final void setQualityReasons(QualityLimitationReasons qualityLimitationReasons) {
        this.qualityReasons = qualityLimitationReasons;
    }

    public final void setSTART_VIDEO_SAMPLE_DURATION(double d3) {
        this.START_VIDEO_SAMPLE_DURATION = d3;
    }

    public final void setTotalPacketSendDelay(double d3) {
        this.totalPacketSendDelay = d3;
    }

    public final void setTotalPacketsLost(long j7) {
        this.totalPacketsLost = j7;
    }

    public final boolean shouldSample(double currentTimeStamp, boolean isForceSample) {
        Double cpu;
        Double bandWidth;
        if (!isForceSample && !shouldSampleVideo(currentTimeStamp)) {
            return false;
        }
        List<VideoSamplesPublish> localVideoSamples = getLocalVideoSamples();
        long j7 = (long) currentTimeStamp;
        int iM74151u0 = this.roundTripTimeMs.isEmpty() ? 0 : (int) AbstractC25265s.m74151u0(this.roundTripTimeMs);
        long jM74151u0 = this.avgAvailableOutgoingBitrateBps.isEmpty() ? 0L : (long) AbstractC25265s.m74151u0(this.avgAvailableOutgoingBitrateBps);
        long jM74151u1 = this.avgBitrateBps.isEmpty() ? 0L : (long) AbstractC25265s.m74151u0(this.avgBitrateBps);
        float fM74147s0 = this.jitterMs.isEmpty() ? 0.0f : (float) AbstractC25265s.m74147s0(this.jitterMs);
        long j13 = this.totalPacketsLost;
        int iM74149t0 = this.fps.isEmpty() ? 0 : (int) AbstractC25265s.m74149t0(this.fps);
        QualityLimitationReasons qualityLimitationReasons = this.qualityReasons;
        float fDoubleValue = (qualityLimitationReasons == null || (bandWidth = qualityLimitationReasons.getBandWidth()) == null) ? 0.0f : (float) bandWidth.doubleValue();
        QualityLimitationReasons qualityLimitationReasons2 = this.qualityReasons;
        QualityLimitation qualityLimitation = new QualityLimitation(fDoubleValue, (qualityLimitationReasons2 == null || (cpu = qualityLimitationReasons2.getCpu()) == null) ? 0.0f : (float) cpu.doubleValue());
        Integer num = this.lastKnownWidth;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.lastKnownHeight;
        localVideoSamples.add(new VideoSamplesPublish(qualityLimitation, iM74149t0, new Size(iIntValue, num2 != null ? num2.intValue() : 0), j7, iM74151u0, fM74147s0, j13, jM74151u1, jM74151u0, this.totalPacketSendDelay, this.packetsSent));
        reset();
        return true;
    }

    public final void add(double jitter, int packetLoss, double roundTripTime) {
        this.totalPacketsLost = packetLoss;
        this.jitterMs.add(Double.valueOf(jitter * 1000.0d));
        this.roundTripTimeMs.add(Long.valueOf((long) (roundTripTime * 1000.0d)));
    }

    public /* synthetic */ PublishVideoStatsSampler(double d3, String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, str, str2, str3, (i13 & 16) != 0 ? "regular" : str4);
    }
}
