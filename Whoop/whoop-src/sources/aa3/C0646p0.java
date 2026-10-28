package aa3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0646p0 extends AbstractC0650r0 {

    /* JADX INFO: renamed from: a */
    public final String f2262a;

    public C0646p0(String name) {
        AbstractC22676k.m65750j(name, "name");
        this.f2262a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0646p0) && AbstractC22676k.m65745e(this.f2262a, ((C0646p0) obj).f2262a);
    }

    public final int hashCode() {
        return this.f2262a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("TypeAlias(name="), this.f2262a, ')');
    }
}
