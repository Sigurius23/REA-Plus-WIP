package p292l1;

import e93.AbstractC12889b;
import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import sg2.AbstractC32465p;
import zk2.AbstractC40862w;

/* JADX INFO: renamed from: l1.y1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23206y1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91856w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39104j1 f91857x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f91858y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f91859z;

    public /* synthetic */ C23206y1(int i13, AbstractC39104j1 abstractC39104j1, int i14) {
        this.f91856w = 0;
        this.f91858y = i13;
        this.f91857x = abstractC39104j1;
        this.f91859z = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91856w) {
            case 0:
                AbstractC39104j1 abstractC39104j1 = this.f91857x;
                ((AbstractC39101i1) obj).m124632f(abstractC39104j1, AbstractC12889b.m36258X((this.f91858y - abstractC39104j1.f168211w) / 2.0f), AbstractC12889b.m36258X((this.f91859z - abstractC39104j1.f168212x) / 2.0f), 0.0f);
                return C23454a0.f92919a;
            case 1:
                return AbstractC32465p.m101400u(this.f91857x, this.f91858y, this.f91859z, (AbstractC39101i1) obj);
            default:
                return AbstractC40862w.m132446m(this.f91857x, this.f91858y, this.f91859z, (AbstractC39101i1) obj);
        }
    }

    public /* synthetic */ C23206y1(AbstractC39104j1 abstractC39104j1, int i13, int i14, int i15) {
        this.f91856w = i15;
        this.f91857x = abstractC39104j1;
        this.f91858y = i13;
        this.f91859z = i14;
    }
}
