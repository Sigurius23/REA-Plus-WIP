package vo1;

import c93.InterfaceC4339a;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment;

/* JADX INFO: renamed from: vo1.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36234i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155157w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MciOverviewFragment f155158x;

    public /* synthetic */ C36234i(MciOverviewFragment mciOverviewFragment, int i13) {
        this.f155157w = i13;
        this.f155158x = mciOverviewFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f155157w) {
            case 0:
                return MciOverviewFragment.m22013D(this.f155158x);
            case 1:
                return MciOverviewFragment.m22020K(this.f155158x);
            default:
                return MciOverviewFragment.m22023N(this.f155158x);
        }
    }
}
