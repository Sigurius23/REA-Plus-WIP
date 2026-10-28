package live.hms.video.transport;

import androidx.core.app.NotificationCompat;
import com.google.gson.JsonObject;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.IceCandidate;
import io.getstream.chat.android.client.api.QueryParams;
import l83.C23454a0;
import live.hms.video.error.HMSException;
import live.hms.video.media.tracks.HMSLocalTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.transport.models.TransportState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010#J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Llive/hms/video/transport/ITransportObserver;", "", "Lcom/google/gson/JsonObject;", "message", "Ll83/a0;", "onNotification", "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/tracks/HMSTrack;", "track", "onTrackAdd", "(Llive/hms/video/media/tracks/HMSTrack;)V", "onTrackRemove", "Llive/hms/video/transport/models/TransportState;", "state", "Llive/hms/video/error/HMSException;", "error", "onStateChange", "(Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)V", "", QueryParams.URL, "onWebSocketConnected", "(Ljava/lang/String;)V", "", "isPublish", "onICEConnected", "(Z)V", "Lhms/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lhms/webrtc/IceCandidate;Z)V", "Lhms/webrtc/CandidatePairChangeEvent;", NotificationCompat.CATEGORY_EVENT, "onSelectedCandidatePairChanged", "(Lhms/webrtc/CandidatePairChangeEvent;Z)V", "onInitFetched", "()V", "onNonFatalError", "(Llive/hms/video/error/HMSException;)V", "onStopScreenshare", "onStopAudioshare", "Llive/hms/video/media/tracks/HMSLocalTrack;", "localTrack", "onTrackMuteChange", "(Llive/hms/video/media/tracks/HMSLocalTrack;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface ITransportObserver {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onICEConnected(ITransportObserver iTransportObserver, boolean z4) {
        }

        public static void onIceCandidate(ITransportObserver iTransportObserver, IceCandidate candidate, boolean z4) {
            AbstractC22676k.m65750j(candidate, "candidate");
        }

        public static void onInitFetched(ITransportObserver iTransportObserver) {
        }

        public static void onSelectedCandidatePairChanged(ITransportObserver iTransportObserver, CandidatePairChangeEvent candidatePairChangeEvent, boolean z4) {
        }

        public static /* synthetic */ void onStateChange$default(ITransportObserver iTransportObserver, TransportState transportState, HMSException hMSException, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStateChange");
            }
            if ((i13 & 2) != 0) {
                hMSException = null;
            }
            iTransportObserver.onStateChange(transportState, hMSException);
        }

        public static void onWebSocketConnected(ITransportObserver iTransportObserver, String url) {
            AbstractC22676k.m65750j(url, "url");
        }
    }

    void onICEConnected(boolean isPublish);

    void onIceCandidate(IceCandidate candidate, boolean isPublish);

    void onInitFetched();

    void onNonFatalError(HMSException error);

    Object onNotification(JsonObject jsonObject, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void onSelectedCandidatePairChanged(CandidatePairChangeEvent event, boolean isPublish);

    void onStateChange(TransportState state, HMSException error);

    void onStopAudioshare();

    void onStopScreenshare();

    void onTrackAdd(HMSTrack track);

    void onTrackMuteChange(HMSLocalTrack localTrack);

    void onTrackRemove(HMSTrack track);

    void onWebSocketConnected(String url);
}
