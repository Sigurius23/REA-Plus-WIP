package r20;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C30864b {

    /* JADX INFO: renamed from: a */
    public final boolean f127259a;

    /* JADX INFO: renamed from: b */
    public final C30863a f127260b;

    public C30864b(boolean z4, C30863a c30863a) {
        this.f127259a = z4;
        this.f127260b = c30863a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30864b)) {
            return false;
        }
        C30864b c30864b = (C30864b) obj;
        return this.f127259a == c30864b.f127259a && AbstractC22676k.m65745e(this.f127260b, c30864b.f127260b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f127259a) * 31;
        C30863a c30863a = this.f127260b;
        return iHashCode + (c30863a == null ? 0 : c30863a.hashCode());
    }

    public final String toString() {
        return "BuyButtonState(visible=" + this.f127259a + ", buyButtonOverride=" + this.f127260b + ")";
    }
}
