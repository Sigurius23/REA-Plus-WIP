package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import java.io.IOException;
import java.util.UUID;
import java.util.zip.CRC32;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.HexFileValidationException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingPermission"})
abstract class BaseCustomDfuImpl extends BaseDfuImpl {
    boolean mFirmwareUploadInProgress;
    private boolean mInitPacketInProgress;
    int mPacketsBeforeNotification;
    private int mPacketsSentSinceNotification;
    boolean mRemoteErrorOccurred;

    public class BaseCustomBluetoothCallback extends BaseDfuImpl.BaseBluetoothGattCallback {
        public BaseCustomBluetoothCallback() {
            super();
        }

        public void handleNotification(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, "Notification received from " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bArr));
            BaseCustomDfuImpl baseCustomDfuImpl = BaseCustomDfuImpl.this;
            baseCustomDfuImpl.mReceivedData = bArr;
            baseCustomDfuImpl.mFirmwareUploadInProgress = false;
        }

        public void handlePacketReceiptNotification(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            BaseCustomDfuImpl baseCustomDfuImpl = BaseCustomDfuImpl.this;
            if (!baseCustomDfuImpl.mFirmwareUploadInProgress) {
                handleNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
                return;
            }
            BluetoothGattCharacteristic characteristic = bluetoothGatt.getService(baseCustomDfuImpl.getDfuServiceUUID()).getCharacteristic(BaseCustomDfuImpl.this.getPacketCharacteristicUUID());
            try {
                BaseCustomDfuImpl.this.mPacketsSentSinceNotification = 0;
                BaseCustomDfuImpl.this.waitIfPaused();
                BaseCustomDfuImpl baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                if (!baseCustomDfuImpl2.mAborted && baseCustomDfuImpl2.mError == 0 && !baseCustomDfuImpl2.mRemoteErrorOccurred && !baseCustomDfuImpl2.mResetRequestSent) {
                    boolean zIsComplete = baseCustomDfuImpl2.mProgressInfo.isComplete();
                    boolean zIsObjectComplete = BaseCustomDfuImpl.this.mProgressInfo.isObjectComplete();
                    if (!zIsComplete && !zIsObjectComplete) {
                        int availableObjectSizeIsBytes = BaseCustomDfuImpl.this.mProgressInfo.getAvailableObjectSizeIsBytes();
                        BaseCustomDfuImpl baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                        byte[] bArr2 = baseCustomDfuImpl3.mBuffer;
                        if (availableObjectSizeIsBytes < bArr2.length) {
                            bArr2 = new byte[availableObjectSizeIsBytes];
                        }
                        BaseCustomDfuImpl.this.writePacket(bluetoothGatt, characteristic, bArr2, baseCustomDfuImpl3.mFirmwareStream.read(bArr2));
                        return;
                    }
                    BaseCustomDfuImpl baseCustomDfuImpl4 = BaseCustomDfuImpl.this;
                    baseCustomDfuImpl4.mFirmwareUploadInProgress = false;
                    baseCustomDfuImpl4.notifyLock();
                    return;
                }
                baseCustomDfuImpl2.mFirmwareUploadInProgress = false;
                baseCustomDfuImpl2.mService.sendLogBroadcast(15, "Upload terminated");
            } catch (HexFileValidationException unused) {
                BaseCustomDfuImpl.this.loge("Invalid HEX file");
                BaseCustomDfuImpl.this.mError = DfuBaseService.ERROR_FILE_INVALID;
            } catch (IOException e5) {
                BaseCustomDfuImpl.this.loge("Error while reading the input stream", e5);
                BaseCustomDfuImpl.this.mError = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
            if (i13 == 0) {
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                if (!uuid.equals(BaseCustomDfuImpl.this.getPacketCharacteristicUUID())) {
                    BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, "Data written to " + uuid);
                    BaseCustomDfuImpl.this.mRequestCompleted = true;
                } else if (BaseCustomDfuImpl.this.mInitPacketInProgress) {
                    BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, "Data written to " + uuid);
                    BaseCustomDfuImpl.this.mInitPacketInProgress = false;
                } else {
                    BaseCustomDfuImpl baseCustomDfuImpl = BaseCustomDfuImpl.this;
                    if (baseCustomDfuImpl.mFirmwareUploadInProgress) {
                        baseCustomDfuImpl.mPacketsSentSinceNotification++;
                        BaseCustomDfuImpl baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                        boolean z4 = baseCustomDfuImpl2.mPacketsBeforeNotification > 0 && baseCustomDfuImpl2.mPacketsSentSinceNotification >= BaseCustomDfuImpl.this.mPacketsBeforeNotification;
                        boolean zIsComplete = BaseCustomDfuImpl.this.mProgressInfo.isComplete();
                        boolean zIsObjectComplete = BaseCustomDfuImpl.this.mProgressInfo.isObjectComplete();
                        if (z4) {
                            return;
                        }
                        if (zIsComplete || zIsObjectComplete) {
                            BaseCustomDfuImpl baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                            baseCustomDfuImpl3.mFirmwareUploadInProgress = false;
                            baseCustomDfuImpl3.notifyLock();
                            return;
                        }
                        try {
                            BaseCustomDfuImpl.this.waitIfPaused();
                            BaseCustomDfuImpl baseCustomDfuImpl4 = BaseCustomDfuImpl.this;
                            if (!baseCustomDfuImpl4.mAborted && baseCustomDfuImpl4.mError == 0 && !baseCustomDfuImpl4.mRemoteErrorOccurred && !baseCustomDfuImpl4.mResetRequestSent) {
                                int availableObjectSizeIsBytes = baseCustomDfuImpl4.mProgressInfo.getAvailableObjectSizeIsBytes();
                                BaseCustomDfuImpl baseCustomDfuImpl5 = BaseCustomDfuImpl.this;
                                byte[] bArr = baseCustomDfuImpl5.mBuffer;
                                if (availableObjectSizeIsBytes < bArr.length) {
                                    bArr = new byte[availableObjectSizeIsBytes];
                                }
                                BaseCustomDfuImpl.this.writePacket(bluetoothGatt, bluetoothGattCharacteristic, bArr, baseCustomDfuImpl5.mFirmwareStream.read(bArr));
                                return;
                            }
                            baseCustomDfuImpl4.mFirmwareUploadInProgress = false;
                            baseCustomDfuImpl4.mService.sendLogBroadcast(15, "Upload terminated");
                            BaseCustomDfuImpl.this.notifyLock();
                            return;
                        } catch (HexFileValidationException unused) {
                            BaseCustomDfuImpl.this.loge("Invalid HEX file");
                            BaseCustomDfuImpl.this.mError = DfuBaseService.ERROR_FILE_INVALID;
                        } catch (IOException e5) {
                            BaseCustomDfuImpl.this.loge("Error while reading the input stream", e5);
                            BaseCustomDfuImpl.this.mError = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                        }
                    } else {
                        baseCustomDfuImpl.mService.sendLogBroadcast(5, "Data written to " + uuid);
                        onPacketCharacteristicWrite();
                    }
                }
            } else {
                BaseCustomDfuImpl baseCustomDfuImpl6 = BaseCustomDfuImpl.this;
                if (baseCustomDfuImpl6.mResetRequestSent) {
                    baseCustomDfuImpl6.mRequestCompleted = true;
                } else {
                    baseCustomDfuImpl6.loge(AbstractC2875y.m8295h(i13, "Characteristic write error: "));
                    BaseCustomDfuImpl.this.mError = i13 | DfuBaseService.ERROR_CONNECTION_MASK;
                }
            }
            BaseCustomDfuImpl.this.notifyLock();
        }

        public void onPacketCharacteristicWrite() {
        }
    }

    public BaseCustomDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        int i13 = 12;
        if (intent.hasExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED)) {
            boolean booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED, false);
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE, 12);
            if (intExtra >= 0 && intExtra <= 65535) {
                i13 = intExtra;
            }
            this.mPacketsBeforeNotification = booleanExtra ? i13 : 0;
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(dfuBaseService);
        boolean z4 = defaultSharedPreferences.getBoolean(DfuSettingsConstants.SETTINGS_PACKET_RECEIPT_NOTIFICATION_ENABLED, false);
        try {
            int i14 = Integer.parseInt(defaultSharedPreferences.getString(DfuSettingsConstants.SETTINGS_NUMBER_OF_PACKETS, String.valueOf(12)));
            if (i14 >= 0 && i14 <= 65535) {
                i13 = i14;
            }
        } catch (NumberFormatException unused) {
        }
        this.mPacketsBeforeNotification = z4 ? i13 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    private void writeInitPacket(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i13) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (bArr.length != i13) {
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, 0, bArr2, 0, i13);
            bArr = bArr2;
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mInitPacketInProgress = true;
        StringBuilder sb4 = new StringBuilder("Sending init packet (size: ");
        sb4.append(bArr.length);
        sb4.append(", value: 0x");
        logi(AbstractC25012a.m73376i(parse(bArr), ")", sb4));
        this.mService.sendLogBroadcast(1, "Writing to characteristic " + bluetoothGattCharacteristic.getUuid() + " value (0x): " + parse(bArr));
        if (Build.VERSION.SDK_INT >= 33) {
            this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ", value=0x" + parse(bArr) + ", WRITE_TYPE_NO_RESPONSE)");
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 1);
        } else {
            bluetoothGattCharacteristic.setWriteType(1);
            bluetoothGattCharacteristic.setValue(bArr);
            this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (!this.mInitPacketInProgress || !this.mConnected || this.mError != 0) {
                            if (!this.mPaused) {
                                break;
                            }
                            loge("Sleeping interrupted", e);
                            if (this.mConnected) {
                                throw new DeviceDisconnectedException("Unable to write Init DFU Parameters: device disconnected");
                            }
                            if (this.mError == 0) {
                                throw new DfuException("Unable to write Init DFU Parameters", this.mError);
                            }
                        }
                        this.mLock.wait();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (InterruptedException e5) {
            loge("Sleeping interrupted", e5);
        }
        if (this.mConnected) {
            throw new DeviceDisconnectedException("Unable to write Init DFU Parameters: device disconnected");
        }
        if (this.mError == 0) {
            throw new DfuException("Unable to write Init DFU Parameters", this.mError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writePacket(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i13) {
        if (i13 <= 0) {
            return;
        }
        if (bArr.length != i13) {
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, 0, bArr2, 0, i13);
            bArr = bArr2;
        }
        this.mProgressInfo.addBytesSent(i13);
        if (Build.VERSION.SDK_INT >= 33) {
            bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 1);
            return;
        }
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(bArr);
        bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
    }

    public void finalize(Intent intent, boolean z4) {
        boolean booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_KEEP_BOND, false);
        this.mService.refreshDeviceCache(this.mGatt, z4 || !booleanExtra);
        this.mService.close(this.mGatt);
        if (this.mGatt.getDevice().getBondState() == 12) {
            boolean booleanExtra2 = intent.getBooleanExtra(DfuBaseService.EXTRA_RESTORE_BOND, false);
            if (booleanExtra2 || !booleanExtra) {
                removeBond();
                this.mService.waitFor(2000L);
            }
            if (booleanExtra2 && (this.mFileType & 4) > 0 && !createBond()) {
                logw("Creating bond failed");
            }
        }
        if (this.mProgressInfo.isLastPart()) {
            this.mProgressInfo.setProgress(-6);
            return;
        }
        logi("Starting service that will upload application");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        intent2.putExtra(DfuBaseService.EXTRA_FILE_MIME_TYPE, "application/zip");
        intent2.putExtra(DfuBaseService.EXTRA_FILE_TYPE, 4);
        intent2.putExtra(DfuBaseService.EXTRA_PART_CURRENT, this.mProgressInfo.getCurrentPart() + 1);
        intent2.putExtra(DfuBaseService.EXTRA_PARTS_TOTAL, this.mProgressInfo.getTotalParts());
        restartService(intent2, true);
    }

    public abstract UUID getControlPointCharacteristicUUID();

    public abstract UUID getDfuServiceUUID();

    public abstract UUID getPacketCharacteristicUUID();

    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    public void uploadFirmwareImage(BluetoothGattCharacteristic bluetoothGattCharacteristic) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mFirmwareUploadInProgress = true;
        this.mPacketsSentSinceNotification = 0;
        try {
            int availableObjectSizeIsBytes = this.mProgressInfo.getAvailableObjectSizeIsBytes();
            byte[] bArr = this.mBuffer;
            if (availableObjectSizeIsBytes < bArr.length) {
                bArr = new byte[availableObjectSizeIsBytes];
            }
            int i13 = this.mFirmwareStream.read(bArr);
            this.mService.sendLogBroadcast(1, "Sending firmware to characteristic " + bluetoothGattCharacteristic.getUuid() + "...");
            writePacket(this.mGatt, bluetoothGattCharacteristic, bArr, i13);
            try {
                synchronized (this.mLock) {
                    while (true) {
                        try {
                            if (!this.mFirmwareUploadInProgress || this.mReceivedData != null || !this.mConnected || this.mError != 0) {
                                if (!this.mPaused) {
                                    break;
                                }
                                loge("Sleeping interrupted", e);
                                if (this.mConnected) {
                                    throw new DeviceDisconnectedException("Uploading Firmware Image failed: device disconnected");
                                }
                                if (this.mError == 0) {
                                    throw new DfuException("Uploading Firmware Image failed", this.mError);
                                }
                            }
                            this.mLock.wait();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (InterruptedException e5) {
                loge("Sleeping interrupted", e5);
            }
            if (this.mConnected) {
                throw new DeviceDisconnectedException("Uploading Firmware Image failed: device disconnected");
            }
            if (this.mError == 0) {
                throw new DfuException("Uploading Firmware Image failed", this.mError);
            }
        } catch (HexFileValidationException unused) {
            throw new DfuException("HEX file not valid", DfuBaseService.ERROR_FILE_INVALID);
        } catch (IOException unused2) {
            throw new DfuException("Error while reading file", DfuBaseService.ERROR_FILE_IO_EXCEPTION);
        }
    }

    public void writeInitData(BluetoothGattCharacteristic bluetoothGattCharacteristic, CRC32 crc32) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        try {
            byte[] bArr = this.mBuffer;
            while (true) {
                int i13 = this.mInitPacketStream.read(bArr, 0, bArr.length);
                if (i13 == -1) {
                    return;
                }
                writeInitPacket(bluetoothGattCharacteristic, bArr, i13);
                if (crc32 != null) {
                    crc32.update(bArr, 0, i13);
                }
            }
        } catch (IOException e5) {
            loge("Error while reading Init packet file", e5);
            throw new DfuException("Error while reading Init packet file", DfuBaseService.ERROR_FILE_ERROR);
        }
    }
}
