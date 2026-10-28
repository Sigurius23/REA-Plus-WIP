package e10;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C12579y implements InterfaceC12536b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12578x f42950a;

    public C12579y(InterfaceC12578x interfaceC12578x) {
        this.f42950a = interfaceC12578x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12579y) && AbstractC22676k.m65745e(this.f42950a, ((C12579y) obj).f42950a);
    }

    public final int hashCode() {
        return this.f42950a.hashCode();
    }

    public final String toString() {
        return "Complete(result=" + this.f42950a + ")";
    }
}
