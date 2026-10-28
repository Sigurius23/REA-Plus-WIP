package qm2;

import android.view.View;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity;
import java.util.List;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qm2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30485b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125271w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BleChooseStrapActivity f125272x;

    public /* synthetic */ C30485b(BleChooseStrapActivity bleChooseStrapActivity, int i13) {
        this.f125271w = i13;
        this.f125272x = bleChooseStrapActivity;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f125271w) {
            case 0:
                return BleChooseStrapActivity.m27035z1(this.f125272x, (Long) obj);
            case 1:
                return BleChooseStrapActivity.m26982X0(this.f125272x, (String) obj);
            case 2:
                return BleChooseStrapActivity.m26984Y0(this.f125272x, (String) obj);
            case 3:
                return BleChooseStrapActivity.m27014n1(this.f125272x, (View) obj);
            case 4:
                return BleChooseStrapActivity.m27016o1(this.f125272x, (View) obj);
            case 5:
                return BleChooseStrapActivity.m27018p1(this.f125272x, (View) obj);
            case 6:
                return BleChooseStrapActivity.m27020q1(this.f125272x, (View) obj);
            case 7:
                return BleChooseStrapActivity.m26974T0(this.f125272x, (List) obj);
            default:
                return BleChooseStrapActivity.m26980W0(this.f125272x, (C30490g) obj);
        }
    }
}
