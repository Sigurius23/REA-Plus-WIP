package p031b9;

import gm.C15981i;
import gm.C15990r;
import om.InterfaceC28022a;
import p127ev.C13668i;
import p309lo.InterfaceC24550h;
import p465rm.C31516a1;
import p465rm.InterfaceC31582z0;
import p516u8.C34597i0;
import p516u8.InterfaceC34595h0;
import p607x8.InterfaceC38051f;

/* JADX INFO: renamed from: b9.x */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2873x implements InterfaceC38051f, InterfaceC28022a, InterfaceC24550h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11419w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f11420x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f11421y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f11422z;

    public /* synthetic */ C2873x(C13668i c13668i, C15981i c15981i, int i13) {
        this.f11419w = 1;
        this.f11421y = c13668i;
        this.f11422z = c15981i;
        this.f11420x = i13;
    }

    @Override // om.InterfaceC28022a
    public Object execute() {
        C13668i c13668i = (C13668i) this.f11421y;
        ((C15990r) c13668i.f48457d).m45149O((C15981i) this.f11422z, this.f11420x + 1, false);
        return null;
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public void mo134038invoke(Object obj) {
        switch (this.f11419w) {
            case 0:
                C34597i0 c34597i0 = (C34597i0) this.f11421y;
                C34597i0 c34597i1 = (C34597i0) this.f11422z;
                InterfaceC34595h0 interfaceC34595h0 = (InterfaceC34595h0) obj;
                interfaceC34595h0.getClass();
                interfaceC34595h0.onPositionDiscontinuity(c34597i0, c34597i1, this.f11420x);
                break;
            default:
                C31516a1 c31516a1 = (C31516a1) this.f11421y;
                C31516a1 c31516a2 = (C31516a1) this.f11422z;
                InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj;
                interfaceC31582z0.getClass();
                interfaceC31582z0.mo61775p(c31516a1, c31516a2, this.f11420x);
                break;
        }
    }

    public /* synthetic */ C2873x(Object obj, int i13, Object obj2, int i14) {
        this.f11419w = i14;
        this.f11420x = i13;
        this.f11421y = obj;
        this.f11422z = obj2;
    }
}
