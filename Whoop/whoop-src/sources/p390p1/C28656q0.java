package p390p1;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28656q0 {

    /* JADX INFO: renamed from: a */
    public final Object f115932a;

    /* JADX INFO: renamed from: b */
    public final Object f115933b;

    public C28656q0(Object obj, Object obj2) {
        this.f115932a = obj;
        this.f115933b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m87186a() {
        return this.f115932a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m87187b() {
        return this.f115933b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28656q0)) {
            return false;
        }
        C28656q0 c28656q0 = (C28656q0) obj;
        return AbstractC22676k.m65745e(this.f115932a, c28656q0.f115932a) && AbstractC22676k.m65745e(this.f115933b, c28656q0.f115933b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.f115932a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i13 = iHashCode * 31;
        Object obj2 = this.f115933b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i13;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("JoinedKey(left=");
        sb4.append(this.f115932a);
        sb4.append(", right=");
        return AbstractC11478a.m30860l(sb4, this.f115933b, ')');
    }
}
