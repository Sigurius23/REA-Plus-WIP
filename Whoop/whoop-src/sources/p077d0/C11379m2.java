package p077d0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C11379m2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC11395r f36481a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11419z f36482b;

    public C11379m2(AbstractC11395r abstractC11395r, InterfaceC11419z interfaceC11419z) {
        this.f36481a = abstractC11395r;
        this.f36482b = interfaceC11419z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11379m2)) {
            return false;
        }
        C11379m2 c11379m2 = (C11379m2) obj;
        return AbstractC22676k.m65745e(this.f36481a, c11379m2.f36481a) && AbstractC22676k.m65745e(this.f36482b, c11379m2.f36482b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f36482b.hashCode() + (this.f36481a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f36481a + ", easing=" + this.f36482b + ", arcMode=ArcMode(value=0))";
    }
}
