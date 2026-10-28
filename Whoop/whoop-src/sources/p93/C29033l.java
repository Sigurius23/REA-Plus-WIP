package p93;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p93.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C29033l {

    /* JADX INFO: renamed from: a */
    public final AbstractC29032k f117504a;

    /* JADX INFO: renamed from: b */
    public final int f117505b;

    public C29033l(AbstractC29032k abstractC29032k, int i13) {
        this.f117504a = abstractC29032k;
        this.f117505b = i13;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC29032k m88264a() {
        return this.f117504a;
    }

    /* JADX INFO: renamed from: b */
    public final int m88265b() {
        return this.f117505b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29033l)) {
            return false;
        }
        C29033l c29033l = (C29033l) obj;
        return AbstractC22676k.m65745e(this.f117504a, c29033l.f117504a) && this.f117505b == c29033l.f117505b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117505b) + (this.f117504a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("KindWithArity(kind=");
        sb4.append(this.f117504a);
        sb4.append(", arity=");
        return AbstractC11895b.m31999r(sb4, this.f117505b, ')');
    }
}
