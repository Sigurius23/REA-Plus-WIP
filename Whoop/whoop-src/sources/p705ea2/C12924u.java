package p705ea2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.settings.SettingsLandingFragment;

/* JADX INFO: renamed from: ea2.u */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12924u implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44646w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SettingsLandingFragment f44647x;

    public /* synthetic */ C12924u(SettingsLandingFragment settingsLandingFragment, int i13) {
        this.f44646w = i13;
        this.f44647x = settingsLandingFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f44646w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return SettingsLandingFragment.m25210h3(this.f44647x, composer, iIntValue);
            default:
                return SettingsLandingFragment.m25214i3(this.f44647x, composer, iIntValue);
        }
    }
}
