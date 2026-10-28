package ge;

import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ge.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15716a {

    /* JADX INFO: renamed from: a */
    public final String f59214a;

    /* JADX INFO: renamed from: b */
    public final String f59215b;

    public C15716a(String str, String str2) {
        this.f59214a = str;
        this.f59215b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15716a)) {
            return false;
        }
        C15716a c15716a = (C15716a) obj;
        return AbstractC22676k.m65745e(this.f59214a, c15716a.f59214a) && AbstractC22676k.m65745e(this.f59215b, c15716a.f59215b);
    }

    public final int hashCode() {
        return this.f59215b.hashCode() + (this.f59214a.hashCode() * 31);
    }

    public final String toString() {
        String lowerCase = AbstractC39421y.m125926K(this.f59214a, " ", "-", false).toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return AbstractC15719d.m44301b("api", lowerCase, this.f59215b);
    }
}
