package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes3.dex */
public interface DfuDeviceSelector {
    boolean matches(BluetoothDevice bluetoothDevice, int i13, byte[] bArr, String str, String str2);
}
