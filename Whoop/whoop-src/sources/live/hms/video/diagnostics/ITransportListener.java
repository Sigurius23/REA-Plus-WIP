package live.hms.video.diagnostics;

import androidx.core.app.NotificationCompat;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.IceCandidate;
import live.hms.video.error.HMSException;
import live.hms.video.media.tracks.HMSTrack;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0004J!\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Llive/hms/video/diagnostics/ITransportListener;", "", "Ll83/a0;", "onInitFetched", "()V", "", "websocketUrl", "onWebSocketConnected", "(Ljava/lang/String;)V", "", "isPublish", "onICEConnected", "(Z)V", "Lhms/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lhms/webrtc/IceCandidate;Z)V", "onMediaCaptured", "onMediaPublished", "Lhms/webrtc/CandidatePairChangeEvent;", NotificationCompat.CATEGORY_EVENT, "onSelectedCandidatePairChanged", "(Lhms/webrtc/CandidatePairChangeEvent;Z)V", "", "quality", "onNetworkQuality", "(I)V", "onCompleted", "Llive/hms/video/media/tracks/HMSTrack;", "track", "onRTCTrackAdded", "(Llive/hms/video/media/tracks/HMSTrack;)V", "Llive/hms/video/error/HMSException;", "error", "onError", "(Llive/hms/video/error/HMSException;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface ITransportListener {
    void onCompleted();

    void onError(HMSException error);

    void onICEConnected(boolean isPublish);

    void onIceCandidate(IceCandidate candidate, boolean isPublish);

    void onInitFetched();

    void onMediaCaptured();

    void onMediaPublished();

    void onNetworkQuality(int quality);

    void onRTCTrackAdded(HMSTrack track);

    void onSelectedCandidatePairChanged(CandidatePairChangeEvent event, boolean isPublish);

    void onWebSocketConnected(String websocketUrl);
}
