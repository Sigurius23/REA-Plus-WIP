package p043c4;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C3965j extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C37816b f16155E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f16156F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f16157G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC2302h f16158w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f16159x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f16160y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3966j0 f16161z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3965j(InterfaceC2302h interfaceC2302h, long j7, InterfaceC4339a interfaceC4339a, C3966j0 c3966j0, C37816b c37816b, int i13, int i14) {
        super(2);
        this.f16158w = interfaceC2302h;
        this.f16159x = j7;
        this.f16160y = interfaceC4339a;
        this.f16161z = c3966j0;
        this.f16155E = c37816b;
        this.f16156F = i13;
        this.f16157G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC3975r.m12005b(this.f16158w, this.f16159x, this.f16160y, this.f16161z, this.f16155E, (Composer) obj, AbstractC28683x.m87244L(this.f16156F | 1), this.f16157G);
        return C23454a0.f92919a;
    }
}
