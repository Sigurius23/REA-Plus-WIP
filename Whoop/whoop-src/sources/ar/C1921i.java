package ar;

/* JADX INFO: renamed from: ar.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C1921i extends AbstractC1922j {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7600e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1925m f7601f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1921i(C1925m c1925m, int i13) {
        super(c1925m);
        this.f7600e = i13;
        this.f7601f = c1925m;
    }

    @Override // ar.AbstractC1922j
    /* JADX INFO: renamed from: a */
    public final float mo5875a() {
        float f13;
        float f14;
        switch (this.f7600e) {
            case 0:
                C1925m c1925m = this.f7601f;
                f13 = c1925m.f7624h;
                f14 = c1925m.f7625i;
                break;
            case 1:
                C1925m c1925m2 = this.f7601f;
                f13 = c1925m2.f7624h;
                f14 = c1925m2.f7626j;
                break;
            default:
                return this.f7601f.f7624h;
        }
        return f13 + f14;
    }
}
