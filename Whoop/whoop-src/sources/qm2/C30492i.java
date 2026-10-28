package qm2;

import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import mk0.EnumC25628a;
import p715kotlin.jvm.functions.Function1;
import st0.AbstractC32962f;

/* JADX INFO: renamed from: qm2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30492i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125322w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BleConnectStrapActivity f125323x;

    public /* synthetic */ C30492i(BleConnectStrapActivity bleConnectStrapActivity, int i13) {
        this.f125322w = i13;
        this.f125323x = bleConnectStrapActivity;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f125322w) {
            case 0:
                return BleConnectStrapActivity.m27058N0(this.f125323x, (EnumC25628a) obj);
            case 1:
                return BleConnectStrapActivity.m27062P0(this.f125323x, (Throwable) obj);
            case 2:
                return BleConnectStrapActivity.m27072U0(this.f125323x, (AbstractC32962f) obj);
            default:
                return BleConnectStrapActivity.m27068S0(this.f125323x, (AbstractC30500q) obj);
        }
    }
}
