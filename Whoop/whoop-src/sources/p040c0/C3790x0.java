package p040c0;

import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3790x0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15453w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39104j1 f15454x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3790x0(AbstractC39104j1 abstractC39104j1, int i13) {
        super(1);
        this.f15453w = i13;
        this.f15454x = abstractC39104j1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15453w) {
            case 0:
                ((AbstractC39101i1) obj).m124632f(this.f15454x, 0, 0, 0.0f);
                break;
            case 1:
                ((AbstractC39101i1) obj).m124632f(this.f15454x, 0, 0, 0.0f);
                break;
            default:
                AbstractC39101i1.m124624n(this.f15454x, 0, 0, (AbstractC39101i1) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
