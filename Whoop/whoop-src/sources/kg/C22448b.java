package kg;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kg.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C22448b extends AbstractC22452f {

    /* JADX INFO: renamed from: a */
    public final int f87879a;

    /* JADX INFO: renamed from: b */
    public final C22450d f87880b;

    public C22448b(int i13, C22450d c22450d) {
        this.f87879a = i13;
        this.f87880b = c22450d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22448b)) {
            return false;
        }
        C22448b c22448b = (C22448b) obj;
        return this.f87879a == c22448b.f87879a && AbstractC22676k.m65745e(this.f87880b, c22448b.f87880b);
    }

    public final int hashCode() {
        return this.f87880b.hashCode() + (Integer.hashCode(this.f87879a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("</");
        sb4.append(this.f87880b);
        sb4.append("> (");
        return AbstractC11895b.m31999r(sb4, this.f87879a, ')');
    }
}
