package m83;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m83.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C25239c0 {

    /* JADX INFO: renamed from: a */
    public final int f99117a;

    /* JADX INFO: renamed from: b */
    public final Object f99118b;

    public C25239c0(int i13, Object obj) {
        this.f99117a = i13;
        this.f99118b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25239c0)) {
            return false;
        }
        C25239c0 c25239c0 = (C25239c0) obj;
        return this.f99117a == c25239c0.f99117a && AbstractC22676k.m65745e(this.f99118b, c25239c0.f99118b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f99117a) * 31;
        Object obj = this.f99118b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("IndexedValue(index=");
        sb4.append(this.f99117a);
        sb4.append(", value=");
        return AbstractC11478a.m30860l(sb4, this.f99118b, ')');
    }
}
