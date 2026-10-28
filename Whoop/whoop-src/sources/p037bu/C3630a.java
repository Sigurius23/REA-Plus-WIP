package p037bu;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: bu.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3630a {

    /* JADX INFO: renamed from: a */
    public final String f14782a;

    /* JADX INFO: renamed from: b */
    public final String f14783b;

    public C3630a(String str, String str2) {
        this.f14782a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f14783b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3630a) {
            C3630a c3630a = (C3630a) obj;
            if (this.f14782a.equals(c3630a.f14782a) && this.f14783b.equals(c3630a.f14783b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14782a.hashCode() ^ 1000003) * 1000003) ^ this.f14783b.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LibraryVersion{libraryName=");
        sb4.append(this.f14782a);
        sb4.append(", version=");
        return AbstractC25012a.m73376i(this.f14783b, "}", sb4);
    }
}
