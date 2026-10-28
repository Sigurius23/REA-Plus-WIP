package p420qc;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.d */
/* JADX INFO: loaded from: classes.dex */
public final class C30194d {

    /* JADX INFO: renamed from: a */
    public final String f123590a;

    /* JADX INFO: renamed from: b */
    public final Long f123591b;

    public C30194d(String str, Long l7) {
        this.f123590a = str;
        this.f123591b = l7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30194d)) {
            return false;
        }
        C30194d c30194d = (C30194d) obj;
        return AbstractC22676k.m65745e(this.f123590a, c30194d.f123590a) && AbstractC22676k.m65745e(this.f123591b, c30194d.f123591b);
    }

    public final int hashCode() {
        int iHashCode = this.f123590a.hashCode() * 31;
        Long l7 = this.f123591b;
        return iHashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f123590a + ", value=" + this.f123591b + ')';
    }
}
