package ib0;

import c93.InterfaceC4339a;
import com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment;

/* JADX INFO: renamed from: ib0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18330a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71343w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BiomarkerSummaryFragment f71344x;

    public /* synthetic */ C18330a(BiomarkerSummaryFragment biomarkerSummaryFragment, int i13) {
        this.f71343w = i13;
        this.f71344x = biomarkerSummaryFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f71343w) {
            case 0:
                return BiomarkerSummaryFragment.m17313O(this.f71344x);
            case 1:
                return BiomarkerSummaryFragment.m17320V(this.f71344x);
            default:
                return BiomarkerSummaryFragment.m17319U(this.f71344x);
        }
    }
}
