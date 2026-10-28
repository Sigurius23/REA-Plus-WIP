package y42;

import android.bluetooth.BluetoothDevice;
import md3.InterfaceC25457c;
import md3.InterfaceC25459e;

/* JADX INFO: renamed from: y42.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39221c implements InterfaceC25459e, InterfaceC25457c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C39222d f168527w;

    public /* synthetic */ C39221c(C39222d c39222d) {
        this.f168527w = c39222d;
    }

    @Override // md3.InterfaceC25457c
    /* JADX INFO: renamed from: c */
    public void mo9034c(BluetoothDevice bluetoothDevice, int i13) {
        C39222d.a.m124954p2(this.f168527w, bluetoothDevice, i13);
    }

    @Override // md3.InterfaceC25459e
    /* JADX INFO: renamed from: d */
    public void mo9035d(BluetoothDevice bluetoothDevice) {
        C39222d.a.m124953o2(this.f168527w, bluetoothDevice);
    }
}
