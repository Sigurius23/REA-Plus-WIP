package fs2;

import c93.InterfaceC4339a;
import com.whoop.videocall.api.HmsVideoCallSessionResponse;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.error.HMSException;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.HMSPreviewListener;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import live.hms.video.signal.init.HMSTokenListener;
import live.hms.video.signal.init.TokenRequest;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: fs2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u000f\u0012\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001dB\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001f\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006."}, m65681d2 = {"Lfs2/f;", "", "Lkotlin/Function0;", "Lfs2/c;", "createSdk", "Ltr2/n;", "logger", "<init>", "(Lc93/a;Ltr2/n;)V", "Ll83/a0;", "i", "()V", "sdk", "", "userName", "fs2/f$d", "j", "(Lfs2/c;Ljava/lang/String;)Lfs2/f$d;", "fs2/f$b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lfs2/c;)Lfs2/f$b;", "callbackName", "", "g", "(Lfs2/c;Ljava/lang/String;)Z", "Lcom/whoop/videocall/api/HmsVideoCallSessionResponse;", "session", "f", "(Lcom/whoop/videocall/api/HmsVideoCallSessionResponse;)V", "a", "Lc93/a;", "b", "Ltr2/n;", "c", "Lfs2/c;", "currentSdk", "Lec3/p1;", "Lfs2/b;", "d", "Lec3/p1;", "_callPhase", "Lec3/f2;", "e", "Lec3/f2;", "()Lec3/f2;", "callPhase", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14753f {

    /* JADX INFO: renamed from: g */
    public static final int f54611g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4339a createSdk;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private volatile InterfaceC14750c currentSdk;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13075p1 _callPhase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13037f2 callPhase;

    /* JADX INFO: renamed from: fs2.f$b */
    @Metadata(m65680d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"fs2/f$b", "Llive/hms/video/sdk/HMSPreviewListener;", "Llive/hms/video/sdk/models/HMSRoom;", "room", "", "Llive/hms/video/media/tracks/HMSTrack;", "localTracks", "Ll83/a0;", "onPreview", "(Llive/hms/video/sdk/models/HMSRoom;[Llive/hms/video/media/tracks/HMSTrack;)V", "Llive/hms/video/error/HMSException;", "error", "onError", "(Llive/hms/video/error/HMSException;)V", "Llive/hms/video/sdk/models/enums/HMSPeerUpdate;", "type", "Llive/hms/video/sdk/models/HMSPeer;", "peer", "onPeerUpdate", "(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;", "hmsRoom", "onRoomUpdate", "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements HMSPreviewListener {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC14750c f54618x;

        public b(InterfaceC14750c interfaceC14750c) {
            this.f54618x = interfaceC14750c;
        }

        @Override // live.hms.video.sdk.IErrorListener
        public void onError(HMSException error) {
            AbstractC22676k.m65750j(error, "error");
            if (C14753f.this.m42305g(this.f54618x, "preview")) {
                return;
            }
            if (!error.getIsTerminal()) {
                C14753f.this.logger.mo85226q(AbstractC11266d.m30461o("Preview continuing after non-terminal error: ", AbstractC14754g.m42312b(error)), new AbstractC30556a.a[0]);
                return;
            }
            C14753f.this.logger.mo85222m(AbstractC11266d.m30461o("Preview failed: ", AbstractC14754g.m42312b(error)), new AbstractC30556a.a[0]);
            InterfaceC13075p1 interfaceC13075p1 = C14753f.this._callPhase;
            InterfaceC14749b.b bVar = new InterfaceC14749b.b(AbstractC14754g.m42312b(error));
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, bVar);
        }

        @Override // live.hms.video.sdk.HMSPreviewListener
        public void onPeerUpdate(HMSPeerUpdate type, HMSPeer peer) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(peer, "peer");
        }

        @Override // live.hms.video.sdk.RequestPermissionInterface
        public /* bridge */ void onPermissionsRequested(List<String> list) {
            HMSPreviewListener.DefaultImpls.onPermissionsRequested(this, list);
        }

        @Override // live.hms.video.sdk.HMSPreviewListener
        public void onPreview(HMSRoom room, HMSTrack[] localTracks) {
            AbstractC22676k.m65750j(room, "room");
            AbstractC22676k.m65750j(localTracks, "localTracks");
            if (C14753f.this.m42305g(this.f54618x, "preview")) {
                return;
            }
            ((C13045h2) C14753f.this._callPhase).m36570j(InterfaceC14749b.c.f54593a);
        }

        @Override // live.hms.video.sdk.HMSPreviewListener
        public void onRoomUpdate(HMSRoomUpdate type, HMSRoom hmsRoom) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(hmsRoom, "hmsRoom");
        }

        @Override // live.hms.video.sdk.HMSPreviewListener
        public /* bridge */ void peerListUpdated(ArrayList<HMSPeer> arrayList, ArrayList<HMSPeer> arrayList2) {
            HMSPreviewListener.DefaultImpls.peerListUpdated(this, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: fs2.f$c */
    @Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"fs2/f$c", "Llive/hms/video/sdk/HMSActionResultListener;", "Ll83/a0;", "onSuccess", "()V", "Llive/hms/video/error/HMSException;", "error", "onError", "(Llive/hms/video/error/HMSException;)V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements HMSActionResultListener {
        public c() {
        }

        @Override // live.hms.video.sdk.IErrorListener
        public void onError(HMSException error) {
            AbstractC22676k.m65750j(error, "error");
            C14753f.this.logger.mo85222m(AbstractC11266d.m30461o("Leave failed while tearing down: ", AbstractC14754g.m42312b(error)), new AbstractC30556a.a[0]);
        }

        @Override // live.hms.video.sdk.HMSActionResultListener
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: fs2.f$d */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"fs2/f$d", "Llive/hms/video/signal/init/HMSTokenListener;", "", "string", "Ll83/a0;", "onTokenSuccess", "(Ljava/lang/String;)V", "Llive/hms/video/error/HMSException;", "error", "onError", "(Llive/hms/video/error/HMSException;)V", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements HMSTokenListener {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC14750c f54621x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f54622y;

        public d(InterfaceC14750c interfaceC14750c, String str) {
            this.f54621x = interfaceC14750c;
            this.f54622y = str;
        }

        @Override // live.hms.video.sdk.IErrorListener
        public void onError(HMSException error) {
            AbstractC22676k.m65750j(error, "error");
            if (C14753f.this.m42305g(this.f54621x, "token")) {
                return;
            }
            C14753f.this.logger.mo85222m(AbstractC11266d.m30461o("Room code exchange failed: ", AbstractC14754g.m42312b(error)), new AbstractC30556a.a[0]);
            InterfaceC13075p1 interfaceC13075p1 = C14753f.this._callPhase;
            InterfaceC14749b.b bVar = new InterfaceC14749b.b(AbstractC14754g.m42312b(error));
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, bVar);
        }

        @Override // live.hms.video.signal.init.HMSTokenListener
        public void onTokenSuccess(String string) {
            AbstractC22676k.m65750j(string, "string");
            if (C14753f.this.m42305g(this.f54621x, "token")) {
                return;
            }
            HMSConfig hMSConfig = new HMSConfig(this.f54622y, string, null, false, null, 28, null);
            InterfaceC14750c interfaceC14750c = this.f54621x;
            interfaceC14750c.mo42286b(hMSConfig, C14753f.this.m42306h(interfaceC14750c));
        }
    }

    public C14753f(InterfaceC4339a createSdk, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(createSdk, "createSdk");
        AbstractC22676k.m65750j(logger, "logger");
        this.createSdk = createSdk;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this._callPhase = c13045h2M36593c;
        this.callPhase = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final boolean m42305g(InterfaceC14750c sdk, String callbackName) {
        boolean z4 = sdk != this.currentSdk;
        if (z4) {
            this.logger.mo85226q(AbstractC11895b.m31996o("Ignoring ", callbackName, " callback from a replaced 100ms SDK"), new AbstractC30556a.a[0]);
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final b m42306h(InterfaceC14750c sdk) {
        return new b(sdk);
    }

    /* JADX INFO: renamed from: i */
    private final void m42307i() {
        InterfaceC14750c interfaceC14750c = this.currentSdk;
        if (interfaceC14750c != null) {
            interfaceC14750c.mo42285a(new c());
        }
        this.currentSdk = null;
    }

    /* JADX INFO: renamed from: j */
    private final d m42308j(InterfaceC14750c sdk, String userName) {
        return new d(sdk, userName);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC13037f2 getCallPhase() {
        return this.callPhase;
    }

    /* JADX INFO: renamed from: f */
    public final void m42310f(HmsVideoCallSessionResponse session) {
        AbstractC22676k.m65750j(session, "session");
        m42307i();
        ((C13045h2) this._callPhase).m36570j(InterfaceC14749b.a.f54591a);
        try {
            InterfaceC14750c interfaceC14750c = (InterfaceC14750c) this.createSdk.invoke();
            this.currentSdk = interfaceC14750c;
            interfaceC14750c.mo42287c(new TokenRequest(session.getRoomCode(), session.getUserId()), m42308j(interfaceC14750c, session.getUserName()));
        } catch (RuntimeException e5) {
            this.logger.mo85230v("Failed to build the 100ms SDK", e5, new AbstractC30556a.a[0]);
            InterfaceC13075p1 interfaceC13075p1 = this._callPhase;
            InterfaceC14749b.b bVar = new InterfaceC14749b.b(e5.getMessage());
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, bVar);
        }
    }

    public /* synthetic */ C14753f(InterfaceC4339a interfaceC4339a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4339a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HmsVideoClientService") : interfaceC34116n);
    }
}
