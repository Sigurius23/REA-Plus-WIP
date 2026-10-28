package p077d0;

import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: d0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11365j0 implements InterfaceC28670t2 {

    /* JADX INFO: renamed from: E */
    public C11390p1 f36425E;

    /* JADX INFO: renamed from: F */
    public boolean f36426F;

    /* JADX INFO: renamed from: G */
    public boolean f36427G;

    /* JADX INFO: renamed from: H */
    public long f36428H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C11373l0 f36429I;

    /* JADX INFO: renamed from: w */
    public Number f36430w;

    /* JADX INFO: renamed from: x */
    public Number f36431x;

    /* JADX INFO: renamed from: y */
    public final C11351f2 f36432y;

    /* JADX INFO: renamed from: z */
    public final C28633k1 f36433z;

    public C11365j0(C11373l0 c11373l0, Number number, Number number2, C11351f2 c11351f2, C11361i0 c11361i0) {
        this.f36429I = c11373l0;
        this.f36430w = number;
        this.f36431x = number2;
        this.f36432y = c11351f2;
        this.f36433z = AbstractC28683x.m87272z(number);
        this.f36425E = new C11390p1(c11361i0, c11351f2, this.f36430w, this.f36431x, null);
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return this.f36433z.getValue();
    }
}
