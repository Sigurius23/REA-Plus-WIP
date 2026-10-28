package p461rh;

import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: rh.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C31420i {

    /* JADX INFO: renamed from: b */
    public static final C31420i f129286b = new C31420i(AbstractC37978j.m121638W(new LinkedHashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f129287a;

    public C31420i(Map map) {
        this.f129287a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31420i) && AbstractC22676k.m65745e(this.f129287a, ((C31420i) obj).f129287a);
    }

    public final int hashCode() {
        return this.f129287a.hashCode();
    }

    public final String toString() {
        return AbstractC30802r.m94764m(new StringBuilder("Extras(data="), this.f129287a, ')');
    }
}
