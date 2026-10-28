package p040c0;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3734e extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f15272E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f15273F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4352n f15274G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f15275H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f15276I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f15277w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f15278x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f15279y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC2302h f15280z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3734e(Object obj, Modifier modifier, Function1 function1, InterfaceC2302h interfaceC2302h, String str, Function1 function2, InterfaceC4352n interfaceC4352n, int i13, int i14) {
        super(2);
        this.f15277w = obj;
        this.f15278x = modifier;
        this.f15279y = function1;
        this.f15280z = interfaceC2302h;
        this.f15272E = str;
        this.f15273F = function2;
        this.f15274G = interfaceC4352n;
        this.f15275H = i13;
        this.f15276I = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1089a.m3344b(this.f15277w, this.f15278x, this.f15279y, this.f15280z, this.f15272E, this.f15273F, this.f15274G, (Composer) obj, AbstractC28683x.m87244L(this.f15275H | 1), this.f15276I);
        return C23454a0.f92919a;
    }
}
