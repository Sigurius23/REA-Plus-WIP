package no.nordicsemi.android.dfu.internal.scanner;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import no.nordicsemi.android.dfu.DfuDeviceSelector;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingPermission"})
public class BootloaderScannerJB implements BootloaderScanner, BluetoothAdapter.LeScanCallback {
    private String mBootloaderAddress;
    private final String mDeviceAddress;
    private final String mDeviceAddressIncremented;
    private boolean mFound;
    private final Object mLock = new Object();
    private DfuDeviceSelector mSelector;

    public BootloaderScannerJB(String str, String str2) {
        this.mDeviceAddress = str;
        this.mDeviceAddressIncremented = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchUsing$0(long j7) {
        try {
            Thread.sleep(j7);
        } catch (InterruptedException unused) {
        }
        if (this.mFound) {
            return;
        }
        this.mBootloaderAddress = null;
        this.mFound = true;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i13, byte[] bArr) {
        String address = bluetoothDevice.getAddress();
        if (this.mFound || !this.mSelector.matches(bluetoothDevice, i13, bArr, this.mDeviceAddress, this.mDeviceAddressIncremented)) {
            return;
        }
        this.mBootloaderAddress = address;
        this.mFound = true;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // no.nordicsemi.android.dfu.internal.scanner.BootloaderScanner
    public String searchUsing(DfuDeviceSelector dfuDeviceSelector, long j7) {
        this.mSelector = dfuDeviceSelector;
        this.mBootloaderAddress = null;
        this.mFound = false;
        new Thread(new RunnableC26931a(this, j7, 1), "Scanner timer").start();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.getState() != 12) {
            return null;
        }
        defaultAdapter.startLeScan(this);
        try {
            synchronized (this.mLock) {
                while (!this.mFound) {
                    try {
                        this.mLock.wait();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (InterruptedException unused) {
        }
        defaultAdapter.stopLeScan(this);
        return this.mBootloaderAddress;
    }
}
