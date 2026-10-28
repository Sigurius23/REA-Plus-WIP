package p040c0;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11421z1;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3729c0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f15243E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC3730c1 f15244F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ AbstractC3736e1 f15245G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function3 f15246H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15247w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11421z1 f15248x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f15249y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f15250z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3729c0(C11421z1 c11421z1, Function1 function1, Modifier modifier, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, Function3 function3, int i13, int i14) {
        super(2);
        this.f15247w = i14;
        this.f15248x = c11421z1;
        this.f15249y = function1;
        this.f15250z = modifier;
        this.f15244F = abstractC3730c1;
        this.f15245G = abstractC3736e1;
        this.f15246H = function3;
        this.f15243E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15247w) {
            case 0:
                ((Number) obj2).intValue();
                C3733d1 c3733d1 = (C3733d1) this.f15244F;
                C3739f1 c3739f1 = (C3739f1) this.f15245G;
                C37816b c37816b = (C37816b) this.f15246H;
                AbstractC1090b.m3348c(this.f15248x, this.f15249y, this.f15250z, c3733d1, c3739f1, c37816b, (Composer) obj, AbstractC28683x.m87244L(this.f15243E | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC1090b.m3353h(this.f15248x, this.f15249y, this.f15250z, this.f15244F, this.f15245G, this.f15246H, (Composer) obj, AbstractC28683x.m87244L(this.f15243E | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
