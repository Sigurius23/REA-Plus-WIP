package ph0;

import c93.InterfaceC4339a;
import com.whoop.aiinsights.AiInsightsFragment;

/* JADX INFO: renamed from: ph0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C29233a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118306w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AiInsightsFragment f118307x;

    public /* synthetic */ C29233a(AiInsightsFragment aiInsightsFragment, int i13) {
        this.f118306w = i13;
        this.f118307x = aiInsightsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f118306w) {
            case 0:
                return AiInsightsFragment.m17840H(this.f118307x);
            case 1:
                return AiInsightsFragment.m17854V(this.f118307x);
            case 2:
                return AiInsightsFragment.m17847O(this.f118307x);
            case 3:
                return AiInsightsFragment.m17849Q(this.f118307x);
            default:
                return AiInsightsFragment.m17853U(this.f118307x);
        }
    }
}
