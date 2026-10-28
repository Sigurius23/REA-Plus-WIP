package sv;

import p470rv.C31832l;
import p470rv.InterfaceC31836p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C33026b extends AbstractC33028d {

    /* JADX INFO: renamed from: F */
    public final C31832l f137561F;

    /* JADX INFO: renamed from: G */
    public int f137562G;

    /* JADX INFO: renamed from: H */
    public int f137563H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33026b(C31832l accuracyRadiusChangedListener) {
        super(AbstractC33025a.f137560b);
        AbstractC22676k.m65750j(accuracyRadiusChangedListener, "accuracyRadiusChangedListener");
        this.f137561F = accuracyRadiusChangedListener;
        this.f137562G = -16776961;
        this.f137563H = -16776961;
    }

    @Override // sv.AbstractC33028d
    /* JADX INFO: renamed from: c */
    public final void mo104295c(Object obj, float f13) {
        double dDoubleValue = ((Number) obj).doubleValue();
        if (!this.f137570z) {
            InterfaceC31836p interfaceC31836p = this.f137569y;
            if (interfaceC31836p != null) {
                interfaceC31836p.mo91112d0(0.0f);
                return;
            }
            return;
        }
        float f14 = (float) dDoubleValue;
        float f15 = 0.0f < f14 ? f14 : 0.0f;
        InterfaceC31836p interfaceC31836p2 = this.f137569y;
        if (interfaceC31836p2 != null) {
            interfaceC31836p2.mo91112d0(f15);
        }
        InterfaceC31836p interfaceC31836p3 = this.f137569y;
        if (interfaceC31836p3 != null) {
            interfaceC31836p3.mo91081E(this.f137562G, this.f137563H);
        }
        this.f137561F.m98888a();
    }
}
