package eg;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eg.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C13159h extends AbstractC13160i {

    /* JADX INFO: renamed from: a */
    public final int f45584a;

    /* JADX INFO: renamed from: b */
    public final Object f45585b;

    public C13159h(int i13, Object obj) {
        this.f45584a = i13;
        this.f45585b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13159h)) {
            return false;
        }
        C13159h c13159h = (C13159h) obj;
        return this.f45584a == c13159h.f45584a && AbstractC22676k.m65745e(this.f45585b, c13159h.f45585b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f45584a) * 31;
        Object obj = this.f45585b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Response(attempts=");
        sb4.append(this.f45584a);
        sb4.append(", response=");
        return AbstractC11478a.m30860l(sb4, this.f45585b, ')');
    }
}
