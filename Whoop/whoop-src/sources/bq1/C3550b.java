package bq1;

import ad3.AbstractC0757c;
import c93.InterfaceC4339a;
import jb1.C21535a;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: bq1.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C3550b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14284w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC0757c f14285x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21535a f14286y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f14287z;

    public /* synthetic */ C3550b(AbstractC0757c abstractC0757c, C21535a c21535a, InterfaceC4339a interfaceC4339a, int i13) {
        this.f14284w = i13;
        this.f14285x = abstractC0757c;
        this.f14286y = c21535a;
        this.f14287z = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14284w) {
            case 0:
                return AbstractC3551c.m10600h(this.f14285x, this.f14286y, this.f14287z, (C21536b) obj);
            default:
                return AbstractC3551c.m10601i(this.f14285x, this.f14286y, this.f14287z, (C23749z0) obj);
        }
    }
}
