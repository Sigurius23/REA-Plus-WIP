package hh2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.stealthmode.view.StealthModeFragment;
import eh2.EnumC13196a;

/* JADX INFO: renamed from: hh2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17292c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f66460w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StealthModeFragment f66461x;

    public /* synthetic */ C17292c(StealthModeFragment stealthModeFragment, int i13) {
        this.f66460w = i13;
        this.f66461x = stealthModeFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f66460w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return StealthModeFragment.m26111Y(this.f66461x, (Composer) obj, iIntValue);
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                return StealthModeFragment.m26107U(this.f66461x, (EnumC13196a) obj, zBooleanValue);
        }
    }
}
