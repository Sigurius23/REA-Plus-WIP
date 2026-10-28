package kg;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kg.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C22450d {

    /* JADX INFO: renamed from: a */
    public final String f87883a;

    /* JADX INFO: renamed from: b */
    public final String f87884b;

    public C22450d(String local, String str) {
        AbstractC22676k.m65750j(local, "local");
        this.f87883a = local;
        this.f87884b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22450d)) {
            return false;
        }
        C22450d c22450d = (C22450d) obj;
        return AbstractC22676k.m65745e(this.f87883a, c22450d.f87883a) && AbstractC22676k.m65745e(this.f87884b, c22450d.f87884b);
    }

    public final int hashCode() {
        int iHashCode = this.f87883a.hashCode() * 31;
        String str = this.f87884b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.f87883a;
        String str2 = this.f87884b;
        if (str2 == null) {
            return str;
        }
        return str2 + ':' + str;
    }
}
