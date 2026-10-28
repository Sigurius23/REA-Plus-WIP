package kg;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kg.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C22449c {

    /* JADX INFO: renamed from: a */
    public final String f87881a;

    /* JADX INFO: renamed from: b */
    public final String f87882b;

    public C22449c(String uri, String str) {
        AbstractC22676k.m65750j(uri, "uri");
        this.f87881a = uri;
        this.f87882b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22449c)) {
            return false;
        }
        C22449c c22449c = (C22449c) obj;
        return AbstractC22676k.m65745e(this.f87881a, c22449c.f87881a) && AbstractC22676k.m65745e(this.f87882b, c22449c.f87882b);
    }

    public final int hashCode() {
        int iHashCode = this.f87881a.hashCode() * 31;
        String str = this.f87882b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Namespace(uri=");
        sb4.append(this.f87881a);
        sb4.append(", prefix=");
        return AbstractC25012a.m73377j(sb4, this.f87882b, ')');
    }
}
