package pf;

import cg.C4560o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pf.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C29139q extends AbstractC29140r {

    /* JADX INFO: renamed from: a */
    public final C4560o f117932a;

    public C29139q(C4560o c4560o) {
        this.f117932a = c4560o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29139q) && AbstractC22676k.m65745e(this.f117932a, ((C29139q) obj).f117932a);
    }

    public final int hashCode() {
        return this.f117932a.hashCode();
    }

    public final String toString() {
        return "Http(url=" + this.f117932a + ')';
    }
}
