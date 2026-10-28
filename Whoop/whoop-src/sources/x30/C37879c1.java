package x30;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37879c1 {

    /* JADX INFO: renamed from: a */
    public final String f162194a;

    /* JADX INFO: renamed from: b */
    public final int f162195b;

    /* JADX INFO: renamed from: c */
    public final int f162196c;

    public C37879c1(String url, int i13, int i14) {
        AbstractC22676k.m65750j(url, "url");
        this.f162194a = url;
        this.f162195b = i13;
        this.f162196c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37879c1)) {
            return false;
        }
        C37879c1 c37879c1 = (C37879c1) obj;
        return AbstractC22676k.m65745e(this.f162194a, c37879c1.f162194a) && this.f162195b == c37879c1.f162195b && this.f162196c == c37879c1.f162196c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162196c) + AbstractC11266d.m30448b(this.f162195b, this.f162194a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC18489d0.m53371l(AbstractC11266d.m30467u(this.f162195b, "LinkAnnotation(url=", this.f162194a, ", start=", ", end="), this.f162196c, ")");
    }
}
