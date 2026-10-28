package p031b9;

import p516u8.C34593g0;
import p516u8.C34606n;
import p516u8.InterfaceC34595h0;
import p607x8.InterfaceC38051f;
import p607x8.InterfaceC38052g;

/* JADX INFO: renamed from: b9.u */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2867u implements InterfaceC38052g, InterfaceC38051f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C2830f0 f11403w;

    public /* synthetic */ C2867u(C2830f0 c2830f0) {
        this.f11403w = c2830f0;
    }

    @Override // p607x8.InterfaceC38052g
    /* JADX INFO: renamed from: a */
    public void mo1654a(Object obj, C34606n c34606n) {
        ((InterfaceC34595h0) obj).onEvents(this.f11403w.f11106G, new C34593g0(c34606n));
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public void mo134038invoke(Object obj) {
        ((InterfaceC34595h0) obj).onAvailableCommandsChanged(this.f11403w.f11146p0);
    }
}
