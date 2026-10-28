package no.nordicsemi.android.ble;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.m */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C26906m implements InterfaceC26885b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107397a;

    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
    /* JADX INFO: renamed from: b */
    public final String mo80233b() {
        switch (this.f107397a) {
            case 0:
                int i13 = BleManagerHandler$4.f107299b;
                return "Services discovered";
            case 1:
                int i14 = BleManagerHandler$4.f107299b;
                return "Service Changed notifications enabled";
            case 2:
                int i15 = BleManagerHandler$4.f107299b;
                return "Notifications and indications disabled";
            case 3:
                int i16 = BleManagerHandler$4.f107299b;
                return "Notifications enabled";
            case 4:
                int i17 = BleManagerHandler$4.f107299b;
                return "Primary service found";
            case 5:
                int i18 = BleManagerHandler$4.f107299b;
                return "Indications enabled";
            case 6:
                int i19 = BleManagerHandler$4.f107299b;
                return "Secondary service found";
            case 7:
                int i24 = BleManagerHandler$4.f107299b;
                return "Device is not supported";
            case 8:
                int i25 = BleManagerHandler$4.f107299b;
                return "Service Changed indication received";
            case 9:
                int i26 = BleManagerHandler$4.f107299b;
                return "Discovering Services...";
            case 10:
                int i27 = BleManagerHandler$4.f107299b;
                return "gatt.discoverServices()";
            case 11:
                int i28 = BleManagerHandler$4.f107299b;
                return "Discovering services...";
            default:
                int i29 = BleManagerHandler$4.f107299b;
                return "gatt.close()";
        }
    }
}
