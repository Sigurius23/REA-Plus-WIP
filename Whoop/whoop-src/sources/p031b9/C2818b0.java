package p031b9;

import p012ab.C0682h0;
import p047c9.C4310a;
import p047c9.C4321l;
import p047c9.InterfaceC4311b;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34629y0;
import p516u8.InterfaceC34595h0;
import p607x8.InterfaceC38051f;

/* JADX INFO: renamed from: b9.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2818b0 implements InterfaceC38051f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11026w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34629y0 f11027x;

    public /* synthetic */ C2818b0(C4310a c4310a, C34629y0 c34629y0) {
        this.f11027x = c34629y0;
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public final void mo134038invoke(Object obj) {
        switch (this.f11026w) {
            case 0:
                ((InterfaceC34595h0) obj).onVideoSizeChanged(this.f11027x);
                break;
            default:
                C4321l c4321l = (C4321l) ((InterfaceC4311b) obj);
                C0682h0 c0682h0 = c4321l.f17560p;
                C34629y0 c34629y0 = this.f11027x;
                if (c0682h0 != null) {
                    C34610p c34610p = (C34610p) c0682h0.f2433y;
                    if (c34610p.f145791v == -1) {
                        C34608o c34608oM109410a = c34610p.m109410a();
                        c34608oM109410a.f145748t = c34629y0.f145875a;
                        c34608oM109410a.f145749u = c34629y0.f145876b;
                        c4321l.f17560p = new C0682h0(new C34610p(c34608oM109410a), c0682h0.f2432x, (String) c0682h0.f2434z, 4);
                    }
                }
                int i13 = c34629y0.f145875a;
                break;
        }
    }

    public /* synthetic */ C2818b0(C34629y0 c34629y0) {
        this.f11027x = c34629y0;
    }
}
