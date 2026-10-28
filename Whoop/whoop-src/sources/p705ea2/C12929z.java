package p705ea2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.settings.SettingsLandingFragment;
import y71.C39282o;

/* JADX INFO: renamed from: ea2.z */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12929z implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44657w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39282o f44658x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SettingsLandingFragment f44659y;

    public /* synthetic */ C12929z(C39282o c39282o, SettingsLandingFragment settingsLandingFragment, int i13) {
        this.f44657w = i13;
        this.f44658x = c39282o;
        this.f44659y = settingsLandingFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f44657w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return SettingsLandingFragment.m25126M2(this.f44658x, this.f44659y, composer, iIntValue);
            case 1:
                return SettingsLandingFragment.m25090D2(this.f44658x, this.f44659y, composer, iIntValue);
            case 2:
                return SettingsLandingFragment.m25146R2(this.f44658x, this.f44659y, composer, iIntValue);
            case 3:
                return SettingsLandingFragment.m25150S2(this.f44658x, this.f44659y, composer, iIntValue);
            case 4:
                return SettingsLandingFragment.m25130N2(this.f44658x, this.f44659y, composer, iIntValue);
            default:
                return SettingsLandingFragment.m25094E2(this.f44658x, this.f44659y, composer, iIntValue);
        }
    }
}
