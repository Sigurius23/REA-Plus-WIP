package pb3;

import lb3.AbstractC23773f1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;
import r93.InterfaceC31163w0;
import r93.InterfaceC31165x0;

/* JADX INFO: renamed from: pb3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C29061a implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C29061a f117585x = new C29061a(0);

    /* JADX INFO: renamed from: y */
    public static final C29061a f117586y = new C29061a(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117587w;

    public /* synthetic */ C29061a(int i13) {
        this.f117587w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC23773f1 it = (AbstractC23773f1) obj;
        switch (this.f117587w) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                InterfaceC31126h interfaceC31126hMo1784d = it.mo69844i0().mo1784d();
                return Boolean.valueOf(interfaceC31126hMo1784d != null && (interfaceC31126hMo1784d instanceof InterfaceC31165x0) && (((InterfaceC31165x0) interfaceC31126hMo1784d).mo60581g() instanceof InterfaceC31163w0));
            default:
                AbstractC22676k.m65750j(it, "it");
                InterfaceC31126h interfaceC31126hMo1784d2 = it.mo69844i0().mo1784d();
                return Boolean.valueOf(interfaceC31126hMo1784d2 != null && ((interfaceC31126hMo1784d2 instanceof InterfaceC31163w0) || (interfaceC31126hMo1784d2 instanceof InterfaceC31165x0)));
        }
    }
}
