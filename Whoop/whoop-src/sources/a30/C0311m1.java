package a30;

import h20.EnumC16701n1;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;

/* JADX INFO: renamed from: a30.m1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0311m1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC32417h f1072a;

    /* JADX INFO: renamed from: b */
    public final EnumC16701n1 f1073b;

    public C0311m1(AbstractC32417h abstractC32417h, EnumC16701n1 theme) {
        AbstractC22676k.m65750j(theme, "theme");
        this.f1072a = abstractC32417h;
        this.f1073b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0311m1)) {
            return false;
        }
        C0311m1 c0311m1 = (C0311m1) obj;
        return AbstractC22676k.m65745e(this.f1072a, c0311m1.f1072a) && this.f1073b == c0311m1.f1073b;
    }

    public final int hashCode() {
        return this.f1073b.hashCode() + (this.f1072a.hashCode() * 31);
    }

    public final String toString() {
        return "Link(state=" + this.f1072a + ", theme=" + this.f1073b + ")";
    }
}
