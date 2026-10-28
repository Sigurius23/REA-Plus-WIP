package jb3;

import c93.InterfaceC4339a;
import m83.AbstractC25265s;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22698a;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;

/* JADX INFO: renamed from: jb3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C21552l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82650w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4339a f82651x;

    public /* synthetic */ C21552l(InterfaceC4339a interfaceC4339a, int i13) {
        this.f82650w = i13;
        this.f82651x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f82650w) {
            case 0:
                return AbstractC25265s.m74103I1((Iterable) this.f82651x.invoke());
            default:
                InterfaceC22712o interfaceC22712o = (InterfaceC22712o) this.f82651x.invoke();
                return interfaceC22712o instanceof AbstractC22698a ? ((AbstractC22698a) interfaceC22712o).m65786a() : interfaceC22712o;
        }
    }
}
