package e20;

import ck1.C4780c;
import h20.C16686k4;
import p715kotlin.jvm.internal.AbstractC22676k;
import u03.InterfaceC34393a;
import v00.C35459c0;
import v03.C35515b;
import v03.C35516c;
import v03.InterfaceC35517d;

/* JADX INFO: renamed from: e20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12594b implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42980w;

    /* JADX INFO: renamed from: x */
    public final C35515b f42981x;

    public /* synthetic */ C12594b(C35515b c35515b, int i13) {
        this.f42980w = i13;
        this.f42981x = c35515b;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f42980w) {
            case 0:
                InterfaceC34393a lazyRegistry = C35516c.m112677a(this.f42981x);
                AbstractC22676k.m65750j(lazyRegistry, "lazyRegistry");
                return new C4780c(lazyRegistry, 25);
            default:
                C16686k4 viewModel = (C16686k4) this.f42981x.get();
                AbstractC22676k.m65750j(viewModel, "viewModel");
                return (C35459c0) viewModel.f43008L.getValue();
        }
    }
}
