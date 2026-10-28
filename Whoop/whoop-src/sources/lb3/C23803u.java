package lb3;

import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;

/* JADX INFO: renamed from: lb3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C23803u extends AbstractC23812y0 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC31165x0[] f94195b;

    /* JADX INFO: renamed from: c */
    public final AbstractC23804u0[] f94196c;

    /* JADX INFO: renamed from: d */
    public final boolean f94197d;

    public C23803u(InterfaceC31165x0[] parameters, AbstractC23804u0[] arguments, boolean z4) {
        AbstractC22676k.m65750j(parameters, "parameters");
        AbstractC22676k.m65750j(arguments, "arguments");
        this.f94195b = parameters;
        this.f94196c = arguments;
        this.f94197d = z4;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: b */
    public final boolean mo69900b() {
        return this.f94197d;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: d */
    public final AbstractC23804u0 mo64119d(AbstractC23811y abstractC23811y) {
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        InterfaceC31165x0 interfaceC31165x0 = interfaceC31126hMo1784d instanceof InterfaceC31165x0 ? (InterfaceC31165x0) interfaceC31126hMo1784d : null;
        if (interfaceC31165x0 != null) {
            int index = interfaceC31165x0.getIndex();
            InterfaceC31165x0[] interfaceC31165x0Arr = this.f94195b;
            if (index < interfaceC31165x0Arr.length && AbstractC22676k.m65745e(interfaceC31165x0Arr[index].mo60496e(), interfaceC31165x0.mo60496e())) {
                return this.f94196c[index];
            }
        }
        return null;
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: e */
    public final boolean mo69908e() {
        return this.f94196c.length == 0;
    }
}
