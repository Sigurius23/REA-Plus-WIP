package p328mj;

import l83.C23454a0;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p490t0.C33252i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: mj.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C25603j extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f100443E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f100444w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f100445x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f100446y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33252i f100447z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25603j(float f13, float f14, float f15, C33252i c33252i, long j7) {
        super(1);
        this.f100444w = f13;
        this.f100445x = f14;
        this.f100446y = f15;
        this.f100447z = c33252i;
        this.f100443E = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC17886g0 graphicsLayer = (InterfaceC17886g0) obj;
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51562s(c17920x0.getDensity() * this.f100444w);
        c17920x0.m51550E(c17920x0.getDensity() * this.f100445x);
        c17920x0.m51549C(c17920x0.getDensity() * this.f100446y);
        c17920x0.m51563t(this.f100447z);
        c17920x0.m51554e(false);
        long j7 = this.f100443E;
        c17920x0.m51564v(j7);
        c17920x0.m51552b(j7);
        return C23454a0.f92919a;
    }
}
