package p040c0;

import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3776s extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3782u f15410w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC39104j1 f15411x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f15412y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3776s(C3782u c3782u, AbstractC39104j1 abstractC39104j1, long j7) {
        super(1);
        this.f15410w = c3782u;
        this.f15411x = abstractC39104j1;
        this.f15412y = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2302h interfaceC2302h = this.f15410w.f15425R.f15448b;
        AbstractC39104j1 abstractC39104j1 = this.f15411x;
        AbstractC39101i1.m124623k((AbstractC39101i1) obj, abstractC39104j1, interfaceC2302h.mo7156a((((long) abstractC39104j1.f168212x) & 4294967295L) | (((long) abstractC39104j1.f168211w) << 32), this.f15412y, EnumC39181m.f168423w));
        return C23454a0.f92919a;
    }
}
