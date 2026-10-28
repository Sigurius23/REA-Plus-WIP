package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import qd3.InterfaceC30297b;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C26894g implements InterfaceC26883a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f107361b;

    public /* synthetic */ C26894g(Object obj, int i13) {
        this.f107360a = i13;
        this.f107361b = obj;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26883a0
    /* JADX INFO: renamed from: a */
    public void mo80232a(InterfaceC30297b interfaceC30297b) {
        int i13 = this.f107360a;
        Object obj = this.f107361b;
        switch (i13) {
            case 0:
                interfaceC30297b.mo92603q((BluetoothDevice) obj, 0);
                break;
            case 1:
                interfaceC30297b.mo92605u((BluetoothDevice) obj);
                break;
            default:
                int i14 = BleManagerHandler$4.f107299b;
                interfaceC30297b.mo92601e(((BluetoothGatt) obj).getDevice(), 5);
                break;
        }
    }
}
