package c42;

import a42.C0378a;
import c93.InterfaceC4339a;
import com.whoop.pregnancy.view.PregnancySettingsFragment;

/* JADX INFO: renamed from: c42.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C4173j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16980w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0378a f16981x;

    public /* synthetic */ C4173j(C0378a c0378a, int i13) {
        this.f16980w = i13;
        this.f16981x = c0378a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16980w) {
            case 0:
                return PregnancySettingsFragment.m23247A0(this.f16981x);
            case 1:
                return PregnancySettingsFragment.m23265J0(this.f16981x);
            case 2:
                return PregnancySettingsFragment.m23269L0(this.f16981x);
            case 3:
                return PregnancySettingsFragment.m23317w0(this.f16981x);
            default:
                return PregnancySettingsFragment.m23320y0(this.f16981x);
        }
    }
}
