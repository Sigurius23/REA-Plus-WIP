package p028b4;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b4.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C2705p extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f10658E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f10659F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f10660G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function1 f10661w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f10662x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f10663y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f10664z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2705p(Function1 function1, Modifier modifier, Function1 function2, Function1 function3, Function1 function4, int i13, int i14) {
        super(2);
        this.f10661w = function1;
        this.f10662x = modifier;
        this.f10663y = function2;
        this.f10664z = function3;
        this.f10658E = function4;
        this.f10659F = i13;
        this.f10660G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1137a.m3602b(this.f10661w, this.f10662x, this.f10663y, this.f10664z, this.f10658E, (Composer) obj, AbstractC28683x.m87244L(this.f10659F | 1), this.f10660G);
        return C23454a0.f92919a;
    }
}
