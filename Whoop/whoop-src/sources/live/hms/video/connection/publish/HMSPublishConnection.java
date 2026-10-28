package live.hms.video.connection.publish;

import bc3.AbstractC3006f0;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.DataChannel;
import hms.webrtc.IceCandidate;
import hms.webrtc.PeerConnection;
import hms.webrtc.PeerConnectionFactory;
import l83.C23454a0;
import live.hms.video.connection.HMSConnection;
import live.hms.video.connection.HMSDataChannel;
import live.hms.video.connection.helpers.HMSPeerConnectionObserver;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.connection.models.HMSIceCandidate;
import live.hms.video.connection.models.HMSTrickle;
import live.hms.video.signal.ISignal;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001d\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Llive/hms/video/connection/publish/HMSPublishConnection;", "Llive/hms/video/connection/HMSConnection;", "Lhms/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Llive/hms/video/signal/ISignal;", "signal", "Lhms/webrtc/PeerConnection$RTCConfiguration;", "config", "Llive/hms/video/connection/publish/IPublishConnectionObserver;", "observer", "<init>", "(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/publish/IPublishConnectionObserver;)V", "", "label", "Ll83/a0;", "createDataChannel", "(Ljava/lang/String;)V", "close", "(Lq83/d;)Ljava/lang/Object;", "Lhms/webrtc/PeerConnectionFactory;", "getPeerConnectionFactory", "()Lhms/webrtc/PeerConnectionFactory;", "", "apiChannelCreated", "Z", "isClose", "()Z", "setClose", "(Z)V", "live/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1", "nativeObserver", "Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;", "Lhms/webrtc/PeerConnection;", "nativeConnection", "Lhms/webrtc/PeerConnection;", "getNativeConnection", "()Lhms/webrtc/PeerConnection;", "Llive/hms/video/connection/HMSDataChannel;", "apiDataChannel", "Llive/hms/video/connection/HMSDataChannel;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSPublishConnection extends HMSConnection {
    private static final String TAG = "HMSPublishConnection";
    private boolean apiChannelCreated;
    private final HMSDataChannel apiDataChannel;
    private boolean isClose;
    private final PeerConnection nativeConnection;
    private final HMSPublishConnection$nativeObserver$1 nativeObserver;
    private final PeerConnectionFactory peerConnectionFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hms.webrtc.PeerConnection$Observer, live.hms.video.connection.publish.HMSPublishConnection$nativeObserver$1] */
    public HMSPublishConnection(PeerConnectionFactory peerConnectionFactory, final ISignal signal, PeerConnection.RTCConfiguration config, final IPublishConnectionObserver observer) {
        super(HMSConnectionRole.PUBLISH, signal);
        AbstractC22676k.m65750j(peerConnectionFactory, "peerConnectionFactory");
        AbstractC22676k.m65750j(signal, "signal");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(observer, "observer");
        this.peerConnectionFactory = peerConnectionFactory;
        final HMSConnectionRole role = getRole();
        ?? r10 = new HMSPeerConnectionObserver(role) { // from class: live.hms.video.connection.publish.HMSPublishConnection$nativeObserver$1
            @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
            public void onIceCandidate(IceCandidate candidate) {
                AbstractC22676k.m65750j(candidate, "candidate");
                super.onIceCandidate(candidate);
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSPublishConnection$nativeObserver$1$onIceCandidate$1(this.this$0, observer, candidate, null), 3);
                signal.trickle(new HMSTrickle(HMSIceCandidate.INSTANCE.from(candidate), this.this$0.getRole(), this.this$0.get_nodeInfo()));
            }

            @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
            public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {
                AbstractC22676k.m65750j(newState, "newState");
                super.onIceConnectionChange(newState);
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSPublishConnection$nativeObserver$1$onIceConnectionChange$1(this.this$0, observer, newState, null), 3);
            }

            @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
            public void onRenegotiationNeeded() {
                super.onRenegotiationNeeded();
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSPublishConnection$nativeObserver$1$onRenegotiationNeeded$1(this.this$0, observer, null), 3);
            }

            @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
            public void onSelectedCandidatePairChanged(CandidatePairChangeEvent event) {
                super.onSelectedCandidatePairChanged(event);
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C24119xa8e3b5a3(this.this$0, observer, event, null), 3);
            }
        };
        this.nativeObserver = r10;
        PeerConnection peerConnectionCreatePeerConnection = peerConnectionFactory.createPeerConnection(config, (PeerConnection.Observer) r10);
        AbstractC22676k.m65747g(peerConnectionCreatePeerConnection);
        this.nativeConnection = peerConnectionCreatePeerConnection;
        DataChannel.Init init = new DataChannel.Init();
        init.protocol = "SCTP";
        DataChannel dataChannelCreateDataChannel = getNativeConnection().createDataChannel(HMSConstantsKt.cApiDataChannelLabel, init);
        HMSLogger.INSTANCE.m71139i(TAG, "Created data-channel `ion-sfu`");
        AbstractC22676k.m65747g(dataChannelCreateDataChannel);
        this.apiDataChannel = new HMSDataChannel(dataChannelCreateDataChannel, new HMSDataChannel.Observer() { // from class: live.hms.video.connection.publish.HMSPublishConnection.1
            @Override // live.hms.video.connection.HMSDataChannel.Observer
            public void onMessage(String value) {
                AbstractC22676k.m65750j(value, "value");
            }
        }, "role=" + getRole());
    }

    private final void createDataChannel(String label) {
    }

    @Override // live.hms.video.connection.HMSConnection
    public Object close(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.isClose = true;
        this.apiDataChannel.close();
        Object objClose = super.close(interfaceC30057d);
        return objClose == EnumC31071a.f128113w ? objClose : C23454a0.f92919a;
    }

    @Override // live.hms.video.connection.HMSConnection
    public PeerConnection getNativeConnection() {
        return this.nativeConnection;
    }

    public final PeerConnectionFactory getPeerConnectionFactory() {
        return this.peerConnectionFactory;
    }

    /* JADX INFO: renamed from: isClose, reason: from getter */
    public final boolean getIsClose() {
        return this.isClose;
    }

    public final void setClose(boolean z4) {
        this.isClose = z4;
    }
}
