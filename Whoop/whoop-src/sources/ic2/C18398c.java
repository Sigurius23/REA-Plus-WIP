package ic2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.settings.notification.SettingsNotificationFragment;

/* JADX INFO: renamed from: ic2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18398c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71575w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SettingsNotificationFragment f71576x;

    public /* synthetic */ C18398c(SettingsNotificationFragment settingsNotificationFragment, int i13) {
        this.f71575w = i13;
        this.f71576x = settingsNotificationFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f71575w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SettingsNotificationFragment.m25668O(this.f71576x, (Composer) obj, iIntValue);
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                return SettingsNotificationFragment.m25671R(this.f71576x, (String) obj, zBooleanValue);
        }
    }
}
