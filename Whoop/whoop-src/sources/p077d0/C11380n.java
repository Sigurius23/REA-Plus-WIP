package p077d0;

/* JADX INFO: renamed from: d0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C11380n extends AbstractC11395r {

    /* JADX INFO: renamed from: a */
    public float f36483a;

    public C11380n(float f13) {
        this.f36483a = f13;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: a */
    public final float mo30607a(int i13) {
        if (i13 == 0) {
            return this.f36483a;
        }
        return 0.0f;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: b */
    public final int mo30608b() {
        return 1;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: c */
    public final AbstractC11395r mo30609c() {
        return new C11380n(0.0f);
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: d */
    public final void mo30610d() {
        this.f36483a = 0.0f;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: e */
    public final void mo30611e(float f13, int i13) {
        if (i13 == 0) {
            this.f36483a = f13;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11380n) && ((C11380n) obj).f36483a == this.f36483a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36483a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f36483a;
    }
}
