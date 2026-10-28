package p580wd;

import p319m4.AbstractC25012a;
import p477s2.AbstractC32069a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C37157j extends AbstractC32069a {

    /* JADX INFO: renamed from: a */
    public final String f158913a;

    public C37157j(String str) {
        this.f158913a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37157j) && AbstractC22676k.m65745e(this.f158913a, ((C37157j) obj).f158913a);
    }

    public final int hashCode() {
        return this.f158913a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Named(name="), this.f158913a, ')');
    }
}
