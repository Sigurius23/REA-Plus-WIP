package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.preference.PreferenceManager;
import java.util.UUID;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingPermission"})
class LegacyButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private int mVersion;
    static UUID DFU_SERVICE_UUID = LegacyDfuImpl.DEFAULT_DFU_SERVICE_UUID;
    static UUID DFU_CONTROL_POINT_UUID = LegacyDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
    static UUID DFU_VERSION_UUID = LegacyDfuImpl.DEFAULT_DFU_VERSION_UUID;
    private static final byte[] OP_CODE_ENTER_BOOTLOADER = {1, 4};

    public LegacyButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private String getVersionFeatures(int i13) {
        if (i13 == 0) {
            return "Bootloader from SDK 6.1 or older";
        }
        if (i13 == 1) {
            return "Application with Legacy buttonless update from SDK 7.0 or newer";
        }
        if (i13 == 5) {
            return "Bootloader from SDK 7.0 or newer. No bond sharing";
        }
        if (i13 == 6) {
            return "Bootloader from SDK 8.0 or newer. Bond sharing supported";
        }
        if (i13 != 7) {
            return i13 != 8 ? "Unknown version" : "Bootloader from SDK 9.0 or newer. Signature supported";
        }
        return "Bootloader from SDK 8.0 or newer. SHA-256 used instead of CRC-16 in the Init Packet";
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0040, B:14:0x0044, B:25:0x0057, B:27:0x005b, B:28:0x0063, B:19:0x004b, B:21:0x004f, B:23:0x0053), top: B:54:0x0040, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0063 A[EDGE_INSN: B:58:0x0063->B:28:0x0063 BREAK  A[LOOP:0: B:54:0x0040->B:27:0x005b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005b A[SYNTHETIC] */
    private int readVersion(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        byte[] bArr;
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read version number: device disconnected");
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (bluetoothGattCharacteristic == null) {
            return 0;
        }
        this.mReceivedData = null;
        this.mError = 0;
        logi("Reading DFU version number...");
        this.mService.sendLogBroadcast(1, "Reading DFU version number...");
        this.mService.sendLogBroadcast(0, "gatt.readCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
        bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mRequestCompleted && this.mReceivedData != null) {
                            if (this.mPaused) {
                                break;
                                break;
                            }
                            loge("Sleeping interrupted", e);
                            if (!this.mConnected) {
                                throw new DeviceDisconnectedException("Unable to read version number: device disconnected");
                            }
                            if (this.mError != 0) {
                                throw new DfuException("Unable to read version number", this.mError);
                            }
                            bArr = this.mReceivedData;
                            if (bArr != null) {
                            }
                            return 0;
                        }
                        if (!this.mConnected || this.mError != 0 || this.mAborted) {
                            if (this.mPaused) {
                                break;
                            }
                            loge("Sleeping interrupted", e);
                            if (!this.mConnected) {
                                throw new DeviceDisconnectedException("Unable to read version number: device disconnected");
                            }
                            if (this.mError != 0) {
                                throw new DfuException("Unable to read version number", this.mError);
                            }
                            bArr = this.mReceivedData;
                            if (bArr != null || bArr.length < 2) {
                                return 0;
                            }
                            return getShort(bArr, 0);
                        }
                        this.mRequestCompleted = false;
                        this.mLock.wait();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (InterruptedException e5) {
            loge("Sleeping interrupted", e5);
        }
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read version number: device disconnected");
        }
        if (this.mError != 0) {
            throw new DfuException("Unable to read version number", this.mError);
        }
        bArr = this.mReceivedData;
        if (bArr != null) {
        }
        return 0;
    }

    public int getShort(byte[] bArr, int i13) {
        return ((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255);
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        BluetoothGattCharacteristic characteristic;
        int version;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mControlPointCharacteristic = characteristic;
        this.mProgressInfo.setProgress(-2);
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_VERSION_UUID);
        if (characteristic2 != null) {
            version = readVersion(bluetoothGatt, characteristic2);
            this.mVersion = version;
            int i13 = version & 15;
            int i14 = version >> 8;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i14, i13, "Version number read: ", ".", " -> ");
            sbM30465s.append(getVersionFeatures(version));
            logi(sbM30465s.toString());
            this.mService.sendLogBroadcast(10, AbstractC2875y.m8294g(i14, i13, "Version number read: ", "."));
        } else {
            logi("No DFU Version characteristic found -> " + getVersionFeatures(0));
            this.mService.sendLogBroadcast(10, "DFU Version characteristic not found");
            version = 0;
        }
        boolean booleanExtra = PreferenceManager.getDefaultSharedPreferences(this.mService).getBoolean(DfuSettingsConstants.SETTINGS_ASSUME_DFU_NODE, false);
        if (intent.hasExtra(DfuBaseService.EXTRA_FORCE_DFU)) {
            booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_FORCE_DFU, false);
        }
        boolean z4 = bluetoothGatt.getServices().size() > 3;
        if (version == 0 && z4) {
            logi("Additional services found -> Bootloader from SDK 6.1. Updating SD and BL supported, extended init packet not supported");
        }
        return version == 1 || (!booleanExtra && version == 0 && z4);
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        logw("Application with legacy buttonless update found");
        this.mService.sendLogBroadcast(15, "Application with buttonless update found");
        boolean z4 = true;
        this.mService.sendLogBroadcast(1, "Jumping to the DFU Bootloader...");
        if (intent.hasExtra(DfuBaseService.EXTRA_MTU)) {
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_MTU, 517);
            logi(AbstractC2875y.m8295h(intExtra, "Requesting MTU = "));
            requestMtu(intExtra);
        }
        enableCCCD(this.mControlPointCharacteristic, 1);
        this.mService.sendLogBroadcast(10, "Notifications enabled");
        this.mProgressInfo.setProgress(-3);
        logi("Sending Start DFU command (Op Code = 1, Upload Mode = 4)");
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_ENTER_BOOTLOADER, true);
        this.mService.sendLogBroadcast(10, "Jump to bootloader sent (Op Code = 1, Upload Mode = 4)");
        BluetoothGatt bluetoothGatt = this.mGatt;
        boolean booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU, false);
        if (booleanExtra || this.mVersion == 0) {
            this.mService.disconnect(bluetoothGatt);
        } else {
            this.mService.waitUntilDisconnected();
            this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
        }
        logi("Device disconnected");
        if (!booleanExtra && this.mVersion != 0) {
            z4 = false;
        }
        finalize(intent, false, z4);
    }
}
