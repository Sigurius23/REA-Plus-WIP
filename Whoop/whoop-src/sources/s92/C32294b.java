package s92;

import android.bluetooth.BluetoothDevice;
import md3.InterfaceC25455a;
import md3.InterfaceC25457c;

/* JADX INFO: renamed from: s92.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C32294b implements InterfaceC25455a, InterfaceC25457c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C32297e f133650w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f133651x;

    public /* synthetic */ C32294b(C32297e c32297e, long j7) {
        this.f133650w = c32297e;
        this.f133651x = j7;
    }

    @Override // md3.InterfaceC25455a
    /* JADX INFO: renamed from: a */
    public void mo74862a(BluetoothDevice bluetoothDevice) {
        C32297e.m100539k0(this.f133650w, this.f133651x, bluetoothDevice);
    }

    @Override // md3.InterfaceC25457c
    /* JADX INFO: renamed from: c */
    public void mo9034c(BluetoothDevice bluetoothDevice, int i13) {
        C32297e.m100540l0(this.f133650w, this.f133651x, bluetoothDevice, i13);
    }
}
