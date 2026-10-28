package d40;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d40.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C11666k {

    /* JADX INFO: renamed from: a */
    public final C11664i f37659a;

    /* JADX INFO: renamed from: b */
    public final C11664i f37660b;

    /* JADX INFO: renamed from: c */
    public final C11665j f37661c;

    /* JADX INFO: renamed from: d */
    public final C11667l f37662d;

    public C11666k(C11664i c11664i, C11664i c11664i2, C11665j c11665j, C11667l c11667l) {
        this.f37659a = c11664i;
        this.f37660b = c11664i2;
        this.f37661c = c11665j;
        this.f37662d = c11667l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11666k)) {
            return false;
        }
        C11666k c11666k = (C11666k) obj;
        return AbstractC22676k.m65745e(this.f37659a, c11666k.f37659a) && AbstractC22676k.m65745e(this.f37660b, c11666k.f37660b) && AbstractC22676k.m65745e(this.f37661c, c11666k.f37661c) && AbstractC22676k.m65745e(this.f37662d, c11666k.f37662d);
    }

    public final int hashCode() {
        return this.f37662d.hashCode() + ((this.f37661c.hashCode() + ((this.f37660b.hashCode() + (this.f37659a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PrimaryButtonStyle(colorsLight=" + this.f37659a + ", colorsDark=" + this.f37660b + ", shape=" + this.f37661c + ", typography=" + this.f37662d + ")";
    }
}
