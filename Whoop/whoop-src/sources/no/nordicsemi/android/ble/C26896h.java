package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import qd3.InterfaceC30297b;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C26896h implements InterfaceC26883a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BluetoothDevice f107365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f107366c;

    public /* synthetic */ C26896h(BluetoothDevice bluetoothDevice, int i13, int i14) {
        this.f107364a = i14;
        this.f107365b = bluetoothDevice;
        this.f107366c = i13;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26883a0
    /* JADX INFO: renamed from: a */
    public final void mo80232a(InterfaceC30297b interfaceC30297b) {
        switch (this.f107364a) {
            case 0:
                interfaceC30297b.mo92601e(this.f107365b, this.f107366c);
                break;
            case 1:
                interfaceC30297b.mo92603q(this.f107365b, this.f107366c);
                break;
            case 2:
                interfaceC30297b.mo92603q(this.f107365b, this.f107366c);
                break;
            default:
                interfaceC30297b.mo92603q(this.f107365b, this.f107366c);
                break;
        }
    }
}
