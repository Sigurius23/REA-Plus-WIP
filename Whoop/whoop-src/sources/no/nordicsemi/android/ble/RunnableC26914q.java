package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.util.Log;
import md3.InterfaceC25456b;
import nd3.C26591a;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.q */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC26914q implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107412w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f107413x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f107414y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f107415z;

    public /* synthetic */ RunnableC26914q(Object obj, Object obj2, Object obj3, int i13) {
        this.f107412w = i13;
        this.f107413x = obj;
        this.f107414y = obj2;
        this.f107415z = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f107412w;
        Object obj = this.f107415z;
        Object obj2 = this.f107414y;
        Object obj3 = this.f107413x;
        switch (i13) {
            case 0:
                BluetoothGatt bluetoothGatt = (BluetoothGatt) obj2;
                AbstractC26887c0 abstractC26887c0 = ((BleManagerHandler$4) obj3).f107300a;
                abstractC26887c0.m80310G1(bluetoothGatt.getDevice(), (C26891e0) obj);
                if (abstractC26887c0.f107345z == null) {
                    abstractC26887c0.f107326T = 0;
                    abstractC26887c0.m80323U1(4, new C26919u(5));
                    abstractC26887c0.m80341k2();
                    abstractC26887c0.m80342l2(new C26894g(bluetoothGatt, 5));
                    abstractC26887c0.mo80336f2();
                }
                break;
            case 1:
                ((BleManagerHandler$4) obj3).f107300a.m80310G1(((BluetoothGatt) obj2).getDevice(), (C26891e0) obj);
                break;
            default:
                try {
                    ((InterfaceC25456b) obj3).mo74863a((BluetoothDevice) obj2, (C26591a) obj);
                } catch (Throwable th3) {
                    Log.e("o0", "Exception in Value callback", th3);
                }
                break;
        }
    }
}
