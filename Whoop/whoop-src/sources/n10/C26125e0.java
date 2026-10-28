package n10;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: n10.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C26125e0 implements InterfaceC26127f0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38802c8 f103508a;

    public C26125e0(InterfaceC38802c8 interfaceC38802c8) {
        this.f103508a = interfaceC38802c8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26125e0) && AbstractC22676k.m65745e(this.f103508a, ((C26125e0) obj).f103508a);
    }

    public final int hashCode() {
        return this.f103508a.hashCode();
    }

    public final String toString() {
        return "NextAction(intent=" + this.f103508a + ")";
    }
}
