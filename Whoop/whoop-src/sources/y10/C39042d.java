package y10;

import l83.InterfaceC23459e;
import p003a1.C0106e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: y10.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C39042d implements InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0106e f168018w;

    public C39042d(C0106e c0106e) {
        this.f168018w = c0106e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39042d) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f168018w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
