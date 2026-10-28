package i20;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17970p0 {

    /* JADX INFO: renamed from: a */
    public final String f69793a;

    public C17970p0(String str) {
        this.f69793a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17970p0) && AbstractC22676k.m65745e(this.f69793a, ((C17970p0) obj).f69793a);
    }

    public final int hashCode() {
        String str = this.f69793a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Args(country=", this.f69793a, ")");
    }
}
