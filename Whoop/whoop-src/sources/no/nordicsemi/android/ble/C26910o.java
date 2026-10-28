package no.nordicsemi.android.ble;

import p031b9.AbstractC2875y;
import p530up.AbstractC35148d;
import rd3.AbstractC31252a;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.o */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C26910o implements InterfaceC26885b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f107404b;

    public /* synthetic */ C26910o(int i13, int i14) {
        this.f107403a = i14;
        this.f107404b = i13;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
    /* JADX INFO: renamed from: b */
    public final String mo80233b() {
        int i13 = this.f107403a;
        int i14 = this.f107404b;
        switch (i13) {
            case 0:
                int i15 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8296i(i14, "wait(", ")");
            case 1:
                int i16 = BleManagerHandler$4.f107299b;
                return "Error: (0x" + Integer.toHexString(i14) + "): " + AbstractC35148d.m111158I(i14);
            case 2:
                int i17 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8296i(i14, "wait(", ")");
            case 3:
                int i18 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8296i(i14, "Authentication required (", ")");
            case 4:
                int i19 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8295h(i14, "MTU changed to: ");
            case 5:
                int i24 = BleManagerHandler$4.f107299b;
                return AbstractC2875y.m8296i(i14, "Authentication required (", ")");
            case 6:
                int i25 = BleManagerHandler$4.f107299b;
                return "Error (0x" + Integer.toHexString(i14) + "): " + AbstractC35148d.m111158I(i14);
            default:
                return "characteristic.setWriteType(" + AbstractC31252a.m96278e(i14) + ")";
        }
    }
}
