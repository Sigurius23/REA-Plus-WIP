package live.hms.video.connection;

import androidx.core.app.NotificationCompat;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.IceCandidate;
import hms.webrtc.PeerConnection;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llive/hms/video/connection/IConnectionObserver;", "", "Lhms/webrtc/PeerConnection$IceConnectionState;", "newState", "Ll83/a0;", "onIceConnectionChange", "(Lhms/webrtc/PeerConnection$IceConnectionState;Lq83/d;)Ljava/lang/Object;", "Lhms/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lhms/webrtc/IceCandidate;Lq83/d;)Ljava/lang/Object;", "Lhms/webrtc/CandidatePairChangeEvent;", NotificationCompat.CATEGORY_EVENT, "onSelectedCandidatePairChanged", "(Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)Ljava/lang/Object;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface IConnectionObserver {
    Object onIceCandidate(IceCandidate iceCandidate, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
