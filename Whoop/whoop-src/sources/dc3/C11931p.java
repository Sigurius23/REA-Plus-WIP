package dc3;

import bc3.InterfaceC3044o2;
import hc3.AbstractC17189v;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: dc3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C11931p extends AbstractC17189v {

    /* JADX INFO: renamed from: E */
    public final C11923h f39033E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AtomicReferenceArray f39034F;

    public C11931p(long j7, C11931p c11931p, C11923h c11923h, int i13) {
        super(j7, c11931p, i13);
        this.f39033E = c11923h;
        this.f39034F = new AtomicReferenceArray(AbstractC11925j.f39009b * 2);
    }

    @Override // hc3.AbstractC17189v
    /* JADX INFO: renamed from: g */
    public final int mo32227g() {
        return AbstractC11925j.f39009b;
    }

    @Override // hc3.AbstractC17189v
    /* JADX INFO: renamed from: h */
    public final void mo32228h(int i13, InterfaceC30063j interfaceC30063j) {
        C11923h c11923h;
        int i14 = AbstractC11925j.f39009b;
        boolean z4 = i13 >= i14;
        if (z4) {
            i13 -= i14;
        }
        this.f39034F.get(i13 * 2);
        while (true) {
            Object objM32230l = m32230l(i13);
            boolean z13 = objM32230l instanceof InterfaceC3044o2;
            c11923h = this.f39033E;
            if (z13 || (objM32230l instanceof C11940y)) {
                if (m32229k(i13, objM32230l, z4 ? AbstractC11925j.f39017j : AbstractC11925j.f39018k)) {
                    m32232n(i13, null);
                    m32231m(i13, !z4);
                    if (z4) {
                        AbstractC22676k.m65747g(c11923h);
                        return;
                    }
                    return;
                }
            } else {
                if (objM32230l == AbstractC11925j.f39017j || objM32230l == AbstractC11925j.f39018k) {
                    break;
                }
                if (objM32230l != AbstractC11925j.f39014g && objM32230l != AbstractC11925j.f39013f) {
                    if (objM32230l == AbstractC11925j.f39016i || objM32230l == AbstractC11925j.f39011d || objM32230l == AbstractC11925j.f39019l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM32230l).toString());
                }
            }
        }
        m32232n(i13, null);
        if (z4) {
            AbstractC22676k.m65747g(c11923h);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m32229k(int i13, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i14 = (i13 * 2) + 1;
        do {
            atomicReferenceArray = this.f39034F;
            if (atomicReferenceArray.compareAndSet(i14, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i14) == obj);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final Object m32230l(int i13) {
        return this.f39034F.get((i13 * 2) + 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m32231m(int i13, boolean z4) {
        if (z4) {
            C11923h c11923h = this.f39033E;
            AbstractC22676k.m65747g(c11923h);
            c11923h.m32202J((this.f66007y * ((long) AbstractC11925j.f39009b)) + ((long) i13));
        }
        m48543i();
    }

    /* JADX INFO: renamed from: n */
    public final void m32232n(int i13, Object obj) {
        this.f39034F.set(i13 * 2, obj);
    }

    /* JADX INFO: renamed from: o */
    public final void m32233o(int i13, Object obj) {
        this.f39034F.set((i13 * 2) + 1, obj);
    }
}
