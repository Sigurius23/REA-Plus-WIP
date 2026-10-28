package h43;

import android.app.Notification;
import e43.InterfaceC12716h;
import io.getstream.video.android.model.StreamCallId;
import java.util.Map;
import n43.C26288d;
import p078d1.C11457j;
import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33368c0;
import t23.InterfaceC33377d3;

/* JADX INFO: renamed from: h43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16852a implements InterfaceC12716h {

    /* JADX INFO: renamed from: w */
    public static final C16852a f64762w = new C16852a();

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: a */
    public final Notification mo43670a(StreamCallId callId, String str, boolean z4, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        return null;
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: b */
    public final void mo43671b(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
    }

    @Override // e43.InterfaceC12716h
    /* JADX INFO: renamed from: c */
    public final C11457j mo35558c() {
        AbstractC22676k.m65748h(null, "null cannot be cast to non-null type io.getstream.video.android.core.notifications.dispatchers.NotificationDispatcher");
        return null;
    }

    @Override // g43.InterfaceC15481r
    /* JADX INFO: renamed from: e */
    public final Object mo43672e(C33368c0 c33368c0, C26288d c26288d) {
        return null;
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: f */
    public final void mo43673f(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: g */
    public final Notification mo43674g(InterfaceC33377d3 interfaceC33377d3, StreamCallId streamCallId, String str, boolean z4, Map map) {
        return null;
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: h */
    public final void mo43675h(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: i */
    public final void mo43676i(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: j */
    public final Notification mo43677j(String str, StreamCallId streamCallId) {
        return null;
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionDenied() {
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionGranted() {
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRationale() {
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRequested() {
    }
}
