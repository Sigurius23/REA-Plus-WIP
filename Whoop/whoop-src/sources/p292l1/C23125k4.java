package p292l1;

import p000.AbstractC11266d;
import p026b2.C2299e;
import p026b2.C2305k;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l1.k4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23125k4 {

    /* JADX INFO: renamed from: a */
    public final C2305k f91359a;

    /* JADX INFO: renamed from: b */
    public final C2305k f91360b;

    public C23125k4() {
        C2305k c2305k = C2299e.f9110M;
        this.f91359a = c2305k;
        this.f91360b = c2305k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23125k4)) {
            return false;
        }
        C23125k4 c23125k4 = (C23125k4) obj;
        return AbstractC22676k.m65745e(this.f91359a, c23125k4.f91359a) && AbstractC22676k.m65745e(this.f91360b, c23125k4.f91360b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f91360b.f9119a) + AbstractC11266d.m30447a(this.f91359a.f9119a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.f91359a + ", expandedAlignment=" + this.f91360b + ')';
    }
}
