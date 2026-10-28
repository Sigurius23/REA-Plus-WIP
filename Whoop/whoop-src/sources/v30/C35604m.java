package v30;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v30.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C35604m {

    /* JADX INFO: renamed from: a */
    public final String f151375a;

    /* JADX INFO: renamed from: b */
    public final Integer f151376b;

    /* JADX INFO: renamed from: c */
    public final Integer f151377c;

    public C35604m(Integer num, Integer num2, String str) {
        this.f151375a = str;
        this.f151376b = num;
        this.f151377c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35604m)) {
            return false;
        }
        C35604m c35604m = (C35604m) obj;
        return AbstractC22676k.m65745e(this.f151375a, c35604m.f151375a) && AbstractC22676k.m65745e(this.f151376b, c35604m.f151376b) && AbstractC22676k.m65745e(this.f151377c, c35604m.f151377c);
    }

    public final int hashCode() {
        int iHashCode = this.f151375a.hashCode() * 31;
        Integer num = this.f151376b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f151377c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ScannedCard(pan=");
        sb4.append(this.f151375a);
        sb4.append(", expirationMonth=");
        sb4.append(this.f151376b);
        sb4.append(", expirationYear=");
        return AbstractC11478a.m30859k(sb4, this.f151377c, ")");
    }
}
