package q20;

import h02.C16587n0;

/* JADX INFO: renamed from: q20.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29807a0 extends AbstractC29815e0 {

    /* JADX INFO: renamed from: b */
    public final C16587n0 f121862b;

    public C29807a0(C16587n0 c16587n0) {
        super(null);
        this.f121862b = c16587n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29807a0) && this.f121862b.equals(((C29807a0) obj).f121862b);
    }

    public final int hashCode() {
        return this.f121862b.hashCode();
    }

    public final String toString() {
        return "FinishProcessing(onComplete=" + this.f121862b + ")";
    }
}
