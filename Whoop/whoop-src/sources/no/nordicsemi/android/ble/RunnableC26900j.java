package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import nd3.C26591a;
import pd3.C29111a;
import qd3.InterfaceC30297b;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.j */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC26900j implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107373w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f107374x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f107375y;

    public /* synthetic */ RunnableC26900j(int i13, Object obj, Object obj2) {
        this.f107373w = i13;
        this.f107374x = obj;
        this.f107375y = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f107373w;
        Object obj = this.f107375y;
        Object obj2 = this.f107374x;
        switch (i13) {
            case 0:
                ((InterfaceC26883a0) obj2).mo80232a((InterfaceC30297b) obj);
                break;
            case 1:
                AbstractC26907m0 abstractC26907m0 = (AbstractC26907m0) obj2;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                abstractC26907m0.f107398n = null;
                if (!abstractC26907m0.f107393l) {
                    abstractC26907m0.f107382a.mo60717e0(bluetoothDevice, abstractC26907m0);
                }
                break;
            default:
                C26915q0 c26915q0 = (C26915q0) obj2;
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) obj;
                Object obj3 = c26915q0.f107402q;
                if (obj3 != null) {
                    try {
                        ((C29111a) obj3).m88470a(bluetoothDevice2, new C26591a(c26915q0.f107416r));
                    } catch (Throwable th3) {
                        Log.e("k0", "Exception in Value callback", th3);
                    }
                }
                break;
        }
    }
}
