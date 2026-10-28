package kg;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kg.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C22451e extends AbstractC22452f {

    /* JADX INFO: renamed from: a */
    public final int f87885a;

    /* JADX INFO: renamed from: b */
    public final String f87886b;

    public C22451e(int i13, String str) {
        this.f87885a = i13;
        this.f87886b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22451e)) {
            return false;
        }
        C22451e c22451e = (C22451e) obj;
        return this.f87885a == c22451e.f87885a && AbstractC22676k.m65745e(this.f87886b, c22451e.f87886b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f87885a) * 31;
        String str = this.f87886b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f87886b);
        sb4.append(" (");
        return AbstractC11895b.m31999r(sb4, this.f87885a, ')');
    }
}
