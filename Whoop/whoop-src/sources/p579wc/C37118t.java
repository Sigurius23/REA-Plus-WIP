package p579wc;

import p319m4.AbstractC25012a;
import p463rj.AbstractC31479j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wc.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C37118t extends AbstractC31479j {

    /* JADX INFO: renamed from: c */
    public final String f158796c;

    /* JADX INFO: renamed from: d */
    public final String f158797d;

    public C37118t(String str, String str2) {
        this.f158796c = str;
        this.f158797d = str2;
    }

    /* JADX INFO: renamed from: B */
    public final String m119033B() {
        return this.f158796c;
    }

    /* JADX INFO: renamed from: C */
    public final String m119034C() {
        return this.f158797d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37118t)) {
            return false;
        }
        C37118t c37118t = (C37118t) obj;
        return AbstractC22676k.m65745e(this.f158796c, c37118t.f158796c) && AbstractC22676k.m65745e(this.f158797d, c37118t.f158797d);
    }

    public final int hashCode() {
        String str = this.f158796c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f158797d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Error(code=");
        sb4.append(this.f158796c);
        sb4.append(", message=");
        return AbstractC25012a.m73377j(sb4, this.f158797d, ')');
    }
}
