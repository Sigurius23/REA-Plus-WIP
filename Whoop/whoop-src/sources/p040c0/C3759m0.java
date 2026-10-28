package p040c0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.InterfaceC11337c0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: c0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3759m0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function3 f15360E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f15361F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f15362G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f15363w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f15364x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC11337c0 f15365y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f15366z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3759m0(Object obj, Modifier modifier, InterfaceC11337c0 interfaceC11337c0, String str, Function3 function3, int i13, int i14) {
        super(2);
        this.f15363w = obj;
        this.f15364x = modifier;
        this.f15365y = interfaceC11337c0;
        this.f15366z = str;
        this.f15360E = function3;
        this.f15361F = i13;
        this.f15362G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC29125c.m88520b(this.f15363w, this.f15364x, this.f15365y, this.f15366z, this.f15360E, (Composer) obj, AbstractC28683x.m87244L(this.f15361F | 1), this.f15362G);
        return C23454a0.f92919a;
    }
}
