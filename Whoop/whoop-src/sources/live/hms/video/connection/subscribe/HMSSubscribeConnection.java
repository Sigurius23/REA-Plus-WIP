package live.hms.video.connection.subscribe;

import hms.webrtc.PeerConnection;
import hms.webrtc.PeerConnectionFactory;
import java.util.HashMap;
import l83.C23454a0;
import live.hms.video.connection.HMSConnection;
import live.hms.video.connection.HMSDataChannel;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager;
import live.hms.video.media.streams.HMSRemoteStream;
import live.hms.video.media.streams.models.HMSDataChannelRequestParams;
import live.hms.video.media.streams.models.PreferStateResponse;
import live.hms.video.signal.ISignal;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001(\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Llive/hms/video/connection/subscribe/HMSSubscribeConnection;", "Llive/hms/video/connection/HMSConnection;", "Lhms/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Llive/hms/video/signal/ISignal;", "signal", "Lhms/webrtc/PeerConnection$RTCConfiguration;", "config", "Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;", "observer", "Llive/hms/video/connection/subscribe/RemoteTrackFactory;", "remoteTrackFactory", "<init>", "(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;)V", "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;", "message", "", "isVideo", "Llive/hms/video/media/streams/models/PreferStateResponse;", "sendOverApiDataChannel", "(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;ZLq83/d;)Ljava/lang/Object;", "Ll83/a0;", "close", "(Lq83/d;)Ljava/lang/Object;", "Ljava/util/HashMap;", "", "Llive/hms/video/media/streams/HMSRemoteStream;", "remoteStreams", "Ljava/util/HashMap;", "Llive/hms/video/connection/HMSDataChannel;", "api", "Llive/hms/video/connection/HMSDataChannel;", "Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;", "dataChannelRequestManager", "Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;", "isClose", "Z", "()Z", "setClose", "(Z)V", "live/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1", "nativeObserver", "Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;", "Lhms/webrtc/PeerConnection;", "nativeConnection", "Lhms/webrtc/PeerConnection;", "getNativeConnection", "()Lhms/webrtc/PeerConnection;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSSubscribeConnection extends HMSConnection {
    private static final String TAG = "HMSSubscribeConnection";
    private HMSDataChannel api;
    private final DataChannelRequestManager dataChannelRequestManager;
    private boolean isClose;
    private final PeerConnection nativeConnection;
    private final HMSSubscribeConnection$nativeObserver$1 nativeObserver;
    private final HashMap<String, HMSRemoteStream> remoteStreams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSSubscribeConnection(PeerConnectionFactory peerConnectionFactory, ISignal signal, PeerConnection.RTCConfiguration config, ISubscribeConnectionObserver observer, RemoteTrackFactory remoteTrackFactory) {
        super(HMSConnectionRole.SUBSCRIBE, signal);
        AbstractC22676k.m65750j(peerConnectionFactory, "peerConnectionFactory");
        AbstractC22676k.m65750j(signal, "signal");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(observer, "observer");
        AbstractC22676k.m65750j(remoteTrackFactory, "remoteTrackFactory");
        this.remoteStreams = new HashMap<>();
        this.dataChannelRequestManager = new DataChannelRequestManager();
        HMSSubscribeConnection$nativeObserver$1 hMSSubscribeConnection$nativeObserver$1 = new HMSSubscribeConnection$nativeObserver$1(this, observer, remoteTrackFactory, signal, getRole());
        this.nativeObserver = hMSSubscribeConnection$nativeObserver$1;
        PeerConnection peerConnectionCreatePeerConnection = peerConnectionFactory.createPeerConnection(config, hMSSubscribeConnection$nativeObserver$1);
        AbstractC22676k.m65747g(peerConnectionCreatePeerConnection);
        this.nativeConnection = peerConnectionCreatePeerConnection;
    }

    @Override // live.hms.video.connection.HMSConnection
    public Object close(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.isClose = true;
        HMSDataChannel hMSDataChannel = this.api;
        if (hMSDataChannel != null) {
            hMSDataChannel.close();
        }
        Object objClose = super.close(interfaceC30057d);
        return objClose == EnumC31071a.f128113w ? objClose : C23454a0.f92919a;
    }

    @Override // live.hms.video.connection.HMSConnection
    public PeerConnection getNativeConnection() {
        return this.nativeConnection;
    }

    /* JADX INFO: renamed from: isClose, reason: from getter */
    public final boolean getIsClose() {
        return this.isClose;
    }

    public final Object sendOverApiDataChannel(HMSDataChannelRequestParams hMSDataChannelRequestParams, boolean z4, InterfaceC30057d<? super PreferStateResponse> interfaceC30057d) {
        return z4 ? this.dataChannelRequestManager.preferVideo(hMSDataChannelRequestParams, interfaceC30057d) : this.dataChannelRequestManager.preferAudio(hMSDataChannelRequestParams, interfaceC30057d);
    }

    public final void setClose(boolean z4) {
        this.isClose = z4;
    }
}
