package s92;

import android.bluetooth.BluetoothDevice;
import md3.InterfaceC25457c;
import md3.InterfaceC25459e;

/* JADX INFO: renamed from: s92.d */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C32296d implements InterfaceC25459e, InterfaceC25457c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C32297e f133654w;

    public /* synthetic */ C32296d(C32297e c32297e) {
        this.f133654w = c32297e;
    }

    @Override // md3.InterfaceC25457c
    /* JADX INFO: renamed from: c */
    public void mo9034c(BluetoothDevice bluetoothDevice, int i13) {
        C32297e.a.m100546p2(this.f133654w, bluetoothDevice, i13);
    }

    @Override // md3.InterfaceC25459e
    /* JADX INFO: renamed from: d */
    public void mo9035d(BluetoothDevice bluetoothDevice) {
        C32297e.a.m100545o2(this.f133654w, bluetoothDevice);
    }
}
