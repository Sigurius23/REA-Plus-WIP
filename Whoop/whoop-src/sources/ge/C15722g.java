package ge;

import java.util.Map;
import l83.C23461g;
import p048ce.AbstractC4482w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge.g */
/* JADX INFO: loaded from: classes.dex */
public final class C15722g {

    /* JADX INFO: renamed from: a */
    public final String f59230a;

    /* JADX INFO: renamed from: b */
    public final Map f59231b;

    public C15722g(Map extras) {
        String version = C23461g.f92929z.toString();
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(extras, "extras");
        this.f59230a = version;
        this.f59231b = extras;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15722g)) {
            return false;
        }
        C15722g c15722g = (C15722g) obj;
        return AbstractC22676k.m65745e(this.f59230a, c15722g.f59230a) && AbstractC22676k.m65745e(this.f59231b, c15722g.f59231b);
    }

    public final int hashCode() {
        return this.f59231b.hashCode() + (this.f59230a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AbstractC15719d.m44301b("lang", "kotlin", this.f59230a));
        Map map = this.f59231b;
        if (!map.isEmpty()) {
            AbstractC4482w.m13967C(map);
            sb4.append(" " + ((Object) AbstractC4482w.m13996i0(map)));
        }
        return sb4.toString();
    }
}
