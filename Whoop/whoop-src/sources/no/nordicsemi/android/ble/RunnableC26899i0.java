package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import md3.InterfaceC25455a;
import md3.InterfaceC25459e;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC26899i0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107370w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC26903k0 f107371x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ BluetoothDevice f107372y;

    public /* synthetic */ RunnableC26899i0(AbstractC26903k0 abstractC26903k0, BluetoothDevice bluetoothDevice, int i13) {
        this.f107370w = i13;
        this.f107371x = abstractC26903k0;
        this.f107372y = bluetoothDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f107370w;
        BluetoothDevice bluetoothDevice = this.f107372y;
        AbstractC26903k0 abstractC26903k0 = this.f107371x;
        switch (i13) {
            case 0:
                InterfaceC25459e interfaceC25459e = abstractC26903k0.f107388g;
                if (interfaceC25459e != null) {
                    try {
                        interfaceC25459e.mo9035d(bluetoothDevice);
                    } catch (Throwable th3) {
                        Log.e("k0", "Exception in Success callback", th3);
                        return;
                    }
                }
                break;
            default:
                InterfaceC25455a interfaceC25455a = abstractC26903k0.f107387f;
                if (interfaceC25455a != null) {
                    try {
                        interfaceC25455a.mo74862a(bluetoothDevice);
                    } catch (Throwable th4) {
                        Log.e("k0", "Exception in Before callback", th4);
                    }
                }
                break;
        }
    }
}
