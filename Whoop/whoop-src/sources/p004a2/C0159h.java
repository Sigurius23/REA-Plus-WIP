package p004a2;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a2.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C0159h {

    /* JADX INFO: renamed from: a */
    public final int f482a;

    /* JADX INFO: renamed from: b */
    public final Integer f483b;

    public C0159h(int i13, Integer num) {
        this.f482a = i13;
        this.f483b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0159h)) {
            return false;
        }
        C0159h c0159h = (C0159h) obj;
        return this.f482a == c0159h.f482a && AbstractC22676k.m65745e(this.f483b, c0159h.f483b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f482a) * 31;
        Integer num = this.f483b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f482a + ", dataOffset=" + this.f483b + ')';
    }
}
