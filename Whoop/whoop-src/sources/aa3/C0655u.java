package aa3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C0655u extends AbstractC0638m0 {

    /* JADX INFO: renamed from: a */
    public final String f2283a;

    /* JADX INFO: renamed from: b */
    public final int f2284b;

    /* JADX INFO: renamed from: c */
    public final String f2285c;

    public C0655u(String className, int i13) {
        AbstractC22676k.m65750j(className, "className");
        this.f2283a = className;
        this.f2284b = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
        }
        StringBuilder sb4 = new StringBuilder("ArrayKClassValue(");
        for (int i14 = 0; i14 < i13; i14++) {
            sb4.append("kotlin/Array<");
        }
        sb4.append(this.f2283a);
        int i15 = this.f2284b;
        for (int i16 = 0; i16 < i15; i16++) {
            sb4.append(">");
        }
        sb4.append(")");
        this.f2285c = sb4.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0655u)) {
            return false;
        }
        C0655u c0655u = (C0655u) obj;
        return AbstractC22676k.m65745e(this.f2283a, c0655u.f2283a) && this.f2284b == c0655u.f2284b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2284b) + (this.f2283a.hashCode() * 31);
    }

    public final String toString() {
        return this.f2285c;
    }
}
