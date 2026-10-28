package p163g1;

import e93.AbstractC12889b;
import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g1.p3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15109p3 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56605w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39104j1 f56606x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f56607y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f56608z;

    public /* synthetic */ C15109p3(int i13, AbstractC39104j1 abstractC39104j1, int i14) {
        this.f56605w = 0;
        this.f56607y = i13;
        this.f56606x = abstractC39104j1;
        this.f56608z = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f56605w) {
            case 0:
                AbstractC39104j1 abstractC39104j1 = this.f56606x;
                ((AbstractC39101i1) obj).m124632f(abstractC39104j1, AbstractC12889b.m36258X((this.f56607y - abstractC39104j1.f168211w) / 2.0f), AbstractC12889b.m36258X((this.f56608z - abstractC39104j1.f168212x) / 2.0f), 0.0f);
                break;
            case 1:
                ((AbstractC39101i1) obj).m124632f(this.f56606x, this.f56607y, this.f56608z, 0.0f);
                break;
            default:
                ((AbstractC39101i1) obj).m124632f(this.f56606x, this.f56607y, this.f56608z, 0.0f);
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C15109p3(AbstractC39104j1 abstractC39104j1, int i13, int i14, int i15) {
        this.f56605w = i15;
        this.f56606x = abstractC39104j1;
        this.f56607y = i13;
        this.f56608z = i14;
    }
}
