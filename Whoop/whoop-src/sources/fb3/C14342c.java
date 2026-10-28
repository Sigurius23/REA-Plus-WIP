package fb3;

import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31117e;

/* JADX INFO: renamed from: fb3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14342c implements InterfaceC14343d {

    /* JADX INFO: renamed from: w */
    public final InterfaceC31117e f52395w;

    public C14342c(InterfaceC31117e interfaceC31117e) {
        this.f52395w = interfaceC31117e;
    }

    public final boolean equals(Object obj) {
        C14342c c14342c = obj instanceof C14342c ? (C14342c) obj : null;
        return AbstractC22676k.m65745e(this.f52395w, c14342c != null ? c14342c.f52395w : null);
    }

    @Override // fb3.InterfaceC14343d
    public final AbstractC23811y getType() {
        AbstractC23763c0 abstractC23763c0Mo60594i = this.f52395w.mo60594i();
        AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
        return abstractC23763c0Mo60594i;
    }

    public final int hashCode() {
        return this.f52395w.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Class{");
        AbstractC23763c0 abstractC23763c0Mo60594i = this.f52395w.mo60594i();
        AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
        sb4.append(abstractC23763c0Mo60594i);
        sb4.append('}');
        return sb4.toString();
    }
}
