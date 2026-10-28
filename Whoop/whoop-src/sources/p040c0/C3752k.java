package p040c0;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p077d0.C11421z1;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3752k extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f15334E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4352n f15335F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f15336G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11421z1 f15337w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f15338x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f15339y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC2302h f15340z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3752k(C11421z1 c11421z1, Modifier modifier, Function1 function1, InterfaceC2302h interfaceC2302h, Function1 function2, InterfaceC4352n interfaceC4352n, int i13) {
        super(2);
        this.f15337w = c11421z1;
        this.f15338x = modifier;
        this.f15339y = function1;
        this.f15340z = interfaceC2302h;
        this.f15334E = function2;
        this.f15335F = interfaceC4352n;
        this.f15336G = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1089a.m3343a(this.f15337w, this.f15338x, this.f15339y, this.f15340z, this.f15334E, this.f15335F, (Composer) obj, AbstractC28683x.m87244L(this.f15336G | 1));
        return C23454a0.f92919a;
    }
}
