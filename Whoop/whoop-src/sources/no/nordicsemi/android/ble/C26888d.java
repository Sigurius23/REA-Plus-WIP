package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import qd3.InterfaceC30297b;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C26888d implements InterfaceC26883a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107346a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BluetoothDevice f107347b;

    public /* synthetic */ C26888d(BluetoothDevice bluetoothDevice, int i13) {
        this.f107346a = i13;
        this.f107347b = bluetoothDevice;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26883a0
    /* JADX INFO: renamed from: a */
    public final void mo80232a(InterfaceC30297b interfaceC30297b) {
        switch (this.f107346a) {
            case 0:
                interfaceC30297b.mo92604t(this.f107347b);
                break;
            case 1:
                interfaceC30297b.mo92604t(this.f107347b);
                break;
            default:
                interfaceC30297b.mo92600c(this.f107347b);
                break;
        }
    }
}
