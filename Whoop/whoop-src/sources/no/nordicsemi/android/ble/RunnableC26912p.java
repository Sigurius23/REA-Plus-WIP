package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.util.Log;
import io.sentry.android.replay.C20214m;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.p */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC26912p implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107407w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f107408x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f107409y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f107410z;

    public /* synthetic */ RunnableC26912p(BleManagerHandler$4 bleManagerHandler$4, int i13, BluetoothGatt bluetoothGatt) {
        this.f107409y = bleManagerHandler$4;
        this.f107408x = i13;
        this.f107410z = bluetoothGatt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f107407w;
        int i14 = this.f107408x;
        Object obj = this.f107410z;
        Object obj2 = this.f107409y;
        switch (i13) {
            case 0:
                BluetoothGatt bluetoothGatt = (BluetoothGatt) obj;
                AbstractC26887c0 abstractC26887c0 = ((BleManagerHandler$4) obj2).f107300a;
                if (i14 == abstractC26887c0.f107320N && abstractC26887c0.f107321O && !abstractC26887c0.f107316J && !abstractC26887c0.f107318L && bluetoothGatt.getDevice().getBondState() != 11) {
                    abstractC26887c0.f107318L = true;
                    abstractC26887c0.m80323U1(2, new C26906m(11));
                    abstractC26887c0.m80323U1(3, new C26906m(10));
                    bluetoothGatt.discoverServices();
                }
                break;
            default:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                C20214m c20214m = ((C26895g0) obj2).f107362n;
                if (c20214m != null) {
                    try {
                        c20214m.m56140a(bluetoothDevice, i14);
                    } catch (Throwable th3) {
                        Log.e("k0", "Exception in Value callback", th3);
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC26912p(C26895g0 c26895g0, BluetoothDevice bluetoothDevice, int i13) {
        this.f107409y = c26895g0;
        this.f107410z = bluetoothDevice;
        this.f107408x = i13;
    }
}
