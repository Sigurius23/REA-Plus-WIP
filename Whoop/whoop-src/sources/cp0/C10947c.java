package cp0;

import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cp0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10947c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f33892w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f33893x;

    public /* synthetic */ C10947c(Function1 function1, int i13) {
        this.f33892w = i13;
        this.f33893x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33892w) {
            case 0:
                return AbstractC10956f.m29066r(this.f33893x, (InterfaceC39147y) obj);
            default:
                return AbstractC10979m1.m29267s(this.f33893x, ((Boolean) obj).booleanValue());
        }
    }
}
