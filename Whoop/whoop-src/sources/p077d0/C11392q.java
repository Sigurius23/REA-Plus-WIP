package p077d0;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: d0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C11392q extends AbstractC11395r {

    /* JADX INFO: renamed from: a */
    public float f36530a;

    /* JADX INFO: renamed from: b */
    public float f36531b;

    /* JADX INFO: renamed from: c */
    public float f36532c;

    /* JADX INFO: renamed from: d */
    public float f36533d;

    public C11392q(float f13, float f14, float f15, float f16) {
        this.f36530a = f13;
        this.f36531b = f14;
        this.f36532c = f15;
        this.f36533d = f16;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: a */
    public final float mo30607a(int i13) {
        if (i13 == 0) {
            return this.f36530a;
        }
        if (i13 == 1) {
            return this.f36531b;
        }
        if (i13 == 2) {
            return this.f36532c;
        }
        if (i13 != 3) {
            return 0.0f;
        }
        return this.f36533d;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: b */
    public final int mo30608b() {
        return 4;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: c */
    public final AbstractC11395r mo30609c() {
        return new C11392q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: d */
    public final void mo30610d() {
        this.f36530a = 0.0f;
        this.f36531b = 0.0f;
        this.f36532c = 0.0f;
        this.f36533d = 0.0f;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: e */
    public final void mo30611e(float f13, int i13) {
        if (i13 == 0) {
            this.f36530a = f13;
            return;
        }
        if (i13 == 1) {
            this.f36531b = f13;
        } else if (i13 == 2) {
            this.f36532c = f13;
        } else {
            if (i13 != 3) {
                return;
            }
            this.f36533d = f13;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11392q)) {
            return false;
        }
        C11392q c11392q = (C11392q) obj;
        return c11392q.f36530a == this.f36530a && c11392q.f36531b == this.f36531b && c11392q.f36532c == this.f36532c && c11392q.f36533d == this.f36533d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36533d) + AbstractC11266d.m30447a(this.f36532c, AbstractC11266d.m30447a(this.f36531b, Float.hashCode(this.f36530a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f36530a + ", v2 = " + this.f36531b + ", v3 = " + this.f36532c + ", v4 = " + this.f36533d;
    }
}
