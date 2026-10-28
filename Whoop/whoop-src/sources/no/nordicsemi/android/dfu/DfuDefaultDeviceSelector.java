package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes3.dex */
class DfuDefaultDeviceSelector implements DfuDeviceSelector {
    @Override // no.nordicsemi.android.dfu.DfuDeviceSelector
    public boolean matches(BluetoothDevice bluetoothDevice, int i13, byte[] bArr, String str, String str2) {
        return str.equals(bluetoothDevice.getAddress()) || str2.equals(bluetoothDevice.getAddress());
    }
}
