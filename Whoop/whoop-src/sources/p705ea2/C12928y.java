package p705ea2;

import android.view.View;
import com.whoop.data.remote.domain.response.growth.MembershipInfo;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.settings.AbstractC10089a;
import com.whoop.settings.SettingsLandingFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ea2.y */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12928y implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44655w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SettingsLandingFragment f44656x;

    public /* synthetic */ C12928y(SettingsLandingFragment settingsLandingFragment, int i13) {
        this.f44655w = i13;
        this.f44656x = settingsLandingFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44655w) {
            case 0:
                return SettingsLandingFragment.m25226l3(this.f44656x, (View) obj);
            case 1:
                return SettingsLandingFragment.m25230m3(this.f44656x, (String) obj);
            case 2:
                return SettingsLandingFragment.m25134O2(this.f44656x, obj);
            case 3:
                return SettingsLandingFragment.m25154T2(this.f44656x, obj);
            case 4:
                return SettingsLandingFragment.m25272x2(this.f44656x, (C12913j0) obj);
            case 5:
                return SettingsLandingFragment.m25106H2(this.f44656x, (MembershipInfo) obj);
            case 6:
                return SettingsLandingFragment.m25110I2(this.f44656x, (MembershipStatus) obj);
            default:
                return SettingsLandingFragment.m25114J2(this.f44656x, (AbstractC10089a) obj);
        }
    }
}
