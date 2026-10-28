package sc2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.settings.strap.StrapSettingsFragment;

/* JADX INFO: renamed from: sc2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32370i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133983w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StrapSettingsFragment f133984x;

    public /* synthetic */ C32370i(StrapSettingsFragment strapSettingsFragment, int i13) {
        this.f133983w = i13;
        this.f133984x = strapSettingsFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f133983w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return StrapSettingsFragment.m25739B0(this.f133984x, composer, iIntValue);
            default:
                return StrapSettingsFragment.m25740C0(this.f133984x, composer, iIntValue);
        }
    }
}
