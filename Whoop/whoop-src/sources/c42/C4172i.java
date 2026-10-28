package c42;

import a42.C0378a;
import androidx.compose.runtime.Composer;
import com.whoop.pregnancy.view.PregnancySettingsFragment;
import p114eb.C12982q;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: c42.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C4172i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16976w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4181r f16977x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0378a f16978y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ PregnancySettingsFragment f16979z;

    public /* synthetic */ C4172i(C4181r c4181r, C0378a c0378a, PregnancySettingsFragment pregnancySettingsFragment, int i13) {
        this.f16976w = i13;
        this.f16977x = c4181r;
        this.f16978y = c0378a;
        this.f16979z = pregnancySettingsFragment;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16976w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                C4181r c4181r = this.f16977x;
                C0378a c0378a = this.f16978y;
                return PregnancySettingsFragment.m23251C0(c4181r, this.f16979z, c0378a, (C12982q) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return PregnancySettingsFragment.m23263I0(this.f16977x, this.f16978y, this.f16979z, (C12982q) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return PregnancySettingsFragment.m23304j0(this.f16977x, this.f16978y, this.f16979z, (C12982q) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                C4181r c4181r2 = this.f16977x;
                C0378a c0378a2 = this.f16978y;
                return PregnancySettingsFragment.m23315u0(c4181r2, this.f16979z, c0378a2, (C12982q) obj, (Composer) obj2, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj3).intValue();
                return PregnancySettingsFragment.m23322z0(this.f16977x, this.f16978y, this.f16979z, (C12982q) obj, (Composer) obj2, iIntValue5);
        }
    }

    public /* synthetic */ C4172i(C4181r c4181r, PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a, int i13) {
        this.f16976w = i13;
        this.f16977x = c4181r;
        this.f16979z = pregnancySettingsFragment;
        this.f16978y = c0378a;
    }
}
