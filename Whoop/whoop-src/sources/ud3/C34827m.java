package ud3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ud3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C34827m {

    /* JADX INFO: renamed from: a */
    public final String f146675a;

    /* JADX INFO: renamed from: b */
    public final Map f146676b;

    public C34827m(String str, Map map) {
        String strM95641q;
        this.f146675a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale locale = Locale.US;
                strM95641q = AbstractC31061c.m95641q(locale, "US", str2, locale, "toLowerCase(...)");
            } else {
                strM95641q = null;
            }
            linkedHashMap.put(strM95641q, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC22676k.m65749i(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f146676b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34827m)) {
            return false;
        }
        C34827m c34827m = (C34827m) obj;
        return AbstractC22676k.m65745e(c34827m.f146675a, this.f146675a) && AbstractC22676k.m65745e(c34827m.f146676b, this.f146676b);
    }

    public final int hashCode() {
        return this.f146676b.hashCode() + AbstractC11266d.m30450d(899, 31, this.f146675a);
    }

    public final String toString() {
        return this.f146675a + " authParams=" + this.f146676b;
    }
}
