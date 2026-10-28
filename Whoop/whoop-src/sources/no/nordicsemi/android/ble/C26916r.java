package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.r */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C26916r implements InterfaceC26885b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f107422b;

    public /* synthetic */ C26916r(Object obj, int i13) {
        this.f107421a = i13;
        this.f107422b = obj;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
    /* JADX INFO: renamed from: b */
    public final String mo80233b() {
        int i13 = this.f107421a;
        Object obj = this.f107422b;
        switch (i13) {
            case 0:
                int i14 = BleManagerHandler$4.f107299b;
                return "Data written to descr. " + ((BluetoothGattDescriptor) obj).getUuid();
            case 1:
                int i15 = BleManagerHandler$4.f107299b;
                return "Data written to " + ((BluetoothGattCharacteristic) obj).getUuid();
            default:
                return "autoConnect = false called failed; retrying with autoConnect = true".concat(((BleManagerHandler$4) obj).f107300a.f107321O ? "; reset connected to false" : "");
        }
    }
}
