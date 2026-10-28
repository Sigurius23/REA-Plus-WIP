package d40;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: d40.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C11665j {

    /* JADX INFO: renamed from: a */
    public final float f37656a;

    /* JADX INFO: renamed from: b */
    public final float f37657b;

    /* JADX INFO: renamed from: c */
    public final float f37658c;

    public C11665j(float f13, float f14, float f15) {
        this.f37656a = f13;
        this.f37657b = f14;
        this.f37658c = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11665j)) {
            return false;
        }
        C11665j c11665j = (C11665j) obj;
        return Float.compare(this.f37656a, c11665j.f37656a) == 0 && Float.compare(this.f37657b, c11665j.f37657b) == 0 && Float.compare(this.f37658c, c11665j.f37658c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37658c) + AbstractC11266d.m30447a(this.f37657b, Float.hashCode(this.f37656a) * 31, 31);
    }

    public final String toString() {
        return AbstractC30007c.m91837g(this.f37658c, ")", AbstractC2875y.m8307t("PrimaryButtonShape(cornerRadius=", this.f37656a, ", borderStrokeWidth=", this.f37657b, ", height="));
    }
}
