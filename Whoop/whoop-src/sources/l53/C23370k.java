package l53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l53.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C23370k {

    /* JADX INFO: renamed from: a */
    public final String f92645a;

    /* JADX INFO: renamed from: b */
    public final String f92646b;

    /* JADX INFO: renamed from: c */
    public final Object f92647c;

    /* JADX INFO: renamed from: d */
    public final long f92648d;

    public C23370k(String tag, String str, Object obj, long j7) {
        AbstractC22676k.m65750j(tag, "tag");
        this.f92645a = tag;
        this.f92646b = str;
        this.f92647c = obj;
        this.f92648d = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23370k)) {
            return false;
        }
        C23370k c23370k = (C23370k) obj;
        return AbstractC22676k.m65745e(this.f92645a, c23370k.f92645a) && AbstractC22676k.m65745e(this.f92646b, c23370k.f92646b) && AbstractC22676k.m65745e(this.f92647c, c23370k.f92647c) && this.f92648d == c23370k.f92648d;
    }

    public final int hashCode() {
        int iHashCode = this.f92645a.hashCode() * 31;
        String str = this.f92646b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.f92647c;
        return Long.hashCode(this.f92648d) + ((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TraceRecord(tag=", this.f92645a, ", id=", this.f92646b, ", data=");
        sbM32001t.append(this.f92647c);
        sbM32001t.append(", timestamp=");
        sbM32001t.append(this.f92648d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
