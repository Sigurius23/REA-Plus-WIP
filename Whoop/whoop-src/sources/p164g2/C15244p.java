package p164g2;

import l83.InterfaceC23459e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: g2.p */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15244p implements InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function1 f57263w;

    public C15244p(Function1 function1) {
        this.f57263w = function1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15244p) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f57263w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
