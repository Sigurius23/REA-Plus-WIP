package qm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity;

/* JADX INFO: renamed from: qm2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30488e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125278w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BleChooseStrapActivity f125279x;

    public /* synthetic */ C30488e(BleChooseStrapActivity bleChooseStrapActivity, int i13) {
        this.f125278w = i13;
        this.f125279x = bleChooseStrapActivity;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f125278w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return BleChooseStrapActivity.m27024s1(this.f125279x, composer, iIntValue);
            case 1:
                return BleChooseStrapActivity.m27025t1(this.f125279x, composer, iIntValue);
            default:
                return BleChooseStrapActivity.m26986Z0(this.f125279x, composer, iIntValue);
        }
    }
}
