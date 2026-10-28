package p420qc;

import l83.C23454a0;
import p002a0.C0022g;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.s */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C30209s implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f123662w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30211u f123663x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC33687a f123664y;

    public /* synthetic */ C30209s(C30211u c30211u, InterfaceC33687a interfaceC33687a, int i13) {
        this.f123662w = i13;
        this.f123663x = c30211u;
        this.f123664y = interfaceC33687a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0022g _tmpMap = (C0022g) obj;
        switch (this.f123662w) {
            case 0:
                AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
                this.f123663x.m92430a(this.f123664y, _tmpMap);
                break;
            default:
                AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
                this.f123663x.m92431b(this.f123664y, _tmpMap);
                break;
        }
        return C23454a0.f92919a;
    }
}
