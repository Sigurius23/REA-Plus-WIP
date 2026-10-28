package c42;

import com.whoop.pregnancy.view.PregnancySettingsFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c42.l */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C4175l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16985w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PregnancySettingsFragment f16986x;

    public /* synthetic */ C4175l(PregnancySettingsFragment pregnancySettingsFragment, int i13) {
        this.f16985w = i13;
        this.f16986x = pregnancySettingsFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16985w) {
            case 0:
                return PregnancySettingsFragment.m23253D0(this.f16986x, (String) obj);
            case 1:
                return PregnancySettingsFragment.m23309o0(this.f16986x, ((Boolean) obj).booleanValue());
            default:
                return PregnancySettingsFragment.m23311q0(this.f16986x, (String) obj);
        }
    }
}
