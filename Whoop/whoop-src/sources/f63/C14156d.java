package f63;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;
import s63.C32236a;

/* JADX INFO: renamed from: f63.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C14156d {

    /* JADX INFO: renamed from: a */
    public final C32236a f51005a;

    /* JADX INFO: renamed from: b */
    public final Object f51006b;

    public C14156d(C32236a expectedType, Object response) {
        AbstractC22676k.m65750j(expectedType, "expectedType");
        AbstractC22676k.m65750j(response, "response");
        this.f51005a = expectedType;
        this.f51006b = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14156d)) {
            return false;
        }
        C14156d c14156d = (C14156d) obj;
        return AbstractC22676k.m65745e(this.f51005a, c14156d.f51005a) && AbstractC22676k.m65745e(this.f51006b, c14156d.f51006b);
    }

    public final int hashCode() {
        return this.f51006b.hashCode() + (this.f51005a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HttpResponseContainer(expectedType=");
        sb4.append(this.f51005a);
        sb4.append(", response=");
        return AbstractC11478a.m30860l(sb4, this.f51006b, ')');
    }
}
