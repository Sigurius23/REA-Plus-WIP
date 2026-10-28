package vp1;

import c93.InterfaceC4339a;
import com.whoop.hormonalinsights.settings.view.HormonalSettingsFragment;
import p163g1.C15199y3;

/* JADX INFO: renamed from: vp1.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36273i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155433w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f155434x;

    public /* synthetic */ C36273i(Object obj, int i13) {
        this.f155433w = i13;
        this.f155434x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f155433w) {
            case 0:
                return AbstractC36272h.u.m115928h((C15199y3) this.f155434x);
            default:
                return HormonalSettingsFragment.m22165E((HormonalSettingsFragment) this.f155434x);
        }
    }
}
