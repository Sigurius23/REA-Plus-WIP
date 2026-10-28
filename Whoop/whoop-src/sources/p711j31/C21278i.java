package p711j31;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: j31.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21278i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81263w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC21282m f81264x;

    public /* synthetic */ C21278i(AbstractC21282m abstractC21282m, int i13) {
        this.f81263w = i13;
        this.f81264x = abstractC21282m;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f81263w) {
            case 0:
                return AbstractC21277h.b.a.m59712k(this.f81264x);
            case 1:
                return AbstractC21277h.b.a.m59713l(this.f81264x);
            default:
                return Boolean.valueOf(AbstractC21282m.m59752X(this.f81264x));
        }
    }
}
