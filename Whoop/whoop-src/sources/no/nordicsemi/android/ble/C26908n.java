package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothGatt;
import qd3.InterfaceC30297b;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.n */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C26908n implements InterfaceC26883a0, InterfaceC26885b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BluetoothGatt f107401a;

    @Override // no.nordicsemi.android.ble.InterfaceC26883a0
    /* JADX INFO: renamed from: a */
    public void mo80232a(InterfaceC30297b interfaceC30297b) {
        int i13 = BleManagerHandler$4.f107299b;
        interfaceC30297b.mo92602f(this.f107401a.getDevice());
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
    /* JADX INFO: renamed from: b */
    public String mo80233b() {
        int i13 = BleManagerHandler$4.f107299b;
        return "Connected to " + this.f107401a.getDevice().getAddress();
    }
}
