package aa3;

import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C0651s {

    /* JADX INFO: renamed from: a */
    public final String f2275a;

    /* JADX INFO: renamed from: b */
    public final Map f2276b;

    public C0651s(String className, Map map) {
        AbstractC22676k.m65750j(className, "className");
        this.f2275a = className;
        this.f2276b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0651s)) {
            return false;
        }
        C0651s c0651s = (C0651s) obj;
        return AbstractC22676k.m65745e(this.f2275a, c0651s.f2275a) && AbstractC22676k.m65745e(this.f2276b, c0651s.f2276b);
    }

    public final int hashCode() {
        return this.f2276b.hashCode() + (this.f2275a.hashCode() * 31);
    }

    public final String toString() {
        return "@" + this.f2275a + '(' + AbstractC25265s.m74110N0(AbstractC25247g0.m73999h0(this.f2276b), null, null, null, C0649r.f2274w, 31) + ')';
    }
}
