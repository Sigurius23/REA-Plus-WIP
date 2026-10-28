package p316m1;

import l83.InterfaceC23459e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22691v;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: m1.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C24911k0 implements InterfaceC24926x, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC22691v f97572w;

    public C24911k0(AbstractC22691v abstractC22691v) {
        this.f97572w = abstractC22691v;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC24926x) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f97572w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // p316m1.InterfaceC24926x
    public final /* synthetic */ float invoke() {
        return ((Number) this.f97572w.invoke()).floatValue();
    }
}
