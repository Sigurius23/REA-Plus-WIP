package live.hms.video.media.tracks;

import hms.webrtc.AudioTrack;
import live.hms.video.media.streams.HMSMediaStream;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/media/tracks/HMSAudioTrack;", "Llive/hms/video/media/tracks/HMSTrack;", "stream", "Llive/hms/video/media/streams/HMSMediaStream;", "nativeTrack", "Lhms/webrtc/AudioTrack;", "source", "", "<init>", "(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;)V", "type", "Llive/hms/video/media/tracks/HMSTrackType;", "getType", "()Llive/hms/video/media/tracks/HMSTrackType;", "isDisposed", "", "isDisposed$lib_release", "()Z", "setDisposed$lib_release", "(Z)V", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class HMSAudioTrack extends HMSTrack {
    private boolean isDisposed;
    private final HMSTrackType type;

    public /* synthetic */ HMSAudioTrack(HMSMediaStream hMSMediaStream, AudioTrack audioTrack, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMSMediaStream, audioTrack, (i13 & 4) != 0 ? "regular" : str);
    }

    @Override // live.hms.video.media.tracks.HMSTrack
    public HMSTrackType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isDisposed$lib_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final void setDisposed$lib_release(boolean z4) {
        this.isDisposed = z4;
    }

    @Override // live.hms.video.media.tracks.HMSTrack
    public String toString() {
        return "HMSAudioTrack{trackId=" + getTrackId() + ", isEnabled=" + getIsEnabled() + '}';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSAudioTrack(HMSMediaStream stream2, AudioTrack nativeTrack, String source) {
        super(stream2, nativeTrack, source);
        AbstractC22676k.m65750j(stream2, "stream");
        AbstractC22676k.m65750j(nativeTrack, "nativeTrack");
        AbstractC22676k.m65750j(source, "source");
        this.type = HMSTrackType.AUDIO;
    }
}
