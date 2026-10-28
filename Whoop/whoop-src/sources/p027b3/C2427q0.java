package p027b3;

import l83.C23454a0;
import p179h.C16343a;
import p179h.C16353k;
import p236j.C21070i;
import p390p1.InterfaceC28620h0;

/* JADX INFO: renamed from: b3.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2427q0 implements InterfaceC28620h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9517b;

    public /* synthetic */ C2427q0(Object obj, int i13) {
        this.f9516a = i13;
        this.f9517b = obj;
    }

    @Override // p390p1.InterfaceC28620h0
    public final void dispose() {
        C23454a0 c23454a0;
        switch (this.f9516a) {
            case 0:
                ((C2468y1) this.f9517b).f9619x.invoke();
                return;
            case 1:
                C21070i c21070i = ((C16343a) this.f9517b).f62849a;
                if (c21070i != null) {
                    c21070i.mo4053b();
                    c23454a0 = C23454a0.f92919a;
                } else {
                    c23454a0 = null;
                }
                if (c23454a0 == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            default:
                ((C16353k) this.f9517b).m43011h();
                return;
        }
    }
}
