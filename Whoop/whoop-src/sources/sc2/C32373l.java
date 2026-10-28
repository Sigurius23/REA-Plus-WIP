package sc2;

import android.view.View;
import com.whoop.settings.strap.StrapSettingsFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sc2.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32373l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133988w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StrapSettingsFragment f133989x;

    public /* synthetic */ C32373l(StrapSettingsFragment strapSettingsFragment, int i13) {
        this.f133988w = i13;
        this.f133989x = strapSettingsFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f133988w) {
            case 0:
                return StrapSettingsFragment.m25787s0(this.f133989x, (C32383v) obj);
            case 1:
                return StrapSettingsFragment.m25741D0(this.f133989x, ((Boolean) obj).booleanValue());
            case 2:
                return StrapSettingsFragment.m25791w0(this.f133989x, (View) obj);
            case 3:
                return StrapSettingsFragment.m25780k0(this.f133989x, (View) obj);
            default:
                return StrapSettingsFragment.m25781l0(this.f133989x, (View) obj);
        }
    }
}
