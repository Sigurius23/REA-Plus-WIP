package pj2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import com.whoop.stress.view.StressSessionFragment;
import lj2.C24481g;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: pj2.w */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29324w implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118771w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24481g f118772x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ StressSessionFragment f118773y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f118774z;

    public /* synthetic */ C29324w(StressSessionFragment stressSessionFragment, C24481g c24481g, InterfaceC28670t2 interfaceC28670t2) {
        this.f118773y = stressSessionFragment;
        this.f118772x = c24481g;
        this.f118774z = interfaceC28670t2;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f118771w) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                return StressSessionFragment.m26449Q(this.f118773y, this.f118772x, this.f118774z, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj4).intValue();
                StressSessionFragment stressSessionFragment = this.f118773y;
                return StressSessionFragment.m26452T(this.f118772x, stressSessionFragment, this.f118774z, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
        }
    }

    public /* synthetic */ C29324w(C24481g c24481g, StressSessionFragment stressSessionFragment, InterfaceC28670t2 interfaceC28670t2) {
        this.f118772x = c24481g;
        this.f118773y = stressSessionFragment;
        this.f118774z = interfaceC28670t2;
    }
}
