package qm2;

import c93.InterfaceC4339a;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;

/* JADX INFO: renamed from: qm2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30491h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125320w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BleConnectStrapActivity f125321x;

    public /* synthetic */ C30491h(BleConnectStrapActivity bleConnectStrapActivity, int i13) {
        this.f125320w = i13;
        this.f125321x = bleConnectStrapActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f125320w) {
            case 0:
                return Boolean.valueOf(BleConnectStrapActivity.m27123u1(this.f125321x));
            case 1:
                return BleConnectStrapActivity.m27103k1(this.f125321x);
            default:
                return BleConnectStrapActivity.m27119s1(this.f125321x);
        }
    }
}
