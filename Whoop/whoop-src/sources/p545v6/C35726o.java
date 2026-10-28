package p545v6;

import hc3.AbstractC17176i;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p127ev.AbstractC13673n;
import p636y3.C39174f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v6.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C35726o {

    /* JADX INFO: renamed from: a */
    public final float f151972a;

    /* JADX INFO: renamed from: b */
    public final List f151973b;

    static {
        new C35726o(0.0f, 3);
    }

    public C35726o(float f13, List list) {
        this.f151972a = f13;
        this.f151973b = list;
    }

    /* JADX INFO: renamed from: a */
    public final C35726o m113189a(C35726o c35726o) {
        return new C35726o(this.f151972a + c35726o.f151972a, AbstractC25265s.m74129g1(this.f151973b, c35726o.f151973b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35726o)) {
            return false;
        }
        C35726o c35726o = (C35726o) obj;
        return C39174f.m124782b(this.f151972a, c35726o.f151972a) && AbstractC22676k.m65745e(this.f151973b, c35726o.f151973b);
    }

    public final int hashCode() {
        return this.f151973b.hashCode() + (Float.hashCode(this.f151972a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PaddingDimension(dp=");
        AbstractC13673n.m38572s(this.f151972a, ", resourceIds=", sb4);
        return AbstractC17176i.m48506h(sb4, this.f151973b, ')');
    }

    public C35726o(float f13, int i13) {
        this((i13 & 1) != 0 ? 0 : f13, C25271y.f99162w);
    }
}
