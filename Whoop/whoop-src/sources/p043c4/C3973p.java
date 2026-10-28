package p043c4;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C3973p extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16187E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f16188F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC3964i0 f16189w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f16190x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3966j0 f16191y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37816b f16192z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3973p(InterfaceC3964i0 interfaceC3964i0, InterfaceC4339a interfaceC4339a, C3966j0 c3966j0, C37816b c37816b, int i13, int i14) {
        super(2);
        this.f16189w = interfaceC3964i0;
        this.f16190x = interfaceC4339a;
        this.f16191y = c3966j0;
        this.f16192z = c37816b;
        this.f16187E = i13;
        this.f16188F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC3975r.m12004a(this.f16189w, this.f16190x, this.f16191y, this.f16192z, (Composer) obj, AbstractC28683x.m87244L(this.f16187E | 1), this.f16188F);
        return C23454a0.f92919a;
    }
}
