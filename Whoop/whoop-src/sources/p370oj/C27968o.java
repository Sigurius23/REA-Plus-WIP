package p370oj;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oj.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C27968o {

    /* JADX INFO: renamed from: a */
    public final String f112791a;

    /* JADX INFO: renamed from: b */
    public final String f112792b;

    public C27968o(String limit, String str) {
        AbstractC22676k.m65750j(limit, "limit");
        this.f112791a = limit;
        this.f112792b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27968o)) {
            return false;
        }
        C27968o c27968o = (C27968o) obj;
        return AbstractC22676k.m65745e(this.f112791a, c27968o.f112791a) && AbstractC22676k.m65745e(this.f112792b, c27968o.f112792b);
    }

    public final int hashCode() {
        int iHashCode = this.f112791a.hashCode() * 31;
        String str = this.f112792b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ReadableCooldown(limit=");
        sb4.append(this.f112791a);
        sb4.append(", message=");
        return AbstractC25012a.m73377j(sb4, this.f112792b, ')');
    }
}
