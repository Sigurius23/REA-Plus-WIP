package sv;

import p470rv.C31831k;
import p470rv.InterfaceC31836p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sv.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C33029e extends AbstractC33028d {

    /* JADX INFO: renamed from: F */
    public final C31831k f137571F;

    /* JADX INFO: renamed from: G */
    public boolean f137572G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33029e(C31831k indicatorBearingChangedListener) {
        super(AbstractC33025a.f137560b);
        AbstractC22676k.m65750j(indicatorBearingChangedListener, "indicatorBearingChangedListener");
        this.f137571F = indicatorBearingChangedListener;
        this.f137572G = true;
    }

    @Override // sv.AbstractC33028d
    /* JADX INFO: renamed from: c */
    public final void mo104295c(Object obj, float f13) {
        double dDoubleValue = ((Number) obj).doubleValue();
        if (this.f137572G) {
            InterfaceC31836p interfaceC31836p = this.f137569y;
            if (interfaceC31836p != null) {
                interfaceC31836p.mo91124n(dDoubleValue);
            }
            this.f137571F.m98887a();
        }
    }
}
