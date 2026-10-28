package live.hms.video.media.tracks;

import hms.webrtc.MediaStreamTrack;
import hms.webrtc.VideoSink;
import hms.webrtc.VideoTrack;
import live.hms.video.media.streams.HMSMediaStream;
import live.hms.video.sdk.HMSAddSinkResultListener;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010$¨\u0006("}, m65681d2 = {"Llive/hms/video/media/tracks/HMSVideoTrack;", "Llive/hms/video/media/tracks/HMSTrack;", "Llive/hms/video/media/streams/HMSMediaStream;", "stream", "Lhms/webrtc/VideoTrack;", "nativeTrack", "", "source", "<init>", "(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;)V", "Lhms/webrtc/VideoSink;", "sink", "Llive/hms/video/sdk/HMSAddSinkResultListener;", "resultListener", "Ll83/a0;", "addSink", "(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V", "removeSink", "(Lhms/webrtc/VideoSink;)V", "toString", "()Ljava/lang/String;", "TAG", "Ljava/lang/String;", "Llive/hms/video/media/tracks/HMSTrackType;", "type", "Llive/hms/video/media/tracks/HMSTrackType;", "getType", "()Llive/hms/video/media/tracks/HMSTrackType;", "", "value", "isAdded", "Z", "isAdded$lib_release", "()Z", "isDegraded", "setDegraded$lib_release", "(Z)V", "isDisposed", "isDisposed$lib_release", "setDisposed$lib_release", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class HMSVideoTrack extends HMSTrack {
    private final String TAG;
    private boolean isAdded;
    private boolean isDegraded;
    private boolean isDisposed;
    private final HMSTrackType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSVideoTrack(HMSMediaStream stream2, VideoTrack nativeTrack, String source) {
        super(stream2, nativeTrack, source);
        AbstractC22676k.m65750j(stream2, "stream");
        AbstractC22676k.m65750j(nativeTrack, "nativeTrack");
        AbstractC22676k.m65750j(source, "source");
        this.TAG = "HMSVideoTrack";
        this.type = HMSTrackType.VIDEO;
    }

    public static /* synthetic */ void addSink$default(HMSVideoTrack hMSVideoTrack, VideoSink videoSink, HMSAddSinkResultListener hMSAddSinkResultListener, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSink");
        }
        if ((i13 & 2) != 0) {
            hMSAddSinkResultListener = null;
        }
        hMSVideoTrack.addSink(videoSink, hMSAddSinkResultListener);
    }

    public void addSink(VideoSink sink, HMSAddSinkResultListener resultListener) {
        AbstractC22676k.m65750j(sink, "sink");
        try {
            if (this.isDisposed) {
                throw new IllegalStateException("native video  track has been disposed");
            }
            MediaStreamTrack nativeTrack$lib_release = getNativeTrack();
            AbstractC22676k.m65748h(nativeTrack$lib_release, "null cannot be cast to non-null type hms.webrtc.VideoTrack");
            ((VideoTrack) nativeTrack$lib_release).addSink(sink);
            this.isAdded = true;
        } catch (IllegalStateException unused) {
            HMSLogger.m71137e(this.TAG, " native track has been disposed");
        }
    }

    @Override // live.hms.video.media.tracks.HMSTrack
    public HMSTrackType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isAdded$lib_release, reason: from getter */
    public final boolean getIsAdded() {
        return this.isAdded;
    }

    /* JADX INFO: renamed from: isDegraded, reason: from getter */
    public boolean getIsDegraded() {
        return this.isDegraded;
    }

    /* JADX INFO: renamed from: isDisposed$lib_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public void removeSink(VideoSink sink) {
        AbstractC22676k.m65750j(sink, "sink");
        try {
            if (this.isDisposed) {
                throw new IllegalStateException("native video  track has been disposed");
            }
            MediaStreamTrack nativeTrack$lib_release = getNativeTrack();
            AbstractC22676k.m65748h(nativeTrack$lib_release, "null cannot be cast to non-null type hms.webrtc.VideoTrack");
            ((VideoTrack) nativeTrack$lib_release).removeSink(sink);
            this.isAdded = false;
        } catch (IllegalStateException unused) {
            HMSLogger.m71137e(this.TAG, " native track has been disposed");
        }
    }

    public void setDegraded$lib_release(boolean z4) {
        this.isDegraded = z4;
    }

    public final void setDisposed$lib_release(boolean z4) {
        this.isDisposed = z4;
    }

    @Override // live.hms.video.media.tracks.HMSTrack
    public String toString() {
        return "HMSVideoTrack{trackId=" + getTrackId() + ", isEnabled=" + getIsEnabled() + ", isDegraded:" + getIsDegraded() + '}';
    }
}
