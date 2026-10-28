package d40;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: d40.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C11670o {

    /* JADX INFO: renamed from: a */
    public final float f37677a;

    /* JADX INFO: renamed from: b */
    public final float f37678b;

    /* JADX INFO: renamed from: c */
    public final float f37679c;

    public C11670o(float f13, float f14, float f15) {
        this.f37677a = f13;
        this.f37678b = f14;
        this.f37679c = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11670o)) {
            return false;
        }
        C11670o c11670o = (C11670o) obj;
        return Float.compare(this.f37677a, c11670o.f37677a) == 0 && Float.compare(this.f37678b, c11670o.f37678b) == 0 && Float.compare(this.f37679c, c11670o.f37679c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37679c) + AbstractC11266d.m30447a(this.f37678b, Float.hashCode(this.f37677a) * 31, 31);
    }

    public final String toString() {
        return AbstractC30007c.m91837g(this.f37679c, ")", AbstractC2875y.m8307t("StripeShapes(cornerRadius=", this.f37677a, ", bottomSheetCornerRadius=", this.f37678b, ", borderStrokeWidth="));
    }
}
