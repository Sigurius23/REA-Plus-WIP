package c30;

import a40.InterfaceC0360e;
import c93.InterfaceC4339a;
import l83.InterfaceC23459e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: c30.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3914e implements InterfaceC0360e, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC4339a f15999w;

    public C3914e(InterfaceC4339a function) {
        AbstractC22676k.m65750j(function, "function");
        this.f15999w = function;
    }

    @Override // a40.InterfaceC0360e
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo993a() {
        this.f15999w.invoke();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0360e) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f15999w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
