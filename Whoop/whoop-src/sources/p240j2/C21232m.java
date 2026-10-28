package p240j2;

import e93.AbstractC12889b;

/* JADX INFO: renamed from: j2.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21232m implements InterfaceC21228i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81062w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21236q f81063x;

    public /* synthetic */ C21232m(C21236q c21236q, int i13) {
        this.f81062w = i13;
        this.f81063x = c21236q;
    }

    @Override // p240j2.InterfaceC21228i
    /* JADX INFO: renamed from: i */
    public final double mo56647i(double d3) {
        switch (this.f81062w) {
            case 0:
                C21236q c21236q = this.f81063x;
                return AbstractC12889b.m36282l(c21236q.f81078k.mo56647i(d3), c21236q.f81072e, c21236q.f81073f);
            default:
                C21236q c21236q2 = this.f81063x;
                return c21236q2.f81081n.mo56647i(AbstractC12889b.m36282l(d3, c21236q2.f81072e, c21236q2.f81073f));
        }
    }
}
