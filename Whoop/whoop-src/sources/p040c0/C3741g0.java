package p040c0;

import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3741g0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15307w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39104j1 f15308x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3741g0(AbstractC39104j1 abstractC39104j1, int i13) {
        super(1);
        this.f15307w = i13;
        this.f15308x = abstractC39104j1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15307w) {
            case 0:
                ((AbstractC39101i1) obj).m124632f(this.f15308x, 0, 0, 0.0f);
                break;
            case 1:
                AbstractC39101i1.m124624n(this.f15308x, 0, 0, (AbstractC39101i1) obj);
                break;
            case 2:
                AbstractC39101i1.m124625o(this.f15308x, 0, 0, (AbstractC39101i1) obj);
                break;
            default:
                ((AbstractC39101i1) obj).m124632f(this.f15308x, 0, 0, 0.0f);
                break;
        }
        return C23454a0.f92919a;
    }
}
