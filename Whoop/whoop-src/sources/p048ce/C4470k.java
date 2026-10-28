package p048ce;

import c13.AbstractC3855a;
import java.util.Map;
import p088dc.AbstractC11895b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C4470k {

    /* JADX INFO: renamed from: a */
    public final String f17994a;

    /* JADX INFO: renamed from: b */
    public final Map f17995b;

    /* JADX INFO: renamed from: c */
    public final EnumC4471l f17996c;

    public C4470k(String name, Map properties, EnumC4471l sectionType) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(properties, "properties");
        AbstractC22676k.m65750j(sectionType, "sectionType");
        this.f17994a = name;
        this.f17995b = properties;
        this.f17996c = sectionType;
    }

    /* JADX INFO: renamed from: a */
    public final String m13963a(String str, String str2) {
        AbstractC4466g abstractC4466g = (AbstractC4466g) this.f17995b.get(str);
        if (abstractC4466g == null) {
            return null;
        }
        if (abstractC4466g instanceof C4465f) {
            if (str2 == null) {
                return ((C4465f) abstractC4466g).f17987w;
            }
            throw new IllegalArgumentException(AbstractC11895b.m31996o("property '", str, "' is a string, but caller specified a sub-key").toString());
        }
        if (!(abstractC4466g instanceof C4464e)) {
            throw new NoWhenBranchMatchedException();
        }
        if (str2 != null) {
            return (String) ((C4464e) abstractC4466g).get(str2);
        }
        throw new IllegalArgumentException(AbstractC11895b.m31996o("property '", str, "' has sub-properties, caller must specify a sub-key").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4470k)) {
            return false;
        }
        C4470k c4470k = (C4470k) obj;
        return AbstractC22676k.m65745e(this.f17994a, c4470k.f17994a) && AbstractC22676k.m65745e(this.f17995b, c4470k.f17995b) && this.f17996c == c4470k.f17996c;
    }

    public final int hashCode() {
        return this.f17996c.hashCode() + AbstractC3855a.m11821e(this.f17995b, this.f17994a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ConfigSection(name=" + this.f17994a + ", properties=" + this.f17995b + ", sectionType=" + this.f17996c + ')';
    }
}
