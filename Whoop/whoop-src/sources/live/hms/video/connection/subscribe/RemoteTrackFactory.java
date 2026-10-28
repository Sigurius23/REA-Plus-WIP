package live.hms.video.connection.subscribe;

import hms.webrtc.AudioTrack;
import hms.webrtc.MediaStreamTrack;
import hms.webrtc.VideoTrack;
import live.hms.video.media.streams.HMSRemoteStream;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m65681d2 = {"Llive/hms/video/connection/subscribe/RemoteTrackFactory;", "", "<init>", "()V", "createRemoteTrack", "Llive/hms/video/media/tracks/HMSTrack;", "track", "Lhms/webrtc/MediaStreamTrack;", "remote", "Llive/hms/video/media/streams/HMSRemoteStream;", "ssrc", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class RemoteTrackFactory {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSTrackType.values().length];
            try {
                iArr[HMSTrackType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSTrackType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final HMSTrack createRemoteTrack(MediaStreamTrack track, HMSRemoteStream remote, long ssrc) {
        AbstractC22676k.m65750j(track, "track");
        AbstractC22676k.m65750j(remote, "remote");
        int i13 = WhenMappings.$EnumSwitchMapping$0[HMSTrackType.INSTANCE.from$lib_release(track).ordinal()];
        if (i13 == 1) {
            return new HMSRemoteAudioTrack(remote, (AudioTrack) track, null, ssrc, 4, null);
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new HMSRemoteVideoTrack(remote, (VideoTrack) track, null, ssrc, 4, null);
    }
}
