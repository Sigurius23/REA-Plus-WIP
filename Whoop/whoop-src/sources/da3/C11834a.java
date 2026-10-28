package da3;

import p715kotlin.jvm.internal.AbstractC22676k;
import sa3.C32331e;

/* JADX INFO: renamed from: da3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11834a implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f38572w;

    /* JADX INFO: renamed from: x */
    public final int f38573x;

    /* JADX INFO: renamed from: y */
    public final int f38574y;

    static {
        new C11834a(C32331e.f133827g.f133779a);
        new C11834a(C32331e.f133828h.f133779a);
    }

    public C11834a(int i13, int i14, int i15) {
        this.f38572w = i13;
        this.f38573x = i14;
        this.f38574y = i15;
        if (i13 < 0) {
            throw new IllegalArgumentException("Major version should be not less than 0");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Minor version should be not less than 0");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("Patch version should be not less than 0");
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C11834a other) {
        AbstractC22676k.m65750j(other, "other");
        int iM65751k = AbstractC22676k.m65751k(this.f38572w, other.f38572w);
        if (iM65751k != 0) {
            return iM65751k;
        }
        int iM65751k2 = AbstractC22676k.m65751k(this.f38573x, other.f38573x);
        return iM65751k2 != 0 ? iM65751k2 : AbstractC22676k.m65751k(this.f38574y, other.f38574y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C11834a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.metadata.jvm.JvmMetadataVersion");
        C11834a c11834a = (C11834a) obj;
        return this.f38572w == c11834a.f38572w && this.f38573x == c11834a.f38573x && this.f38574y == c11834a.f38574y;
    }

    public final int hashCode() {
        return (((this.f38572w * 31) + this.f38573x) * 31) + this.f38574y;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f38572w);
        sb4.append('.');
        sb4.append(this.f38573x);
        sb4.append('.');
        sb4.append(this.f38574y);
        return sb4.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11834a(int[] intArray) {
        this(intArray[0], intArray[1], intArray[2]);
        AbstractC22676k.m65750j(intArray, "intArray");
    }
}
