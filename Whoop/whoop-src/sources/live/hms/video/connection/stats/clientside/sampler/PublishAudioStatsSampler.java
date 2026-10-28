package live.hms.video.connection.stats.clientside.sampler;

import ga1.C15620a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.InterfaceC23462h;
import live.hms.video.connection.stats.clientside.model.AudioAnalytics;
import live.hms.video.connection.stats.clientside.model.AudioSamplesPublish;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b+\u0010)R!\u00102\u001a\b\u0012\u0004\u0012\u00020-0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&\"\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0006¢\u0006\f\n\u0004\b:\u00109\u001a\u0004\b;\u00101R\"\u0010<\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u0002070,8\u0006¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u00101R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u0002070,8\u0006¢\u0006\f\n\u0004\bD\u00109\u001a\u0004\bE\u00101¨\u0006F"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/sampler/PublishAudioStatsSampler;", "", "", "SAMPLE_DURATION", "", "trackId", "ssrc", "source", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ll83/a0;", "reset", "()V", "currentTimeStamp", "", "shouldSampleAudio", "(D)Z", "force", "shouldSample", "(DZ)Z", "availableOutgoingBitrate", "bitRate", "add", "(DD)V", "jitter", "", "packetLoss", "roundTripTime", "(DID)V", "hasSample", "()Z", "Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;", "getCollectedSamples", "(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;", "resetSamples", "clearCurrentSampledStats", "D", "getSAMPLE_DURATION", "()D", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "getSsrc", "getSource", "", "Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;", "localAudioSamples$delegate", "Ll83/h;", "getLocalAudioSamples", "()Ljava/util/List;", "localAudioSamples", "START_AUDIO_SAMPLE_DURATION", "getSTART_AUDIO_SAMPLE_DURATION", "setSTART_AUDIO_SAMPLE_DURATION", "(D)V", "", "roundTripTimeMs", "Ljava/util/List;", "jitterMs", "getJitterMs", "totalPacketsLost", "J", "getTotalPacketsLost", "()J", "setTotalPacketsLost", "(J)V", "avgBitrateBps", "getAvgBitrateBps", "avgAvailableOutgoingBitrateBps", "getAvgAvailableOutgoingBitrateBps", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PublishAudioStatsSampler {
    private final double SAMPLE_DURATION;
    private double START_AUDIO_SAMPLE_DURATION;
    private final List<Long> avgAvailableOutgoingBitrateBps;
    private final List<Long> avgBitrateBps;
    private final List<Double> jitterMs;

    /* JADX INFO: renamed from: localAudioSamples$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h localAudioSamples;
    private final List<Long> roundTripTimeMs;
    private final String source;
    private final String ssrc;
    private long totalPacketsLost;
    private final String trackId;

    public PublishAudioStatsSampler(double d3, String trackId, String ssrc, String source) {
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(ssrc, "ssrc");
        AbstractC22676k.m65750j(source, "source");
        this.SAMPLE_DURATION = d3;
        this.trackId = trackId;
        this.ssrc = ssrc;
        this.source = source;
        this.localAudioSamples = AbstractC30060g.m92088H(new C15620a(9));
        this.roundTripTimeMs = new ArrayList();
        this.jitterMs = new ArrayList();
        this.avgBitrateBps = new ArrayList();
        this.avgAvailableOutgoingBitrateBps = new ArrayList();
    }

    public static /* synthetic */ AudioAnalytics getCollectedSamples$default(PublishAudioStatsSampler publishAudioStatsSampler, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return publishAudioStatsSampler.getCollectedSamples(z4);
    }

    private final List<AudioSamplesPublish> getLocalAudioSamples() {
        return (List) this.localAudioSamples.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List localAudioSamples_delegate$lambda$0() {
        return new ArrayList();
    }

    private final void reset() {
        this.START_AUDIO_SAMPLE_DURATION = 0.0d;
        this.roundTripTimeMs.clear();
        this.avgAvailableOutgoingBitrateBps.clear();
        this.jitterMs.clear();
        this.totalPacketsLost = 0L;
        this.avgBitrateBps.clear();
    }

    public static /* synthetic */ boolean shouldSample$default(PublishAudioStatsSampler publishAudioStatsSampler, double d3, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return publishAudioStatsSampler.shouldSample(d3, z4);
    }

    private final boolean shouldSampleAudio(double currentTimeStamp) {
        double d3 = this.START_AUDIO_SAMPLE_DURATION;
        if (d3 <= 0.0d) {
            this.START_AUDIO_SAMPLE_DURATION = currentTimeStamp;
            return false;
        }
        if (currentTimeStamp - d3 < this.SAMPLE_DURATION) {
            return false;
        }
        this.START_AUDIO_SAMPLE_DURATION = currentTimeStamp;
        return true;
    }

    public final void add(double availableOutgoingBitrate, double bitRate) {
        if (availableOutgoingBitrate != 0.0d) {
            this.avgAvailableOutgoingBitrateBps.add(Long.valueOf((long) availableOutgoingBitrate));
        }
        this.avgBitrateBps.add(Long.valueOf(((long) bitRate) * 1000));
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

    public final AudioAnalytics getCollectedSamples(boolean force) {
        if (force) {
            shouldSample(System.currentTimeMillis(), force);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getLocalAudioSamples().iterator();
        while (it.hasNext()) {
            arrayList.add(AudioSamplesPublish.copy$default((AudioSamplesPublish) it.next(), 0L, 0, 0.0f, 0L, 0L, 0L, 63, null));
        }
        return new AudioAnalytics(arrayList, this.trackId, this.ssrc, this.source);
    }

    public final List<Double> getJitterMs() {
        return this.jitterMs;
    }

    public final double getSAMPLE_DURATION() {
        return this.SAMPLE_DURATION;
    }

    public final double getSTART_AUDIO_SAMPLE_DURATION() {
        return this.START_AUDIO_SAMPLE_DURATION;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSsrc() {
        return this.ssrc;
    }

    public final long getTotalPacketsLost() {
        return this.totalPacketsLost;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final boolean hasSample() {
        return !getLocalAudioSamples().isEmpty();
    }

    public final void resetSamples() {
        getLocalAudioSamples().clear();
    }

    public final void setSTART_AUDIO_SAMPLE_DURATION(double d3) {
        this.START_AUDIO_SAMPLE_DURATION = d3;
    }

    public final void setTotalPacketsLost(long j7) {
        this.totalPacketsLost = j7;
    }

    public final boolean shouldSample(double currentTimeStamp, boolean force) {
        if (!shouldSampleAudio(currentTimeStamp) && !force) {
            return false;
        }
        List<AudioSamplesPublish> localAudioSamples = getLocalAudioSamples();
        long j7 = (long) currentTimeStamp;
        int iM74151u0 = this.roundTripTimeMs.isEmpty() ? 0 : (int) AbstractC25265s.m74151u0(this.roundTripTimeMs);
        long jM74151u0 = this.avgAvailableOutgoingBitrateBps.isEmpty() ? 0L : (long) AbstractC25265s.m74151u0(this.avgAvailableOutgoingBitrateBps);
        localAudioSamples.add(new AudioSamplesPublish(j7, iM74151u0, this.jitterMs.isEmpty() ? 0.0f : (float) AbstractC25265s.m74147s0(this.jitterMs), this.totalPacketsLost, this.avgBitrateBps.isEmpty() ? 0L : (long) AbstractC25265s.m74151u0(this.avgBitrateBps), jM74151u0));
        reset();
        return true;
    }

    public final void add(double jitter, int packetLoss, double roundTripTime) {
        this.roundTripTimeMs.add(Long.valueOf((long) (roundTripTime * ((double) 1000))));
        this.totalPacketsLost = packetLoss;
        this.jitterMs.add(Double.valueOf(jitter * 1000.0d));
    }

    public /* synthetic */ PublishAudioStatsSampler(double d3, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, str, str2, (i13 & 8) != 0 ? "regular" : str3);
    }
}
