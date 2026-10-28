package p389p0;

import e93.AbstractC12889b;
import i93.C18284j;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: p0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28521f0 implements InterfaceC28670t2 {

    /* JADX INFO: renamed from: w */
    public final int f115419w;

    /* JADX INFO: renamed from: x */
    public final int f115420x;

    /* JADX INFO: renamed from: y */
    public final C28633k1 f115421y;

    /* JADX INFO: renamed from: z */
    public int f115422z;

    public C28521f0(int i13, int i14, int i15) {
        this.f115419w = i14;
        this.f115420x = i15;
        int i16 = (i13 / i14) * i14;
        this.f115421y = new C28633k1(AbstractC12889b.m36278i0(Math.max(i16 - i15, 0), i16 + i14 + i15), C28676v0.f115974F);
        this.f115422z = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m86825a(int i13) {
        if (i13 != this.f115422z) {
            this.f115422z = i13;
            int i14 = this.f115419w;
            int i15 = (i13 / i14) * i14;
            int i16 = this.f115420x;
            this.f115421y.setValue(AbstractC12889b.m36278i0(Math.max(i15 - i16, 0), i15 + i14 + i16));
        }
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return (C18284j) this.f115421y.getValue();
    }
}
