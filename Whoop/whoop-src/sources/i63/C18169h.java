package i63;

import hc3.AbstractC17176i;
import java.util.Iterator;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39420x;

/* JADX INFO: renamed from: i63.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C18169h {

    /* JADX INFO: renamed from: a */
    public final String f70492a;

    /* JADX INFO: renamed from: b */
    public final List f70493b;

    /* JADX INFO: renamed from: c */
    public final double f70494c;

    public C18169h(String value, List params) {
        Double d3;
        Object next;
        String str;
        Double dM125914x;
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(params, "params");
        this.f70492a = value;
        this.f70493b = params;
        Iterator it = params.iterator();
        do {
            d3 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C18170i) next).f70495a, "q"));
        C18170i c18170i = (C18170i) next;
        double dDoubleValue = 1.0d;
        if (c18170i != null && (str = c18170i.f70496b) != null && (dM125914x = AbstractC39420x.m125914x(str)) != null) {
            double dDoubleValue2 = dM125914x.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d3 = dM125914x;
            }
            if (d3 != null) {
                dDoubleValue = d3.doubleValue();
            }
        }
        this.f70494c = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18169h)) {
            return false;
        }
        C18169h c18169h = (C18169h) obj;
        return AbstractC22676k.m65745e(this.f70492a, c18169h.f70492a) && AbstractC22676k.m65745e(this.f70493b, c18169h.f70493b);
    }

    public final int hashCode() {
        return this.f70493b.hashCode() + (this.f70492a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HeaderValue(value=");
        sb4.append(this.f70492a);
        sb4.append(", params=");
        return AbstractC17176i.m48506h(sb4, this.f70493b, ')');
    }
}
