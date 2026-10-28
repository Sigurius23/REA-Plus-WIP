package p077d0;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: d0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C11388p extends AbstractC11395r {

    /* JADX INFO: renamed from: a */
    public float f36516a;

    /* JADX INFO: renamed from: b */
    public float f36517b;

    /* JADX INFO: renamed from: c */
    public float f36518c;

    public C11388p(float f13, float f14, float f15) {
        this.f36516a = f13;
        this.f36517b = f14;
        this.f36518c = f15;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: a */
    public final float mo30607a(int i13) {
        if (i13 == 0) {
            return this.f36516a;
        }
        if (i13 == 1) {
            return this.f36517b;
        }
        if (i13 != 2) {
            return 0.0f;
        }
        return this.f36518c;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: b */
    public final int mo30608b() {
        return 3;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: c */
    public final AbstractC11395r mo30609c() {
        return new C11388p(0.0f, 0.0f, 0.0f);
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: d */
    public final void mo30610d() {
        this.f36516a = 0.0f;
        this.f36517b = 0.0f;
        this.f36518c = 0.0f;
    }

    @Override // p077d0.AbstractC11395r
    /* JADX INFO: renamed from: e */
    public final void mo30611e(float f13, int i13) {
        if (i13 == 0) {
            this.f36516a = f13;
        } else if (i13 == 1) {
            this.f36517b = f13;
        } else {
            if (i13 != 2) {
                return;
            }
            this.f36518c = f13;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11388p)) {
            return false;
        }
        C11388p c11388p = (C11388p) obj;
        return c11388p.f36516a == this.f36516a && c11388p.f36517b == this.f36517b && c11388p.f36518c == this.f36518c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36518c) + AbstractC11266d.m30447a(this.f36517b, Float.hashCode(this.f36516a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f36516a + ", v2 = " + this.f36517b + ", v3 = " + this.f36518c;
    }
}
