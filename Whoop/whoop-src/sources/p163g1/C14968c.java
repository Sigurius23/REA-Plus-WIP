package p163g1;

import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14968c implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC39104j1 f55878E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55879w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f55880x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC39104j1 f55881y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f55882z;

    public /* synthetic */ C14968c(int i13, AbstractC39104j1 abstractC39104j1, int i14, AbstractC39104j1 abstractC39104j2) {
        this.f55880x = i13;
        this.f55881y = abstractC39104j1;
        this.f55882z = i14;
        this.f55878E = abstractC39104j2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC39101i1 layout = (AbstractC39101i1) obj;
        switch (this.f55879w) {
            case 0:
                AbstractC39104j1 abstractC39104j1 = this.f55881y;
                if (abstractC39104j1 != null) {
                    layout.m124632f(abstractC39104j1, 0, this.f55880x, 0.0f);
                }
                AbstractC39104j1 abstractC39104j2 = this.f55878E;
                if (abstractC39104j2 != null) {
                    layout.m124632f(abstractC39104j2, 0, this.f55882z, 0.0f);
                }
                break;
            default:
                AbstractC22676k.m65750j(layout, "$this$layout");
                AbstractC39104j1 abstractC39104j3 = this.f55881y;
                int i13 = abstractC39104j3.f168212x;
                int i14 = this.f55880x;
                int i15 = this.f55882z;
                AbstractC39104j1 abstractC39104j4 = this.f55878E;
                if (i14 > i13) {
                    layout.m124632f(abstractC39104j3, 0, i15, 0.0f);
                    layout.m124632f(abstractC39104j4, abstractC39104j3.f168211w, 0, 0.0f);
                } else {
                    layout.m124632f(abstractC39104j3, 0, 0, 0.0f);
                    layout.m124632f(abstractC39104j4, abstractC39104j3.f168211w, i15, 0.0f);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C14968c(AbstractC39104j1 abstractC39104j1, int i13, AbstractC39104j1 abstractC39104j2, int i14) {
        this.f55881y = abstractC39104j1;
        this.f55880x = i13;
        this.f55878E = abstractC39104j2;
        this.f55882z = i14;
    }
}
