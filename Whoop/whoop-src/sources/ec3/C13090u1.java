package ec3;

import bc3.C3033m;
import bc3.InterfaceC3056s0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ec3.u1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13090u1 implements InterfaceC3056s0 {

    /* JADX INFO: renamed from: w */
    public final C13096w1 f45227w;

    /* JADX INFO: renamed from: x */
    public final long f45228x;

    /* JADX INFO: renamed from: y */
    public final Object f45229y;

    /* JADX INFO: renamed from: z */
    public final C3033m f45230z;

    public C13090u1(C13096w1 c13096w1, long j7, Object obj, C3033m c3033m) {
        this.f45227w = c13096w1;
        this.f45228x = j7;
        this.f45229y = obj;
        this.f45230z = c3033m;
    }

    @Override // bc3.InterfaceC3056s0
    public final void dispose() {
        C13096w1 c13096w1 = this.f45227w;
        synchronized (c13096w1) {
            if (this.f45228x < c13096w1.m36623o()) {
                return;
            }
            Object[] objArr = c13096w1.f45253H;
            AbstractC22676k.m65747g(objArr);
            long j7 = this.f45228x;
            if (objArr[((int) j7) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC13091v.m36596f(objArr, j7, AbstractC13091v.f45233c);
            c13096w1.m36619j();
        }
    }
}
