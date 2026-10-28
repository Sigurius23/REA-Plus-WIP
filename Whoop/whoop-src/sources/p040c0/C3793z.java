package p040c0;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11421z1;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3793z extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC3736e1 f15461E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4351m f15462F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function3 f15463G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f15464H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11421z1 f15465w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f15466x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f15467y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC3730c1 f15468z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3793z(C11421z1 c11421z1, Function1 function1, Modifier modifier, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, InterfaceC4351m interfaceC4351m, Function3 function3, int i13) {
        super(2);
        this.f15465w = c11421z1;
        this.f15466x = function1;
        this.f15467y = modifier;
        this.f15468z = abstractC3730c1;
        this.f15461E = abstractC3736e1;
        this.f15462F = interfaceC4351m;
        this.f15463G = function3;
        this.f15464H = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1090b.m3346a(this.f15465w, this.f15466x, this.f15467y, this.f15468z, this.f15461E, this.f15462F, this.f15463G, (Composer) obj, AbstractC28683x.m87244L(this.f15464H | 1));
        return C23454a0.f92919a;
    }
}
