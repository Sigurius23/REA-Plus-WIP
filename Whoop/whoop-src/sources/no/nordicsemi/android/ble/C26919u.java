package no.nordicsemi.android.ble;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.u */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C26919u implements InterfaceC26885b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107428a;

    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
    /* JADX INFO: renamed from: b */
    public final String mo80233b() {
        switch (this.f107428a) {
            case 0:
                int i13 = BleManagerHandler$4.f107299b;
                return "Service changed, invalidating services";
            case 1:
                int i14 = BleManagerHandler$4.f107299b;
                return "Discovering Services...";
            case 2:
                int i15 = BleManagerHandler$4.f107299b;
                return "gatt.discoverServices()";
            case 3:
                int i16 = BleManagerHandler$4.f107299b;
                return "Reliable Write executed";
            case 4:
                int i17 = BleManagerHandler$4.f107299b;
                return "Reliable Write aborted";
            case 5:
                int i18 = BleManagerHandler$4.f107299b;
                return "Disconnected";
            case 6:
                int i19 = C26904l.f107394c;
                return "Discovering services...";
            case 7:
                int i24 = C26904l.f107394c;
                return "gatt.discoverServices()";
            case 8:
                int i25 = C26904l.f107394c;
                return "Bonding failed";
            case 9:
                int i26 = C26904l.f107394c;
                return "Bond information removed";
            default:
                int i27 = C26904l.f107394c;
                return "Device bonded";
        }
    }
}
