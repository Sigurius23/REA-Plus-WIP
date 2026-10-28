package ih0;

import p390p1.C28624i0;
import p715kotlin.jvm.functions.Function1;
import ql0.InterfaceC30468c;

/* JADX INFO: renamed from: ih0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18490e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71981w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f71982x;

    public /* synthetic */ C18490e(Object obj, int i13) {
        this.f71981w = i13;
        this.f71982x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f71981w) {
            case 0:
                return AbstractC18502l.m53555B((InterfaceC30468c) this.f71982x, (C28624i0) obj);
            default:
                return AbstractC18502l.m53571R((Function1) this.f71982x, ((Boolean) obj).booleanValue());
        }
    }
}
