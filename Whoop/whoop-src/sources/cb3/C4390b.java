package cb3;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31111c;
import r93.InterfaceC31135k;

/* JADX INFO: renamed from: cb3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4390b implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C4390b f17731x = new C4390b(0);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17732w;

    public /* synthetic */ C4390b(int i13) {
        this.f17732w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17732w) {
            case 0:
                InterfaceC31135k it = (InterfaceC31135k) obj;
                int i13 = AbstractC4393e.f17737a;
                AbstractC22676k.m65750j(it, "it");
                return it.mo60581g();
            default:
                InterfaceC31111c interfaceC31111c = (InterfaceC31111c) obj;
                AbstractC22676k.m65747g(interfaceC31111c);
                return AbstractC4393e.m13814l(interfaceC31111c);
        }
    }
}
