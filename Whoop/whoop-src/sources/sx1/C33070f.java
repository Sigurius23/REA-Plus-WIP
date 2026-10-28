package sx1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.membership.reactivationmodal.ReactivationModalFragment;
import com.whoop.navigation.C9598e;

/* JADX INFO: renamed from: sx1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C33070f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137913w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ReactivationModalFragment f137914x;

    public /* synthetic */ C33070f(ReactivationModalFragment reactivationModalFragment, int i13) {
        this.f137913w = i13;
        this.f137914x = reactivationModalFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f137913w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ReactivationModalFragment.m22830G(this.f137914x, (Composer) obj, iIntValue);
            default:
                return ReactivationModalFragment.m22831H(this.f137914x, (C9598e) obj, (String) obj2);
        }
    }
}
