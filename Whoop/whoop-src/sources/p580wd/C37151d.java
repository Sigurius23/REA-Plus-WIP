package p580wd;

import p319m4.AbstractC25012a;
import p470rv.AbstractC31834n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C37151d extends AbstractC31834n {

    /* JADX INFO: renamed from: b */
    public final String f158901b;

    public C37151d(String str) {
        this.f158901b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37151d) && AbstractC22676k.m65745e(this.f158901b, ((C37151d) obj).f158901b);
    }

    public final int hashCode() {
        return this.f158901b.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public final String m119070m() {
        return this.f158901b;
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("NamedSource(name="), this.f158901b, ')');
    }
}
