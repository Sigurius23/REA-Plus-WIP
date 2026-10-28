package live.hms.video.transport;

import androidx.core.app.NotificationCompat;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.IceCandidate;
import hms.webrtc.MediaConstraints;
import hms.webrtc.PeerConnection;
import l83.C23454a0;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.connection.publish.IPublishConnectionObserver;
import live.hms.video.factories.MediaConstraintsFactory;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"live/hms/video/transport/HMSTransport$publishConnectionObserver$1", "Llive/hms/video/connection/publish/IPublishConnectionObserver;", "Ll83/a0;", "onRenegotiationNeeded", "(Lq83/d;)Ljava/lang/Object;", "Lhms/webrtc/PeerConnection$IceConnectionState;", "newState", "onIceConnectionChange", "(Lhms/webrtc/PeerConnection$IceConnectionState;Lq83/d;)Ljava/lang/Object;", "Lhms/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lhms/webrtc/IceCandidate;Lq83/d;)Ljava/lang/Object;", "Lhms/webrtc/CandidatePairChangeEvent;", NotificationCompat.CATEGORY_EVENT, "onSelectedCandidatePairChanged", "(Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)Ljava/lang/Object;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTransport$publishConnectionObserver$1 implements IPublishConnectionObserver {
    final /* synthetic */ HMSTransport this$0;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeerConnection.IceConnectionState.values().length];
            try {
                iArr[PeerConnection.IceConnectionState.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HMSTransport$publishConnectionObserver$1(HMSTransport hMSTransport) {
        this.this$0 = hMSTransport;
    }

    @Override // live.hms.video.connection.IConnectionObserver
    public Object onIceCandidate(IceCandidate iceCandidate, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.this$0.observer.onIceCandidate(iceCandidate, true);
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.connection.IConnectionObserver
    public Object onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        HMSLogger.m71136d("HMSTransport", "[role=PUBLISH] onIceConnectionChange state :: " + iceConnectionState);
        int i13 = WhenMappings.$EnumSwitchMapping$0[iceConnectionState.ordinal()];
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 1) {
            Object objHandleIceConnectionFailed = this.this$0.handleIceConnectionFailed(HMSConnectionRole.PUBLISH, interfaceC30057d);
            return objHandleIceConnectionFailed == EnumC31071a.f128113w ? objHandleIceConnectionFailed : c23454a0;
        }
        if (i13 == 2) {
            this.this$0.observer.onICEConnected(true);
        }
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // live.hms.video.connection.publish.IPublishConnectionObserver
    public Object onRenegotiationNeeded(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1 hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;
        if (interfaceC30057d instanceof HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1) {
            hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1 = (HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1) interfaceC30057d;
            int i13 = hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1.label = i13 - Integer.MIN_VALUE;
            } else {
                hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1 = new HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1(this, interfaceC30057d);
            }
        } else {
            hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1 = new HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1(this, interfaceC30057d);
        }
        Object obj = hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSTransport hMSTransport = this.this$0;
                MediaConstraints mediaConstraintsMakePublishOfferConstraints = MediaConstraintsFactory.INSTANCE.makePublishOfferConstraints();
                hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1.label = 1;
                if (hMSTransport.performPublishRenegotiation(mediaConstraintsMakePublishOfferConstraints, hMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (IllegalStateException e5) {
            HMSLogger.INSTANCE.m71141w("HMSTransport", "Renegotiation didnt complete due to : " + e5.getMessage());
        }
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.connection.IConnectionObserver
    public Object onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.this$0.observer.onSelectedCandidatePairChanged(candidatePairChangeEvent, true);
        return C23454a0.f92919a;
    }
}
