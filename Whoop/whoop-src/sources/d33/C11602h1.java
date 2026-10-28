package d33;

import a30.C0327u;
import android.os.Build;
import android.os.PowerManager;
import androidx.lifecycle.AbstractC1638x;
import androidx.room.AbstractC1772c1;
import androidx.room.C1836v0;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C2990b0;
import bc3.C2996c2;
import bc3.C2999d1;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import bi.C3278p;
import c43.AbstractC4191g;
import c43.C4185a;
import c43.C4189e;
import c43.C4207w;
import c43.EnumC4206v;
import c93.InterfaceC4339a;
import com.iterable.iterableapi.C5327g1;
import e33.C12626d0;
import e33.C12628e0;
import e33.C12632g0;
import e33.C12638j0;
import e33.C12645n;
import e33.C12659u;
import e33.C12662v0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import h33.C16831a;
import hc3.C17171d;
import hg3.AbstractC17269i;
import i53.C18129a;
import i53.C18135g;
import ih0.AbstractC18489d0;
import io.getstream.android.video.generated.models.OwnCapability;
import io.getstream.video.android.core.model.IceCandidate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k33.ThreadFactoryC22176a;
import l53.C23370k;
import l53.C23371l;
import l53.C23372m;
import l53.EnumC23360a;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import l83.C23470p;
import l83.C23471q;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mc3.C25437c;
import n23.AbstractC26205h;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import n53.AbstractC26312c;
import n53.C26377x1;
import ne3.C26624l;
import org.json.JSONArray;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpTransceiver;
import org.webrtc.SessionDescription;
import p000.AbstractC11266d;
import p003a1.C0109h;
import p031b9.C2817b;
import p042c2.C3872q;
import p045c6.C4258a;
import p078d1.C11457j;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p33.C28822o;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34870c0;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sb3.AbstractC32350a;
import stream.video.sfu.event.JoinRequest;
import stream.video.sfu.event.LeaveCallRequest;
import stream.video.sfu.event.ReconnectDetails;
import stream.video.sfu.event.SfuRequest;
import stream.video.sfu.models.AndroidState;
import stream.video.sfu.models.AndroidThermalState;
import stream.video.sfu.models.C32996OS;
import stream.video.sfu.models.ClientDetails;
import stream.video.sfu.models.Device;
import stream.video.sfu.models.ICETrickle;
import stream.video.sfu.models.ParticipantSource;
import stream.video.sfu.models.Sdk;
import stream.video.sfu.models.SdkType;
import stream.video.sfu.models.TrackType;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import stream.video.sfu.signal.Reconnection;
import stream.video.sfu.signal.SendStatsRequest;
import stream.video.sfu.signal.Telemetry;
import stream.video.sfu.signal.UpdateMuteStatesRequest;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33392g2;
import t23.C33403i3;
import t23.C33450s0;
import t23.C33460u0;
import t23.InterfaceC33408j3;
import v33.C35639x;
import v33.C35640y;
import y33.C39202e;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: d33.h1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11602h1 {

    /* JADX INFO: renamed from: A */
    public final C13045h2 f37421A;

    /* JADX INFO: renamed from: B */
    public final C39202e f37422B;

    /* JADX INFO: renamed from: C */
    public final ClientDetails f37423C;

    /* JADX INFO: renamed from: D */
    public final C13045h2 f37424D;

    /* JADX INFO: renamed from: E */
    public C11616n f37425E;

    /* JADX INFO: renamed from: F */
    public C2996c2 f37426F;

    /* JADX INFO: renamed from: G */
    public C2996c2 f37427G;

    /* JADX INFO: renamed from: H */
    public final C17171d f37428H;

    /* JADX INFO: renamed from: I */
    public C2996c2 f37429I;

    /* JADX INFO: renamed from: J */
    public C2996c2 f37430J;

    /* JADX INFO: renamed from: K */
    public C2996c2 f37431K;

    /* JADX INFO: renamed from: L */
    public final C4258a f37432L;

    /* JADX INFO: renamed from: M */
    public final C13045h2 f37433M;

    /* JADX INFO: renamed from: N */
    public final C25437c f37434N;

    /* JADX INFO: renamed from: O */
    public final C25437c f37435O;

    /* JADX INFO: renamed from: P */
    public final List f37436P;

    /* JADX INFO: renamed from: Q */
    public final List f37437Q;

    /* JADX INFO: renamed from: R */
    public final List f37438R;

    /* JADX INFO: renamed from: a */
    public final PowerManager f37439a;

    /* JADX INFO: renamed from: b */
    public final C33368c0 f37440b;

    /* JADX INFO: renamed from: c */
    public final String f37441c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1638x f37442d;

    /* JADX INFO: renamed from: e */
    public final String f37443e;

    /* JADX INFO: renamed from: f */
    public final String f37444f;

    /* JADX INFO: renamed from: g */
    public final String f37445g;

    /* JADX INFO: renamed from: h */
    public final C33366b4 f37446h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3061u f37447i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2994c0 f37448j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2994c0 f37449k;

    /* JADX INFO: renamed from: l */
    public final C26377x1 f37450l;

    /* JADX INFO: renamed from: m */
    public final C5327g1 f37451m;

    /* JADX INFO: renamed from: n */
    public final C23372m f37452n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4339a f37453o;

    /* JADX INFO: renamed from: p */
    public C2996c2 f37454p;

    /* JADX INFO: renamed from: q */
    public C2996c2 f37455q;

    /* JADX INFO: renamed from: r */
    public C2996c2 f37456r;

    /* JADX INFO: renamed from: s */
    public final C23372m f37457s;

    /* JADX INFO: renamed from: t */
    public final C23372m f37458t;

    /* JADX INFO: renamed from: u */
    public final C23470p f37459u;

    /* JADX INFO: renamed from: v */
    public final C11457j f37460v;

    /* JADX INFO: renamed from: w */
    public final ConcurrentHashMap f37461w;

    /* JADX INFO: renamed from: x */
    public final C3278p f37462x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f37463y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f37464z;

    /* JADX WARN: Multi-variable type inference failed */
    public C11602h1(C33366b4 client, int i13, PowerManager powerManager, C33368c0 c33368c0, String sessionId, String apiKey, AbstractC1638x lifecycle, String sfuUrl, String sfuWsUrl, String sfuToken, String sfuName, ArrayList arrayList, C2570m sfuAnalytics, int i14) {
        C2817b c2817b;
        C17171d c17171dM8708b;
        String str;
        int i15 = (i14 & 2) != 0 ? 0 : i13;
        AbstractC22676k.m65748h(client, "null cannot be cast to non-null type io.getstream.video.android.core.StreamVideoClient");
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        C2817b c2817b2 = c33368c0.f139294h;
        c2817b2.getClass();
        if (c2817b2.f11023x) {
            throw new IllegalStateException("ScopeProvider has been cleaned up");
        }
        C2345k c2345kM8013p = c2817b2.m8013p();
        InterfaceC2339e interfaceC2339e = c2345kM8013p.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM8013p.f9273a)) {
            c2345kM8013p.f9274b.log(enumC2341g, c2345kM8013p.f9273a, "Creating coroutine scope for RTC session main", null);
        }
        C17171d c17171dM8708b2 = AbstractC3006f0.m8708b(((InterfaceC2994c0) c2817b2.f11024y).getCoroutineContext().plus(c3004e2M8710d).plus(new C2990b0("rtc-session-main")));
        String str2 = c33368c0.f139289c;
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) c2817b2.f11024y;
        if (c2817b2.f11023x) {
            throw new IllegalStateException("ScopeProvider has been cleaned up");
        }
        C2345k c2345kM8013p2 = c2817b2.m8013p();
        if (c2345kM8013p2.f9275c.isLoggable(enumC2341g, c2345kM8013p2.f9273a)) {
            c2345kM8013p2.f9274b.log(enumC2341g, c2345kM8013p2.f9273a, "Creating RTC session scope for callId: ".concat(str2), null);
        }
        if (((ExecutorService) c2817b2.f11021E) == null) {
            C2345k c2345kM8013p3 = c2817b2.m8013p();
            if (c2345kM8013p3.f9275c.isLoggable(enumC2341g, c2345kM8013p3.f9273a)) {
                c2345kM8013p3.f9274b.log(enumC2341g, c2345kM8013p3.f9273a, "Creating new single thread executor for callId: ".concat(str2), null);
            }
            c2817b2.f11021E = Executors.newSingleThreadExecutor(new ThreadFactoryC22176a(str2, 0));
        }
        ExecutorService executorService = (ExecutorService) c2817b2.f11021E;
        if (executorService != null) {
            C2345k c2345kM8013p4 = c2817b2.m8013p();
            c2817b = c2817b2;
            if (c2345kM8013p4.f9275c.isLoggable(enumC2341g, c2345kM8013p4.f9273a)) {
                c2345kM8013p4.f9274b.log(enumC2341g, c2345kM8013p4.f9273a, "Creating RTC session scope with dedicated executor for callId: ".concat(str2), null);
            }
            c17171dM8708b = AbstractC3006f0.m8708b(interfaceC2994c0.getCoroutineContext().plus(c3004e2M8710d).plus(new C2990b0("rtc-session-coroutine")).plus(new C2999d1(executorService)));
        } else {
            c2817b = c2817b2;
            C2345k c2345kM8013p5 = c2817b.m8013p();
            InterfaceC2339e interfaceC2339e2 = c2345kM8013p5.f9275c;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM8013p5.f9273a)) {
                c2345kM8013p5.f9274b.log(enumC2341g2, c2345kM8013p5.f9273a, "Executor is null, falling back to regular scope for callId: ".concat(str2), null);
            }
            c17171dM8708b = AbstractC3006f0.m8708b(interfaceC2994c0.getCoroutineContext().plus(c3004e2M8710d).plus(new C2990b0("rtc-session-coroutine")));
        }
        C26377x1 c26377x1 = new C26377x1(c17171dM8708b);
        boolean z4 = client.f139244Q;
        C5327g1 c5327g1 = new C5327g1();
        c5327g1.f21694w = z4;
        c5327g1.f21695x = new ConcurrentHashMap();
        C23372m c23372mM16447i = c5327g1.m16447i((i15 + 1) + "-" + AbstractC39421y.m125926K(AbstractC39421y.m125926K(sfuUrl, "https://", "", false), "/twirp", "", false));
        int i16 = i15;
        C2817b scopeProvider = c2817b;
        C11609k c11609k = new C11609k(client, sfuToken, sfuAnalytics, apiKey, sfuUrl, sfuWsUrl, lifecycle, c23372mM16447i, c33368c0);
        AbstractC22676k.m65750j(client, "client");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        AbstractC22676k.m65750j(sfuUrl, "sfuUrl");
        AbstractC22676k.m65750j(sfuWsUrl, "sfuWsUrl");
        AbstractC22676k.m65750j(sfuToken, "sfuToken");
        AbstractC22676k.m65750j(sfuName, "sfuName");
        AbstractC22676k.m65750j(scopeProvider, "scopeProvider");
        AbstractC22676k.m65750j(sfuAnalytics, "sfuAnalytics");
        this.f37439a = powerManager;
        this.f37440b = c33368c0;
        this.f37441c = sessionId;
        this.f37442d = lifecycle;
        this.f37443e = sfuUrl;
        this.f37444f = sfuToken;
        this.f37445g = sfuName;
        this.f37446h = client;
        this.f37447i = c3004e2M8710d;
        this.f37448j = c17171dM8708b2;
        this.f37449k = c17171dM8708b;
        this.f37450l = c26377x1;
        this.f37451m = c5327g1;
        this.f37452n = c23372mM16447i;
        this.f37453o = c11609k;
        int i17 = 1;
        int i18 = i16 + 1;
        this.f37457s = c5327g1.m16447i(i18 + "-pub");
        this.f37458t = c5327g1.m16447i(i18 + "-sub");
        this.f37459u = AbstractC1772c1.m5382S(this, "Video:RtcSession");
        AbstractC30060g.m92088H(new C11624r(this, 3));
        this.f37460v = new C11457j(1);
        this.f37461w = new ConcurrentHashMap();
        C11622q c11622q = new C11622q(this, i17);
        m31043s();
        this.f37462x = new C3278p(c11622q);
        MediaConstraints mediaConstraints = AbstractC26312c.f104557a;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4189e c4189e = (C4189e) it.next();
            arrayList2.add(PeerConnection.IceServer.builder((List<String>) c4189e.f17044w).setUsername(c4189e.f17045x).setPassword(c4189e.f17046y).createIceServer());
        }
        this.f37463y = arrayList2;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f37464z = c13045h2M36593c;
        this.f37421A = AbstractC13091v.m36593c(null);
        String str3 = null;
        C26624l c26624l = null;
        this.f37423C = new ClientDetails(new Sdk(SdkType.SDK_TYPE_ANDROID, String.valueOf((Object) 1), String.valueOf((Object) 28), String.valueOf((Object) 0), null, 16, null), new C32996OS("Android", String.valueOf(Build.VERSION.SDK_INT), str3, c26624l, 12, null), null, new Device(AbstractC18489d0.m53370k(Build.MANUFACTURER, " : ", Build.MODEL), str3, c26624l, 6, null), null, null == true ? 1 : 0, 52, null);
        this.f37424D = AbstractC13091v.m36593c(C18135g.f70432a);
        InterfaceC33408j3.f139483t.getClass();
        if (C33403i3.f139477b == null) {
            throw new IllegalArgumentException("SDK hasn't been initialised yet - can't start a RtcSession");
        }
        C2345k c2345kM31043s = m31043s();
        InterfaceC2339e interfaceC2339e3 = c2345kM31043s.f9275c;
        EnumC2341g enumC2341g3 = EnumC2341g.INFO;
        if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM31043s.f9273a)) {
            c2345kM31043s.f9274b.log(enumC2341g3, c2345kM31043s.f9273a, "<init> #sfu; #track; no args", null);
        }
        C39202e c39202e = (C39202e) this.f37453o.invoke();
        AbstractC22676k.m65750j(c39202e, "<set-?>");
        this.f37422B = c39202e;
        m31047w();
        C2345k c2345kM31043s2 = m31043s();
        if (c2345kM31043s2.f9275c.isLoggable(enumC2341g3, c2345kM31043s2.f9273a)) {
            c2345kM31043s2.f9274b.log(enumC2341g3, c2345kM31043s2.f9273a, "[createSubscriber] #sfu; no args", null);
        }
        C12638j0 c12638j0M105819j = this.f37440b.m105819j();
        InterfaceC2994c0 coroutineScope = this.f37449k;
        PeerConnection.RTCConfiguration rTCConfigurationM31041q = m31041q();
        C28822o sfuClient = m31044t().f168486d;
        String sessionId2 = this.f37441c;
        boolean z13 = this.f37446h.f139245R;
        C23372m tracer = this.f37458t;
        C39202e c39202eM31044t = m31044t();
        C1836v0 c1836v0 = new C1836v0(2, this, C11602h1.class, "sendIceCandidate", "sendIceCandidate(Lio/getstream/video/android/core/model/IceCandidate;Lio/getstream/video/android/core/model/StreamPeerType;)V", 0, 6);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(sessionId2, "sessionId");
        AbstractC22676k.m65750j(sfuClient, "sfuClient");
        AbstractC22676k.m65750j(tracer, "tracer");
        C12662v0 c12662v0 = new C12662v0(sessionId2, sfuClient, coroutineScope, z13, tracer, c1836v0, c39202eM31044t);
        PeerConnection peerConnectionM35395d = c12638j0M105819j.m35395d(rTCConfigurationM31041q, c12662v0);
        C2345k c2345kM35394c = c12638j0M105819j.m35394c();
        InterfaceC2339e interfaceC2339e4 = c2345kM35394c.f9275c;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e4.isLoggable(enumC2341g4, c2345kM35394c.f9273a)) {
            c2345kM35394c.f9274b.log(enumC2341g4, c2345kM35394c.f9273a, "type " + c12662v0 + " is now monitoring " + peerConnectionM35395d, null);
        }
        c12662v0.m35419h(peerConnectionM35395d);
        PeerConnection peerConnectionM35416e = c12662v0.m35416e();
        MediaStreamTrack.MediaType mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO;
        RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection = RtpTransceiver.RtpTransceiverDirection.RECV_ONLY;
        peerConnectionM35416e.addTransceiver(mediaType, new RtpTransceiver.RtpTransceiverInit(rtpTransceiverDirection));
        c12662v0.m35416e().addTransceiver(MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO, new RtpTransceiver.RtpTransceiverInit(rtpTransceiverDirection));
        try {
            List<PeerConnection.IceServer> iceServers = rTCConfigurationM31041q.iceServers;
            AbstractC22676k.m65749i(iceServers, "iceServers");
            str = "iceServers=" + AbstractC25265s.m74110N0(iceServers, null, null, null, C12632g0.f43141w, 31) + " , budlePolicy=" + rTCConfigurationM31041q.bundlePolicy + ", sdpSemantics=" + rTCConfigurationM31041q.sdpSemantics;
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e5 = C2343i.f9272d;
            EnumC2341g enumC2341g5 = EnumC2341g.ERROR;
            if (interfaceC2339e5.isLoggable(enumC2341g5, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g5, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
            str = null;
        }
        C23372m c23372m = c12662v0.f43270j;
        EnumC23360a[] enumC23360aArr = EnumC23360a.f92601x;
        c23372m.m67653b(str, "create");
        InterfaceC30057d interfaceC30057d = null;
        c13045h2M36593c.m36571k(null, c12662v0);
        AbstractC3006f0.m8732z(this.f37448j, null, null, new C11614m(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(this.f37448j, null, null, new C11614m(this, interfaceC30057d, i17), 3);
        AbstractC3006f0.m8732z(this.f37448j, null, null, new C11614m(this, interfaceC30057d, 2), 3);
        m31047w();
        this.f37440b.m105819j().f43159i = new C11620p(this);
        this.f37440b.m105819j().f43160j = new C3872q(this, i17);
        int i19 = 0;
        this.f37440b.m105819j().f43161k = new C11622q(this, i19);
        this.f37440b.m105819j().f43162l = new C11624r(this, i19);
        this.f37428H = AbstractC3006f0.m8708b(AbstractC3050q0.f12077a);
        this.f37432L = new C4258a(1);
        TrackType trackType = TrackType.TRACK_TYPE_AUDIO;
        Boolean bool = Boolean.FALSE;
        this.f37433M = AbstractC13091v.m36593c(AbstractC25247g0.m73990Y(new C23465k(trackType, bool), new C23465k(TrackType.TRACK_TYPE_VIDEO, bool), new C23465k(TrackType.TRACK_TYPE_SCREEN_SHARE, bool)));
        this.f37434N = new C25437c(false);
        this.f37435O = new C25437c(false);
        this.f37436P = Collections.synchronizedList(new ArrayList());
        this.f37437Q = Collections.synchronizedList(new ArrayList());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC22676k.m65749i(listSynchronizedList, "synchronizedList(...)");
        this.f37438R = listSynchronizedList;
        AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Object m31014B(C11602h1 c11602h1, C33460u0 c33460u0, Float f13, C23465k c23465k, AbstractC32269c abstractC32269c, int i13) {
        if ((i13 & 1) != 0) {
            c33460u0 = null;
        }
        if ((i13 & 2) != 0) {
            f13 = null;
        }
        if ((i13 & 4) != 0) {
            c23465k = null;
        }
        return c11602h1.m31024A(c33460u0, f13, c23465k, abstractC32269c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m31015a(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        C11638y c11638y;
        String strM31035j;
        MediaStreamTrack mediaStreamTrack;
        if (abstractC32269c instanceof C11638y) {
            c11638y = (C11638y) abstractC32269c;
            int i13 = c11638y.f37590E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11638y.f37590E = i13 - Integer.MIN_VALUE;
            } else {
                c11638y = new C11638y(c11602h1, abstractC32269c);
            }
        } else {
            c11638y = new C11638y(c11602h1, abstractC32269c);
        }
        Object objM35406v = c11638y.f37593y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11638y.f37590E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM35406v);
            if (!((List) c11602h1.f37440b.f139302p.f139624M.getValue()).contains(OwnCapability.SendAudio.INSTANCE)) {
                return c23454a0;
            }
            TrackType trackType = TrackType.TRACK_TYPE_AUDIO;
            c11602h1.m31028F(true, trackType);
            strM31035j = c11602h1.m31035j(trackType);
            C12645n c12645n = (C12645n) c11602h1.f37421A.getValue();
            mediaStreamTrack = null;
            if (c12645n != null) {
                c11638y.f37591w = c11602h1;
                c11638y.f37592x = strM31035j;
                c11638y.f37590E = 1;
                objM35406v = c12645n.m35406v(strM31035j, trackType, null, c11638y);
                if (objM35406v == enumC31071a) {
                    return enumC31071a;
                }
            }
            TrackType trackType2 = TrackType.TRACK_TYPE_AUDIO;
            AbstractC22676k.m65748h(mediaStreamTrack, "null cannot be cast to non-null type org.webrtc.AudioTrack");
            c11602h1.m31027E(trackType2, new C4185a(strM31035j, (AudioTrack) mediaStreamTrack));
            return c23454a0;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = c11638y.f37592x;
        C11602h1 c11602h2 = c11638y.f37591w;
        AbstractC34132o.m107864I(objM35406v);
        strM31035j = str;
        c11602h1 = c11602h2;
        mediaStreamTrack = (MediaStreamTrack) objM35406v;
        TrackType trackType3 = TrackType.TRACK_TYPE_AUDIO;
        AbstractC22676k.m65748h(mediaStreamTrack, "null cannot be cast to non-null type org.webrtc.AudioTrack");
        c11602h1.m31027E(trackType3, new C4185a(strM31035j, (AudioTrack) mediaStreamTrack));
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a2 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0032, B:34:0x009c, B:36:0x00a2, B:38:0x00ac, B:41:0x00bd, B:43:0x00c1, B:45:0x00cb, B:48:0x00dc, B:50:0x00e0, B:52:0x00ea, B:53:0x0106, B:55:0x0116, B:56:0x012e, B:21:0x004b), top: B:63:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:80:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r11.mo68211b(r1) == r13) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [mc3.a] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m31016b(d33.C11602h1 r11, d33.C11602h1 r12, s83.AbstractC32269c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d33.C11602h1.m31016b(d33.h1, d33.h1, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:15:0x0035, B:32:0x0091, B:34:0x0097, B:36:0x00a1, B:39:0x00b2, B:41:0x00b6, B:44:0x00c5, B:46:0x00c9, B:49:0x00da, B:51:0x00ea, B:52:0x0101), top: B:59:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r12.mo68211b(r1) == r14) goto L48;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m31017c(d33.C11602h1 r12, d33.C11602h1 r13, s83.AbstractC32269c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d33.C11602h1.m31017c(d33.h1, d33.h1, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static final void m31018d(C11602h1 c11602h1, String str) {
        ArrayList<C23465k> arrayList;
        synchronized (c11602h1.f37461w) {
            try {
                arrayList = new ArrayList();
                Iterator it = c11602h1.f37461w.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC22676k.m65749i(next, "next(...)");
                    Map.Entry entry = (Map.Entry) next;
                    if (AbstractC22676k.m65745e(((C11626s) entry.getValue()).f37539a, str)) {
                        arrayList.add(new C23465k(((C11626s) entry.getValue()).f37540b, ((C11626s) entry.getValue()).f37541c));
                        it.remove();
                    }
                }
                if (!arrayList.isEmpty()) {
                    C2345k c2345kM31043s = c11602h1.m31043s();
                    InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
                    EnumC2341g enumC2341g = EnumC2341g.INFO;
                    if (interfaceC2339e.isLoggable(enumC2341g, c2345kM31043s.f9273a)) {
                        c2345kM31043s.f9274b.log(enumC2341g, c2345kM31043s.f9273a, "[takeOrphanedTracks] #orphaned-track; Retrieved " + arrayList.size() + " orphaned tracks for sessionId=" + str + ", remaining orphaned=" + c11602h1.f37461w.size(), null);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C2345k c2345kM31043s2 = c11602h1.m31043s();
        InterfaceC2339e interfaceC2339e2 = c2345kM31043s2.f9275c;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM31043s2.f9273a)) {
            c2345kM31043s2.f9274b.log(enumC2341g2, c2345kM31043s2.f9273a, AbstractC11266d.m30456j(arrayList.size(), "[reconcileOrphanedTracks] #orphaned-track; Reconciling ", " orphaned tracks for sessionId=", str), null);
        }
        c11602h1.f37458t.m67653b(arrayList.toString(), "reconcile-tracks");
        for (C23465k c23465k : arrayList) {
            c11602h1.m31029G(str, (TrackType) c23465k.f92937w, (AbstractC4191g) c23465k.f92938x);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: e */
    public static final Object m31019e(C11602h1 c11602h1, ICETrickle iCETrickle, AbstractC32269c abstractC32269c) {
        C11625r0 c11625r0;
        c11602h1.getClass();
        if (abstractC32269c instanceof C11625r0) {
            c11625r0 = (C11625r0) abstractC32269c;
            int i13 = c11625r0.f37538y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11625r0.f37538y = i13 - Integer.MIN_VALUE;
            } else {
                c11625r0 = new C11625r0(c11602h1, abstractC32269c);
            }
        } else {
            c11625r0 = new C11625r0(c11602h1, abstractC32269c);
        }
        Object objIceTrickle = c11625r0.f37536w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11625r0.f37538y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objIceTrickle);
                C28822o c28822o = c11602h1.m31044t().f168486d;
                c11625r0.f37538y = 1;
                objIceTrickle = c28822o.iceTrickle(iCETrickle, c11625r0);
                if (objIceTrickle == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objIceTrickle);
            }
            return new C26204g(objIceTrickle);
        } catch (CancellationException e5) {
            throw e5;
        } catch (Throwable th3) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeApiCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th3.getMessage()), th3);
            }
            String message = th3.getMessage();
            if (message == null) {
                message = "API call failed";
            }
            return new C26203f(new C26201d(message, th3));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m31020f(C11602h1 c11602h1, IceCandidate iceCandidate, EnumC4206v enumC4206v) {
        if (!(c11602h1.f37424D.getValue() instanceof C18129a)) {
            c11602h1.f37438R.add(new C23465k(iceCandidate, enumC4206v));
        } else {
            AbstractC3006f0.m8732z(c11602h1.f37448j, null, null, new C0109h(c11602h1, enumC4206v, iceCandidate, null, 14), 3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m31021g(C11602h1 c11602h1, ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONArray((Object[]) it.next()));
        }
        String string = jSONArray.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m31022h(C11602h1 c11602h1, UpdateMuteStatesRequest updateMuteStatesRequest, AbstractC32269c abstractC32269c) {
        C11599g1 c11599g1;
        if (abstractC32269c instanceof C11599g1) {
            c11599g1 = (C11599g1) abstractC32269c;
            int i13 = c11599g1.f37416y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11599g1.f37416y = i13 - Integer.MIN_VALUE;
            } else {
                c11599g1 = new C11599g1(c11602h1, abstractC32269c);
            }
        } else {
            c11599g1 = new C11599g1(c11602h1, abstractC32269c);
        }
        Object objUpdateMuteStates = c11599g1.f37414w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11599g1.f37416y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objUpdateMuteStates);
                C28822o c28822o = c11602h1.m31044t().f168486d;
                c11599g1.f37416y = 1;
                objUpdateMuteStates = c28822o.updateMuteStates(updateMuteStatesRequest, c11599g1);
                if (objUpdateMuteStates == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objUpdateMuteStates);
            }
            return new C26204g(objUpdateMuteStates);
        } catch (CancellationException e5) {
            throw e5;
        } catch (Throwable th3) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "SafeApiCall")) {
                C2343i.f9271c.log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th3.getMessage()), th3);
            }
            String message = th3.getMessage();
            if (message == null) {
                message = "API call failed";
            }
            return new C26203f(new C26201d(message, th3));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m31023l(C12659u c12659u) {
        List<RtpTransceiver> transceivers;
        if (c12659u != null && (transceivers = c12659u.m35416e().getTransceivers()) != null) {
            Iterator<T> it = transceivers.iterator();
            while (it.hasNext()) {
                ((RtpTransceiver) it.next()).stop();
            }
        }
        if (c12659u != null) {
            c12659u.m35413b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x024a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0267  */
    /* JADX WARN: Code duplicated, block: B:130:0x027d A[Catch: CancellationException -> 0x009a, all -> 0x0252, TRY_ENTER, TRY_LEAVE, TryCatch #8 {CancellationException -> 0x009a, blocks: (B:212:0x04d0, B:207:0x04a7, B:208:0x04bc, B:210:0x04c2, B:26:0x0084, B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b, B:159:0x0355, B:163:0x0373, B:166:0x037d, B:169:0x038a, B:172:0x0394, B:175:0x039d, B:176:0x039f, B:190:0x0425, B:192:0x0461, B:184:0x03f6, B:186:0x0404, B:33:0x00b3, B:117:0x024f, B:128:0x0273, B:130:0x027d, B:39:0x00cd, B:107:0x0221, B:109:0x022b, B:111:0x0233, B:113:0x0237, B:103:0x01fa, B:105:0x0208, B:87:0x0191, B:89:0x019f), top: B:245:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0296  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b2 A[Catch: CancellationException -> 0x009a, all -> 0x02a5, TryCatch #4 {all -> 0x02a5, blocks: (B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b), top: B:252:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bd A[Catch: CancellationException -> 0x009a, all -> 0x02a5, TryCatch #4 {all -> 0x02a5, blocks: (B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b), top: B:252:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:146:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ef A[Catch: CancellationException -> 0x009a, all -> 0x02a5, TryCatch #4 {all -> 0x02a5, blocks: (B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b), top: B:252:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0317 A[Catch: CancellationException -> 0x009a, all -> 0x02a5, LOOP:2: B:151:0x0311->B:153:0x0317, LOOP_END, TryCatch #4 {all -> 0x02a5, blocks: (B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b), top: B:252:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:157:0x034b A[Catch: CancellationException -> 0x009a, all -> 0x02a5, TRY_LEAVE, TryCatch #4 {all -> 0x02a5, blocks: (B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b), top: B:252:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:162:0x036f  */
    /* JADX WARN: Code duplicated, block: B:166:0x037d A[Catch: CancellationException -> 0x009a, all -> 0x036c, TRY_ENTER, TryCatch #8 {CancellationException -> 0x009a, blocks: (B:212:0x04d0, B:207:0x04a7, B:208:0x04bc, B:210:0x04c2, B:26:0x0084, B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b, B:159:0x0355, B:163:0x0373, B:166:0x037d, B:169:0x038a, B:172:0x0394, B:175:0x039d, B:176:0x039f, B:190:0x0425, B:192:0x0461, B:184:0x03f6, B:186:0x0404, B:33:0x00b3, B:117:0x024f, B:128:0x0273, B:130:0x027d, B:39:0x00cd, B:107:0x0221, B:109:0x022b, B:111:0x0233, B:113:0x0237, B:103:0x01fa, B:105:0x0208, B:87:0x0191, B:89:0x019f), top: B:245:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0386  */
    /* JADX WARN: Code duplicated, block: B:169:0x038a A[Catch: CancellationException -> 0x009a, all -> 0x036c, TRY_LEAVE, TryCatch #8 {CancellationException -> 0x009a, blocks: (B:212:0x04d0, B:207:0x04a7, B:208:0x04bc, B:210:0x04c2, B:26:0x0084, B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b, B:159:0x0355, B:163:0x0373, B:166:0x037d, B:169:0x038a, B:172:0x0394, B:175:0x039d, B:176:0x039f, B:190:0x0425, B:192:0x0461, B:184:0x03f6, B:186:0x0404, B:33:0x00b3, B:117:0x024f, B:128:0x0273, B:130:0x027d, B:39:0x00cd, B:107:0x0221, B:109:0x022b, B:111:0x0233, B:113:0x0237, B:103:0x01fa, B:105:0x0208, B:87:0x0191, B:89:0x019f), top: B:245:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0394 A[Catch: CancellationException -> 0x009a, all -> 0x036c, TRY_ENTER, TryCatch #8 {CancellationException -> 0x009a, blocks: (B:212:0x04d0, B:207:0x04a7, B:208:0x04bc, B:210:0x04c2, B:26:0x0084, B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b, B:159:0x0355, B:163:0x0373, B:166:0x037d, B:169:0x038a, B:172:0x0394, B:175:0x039d, B:176:0x039f, B:190:0x0425, B:192:0x0461, B:184:0x03f6, B:186:0x0404, B:33:0x00b3, B:117:0x024f, B:128:0x0273, B:130:0x027d, B:39:0x00cd, B:107:0x0221, B:109:0x022b, B:111:0x0233, B:113:0x0237, B:103:0x01fa, B:105:0x0208, B:87:0x0191, B:89:0x019f), top: B:245:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0399  */
    /* JADX WARN: Code duplicated, block: B:175:0x039d A[Catch: CancellationException -> 0x009a, all -> 0x036c, TryCatch #8 {CancellationException -> 0x009a, blocks: (B:212:0x04d0, B:207:0x04a7, B:208:0x04bc, B:210:0x04c2, B:26:0x0084, B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b, B:159:0x0355, B:163:0x0373, B:166:0x037d, B:169:0x038a, B:172:0x0394, B:175:0x039d, B:176:0x039f, B:190:0x0425, B:192:0x0461, B:184:0x03f6, B:186:0x0404, B:33:0x00b3, B:117:0x024f, B:128:0x0273, B:130:0x027d, B:39:0x00cd, B:107:0x0221, B:109:0x022b, B:111:0x0233, B:113:0x0237, B:103:0x01fa, B:105:0x0208, B:87:0x0191, B:89:0x019f), top: B:245:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03b0 A[Catch: all -> 0x036c, Exception -> 0x03c9, TRY_ENTER, TryCatch #7 {Exception -> 0x03c9, blocks: (B:178:0x03b0, B:182:0x03cd), top: B:258:0x03ae }] */
    /* JADX WARN: Code duplicated, block: B:181:0x03cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x03cd A[Catch: all -> 0x036c, Exception -> 0x03c9, TRY_LEAVE, TryCatch #7 {Exception -> 0x03c9, blocks: (B:178:0x03b0, B:182:0x03cd), top: B:258:0x03ae }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0421  */
    /* JADX WARN: Code duplicated, block: B:192:0x0461 A[Catch: CancellationException -> 0x009a, all -> 0x036c, TRY_LEAVE, TryCatch #8 {CancellationException -> 0x009a, blocks: (B:212:0x04d0, B:207:0x04a7, B:208:0x04bc, B:210:0x04c2, B:26:0x0084, B:134:0x029e, B:139:0x02ae, B:141:0x02b2, B:143:0x02b6, B:145:0x02bd, B:147:0x02c1, B:148:0x02e9, B:150:0x02ef, B:151:0x0311, B:153:0x0317, B:154:0x0325, B:155:0x032d, B:157:0x034b, B:159:0x0355, B:163:0x0373, B:166:0x037d, B:169:0x038a, B:172:0x0394, B:175:0x039d, B:176:0x039f, B:190:0x0425, B:192:0x0461, B:184:0x03f6, B:186:0x0404, B:33:0x00b3, B:117:0x024f, B:128:0x0273, B:130:0x027d, B:39:0x00cd, B:107:0x0221, B:109:0x022b, B:111:0x0233, B:113:0x0237, B:103:0x01fa, B:105:0x0208, B:87:0x0191, B:89:0x019f), top: B:245:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x049d  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c2 A[Catch: CancellationException -> 0x009a, all -> 0x04a0, LOOP:0: B:208:0x04bc->B:210:0x04c2, LOOP_END, TryCatch #0 {all -> 0x04a0, blocks: (B:212:0x04d0, B:207:0x04a7, B:208:0x04bc, B:210:0x04c2, B:195:0x048c), top: B:245:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:223:0x0514  */
    /* JADX WARN: Code duplicated, block: B:227:0x0530  */
    /* JADX WARN: Code duplicated, block: B:229:0x053c  */
    /* JADX WARN: Code duplicated, block: B:231:0x0544  */
    /* JADX WARN: Code duplicated, block: B:232:0x0549  */
    /* JADX WARN: Code duplicated, block: B:234:0x054c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0552  */
    /* JADX WARN: Code duplicated, block: B:237:0x057a  */
    /* JADX WARN: Code duplicated, block: B:239:0x057e  */
    /* JADX WARN: Code duplicated, block: B:241:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:250:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:89:0x019f A[Catch: CancellationException -> 0x009a, all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00e2, blocks: (B:40:0x00cf, B:44:0x00d9, B:52:0x00f4, B:54:0x00fe, B:56:0x0102, B:58:0x010c, B:61:0x0127, B:63:0x0131, B:91:0x01b8, B:95:0x01c4, B:97:0x01d8, B:99:0x01f1, B:105:0x0208, B:64:0x0135, B:66:0x013f, B:67:0x0143, B:69:0x014d, B:70:0x0150, B:72:0x015a, B:73:0x015d, B:75:0x0168, B:76:0x016b, B:78:0x0176, B:79:0x0179, B:81:0x0184, B:89:0x019f), top: B:249:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d8 A[Catch: all -> 0x00e2, Exception -> 0x01c1, TryCatch #2 {all -> 0x00e2, blocks: (B:40:0x00cf, B:44:0x00d9, B:52:0x00f4, B:54:0x00fe, B:56:0x0102, B:58:0x010c, B:61:0x0127, B:63:0x0131, B:91:0x01b8, B:95:0x01c4, B:97:0x01d8, B:99:0x01f1, B:105:0x0208, B:64:0x0135, B:66:0x013f, B:67:0x0143, B:69:0x014d, B:70:0x0150, B:72:0x015a, B:73:0x015d, B:75:0x0168, B:76:0x016b, B:78:0x0176, B:79:0x0179, B:81:0x0184, B:89:0x019f), top: B:249:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f1 A[Catch: all -> 0x00e2, Exception -> 0x01c1, TRY_LEAVE, TryCatch #2 {all -> 0x00e2, blocks: (B:40:0x00cf, B:44:0x00d9, B:52:0x00f4, B:54:0x00fe, B:56:0x0102, B:58:0x010c, B:61:0x0127, B:63:0x0131, B:91:0x01b8, B:95:0x01c4, B:97:0x01d8, B:99:0x01f1, B:105:0x0208, B:64:0x0135, B:66:0x013f, B:67:0x0143, B:69:0x014d, B:70:0x0150, B:72:0x015a, B:73:0x015d, B:75:0x0168, B:76:0x016b, B:78:0x0176, B:79:0x0179, B:81:0x0184, B:89:0x019f), top: B:249:0x00cf }] */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0461, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x019f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01d8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.PowerManager] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.io.Serializable, l83.k] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [l83.k] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v3, types: [d33.h1] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX INFO: renamed from: A */
    public final Object m31024A(C33460u0 c33460u0, Float f13, C23465k c23465k, AbstractC32269c abstractC32269c) {
        C11621p0 c11621p0;
        C23454a0 c23454a0;
        InterfaceC2339e interfaceC2339eM7228b;
        EnumC2341g enumC2341g;
        Object c26203f;
        String message;
        ?? r14;
        ?? r10;
        ?? r15;
        C2345k c2345kM31043s;
        InterfaceC2339e interfaceC2339eM7232c;
        EnumC2341g enumC2341g2;
        String strM30461o;
        Object obj;
        Object obj2;
        int i13;
        AndroidThermalState androidThermalState;
        int i14;
        int i15;
        boolean z4;
        Float f14;
        ?? r16;
        Object obj3;
        InterfaceC2339e interfaceC2339eM7228b2;
        EnumC2341g enumC2341g3;
        Boolean boolM48917u;
        boolean z13;
        C12645n c12645n;
        Float f15;
        C23465k c23465k2;
        boolean z14;
        C33460u0 c33460u1;
        C11602h1 c11602h1;
        C16831a c16831a;
        C2345k c2345kM31043s2;
        InterfaceC2339e interfaceC2339eM7232c2;
        EnumC2341g enumC2341g4;
        boolean zBooleanValue;
        Object objM48918v;
        Float f16;
        ?? r17;
        C12662v0 c12662v0;
        Float f17;
        C11602h1 c11602h2;
        C33460u0 c33460u2;
        C16831a c16831a2;
        C16831a c16831a3;
        Object objM35428r;
        ?? r18;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ?? arrayList;
        ArrayList arrayList2;
        Iterator it;
        String strM31021g;
        C2345k c2345kM31043s3;
        InterfaceC2339e interfaceC2339eM7232c3;
        EnumC2341g enumC2341g5;
        String strM100712t;
        List list;
        List list2;
        Telemetry telemetry;
        C2345k c2345kM31043s4;
        InterfaceC2339e interfaceC2339eM7232c4;
        EnumC2341g enumC2341g6;
        ?? r19;
        Telemetry telemetry2;
        ArrayList arrayList3;
        Iterator it3;
        Iterator it4;
        Float f18;
        Object obj4;
        ?? r24 = this.f37439a;
        String str = "[sendCallStats] #powerSaveMode state: ";
        Object obj5 = "[sendCallStats] #thermals state: ";
        if (abstractC32269c instanceof C11621p0) {
            c11621p0 = (C11621p0) abstractC32269c;
            int i16 = c11621p0.f37521J;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c11621p0.f37521J = i16 - Integer.MIN_VALUE;
            } else {
                c11621p0 = new C11621p0(this, abstractC32269c);
            }
        } else {
            c11621p0 = new C11621p0(this, abstractC32269c);
        }
        Object objM35408x = c11621p0.f37519H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = c11621p0.f37521J;
        C23454a0 c23454a1 = C23454a0.f92919a;
        ?? r110 = 2;
        try {
            try {
                if (i17 == 0) {
                    i13 = 3;
                    AbstractC34132o.m107864I(objM35408x);
                    try {
                        androidThermalState = AndroidThermalState.ANDROID_THERMAL_STATE_UNSPECIFIED;
                        try {
                            try {
                                z4 = false;
                                if (Build.VERSION.SDK_INT < 29) {
                                    objM48918v = androidThermalState;
                                } else if (r24 != 0) {
                                    try {
                                        objM48918v = AbstractC17269i.m48918v(r24.getCurrentThermalStatus());
                                    } catch (Exception e5) {
                                        e = e5;
                                        i14 = 2;
                                        i15 = 1;
                                        C2343i c2343i = C2343i.f9269a;
                                        interfaceC2339eM7228b2 = C2343i.m7228b();
                                        enumC2341g3 = EnumC2341g.ERROR;
                                        if (interfaceC2339eM7228b2.isLoggable(enumC2341g3, "SafeCall")) {
                                            C2343i.m7227a().log(enumC2341g3, "SafeCall", "Exception occurred: " + e.getMessage(), e);
                                        }
                                        if (r24 != 0) {
                                            try {
                                                boolM48917u = AbstractC17269i.m48917u(r24.isPowerSaveMode());
                                            } catch (Exception e13) {
                                                C2343i c2343i2 = C2343i.f9269a;
                                                InterfaceC2339e interfaceC2339eM7228b3 = C2343i.m7228b();
                                                EnumC2341g enumC2341g7 = EnumC2341g.ERROR;
                                                if (interfaceC2339eM7228b3.isLoggable(enumC2341g7, "SafeCall")) {
                                                    C2343i.m7227a().log(enumC2341g7, "SafeCall", "Exception occurred: " + e13.getMessage(), e13);
                                                }
                                                z13 = z4;
                                            }
                                        } else {
                                            boolM48917u = null;
                                        }
                                        c2345kM31043s2 = m31043s();
                                        interfaceC2339eM7232c2 = c2345kM31043s2.m7232c();
                                        enumC2341g4 = EnumC2341g.DEBUG;
                                        if (interfaceC2339eM7232c2.isLoggable(enumC2341g4, c2345kM31043s2.m7231b())) {
                                            c2345kM31043s2.m7230a().log(enumC2341g4, c2345kM31043s2.m7231b(), "[sendCallStats] #powerSaveMode state: " + boolM48917u, null);
                                        }
                                        if (boolM48917u != null) {
                                            zBooleanValue = boolM48917u.booleanValue();
                                        } else {
                                            zBooleanValue = z4;
                                        }
                                        z13 = zBooleanValue;
                                        c12645n = (C12645n) this.f37421A.getValue();
                                        if (c12645n != null) {
                                            f15 = f13;
                                            z14 = z13;
                                            r24 = c23465k;
                                            c33460u1 = c33460u0;
                                            c11602h1 = this;
                                            c16831a = null;
                                            c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                                            if (c12662v0 != null) {
                                                c11621p0.f37522w = c11602h1;
                                                c11621p0.f37523x = c33460u1;
                                                c11621p0.f37524y = f15;
                                                c11621p0.f37525z = r24;
                                                c11621p0.f37516E = c16831a;
                                                c11621p0.f37517F = androidThermalState;
                                                c11621p0.f37518G = z14;
                                                c11621p0.f37521J = i14;
                                                objM35428r = c12662v0.m35428r(c11621p0);
                                                if (objM35428r != enumC31071a) {
                                                    C33460u0 c33460u3 = c33460u1;
                                                    c16831a2 = c16831a;
                                                    objM35408x = objM35428r;
                                                    f17 = f15;
                                                    c11602h2 = c11602h1;
                                                    c33460u2 = c33460u3;
                                                    r18 = r24;
                                                    c16831a3 = (C16831a) objM35408x;
                                                    r18 = r18;
                                                    c11602h2 = c11602h2;
                                                    f17 = f17;
                                                }
                                            } else {
                                                f17 = f15;
                                                c11602h2 = c11602h1;
                                                c33460u2 = c33460u1;
                                                c16831a2 = c16831a;
                                                c16831a3 = null;
                                                r18 = r24;
                                            }
                                            boolean z15 = z14;
                                            AndroidThermalState androidThermalState2 = androidThermalState;
                                            C23372m c23372m = c11602h2.f37457s;
                                            if (c16831a2 != null) {
                                                linkedHashMap = c16831a2.f64690b;
                                            } else {
                                                linkedHashMap = null;
                                            }
                                            c23372m.m67653b(linkedHashMap, "getstats");
                                            C23372m c23372m2 = c11602h2.f37458t;
                                            if (c16831a3 != null) {
                                                linkedHashMap2 = c16831a3.f64690b;
                                            } else {
                                                linkedHashMap2 = null;
                                            }
                                            c23372m2.m67653b(linkedHashMap2, "getstats");
                                            arrayList = new ArrayList();
                                            Collection collectionValues = ((ConcurrentHashMap) c11602h2.f37451m.f21695x).values();
                                            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                                            List listM74093D1 = AbstractC25265s.m74093D1(collectionValues);
                                            arrayList2 = new ArrayList();
                                            it = listM74093D1.iterator();
                                            while (it.hasNext()) {
                                                C23371l c23371lM67652a = ((C23372m) it.next()).m67652a();
                                                arrayList.add(c23371lM67652a);
                                                List list3 = c23371lM67652a.f92649a;
                                                Iterator it5 = it;
                                                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                                                it3 = list3.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList3.add(AbstractC35903f.m113995M((C23370k) it3.next()));
                                                }
                                                AbstractC25265s.m74141p0(arrayList2, arrayList3);
                                                it = it5;
                                            }
                                            strM31021g = m31021g(c11602h2, AbstractC25265s.m74097F1(arrayList2));
                                            c2345kM31043s3 = c11602h2.m31043s();
                                            interfaceC2339eM7232c3 = c2345kM31043s3.m7232c();
                                            enumC2341g5 = EnumC2341g.DEBUG;
                                            if (interfaceC2339eM7232c3.isLoggable(enumC2341g5, c2345kM31043s3.m7231b())) {
                                                c23454a0 = c23454a1;
                                                c2345kM31043s3.m7230a().log(enumC2341g5, c2345kM31043s3.m7231b(), "[sendCallStats] #sfu; #track; rtc_stats: " + strM31021g, null);
                                            } else {
                                                c23454a0 = c23454a1;
                                            }
                                            String str2 = c11602h2.f37441c;
                                            String str3 = c11602h2.f37440b.f139270E;
                                            if (c33460u2 != null) {
                                                strM100712t = AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17063w);
                                            } else {
                                                strM100712t = "";
                                            }
                                            if (c33460u2 != null) {
                                            }
                                            list = C25271y.f99162w;
                                            if (c16831a2 != null) {
                                                list2 = c16831a2.f64691c;
                                            } else {
                                                list2 = list;
                                            }
                                            if (c16831a3 != null) {
                                                list = c16831a3.f64691c;
                                            }
                                            List list4 = list;
                                            AndroidState androidState = new AndroidState(androidThermalState2, z15, null, 4, null);
                                            if (f17 != null) {
                                                if (r18 != 0) {
                                                    telemetry2 = new Telemetry(null, new Reconnection(((Number) r18.f92937w).floatValue(), (WebsocketReconnectStrategy) r18.f92938x, null, 4, null), null, 5, null);
                                                } else {
                                                    telemetry2 = null;
                                                }
                                                telemetry = telemetry2;
                                                SendStatsRequest sendStatsRequest = new SendStatsRequest(str2, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState, null, telemetry, null, null, null, strM31021g, list2, list4, str3, null, 277184, null);
                                                c2345kM31043s4 = c11602h2.m31043s();
                                                interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                                enumC2341g6 = EnumC2341g.DEBUG;
                                                if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                                    c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                                }
                                                C28822o c28822o = c11602h2.m31044t().f168486d;
                                                c11621p0.f37522w = c11602h2;
                                                c11621p0.f37523x = f17;
                                                c11621p0.f37524y = r18;
                                                c11621p0.f37525z = arrayList;
                                                str = null;
                                                c11621p0.f37516E = null;
                                                c11621p0.f37517F = null;
                                                c11621p0.f37521J = i13;
                                                objM35408x = c28822o.sendStats(sendStatsRequest, c11621p0);
                                                if (objM35408x == enumC31071a) {
                                                    return enumC31071a;
                                                }
                                                r19 = r18;
                                                obj4 = c11602h2;
                                                f18 = f17;
                                                r24 = r19;
                                                obj5 = obj4;
                                                r110 = f18;
                                                c26203f = new C26204g(objM35408x);
                                                r15 = r24;
                                                r10 = obj5;
                                                r14 = r110;
                                                c2345kM31043s = r10.m31043s();
                                                interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                                enumC2341g2 = EnumC2341g.DEBUG;
                                                if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                                    InterfaceC2344j interfaceC2344jM7230a = c2345kM31043s.m7230a();
                                                    String strM7231b = c2345kM31043s.m7231b();
                                                    if (c26203f instanceof C26204g) {
                                                        Object objM77814e = ((C26204g) c26203f).m77814e();
                                                        if (r15 != 0) {
                                                            obj = (Float) r15.f92937w;
                                                        } else {
                                                            obj = str;
                                                        }
                                                        if (r15 != 0) {
                                                            obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                        } else {
                                                            obj2 = str;
                                                        }
                                                        strM30461o = "Success. Response: " + objM77814e + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                                    } else {
                                                        if (c26203f instanceof C26203f) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                                    }
                                                    interfaceC2344jM7230a.log(enumC2341g2, strM7231b, "sendStats: " + strM30461o, null);
                                                }
                                                return c23454a0;
                                            }
                                            telemetry2 = new Telemetry(new Float(f17.floatValue()), null, null, 6, null);
                                            telemetry = telemetry2;
                                            SendStatsRequest sendStatsRequest2 = new SendStatsRequest(str2, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState, null, telemetry, null, null, null, strM31021g, list2, list4, str3, null, 277184, null);
                                            c2345kM31043s4 = c11602h2.m31043s();
                                            interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                            enumC2341g6 = EnumC2341g.DEBUG;
                                            if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                                c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                            }
                                            C28822o c28822o2 = c11602h2.m31044t().f168486d;
                                            c11621p0.f37522w = c11602h2;
                                            c11621p0.f37523x = f17;
                                            c11621p0.f37524y = r18;
                                            c11621p0.f37525z = arrayList;
                                            str = null;
                                            c11621p0.f37516E = null;
                                            c11621p0.f37517F = null;
                                            c11621p0.f37521J = i13;
                                            objM35408x = c28822o2.sendStats(sendStatsRequest2, c11621p0);
                                            if (objM35408x == enumC31071a) {
                                                return enumC31071a;
                                            }
                                            r19 = r18;
                                            obj4 = c11602h2;
                                            f18 = f17;
                                            r24 = r19;
                                            obj5 = obj4;
                                            r110 = f18;
                                            c26203f = new C26204g(objM35408x);
                                            r15 = r24;
                                            r10 = obj5;
                                            r14 = r110;
                                            c2345kM31043s = r10.m31043s();
                                            interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                            enumC2341g2 = EnumC2341g.DEBUG;
                                            if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                                InterfaceC2344j interfaceC2344jM7230a2 = c2345kM31043s.m7230a();
                                                String strM7231b2 = c2345kM31043s.m7231b();
                                                if (c26203f instanceof C26204g) {
                                                    Object objM77814e2 = ((C26204g) c26203f).m77814e();
                                                    if (r15 != 0) {
                                                        obj = (Float) r15.f92937w;
                                                    } else {
                                                        obj = str;
                                                    }
                                                    if (r15 != 0) {
                                                        obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                    } else {
                                                        obj2 = str;
                                                    }
                                                    strM30461o = "Success. Response: " + objM77814e2 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                                } else {
                                                    if (c26203f instanceof C26203f) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                                }
                                                interfaceC2344jM7230a2.log(enumC2341g2, strM7231b2, "sendStats: " + strM30461o, null);
                                            }
                                            return c23454a0;
                                        }
                                        try {
                                            c11621p0.f37522w = this;
                                            c11621p0.f37523x = c33460u0;
                                            f15 = f13;
                                            try {
                                                c11621p0.f37524y = f15;
                                                c23465k2 = c23465k;
                                                try {
                                                    c11621p0.f37525z = c23465k2;
                                                    c11621p0.f37516E = androidThermalState;
                                                    c11621p0.f37518G = z13;
                                                    c11621p0.f37521J = i15;
                                                    objM35408x = c12645n.m35408x(c11621p0);
                                                    if (objM35408x != enumC31071a) {
                                                        z14 = z13;
                                                        r24 = c23465k2;
                                                        c33460u1 = c33460u0;
                                                        c11602h1 = this;
                                                        c16831a = (C16831a) objM35408x;
                                                        r24 = r24;
                                                        c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                                                        if (c12662v0 != null) {
                                                            c11621p0.f37522w = c11602h1;
                                                            c11621p0.f37523x = c33460u1;
                                                            c11621p0.f37524y = f15;
                                                            c11621p0.f37525z = r24;
                                                            c11621p0.f37516E = c16831a;
                                                            c11621p0.f37517F = androidThermalState;
                                                            c11621p0.f37518G = z14;
                                                            c11621p0.f37521J = i14;
                                                            objM35428r = c12662v0.m35428r(c11621p0);
                                                            if (objM35428r != enumC31071a) {
                                                                C33460u0 c33460u4 = c33460u1;
                                                                c16831a2 = c16831a;
                                                                objM35408x = objM35428r;
                                                                f17 = f15;
                                                                c11602h2 = c11602h1;
                                                                c33460u2 = c33460u4;
                                                                r18 = r24;
                                                                c16831a3 = (C16831a) objM35408x;
                                                                r18 = r18;
                                                                c11602h2 = c11602h2;
                                                                f17 = f17;
                                                            }
                                                        } else {
                                                            f17 = f15;
                                                            c11602h2 = c11602h1;
                                                            c33460u2 = c33460u1;
                                                            c16831a2 = c16831a;
                                                            c16831a3 = null;
                                                            r18 = r24;
                                                        }
                                                        boolean z16 = z14;
                                                        AndroidThermalState androidThermalState3 = androidThermalState;
                                                        C23372m c23372m3 = c11602h2.f37457s;
                                                        if (c16831a2 != null) {
                                                            linkedHashMap = c16831a2.f64690b;
                                                        } else {
                                                            linkedHashMap = null;
                                                        }
                                                        c23372m3.m67653b(linkedHashMap, "getstats");
                                                        C23372m c23372m4 = c11602h2.f37458t;
                                                        if (c16831a3 != null) {
                                                            linkedHashMap2 = c16831a3.f64690b;
                                                        } else {
                                                            linkedHashMap2 = null;
                                                        }
                                                        c23372m4.m67653b(linkedHashMap2, "getstats");
                                                        arrayList = new ArrayList();
                                                        Collection collectionValues2 = ((ConcurrentHashMap) c11602h2.f37451m.f21695x).values();
                                                        AbstractC22676k.m65749i(collectionValues2, "<get-values>(...)");
                                                        List listM74093D2 = AbstractC25265s.m74093D1(collectionValues2);
                                                        arrayList2 = new ArrayList();
                                                        it = listM74093D2.iterator();
                                                        while (it.hasNext()) {
                                                            C23371l c23371lM67652a2 = ((C23372m) it.next()).m67652a();
                                                            arrayList.add(c23371lM67652a2);
                                                            List list5 = c23371lM67652a2.f92649a;
                                                            Iterator it6 = it;
                                                            arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
                                                            it3 = list5.iterator();
                                                            while (it3.hasNext()) {
                                                                arrayList3.add(AbstractC35903f.m113995M((C23370k) it3.next()));
                                                            }
                                                            AbstractC25265s.m74141p0(arrayList2, arrayList3);
                                                            it = it6;
                                                        }
                                                        strM31021g = m31021g(c11602h2, AbstractC25265s.m74097F1(arrayList2));
                                                        c2345kM31043s3 = c11602h2.m31043s();
                                                        interfaceC2339eM7232c3 = c2345kM31043s3.m7232c();
                                                        enumC2341g5 = EnumC2341g.DEBUG;
                                                        if (interfaceC2339eM7232c3.isLoggable(enumC2341g5, c2345kM31043s3.m7231b())) {
                                                            c23454a0 = c23454a1;
                                                            c2345kM31043s3.m7230a().log(enumC2341g5, c2345kM31043s3.m7231b(), "[sendCallStats] #sfu; #track; rtc_stats: " + strM31021g, null);
                                                        } else {
                                                            c23454a0 = c23454a1;
                                                        }
                                                        String str4 = c11602h2.f37441c;
                                                        String str5 = c11602h2.f37440b.f139270E;
                                                        if (c33460u2 != null) {
                                                            strM100712t = AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17063w);
                                                        } else {
                                                            strM100712t = "";
                                                        }
                                                        if (c33460u2 != null) {
                                                        }
                                                        list = C25271y.f99162w;
                                                        if (c16831a2 != null) {
                                                            list2 = c16831a2.f64691c;
                                                        } else {
                                                            list2 = list;
                                                        }
                                                        if (c16831a3 != null) {
                                                            list = c16831a3.f64691c;
                                                        }
                                                        List list6 = list;
                                                        AndroidState androidState2 = new AndroidState(androidThermalState3, z16, null, 4, null);
                                                        if (f17 != null) {
                                                            if (r18 != 0) {
                                                                telemetry2 = new Telemetry(null, new Reconnection(((Number) r18.f92937w).floatValue(), (WebsocketReconnectStrategy) r18.f92938x, null, 4, null), null, 5, null);
                                                            } else {
                                                                telemetry2 = null;
                                                            }
                                                            telemetry = telemetry2;
                                                            SendStatsRequest sendStatsRequest3 = new SendStatsRequest(str4, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState2, null, telemetry, null, null, null, strM31021g, list2, list6, str5, null, 277184, null);
                                                            c2345kM31043s4 = c11602h2.m31043s();
                                                            interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                                            enumC2341g6 = EnumC2341g.DEBUG;
                                                            if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                                                c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                                            }
                                                            C28822o c28822o3 = c11602h2.m31044t().f168486d;
                                                            c11621p0.f37522w = c11602h2;
                                                            c11621p0.f37523x = f17;
                                                            c11621p0.f37524y = r18;
                                                            c11621p0.f37525z = arrayList;
                                                            str = null;
                                                            c11621p0.f37516E = null;
                                                            c11621p0.f37517F = null;
                                                            c11621p0.f37521J = i13;
                                                            objM35408x = c28822o3.sendStats(sendStatsRequest3, c11621p0);
                                                            if (objM35408x == enumC31071a) {
                                                                return enumC31071a;
                                                            }
                                                            r19 = r18;
                                                            obj4 = c11602h2;
                                                            f18 = f17;
                                                            r24 = r19;
                                                            obj5 = obj4;
                                                            r110 = f18;
                                                            c26203f = new C26204g(objM35408x);
                                                            r15 = r24;
                                                            r10 = obj5;
                                                            r14 = r110;
                                                            c2345kM31043s = r10.m31043s();
                                                            interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                                            enumC2341g2 = EnumC2341g.DEBUG;
                                                            if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                                                InterfaceC2344j interfaceC2344jM7230a3 = c2345kM31043s.m7230a();
                                                                String strM7231b3 = c2345kM31043s.m7231b();
                                                                if (c26203f instanceof C26204g) {
                                                                    Object objM77814e3 = ((C26204g) c26203f).m77814e();
                                                                    if (r15 != 0) {
                                                                        obj = (Float) r15.f92937w;
                                                                    } else {
                                                                        obj = str;
                                                                    }
                                                                    if (r15 != 0) {
                                                                        obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                                    } else {
                                                                        obj2 = str;
                                                                    }
                                                                    strM30461o = "Success. Response: " + objM77814e3 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                                                } else {
                                                                    if (c26203f instanceof C26203f) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                                                }
                                                                interfaceC2344jM7230a3.log(enumC2341g2, strM7231b3, "sendStats: " + strM30461o, null);
                                                            }
                                                            return c23454a0;
                                                        }
                                                        telemetry2 = new Telemetry(new Float(f17.floatValue()), null, null, 6, null);
                                                        telemetry = telemetry2;
                                                        SendStatsRequest sendStatsRequest4 = new SendStatsRequest(str4, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState2, null, telemetry, null, null, null, strM31021g, list2, list6, str5, null, 277184, null);
                                                        c2345kM31043s4 = c11602h2.m31043s();
                                                        interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                                        enumC2341g6 = EnumC2341g.DEBUG;
                                                        if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                                            c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                                        }
                                                        C28822o c28822o4 = c11602h2.m31044t().f168486d;
                                                        c11621p0.f37522w = c11602h2;
                                                        c11621p0.f37523x = f17;
                                                        c11621p0.f37524y = r18;
                                                        c11621p0.f37525z = arrayList;
                                                        str = null;
                                                        c11621p0.f37516E = null;
                                                        c11621p0.f37517F = null;
                                                        c11621p0.f37521J = i13;
                                                        objM35408x = c28822o4.sendStats(sendStatsRequest4, c11621p0);
                                                        if (objM35408x == enumC31071a) {
                                                            return enumC31071a;
                                                        }
                                                        r19 = r18;
                                                        obj4 = c11602h2;
                                                        f18 = f17;
                                                        r24 = r19;
                                                        obj5 = obj4;
                                                        r110 = f18;
                                                        c26203f = new C26204g(objM35408x);
                                                        r15 = r24;
                                                        r10 = obj5;
                                                        r14 = r110;
                                                        c2345kM31043s = r10.m31043s();
                                                        interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                                        enumC2341g2 = EnumC2341g.DEBUG;
                                                        if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                                            InterfaceC2344j interfaceC2344jM7230a4 = c2345kM31043s.m7230a();
                                                            String strM7231b4 = c2345kM31043s.m7231b();
                                                            if (c26203f instanceof C26204g) {
                                                                Object objM77814e4 = ((C26204g) c26203f).m77814e();
                                                                if (r15 != 0) {
                                                                    obj = (Float) r15.f92937w;
                                                                } else {
                                                                    obj = str;
                                                                }
                                                                if (r15 != 0) {
                                                                    obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                                } else {
                                                                    obj2 = str;
                                                                }
                                                                strM30461o = "Success. Response: " + objM77814e4 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                                            } else {
                                                                if (c26203f instanceof C26203f) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                                            }
                                                            interfaceC2344jM7230a4.log(enumC2341g2, strM7231b4, "sendStats: " + strM30461o, null);
                                                        }
                                                        return c23454a0;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r110 = f15;
                                                    c23454a0 = c23454a1;
                                                    r24 = c23465k2;
                                                    str = null;
                                                    obj5 = this;
                                                    C2343i c2343i3 = C2343i.f9269a;
                                                    interfaceC2339eM7228b = C2343i.m7228b();
                                                    enumC2341g = EnumC2341g.ERROR;
                                                    if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                                                        C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                                                    }
                                                    message = th.getMessage();
                                                    if (message == null) {
                                                        message = "API call failed";
                                                    }
                                                    c26203f = new C26203f(new C26201d(message, th));
                                                    r15 = r24;
                                                    r10 = obj5;
                                                    r14 = r110;
                                                    c2345kM31043s = r10.m31043s();
                                                    interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                                    enumC2341g2 = EnumC2341g.DEBUG;
                                                    if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                                        InterfaceC2344j interfaceC2344jM7230a5 = c2345kM31043s.m7230a();
                                                        String strM7231b5 = c2345kM31043s.m7231b();
                                                        if (c26203f instanceof C26204g) {
                                                            Object objM77814e5 = ((C26204g) c26203f).m77814e();
                                                            if (r15 != 0) {
                                                                obj = (Float) r15.f92937w;
                                                            } else {
                                                                obj = str;
                                                            }
                                                            if (r15 != 0) {
                                                                obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                            } else {
                                                                obj2 = str;
                                                            }
                                                            strM30461o = "Success. Response: " + objM77814e5 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                                        } else {
                                                            if (c26203f instanceof C26203f) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                                        }
                                                        interfaceC2344jM7230a5.log(enumC2341g2, strM7231b5, "sendStats: " + strM30461o, null);
                                                    }
                                                    return c23454a0;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                c23465k2 = c23465k;
                                                r110 = f15;
                                                c23454a0 = c23454a1;
                                                r24 = c23465k2;
                                                str = null;
                                                obj5 = this;
                                                C2343i c2343i4 = C2343i.f9269a;
                                                interfaceC2339eM7228b = C2343i.m7228b();
                                                enumC2341g = EnumC2341g.ERROR;
                                                if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                                                    C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                                                }
                                                message = th.getMessage();
                                                if (message == null) {
                                                    message = "API call failed";
                                                }
                                                c26203f = new C26203f(new C26201d(message, th));
                                                r15 = r24;
                                                r10 = obj5;
                                                r14 = r110;
                                                c2345kM31043s = r10.m31043s();
                                                interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                                enumC2341g2 = EnumC2341g.DEBUG;
                                                if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                                    InterfaceC2344j interfaceC2344jM7230a6 = c2345kM31043s.m7230a();
                                                    String strM7231b6 = c2345kM31043s.m7231b();
                                                    if (c26203f instanceof C26204g) {
                                                        Object objM77814e6 = ((C26204g) c26203f).m77814e();
                                                        if (r15 != 0) {
                                                            obj = (Float) r15.f92937w;
                                                        } else {
                                                            obj = str;
                                                        }
                                                        if (r15 != 0) {
                                                            obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                        } else {
                                                            obj2 = str;
                                                        }
                                                        strM30461o = "Success. Response: " + objM77814e6 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                                    } else {
                                                        if (c26203f instanceof C26203f) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                                    }
                                                    interfaceC2344jM7230a6.log(enumC2341g2, strM7231b6, "sendStats: " + strM30461o, null);
                                                }
                                                return c23454a0;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            f15 = f13;
                                        }
                                        return enumC31071a;
                                    }
                                } else {
                                    objM48918v = null;
                                }
                                C2345k c2345kM31043s5 = m31043s();
                                InterfaceC2339e interfaceC2339eM7232c5 = c2345kM31043s5.m7232c();
                                i14 = 2;
                                try {
                                    EnumC2341g enumC2341g8 = EnumC2341g.DEBUG;
                                    i15 = 1;
                                    try {
                                        if (interfaceC2339eM7232c5.isLoggable(enumC2341g8, c2345kM31043s5.m7231b())) {
                                            c2345kM31043s5.m7230a().log(enumC2341g8, c2345kM31043s5.m7231b(), "[sendCallStats] #thermals state: " + objM48918v, null);
                                        }
                                        if (AbstractC22676k.m65745e(objM48918v, AbstractC17269i.m48918v(0))) {
                                            androidThermalState = AndroidThermalState.ANDROID_THERMAL_STATE_NONE;
                                        } else if (AbstractC22676k.m65745e(objM48918v, AbstractC17269i.m48918v(1))) {
                                            androidThermalState = AndroidThermalState.ANDROID_THERMAL_STATE_LIGHT;
                                        } else if (AbstractC22676k.m65745e(objM48918v, AbstractC17269i.m48918v(2))) {
                                            androidThermalState = AndroidThermalState.ANDROID_THERMAL_STATE_MODERATE;
                                        } else if (AbstractC22676k.m65745e(objM48918v, AbstractC17269i.m48918v(3))) {
                                            androidThermalState = AndroidThermalState.ANDROID_THERMAL_STATE_SEVERE;
                                        } else if (AbstractC22676k.m65745e(objM48918v, AbstractC17269i.m48918v(4))) {
                                            androidThermalState = AndroidThermalState.ANDROID_THERMAL_STATE_CRITICAL;
                                        } else if (AbstractC22676k.m65745e(objM48918v, AbstractC17269i.m48918v(5))) {
                                            androidThermalState = AndroidThermalState.ANDROID_THERMAL_STATE_EMERGENCY;
                                        } else if (AbstractC22676k.m65745e(objM48918v, AbstractC17269i.m48918v(6))) {
                                            androidThermalState = AndroidThermalState.ANDROID_THERMAL_STATE_SHUTDOWN;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        C2343i c2343i5 = C2343i.f9269a;
                                        interfaceC2339eM7228b2 = C2343i.m7228b();
                                        enumC2341g3 = EnumC2341g.ERROR;
                                        if (interfaceC2339eM7228b2.isLoggable(enumC2341g3, "SafeCall")) {
                                            C2343i.m7227a().log(enumC2341g3, "SafeCall", "Exception occurred: " + e.getMessage(), e);
                                        }
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    i15 = 1;
                                    C2343i c2343i6 = C2343i.f9269a;
                                    interfaceC2339eM7228b2 = C2343i.m7228b();
                                    enumC2341g3 = EnumC2341g.ERROR;
                                    if (interfaceC2339eM7228b2.isLoggable(enumC2341g3, "SafeCall")) {
                                        C2343i.m7227a().log(enumC2341g3, "SafeCall", "Exception occurred: " + e.getMessage(), e);
                                    }
                                    if (r24 != 0) {
                                        boolM48917u = AbstractC17269i.m48917u(r24.isPowerSaveMode());
                                    } else {
                                        boolM48917u = null;
                                    }
                                    c2345kM31043s2 = m31043s();
                                    interfaceC2339eM7232c2 = c2345kM31043s2.m7232c();
                                    enumC2341g4 = EnumC2341g.DEBUG;
                                    if (interfaceC2339eM7232c2.isLoggable(enumC2341g4, c2345kM31043s2.m7231b())) {
                                        c2345kM31043s2.m7230a().log(enumC2341g4, c2345kM31043s2.m7231b(), "[sendCallStats] #powerSaveMode state: " + boolM48917u, null);
                                    }
                                    if (boolM48917u != null) {
                                        zBooleanValue = boolM48917u.booleanValue();
                                    } else {
                                        zBooleanValue = z4;
                                    }
                                    z13 = zBooleanValue;
                                    c12645n = (C12645n) this.f37421A.getValue();
                                    if (c12645n != null) {
                                        f15 = f13;
                                        z14 = z13;
                                        r24 = c23465k;
                                        c33460u1 = c33460u0;
                                        c11602h1 = this;
                                        c16831a = null;
                                        c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                                        if (c12662v0 != null) {
                                            c11621p0.f37522w = c11602h1;
                                            c11621p0.f37523x = c33460u1;
                                            c11621p0.f37524y = f15;
                                            c11621p0.f37525z = r24;
                                            c11621p0.f37516E = c16831a;
                                            c11621p0.f37517F = androidThermalState;
                                            c11621p0.f37518G = z14;
                                            c11621p0.f37521J = i14;
                                            objM35428r = c12662v0.m35428r(c11621p0);
                                            if (objM35428r != enumC31071a) {
                                                C33460u0 c33460u5 = c33460u1;
                                                c16831a2 = c16831a;
                                                objM35408x = objM35428r;
                                                f17 = f15;
                                                c11602h2 = c11602h1;
                                                c33460u2 = c33460u5;
                                                r18 = r24;
                                                c16831a3 = (C16831a) objM35408x;
                                                r18 = r18;
                                                c11602h2 = c11602h2;
                                                f17 = f17;
                                            }
                                        } else {
                                            f17 = f15;
                                            c11602h2 = c11602h1;
                                            c33460u2 = c33460u1;
                                            c16831a2 = c16831a;
                                            c16831a3 = null;
                                            r18 = r24;
                                        }
                                        boolean z17 = z14;
                                        AndroidThermalState androidThermalState4 = androidThermalState;
                                        C23372m c23372m5 = c11602h2.f37457s;
                                        if (c16831a2 != null) {
                                            linkedHashMap = c16831a2.f64690b;
                                        } else {
                                            linkedHashMap = null;
                                        }
                                        c23372m5.m67653b(linkedHashMap, "getstats");
                                        C23372m c23372m6 = c11602h2.f37458t;
                                        if (c16831a3 != null) {
                                            linkedHashMap2 = c16831a3.f64690b;
                                        } else {
                                            linkedHashMap2 = null;
                                        }
                                        c23372m6.m67653b(linkedHashMap2, "getstats");
                                        arrayList = new ArrayList();
                                        Collection collectionValues3 = ((ConcurrentHashMap) c11602h2.f37451m.f21695x).values();
                                        AbstractC22676k.m65749i(collectionValues3, "<get-values>(...)");
                                        List listM74093D3 = AbstractC25265s.m74093D1(collectionValues3);
                                        arrayList2 = new ArrayList();
                                        it = listM74093D3.iterator();
                                        while (it.hasNext()) {
                                            C23371l c23371lM67652a3 = ((C23372m) it.next()).m67652a();
                                            arrayList.add(c23371lM67652a3);
                                            List list7 = c23371lM67652a3.f92649a;
                                            Iterator it7 = it;
                                            arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
                                            it3 = list7.iterator();
                                            while (it3.hasNext()) {
                                                arrayList3.add(AbstractC35903f.m113995M((C23370k) it3.next()));
                                            }
                                            AbstractC25265s.m74141p0(arrayList2, arrayList3);
                                            it = it7;
                                        }
                                        strM31021g = m31021g(c11602h2, AbstractC25265s.m74097F1(arrayList2));
                                        c2345kM31043s3 = c11602h2.m31043s();
                                        interfaceC2339eM7232c3 = c2345kM31043s3.m7232c();
                                        enumC2341g5 = EnumC2341g.DEBUG;
                                        if (interfaceC2339eM7232c3.isLoggable(enumC2341g5, c2345kM31043s3.m7231b())) {
                                            c23454a0 = c23454a1;
                                            c2345kM31043s3.m7230a().log(enumC2341g5, c2345kM31043s3.m7231b(), "[sendCallStats] #sfu; #track; rtc_stats: " + strM31021g, null);
                                        } else {
                                            c23454a0 = c23454a1;
                                        }
                                        String str6 = c11602h2.f37441c;
                                        String str7 = c11602h2.f37440b.f139270E;
                                        if (c33460u2 != null) {
                                            strM100712t = AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17063w);
                                        } else {
                                            strM100712t = "";
                                        }
                                        if (c33460u2 != null) {
                                        }
                                        list = C25271y.f99162w;
                                        if (c16831a2 != null) {
                                            list2 = c16831a2.f64691c;
                                        } else {
                                            list2 = list;
                                        }
                                        if (c16831a3 != null) {
                                            list = c16831a3.f64691c;
                                        }
                                        List list8 = list;
                                        AndroidState androidState3 = new AndroidState(androidThermalState4, z17, null, 4, null);
                                        if (f17 != null) {
                                            if (r18 != 0) {
                                                telemetry2 = new Telemetry(null, new Reconnection(((Number) r18.f92937w).floatValue(), (WebsocketReconnectStrategy) r18.f92938x, null, 4, null), null, 5, null);
                                            } else {
                                                telemetry2 = null;
                                            }
                                            telemetry = telemetry2;
                                            SendStatsRequest sendStatsRequest5 = new SendStatsRequest(str6, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState3, null, telemetry, null, null, null, strM31021g, list2, list8, str7, null, 277184, null);
                                            c2345kM31043s4 = c11602h2.m31043s();
                                            interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                            enumC2341g6 = EnumC2341g.DEBUG;
                                            if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                                c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                            }
                                            C28822o c28822o5 = c11602h2.m31044t().f168486d;
                                            c11621p0.f37522w = c11602h2;
                                            c11621p0.f37523x = f17;
                                            c11621p0.f37524y = r18;
                                            c11621p0.f37525z = arrayList;
                                            str = null;
                                            c11621p0.f37516E = null;
                                            c11621p0.f37517F = null;
                                            c11621p0.f37521J = i13;
                                            objM35408x = c28822o5.sendStats(sendStatsRequest5, c11621p0);
                                            if (objM35408x == enumC31071a) {
                                                return enumC31071a;
                                            }
                                            r19 = r18;
                                            obj4 = c11602h2;
                                            f18 = f17;
                                            r24 = r19;
                                            obj5 = obj4;
                                            r110 = f18;
                                            c26203f = new C26204g(objM35408x);
                                            r15 = r24;
                                            r10 = obj5;
                                            r14 = r110;
                                            c2345kM31043s = r10.m31043s();
                                            interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                            enumC2341g2 = EnumC2341g.DEBUG;
                                            if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                                InterfaceC2344j interfaceC2344jM7230a7 = c2345kM31043s.m7230a();
                                                String strM7231b7 = c2345kM31043s.m7231b();
                                                if (c26203f instanceof C26204g) {
                                                    Object objM77814e7 = ((C26204g) c26203f).m77814e();
                                                    if (r15 != 0) {
                                                        obj = (Float) r15.f92937w;
                                                    } else {
                                                        obj = str;
                                                    }
                                                    if (r15 != 0) {
                                                        obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                    } else {
                                                        obj2 = str;
                                                    }
                                                    strM30461o = "Success. Response: " + objM77814e7 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                                } else {
                                                    if (c26203f instanceof C26203f) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                                }
                                                interfaceC2344jM7230a7.log(enumC2341g2, strM7231b7, "sendStats: " + strM30461o, null);
                                            }
                                            return c23454a0;
                                        }
                                        telemetry2 = new Telemetry(new Float(f17.floatValue()), null, null, 6, null);
                                        telemetry = telemetry2;
                                        SendStatsRequest sendStatsRequest6 = new SendStatsRequest(str6, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState3, null, telemetry, null, null, null, strM31021g, list2, list8, str7, null, 277184, null);
                                        c2345kM31043s4 = c11602h2.m31043s();
                                        interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                        enumC2341g6 = EnumC2341g.DEBUG;
                                        if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                            c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                        }
                                        C28822o c28822o6 = c11602h2.m31044t().f168486d;
                                        c11621p0.f37522w = c11602h2;
                                        c11621p0.f37523x = f17;
                                        c11621p0.f37524y = r18;
                                        c11621p0.f37525z = arrayList;
                                        str = null;
                                        c11621p0.f37516E = null;
                                        c11621p0.f37517F = null;
                                        c11621p0.f37521J = i13;
                                        objM35408x = c28822o6.sendStats(sendStatsRequest6, c11621p0);
                                        if (objM35408x == enumC31071a) {
                                            return enumC31071a;
                                        }
                                        r19 = r18;
                                        obj4 = c11602h2;
                                        f18 = f17;
                                        r24 = r19;
                                        obj5 = obj4;
                                        r110 = f18;
                                        c26203f = new C26204g(objM35408x);
                                        r15 = r24;
                                        r10 = obj5;
                                        r14 = r110;
                                        c2345kM31043s = r10.m31043s();
                                        interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                        enumC2341g2 = EnumC2341g.DEBUG;
                                        if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                            InterfaceC2344j interfaceC2344jM7230a8 = c2345kM31043s.m7230a();
                                            String strM7231b8 = c2345kM31043s.m7231b();
                                            if (c26203f instanceof C26204g) {
                                                Object objM77814e8 = ((C26204g) c26203f).m77814e();
                                                if (r15 != 0) {
                                                    obj = (Float) r15.f92937w;
                                                } else {
                                                    obj = str;
                                                }
                                                if (r15 != 0) {
                                                    obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                } else {
                                                    obj2 = str;
                                                }
                                                strM30461o = "Success. Response: " + objM77814e8 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                            } else {
                                                if (c26203f instanceof C26203f) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                            }
                                            interfaceC2344jM7230a8.log(enumC2341g2, strM7231b8, "sendStats: " + strM30461o, null);
                                        }
                                        return c23454a0;
                                    }
                                    c11621p0.f37522w = this;
                                    c11621p0.f37523x = c33460u0;
                                    f15 = f13;
                                    c11621p0.f37524y = f15;
                                    c23465k2 = c23465k;
                                    c11621p0.f37525z = c23465k2;
                                    c11621p0.f37516E = androidThermalState;
                                    c11621p0.f37518G = z13;
                                    c11621p0.f37521J = i15;
                                    objM35408x = c12645n.m35408x(c11621p0);
                                    if (objM35408x != enumC31071a) {
                                        z14 = z13;
                                        r24 = c23465k2;
                                        c33460u1 = c33460u0;
                                        c11602h1 = this;
                                        c16831a = (C16831a) objM35408x;
                                        r24 = r24;
                                        c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                                        if (c12662v0 != null) {
                                            c11621p0.f37522w = c11602h1;
                                            c11621p0.f37523x = c33460u1;
                                            c11621p0.f37524y = f15;
                                            c11621p0.f37525z = r24;
                                            c11621p0.f37516E = c16831a;
                                            c11621p0.f37517F = androidThermalState;
                                            c11621p0.f37518G = z14;
                                            c11621p0.f37521J = i14;
                                            objM35428r = c12662v0.m35428r(c11621p0);
                                            if (objM35428r != enumC31071a) {
                                                C33460u0 c33460u6 = c33460u1;
                                                c16831a2 = c16831a;
                                                objM35408x = objM35428r;
                                                f17 = f15;
                                                c11602h2 = c11602h1;
                                                c33460u2 = c33460u6;
                                                r18 = r24;
                                                c16831a3 = (C16831a) objM35408x;
                                                r18 = r18;
                                                c11602h2 = c11602h2;
                                                f17 = f17;
                                            }
                                        } else {
                                            f17 = f15;
                                            c11602h2 = c11602h1;
                                            c33460u2 = c33460u1;
                                            c16831a2 = c16831a;
                                            c16831a3 = null;
                                            r18 = r24;
                                        }
                                        boolean z18 = z14;
                                        AndroidThermalState androidThermalState5 = androidThermalState;
                                        C23372m c23372m7 = c11602h2.f37457s;
                                        if (c16831a2 != null) {
                                            linkedHashMap = c16831a2.f64690b;
                                        } else {
                                            linkedHashMap = null;
                                        }
                                        c23372m7.m67653b(linkedHashMap, "getstats");
                                        C23372m c23372m8 = c11602h2.f37458t;
                                        if (c16831a3 != null) {
                                            linkedHashMap2 = c16831a3.f64690b;
                                        } else {
                                            linkedHashMap2 = null;
                                        }
                                        c23372m8.m67653b(linkedHashMap2, "getstats");
                                        arrayList = new ArrayList();
                                        Collection collectionValues4 = ((ConcurrentHashMap) c11602h2.f37451m.f21695x).values();
                                        AbstractC22676k.m65749i(collectionValues4, "<get-values>(...)");
                                        List listM74093D4 = AbstractC25265s.m74093D1(collectionValues4);
                                        arrayList2 = new ArrayList();
                                        it = listM74093D4.iterator();
                                        while (it.hasNext()) {
                                            C23371l c23371lM67652a4 = ((C23372m) it.next()).m67652a();
                                            arrayList.add(c23371lM67652a4);
                                            List list9 = c23371lM67652a4.f92649a;
                                            Iterator it8 = it;
                                            arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list9, 10));
                                            it3 = list9.iterator();
                                            while (it3.hasNext()) {
                                                arrayList3.add(AbstractC35903f.m113995M((C23370k) it3.next()));
                                            }
                                            AbstractC25265s.m74141p0(arrayList2, arrayList3);
                                            it = it8;
                                        }
                                        strM31021g = m31021g(c11602h2, AbstractC25265s.m74097F1(arrayList2));
                                        c2345kM31043s3 = c11602h2.m31043s();
                                        interfaceC2339eM7232c3 = c2345kM31043s3.m7232c();
                                        enumC2341g5 = EnumC2341g.DEBUG;
                                        if (interfaceC2339eM7232c3.isLoggable(enumC2341g5, c2345kM31043s3.m7231b())) {
                                            c23454a0 = c23454a1;
                                            c2345kM31043s3.m7230a().log(enumC2341g5, c2345kM31043s3.m7231b(), "[sendCallStats] #sfu; #track; rtc_stats: " + strM31021g, null);
                                        } else {
                                            c23454a0 = c23454a1;
                                        }
                                        String str8 = c11602h2.f37441c;
                                        String str9 = c11602h2.f37440b.f139270E;
                                        if (c33460u2 != null) {
                                            strM100712t = AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17063w);
                                        } else {
                                            strM100712t = "";
                                        }
                                        if (c33460u2 != null) {
                                        }
                                        list = C25271y.f99162w;
                                        if (c16831a2 != null) {
                                            list2 = c16831a2.f64691c;
                                        } else {
                                            list2 = list;
                                        }
                                        if (c16831a3 != null) {
                                            list = c16831a3.f64691c;
                                        }
                                        List list10 = list;
                                        AndroidState androidState4 = new AndroidState(androidThermalState5, z18, null, 4, null);
                                        if (f17 != null) {
                                            if (r18 != 0) {
                                                telemetry2 = new Telemetry(null, new Reconnection(((Number) r18.f92937w).floatValue(), (WebsocketReconnectStrategy) r18.f92938x, null, 4, null), null, 5, null);
                                            } else {
                                                telemetry2 = null;
                                            }
                                            telemetry = telemetry2;
                                            SendStatsRequest sendStatsRequest7 = new SendStatsRequest(str8, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState4, null, telemetry, null, null, null, strM31021g, list2, list10, str9, null, 277184, null);
                                            c2345kM31043s4 = c11602h2.m31043s();
                                            interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                            enumC2341g6 = EnumC2341g.DEBUG;
                                            if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                                c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                            }
                                            C28822o c28822o7 = c11602h2.m31044t().f168486d;
                                            c11621p0.f37522w = c11602h2;
                                            c11621p0.f37523x = f17;
                                            c11621p0.f37524y = r18;
                                            c11621p0.f37525z = arrayList;
                                            str = null;
                                            c11621p0.f37516E = null;
                                            c11621p0.f37517F = null;
                                            c11621p0.f37521J = i13;
                                            objM35408x = c28822o7.sendStats(sendStatsRequest7, c11621p0);
                                            if (objM35408x == enumC31071a) {
                                                return enumC31071a;
                                            }
                                            r19 = r18;
                                            obj4 = c11602h2;
                                            f18 = f17;
                                            r24 = r19;
                                            obj5 = obj4;
                                            r110 = f18;
                                            c26203f = new C26204g(objM35408x);
                                            r15 = r24;
                                            r10 = obj5;
                                            r14 = r110;
                                            c2345kM31043s = r10.m31043s();
                                            interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                            enumC2341g2 = EnumC2341g.DEBUG;
                                            if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                                InterfaceC2344j interfaceC2344jM7230a9 = c2345kM31043s.m7230a();
                                                String strM7231b9 = c2345kM31043s.m7231b();
                                                if (c26203f instanceof C26204g) {
                                                    Object objM77814e9 = ((C26204g) c26203f).m77814e();
                                                    if (r15 != 0) {
                                                        obj = (Float) r15.f92937w;
                                                    } else {
                                                        obj = str;
                                                    }
                                                    if (r15 != 0) {
                                                        obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                    } else {
                                                        obj2 = str;
                                                    }
                                                    strM30461o = "Success. Response: " + objM77814e9 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                                } else {
                                                    if (c26203f instanceof C26203f) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                                }
                                                interfaceC2344jM7230a9.log(enumC2341g2, strM7231b9, "sendStats: " + strM30461o, null);
                                            }
                                            return c23454a0;
                                        }
                                        telemetry2 = new Telemetry(new Float(f17.floatValue()), null, null, 6, null);
                                        telemetry = telemetry2;
                                        SendStatsRequest sendStatsRequest8 = new SendStatsRequest(str8, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState4, null, telemetry, null, null, null, strM31021g, list2, list10, str9, null, 277184, null);
                                        c2345kM31043s4 = c11602h2.m31043s();
                                        interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                        enumC2341g6 = EnumC2341g.DEBUG;
                                        if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                            c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                        }
                                        C28822o c28822o8 = c11602h2.m31044t().f168486d;
                                        c11621p0.f37522w = c11602h2;
                                        c11621p0.f37523x = f17;
                                        c11621p0.f37524y = r18;
                                        c11621p0.f37525z = arrayList;
                                        str = null;
                                        c11621p0.f37516E = null;
                                        c11621p0.f37517F = null;
                                        c11621p0.f37521J = i13;
                                        objM35408x = c28822o8.sendStats(sendStatsRequest8, c11621p0);
                                        if (objM35408x == enumC31071a) {
                                            return enumC31071a;
                                        }
                                        r19 = r18;
                                        obj4 = c11602h2;
                                        f18 = f17;
                                        r24 = r19;
                                        obj5 = obj4;
                                        r110 = f18;
                                        c26203f = new C26204g(objM35408x);
                                        r15 = r24;
                                        r10 = obj5;
                                        r14 = r110;
                                        c2345kM31043s = r10.m31043s();
                                        interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                        enumC2341g2 = EnumC2341g.DEBUG;
                                        if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                            InterfaceC2344j interfaceC2344jM7230a10 = c2345kM31043s.m7230a();
                                            String strM7231b10 = c2345kM31043s.m7231b();
                                            if (c26203f instanceof C26204g) {
                                                Object objM77814e10 = ((C26204g) c26203f).m77814e();
                                                if (r15 != 0) {
                                                    obj = (Float) r15.f92937w;
                                                } else {
                                                    obj = str;
                                                }
                                                if (r15 != 0) {
                                                    obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                                } else {
                                                    obj2 = str;
                                                }
                                                strM30461o = "Success. Response: " + objM77814e10 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                            } else {
                                                if (c26203f instanceof C26203f) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                            }
                                            interfaceC2344jM7230a10.log(enumC2341g2, strM7231b10, "sendStats: " + strM30461o, null);
                                        }
                                        return c23454a0;
                                    }
                                    return enumC31071a;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                f14 = f13;
                                r16 = c23465k;
                                obj3 = this;
                                c23454a0 = c23454a1;
                                r24 = r16;
                                obj5 = obj3;
                                r110 = f14;
                                str = null;
                                C2343i c2343i7 = C2343i.f9269a;
                                interfaceC2339eM7228b = C2343i.m7228b();
                                enumC2341g = EnumC2341g.ERROR;
                                if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                                    C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                                }
                                message = th.getMessage();
                                if (message == null) {
                                    message = "API call failed";
                                }
                                c26203f = new C26203f(new C26201d(message, th));
                                r15 = r24;
                                r10 = obj5;
                                r14 = r110;
                                c2345kM31043s = r10.m31043s();
                                interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                enumC2341g2 = EnumC2341g.DEBUG;
                                if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                    InterfaceC2344j interfaceC2344jM7230a11 = c2345kM31043s.m7230a();
                                    String strM7231b11 = c2345kM31043s.m7231b();
                                    if (c26203f instanceof C26204g) {
                                        Object objM77814e11 = ((C26204g) c26203f).m77814e();
                                        if (r15 != 0) {
                                            obj = (Float) r15.f92937w;
                                        } else {
                                            obj = str;
                                        }
                                        if (r15 != 0) {
                                            obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                        } else {
                                            obj2 = str;
                                        }
                                        strM30461o = "Success. Response: " + objM77814e11 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                    } else {
                                        if (c26203f instanceof C26203f) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                    }
                                    interfaceC2344jM7230a11.log(enumC2341g2, strM7231b11, "sendStats: " + strM30461o, null);
                                }
                                return c23454a0;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            i14 = 2;
                            i15 = 1;
                            z4 = false;
                        }
                        if (r24 != 0) {
                            boolM48917u = AbstractC17269i.m48917u(r24.isPowerSaveMode());
                        } else {
                            boolM48917u = null;
                        }
                        c2345kM31043s2 = m31043s();
                        interfaceC2339eM7232c2 = c2345kM31043s2.m7232c();
                        enumC2341g4 = EnumC2341g.DEBUG;
                        if (interfaceC2339eM7232c2.isLoggable(enumC2341g4, c2345kM31043s2.m7231b())) {
                            c2345kM31043s2.m7230a().log(enumC2341g4, c2345kM31043s2.m7231b(), "[sendCallStats] #powerSaveMode state: " + boolM48917u, null);
                        }
                        if (boolM48917u != null) {
                            zBooleanValue = boolM48917u.booleanValue();
                        } else {
                            zBooleanValue = z4;
                        }
                        z13 = zBooleanValue;
                        c12645n = (C12645n) this.f37421A.getValue();
                        if (c12645n != null) {
                            c11621p0.f37522w = this;
                            c11621p0.f37523x = c33460u0;
                            f15 = f13;
                            c11621p0.f37524y = f15;
                            c23465k2 = c23465k;
                            c11621p0.f37525z = c23465k2;
                            c11621p0.f37516E = androidThermalState;
                            c11621p0.f37518G = z13;
                            c11621p0.f37521J = i15;
                            objM35408x = c12645n.m35408x(c11621p0);
                            if (objM35408x != enumC31071a) {
                                z14 = z13;
                                r24 = c23465k2;
                                c33460u1 = c33460u0;
                                c11602h1 = this;
                                c16831a = (C16831a) objM35408x;
                                r24 = r24;
                                c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                                if (c12662v0 != null) {
                                    c11621p0.f37522w = c11602h1;
                                    c11621p0.f37523x = c33460u1;
                                    c11621p0.f37524y = f15;
                                    c11621p0.f37525z = r24;
                                    c11621p0.f37516E = c16831a;
                                    c11621p0.f37517F = androidThermalState;
                                    c11621p0.f37518G = z14;
                                    c11621p0.f37521J = i14;
                                    objM35428r = c12662v0.m35428r(c11621p0);
                                    if (objM35428r != enumC31071a) {
                                        C33460u0 c33460u7 = c33460u1;
                                        c16831a2 = c16831a;
                                        objM35408x = objM35428r;
                                        f17 = f15;
                                        c11602h2 = c11602h1;
                                        c33460u2 = c33460u7;
                                        r18 = r24;
                                        c16831a3 = (C16831a) objM35408x;
                                        r18 = r18;
                                        c11602h2 = c11602h2;
                                        f17 = f17;
                                    }
                                } else {
                                    f17 = f15;
                                    c11602h2 = c11602h1;
                                    c33460u2 = c33460u1;
                                    c16831a2 = c16831a;
                                    c16831a3 = null;
                                    r18 = r24;
                                }
                                boolean z19 = z14;
                                AndroidThermalState androidThermalState6 = androidThermalState;
                                C23372m c23372m9 = c11602h2.f37457s;
                                if (c16831a2 != null) {
                                    linkedHashMap = c16831a2.f64690b;
                                } else {
                                    linkedHashMap = null;
                                }
                                c23372m9.m67653b(linkedHashMap, "getstats");
                                C23372m c23372m10 = c11602h2.f37458t;
                                if (c16831a3 != null) {
                                    linkedHashMap2 = c16831a3.f64690b;
                                } else {
                                    linkedHashMap2 = null;
                                }
                                c23372m10.m67653b(linkedHashMap2, "getstats");
                                arrayList = new ArrayList();
                                Collection collectionValues5 = ((ConcurrentHashMap) c11602h2.f37451m.f21695x).values();
                                AbstractC22676k.m65749i(collectionValues5, "<get-values>(...)");
                                List listM74093D5 = AbstractC25265s.m74093D1(collectionValues5);
                                arrayList2 = new ArrayList();
                                it = listM74093D5.iterator();
                                while (it.hasNext()) {
                                    C23371l c23371lM67652a5 = ((C23372m) it.next()).m67652a();
                                    arrayList.add(c23371lM67652a5);
                                    List list11 = c23371lM67652a5.f92649a;
                                    Iterator it9 = it;
                                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list11, 10));
                                    it3 = list11.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(AbstractC35903f.m113995M((C23370k) it3.next()));
                                    }
                                    AbstractC25265s.m74141p0(arrayList2, arrayList3);
                                    it = it9;
                                }
                                strM31021g = m31021g(c11602h2, AbstractC25265s.m74097F1(arrayList2));
                                c2345kM31043s3 = c11602h2.m31043s();
                                interfaceC2339eM7232c3 = c2345kM31043s3.m7232c();
                                enumC2341g5 = EnumC2341g.DEBUG;
                                if (interfaceC2339eM7232c3.isLoggable(enumC2341g5, c2345kM31043s3.m7231b())) {
                                    c23454a0 = c23454a1;
                                    c2345kM31043s3.m7230a().log(enumC2341g5, c2345kM31043s3.m7231b(), "[sendCallStats] #sfu; #track; rtc_stats: " + strM31021g, null);
                                } else {
                                    c23454a0 = c23454a1;
                                }
                                String str10 = c11602h2.f37441c;
                                String str11 = c11602h2.f37440b.f139270E;
                                if (c33460u2 != null) {
                                    strM100712t = AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17063w);
                                } else {
                                    strM100712t = "";
                                }
                                if (c33460u2 != null) {
                                }
                                list = C25271y.f99162w;
                                if (c16831a2 != null) {
                                    list2 = c16831a2.f64691c;
                                } else {
                                    list2 = list;
                                }
                                if (c16831a3 != null) {
                                    list = c16831a3.f64691c;
                                }
                                List list12 = list;
                                AndroidState androidState5 = new AndroidState(androidThermalState6, z19, null, 4, null);
                                if (f17 != null) {
                                    telemetry2 = new Telemetry(new Float(f17.floatValue()), null, null, 6, null);
                                } else {
                                    if (r18 != 0) {
                                        telemetry2 = new Telemetry(null, new Reconnection(((Number) r18.f92937w).floatValue(), (WebsocketReconnectStrategy) r18.f92938x, null, 4, null), null, 5, null);
                                    } else {
                                        telemetry2 = null;
                                    }
                                    telemetry = telemetry2;
                                    SendStatsRequest sendStatsRequest9 = new SendStatsRequest(str10, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState5, null, telemetry, null, null, null, strM31021g, list2, list12, str11, null, 277184, null);
                                    c2345kM31043s4 = c11602h2.m31043s();
                                    interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                    enumC2341g6 = EnumC2341g.DEBUG;
                                    if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                        c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                    }
                                    C28822o c28822o9 = c11602h2.m31044t().f168486d;
                                    c11621p0.f37522w = c11602h2;
                                    c11621p0.f37523x = f17;
                                    c11621p0.f37524y = r18;
                                    c11621p0.f37525z = arrayList;
                                    str = null;
                                    c11621p0.f37516E = null;
                                    c11621p0.f37517F = null;
                                    c11621p0.f37521J = i13;
                                    objM35408x = c28822o9.sendStats(sendStatsRequest9, c11621p0);
                                    if (objM35408x == enumC31071a) {
                                        return enumC31071a;
                                    }
                                    r19 = r18;
                                    obj4 = c11602h2;
                                    f18 = f17;
                                    r24 = r19;
                                    obj5 = obj4;
                                    r110 = f18;
                                    c26203f = new C26204g(objM35408x);
                                    r15 = r24;
                                    r10 = obj5;
                                    r14 = r110;
                                }
                                telemetry = telemetry2;
                                SendStatsRequest sendStatsRequest10 = new SendStatsRequest(str10, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState5, null, telemetry, null, null, null, strM31021g, list2, list12, str11, null, 277184, null);
                                c2345kM31043s4 = c11602h2.m31043s();
                                interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                enumC2341g6 = EnumC2341g.DEBUG;
                                if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                    c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                }
                                C28822o c28822o10 = c11602h2.m31044t().f168486d;
                                c11621p0.f37522w = c11602h2;
                                c11621p0.f37523x = f17;
                                c11621p0.f37524y = r18;
                                c11621p0.f37525z = arrayList;
                                str = null;
                                c11621p0.f37516E = null;
                                c11621p0.f37517F = null;
                                c11621p0.f37521J = i13;
                                objM35408x = c28822o10.sendStats(sendStatsRequest10, c11621p0);
                                if (objM35408x == enumC31071a) {
                                    return enumC31071a;
                                }
                                r19 = r18;
                                obj4 = c11602h2;
                                f18 = f17;
                                r24 = r19;
                                obj5 = obj4;
                                r110 = f18;
                                c26203f = new C26204g(objM35408x);
                                r15 = r24;
                                r10 = obj5;
                                r14 = r110;
                            }
                        } else {
                            f15 = f13;
                            z14 = z13;
                            r24 = c23465k;
                            c33460u1 = c33460u0;
                            c11602h1 = this;
                            c16831a = null;
                            c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                            if (c12662v0 != null) {
                                c11621p0.f37522w = c11602h1;
                                c11621p0.f37523x = c33460u1;
                                c11621p0.f37524y = f15;
                                c11621p0.f37525z = r24;
                                c11621p0.f37516E = c16831a;
                                c11621p0.f37517F = androidThermalState;
                                c11621p0.f37518G = z14;
                                c11621p0.f37521J = i14;
                                objM35428r = c12662v0.m35428r(c11621p0);
                                if (objM35428r != enumC31071a) {
                                    C33460u0 c33460u8 = c33460u1;
                                    c16831a2 = c16831a;
                                    objM35408x = objM35428r;
                                    f17 = f15;
                                    c11602h2 = c11602h1;
                                    c33460u2 = c33460u8;
                                    r18 = r24;
                                    c16831a3 = (C16831a) objM35408x;
                                    r18 = r18;
                                    c11602h2 = c11602h2;
                                    f17 = f17;
                                }
                            } else {
                                f17 = f15;
                                c11602h2 = c11602h1;
                                c33460u2 = c33460u1;
                                c16831a2 = c16831a;
                                c16831a3 = null;
                                r18 = r24;
                            }
                            boolean z110 = z14;
                            AndroidThermalState androidThermalState7 = androidThermalState;
                            C23372m c23372m11 = c11602h2.f37457s;
                            if (c16831a2 != null) {
                                linkedHashMap = c16831a2.f64690b;
                            } else {
                                linkedHashMap = null;
                            }
                            c23372m11.m67653b(linkedHashMap, "getstats");
                            C23372m c23372m12 = c11602h2.f37458t;
                            if (c16831a3 != null) {
                                linkedHashMap2 = c16831a3.f64690b;
                            } else {
                                linkedHashMap2 = null;
                            }
                            c23372m12.m67653b(linkedHashMap2, "getstats");
                            arrayList = new ArrayList();
                            Collection collectionValues6 = ((ConcurrentHashMap) c11602h2.f37451m.f21695x).values();
                            AbstractC22676k.m65749i(collectionValues6, "<get-values>(...)");
                            List listM74093D6 = AbstractC25265s.m74093D1(collectionValues6);
                            arrayList2 = new ArrayList();
                            it = listM74093D6.iterator();
                            while (it.hasNext()) {
                                C23371l c23371lM67652a6 = ((C23372m) it.next()).m67652a();
                                arrayList.add(c23371lM67652a6);
                                List list13 = c23371lM67652a6.f92649a;
                                Iterator it10 = it;
                                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list13, 10));
                                it3 = list13.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(AbstractC35903f.m113995M((C23370k) it3.next()));
                                }
                                AbstractC25265s.m74141p0(arrayList2, arrayList3);
                                it = it10;
                            }
                            strM31021g = m31021g(c11602h2, AbstractC25265s.m74097F1(arrayList2));
                            c2345kM31043s3 = c11602h2.m31043s();
                            interfaceC2339eM7232c3 = c2345kM31043s3.m7232c();
                            enumC2341g5 = EnumC2341g.DEBUG;
                            if (interfaceC2339eM7232c3.isLoggable(enumC2341g5, c2345kM31043s3.m7231b())) {
                                c23454a0 = c23454a1;
                                c2345kM31043s3.m7230a().log(enumC2341g5, c2345kM31043s3.m7231b(), "[sendCallStats] #sfu; #track; rtc_stats: " + strM31021g, null);
                            } else {
                                c23454a0 = c23454a1;
                            }
                            String str12 = c11602h2.f37441c;
                            String str13 = c11602h2.f37440b.f139270E;
                            if (c33460u2 != null) {
                                strM100712t = AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17063w);
                            } else {
                                strM100712t = "";
                            }
                            if (c33460u2 != null) {
                            }
                            list = C25271y.f99162w;
                            if (c16831a2 != null) {
                                list2 = c16831a2.f64691c;
                            } else {
                                list2 = list;
                            }
                            if (c16831a3 != null) {
                                list = c16831a3.f64691c;
                            }
                            List list14 = list;
                            AndroidState androidState6 = new AndroidState(androidThermalState7, z110, null, 4, null);
                            if (f17 != null) {
                                telemetry2 = new Telemetry(new Float(f17.floatValue()), null, null, 6, null);
                            } else {
                                if (r18 != 0) {
                                    telemetry2 = new Telemetry(null, new Reconnection(((Number) r18.f92937w).floatValue(), (WebsocketReconnectStrategy) r18.f92938x, null, 4, null), null, 5, null);
                                } else {
                                    telemetry2 = null;
                                }
                                telemetry = telemetry2;
                                SendStatsRequest sendStatsRequest11 = new SendStatsRequest(str12, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState6, null, telemetry, null, null, null, strM31021g, list2, list14, str13, null, 277184, null);
                                c2345kM31043s4 = c11602h2.m31043s();
                                interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                enumC2341g6 = EnumC2341g.DEBUG;
                                if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                    c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                }
                                C28822o c28822o11 = c11602h2.m31044t().f168486d;
                                c11621p0.f37522w = c11602h2;
                                c11621p0.f37523x = f17;
                                c11621p0.f37524y = r18;
                                c11621p0.f37525z = arrayList;
                                str = null;
                                c11621p0.f37516E = null;
                                c11621p0.f37517F = null;
                                c11621p0.f37521J = i13;
                                objM35408x = c28822o11.sendStats(sendStatsRequest11, c11621p0);
                                if (objM35408x == enumC31071a) {
                                    return enumC31071a;
                                }
                                r19 = r18;
                                obj4 = c11602h2;
                                f18 = f17;
                                r24 = r19;
                                obj5 = obj4;
                                r110 = f18;
                                c26203f = new C26204g(objM35408x);
                                r15 = r24;
                                r10 = obj5;
                                r14 = r110;
                            }
                            telemetry = telemetry2;
                            SendStatsRequest sendStatsRequest12 = new SendStatsRequest(str12, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState6, null, telemetry, null, null, null, strM31021g, list2, list14, str13, null, 277184, null);
                            c2345kM31043s4 = c11602h2.m31043s();
                            interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                            enumC2341g6 = EnumC2341g.DEBUG;
                            if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                            }
                            C28822o c28822o12 = c11602h2.m31044t().f168486d;
                            c11621p0.f37522w = c11602h2;
                            c11621p0.f37523x = f17;
                            c11621p0.f37524y = r18;
                            c11621p0.f37525z = arrayList;
                            str = null;
                            c11621p0.f37516E = null;
                            c11621p0.f37517F = null;
                            c11621p0.f37521J = i13;
                            objM35408x = c28822o12.sendStats(sendStatsRequest12, c11621p0);
                            if (objM35408x == enumC31071a) {
                                return enumC31071a;
                            }
                            r19 = r18;
                            obj4 = c11602h2;
                            f18 = f17;
                            r24 = r19;
                            obj5 = obj4;
                            r110 = f18;
                            c26203f = new C26204g(objM35408x);
                            r15 = r24;
                            r10 = obj5;
                            r14 = r110;
                        }
                        return enumC31071a;
                    } catch (Throwable th7) {
                        th = th7;
                        c23454a0 = c23454a1;
                        str = null;
                        r110 = f13;
                        r24 = c23465k;
                        obj5 = this;
                    }
                } else if (i17 == 1) {
                    i13 = 3;
                    boolean z24 = c11621p0.f37518G;
                    AndroidThermalState androidThermalState8 = (AndroidThermalState) c11621p0.f37516E;
                    C23465k c23465k3 = (C23465k) c11621p0.f37525z;
                    Float f19 = (Float) c11621p0.f37524y;
                    c33460u1 = (C33460u0) c11621p0.f37523x;
                    c11602h1 = c11621p0.f37522w;
                    try {
                        AbstractC34132o.m107864I(objM35408x);
                        z14 = z24;
                        r24 = c23465k3;
                        f15 = f19;
                        androidThermalState = androidThermalState8;
                        i14 = 2;
                        try {
                            c16831a = (C16831a) objM35408x;
                            r24 = r24;
                            try {
                                c12662v0 = (C12662v0) c11602h1.f37464z.getValue();
                                if (c12662v0 != null) {
                                    c11621p0.f37522w = c11602h1;
                                    c11621p0.f37523x = c33460u1;
                                    c11621p0.f37524y = f15;
                                    c11621p0.f37525z = r24;
                                    c11621p0.f37516E = c16831a;
                                    c11621p0.f37517F = androidThermalState;
                                    c11621p0.f37518G = z14;
                                    c11621p0.f37521J = i14;
                                    objM35428r = c12662v0.m35428r(c11621p0);
                                    if (objM35428r != enumC31071a) {
                                        C33460u0 c33460u9 = c33460u1;
                                        c16831a2 = c16831a;
                                        objM35408x = objM35428r;
                                        f17 = f15;
                                        c11602h2 = c11602h1;
                                        c33460u2 = c33460u9;
                                        r18 = r24;
                                        c16831a3 = (C16831a) objM35408x;
                                        r18 = r18;
                                        c11602h2 = c11602h2;
                                        f17 = f17;
                                    }
                                    return enumC31071a;
                                }
                                f17 = f15;
                                c11602h2 = c11602h1;
                                c33460u2 = c33460u1;
                                c16831a2 = c16831a;
                                c16831a3 = null;
                                r18 = r24;
                                boolean z111 = z14;
                                AndroidThermalState androidThermalState9 = androidThermalState;
                                C23372m c23372m13 = c11602h2.f37457s;
                                if (c16831a2 != null) {
                                    linkedHashMap = c16831a2.f64690b;
                                } else {
                                    linkedHashMap = null;
                                }
                                c23372m13.m67653b(linkedHashMap, "getstats");
                                C23372m c23372m14 = c11602h2.f37458t;
                                if (c16831a3 != null) {
                                    linkedHashMap2 = c16831a3.f64690b;
                                } else {
                                    linkedHashMap2 = null;
                                }
                                c23372m14.m67653b(linkedHashMap2, "getstats");
                                arrayList = new ArrayList();
                                Collection collectionValues7 = ((ConcurrentHashMap) c11602h2.f37451m.f21695x).values();
                                AbstractC22676k.m65749i(collectionValues7, "<get-values>(...)");
                                List listM74093D7 = AbstractC25265s.m74093D1(collectionValues7);
                                arrayList2 = new ArrayList();
                                it = listM74093D7.iterator();
                                while (it.hasNext()) {
                                    C23371l c23371lM67652a7 = ((C23372m) it.next()).m67652a();
                                    arrayList.add(c23371lM67652a7);
                                    List list15 = c23371lM67652a7.f92649a;
                                    Iterator it11 = it;
                                    arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list15, 10));
                                    it3 = list15.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(AbstractC35903f.m113995M((C23370k) it3.next()));
                                    }
                                    AbstractC25265s.m74141p0(arrayList2, arrayList3);
                                    it = it11;
                                }
                                strM31021g = m31021g(c11602h2, AbstractC25265s.m74097F1(arrayList2));
                                c2345kM31043s3 = c11602h2.m31043s();
                                interfaceC2339eM7232c3 = c2345kM31043s3.m7232c();
                                enumC2341g5 = EnumC2341g.DEBUG;
                                if (interfaceC2339eM7232c3.isLoggable(enumC2341g5, c2345kM31043s3.m7231b())) {
                                    c23454a0 = c23454a1;
                                    c2345kM31043s3.m7230a().log(enumC2341g5, c2345kM31043s3.m7231b(), "[sendCallStats] #sfu; #track; rtc_stats: " + strM31021g, null);
                                } else {
                                    c23454a0 = c23454a1;
                                }
                                String str14 = c11602h2.f37441c;
                                String str15 = c11602h2.f37440b.f139270E;
                                if (c33460u2 != null) {
                                    strM100712t = AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17063w);
                                } else {
                                    strM100712t = "";
                                }
                                if (c33460u2 != null) {
                                }
                                list = C25271y.f99162w;
                                if (c16831a2 != null) {
                                    list2 = c16831a2.f64691c;
                                } else {
                                    list2 = list;
                                }
                                if (c16831a3 != null) {
                                    list = c16831a3.f64691c;
                                }
                                List list16 = list;
                                AndroidState androidState7 = new AndroidState(androidThermalState9, z111, null, 4, null);
                                if (f17 != null) {
                                    telemetry2 = new Telemetry(new Float(f17.floatValue()), null, null, 6, null);
                                } else {
                                    if (r18 != 0) {
                                        telemetry2 = new Telemetry(null, new Reconnection(((Number) r18.f92937w).floatValue(), (WebsocketReconnectStrategy) r18.f92938x, null, 4, null), null, 5, null);
                                    } else {
                                        telemetry2 = null;
                                    }
                                    telemetry = telemetry2;
                                    SendStatsRequest sendStatsRequest13 = new SendStatsRequest(str14, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState7, null, telemetry, null, null, null, strM31021g, list2, list16, str15, null, 277184, null);
                                    c2345kM31043s4 = c11602h2.m31043s();
                                    interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                    enumC2341g6 = EnumC2341g.DEBUG;
                                    if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                        c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                    }
                                    C28822o c28822o13 = c11602h2.m31044t().f168486d;
                                    c11621p0.f37522w = c11602h2;
                                    c11621p0.f37523x = f17;
                                    c11621p0.f37524y = r18;
                                    c11621p0.f37525z = arrayList;
                                    str = null;
                                    c11621p0.f37516E = null;
                                    c11621p0.f37517F = null;
                                    c11621p0.f37521J = i13;
                                    objM35408x = c28822o13.sendStats(sendStatsRequest13, c11621p0);
                                    if (objM35408x == enumC31071a) {
                                        return enumC31071a;
                                    }
                                    r19 = r18;
                                    obj4 = c11602h2;
                                    f18 = f17;
                                    r24 = r19;
                                    obj5 = obj4;
                                    r110 = f18;
                                    c26203f = new C26204g(objM35408x);
                                    r15 = r24;
                                    r10 = obj5;
                                    r14 = r110;
                                }
                                telemetry = telemetry2;
                                SendStatsRequest sendStatsRequest14 = new SendStatsRequest(str14, strM100712t, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState7, null, telemetry, null, null, null, strM31021g, list2, list16, str15, null, 277184, null);
                                c2345kM31043s4 = c11602h2.m31043s();
                                interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                enumC2341g6 = EnumC2341g.DEBUG;
                                if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                    c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                }
                                C28822o c28822o14 = c11602h2.m31044t().f168486d;
                                c11621p0.f37522w = c11602h2;
                                c11621p0.f37523x = f17;
                                c11621p0.f37524y = r18;
                                c11621p0.f37525z = arrayList;
                                str = null;
                                c11621p0.f37516E = null;
                                c11621p0.f37517F = null;
                                c11621p0.f37521J = i13;
                                objM35408x = c28822o14.sendStats(sendStatsRequest14, c11621p0);
                                if (objM35408x == enumC31071a) {
                                    return enumC31071a;
                                }
                                r19 = r18;
                                obj4 = c11602h2;
                                f18 = f17;
                                r24 = r19;
                                obj5 = obj4;
                                r110 = f18;
                                c26203f = new C26204g(objM35408x);
                                r15 = r24;
                                r10 = obj5;
                                r14 = r110;
                            } catch (Throwable th8) {
                                th = th8;
                                c23454a0 = c23454a1;
                                str = null;
                                r110 = f15;
                                obj5 = c11602h1;
                                C2343i c2343i8 = C2343i.f9269a;
                                interfaceC2339eM7228b = C2343i.m7228b();
                                enumC2341g = EnumC2341g.ERROR;
                                if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                                    C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                                }
                                message = th.getMessage();
                                if (message == null) {
                                    message = "API call failed";
                                }
                                c26203f = new C26203f(new C26201d(message, th));
                                r15 = r24;
                                r10 = obj5;
                                r14 = r110;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            f16 = f15;
                            r17 = r24;
                            c23454a0 = c23454a1;
                            obj5 = c11602h1;
                            r24 = r17;
                            r110 = f16;
                            str = null;
                            C2343i c2343i9 = C2343i.f9269a;
                            interfaceC2339eM7228b = C2343i.m7228b();
                            enumC2341g = EnumC2341g.ERROR;
                            if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                                C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                            }
                            message = th.getMessage();
                            if (message == null) {
                                message = "API call failed";
                            }
                            c26203f = new C26203f(new C26201d(message, th));
                            r15 = r24;
                            r10 = obj5;
                            r14 = r110;
                            c2345kM31043s = r10.m31043s();
                            interfaceC2339eM7232c = c2345kM31043s.m7232c();
                            enumC2341g2 = EnumC2341g.DEBUG;
                            if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                InterfaceC2344j interfaceC2344jM7230a12 = c2345kM31043s.m7230a();
                                String strM7231b12 = c2345kM31043s.m7231b();
                                if (c26203f instanceof C26204g) {
                                    Object objM77814e12 = ((C26204g) c26203f).m77814e();
                                    if (r15 != 0) {
                                        obj = (Float) r15.f92937w;
                                    } else {
                                        obj = str;
                                    }
                                    if (r15 != 0) {
                                        obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                    } else {
                                        obj2 = str;
                                    }
                                    strM30461o = "Success. Response: " + objM77814e12 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                } else {
                                    if (c26203f instanceof C26203f) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                }
                                interfaceC2344jM7230a12.log(enumC2341g2, strM7231b12, "sendStats: " + strM30461o, null);
                            }
                            return c23454a0;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        r17 = c23465k3;
                        f16 = f19;
                        c23454a0 = c23454a1;
                        obj5 = c11602h1;
                        r24 = r17;
                        r110 = f16;
                        str = null;
                        C2343i c2343i10 = C2343i.f9269a;
                        interfaceC2339eM7228b = C2343i.m7228b();
                        enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                            C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                        }
                        message = th.getMessage();
                        if (message == null) {
                            message = "API call failed";
                        }
                        c26203f = new C26203f(new C26201d(message, th));
                        r15 = r24;
                        r10 = obj5;
                        r14 = r110;
                        c2345kM31043s = r10.m31043s();
                        interfaceC2339eM7232c = c2345kM31043s.m7232c();
                        enumC2341g2 = EnumC2341g.DEBUG;
                        if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                            InterfaceC2344j interfaceC2344jM7230a13 = c2345kM31043s.m7230a();
                            String strM7231b13 = c2345kM31043s.m7231b();
                            if (c26203f instanceof C26204g) {
                                Object objM77814e13 = ((C26204g) c26203f).m77814e();
                                if (r15 != 0) {
                                    obj = (Float) r15.f92937w;
                                } else {
                                    obj = str;
                                }
                                if (r15 != 0) {
                                    obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                } else {
                                    obj2 = str;
                                }
                                strM30461o = "Success. Response: " + objM77814e13 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                            } else {
                                if (c26203f instanceof C26203f) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                            }
                            interfaceC2344jM7230a13.log(enumC2341g2, strM7231b13, "sendStats: " + strM30461o, null);
                        }
                        return c23454a0;
                    }
                } else if (i17 == 2) {
                    boolean z25 = c11621p0.f37518G;
                    AndroidThermalState androidThermalState10 = c11621p0.f37517F;
                    C16831a c16831a4 = (C16831a) c11621p0.f37516E;
                    C23465k c23465k4 = (C23465k) c11621p0.f37525z;
                    Float f24 = (Float) c11621p0.f37524y;
                    c33460u2 = (C33460u0) c11621p0.f37523x;
                    i13 = 3;
                    C11602h1 c11602h3 = c11621p0.f37522w;
                    try {
                        AbstractC34132o.m107864I(objM35408x);
                        z14 = z25;
                        r18 = c23465k4;
                        androidThermalState = androidThermalState10;
                        c16831a2 = c16831a4;
                        c11602h2 = c11602h3;
                        f17 = f24;
                        try {
                            c16831a3 = (C16831a) objM35408x;
                            r18 = r18;
                            c11602h2 = c11602h2;
                            f17 = f17;
                            boolean z112 = z14;
                            AndroidThermalState androidThermalState11 = androidThermalState;
                            C23372m c23372m15 = c11602h2.f37457s;
                            if (c16831a2 != null) {
                                linkedHashMap = c16831a2.f64690b;
                            } else {
                                linkedHashMap = null;
                            }
                            c23372m15.m67653b(linkedHashMap, "getstats");
                            C23372m c23372m16 = c11602h2.f37458t;
                            if (c16831a3 != null) {
                                linkedHashMap2 = c16831a3.f64690b;
                            } else {
                                linkedHashMap2 = null;
                            }
                            c23372m16.m67653b(linkedHashMap2, "getstats");
                            arrayList = new ArrayList();
                            Collection collectionValues8 = ((ConcurrentHashMap) c11602h2.f37451m.f21695x).values();
                            AbstractC22676k.m65749i(collectionValues8, "<get-values>(...)");
                            List listM74093D8 = AbstractC25265s.m74093D1(collectionValues8);
                            arrayList2 = new ArrayList();
                            it = listM74093D8.iterator();
                            while (it.hasNext()) {
                                C23371l c23371lM67652a8 = ((C23372m) it.next()).m67652a();
                                arrayList.add(c23371lM67652a8);
                                List list17 = c23371lM67652a8.f92649a;
                                Iterator it12 = it;
                                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list17, 10));
                                it3 = list17.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(AbstractC35903f.m113995M((C23370k) it3.next()));
                                }
                                AbstractC25265s.m74141p0(arrayList2, arrayList3);
                                it = it12;
                            }
                            strM31021g = m31021g(c11602h2, AbstractC25265s.m74097F1(arrayList2));
                            c2345kM31043s3 = c11602h2.m31043s();
                            interfaceC2339eM7232c3 = c2345kM31043s3.m7232c();
                            enumC2341g5 = EnumC2341g.DEBUG;
                            if (interfaceC2339eM7232c3.isLoggable(enumC2341g5, c2345kM31043s3.m7231b())) {
                                c23454a0 = c23454a1;
                                try {
                                    c2345kM31043s3.m7230a().log(enumC2341g5, c2345kM31043s3.m7231b(), "[sendCallStats] #sfu; #track; rtc_stats: " + strM31021g, null);
                                } catch (Throwable th11) {
                                    th = th11;
                                    r24 = r18;
                                    obj5 = c11602h2;
                                    r110 = f17;
                                    str = null;
                                    C2343i c2343i11 = C2343i.f9269a;
                                    interfaceC2339eM7228b = C2343i.m7228b();
                                    enumC2341g = EnumC2341g.ERROR;
                                    if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                                        C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                                    }
                                    message = th.getMessage();
                                    if (message == null) {
                                        message = "API call failed";
                                    }
                                    c26203f = new C26203f(new C26201d(message, th));
                                    r15 = r24;
                                    r10 = obj5;
                                    r14 = r110;
                                }
                            } else {
                                c23454a0 = c23454a1;
                            }
                            String str16 = c11602h2.f37441c;
                            String str17 = c11602h2.f37440b.f139270E;
                            if (c33460u2 != null) {
                                strM100712t = AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17063w);
                            } else {
                                strM100712t = "";
                            }
                            String strM100712t2 = c33460u2 != null ? AbstractC32350a.m100712t(c33460u2, EnumC4206v.f17064x) : "";
                            list = C25271y.f99162w;
                            if (c16831a2 != null) {
                                list2 = c16831a2.f64691c;
                            } else {
                                list2 = list;
                            }
                            if (c16831a3 != null) {
                                list = c16831a3.f64691c;
                            }
                            List list18 = list;
                            AndroidState androidState8 = new AndroidState(androidThermalState11, z112, null, 4, null);
                            try {
                                try {
                                    try {
                                        if (f17 != null) {
                                            telemetry2 = new Telemetry(new Float(f17.floatValue()), null, null, 6, null);
                                        } else {
                                            if (r18 != 0) {
                                                telemetry2 = new Telemetry(null, new Reconnection(((Number) r18.f92937w).floatValue(), (WebsocketReconnectStrategy) r18.f92938x, null, 4, null), null, 5, null);
                                            } else {
                                                telemetry2 = null;
                                            }
                                            telemetry = telemetry2;
                                            SendStatsRequest sendStatsRequest15 = new SendStatsRequest(str16, strM100712t2, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState8, null, telemetry, null, null, null, strM31021g, list2, list18, str17, null, 277184, null);
                                            c2345kM31043s4 = c11602h2.m31043s();
                                            interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                                            enumC2341g6 = EnumC2341g.DEBUG;
                                            if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                                c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                                            }
                                            C28822o c28822o15 = c11602h2.m31044t().f168486d;
                                            c11621p0.f37522w = c11602h2;
                                            c11621p0.f37523x = f17;
                                            c11621p0.f37524y = r18;
                                            c11621p0.f37525z = arrayList;
                                            str = null;
                                            c11621p0.f37516E = null;
                                            c11621p0.f37517F = null;
                                            c11621p0.f37521J = i13;
                                            objM35408x = c28822o15.sendStats(sendStatsRequest15, c11621p0);
                                            if (objM35408x == enumC31071a) {
                                                return enumC31071a;
                                            }
                                            r19 = r18;
                                            obj4 = c11602h2;
                                            f18 = f17;
                                            r24 = r19;
                                            obj5 = obj4;
                                            r110 = f18;
                                            c26203f = new C26204g(objM35408x);
                                            r15 = r24;
                                            r10 = obj5;
                                            r14 = r110;
                                        }
                                        c11621p0.f37516E = null;
                                        c11621p0.f37517F = null;
                                        c11621p0.f37521J = i13;
                                        objM35408x = c28822o15.sendStats(sendStatsRequest15, c11621p0);
                                        if (objM35408x == enumC31071a) {
                                            return enumC31071a;
                                        }
                                        r19 = r18;
                                        obj4 = c11602h2;
                                        f18 = f17;
                                        r24 = r19;
                                        obj5 = obj4;
                                        r110 = f18;
                                        c26203f = new C26204g(objM35408x);
                                        r15 = r24;
                                        r10 = obj5;
                                        r14 = r110;
                                    } catch (Exception e17) {
                                        e = e17;
                                        c11602h2.f37452n.m67653b(String.valueOf(e.getMessage()), "send-stats-failed");
                                        it4 = ((Iterable) arrayList).iterator();
                                        while (it4.hasNext()) {
                                            ((C23371l) it4.next()).f92650b.invoke();
                                        }
                                        objM35408x = c23454a0;
                                        r24 = r18;
                                        obj5 = c11602h2;
                                        r110 = f17;
                                    }
                                    C28822o c28822o16 = c11602h2.m31044t().f168486d;
                                    c11621p0.f37522w = c11602h2;
                                    c11621p0.f37523x = f17;
                                    c11621p0.f37524y = r18;
                                    c11621p0.f37525z = arrayList;
                                    str = null;
                                } catch (Exception e18) {
                                    e = e18;
                                    str = null;
                                    c11602h2.f37452n.m67653b(String.valueOf(e.getMessage()), "send-stats-failed");
                                    it4 = ((Iterable) arrayList).iterator();
                                    while (it4.hasNext()) {
                                        ((C23371l) it4.next()).f92650b.invoke();
                                    }
                                    objM35408x = c23454a0;
                                    r24 = r18;
                                    obj5 = c11602h2;
                                    r110 = f17;
                                    c26203f = new C26204g(objM35408x);
                                    r15 = r24;
                                    r10 = obj5;
                                    r14 = r110;
                                    c2345kM31043s = r10.m31043s();
                                    interfaceC2339eM7232c = c2345kM31043s.m7232c();
                                    enumC2341g2 = EnumC2341g.DEBUG;
                                    if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                        InterfaceC2344j interfaceC2344jM7230a14 = c2345kM31043s.m7230a();
                                        String strM7231b14 = c2345kM31043s.m7231b();
                                        if (c26203f instanceof C26204g) {
                                            Object objM77814e14 = ((C26204g) c26203f).m77814e();
                                            if (r15 != 0) {
                                                obj = (Float) r15.f92937w;
                                            } else {
                                                obj = str;
                                            }
                                            if (r15 != 0) {
                                                obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                            } else {
                                                obj2 = str;
                                            }
                                            strM30461o = "Success. Response: " + objM77814e14 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                        } else {
                                            if (c26203f instanceof C26203f) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                        }
                                        interfaceC2344jM7230a14.log(enumC2341g2, strM7231b14, "sendStats: " + strM30461o, null);
                                    }
                                    return c23454a0;
                                }
                                telemetry = telemetry2;
                            } catch (Exception e19) {
                                C2343i c2343i12 = C2343i.f9269a;
                                InterfaceC2339e interfaceC2339eM7228b4 = C2343i.m7228b();
                                EnumC2341g enumC2341g9 = EnumC2341g.ERROR;
                                if (interfaceC2339eM7228b4.isLoggable(enumC2341g9, "SafeCall")) {
                                    C2343i.m7227a().log(enumC2341g9, "SafeCall", "Exception occurred: " + e19.getMessage(), e19);
                                }
                                telemetry = null;
                            }
                            SendStatsRequest sendStatsRequest16 = new SendStatsRequest(str16, strM100712t2, strM100712t, "1.3.6", "stream-android", "1.28.0", null, null, androidState8, null, telemetry, null, null, null, strM31021g, list2, list18, str17, null, 277184, null);
                            c2345kM31043s4 = c11602h2.m31043s();
                            interfaceC2339eM7232c4 = c2345kM31043s4.m7232c();
                            enumC2341g6 = EnumC2341g.DEBUG;
                            if (interfaceC2339eM7232c4.isLoggable(enumC2341g6, c2345kM31043s4.m7231b())) {
                                c2345kM31043s4.m7230a().log(enumC2341g6, c2345kM31043s4.m7231b(), "[sendCallStats] #sfu; #track; request: " + strM31021g, null);
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            r16 = r18;
                            obj3 = c11602h2;
                            f14 = f17;
                            c23454a0 = c23454a1;
                            r24 = r16;
                            obj5 = obj3;
                            r110 = f14;
                            str = null;
                            C2343i c2343i13 = C2343i.f9269a;
                            interfaceC2339eM7228b = C2343i.m7228b();
                            enumC2341g = EnumC2341g.ERROR;
                            if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                                C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                            }
                            message = th.getMessage();
                            if (message == null) {
                                message = "API call failed";
                            }
                            c26203f = new C26203f(new C26201d(message, th));
                            r15 = r24;
                            r10 = obj5;
                            r14 = r110;
                            c2345kM31043s = r10.m31043s();
                            interfaceC2339eM7232c = c2345kM31043s.m7232c();
                            enumC2341g2 = EnumC2341g.DEBUG;
                            if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                                InterfaceC2344j interfaceC2344jM7230a15 = c2345kM31043s.m7230a();
                                String strM7231b15 = c2345kM31043s.m7231b();
                                if (c26203f instanceof C26204g) {
                                    Object objM77814e15 = ((C26204g) c26203f).m77814e();
                                    if (r15 != 0) {
                                        obj = (Float) r15.f92937w;
                                    } else {
                                        obj = str;
                                    }
                                    if (r15 != 0) {
                                        obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                    } else {
                                        obj2 = str;
                                    }
                                    strM30461o = "Success. Response: " + objM77814e15 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                                } else {
                                    if (c26203f instanceof C26203f) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                                }
                                interfaceC2344jM7230a15.log(enumC2341g2, strM7231b15, "sendStats: " + strM30461o, null);
                            }
                            return c23454a0;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        r24 = c23465k4;
                        c23454a0 = c23454a1;
                        obj5 = c11602h3;
                        r110 = f24;
                        str = null;
                        C2343i c2343i14 = C2343i.f9269a;
                        interfaceC2339eM7228b = C2343i.m7228b();
                        enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                            C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                        }
                        message = th.getMessage();
                        if (message == null) {
                            message = "API call failed";
                        }
                        c26203f = new C26203f(new C26201d(message, th));
                        r15 = r24;
                        r10 = obj5;
                        r14 = r110;
                        c2345kM31043s = r10.m31043s();
                        interfaceC2339eM7232c = c2345kM31043s.m7232c();
                        enumC2341g2 = EnumC2341g.DEBUG;
                        if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                            InterfaceC2344j interfaceC2344jM7230a16 = c2345kM31043s.m7230a();
                            String strM7231b16 = c2345kM31043s.m7231b();
                            if (c26203f instanceof C26204g) {
                                Object objM77814e16 = ((C26204g) c26203f).m77814e();
                                if (r15 != 0) {
                                    obj = (Float) r15.f92937w;
                                } else {
                                    obj = str;
                                }
                                if (r15 != 0) {
                                    obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                } else {
                                    obj2 = str;
                                }
                                strM30461o = "Success. Response: " + objM77814e16 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                            } else {
                                if (c26203f instanceof C26203f) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                            }
                            interfaceC2344jM7230a16.log(enumC2341g2, strM7231b16, "sendStats: " + strM30461o, null);
                        }
                        return c23454a0;
                    }
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list19 = (List) c11621p0.f37525z;
                    C23465k c23465k5 = (C23465k) c11621p0.f37524y;
                    Float f25 = (Float) c11621p0.f37523x;
                    c11602h2 = c11621p0.f37522w;
                    try {
                        AbstractC34132o.m107864I(objM35408x);
                        f18 = f25;
                        c23454a0 = c23454a1;
                        str = null;
                        r19 = c23465k5;
                        obj4 = c11602h2;
                        r24 = r19;
                        obj5 = obj4;
                        r110 = f18;
                    } catch (Exception e22) {
                        e = e22;
                        arrayList = list19;
                        r18 = c23465k5;
                        f17 = f25;
                        c23454a0 = c23454a1;
                        str = null;
                        c11602h2.f37452n.m67653b(String.valueOf(e.getMessage()), "send-stats-failed");
                        it4 = ((Iterable) arrayList).iterator();
                        while (it4.hasNext()) {
                            ((C23371l) it4.next()).f92650b.invoke();
                        }
                        objM35408x = c23454a0;
                        r24 = r18;
                        obj5 = c11602h2;
                        r110 = f17;
                    } catch (Throwable th14) {
                        th = th14;
                        r16 = c23465k5;
                        f14 = f25;
                        obj3 = c11602h2;
                        c23454a0 = c23454a1;
                        r24 = r16;
                        obj5 = obj3;
                        r110 = f14;
                        str = null;
                        C2343i c2343i15 = C2343i.f9269a;
                        interfaceC2339eM7228b = C2343i.m7228b();
                        enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339eM7228b.isLoggable(enumC2341g, "SafeApiCall")) {
                            C2343i.m7227a().log(enumC2341g, "SafeApiCall", AbstractC11266d.m30461o("API call failed: ", th.getMessage()), th);
                        }
                        message = th.getMessage();
                        if (message == null) {
                            message = "API call failed";
                        }
                        c26203f = new C26203f(new C26201d(message, th));
                        r15 = r24;
                        r10 = obj5;
                        r14 = r110;
                        c2345kM31043s = r10.m31043s();
                        interfaceC2339eM7232c = c2345kM31043s.m7232c();
                        enumC2341g2 = EnumC2341g.DEBUG;
                        if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                            InterfaceC2344j interfaceC2344jM7230a17 = c2345kM31043s.m7230a();
                            String strM7231b17 = c2345kM31043s.m7231b();
                            if (c26203f instanceof C26204g) {
                                Object objM77814e17 = ((C26204g) c26203f).m77814e();
                                if (r15 != 0) {
                                    obj = (Float) r15.f92937w;
                                } else {
                                    obj = str;
                                }
                                if (r15 != 0) {
                                    obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                                } else {
                                    obj2 = str;
                                }
                                strM30461o = "Success. Response: " + objM77814e17 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                            } else {
                                if (c26203f instanceof C26203f) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                            }
                            interfaceC2344jM7230a17.log(enumC2341g2, strM7231b17, "sendStats: " + strM30461o, null);
                        }
                        return c23454a0;
                    }
                    c26203f = new C26204g(objM35408x);
                    r15 = r24;
                    r10 = obj5;
                    r14 = r110;
                }
            } catch (Throwable th15) {
                th = th15;
            }
            c2345kM31043s = r10.m31043s();
            interfaceC2339eM7232c = c2345kM31043s.m7232c();
            enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g2, c2345kM31043s.m7231b())) {
                InterfaceC2344j interfaceC2344jM7230a18 = c2345kM31043s.m7230a();
                String strM7231b18 = c2345kM31043s.m7231b();
                if (c26203f instanceof C26204g) {
                    Object objM77814e18 = ((C26204g) c26203f).m77814e();
                    if (r15 != 0) {
                        obj = (Float) r15.f92937w;
                    } else {
                        obj = str;
                    }
                    if (r15 != 0) {
                        obj2 = (WebsocketReconnectStrategy) r15.f92938x;
                    } else {
                        obj2 = str;
                    }
                    strM30461o = "Success. Response: " + objM77814e18 + ". Telemetry: connectionTimeSeconds: " + r14 + ", reconnectionTimeSeconds: " + obj + ", strategy: " + obj2;
                } else {
                    if (c26203f instanceof C26203f) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strM30461o = AbstractC11266d.m30461o("Failure. Reason: ", ((C26203f) c26203f).m77813e().mo77807a());
                }
                interfaceC2344jM7230a18.log(enumC2341g2, strM7231b18, "sendStats: " + strM30461o, null);
            }
            return c23454a0;
        } catch (CancellationException e24) {
            throw e24;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: C */
    public final Object m31025C(WebsocketReconnectStrategy websocketReconnectStrategy, AbstractC32269c abstractC32269c) {
        C11623q0 c11623q0;
        C11602h1 c11602h1;
        C11602h1 c11602h2;
        C11602h1 c11602h3;
        C11602h1 c11602h4;
        Float f13;
        C23465k c23465k;
        WebsocketReconnectStrategy websocketReconnectStrategy2 = websocketReconnectStrategy;
        if (abstractC32269c instanceof C11623q0) {
            c11623q0 = (C11623q0) abstractC32269c;
            int i13 = c11623q0.f37529F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11623q0.f37529F = i13 - Integer.MIN_VALUE;
            } else {
                c11623q0 = new C11623q0(this, abstractC32269c);
            }
        } else {
            c11623q0 = new C11623q0(this, abstractC32269c);
        }
        C11623q0 c11623q1 = c11623q0;
        Object objM105811b = c11623q1.f37533z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11623q1.f37529F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM105811b);
            C33368c0 c33368c0 = this.f37440b;
            if (websocketReconnectStrategy2 == null) {
                c11623q1.f37530w = this;
                c11623q1.f37531x = this;
                c11623q1.f37529F = 1;
                objM105811b = c33368c0.m105811b(c11623q1);
                if (objM105811b != enumC31071a) {
                    c11602h3 = this;
                    c11602h4 = c11602h3;
                    f13 = new Float((System.currentTimeMillis() - c11602h3.f37440b.f139272G) / 1000.0f);
                    c11623q1.f37530w = null;
                    c11623q1.f37531x = null;
                    c11623q1.f37529F = 2;
                    if (m31014B(c11602h4, (C33460u0) objM105811b, f13, null, c11623q1, 4) == enumC31071a) {
                        return c23454a0;
                    }
                }
            } else {
                c11623q1.f37530w = this;
                c11623q1.f37531x = websocketReconnectStrategy2;
                c11623q1.f37532y = this;
                c11623q1.f37529F = 3;
                objM105811b = c33368c0.m105811b(c11623q1);
                if (objM105811b != enumC31071a) {
                    c11602h1 = this;
                    c11602h2 = c11602h1;
                    c23465k = new C23465k(new Float((System.currentTimeMillis() - c11602h2.f37440b.f139273H) / 1000.0f), websocketReconnectStrategy2);
                    c11623q1.f37530w = null;
                    c11623q1.f37531x = null;
                    c11623q1.f37532y = null;
                    c11623q1.f37529F = 4;
                    if (m31014B(c11602h1, (C33460u0) objM105811b, null, c23465k, c11623q1, 2) == enumC31071a) {
                        return c23454a0;
                    }
                }
            }
        } else if (i14 == 1) {
            C11602h1 c11602h5 = (C11602h1) c11623q1.f37531x;
            C11602h1 c11602h6 = c11623q1.f37530w;
            AbstractC34132o.m107864I(objM105811b);
            c11602h4 = c11602h5;
            c11602h3 = c11602h6;
            f13 = new Float((System.currentTimeMillis() - c11602h3.f37440b.f139272G) / 1000.0f);
            c11623q1.f37530w = null;
            c11623q1.f37531x = null;
            c11623q1.f37529F = 2;
            if (m31014B(c11602h4, (C33460u0) objM105811b, f13, null, c11623q1, 4) == enumC31071a) {
                return c23454a0;
            }
        } else {
            if (i14 == 2) {
                AbstractC34132o.m107864I(objM105811b);
                return c23454a0;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM105811b);
                return c23454a0;
            }
            C11602h1 c11602h7 = c11623q1.f37532y;
            WebsocketReconnectStrategy websocketReconnectStrategy3 = (WebsocketReconnectStrategy) c11623q1.f37531x;
            c11602h2 = c11623q1.f37530w;
            AbstractC34132o.m107864I(objM105811b);
            c11602h1 = c11602h7;
            websocketReconnectStrategy2 = websocketReconnectStrategy3;
            c23465k = new C23465k(new Float((System.currentTimeMillis() - c11602h2.f37440b.f139273H) / 1000.0f), websocketReconnectStrategy2);
            c11623q1.f37530w = null;
            c11623q1.f37531x = null;
            c11623q1.f37532y = null;
            c11623q1.f37529F = 4;
            if (m31014B(c11602h1, (C33460u0) objM105811b, null, c23465k, c11623q1, 2) == enumC31071a) {
                return c23454a0;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: D */
    public final Object m31026D(String str) {
        LeaveCallRequest leaveCallRequest = new LeaveCallRequest(this.f37441c, str, null, 4, null);
        this.f37452n.m67653b(str, "leave-session");
        SfuRequest sfuRequest = new SfuRequest(null, null, leaveCallRequest, null, 11, null);
        Boolean boolValueOf = Boolean.valueOf(m31044t().f168487e.f65017c.m47700e(new C35639x(sfuRequest)));
        return boolValueOf == EnumC31071a.f128113w ? boolValueOf : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public final void m31027E(TrackType trackType, AbstractC4191g abstractC4191g) {
        C12662v0 c12662v0 = (C12662v0) this.f37464z.getValue();
        String str = this.f37441c;
        if (c12662v0 != null) {
            c12662v0.m35427q(str, trackType, abstractC4191g);
        }
        m31029G(str, trackType, abstractC4191g);
    }

    /* JADX INFO: renamed from: F */
    public final void m31028F(boolean z4, TrackType trackType) {
        C2345k c2345kM31043s = m31043s();
        InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM31043s.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM31043s.f9274b.log(enumC2341g, str, "[setPublishState] #sfu; " + trackType + " isEnabled: " + z4, null);
        }
        C13045h2 c13045h2 = this.f37433M;
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0((Map) c13045h2.getValue());
        linkedHashMapM74003l0.put(trackType, Boolean.valueOf(z4));
        Map mapM74001j0 = AbstractC25247g0.m74001j0(linkedHashMapM74003l0);
        c13045h2.getClass();
        c13045h2.m36571k(null, mapM74001j0);
        C2996c2 c2996c2 = this.f37454p;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f37454p = AbstractC3006f0.m8732z(this.f37448j, null, null, new C11629t0(this, trackType, z4, mapM74001j0, this.f37443e, (InterfaceC30057d) null), 3);
    }

    /* JADX INFO: renamed from: G */
    public final void m31029G(String sessionId, TrackType trackType, AbstractC4191g abstractC4191g) {
        C33450s0 c33450s0 = this.f37440b.f139302p;
        c33450s0.getClass();
        AbstractC22676k.m65750j(sessionId, "sessionId");
        C33392g2 c33392g2 = (C33392g2) c33450s0.f139654i.get(sessionId);
        if (c33392g2 == null) {
            C2345k c2345kM31043s = m31043s();
            InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
            String str = c2345kM31043s.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM31043s.f9274b.log(enumC2341g, str, "[setTrack] #orphaned-track; Participant not found for sessionId=" + sessionId + ", registering orphaned track (type=" + trackType + ")", null);
            }
            String strM73373f = AbstractC25012a.m73373f(trackType.getValue(), sessionId, ":");
            C11626s c11626s = new C11626s(sessionId, trackType, abstractC4191g);
            ConcurrentHashMap concurrentHashMap = this.f37461w;
            concurrentHashMap.put(strM73373f, c11626s);
            this.f37458t.m67653b(sessionId + ":" + trackType, "orphaned-track");
            C2345k c2345kM31043s2 = m31043s();
            InterfaceC2339e interfaceC2339e2 = c2345kM31043s2.f9275c;
            String str2 = c2345kM31043s2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.INFO;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM31043s2.f9274b.log(enumC2341g2, str2, "[registerOrphanedTrack] #orphaned-track; Registered track for sessionId=" + sessionId + ", type=" + trackType + ", total orphaned=" + concurrentHashMap.size(), null);
                return;
            }
            return;
        }
        int i13 = AbstractC11628t.f37549a[trackType.ordinal()];
        if (i13 == 1) {
            abstractC4191g.getClass();
            C4207w c4207w = abstractC4191g instanceof C4207w ? (C4207w) abstractC4191g : null;
            C2345k c2345k = (C2345k) c33392g2.f139428g.getValue();
            InterfaceC2339e interfaceC2339e3 = c2345k.f9275c;
            String str3 = c2345k.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.INFO;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                c2345k.f9274b.log(enumC2341g3, str3, "[setVideoTrack] #sfu; #track; userId: " + c33392g2.f139446y.getValue() + " track: " + c4207w, null);
            }
            c33392g2.f139430i.m36570j(c4207w);
            return;
        }
        if (i13 == 2) {
            C13045h2 c13045h2 = c33392g2.f139438q;
            abstractC4191g.getClass();
            c13045h2.m36570j(abstractC4191g instanceof C4185a ? (C4185a) abstractC4191g : null);
            return;
        }
        if (i13 == 3 || i13 == 4) {
            C13045h2 c13045h3 = c33392g2.f139441t;
            abstractC4191g.getClass();
            c13045h3.m36570j(abstractC4191g instanceof C4207w ? (C4207w) abstractC4191g : null);
        } else {
            if (i13 != 5) {
                return;
            }
            C2345k c2345kM31043s3 = m31043s();
            InterfaceC2339e interfaceC2339e4 = c2345kM31043s3.f9275c;
            String str4 = c2345kM31043s3.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
                c2345kM31043s3.f9274b.log(enumC2341g4, str4, "Unspecified track type", null);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m31030H(boolean z4) {
        C33368c0 c33368c0 = this.f37440b;
        AbstractC3006f0.m8732z(this.f37448j, null, null, new C0327u(this, (List) c33368c0.f139302p.f139680v.f81695j.getValue(), (List) ((InterfaceC13037f2) c33368c0.f139302p.f139666o.getValue()).getValue(), z4, (InterfaceC30057d) null), 3);
        C2345k c2345kM31043s = m31043s();
        InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM31043s.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM31043s.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("[setVideoSubscriptions] #sfu; #track; useDefaults: ", z4), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public final Object m31031I(AbstractC32269c abstractC32269c) {
        C11593e1 c11593e1;
        C11602h1 c11602h1;
        C12659u c12659u;
        String str;
        C2345k c2345kM31043s;
        InterfaceC2339e interfaceC2339e;
        String str2;
        EnumC2341g enumC2341g;
        if (abstractC32269c instanceof C11593e1) {
            c11593e1 = (C11593e1) abstractC32269c;
            int i13 = c11593e1.f37391E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11593e1.f37391E = i13 - Integer.MIN_VALUE;
            } else {
                c11593e1 = new C11593e1(this, abstractC32269c);
            }
        } else {
            c11593e1 = new C11593e1(this, abstractC32269c);
        }
        Object obj = c11593e1.f37394y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11593e1.f37391E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C12659u c12659uM31038n = m31038n(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
            if (c12659uM31038n != null) {
                c11593e1.f37392w = this;
                c11593e1.f37393x = c12659uM31038n;
                c11593e1.f37391E = 1;
                Object objM31042r = m31042r(c12659uM31038n, c11593e1);
                if (objM31042r == enumC31071a) {
                    return enumC31071a;
                }
                c12659u = c12659uM31038n;
                obj = objM31042r;
                c11602h1 = this;
            } else {
                c11602h1 = this;
            }
            str = "";
            c2345kM31043s = c11602h1.m31043s();
            interfaceC2339e = c2345kM31043s.f9275c;
            str2 = c2345kM31043s.f9273a;
            enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                c2345kM31043s.f9274b.log(enumC2341g, str2, "[throwawayPublisherSdpAndOptions] #sfu; sdp: \n".concat(str), null);
            }
            return str;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c12659u = c11593e1.f37393x;
        c11602h1 = c11593e1.f37392w;
        AbstractC34132o.m107864I(obj);
        str = (String) obj;
        c11602h1.getClass();
        m31023l(c12659u);
        if (str == null) {
            str = "";
        }
        c2345kM31043s = c11602h1.m31043s();
        interfaceC2339e = c2345kM31043s.f9275c;
        str2 = c2345kM31043s.f9273a;
        enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM31043s.f9274b.log(enumC2341g, str2, "[throwawayPublisherSdpAndOptions] #sfu; sdp: \n".concat(str), null);
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final Object m31032J(AbstractC32269c abstractC32269c) {
        C11596f1 c11596f1;
        C12659u c12659u;
        C11602h1 c11602h1;
        if (abstractC32269c instanceof C11596f1) {
            c11596f1 = (C11596f1) abstractC32269c;
            int i13 = c11596f1.f37403E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11596f1.f37403E = i13 - Integer.MIN_VALUE;
            } else {
                c11596f1 = new C11596f1(this, abstractC32269c);
            }
        } else {
            c11596f1 = new C11596f1(this, abstractC32269c);
        }
        Object obj = c11596f1.f37406y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11596f1.f37403E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C12659u c12659uM31038n = m31038n(RtpTransceiver.RtpTransceiverDirection.RECV_ONLY);
            if (c12659uM31038n == null) {
                return "";
            }
            c11596f1.f37404w = this;
            c11596f1.f37405x = c12659uM31038n;
            c11596f1.f37403E = 1;
            Object objM31042r = m31042r(c12659uM31038n, c11596f1);
            if (objM31042r == enumC31071a) {
                return enumC31071a;
            }
            c12659u = c12659uM31038n;
            obj = objM31042r;
            c11602h1 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12659u = c11596f1.f37405x;
            c11602h1 = c11596f1.f37404w;
            AbstractC34132o.m107864I(obj);
        }
        String str = (String) obj;
        c11602h1.getClass();
        m31023l(c12659u);
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0061  */
    /* JADX INFO: renamed from: K */
    public final void m31033K(String userId, String sessionId, TrackType trackType, boolean z4, boolean z13, boolean z14) {
        AbstractC4191g abstractC4191g;
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(trackType, "trackType");
        C2345k c2345kM31043s = m31043s();
        InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM31043s.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = c2345kM31043s.f9274b;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[updateMuteState] #sfu; userId: ", userId, ", sessionId: ", sessionId, ", videoEnabled: ");
            sbM32001t.append(z4);
            sbM32001t.append(", audioEnabled: ");
            sbM32001t.append(z13);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        C12662v0 c12662v0 = (C12662v0) this.f37464z.getValue();
        if (c12662v0 != null) {
            ConcurrentHashMap concurrentHashMap = c12662v0.f43297J;
            concurrentHashMap.putIfAbsent(sessionId, new ConcurrentHashMap());
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(sessionId);
            if (concurrentHashMap2 != null) {
                abstractC4191g = (AbstractC4191g) concurrentHashMap2.get(trackType);
            } else {
                abstractC4191g = null;
            }
        } else {
            abstractC4191g = null;
        }
        if (abstractC4191g == null) {
            C2345k c2345kM31043s2 = m31043s();
            InterfaceC2339e interfaceC2339e2 = c2345kM31043s2.f9275c;
            String str2 = c2345kM31043s2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345kM31043s2.f9274b.log(enumC2341g2, str2, "[getTrack] #sfu; #track; track is null for sessionId: " + sessionId + ", type: " + trackType, null);
            }
        }
        C33450s0 c33450s0 = this.f37440b.f139302p;
        c33450s0.getClass();
        C33392g2 c33392g2 = (C33392g2) c33450s0.f139654i.get(sessionId);
        if (c33392g2 != null && ((Boolean) c33392g2.f139435n.getValue()).booleanValue() != z14) {
            AbstractC13673n.m38550B(z14, c33392g2.f139434m, null);
        }
        if (abstractC4191g != null) {
            C4207w c4207w = abstractC4191g instanceof C4207w ? (C4207w) abstractC4191g : null;
            if (c4207w != null) {
                c4207w.f17067b.setEnabled(z4);
            }
        }
        if (abstractC4191g != null) {
            C4185a c4185a = abstractC4191g instanceof C4185a ? (C4185a) abstractC4191g : null;
            if (c4185a != null) {
                c4185a.f17023b.setEnabled(z13);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: i */
    public final Serializable m31034i(ReconnectDetails reconnectDetails, List list, AbstractC32269c abstractC32269c) {
        C11630u c11630u;
        ReconnectDetails reconnectDetails2;
        C11602h1 c11602h1;
        Object obj;
        List list2;
        ReconnectDetails reconnectDetails3;
        C11602h1 c11602h2;
        String str;
        List list3;
        List list4;
        if (abstractC32269c instanceof C11630u) {
            c11630u = (C11630u) abstractC32269c;
            int i13 = c11630u.f37559G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11630u.f37559G = i13 - Integer.MIN_VALUE;
            } else {
                c11630u = new C11630u(this, abstractC32269c);
            }
        } else {
            c11630u = new C11630u(this, abstractC32269c);
        }
        Object obj2 = c11630u.f37557E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11630u.f37559G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            c11630u.f37560w = this;
            reconnectDetails2 = reconnectDetails;
            c11630u.f37561x = reconnectDetails2;
            c11630u.f37562y = list;
            c11630u.f37559G = 1;
            Object objM31032J = m31032J(c11630u);
            if (objM31032J != enumC31071a) {
                c11602h1 = this;
                obj = objM31032J;
                list2 = list;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            list2 = c11630u.f37562y;
            ReconnectDetails reconnectDetails4 = c11630u.f37561x;
            c11602h1 = c11630u.f37560w;
            AbstractC34132o.m107864I(obj2);
            obj = obj2;
            reconnectDetails2 = reconnectDetails4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = c11630u.f37563z;
            list2 = c11630u.f37562y;
            ReconnectDetails reconnectDetails5 = c11630u.f37561x;
            c11602h2 = c11630u.f37560w;
            AbstractC34132o.m107864I(obj2);
            str = str2;
            reconnectDetails3 = reconnectDetails5;
        }
        String str3 = (String) obj2;
        C33368c0 c33368c0 = c11602h2.f37440b;
        String str4 = c33368c0.f139270E;
        String str5 = c11602h2.f37441c;
        list3 = list2;
        String str6 = c11602h2.f37444f;
        ClientDetails clientDetails = c11602h2.f37423C;
        if (list3 == null) {
            list4 = C25271y.f99162w;
        } else {
            list4 = list3;
        }
        Collection collectionValues = c33368c0.f139277L.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        return new JoinRequest(str6, str5, str4, str, str3, clientDetails, null, false, reconnectDetails3, list4, null, AbstractC25265s.m74093D1(collectionValues), ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED, null, 9280, null);
        String str7 = (String) obj;
        c11630u.f37560w = c11602h1;
        c11630u.f37561x = reconnectDetails2;
        c11630u.f37562y = list2;
        c11630u.f37563z = str7;
        c11630u.f37559G = 2;
        Object objM31031I = c11602h1.m31031I(c11630u);
        if (objM31031I != enumC31071a) {
            reconnectDetails3 = reconnectDetails2;
            obj2 = objM31031I;
            c11602h2 = c11602h1;
            str = str7;
            String str8 = (String) obj2;
            C33368c0 c33368c1 = c11602h2.f37440b;
            String str9 = c33368c1.f139270E;
            String str10 = c11602h2.f37441c;
            list3 = list2;
            String str11 = c11602h2.f37444f;
            ClientDetails clientDetails2 = c11602h2.f37423C;
            if (list3 == null) {
                list4 = C25271y.f99162w;
            } else {
                list4 = list3;
            }
            Collection collectionValues2 = c33368c1.f139277L.values();
            AbstractC22676k.m65749i(collectionValues2, "<get-values>(...)");
            return new JoinRequest(str11, str10, str9, str, str8, clientDetails2, null, false, reconnectDetails3, list4, null, AbstractC25265s.m74093D1(collectionValues2), ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED, null, 9280, null);
        }
        return enumC31071a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [c93.a, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: j */
    public final String m31035j(TrackType trackType) {
        int value = trackType.getValue();
        C33392g2 c33392g2 = (C33392g2) ((AbstractC22680m) this.f37440b.f139302p.f139662m.f104635y).invoke();
        return (c33392g2 != null ? c33392g2.f139427f : null) + ":" + value + ":" + ((int) (Math.random() * ((double) 100)));
    }

    /* JADX INFO: renamed from: k */
    public final void m31036k(boolean z4) {
        C2996c2 c2996c2;
        C2996c2 c2996c3 = this.f37455q;
        if (c2996c3 != null) {
            c2996c3.cancel((CancellationException) null);
        }
        if (z4 && (c2996c2 = this.f37456r) != null) {
            c2996c2.cancel((CancellationException) null);
        }
        C2996c2 c2996c4 = this.f37427G;
        if (c2996c4 != null) {
            c2996c4.cancel((CancellationException) null);
        }
        this.f37427G = null;
        C2996c2 c2996c5 = this.f37454p;
        if (c2996c5 != null) {
            c2996c5.cancel((CancellationException) null);
        }
        this.f37454p = null;
        C2996c2 c2996c6 = this.f37426F;
        if (c2996c6 != null) {
            c2996c6.cancel((CancellationException) null);
        }
        this.f37426F = null;
        this.f37450l.m78094b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:102:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:112:0x0308  */
    /* JADX WARN: Code duplicated, block: B:113:0x030b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0126  */
    /* JADX WARN: Code duplicated, block: B:44:0x014b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0168  */
    /* JADX WARN: Code duplicated, block: B:50:0x0171  */
    /* JADX WARN: Code duplicated, block: B:53:0x01db  */
    /* JADX WARN: Code duplicated, block: B:57:0x0204  */
    /* JADX WARN: Code duplicated, block: B:60:0x0208  */
    /* JADX WARN: Code duplicated, block: B:62:0x020b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0210  */
    /* JADX WARN: Code duplicated, block: B:69:0x022c A[PHI: r0 r2 r4 r6
      0x022c: PHI (r0v32 x23.a) = (r0v29 x23.a), (r0v39 x23.a) binds: [B:67:0x0228, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r2v9 java.lang.Object) = (r2v8 java.lang.Object), (r2v1 java.lang.Object) binds: [B:67:0x0228, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r4v13 stream.video.sfu.event.ReconnectDetails) = (r4v10 stream.video.sfu.event.ReconnectDetails), (r4v20 stream.video.sfu.event.ReconnectDetails) binds: [B:67:0x0228, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r6v13 d33.h1) = (r6v12 d33.h1), (r6v17 d33.h1) binds: [B:67:0x0228, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0235  */
    /* JADX WARN: Code duplicated, block: B:73:0x023a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0250  */
    /* JADX WARN: Code duplicated, block: B:80:0x0256  */
    /* JADX WARN: Code duplicated, block: B:82:0x025d  */
    /* JADX WARN: Code duplicated, block: B:84:0x026b  */
    /* JADX WARN: Code duplicated, block: B:86:0x026f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0279  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x028b  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:97:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c1  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0248, code lost:
    
        if (r6.m31025C(r0, r8) == r3) goto L108;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0126, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x014b, please report this as an issue */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m31037m(stream.video.sfu.event.ReconnectDetails r33, java.util.List r34, x23.C37865a r35, s83.AbstractC32269c r36) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d33.C11602h1.m31037m(stream.video.sfu.event.ReconnectDetails, java.util.List, x23.a, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    public final C12659u m31038n(RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
        RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection2 = RtpTransceiver.RtpTransceiverDirection.SEND_ONLY;
        if (rtpTransceiverDirection != rtpTransceiverDirection2 && rtpTransceiverDirection != RtpTransceiver.RtpTransceiverDirection.RECV_ONLY) {
            return null;
        }
        C12638j0 c12638j0M105819j = this.f37440b.m105819j();
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(C25271y.f99162w);
        EnumC4206v enumC4206v = rtpTransceiverDirection == rtpTransceiverDirection2 ? EnumC4206v.f17063w : EnumC4206v.f17064x;
        MediaConstraints mediaConstraints = AbstractC26312c.f104557a;
        AbstractC22676k.m65750j(mediaConstraints, "mediaConstraints");
        C12659u c12659u = new C12659u(enumC4206v, mediaConstraints, null, null, null, C12626d0.f43127w, C12628e0.f43131w, 1200000, true, new C23372m(AbstractC34870c0.m110010n0(enumC4206v).name()), "DummyPeerConnection");
        PeerConnection peerConnectionM35395d = c12638j0M105819j.m35395d(rTCConfiguration, c12659u);
        C2345k c2345kM35394c = c12638j0M105819j.m35394c();
        InterfaceC2339e interfaceC2339e = c2345kM35394c.f9275c;
        String str = c2345kM35394c.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35394c.f9274b.log(enumC2341g, str, "type " + enumC4206v + " " + c12659u + " is now monitoring " + peerConnectionM35395d, null);
        }
        c12659u.m35419h(peerConnectionM35395d);
        C11640z.f37599w.invoke(c12659u);
        return c12659u;
    }

    /* JADX INFO: renamed from: o */
    public final C23471q m31039o() {
        List listM74093D1;
        C12662v0 c12662v0 = (C12662v0) this.f37464z.getValue();
        List listM35402r = C25271y.f99162w;
        if (c12662v0 != null) {
            Collection collectionValues = c12662v0.f43294G.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            listM74093D1 = AbstractC25265s.m74093D1(collectionValues);
        } else {
            listM74093D1 = listM35402r;
        }
        C12645n c12645n = (C12645n) this.f37421A.getValue();
        if (c12645n != null) {
            SessionDescription localDescription = c12645n.m35416e().getLocalDescription();
            listM35402r = c12645n.m35402r(null, localDescription != null ? localDescription.description : null);
        }
        return new C23471q(this.f37441c, listM74093D1, listM35402r);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010e, code lost:
    
        if (r10.m31050z(r0) == r1) goto L54;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m31040p(stream.video.sfu.event.ReconnectDetails r10, s83.AbstractC32269c r11) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d33.C11602h1.m31040p(stream.video.sfu.event.ReconnectDetails, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: q */
    public final PeerConnection.RTCConfiguration m31041q() {
        MediaConstraints mediaConstraints = AbstractC26312c.f104557a;
        PeerConnection.SdpSemantics sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        ArrayList iceServers = this.f37463y;
        AbstractC22676k.m65750j(iceServers, "iceServers");
        AbstractC22676k.m65750j(sdpSemantics, "sdpSemantics");
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(C25271y.f99162w);
        rTCConfiguration.sdpSemantics = sdpSemantics;
        rTCConfiguration.iceServers = iceServers;
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        return rTCConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m31042r(C12659u c12659u, AbstractC32269c abstractC32269c) {
        C11589d0 c11589d0;
        if (abstractC32269c instanceof C11589d0) {
            c11589d0 = (C11589d0) abstractC32269c;
            int i13 = c11589d0.f37386y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11589d0.f37386y = i13 - Integer.MIN_VALUE;
            } else {
                c11589d0 = new C11589d0(this, abstractC32269c);
            }
        } else {
            c11589d0 = new C11589d0(this, abstractC32269c);
        }
        Object objM35415d = c11589d0.f37384w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c11589d0.f37386y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM35415d);
            c11589d0.f37386y = 1;
            objM35415d = c12659u.m35415d(AbstractC26312c.f104557a, c11589d0);
            if (objM35415d == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM35415d);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM35415d;
        if (!(abstractC26205h instanceof C26204g)) {
            return "";
        }
        String str = ((SessionDescription) ((C26204g) abstractC26205h).f103919a).description;
        AbstractC22676k.m65747g(str);
        return str;
    }

    /* JADX INFO: renamed from: s */
    public final C2345k m31043s() {
        return (C2345k) this.f37459u.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final C39202e m31044t() {
        C39202e c39202e = this.f37422B;
        if (c39202e != null) {
            return c39202e;
        }
        AbstractC22676k.m65757q("sfuConnectionModule");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011a, code lost:
    
        if (r2.m35418g(r5, r3) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        if (r2.m35418g(r5, r3) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
    
        return r4;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x014a, please report this as an issue */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m31045u(v33.C35626k r18, s83.AbstractC32269c r19) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d33.C11602h1.m31045u(v33.k, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m31046v(C35640y c35640y, AbstractC32269c abstractC32269c) {
        C11601h0 c11601h0;
        if (abstractC32269c instanceof C11601h0) {
            c11601h0 = (C11601h0) abstractC32269c;
            int i13 = c11601h0.f37420y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11601h0.f37420y = i13 - Integer.MIN_VALUE;
            } else {
                c11601h0 = new C11601h0(this, abstractC32269c);
            }
        } else {
            c11601h0 = new C11601h0(this, abstractC32269c);
        }
        Object obj = c11601h0.f37418w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11601h0.f37420y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ((C23468n) obj).getClass();
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        C2345k c2345kM31043s = m31043s();
        InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
        String str = c2345kM31043s.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM31043s.f9274b.log(enumC2341g, str, "[handleSubscriberOffer] #sfu; #subscriber; event: " + c35640y, null);
        }
        C13045h2 c13045h2 = this.f37464z;
        if (c13045h2.getValue() == null) {
            this.f37437Q.add(c35640y);
            return c23454a0;
        }
        C12662v0 c12662v0 = (C12662v0) c13045h2.getValue();
        if (c12662v0 != null) {
            String str2 = c35640y.f151442a;
            c11601h0.f37420y = 1;
            if (c12662v0.m35424n(str2, c11601h0) == enumC31071a) {
                return enumC31071a;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: w */
    public final void m31047w() {
        C2996c2 c2996c2 = this.f37456r;
        InterfaceC30057d interfaceC30057d = null;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        C2996c2 c2996c3 = this.f37455q;
        if (c2996c3 != null) {
            c2996c3.cancel((CancellationException) null);
        }
        C2996c2 c2996c4 = this.f37426F;
        if (c2996c4 != null) {
            c2996c4.cancel((CancellationException) null);
        }
        C11614m c11614m = new C11614m(this, interfaceC30057d, 10);
        InterfaceC2994c0 interfaceC2994c0 = this.f37448j;
        this.f37426F = AbstractC3006f0.m8732z(interfaceC2994c0, null, null, c11614m, 3);
        this.f37455q = AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11614m(this, interfaceC30057d, 12), 3);
        this.f37456r = AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11614m(this, interfaceC30057d, 13), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r10.m31026D(r11) == r0) goto L29;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m31048x(java.lang.String r10, s83.AbstractC32269c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof d33.C11610k0
            if (r0 == 0) goto L14
            r0 = r11
            d33.k0 r0 = (d33.C11610k0) r0
            int r1 = r0.f37483E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f37483E = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            d33.k0 r0 = new d33.k0
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f37486y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r5.f37483E
            r7 = 3
            r2 = 2
            r8 = 1
            if (r1 == 0) goto L4b
            if (r1 == r8) goto L43
            if (r1 == r2) goto L39
            if (r1 != r7) goto L31
            d33.h1 r10 = r5.f37484w
            p505ts.AbstractC34132o.m107864I(r11)
            goto L89
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            java.lang.String r10 = r5.f37485x
            d33.h1 r1 = r5.f37484w
            p505ts.AbstractC34132o.m107864I(r11)
        L40:
            r11 = r10
            r10 = r1
            goto L71
        L43:
            java.lang.String r10 = r5.f37485x
            d33.h1 r1 = r5.f37484w
            p505ts.AbstractC34132o.m107864I(r11)
            goto L5e
        L4b:
            p505ts.AbstractC34132o.m107864I(r11)
            r5.f37484w = r9
            r5.f37485x = r10
            r5.f37483E = r8
            t23.c0 r11 = r9.f37440b
            java.lang.Object r11 = r11.m105811b(r5)
            if (r11 != r0) goto L5d
            goto L88
        L5d:
            r1 = r9
        L5e:
            t23.u0 r11 = (t23.C33460u0) r11
            r5.f37484w = r1
            r5.f37485x = r10
            r5.f37483E = r2
            r3 = 0
            r4 = 0
            r6 = 6
            r2 = r11
            java.lang.Object r11 = m31014B(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L40
            goto L88
        L71:
            ec3.h2 r1 = r10.f37424D
            r1.getClass()
            r2 = 0
            i53.g r3 = i53.C18135g.f70432a
            r1.m36571k(r2, r3)
            r5.f37484w = r10
            r5.f37485x = r2
            r5.f37483E = r7
            java.lang.Object r11 = r10.m31026D(r11)
            if (r11 != r0) goto L89
        L88:
            return r0
        L89:
            r10.m31036k(r8)
            c6.a r11 = r10.f37432L
            d33.r r0 = new d33.r
            r1 = 1
            r0.<init>(r10, r1)
            r11.m13289a(r0)
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d33.C11602h1.m31048x(java.lang.String, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m31049y(InterfaceC30057d interfaceC30057d) {
        C11617n0 c11617n0;
        if (interfaceC30057d instanceof C11617n0) {
            c11617n0 = (C11617n0) interfaceC30057d;
            int i13 = c11617n0.f37508y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11617n0.f37508y = i13 - Integer.MIN_VALUE;
            } else {
                c11617n0 = new C11617n0(this, interfaceC30057d);
            }
        } else {
            c11617n0 = new C11617n0(this, interfaceC30057d);
        }
        Object objM35426p = c11617n0.f37506w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11617n0.f37508y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM35426p);
            C12662v0 c12662v0 = (C12662v0) this.f37464z.getValue();
            if (c12662v0 != null) {
                c11617n0.f37508y = 1;
                objM35426p = c12662v0.m35426p(c11617n0);
                if (objM35426p == enumC31071a) {
                    return enumC31071a;
                }
            }
            return new C26203f(new C26201d("Subscriber is null", new Exception("Subscriber is null")));
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM35426p);
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM35426p;
        if (abstractC26205h != null) {
            return abstractC26205h;
        }
        return new C26203f(new C26201d("Subscriber is null", new Exception("Subscriber is null")));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r10.m35407w("fastReconnect - network change recovery", r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m31050z(s83.AbstractC32269c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof d33.C11619o0
            if (r0 == 0) goto L13
            r0 = r10
            d33.o0 r0 = (d33.C11619o0) r0
            int r1 = r0.f37514z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37514z = r1
            goto L18
        L13:
            d33.o0 r0 = new d33.o0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f37512x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f37514z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            p505ts.AbstractC34132o.m107864I(r10)
            goto L9b
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            d33.h1 r2 = r0.f37511w
            p505ts.AbstractC34132o.m107864I(r10)
            l83.n r10 = (l83.C23468n) r10
            java.lang.Object r10 = r10.f92940w
            goto L6f
        L3d:
            p505ts.AbstractC34132o.m107864I(r10)
            ec3.h2 r10 = r9.f37421A
            java.lang.Object r10 = r10.getValue()
            e33.n r10 = (e33.C12645n) r10
            if (r10 == 0) goto L6e
            b23.k r2 = r9.m31043s()
            b23.e r6 = r2.f9275c
            java.lang.String r7 = r2.f9273a
            b23.g r8 = b23.EnumC2341g.INFO
            boolean r6 = r6.isLoggable(r8, r7)
            if (r6 == 0) goto L61
            b23.j r2 = r2.f9274b
            java.lang.String r6 = "[fastReconnect] Restarting publisher ICE after fast reconnect"
            r2.log(r8, r7, r6, r3)
        L61:
            r0.f37511w = r9
            r0.f37514z = r5
            java.lang.String r2 = "fastReconnect - network change recovery"
            java.lang.Object r10 = r10.m35407w(r2, r0)
            if (r10 != r1) goto L6e
            goto L9a
        L6e:
            r2 = r9
        L6f:
            ec3.h2 r10 = r2.f37464z
            java.lang.Object r10 = r10.getValue()
            e33.v0 r10 = (e33.C12662v0) r10
            if (r10 == 0) goto L9d
            b23.k r10 = r2.m31043s()
            b23.e r5 = r10.f9275c
            java.lang.String r6 = r10.f9273a
            b23.g r7 = b23.EnumC2341g.INFO
            boolean r5 = r5.isLoggable(r7, r6)
            if (r5 == 0) goto L90
            b23.j r10 = r10.f9274b
            java.lang.String r5 = "[fastReconnect] Restarting subscriber ICE after fast reconnect"
            r10.log(r7, r6, r5, r3)
        L90:
            r0.f37511w = r3
            r0.f37514z = r4
            java.lang.Object r10 = r2.m31049y(r0)
            if (r10 != r1) goto L9b
        L9a:
            return r1
        L9b:
            n23.h r10 = (n23.AbstractC26205h) r10
        L9d:
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d33.C11602h1.m31050z(s83.c):java.lang.Object");
    }
}
