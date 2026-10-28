package live.hms.video.connection;

import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.InterfaceC3055s;
import hms.webrtc.IceCandidate;
import hms.webrtc.MediaConstraints;
import hms.webrtc.MediaStreamTrack;
import hms.webrtc.PeerConnection;
import hms.webrtc.RTCStatsReport;
import hms.webrtc.RtpSender;
import hms.webrtc.RtpTransceiver;
import hms.webrtc.SessionDescription;
import hn.C17508p;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import live.hms.video.connection.helpers.HMSSdpObserver;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.error.ErrorFactory;
import live.hms.video.signal.ISignal;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 M2\u00020\u0001:\u0001MB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020)¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201H\u0086@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b4\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001c0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, m65681d2 = {"Llive/hms/video/connection/HMSConnection;", "", "Llive/hms/video/connection/models/HMSConnectionRole;", "role", "Llive/hms/video/signal/ISignal;", "signal", "<init>", "(Llive/hms/video/connection/models/HMSConnectionRole;Llive/hms/video/signal/ISignal;)V", "Lhms/webrtc/SessionDescription;", "sdp", "enableOpusDtx", "(Lhms/webrtc/SessionDescription;)Lhms/webrtc/SessionDescription;", "", "getNodeInfo", "()Ljava/lang/String;", "nodeInfo", "Ll83/a0;", "setNodeInfo", "(Ljava/lang/String;)V", "Lhms/webrtc/MediaConstraints;", "constraints", "createOffer", "(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;", "createAnswer", "description", "setLocalDescription", "(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;", "setRemoteDescription", "Lhms/webrtc/IceCandidate;", "candidate", "", "addIceCandidate", "(Lhms/webrtc/IceCandidate;)Z", "Lhms/webrtc/MediaStreamTrack;", "track", "Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;", "init", "Lhms/webrtc/RtpTransceiver;", "addTransceiver", "(Lhms/webrtc/MediaStreamTrack;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;", "", "Lhms/webrtc/RtpSender;", "getSenders", "()Ljava/util/List;", "sender", "removeTrack", "(Lhms/webrtc/RtpSender;)Z", "getRemoteDescription", "()Lhms/webrtc/SessionDescription;", "Lhms/webrtc/RTCStatsReport;", "getStats", "(Lq83/d;)Ljava/lang/Object;", "close", "Llive/hms/video/connection/models/HMSConnectionRole;", "getRole", "()Llive/hms/video/connection/models/HMSConnectionRole;", "Llive/hms/video/signal/ISignal;", "getSignal", "()Llive/hms/video/signal/ISignal;", "Llive/hms/video/error/ErrorFactory$Action;", "action", "Llive/hms/video/error/ErrorFactory$Action;", "Ljava/util/ArrayList;", "candidates", "Ljava/util/ArrayList;", "getCandidates", "()Ljava/util/ArrayList;", "_nodeInfo", "Ljava/lang/String;", "Lhms/webrtc/PeerConnection;", "getNativeConnection", "()Lhms/webrtc/PeerConnection;", "nativeConnection", "Lhms/webrtc/PeerConnection$IceConnectionState;", "getIceConnectionState", "()Lhms/webrtc/PeerConnection$IceConnectionState;", "iceConnectionState", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class HMSConnection {
    private static final String TAG = "HMSConnection";
    private String _nodeInfo;
    private final ErrorFactory.Action action;
    private final ArrayList<IceCandidate> candidates;
    private final HMSConnectionRole role;
    private final ISignal signal;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSConnectionRole.values().length];
            try {
                iArr[HMSConnectionRole.PUBLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSConnectionRole.SUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HMSConnection(HMSConnectionRole role, ISignal signal) {
        ErrorFactory.Action action;
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(signal, "signal");
        this.role = role;
        this.signal = signal;
        int i13 = WhenMappings.$EnumSwitchMapping$0[role.ordinal()];
        if (i13 == 1) {
            action = ErrorFactory.Action.PUBLISH;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            action = ErrorFactory.Action.SUBSCRIBE;
        }
        this.action = action;
        this.candidates = new ArrayList<>();
        this._nodeInfo = "";
    }

    public static /* synthetic */ Object close$suspendImpl(HMSConnection hMSConnection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        hMSConnection.getNativeConnection().close();
        hMSConnection.getNativeConnection().dispose();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionDescription enableOpusDtx(SessionDescription sdp) {
        String description = sdp.description;
        AbstractC22676k.m65749i(description, "description");
        if (AbstractC39414r.m125876U(description, "usedtx=1", false)) {
            return sdp;
        }
        String description2 = sdp.description;
        AbstractC22676k.m65749i(description2, "description");
        return new SessionDescription(sdp.type, AbstractC39421y.m125926K(description2, "useinbandfec=1", "useinbandfec=1;usedtx=1", false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getStats$lambda$1(InterfaceC3055s deferred, RTCStatsReport rTCStatsReport) {
        AbstractC22676k.m65750j(deferred, "$deferred");
        AbstractC22676k.m65747g(rTCStatsReport);
        ((C3058t) deferred).m8807L(rTCStatsReport);
    }

    public final boolean addIceCandidate(IceCandidate candidate) {
        AbstractC22676k.m65750j(candidate, "candidate");
        return getNativeConnection().addIceCandidate(candidate);
    }

    public final RtpTransceiver addTransceiver(MediaStreamTrack track, RtpTransceiver.RtpTransceiverInit init) {
        AbstractC22676k.m65750j(track, "track");
        AbstractC22676k.m65750j(init, "init");
        RtpTransceiver rtpTransceiverAddTransceiver = getNativeConnection().addTransceiver(track, init);
        AbstractC22676k.m65749i(rtpTransceiverAddTransceiver, "addTransceiver(...)");
        return rtpTransceiverAddTransceiver;
    }

    public Object close(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return close$suspendImpl(this, interfaceC30057d);
    }

    public final Object createAnswer(MediaConstraints mediaConstraints, InterfaceC30057d<? super SessionDescription> interfaceC30057d) {
        HMSLogger.INSTANCE.m71140v(TAG, "[role=" + this.role + "] createAnswer: constraints=" + mediaConstraints);
        final C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        getNativeConnection().createAnswer(new HMSSdpObserver(this.role) { // from class: live.hms.video.connection.HMSConnection.createAnswer.2
            @Override // live.hms.video.connection.helpers.HMSSdpObserver, hms.webrtc.SdpObserver
            public void onCreateFailure(String error) {
                AbstractC22676k.m65750j(error, "error");
                super.onCreateFailure(error);
                ((C3058t) c3058tM8707a).completeExceptionally(ErrorFactory.WebrtcErrors.CreateAnswerFailed$default(ErrorFactory.WebrtcErrors.INSTANCE, this.action, error, null, null, 12, null));
            }

            @Override // live.hms.video.connection.helpers.HMSSdpObserver, hms.webrtc.SdpObserver
            public void onCreateSuccess(SessionDescription sdp) {
                AbstractC22676k.m65750j(sdp, "sdp");
                super.onCreateSuccess(sdp);
                ((C3058t) c3058tM8707a).m8807L(sdp);
            }
        }, mediaConstraints);
        Object objM8817m = c3058tM8707a.m8817m(interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }

    public final Object createOffer(MediaConstraints mediaConstraints, InterfaceC30057d<? super SessionDescription> interfaceC30057d) {
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] createOffer: constraints=" + mediaConstraints);
        final C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        getNativeConnection().createOffer(new HMSSdpObserver(this.role) { // from class: live.hms.video.connection.HMSConnection.createOffer.2
            @Override // live.hms.video.connection.helpers.HMSSdpObserver, hms.webrtc.SdpObserver
            public void onCreateFailure(String error) {
                AbstractC22676k.m65750j(error, "error");
                HMSLogger.m71137e(HMSSdpObserver.TAG, "failed to create offer : ".concat(error));
                super.onCreateFailure(error);
                ((C3058t) c3058tM8707a).completeExceptionally(ErrorFactory.WebrtcErrors.CreateOfferFailed$default(ErrorFactory.WebrtcErrors.INSTANCE, HMSConnection.this.action, error, null, null, 12, null));
            }

            @Override // live.hms.video.connection.helpers.HMSSdpObserver, hms.webrtc.SdpObserver
            public void onCreateSuccess(SessionDescription sdp) {
                AbstractC22676k.m65750j(sdp, "sdp");
                HMSLogger.m71136d(HMSSdpObserver.TAG, "offer created successfully");
                super.onCreateSuccess(sdp);
                ((C3058t) c3058tM8707a).m8807L(HMSConnection.this.enableOpusDtx(sdp));
            }
        }, mediaConstraints);
        Object objM8817m = c3058tM8707a.m8817m(interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }

    public final ArrayList<IceCandidate> getCandidates() {
        return this.candidates;
    }

    public final PeerConnection.IceConnectionState getIceConnectionState() {
        PeerConnection.IceConnectionState iceConnectionState = getNativeConnection().iceConnectionState();
        AbstractC22676k.m65749i(iceConnectionState, "iceConnectionState(...)");
        return iceConnectionState;
    }

    public abstract PeerConnection getNativeConnection();

    /* JADX INFO: renamed from: getNodeInfo, reason: from getter */
    public final String get_nodeInfo() {
        return this._nodeInfo;
    }

    public final SessionDescription getRemoteDescription() {
        return getNativeConnection().getRemoteDescription();
    }

    public final HMSConnectionRole getRole() {
        return this.role;
    }

    public final List<RtpSender> getSenders() {
        List<RtpSender> senders = getNativeConnection().getSenders();
        AbstractC22676k.m65749i(senders, "getSenders(...)");
        return senders;
    }

    public final ISignal getSignal() {
        return this.signal;
    }

    public final Object getStats(InterfaceC30057d<? super RTCStatsReport> interfaceC30057d) {
        C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        getNativeConnection().getStats(new C17508p(c3058tM8707a, 26));
        Object objM8817m = c3058tM8707a.m8817m(interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }

    public final boolean removeTrack(RtpSender sender) {
        AbstractC22676k.m65750j(sender, "sender");
        return getNativeConnection().removeTrack(sender);
    }

    public final Object setLocalDescription(SessionDescription sessionDescription, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] setLocalDescription with type=" + sessionDescription.type + " [size=" + sessionDescription.description.length() + "] description=" + sessionDescription.description);
        final C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        getNativeConnection().setLocalDescription(new HMSSdpObserver(this.role) { // from class: live.hms.video.connection.HMSConnection.setLocalDescription.2
            @Override // live.hms.video.connection.helpers.HMSSdpObserver, hms.webrtc.SdpObserver
            public void onSetFailure(String error) {
                AbstractC22676k.m65750j(error, "error");
                super.onSetFailure(error);
                HMSLogger.m71137e(HMSSdpObserver.TAG, "error in setting local offer : ".concat(error));
                ((C3058t) c3058tM8707a).completeExceptionally(ErrorFactory.WebrtcErrors.SetLocalDescriptionFailed$default(ErrorFactory.WebrtcErrors.INSTANCE, this.action, error, null, null, 12, null));
            }

            @Override // live.hms.video.connection.helpers.HMSSdpObserver, hms.webrtc.SdpObserver
            public void onSetSuccess() {
                super.onSetSuccess();
                HMSLogger.m71136d(HMSSdpObserver.TAG, "set local offer successfully");
                ((C3058t) c3058tM8707a).m8807L(Boolean.TRUE);
            }
        }, sessionDescription);
        Object objM8817m = c3058tM8707a.m8817m(interfaceC30057d);
        return objM8817m == EnumC31071a.f128113w ? objM8817m : C23454a0.f92919a;
    }

    public final void setNodeInfo(String nodeInfo) {
        AbstractC22676k.m65750j(nodeInfo, "nodeInfo");
        this._nodeInfo = nodeInfo;
        try {
            Log.d("SFUMIGRATION", "NodeInfo: set for class " + nodeInfo + " role :=" + this.role);
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    public final Object setRemoteDescription(SessionDescription sessionDescription, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        HMSLogger.INSTANCE.m71140v(TAG, "[role=" + this.role + "] setRemoteDescription with type=" + sessionDescription.type + " [size=" + sessionDescription.description.length() + "] description=" + sessionDescription.description);
        final C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        getNativeConnection().setRemoteDescription(new HMSSdpObserver(this.role) { // from class: live.hms.video.connection.HMSConnection.setRemoteDescription.2
            @Override // live.hms.video.connection.helpers.HMSSdpObserver, hms.webrtc.SdpObserver
            public void onSetFailure(String error) {
                AbstractC22676k.m65750j(error, "error");
                super.onSetFailure(error);
                ((C3058t) c3058tM8707a).completeExceptionally(ErrorFactory.WebrtcErrors.SetRemoteDescriptionFailed$default(ErrorFactory.WebrtcErrors.INSTANCE, this.action, error, null, null, 12, null));
            }

            @Override // live.hms.video.connection.helpers.HMSSdpObserver, hms.webrtc.SdpObserver
            public void onSetSuccess() {
                super.onSetSuccess();
                ((C3058t) c3058tM8707a).m8807L(Boolean.TRUE);
            }
        }, sessionDescription);
        Object objM8817m = c3058tM8707a.m8817m(interfaceC30057d);
        return objM8817m == EnumC31071a.f128113w ? objM8817m : C23454a0.f92919a;
    }
}
