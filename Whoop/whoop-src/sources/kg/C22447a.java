package kg;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kg.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22447a extends AbstractC22452f {

    /* JADX INFO: renamed from: a */
    public final int f87875a;

    /* JADX INFO: renamed from: b */
    public final C22450d f87876b;

    /* JADX INFO: renamed from: c */
    public final Map f87877c;

    /* JADX INFO: renamed from: d */
    public final List f87878d;

    public C22447a(int i13, C22450d c22450d, Map map, List list) {
        this.f87875a = i13;
        this.f87876b = c22450d;
        this.f87877c = map;
        this.f87878d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22447a)) {
            return false;
        }
        C22447a c22447a = (C22447a) obj;
        return this.f87875a == c22447a.f87875a && AbstractC22676k.m65745e(this.f87876b, c22447a.f87876b) && AbstractC22676k.m65745e(this.f87877c, c22447a.f87877c) && AbstractC22676k.m65745e(this.f87878d, c22447a.f87878d);
    }

    public final int hashCode() {
        return this.f87878d.hashCode() + AbstractC3855a.m11821e(this.f87877c, (this.f87876b.hashCode() + (Integer.hashCode(this.f87875a) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("<");
        sb4.append(this.f87876b);
        sb4.append(" (");
        return AbstractC18489d0.m53371l(sb4, this.f87875a, ")>");
    }
}
