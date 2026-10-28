package is0;

import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25314w;

/* JADX INFO: renamed from: is0.t */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20908t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78763w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f78764x;

    public /* synthetic */ C20908t(Object obj, int i13) {
        this.f78763w = i13;
        this.f78764x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78763w) {
            case 0:
                return AbstractC20916x.m57939V((AbstractC39104j1) this.f78764x, (AbstractC39101i1) obj);
            case 1:
                return AbstractC20889j0.m57770g0((InterfaceC28601c1) this.f78764x, (String) obj);
            case 2:
                return AbstractC20889j0.m57756Z((C25314w) this.f78764x, (C28624i0) obj);
            default:
                return AbstractC20889j0.m57760b0((InterfaceC28690z0) this.f78764x, (InterfaceC39147y) obj);
        }
    }
}
