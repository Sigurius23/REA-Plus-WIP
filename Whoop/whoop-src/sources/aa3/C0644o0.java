package aa3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0644o0 extends AbstractC0650r0 {

    /* JADX INFO: renamed from: a */
    public final String f2249a;

    public C0644o0(String name) {
        AbstractC22676k.m65750j(name, "name");
        this.f2249a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0644o0) && AbstractC22676k.m65745e(this.f2249a, ((C0644o0) obj).f2249a);
    }

    public final int hashCode() {
        return this.f2249a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Class(name="), this.f2249a, ')');
    }
}
