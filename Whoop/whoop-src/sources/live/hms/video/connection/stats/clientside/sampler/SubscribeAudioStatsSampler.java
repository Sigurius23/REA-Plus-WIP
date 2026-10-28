package live.hms.video.connection.stats.clientside.sampler;

import ga1.C15620a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.InterfaceC23462h;
import live.hms.video.connection.stats.clientside.model.AudioAnalytics;
import live.hms.video.connection.stats.clientside.model.AudioSamplesSubscribe;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\"\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015Je\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b/\u0010.R!\u00106\u001a\b\u0012\u0004\u0012\u000201008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+\"\u0004\b9\u0010:R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020;008\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u00105R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u00105R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010A\u001a\u0004\bF\u0010C\"\u0004\bG\u0010ER\"\u0010\u001b\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER\"\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010A\u001a\u0004\bL\u0010C\"\u0004\bM\u0010ER\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010 \u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010A\u001a\u0004\bS\u0010C\"\u0004\bT\u0010ER\"\u0010!\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010A\u001a\u0004\bU\u0010C\"\u0004\bV\u0010ER$\u0010W\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006]"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/sampler/SubscribeAudioStatsSampler;", "", "", "SAMPLE_DURATION", "", "trackId", "ssrc", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "currentTimeStamp", "", "forcePublish", "shouldSample", "(DZ)Z", "hasSample", "()Z", "Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;", "getCollectedSamples", "(Z)Llive/hms/video/connection/stats/clientside/model/AudioAnalytics;", "Ll83/a0;", "resetSamples", "()V", "audioLevel", "", "audioConcealedSamples", "", "audioTotalSampleReceived", "audioConcealmentEvents", "fecPacketDiscarded", "fecPacketReceived", "", "totalSampleDuration", "totalPacketReceived", "totalPacketLost", "jitterBufferDelay", "jitterBufferEmittedCount", "add", "(DJLjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;FJJDLjava/lang/Number;)V", "shouldSampleAudio", "(D)Z", "reset", "D", "getSAMPLE_DURATION", "()D", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "getSsrc", "", "Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;", "subscribeAudioStatsSample$delegate", "Ll83/h;", "getSubscribeAudioStatsSample", "()Ljava/util/List;", "subscribeAudioStatsSample", "START_AUDIO_SAMPLE_DURATION", "getSTART_AUDIO_SAMPLE_DURATION", "setSTART_AUDIO_SAMPLE_DURATION", "(D)V", "", "audioLevelList", "Ljava/util/List;", "getAudioLevelList", "jitterBufferDelayAverage", "getJitterBufferDelayAverage", "J", "getAudioConcealedSamples", "()J", "setAudioConcealedSamples", "(J)V", "getAudioTotalSampleReceived", "setAudioTotalSampleReceived", "getAudioConcealmentEvents", "setAudioConcealmentEvents", "getFecPacketDiscarded", "setFecPacketDiscarded", "getFecPacketReceived", "setFecPacketReceived", "F", "getTotalSampleDuration", "()F", "setTotalSampleDuration", "(F)V", "getTotalPacketReceived", "setTotalPacketReceived", "getTotalPacketLost", "setTotalPacketLost", "lastSample", "Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;", "getLastSample", "()Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;", "setLastSample", "(Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SubscribeAudioStatsSampler {
    private final double SAMPLE_DURATION;
    private double START_AUDIO_SAMPLE_DURATION;
    private long audioConcealedSamples;
    private long audioConcealmentEvents;
    private final List<Integer> audioLevelList;
    private long audioTotalSampleReceived;
    private long fecPacketDiscarded;
    private long fecPacketReceived;
    private final List<Double> jitterBufferDelayAverage;
    private AudioSamplesSubscribe lastSample;
    private final String ssrc;

    /* JADX INFO: renamed from: subscribeAudioStatsSample$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h subscribeAudioStatsSample;
    private long totalPacketLost;
    private long totalPacketReceived;
    private float totalSampleDuration;
    private final String trackId;

    public SubscribeAudioStatsSampler(double d3, String trackId, String ssrc) {
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(ssrc, "ssrc");
        this.SAMPLE_DURATION = d3;
        this.trackId = trackId;
        this.ssrc = ssrc;
        this.subscribeAudioStatsSample = AbstractC30060g.m92088H(new C15620a(11));
        this.audioLevelList = new ArrayList();
        this.jitterBufferDelayAverage = new ArrayList();
    }

    private final List<AudioSamplesSubscribe> getSubscribeAudioStatsSample() {
        return (List) this.subscribeAudioStatsSample.getValue();
    }

    private final void reset() {
        this.audioLevelList.clear();
        this.jitterBufferDelayAverage.clear();
    }

    public static /* synthetic */ boolean shouldSample$default(SubscribeAudioStatsSampler subscribeAudioStatsSampler, double d3, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return subscribeAudioStatsSampler.shouldSample(d3, z4);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final List subscribeAudioStatsSample_delegate$lambda$0() {
        return new ArrayList();
    }

    public final void add(double audioLevel, long audioConcealedSamples, Number audioTotalSampleReceived, Number audioConcealmentEvents, Number fecPacketDiscarded, Number fecPacketReceived, float totalSampleDuration, long totalPacketReceived, long totalPacketLost, double jitterBufferDelay, Number jitterBufferEmittedCount) {
        AbstractC22676k.m65750j(audioTotalSampleReceived, "audioTotalSampleReceived");
        AbstractC22676k.m65750j(audioConcealmentEvents, "audioConcealmentEvents");
        AbstractC22676k.m65750j(fecPacketDiscarded, "fecPacketDiscarded");
        AbstractC22676k.m65750j(fecPacketReceived, "fecPacketReceived");
        AbstractC22676k.m65750j(jitterBufferEmittedCount, "jitterBufferEmittedCount");
        this.audioLevelList.add(Integer.valueOf(audioLevel > 0.05d ? 1 : 0));
        this.audioConcealedSamples = audioConcealedSamples;
        this.audioTotalSampleReceived = audioTotalSampleReceived.longValue();
        this.audioConcealmentEvents = audioConcealmentEvents.longValue();
        this.fecPacketDiscarded = fecPacketDiscarded.longValue();
        this.fecPacketReceived = fecPacketReceived.longValue();
        this.totalSampleDuration = totalSampleDuration;
        this.totalPacketReceived = totalPacketReceived;
        this.totalPacketLost = totalPacketLost;
        if (jitterBufferEmittedCount.intValue() != 0) {
            this.jitterBufferDelayAverage.add(Double.valueOf(jitterBufferDelay / jitterBufferEmittedCount.doubleValue()));
        }
    }

    public final long getAudioConcealedSamples() {
        return this.audioConcealedSamples;
    }

    public final long getAudioConcealmentEvents() {
        return this.audioConcealmentEvents;
    }

    public final List<Integer> getAudioLevelList() {
        return this.audioLevelList;
    }

    public final long getAudioTotalSampleReceived() {
        return this.audioTotalSampleReceived;
    }

    public final AudioAnalytics getCollectedSamples(boolean forcePublish) {
        if (forcePublish) {
            shouldSample(System.currentTimeMillis(), forcePublish);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getSubscribeAudioStatsSample().iterator();
        while (it.hasNext()) {
            arrayList.add(AudioSamplesSubscribe.copy$default((AudioSamplesSubscribe) it.next(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0.0f, 0L, 0L, 0.0d, 2047, null));
        }
        return new AudioAnalytics(arrayList, this.trackId, this.ssrc, "regular");
    }

    public final long getFecPacketDiscarded() {
        return this.fecPacketDiscarded;
    }

    public final long getFecPacketReceived() {
        return this.fecPacketReceived;
    }

    public final List<Double> getJitterBufferDelayAverage() {
        return this.jitterBufferDelayAverage;
    }

    public final AudioSamplesSubscribe getLastSample() {
        return this.lastSample;
    }

    public final double getSAMPLE_DURATION() {
        return this.SAMPLE_DURATION;
    }

    public final double getSTART_AUDIO_SAMPLE_DURATION() {
        return this.START_AUDIO_SAMPLE_DURATION;
    }

    public final String getSsrc() {
        return this.ssrc;
    }

    public final long getTotalPacketLost() {
        return this.totalPacketLost;
    }

    public final long getTotalPacketReceived() {
        return this.totalPacketReceived;
    }

    public final float getTotalSampleDuration() {
        return this.totalSampleDuration;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final boolean hasSample() {
        return !getSubscribeAudioStatsSample().isEmpty();
    }

    public final void resetSamples() {
        this.lastSample = (AudioSamplesSubscribe) AbstractC25265s.m74102I0(AbstractC37056f.m118951C(getSubscribeAudioStatsSample()), getSubscribeAudioStatsSample());
        getSubscribeAudioStatsSample().clear();
    }

    public final void setAudioConcealedSamples(long j7) {
        this.audioConcealedSamples = j7;
    }

    public final void setAudioConcealmentEvents(long j7) {
        this.audioConcealmentEvents = j7;
    }

    public final void setAudioTotalSampleReceived(long j7) {
        this.audioTotalSampleReceived = j7;
    }

    public final void setFecPacketDiscarded(long j7) {
        this.fecPacketDiscarded = j7;
    }

    public final void setFecPacketReceived(long j7) {
        this.fecPacketReceived = j7;
    }

    public final void setLastSample(AudioSamplesSubscribe audioSamplesSubscribe) {
        this.lastSample = audioSamplesSubscribe;
    }

    public final void setSTART_AUDIO_SAMPLE_DURATION(double d3) {
        this.START_AUDIO_SAMPLE_DURATION = d3;
    }

    public final void setTotalPacketLost(long j7) {
        this.totalPacketLost = j7;
    }

    public final void setTotalPacketReceived(long j7) {
        this.totalPacketReceived = j7;
    }

    public final void setTotalSampleDuration(float f13) {
        this.totalSampleDuration = f13;
    }

    public final boolean shouldSample(double currentTimeStamp, boolean forcePublish) {
        long audio_concealed_samples;
        long audio_total_samples_received;
        long audio_concealment_events;
        long fec_packets_discarded;
        float total_samples_duration;
        long total_packets_lost;
        if (!shouldSampleAudio(currentTimeStamp) && !forcePublish) {
            return false;
        }
        this.lastSample = (AudioSamplesSubscribe) AbstractC25265s.m74102I0(AbstractC37056f.m118951C(getSubscribeAudioStatsSample()), getSubscribeAudioStatsSample());
        List<AudioSamplesSubscribe> subscribeAudioStatsSample = getSubscribeAudioStatsSample();
        long j7 = (long) currentTimeStamp;
        long jM74154v1 = this.audioLevelList.isEmpty() ? 0L : AbstractC25265s.m74154v1(this.audioLevelList);
        AudioSamplesSubscribe audioSamplesSubscribe = this.lastSample;
        if (audioSamplesSubscribe == null) {
            audio_concealed_samples = this.audioConcealedSamples;
        } else {
            long j13 = this.audioConcealedSamples;
            AbstractC22676k.m65747g(audioSamplesSubscribe);
            audio_concealed_samples = j13 - audioSamplesSubscribe.getAudio_concealed_samples();
        }
        AudioSamplesSubscribe audioSamplesSubscribe2 = this.lastSample;
        if (audioSamplesSubscribe2 == null) {
            audio_total_samples_received = this.audioTotalSampleReceived;
        } else {
            long j14 = this.audioTotalSampleReceived;
            AbstractC22676k.m65747g(audioSamplesSubscribe2);
            audio_total_samples_received = j14 - audioSamplesSubscribe2.getAudio_total_samples_received();
        }
        AudioSamplesSubscribe audioSamplesSubscribe3 = this.lastSample;
        if (audioSamplesSubscribe3 == null) {
            audio_concealment_events = this.audioConcealmentEvents;
        } else {
            long j15 = this.audioConcealmentEvents;
            AbstractC22676k.m65747g(audioSamplesSubscribe3);
            audio_concealment_events = j15 - audioSamplesSubscribe3.getAudio_concealment_events();
        }
        AudioSamplesSubscribe audioSamplesSubscribe4 = this.lastSample;
        if (audioSamplesSubscribe4 == null) {
            fec_packets_discarded = this.fecPacketDiscarded;
        } else {
            long j16 = this.fecPacketDiscarded;
            AbstractC22676k.m65747g(audioSamplesSubscribe4);
            fec_packets_discarded = j16 - audioSamplesSubscribe4.getFec_packets_discarded();
        }
        AudioSamplesSubscribe audioSamplesSubscribe5 = this.lastSample;
        long fec_packets_received = this.fecPacketReceived;
        if (audioSamplesSubscribe5 != null) {
            AbstractC22676k.m65747g(audioSamplesSubscribe5);
            fec_packets_received -= audioSamplesSubscribe5.getFec_packets_received();
        }
        AudioSamplesSubscribe audioSamplesSubscribe6 = this.lastSample;
        if (audioSamplesSubscribe6 == null) {
            total_samples_duration = this.totalSampleDuration;
        } else {
            float f13 = this.totalSampleDuration;
            AbstractC22676k.m65747g(audioSamplesSubscribe6);
            total_samples_duration = f13 - audioSamplesSubscribe6.getTotal_samples_duration();
        }
        AudioSamplesSubscribe audioSamplesSubscribe7 = this.lastSample;
        long j17 = fec_packets_received;
        long total_packets_received = this.totalPacketReceived;
        if (audioSamplesSubscribe7 != null) {
            AbstractC22676k.m65747g(audioSamplesSubscribe7);
            total_packets_received -= audioSamplesSubscribe7.getTotal_packets_received();
        }
        long j18 = total_packets_received;
        AudioSamplesSubscribe audioSamplesSubscribe8 = this.lastSample;
        if (audioSamplesSubscribe8 == null) {
            total_packets_lost = this.totalPacketLost;
        } else {
            long j19 = this.totalPacketLost;
            AbstractC22676k.m65747g(audioSamplesSubscribe8);
            total_packets_lost = j19 - audioSamplesSubscribe8.getTotal_packets_lost();
        }
        subscribeAudioStatsSample.add(new AudioSamplesSubscribe(j7, jM74154v1, audio_concealed_samples, audio_total_samples_received, audio_concealment_events, fec_packets_discarded, j17, total_samples_duration, j18, total_packets_lost, this.jitterBufferDelayAverage.isEmpty() ? 0.0d : AbstractC25265s.m74147s0(this.jitterBufferDelayAverage)));
        reset();
        return true;
    }
}
