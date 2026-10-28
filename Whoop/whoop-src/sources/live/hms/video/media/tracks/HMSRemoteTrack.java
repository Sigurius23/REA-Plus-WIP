package live.hms.video.media.tracks;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Llive/hms/video/media/tracks/HMSRemoteTrack;", "", "isPlaybackAllowed", "", "()Z", "setPlaybackAllowed", "(Z)V", "ssrc", "", "getSsrc", "()J", "setSsrc", "(J)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSRemoteTrack {
    long getSsrc();

    boolean isPlaybackAllowed();

    void setPlaybackAllowed(boolean z4);

    void setSsrc(long j7);
}
