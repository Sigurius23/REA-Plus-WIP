package bi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bi.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C3279q {

    /* JADX INFO: renamed from: b */
    public static final C3279q f12804b = new C3279q(AbstractC25247g0.m74001j0(new LinkedHashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f12805a;

    public C3279q(Map map) {
        this.f12805a = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m9550a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        List list = (List) this.f12805a.get(lowerCase);
        if (list != null) {
            return (String) AbstractC25265s.m74114R0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3279q) && AbstractC22676k.m65745e(this.f12805a, ((C3279q) obj).f12805a);
    }

    public final int hashCode() {
        return this.f12805a.hashCode();
    }

    public final String toString() {
        return AbstractC30802r.m94764m(new StringBuilder("NetworkHeaders(data="), this.f12805a, ')');
    }
}
