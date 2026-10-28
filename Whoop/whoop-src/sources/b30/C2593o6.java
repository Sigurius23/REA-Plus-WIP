package b30;

import h20.EnumC16701n1;
import p499t9.C33623c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import v00.EnumC35491s0;

/* JADX INFO: renamed from: b30.o6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2593o6 {

    /* JADX INFO: renamed from: a */
    public final AbstractC32417h f10078a;

    /* JADX INFO: renamed from: b */
    public final EnumC16701n1 f10079b;

    public C2593o6(AbstractC32417h abstractC32417h, EnumC16701n1 enumC16701n1) {
        this.f10078a = abstractC32417h;
        this.f10079b = enumC16701n1;
        C33623c0 c33623c0 = EnumC35491s0.f151075x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2593o6)) {
            return false;
        }
        C2593o6 c2593o6 = (C2593o6) obj;
        return AbstractC22676k.m65745e(this.f10078a, c2593o6.f10078a) && this.f10079b == c2593o6.f10079b;
    }

    public final int hashCode() {
        return this.f10079b.hashCode() + (this.f10078a.hashCode() * 31);
    }

    public final String toString() {
        return "Link(state=" + this.f10078a + ", theme=" + this.f10079b + ")";
    }
}
