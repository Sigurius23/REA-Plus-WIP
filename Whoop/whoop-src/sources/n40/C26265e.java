package n40;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n40.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C26265e extends AbstractC26266f {

    /* JADX INFO: renamed from: a */
    public final String f104427a;

    /* JADX INFO: renamed from: b */
    public final C26269i f104428b;

    /* JADX INFO: renamed from: c */
    public final boolean f104429c;

    public C26265e(String route, C26269i c26269i, boolean z4) {
        AbstractC22676k.m65750j(route, "route");
        this.f104427a = route;
        this.f104428b = c26269i;
        this.f104429c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26265e)) {
            return false;
        }
        C26265e c26265e = (C26265e) obj;
        return AbstractC22676k.m65745e(this.f104427a, c26265e.f104427a) && AbstractC22676k.m65745e(this.f104428b, c26265e.f104428b) && this.f104429c == c26265e.f104429c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104429c) + (((this.f104427a.hashCode() * 31) + (this.f104428b == null ? 0 : 122269371)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("NavigateTo(route=");
        sb4.append(this.f104427a);
        sb4.append(", popUpTo=");
        sb4.append(this.f104428b);
        sb4.append(", isSingleTop=");
        return AbstractC18489d0.m53372m(sb4, this.f104429c, ")");
    }
}
