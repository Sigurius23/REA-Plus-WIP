package live.hms.video.media.streams;

import hms.webrtc.MediaStream;
import java.util.ArrayList;
import live.hms.video.media.tracks.HMSTrack;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/media/streams/HMSMediaStream;", "", "Lhms/webrtc/MediaStream;", "nativeStream", "<init>", "(Lhms/webrtc/MediaStream;)V", "Ll83/a0;", "stop", "()V", "Lhms/webrtc/MediaStream;", "getNativeStream", "()Lhms/webrtc/MediaStream;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Llive/hms/video/media/tracks/HMSTrack;", "tracks", "Ljava/util/ArrayList;", "getTracks", "()Ljava/util/ArrayList;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class HMSMediaStream {
    private final String id;
    private final MediaStream nativeStream;
    private final ArrayList<HMSTrack> tracks;

    public HMSMediaStream(MediaStream nativeStream) {
        AbstractC22676k.m65750j(nativeStream, "nativeStream");
        this.nativeStream = nativeStream;
        String id4 = nativeStream.getId();
        AbstractC22676k.m65749i(id4, "getId(...)");
        this.id = id4;
        this.tracks = new ArrayList<>();
    }

    public final String getId() {
        return this.id;
    }

    public final MediaStream getNativeStream() {
        return this.nativeStream;
    }

    public final ArrayList<HMSTrack> getTracks() {
        return this.tracks;
    }

    public final void stop() {
        this.nativeStream.dispose();
    }
}
