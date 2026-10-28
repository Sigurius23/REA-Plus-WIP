package live.hms.video.diagnostics;

import live.hms.video.error.HMSException;
import live.hms.video.media.tracks.HMSVideoTrack;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/diagnostics/HMSCameraCheckListener;", "", "Llive/hms/video/media/tracks/HMSVideoTrack;", "localVideoTrack", "Ll83/a0;", "onVideoTrack", "(Llive/hms/video/media/tracks/HMSVideoTrack;)V", "Llive/hms/video/error/HMSException;", "error", "onError", "(Llive/hms/video/error/HMSException;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSCameraCheckListener {
    void onError(HMSException error);

    void onVideoTrack(HMSVideoTrack localVideoTrack);
}
