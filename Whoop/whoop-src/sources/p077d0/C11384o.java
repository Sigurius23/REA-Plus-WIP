package p077d0;

/* JADX INFO: renamed from: d0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C11384o extends AbstractC11395r {

    /* JADX INFO: renamed from: a */
    public float f36504a;

    /* JADX INFO: renamed from: b */
    public float f36505b;

    public C11384o(float f13, float f14) {
        this.f36504a = f13;
        this.f36505b = f14;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: a */
    public final float mo30607a(int i13) {
        if (i13 == 0) {
            return this.f36504a;
        }
        if (i13 != 1) {
            return 0.0f;
        }
        return this.f36505b;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: b */
    public final int mo30608b() {
        return 2;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: c */
    public final AbstractC11395r mo30609c() {
        return new C11384o(0.0f, 0.0f);
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: d */
    public final void mo30610d() {
        this.f36504a = 0.0f;
        this.f36505b = 0.0f;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: e */
    public final void mo30611e(float f13, int i13) {
        if (i13 == 0) {
            this.f36504a = f13;
        } else {
            if (i13 != 1) {
                return;
            }
            this.f36505b = f13;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11384o)) {
            return false;
        }
        C11384o c11384o = (C11384o) obj;
        return c11384o.f36504a == this.f36504a && c11384o.f36505b == this.f36505b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36505b) + (Float.hashCode(this.f36504a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f36504a + ", v2 = " + this.f36505b;
    }
}
