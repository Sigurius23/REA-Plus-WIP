package p580wd;

import p470rv.AbstractC31834n;
import ve.C35920e;

/* JADX INFO: renamed from: wd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C37148a extends AbstractC31834n {

    /* JADX INFO: renamed from: b */
    public final C35920e f158895b;

    public C37148a(C35920e c35920e) {
        this.f158895b = c35920e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37148a) && this.f158895b.equals(((C37148a) obj).f158895b);
    }

    public final int hashCode() {
        return this.f158895b.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public final C35920e m119064m() {
        return this.f158895b;
    }

    public final String toString() {
        return "AccessKey(credentials=" + this.f158895b + ')';
    }
}
