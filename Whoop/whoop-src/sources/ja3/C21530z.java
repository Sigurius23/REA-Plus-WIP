package ja3;

import hc3.AbstractC17176i;
import java.util.List;
import lb3.AbstractC23811y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ja3.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C21530z {

    /* JADX INFO: renamed from: a */
    public final AbstractC23811y f82573a;

    /* JADX INFO: renamed from: b */
    public final AbstractC23811y f82574b;

    /* JADX INFO: renamed from: c */
    public final List f82575c;

    /* JADX INFO: renamed from: d */
    public final List f82576d;

    /* JADX INFO: renamed from: e */
    public final boolean f82577e;

    /* JADX INFO: renamed from: f */
    public final List f82578f;

    public C21530z(AbstractC23811y abstractC23811y, AbstractC23811y abstractC23811y2, List valueParameters, List list, boolean z4, List list2) {
        AbstractC22676k.m65750j(valueParameters, "valueParameters");
        this.f82573a = abstractC23811y;
        this.f82574b = abstractC23811y2;
        this.f82575c = valueParameters;
        this.f82576d = list;
        this.f82577e = z4;
        this.f82578f = list2;
    }

    /* JADX INFO: renamed from: a */
    public final List m60521a() {
        return this.f82578f;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m60522b() {
        return this.f82577e;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC23811y m60523c() {
        return this.f82574b;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC23811y m60524d() {
        return this.f82573a;
    }

    /* JADX INFO: renamed from: e */
    public final List m60525e() {
        return this.f82576d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21530z)) {
            return false;
        }
        C21530z c21530z = (C21530z) obj;
        return AbstractC22676k.m65745e(this.f82573a, c21530z.f82573a) && AbstractC22676k.m65745e(this.f82574b, c21530z.f82574b) && AbstractC22676k.m65745e(this.f82575c, c21530z.f82575c) && AbstractC22676k.m65745e(this.f82576d, c21530z.f82576d) && this.f82577e == c21530z.f82577e && AbstractC22676k.m65745e(this.f82578f, c21530z.f82578f);
    }

    /* JADX INFO: renamed from: f */
    public final List m60526f() {
        return this.f82575c;
    }

    public final int hashCode() {
        int iHashCode = this.f82573a.hashCode() * 31;
        AbstractC23811y abstractC23811y = this.f82574b;
        return this.f82578f.hashCode() + AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (abstractC23811y == null ? 0 : abstractC23811y.hashCode())) * 31, 31, this.f82575c), 31, this.f82576d), 31, this.f82577e);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MethodSignatureData(returnType=");
        sb4.append(this.f82573a);
        sb4.append(", receiverType=");
        sb4.append(this.f82574b);
        sb4.append(", valueParameters=");
        sb4.append(this.f82575c);
        sb4.append(", typeParameters=");
        sb4.append(this.f82576d);
        sb4.append(", hasStableParameterNames=");
        sb4.append(this.f82577e);
        sb4.append(", errors=");
        return AbstractC17176i.m48506h(sb4, this.f82578f, ')');
    }
}
