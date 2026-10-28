package i63;

import java.util.Locale;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: i63.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C18170i {

    /* JADX INFO: renamed from: a */
    public final String f70495a;

    /* JADX INFO: renamed from: b */
    public final String f70496b;

    public C18170i(String name, String value) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        this.f70495a = name;
        this.f70496b = value;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18170i)) {
            return false;
        }
        C18170i c18170i = (C18170i) obj;
        return AbstractC39421y.m125921F(c18170i.f70495a, this.f70495a, true) && AbstractC39421y.m125921F(c18170i.f70496b, this.f70496b, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f70495a.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f70496b.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HeaderValueParam(name=");
        sb4.append(this.f70495a);
        sb4.append(", value=");
        return AbstractC25012a.m73376i(this.f70496b, ", escapeValue=false)", sb4);
    }
}
