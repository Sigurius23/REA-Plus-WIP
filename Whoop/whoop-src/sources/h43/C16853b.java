package h43;

import a13.C0146d;
import android.app.Notification;
import androidx.room.AbstractC1772c1;
import bc3.InterfaceC2994c0;
import e43.C12715g;
import e43.InterfaceC12716h;
import g73.C15556d;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import io.getstream.video.android.model.StreamCallId;
import java.util.Map;
import l83.C23470p;
import m83.C25272z;
import n43.C26288d;
import p078d1.C11457j;
import p43.C28843b;
import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33368c0;
import t23.InterfaceC33377d3;

/* JADX INFO: renamed from: h43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16853b implements InterfaceC12716h {

    /* JADX INFO: renamed from: E */
    public static final C15556d f64763E;

    /* JADX INFO: renamed from: F */
    public static final C23470p f64764F;

    /* JADX INFO: renamed from: G */
    public static C16853b f64765G;

    /* JADX INFO: renamed from: w */
    public InterfaceC2994c0 f64766w;

    /* JADX INFO: renamed from: x */
    public final C12715g f64767x;

    /* JADX INFO: renamed from: y */
    public ProductvideoApi f64768y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC12716h f64769z;

    static {
        C15556d c15556d = new C15556d(2);
        f64763E = c15556d;
        f64764F = AbstractC1772c1.m5382S(c15556d, "StreamVideo:Notifications");
    }

    public C16853b(InterfaceC2994c0 interfaceC2994c0, C12715g c12715g, ProductvideoApi productvideoApi, C28843b c28843b, C0146d c0146d) {
        this.f64766w = interfaceC2994c0;
        this.f64767x = c12715g;
        this.f64768y = productvideoApi;
        this.f64769z = c12715g.f43505c;
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: a */
    public final Notification mo43670a(StreamCallId callId, String str, boolean z4, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        return this.f64769z.mo43670a(callId, str, z4, payload);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: b */
    public final void mo43671b(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        this.f64769z.mo43671b(callId, callDisplayName, payload);
    }

    @Override // e43.InterfaceC12716h
    /* JADX INFO: renamed from: c */
    public final C11457j mo35558c() {
        return this.f64769z.mo35558c();
    }

    @Override // g43.InterfaceC15481r
    /* JADX INFO: renamed from: e */
    public final Object mo43672e(C33368c0 c33368c0, C26288d c26288d) {
        return this.f64769z.mo43672e(c33368c0, c26288d);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: f */
    public final void mo43673f(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        this.f64769z.mo43673f(callId, callDisplayName, payload);
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: g */
    public final Notification mo43674g(InterfaceC33377d3 interfaceC33377d3, StreamCallId streamCallId, String str, boolean z4, Map map) {
        return this.f64769z.mo43674g(interfaceC33377d3, streamCallId, str, z4, C25272z.f99163w);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: h */
    public final void mo43675h(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        this.f64769z.mo43675h(callId, callDisplayName, payload);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: i */
    public final void mo43676i(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        this.f64769z.mo43676i(callId, callDisplayName, payload);
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: j */
    public final Notification mo43677j(String str, StreamCallId streamCallId) {
        return this.f64769z.mo43677j(str, streamCallId);
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionDenied() {
        this.f64769z.onPermissionDenied();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionGranted() {
        this.f64769z.onPermissionGranted();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRationale() {
        this.f64769z.onPermissionRationale();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRequested() {
        this.f64769z.onPermissionRequested();
    }
}
