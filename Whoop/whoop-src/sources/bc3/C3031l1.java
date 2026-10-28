package bc3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;

/* JADX INFO: renamed from: bc3.l1 */
/* JADX INFO: loaded from: classes5.dex */
public class C3031l1 extends C3060t1 implements InterfaceC3061u {

    /* JADX INFO: renamed from: y */
    public final boolean f12049y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3031l1(InterfaceC3027k1 interfaceC3027k1) {
        super(true);
        boolean z4 = true;
        m8804H(interfaceC3027k1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3060t1.f12092x;
        InterfaceC3045p interfaceC3045p = (InterfaceC3045p) atomicReferenceFieldUpdater.get(this);
        C3049q c3049q = interfaceC3045p instanceof C3049q ? (C3049q) interfaceC3045p : null;
        if (c3049q == null) {
            z4 = false;
            break;
        }
        C3060t1 c3060t1M8786h = c3049q.m8786h();
        while (!c3060t1M8786h.mo8752C()) {
            InterfaceC3045p interfaceC3045p2 = (InterfaceC3045p) atomicReferenceFieldUpdater.get(c3060t1M8786h);
            C3049q c3049q2 = interfaceC3045p2 instanceof C3049q ? (C3049q) interfaceC3045p2 : null;
            if (c3049q2 == null) {
                z4 = false;
                break;
            }
            c3060t1M8786h = c3049q2.m8786h();
        }
        this.f12049y = z4;
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: C */
    public final boolean mo8752C() {
        return this.f12049y;
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: D */
    public final boolean mo8753D() {
        return true;
    }

    @Override // bc3.InterfaceC3061u
    public final boolean complete() {
        return m8807L(C23454a0.f92919a);
    }

    @Override // bc3.InterfaceC3061u
    public final boolean completeExceptionally(Throwable th3) {
        return m8807L(new C3067w(th3, false));
    }
}
