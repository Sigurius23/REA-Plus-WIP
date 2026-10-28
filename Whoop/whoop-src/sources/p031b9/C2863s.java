package p031b9;

import p309lo.InterfaceC24550h;
import p465rm.InterfaceC31582z0;
import p516u8.InterfaceC34595h0;
import p607x8.InterfaceC38051f;

/* JADX INFO: renamed from: b9.s */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2863s implements InterfaceC38051f, InterfaceC24550h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11381w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f11382x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f11383y;

    public /* synthetic */ C2863s(int i13, int i14, int i15) {
        this.f11381w = i15;
        this.f11382x = i13;
        this.f11383y = i14;
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public final void mo134038invoke(Object obj) {
        switch (this.f11381w) {
            case 0:
                ((InterfaceC34595h0) obj).onSurfaceSizeChanged(this.f11382x, this.f11383y);
                break;
            default:
                ((InterfaceC31582z0) obj).onSurfaceSizeChanged(this.f11382x, this.f11383y);
                break;
        }
    }
}
