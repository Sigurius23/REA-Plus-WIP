package p027b3;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.c3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2360c3 {

    /* JADX INFO: renamed from: a */
    public final String f9320a;

    /* JADX INFO: renamed from: b */
    public final Object f9321b;

    public C2360c3(String str, Object obj) {
        this.f9320a = str;
        this.f9321b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2360c3)) {
            return false;
        }
        C2360c3 c2360c3 = (C2360c3) obj;
        return AbstractC22676k.m65745e(this.f9320a, c2360c3.f9320a) && AbstractC22676k.m65745e(this.f9321b, c2360c3.f9321b);
    }

    public final int hashCode() {
        int iHashCode = this.f9320a.hashCode() * 31;
        Object obj = this.f9321b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ValueElement(name=");
        sb4.append(this.f9320a);
        sb4.append(", value=");
        return AbstractC11478a.m30860l(sb4, this.f9321b, ')');
    }
}
