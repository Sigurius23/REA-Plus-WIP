package p040c0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p077d0.C11421z1;
import p077d0.InterfaceC11337c0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: c0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3768p0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function3 f15381E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f15382F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11421z1 f15383w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f15384x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC11337c0 f15385y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f15386z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3768p0(C11421z1 c11421z1, Modifier modifier, InterfaceC11337c0 interfaceC11337c0, Function1 function1, Function3 function3, int i13) {
        super(2);
        this.f15383w = c11421z1;
        this.f15384x = modifier;
        this.f15385y = interfaceC11337c0;
        this.f15386z = function1;
        this.f15381E = function3;
        this.f15382F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC29125c.m88518a(this.f15383w, this.f15384x, this.f15385y, this.f15386z, this.f15381E, (Composer) obj, AbstractC28683x.m87244L(this.f15382F | 1));
        return C23454a0.f92919a;
    }
}
