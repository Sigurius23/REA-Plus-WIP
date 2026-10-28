package p040c0;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3738f0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC3736e1 f15293E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f15294F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function3 f15295G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f15296H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f15297I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC23013y f15298w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f15299x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f15300y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC3730c1 f15301z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3738f0(InterfaceC23013y interfaceC23013y, boolean z4, Modifier modifier, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, String str, Function3 function3, int i13, int i14) {
        super(2);
        this.f15298w = interfaceC23013y;
        this.f15299x = z4;
        this.f15300y = modifier;
        this.f15301z = abstractC3730c1;
        this.f15293E = abstractC3736e1;
        this.f15294F = str;
        this.f15295G = function3;
        this.f15296H = i13;
        this.f15297I = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1090b.m3350e(this.f15298w, this.f15299x, this.f15300y, this.f15301z, this.f15293E, this.f15294F, this.f15295G, (Composer) obj, AbstractC28683x.m87244L(this.f15296H | 1), this.f15297I);
        return C23454a0.f92919a;
    }
}
