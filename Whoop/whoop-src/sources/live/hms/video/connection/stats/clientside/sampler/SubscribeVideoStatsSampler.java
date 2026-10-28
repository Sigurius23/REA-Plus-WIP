package live.hms.video.connection.stats.clientside.sampler;

import ga1.C15620a;
import hms.webrtc.RTCStats;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23462h;
import live.hms.video.connection.stats.clientside.model.VideoAnalytics;
import live.hms.video.connection.stats.clientside.model.VideoSamplesSubscribe;
import live.hms.video.media.tracks.HMSAudioTrack;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.video.sdk.models.HMSPeer;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\"\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J-\u0010\"\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010(J5\u0010\"\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010*2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010-0,¢\u0006\u0004\b\"\u0010/J\u0017\u00100\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b9\u00108R!\u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u0010DR$\u0010E\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00160:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00160:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010LR\"\u0010\u0017\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\u0019\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010P\u001a\u0004\bU\u0010R\"\u0004\bV\u0010TR\"\u0010\u001a\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\"\u0010Y\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010P\u001a\u0004\bZ\u0010R\"\u0004\b[\u0010TR\"\u0010\\\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010P\u001a\u0004\b]\u0010R\"\u0004\b^\u0010TR\"\u0010_\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010P\u001a\u0004\b`\u0010R\"\u0004\ba\u0010TR\"\u0010b\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010c\u001a\u0004\bh\u0010e\"\u0004\bi\u0010gR\"\u0010$\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010c\u001a\u0004\bj\u0010e\"\u0004\bk\u0010gR\"\u0010%\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010c\u001a\u0004\bl\u0010e\"\u0004\bm\u0010gR\"\u0010&\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010P\u001a\u0004\bn\u0010R\"\u0004\bo\u0010TR\"\u0010'\u001a\u00020O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010P\u001a\u0004\bp\u0010R\"\u0004\bq\u0010TR(\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00180:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010L\u001a\u0004\bs\u0010?\"\u0004\bt\u0010u¨\u0006v"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/sampler/SubscribeVideoStatsSampler;", "", "", "SAMPLE_DURATION", "", "trackId", "ssrc", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "", "hasSample", "()Z", "Ll83/a0;", "resetSamples", "()V", "currentTimeStamp", "forcePublish", "shouldSample", "(DZ)Z", "Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;", "getCollectedSamples", "(Z)Llive/hms/video/connection/stats/clientside/model/VideoAnalytics;", "", "framesReceived", "", "framesDropped", "framesDecoded", "", "pliCount", "nackCount", "frameWidth", "frameHeight", "jitterBufferEmittedCount", "jitterBufferDelay", "add", "(IJJLjava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;D)V", "pauseCount", "freezeCount", "totalPausesDuration", "totalFreezesDuration", "(JJDD)V", "videoEstimatedPlayoutTimestamp", "Llive/hms/video/sdk/models/HMSPeer;", "peer", "Lkotlin/Function1;", "Lhms/webrtc/RTCStats;", "getAudioStats", "(DLlive/hms/video/sdk/models/HMSPeer;Lkotlin/jvm/functions/Function1;)V", "shouldSampleVideo", "(D)Z", "reset", "D", "getSAMPLE_DURATION", "()D", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "getSsrc", "", "Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;", "subscribeVideoStatsSample$delegate", "Ll83/h;", "getSubscribeVideoStatsSample", "()Ljava/util/List;", "subscribeVideoStatsSample", "START_VIDEO_SAMPLE_DURATION", "getSTART_VIDEO_SAMPLE_DURATION", "setSTART_VIDEO_SAMPLE_DURATION", "(D)V", "lastSample", "Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;", "getLastSample", "()Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;", "setLastSample", "(Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;)V", "frameWidthAverage", "Ljava/util/List;", "frameHeightAverage", "bufferJitterDelayAverage", "", "F", "getFramesReceived", "()F", "setFramesReceived", "(F)V", "getFramesDropped", "setFramesDropped", "getFramesDecoded", "setFramesDecoded", "lastFramesReceived", "getLastFramesReceived", "setLastFramesReceived", "lastFramesDropped", "getLastFramesDropped", "setLastFramesDropped", "lastFramesDecoded", "getLastFramesDecoded", "setLastFramesDecoded", "plicount", "I", "getPlicount", "()I", "setPlicount", "(I)V", "getNackCount", "setNackCount", "getPauseCount", "setPauseCount", "getFreezeCount", "setFreezeCount", "getTotalPausesDuration", "setTotalPausesDuration", "getTotalFreezesDuration", "setTotalFreezesDuration", "avSyncMsAvg", "getAvSyncMsAvg", "setAvSyncMsAvg", "(Ljava/util/List;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SubscribeVideoStatsSampler {
    private final double SAMPLE_DURATION;
    private double START_VIDEO_SAMPLE_DURATION;
    private List<Long> avSyncMsAvg;
    private final List<Double> bufferJitterDelayAverage;
    private final List<Integer> frameHeightAverage;
    private final List<Integer> frameWidthAverage;
    private float framesDecoded;
    private float framesDropped;
    private float framesReceived;
    private int freezeCount;
    private float lastFramesDecoded;
    private float lastFramesDropped;
    private float lastFramesReceived;
    private VideoSamplesSubscribe lastSample;
    private int nackCount;
    private int pauseCount;
    private int plicount;
    private final String ssrc;

    /* JADX INFO: renamed from: subscribeVideoStatsSample$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h subscribeVideoStatsSample;
    private float totalFreezesDuration;
    private float totalPausesDuration;
    private final String trackId;

    public SubscribeVideoStatsSampler(double d3, String trackId, String ssrc) {
        AbstractC22676k.m65750j(trackId, "trackId");
        AbstractC22676k.m65750j(ssrc, "ssrc");
        this.SAMPLE_DURATION = d3;
        this.trackId = trackId;
        this.ssrc = ssrc;
        this.subscribeVideoStatsSample = AbstractC30060g.m92088H(new C15620a(12));
        this.frameWidthAverage = new ArrayList();
        this.frameHeightAverage = new ArrayList();
        this.bufferJitterDelayAverage = new ArrayList();
        this.lastFramesReceived = -1.0f;
        this.lastFramesDropped = -1.0f;
        this.lastFramesDecoded = -1.0f;
        this.avSyncMsAvg = new ArrayList();
    }

    private final List<VideoSamplesSubscribe> getSubscribeVideoStatsSample() {
        return (List) this.subscribeVideoStatsSample.getValue();
    }

    private final void reset() {
        this.frameWidthAverage.clear();
        this.frameHeightAverage.clear();
        this.bufferJitterDelayAverage.clear();
        this.avSyncMsAvg.clear();
    }

    public static /* synthetic */ boolean shouldSample$default(SubscribeVideoStatsSampler subscribeVideoStatsSampler, double d3, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return subscribeVideoStatsSampler.shouldSample(d3, z4);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final List subscribeVideoStatsSample_delegate$lambda$0() {
        return new ArrayList();
    }

    public final void add(int framesReceived, long framesDropped, long framesDecoded, Number pliCount, Number nackCount, Number frameWidth, Number frameHeight, Number jitterBufferEmittedCount, double jitterBufferDelay) {
        AbstractC22676k.m65750j(pliCount, "pliCount");
        AbstractC22676k.m65750j(nackCount, "nackCount");
        AbstractC22676k.m65750j(frameWidth, "frameWidth");
        AbstractC22676k.m65750j(frameHeight, "frameHeight");
        AbstractC22676k.m65750j(jitterBufferEmittedCount, "jitterBufferEmittedCount");
        this.framesReceived = framesReceived;
        this.framesDropped = framesDropped;
        this.framesDecoded = framesDecoded;
        this.frameWidthAverage.add(Integer.valueOf(frameWidth.intValue()));
        this.frameHeightAverage.add(Integer.valueOf(frameHeight.intValue()));
        if (jitterBufferEmittedCount.intValue() != 0) {
            this.bufferJitterDelayAverage.add(Double.valueOf(jitterBufferDelay / jitterBufferEmittedCount.doubleValue()));
        }
        this.plicount = pliCount.intValue();
        this.nackCount = nackCount.intValue();
    }

    public final List<Long> getAvSyncMsAvg() {
        return this.avSyncMsAvg;
    }

    public final VideoAnalytics getCollectedSamples(boolean forcePublish) {
        if (forcePublish) {
            shouldSample(System.currentTimeMillis(), forcePublish);
        }
        ArrayList arrayList = new ArrayList();
        for (VideoSamplesSubscribe videoSamplesSubscribe : getSubscribeVideoStatsSample()) {
            arrayList.add(videoSamplesSubscribe.copy((16383 & 1) != 0 ? videoSamplesSubscribe.timestamp : 0L, (16383 & 2) != 0 ? videoSamplesSubscribe.avg_frames_received_per_sec : 0.0f, (16383 & 4) != 0 ? videoSamplesSubscribe.avg_frames_dropped_per_sec : 0.0f, (16383 & 8) != 0 ? videoSamplesSubscribe.avg_frames_decoded_per_sec : 0.0f, (16383 & 16) != 0 ? videoSamplesSubscribe.total_pli_count : 0, (16383 & 32) != 0 ? videoSamplesSubscribe.total_nack_count : 0, (16383 & 64) != 0 ? videoSamplesSubscribe.avg_av_sync_ms : 0, (16383 & 128) != 0 ? videoSamplesSubscribe.frame_width : 0, (16383 & 256) != 0 ? videoSamplesSubscribe.frame_height : 0, (16383 & 512) != 0 ? videoSamplesSubscribe.pause_count : 0, (16383 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? videoSamplesSubscribe.pause_duration_seconds : 0.0f, (16383 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? videoSamplesSubscribe.freeze_count : 0, (16383 & 4096) != 0 ? videoSamplesSubscribe.freeze_duration_seconds : 0.0f, (16383 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? videoSamplesSubscribe.avg_jitter_buffer_delay : 0.0f));
        }
        return new VideoAnalytics(null, arrayList, this.trackId, this.ssrc, "regular");
    }

    public final float getFramesDecoded() {
        return this.framesDecoded;
    }

    public final float getFramesDropped() {
        return this.framesDropped;
    }

    public final float getFramesReceived() {
        return this.framesReceived;
    }

    public final int getFreezeCount() {
        return this.freezeCount;
    }

    public final float getLastFramesDecoded() {
        return this.lastFramesDecoded;
    }

    public final float getLastFramesDropped() {
        return this.lastFramesDropped;
    }

    public final float getLastFramesReceived() {
        return this.lastFramesReceived;
    }

    public final VideoSamplesSubscribe getLastSample() {
        return this.lastSample;
    }

    public final int getNackCount() {
        return this.nackCount;
    }

    public final int getPauseCount() {
        return this.pauseCount;
    }

    public final int getPlicount() {
        return this.plicount;
    }

    public final double getSAMPLE_DURATION() {
        return this.SAMPLE_DURATION;
    }

    public final double getSTART_VIDEO_SAMPLE_DURATION() {
        return this.START_VIDEO_SAMPLE_DURATION;
    }

    public final String getSsrc() {
        return this.ssrc;
    }

    public final float getTotalFreezesDuration() {
        return this.totalFreezesDuration;
    }

    public final float getTotalPausesDuration() {
        return this.totalPausesDuration;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final boolean hasSample() {
        return !getSubscribeVideoStatsSample().isEmpty();
    }

    public final void resetSamples() {
        this.lastSample = (VideoSamplesSubscribe) AbstractC25265s.m74102I0(AbstractC37056f.m118951C(getSubscribeVideoStatsSample()), getSubscribeVideoStatsSample());
        getSubscribeVideoStatsSample().clear();
    }

    public final void setAvSyncMsAvg(List<Long> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.avSyncMsAvg = list;
    }

    public final void setFramesDecoded(float f13) {
        this.framesDecoded = f13;
    }

    public final void setFramesDropped(float f13) {
        this.framesDropped = f13;
    }

    public final void setFramesReceived(float f13) {
        this.framesReceived = f13;
    }

    public final void setFreezeCount(int i13) {
        this.freezeCount = i13;
    }

    public final void setLastFramesDecoded(float f13) {
        this.lastFramesDecoded = f13;
    }

    public final void setLastFramesDropped(float f13) {
        this.lastFramesDropped = f13;
    }

    public final void setLastFramesReceived(float f13) {
        this.lastFramesReceived = f13;
    }

    public final void setLastSample(VideoSamplesSubscribe videoSamplesSubscribe) {
        this.lastSample = videoSamplesSubscribe;
    }

    public final void setNackCount(int i13) {
        this.nackCount = i13;
    }

    public final void setPauseCount(int i13) {
        this.pauseCount = i13;
    }

    public final void setPlicount(int i13) {
        this.plicount = i13;
    }

    public final void setSTART_VIDEO_SAMPLE_DURATION(double d3) {
        this.START_VIDEO_SAMPLE_DURATION = d3;
    }

    public final void setTotalFreezesDuration(float f13) {
        this.totalFreezesDuration = f13;
    }

    public final void setTotalPausesDuration(float f13) {
        this.totalPausesDuration = f13;
    }

    public final boolean shouldSample(double currentTimeStamp, boolean forcePublish) {
        int total_pli_count;
        int total_nack_count;
        int pause_count;
        int freeze_count;
        float freeze_duration_seconds;
        float pause_duration_seconds;
        if (!shouldSampleVideo(currentTimeStamp) && !forcePublish) {
            return false;
        }
        this.lastSample = (VideoSamplesSubscribe) AbstractC25265s.m74102I0(AbstractC37056f.m118951C(getSubscribeVideoStatsSample()), getSubscribeVideoStatsSample());
        List<Long> list = this.avSyncMsAvg;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) obj).longValue() != Long.MAX_VALUE) {
                arrayList.add(obj);
            }
        }
        int size = this.frameWidthAverage.size() == 0 ? 1 : this.frameWidthAverage.size();
        List<VideoSamplesSubscribe> subscribeVideoStatsSample = getSubscribeVideoStatsSample();
        long j7 = (long) currentTimeStamp;
        int iM74149t0 = this.frameWidthAverage.isEmpty() ? 0 : (int) AbstractC25265s.m74149t0(this.frameWidthAverage);
        int iM74149t1 = this.frameHeightAverage.isEmpty() ? 0 : (int) AbstractC25265s.m74149t0(this.frameHeightAverage);
        VideoSamplesSubscribe videoSamplesSubscribe = this.lastSample;
        if (videoSamplesSubscribe == null) {
            total_pli_count = this.plicount;
        } else {
            int i13 = this.plicount;
            AbstractC22676k.m65747g(videoSamplesSubscribe);
            total_pli_count = i13 - videoSamplesSubscribe.getTotal_pli_count();
        }
        int i14 = total_pli_count;
        VideoSamplesSubscribe videoSamplesSubscribe2 = this.lastSample;
        if (videoSamplesSubscribe2 == null) {
            total_nack_count = this.nackCount;
        } else {
            int i15 = this.nackCount;
            AbstractC22676k.m65747g(videoSamplesSubscribe2);
            total_nack_count = i15 - videoSamplesSubscribe2.getTotal_nack_count();
        }
        int i16 = total_nack_count;
        VideoSamplesSubscribe videoSamplesSubscribe3 = this.lastSample;
        if (videoSamplesSubscribe3 == null) {
            pause_count = this.pauseCount;
        } else {
            int i17 = this.pauseCount;
            AbstractC22676k.m65747g(videoSamplesSubscribe3);
            pause_count = i17 - videoSamplesSubscribe3.getPause_count();
        }
        int i18 = pause_count;
        VideoSamplesSubscribe videoSamplesSubscribe4 = this.lastSample;
        if (videoSamplesSubscribe4 == null) {
            freeze_count = this.freezeCount;
        } else {
            int i19 = this.freezeCount;
            AbstractC22676k.m65747g(videoSamplesSubscribe4);
            freeze_count = i19 - videoSamplesSubscribe4.getFreeze_count();
        }
        int i24 = freeze_count;
        VideoSamplesSubscribe videoSamplesSubscribe5 = this.lastSample;
        if (videoSamplesSubscribe5 == null) {
            freeze_duration_seconds = this.totalFreezesDuration;
        } else {
            float f13 = this.totalFreezesDuration;
            AbstractC22676k.m65747g(videoSamplesSubscribe5);
            freeze_duration_seconds = f13 - videoSamplesSubscribe5.getFreeze_duration_seconds();
        }
        float f14 = freeze_duration_seconds;
        VideoSamplesSubscribe videoSamplesSubscribe6 = this.lastSample;
        if (videoSamplesSubscribe6 == null) {
            pause_duration_seconds = this.totalPausesDuration;
        } else {
            float f15 = this.totalPausesDuration;
            AbstractC22676k.m65747g(videoSamplesSubscribe6);
            pause_duration_seconds = f15 - videoSamplesSubscribe6.getPause_duration_seconds();
        }
        float f16 = pause_duration_seconds;
        float fM74147s0 = this.bufferJitterDelayAverage.isEmpty() ? 0.0f : (float) AbstractC25265s.m74147s0(this.bufferJitterDelayAverage);
        float f17 = this.lastFramesReceived;
        float f18 = f17 == -1.0f ? this.framesReceived / size : (this.framesReceived - f17) / size;
        float f19 = this.lastFramesDecoded;
        float f24 = f19 == -1.0f ? this.framesDecoded / size : (this.framesDecoded - f19) / size;
        float f25 = this.lastFramesDropped;
        subscribeVideoStatsSample.add(new VideoSamplesSubscribe(j7, f18, (f25 == -1.0f ? this.framesDropped : this.framesDropped - f25) / size, f24, i14, i16, arrayList.isEmpty() ? 0 : (int) AbstractC25265s.m74151u0(arrayList), iM74149t0, iM74149t1, i18, f16, i24, f14, fM74147s0));
        this.lastFramesReceived = this.framesReceived;
        this.lastFramesDropped = this.framesDropped;
        this.lastFramesDecoded = this.framesDecoded;
        reset();
        return true;
    }

    public final void add(long pauseCount, long freezeCount, double totalPausesDuration, double totalFreezesDuration) {
        this.pauseCount = (int) pauseCount;
        this.freezeCount = (int) freezeCount;
        this.totalPausesDuration = (float) totalPausesDuration;
        this.totalFreezesDuration = (float) totalFreezesDuration;
    }

    public final void add(double videoEstimatedPlayoutTimestamp, HMSPeer peer, Function1 getAudioStats) {
        HMSVideoTrack videoTrack;
        HMSAudioTrack audioTrack;
        HMSAudioTrack audioTrack2;
        HMSAudioTrack audioTrack3;
        HMSVideoTrack videoTrack2;
        AbstractC22676k.m65750j(getAudioStats, "getAudioStats");
        long jDoubleValue = Long.MAX_VALUE;
        if ((peer != null && (videoTrack2 = peer.getVideoTrack()) != null && videoTrack2.getIsMute()) || (peer != null && (audioTrack3 = peer.getAudioTrack()) != null && audioTrack3.getIsMute())) {
            this.avSyncMsAvg.add(Long.MAX_VALUE);
            return;
        }
        if ((peer != null ? peer.getVideoTrack() : null) != null) {
            if ((peer != null ? peer.getAudioTrack() : null) == null || peer == null || (videoTrack = peer.getVideoTrack()) == null || videoTrack.getIsMute() || peer == null || (audioTrack = peer.getAudioTrack()) == null || audioTrack.getIsMute()) {
                return;
            }
            String trackId = (peer == null || (audioTrack2 = peer.getAudioTrack()) == null) ? null : audioTrack2.getTrackId();
            if (trackId == null) {
                trackId = "";
            }
            RTCStats rTCStats = (RTCStats) getAudioStats.invoke(trackId);
            List<Long> list = this.avSyncMsAvg;
            if (rTCStats != null) {
                Object obj = rTCStats.getMembers().get("estimatedPlayoutTimestamp");
                Double d3 = obj instanceof Double ? (Double) obj : null;
                jDoubleValue = ((long) (d3 != null ? d3.doubleValue() : 0.0d)) - ((long) videoEstimatedPlayoutTimestamp);
            }
            list.add(Long.valueOf(jDoubleValue));
        }
    }
}
