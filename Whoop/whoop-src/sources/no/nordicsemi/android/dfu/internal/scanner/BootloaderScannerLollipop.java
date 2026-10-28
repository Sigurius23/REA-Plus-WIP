package no.nordicsemi.android.dfu.internal.scanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import java.util.ArrayList;
import java.util.List;
import no.nordicsemi.android.dfu.DfuDeviceSelector;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingPermission"})
@TargetApi(21)
class BootloaderScannerLollipop extends ScanCallback implements BootloaderScanner {
    private String mBootloaderAddress;
    private final String mDeviceAddress;
    private final String mDeviceAddressIncremented;
    private boolean mFound;
    private final Object mLock = new Object();
    private DfuDeviceSelector mSelector;

    public BootloaderScannerLollipop(String str, String str2) {
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

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i13, ScanResult scanResult) {
        String address = scanResult.getDevice().getAddress();
        if (this.mFound || !this.mSelector.matches(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), this.mDeviceAddress, this.mDeviceAddressIncremented)) {
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
        BluetoothLeScanner bluetoothLeScanner;
        this.mSelector = dfuDeviceSelector;
        this.mBootloaderAddress = null;
        this.mFound = false;
        new Thread(new RunnableC26931a(this, j7, 0), "Scanner timer").start();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.getState() != 12 || (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) == null) {
            return null;
        }
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        if (defaultAdapter.isOffloadedFilteringSupported()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ScanFilter.Builder().build());
            bluetoothLeScanner.startScan(arrayList, scanSettingsBuild, this);
        } else {
            bluetoothLeScanner.startScan((List<ScanFilter>) null, scanSettingsBuild, this);
        }
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
        bluetoothLeScanner.stopScan(this);
        return this.mBootloaderAddress;
    }
}
