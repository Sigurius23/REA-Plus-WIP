package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;
import no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuException;
import no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import p031b9.AbstractC2875y;
import p460rg.AbstractC31375j;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingPermission"})
class LegacyDfuImpl extends BaseCustomDfuImpl {
    static final UUID DEFAULT_DFU_CONTROL_POINT_UUID;
    static final UUID DEFAULT_DFU_PACKET_UUID;
    static final UUID DEFAULT_DFU_SERVICE_UUID;
    static final UUID DEFAULT_DFU_VERSION_UUID;
    static UUID DFU_CONTROL_POINT_UUID = null;
    static UUID DFU_PACKET_UUID = null;
    static UUID DFU_SERVICE_UUID = null;
    private static final int DFU_STATUS_SUCCESS = 1;
    static UUID DFU_VERSION_UUID = null;
    private static final byte[] OP_CODE_ACTIVATE_AND_RESET;
    private static final int OP_CODE_ACTIVATE_AND_RESET_KEY = 5;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS_COMPLETE;
    private static final int OP_CODE_INIT_DFU_PARAMS_KEY = 2;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS_START;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_KEY = 17;
    private static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 8;
    private static final byte[] OP_CODE_RECEIVE_FIRMWARE_IMAGE;
    private static final int OP_CODE_RECEIVE_FIRMWARE_IMAGE_KEY = 3;
    private static final byte[] OP_CODE_RESET;
    private static final int OP_CODE_RESET_KEY = 6;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 16;
    private static final byte[] OP_CODE_START_DFU;
    private static final int OP_CODE_START_DFU_KEY = 1;
    private static final byte[] OP_CODE_START_DFU_V1;
    private static final byte[] OP_CODE_VALIDATE;
    private static final int OP_CODE_VALIDATE_KEY = 4;
    private final LegacyBluetoothCallback mBluetoothCallback;
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private boolean mImageSizeInProgress;
    private BluetoothGattCharacteristic mPacketCharacteristic;

    public class LegacyBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        public LegacyBluetoothCallback() {
            super();
        }

        @Override // no.nordicsemi.android.dfu.BaseDfuImpl.BaseBluetoothGattCallback, android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            if ((bArr[0] & 255) == 17) {
                LegacyDfuImpl.this.mProgressInfo.setBytesReceived(getInt(bArr, 1));
                handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            } else {
                LegacyDfuImpl legacyDfuImpl = LegacyDfuImpl.this;
                if (!legacyDfuImpl.mRemoteErrorOccurred) {
                    if ((bArr[2] & 255) != 1) {
                        legacyDfuImpl.mRemoteErrorOccurred = true;
                    }
                    handleNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
                }
            }
            LegacyDfuImpl.this.notifyLock();
        }

        @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl.BaseCustomBluetoothCallback
        public void onPacketCharacteristicWrite() {
            if (LegacyDfuImpl.this.mImageSizeInProgress) {
                LegacyDfuImpl.this.mImageSizeInProgress = false;
            }
        }
    }

    static {
        UUID uuid = new UUID(23296205844446L, 1523193452336828707L);
        DEFAULT_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(23300500811742L, 1523193452336828707L);
        DEFAULT_DFU_CONTROL_POINT_UUID = uuid2;
        UUID uuid3 = new UUID(23304795779038L, 1523193452336828707L);
        DEFAULT_DFU_PACKET_UUID = uuid3;
        UUID uuid4 = new UUID(23313385713630L, 1523193452336828707L);
        DEFAULT_DFU_VERSION_UUID = uuid4;
        DFU_SERVICE_UUID = uuid;
        DFU_CONTROL_POINT_UUID = uuid2;
        DFU_PACKET_UUID = uuid3;
        DFU_VERSION_UUID = uuid4;
        OP_CODE_START_DFU = new byte[]{1, 0};
        OP_CODE_START_DFU_V1 = new byte[]{1};
        OP_CODE_INIT_DFU_PARAMS = new byte[]{2};
        OP_CODE_INIT_DFU_PARAMS_START = new byte[]{2, 0};
        OP_CODE_INIT_DFU_PARAMS_COMPLETE = new byte[]{2, 1};
        OP_CODE_RECEIVE_FIRMWARE_IMAGE = new byte[]{3};
        OP_CODE_VALIDATE = new byte[]{4};
        OP_CODE_ACTIVATE_AND_RESET = new byte[]{5};
        OP_CODE_RESET = new byte[]{6};
        OP_CODE_PACKET_RECEIPT_NOTIF_REQ = new byte[]{8, 0, 0};
    }

    public LegacyDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new LegacyBluetoothCallback();
    }

    private int getStatusCode(byte[] bArr, int i13) throws UnknownResponseException {
        byte b;
        if (bArr == null || bArr.length != 3 || bArr[0] != 16 || bArr[1] != i13 || (b = bArr[2]) < 1 || b > 6) {
            throw new UnknownResponseException("Invalid response received", bArr, 16, i13);
        }
        return b;
    }

    private int readVersion(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic.getIntValue(18, 0).intValue();
        }
        return 0;
    }

    private void resetAndRestart(BluetoothGatt bluetoothGatt, Intent intent) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        this.mService.sendLogBroadcast(15, "Last upload interrupted. Restarting device...");
        this.mProgressInfo.setProgress(-5);
        logi("Sending Reset command (Op Code = 6)");
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
        this.mService.sendLogBroadcast(10, "Reset request sent");
        this.mService.waitUntilDisconnected();
        this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
        BluetoothGattService service = bluetoothGatt.getService(BaseDfuImpl.GENERIC_ATTRIBUTE_SERVICE_UUID);
        this.mService.refreshDeviceCache(bluetoothGatt, !((service == null || service.getCharacteristic(BaseDfuImpl.SERVICE_CHANGED_UUID) == null) ? false : true));
        this.mService.close(bluetoothGatt);
        logi("Restarting the service");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        restartService(intent2, false);
    }

    private void setImageSize(byte[] bArr, int i13, int i14) {
        bArr[i14] = (byte) (i13 & 255);
        bArr[i14 + 1] = (byte) ((i13 >> 8) & 255);
        bArr[i14 + 2] = (byte) ((i13 >> 16) & 255);
        bArr[i14 + 3] = (byte) ((i13 >> 24) & 255);
    }

    private void setNumberOfPackets(byte[] bArr, int i13) {
        bArr[1] = (byte) (i13 & 255);
        bArr[2] = (byte) ((i13 >> 8) & 255);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    private void writeImageSize(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        this.mReceivedData = null;
        this.mError = 0;
        this.mImageSizeInProgress = true;
        byte[] bArr = new byte[4];
        setImageSize(bArr, i13, 0);
        this.mService.sendLogBroadcast(1, "Writing to characteristic " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bArr));
        if (Build.VERSION.SDK_INT >= 33) {
            this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ", value=" + parse(bArr) + ", WRITE_TYPE_NO_RESPONSE)");
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
                        if (!this.mImageSizeInProgress || !this.mConnected || this.mError != 0 || this.mAborted) {
                            if (!this.mPaused) {
                                break;
                            }
                            loge("Sleeping interrupted", e);
                            if (!this.mAborted) {
                                throw new UploadAbortedException();
                            }
                            if (this.mConnected) {
                                throw new DeviceDisconnectedException("Unable to write Image Size: device disconnected");
                            }
                            if (this.mError == 0) {
                                throw new DfuException("Unable to write Image Size", this.mError);
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
        if (!this.mAborted) {
            throw new UploadAbortedException();
        }
        if (this.mConnected) {
            throw new DeviceDisconnectedException("Unable to write Image Size: device disconnected");
        }
        if (this.mError == 0) {
            throw new DfuException("Unable to write Image Size", this.mError);
        }
    }

    private void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        byte b = bArr[0];
        writeOpCode(bluetoothGattCharacteristic, bArr, b == 6 || b == 5);
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getControlPointCharacteristicUUID() {
        return DFU_CONTROL_POINT_UUID;
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getDfuServiceUUID() {
        return DFU_SERVICE_UUID;
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getPacketCharacteristicUUID() {
        return DFU_PACKET_UUID;
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service != null && (characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID)) != null && characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) != null) {
            this.mControlPointCharacteristic = characteristic;
            BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_PACKET_UUID);
            this.mPacketCharacteristic = characteristic2;
            if (characteristic2 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x03cb A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TRY_LEAVE, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x03d8 A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TRY_ENTER, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0416 A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:118:0x046a  */
    /* JADX WARN: Code duplicated, block: B:119:0x046b A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0475 A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0481 A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0485 A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:135:0x054b A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:137:0x05f7 A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0623  */
    /* JADX WARN: Code duplicated, block: B:140:0x0625  */
    /* JADX WARN: Code duplicated, block: B:142:0x062b A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0633 A[Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0649 A[ADDED_TO_REGION, Catch: UnknownResponseException -> 0x01eb, UploadAbortedException -> 0x01f2, RemoteDfuException -> 0x03c0, REMOVE, TRY_LEAVE, TryCatch #5 {UploadAbortedException -> 0x01f2, blocks: (B:43:0x013f, B:45:0x0144, B:49:0x01e7, B:74:0x0224, B:77:0x022d, B:79:0x0231, B:81:0x0261, B:83:0x02fd, B:109:0x03c7, B:111:0x03cb, B:114:0x03d8, B:116:0x043e, B:119:0x046b, B:120:0x0472, B:115:0x0416, B:122:0x0475, B:130:0x0485, B:131:0x04bd, B:132:0x04dc, B:133:0x04ef, B:135:0x054b, B:137:0x05f7, B:141:0x0626, B:142:0x062b, B:143:0x0632, B:144:0x0633, B:145:0x063a, B:147:0x063c, B:148:0x0641, B:128:0x0481, B:89:0x030c, B:90:0x0311, B:97:0x031c, B:101:0x0326, B:103:0x03bb, B:149:0x0642, B:150:0x0647, B:151:0x0648, B:152:0x0649, B:94:0x0318, B:96:0x031b, B:60:0x0206, B:62:0x020a, B:63:0x020d), top: B:166:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0319  */
    /* JADX WARN: Code duplicated, block: B:99:0x0323  */
    /* JADX WARN: Instruction removed from duplicated block: B:114:0x03d8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x0416, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x0485, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:135:0x054b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [no.nordicsemi.android.dfu.DfuBaseService] */
    /* JADX WARN: Type inference failed for: r0v9, types: [no.nordicsemi.android.dfu.DfuBaseService] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.bluetooth.BluetoothGatt] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v16, types: [no.nordicsemi.android.dfu.DfuBaseService] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.bluetooth.BluetoothGatt] */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.bluetooth.BluetoothGatt] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r36v0, types: [no.nordicsemi.android.dfu.BaseCustomDfuImpl, no.nordicsemi.android.dfu.BaseDfuImpl, no.nordicsemi.android.dfu.LegacyDfuImpl] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        String str;
        String str2;
        String str3;
        String str4;
        ?? r14;
        String str5;
        ?? r15;
        int i13;
        int iApplicationImageSize;
        int i14;
        ?? r10;
        ?? r16;
        String str6;
        String str7;
        boolean z4;
        ?? r17;
        int i15;
        long jElapsedRealtime;
        long jElapsedRealtime2;
        int statusCode;
        int statusCode2;
        boolean z13;
        int i16;
        int statusCode3;
        ?? r18;
        String str8 = "Reset request sent";
        Object obj = "Sending Start DFU command (Op Code = 1, Upload Mode = ";
        logw("Legacy DFU bootloader found");
        this.mProgressInfo.setProgress(-2);
        if (intent.hasExtra(DfuBaseService.EXTRA_MTU)) {
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_MTU, 517);
            logi(AbstractC2875y.m8295h(intExtra, "Requesting MTU = "));
            requestMtu(intExtra);
        }
        BluetoothGatt bluetoothGatt = this.mGatt;
        String str9 = "Starting DFU failed";
        int version = readVersion(bluetoothGatt.getService(DFU_SERVICE_UUID).getCharacteristic(DFU_VERSION_UUID));
        if (version >= 5 && this.mInitPacketStream == null) {
            logw(AbstractC2875y.m8295h(version, "Init packet not set for the DFU Bootloader version "));
            this.mService.sendLogBroadcast(20, "The Init packet is required by this version DFU Bootloader");
            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_INIT_PACKET_REQUIRED);
            return;
        }
        try {
            try {
                try {
                    enableCCCD(this.mControlPointCharacteristic, 1);
                    this.mService.sendLogBroadcast(10, "Notifications enabled");
                    int i17 = this.mFileType;
                    int i18 = (i17 & 1) > 0 ? this.mImageSizeInBytes : 0;
                    int i19 = (i17 & 2) > 0 ? this.mImageSizeInBytes : 0;
                    int i24 = i17 & 4;
                    int i25 = i24 > 0 ? this.mImageSizeInBytes : 0;
                    InputStream inputStream = this.mFirmwareStream;
                    int i26 = i19;
                    if (inputStream instanceof ArchiveInputStream) {
                        ArchiveInputStream archiveInputStream = (ArchiveInputStream) inputStream;
                        if (archiveInputStream.isSecureDfuRequired()) {
                            loge("Secure DFU is required to upload selected firmware");
                            this.mService.sendLogBroadcast(20, "The device does not support given firmware.");
                            logi("Sending Reset command (Op Code = 6)");
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                            this.mService.sendLogBroadcast(10, "Reset request sent");
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_INVALID);
                            return;
                        }
                        int iSoftDeviceImageSize = archiveInputStream.softDeviceImageSize();
                        int iBootloaderImageSize = archiveInputStream.bootloaderImageSize();
                        iApplicationImageSize = archiveInputStream.applicationImageSize();
                        i13 = iSoftDeviceImageSize;
                        i14 = iBootloaderImageSize;
                    } else {
                        i13 = i18;
                        iApplicationImageSize = i25;
                        i14 = i26;
                    }
                    str5 = "Sending Reset command (Op Code = 6)";
                    try {
                        try {
                            try {
                                byte[] bArr = OP_CODE_START_DFU;
                                try {
                                    bArr[1] = (byte) i17;
                                    logi("Sending Start DFU command (Op Code = 1, Upload Mode = " + i17 + ")");
                                    writeOpCode(this.mControlPointCharacteristic, bArr);
                                    this.mService.sendLogBroadcast(10, "DFU Start sent (Op Code = 1, Upload Mode = " + i17 + ")");
                                    logi("Sending image size array to DFU Packet (" + i13 + "b, " + i14 + "b, " + iApplicationImageSize + "b)");
                                    writeImageSize(this.mPacketCharacteristic, i13, i14, iApplicationImageSize);
                                    this.mService.sendLogBroadcast(10, "Firmware image size sent (" + i13 + "b, " + i14 + "b, " + iApplicationImageSize + "b)");
                                    byte[] notificationResponse = readNotificationResponse();
                                    int statusCode4 = getStatusCode(notificationResponse, 1);
                                    r16 = this.mService;
                                    r16.sendLogBroadcast(10, "Response received (Op Code = " + ((int) notificationResponse[1]) + " Status = " + statusCode4 + ")");
                                    r10 = 2;
                                    try {
                                        if (statusCode4 == 2) {
                                            resetAndRestart(bluetoothGatt, intent);
                                            return;
                                        }
                                        r10 = intent;
                                        r16 = bluetoothGatt;
                                        if (statusCode4 == 1) {
                                            r18 = r10;
                                            r18 = r10;
                                            str7 = ", Status = ";
                                            z4 = true;
                                            r17 = r18;
                                            if (this.mInitPacketStream != null) {
                                                this.mService.sendLogBroadcast(10, "Writing Initialize DFU Parameters...");
                                                if (z4) {
                                                    logi("Sending the Initialize DFU Parameters START (Op Code = 2, Value = 0)");
                                                    writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS_START);
                                                    logi("Sending " + this.mInitPacketSizeInBytes + " bytes of init packet");
                                                    writeInitData(this.mPacketCharacteristic, null);
                                                    logi("Sending the Initialize DFU Parameters COMPLETE (Op Code = 2, Value = 1)");
                                                    writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS_COMPLETE);
                                                    this.mService.sendLogBroadcast(10, "Initialize DFU Parameters completed");
                                                } else {
                                                    logi("Sending the Initialize DFU Parameters (Op Code = 2)");
                                                    writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS);
                                                    logi("Sending " + this.mInitPacketSizeInBytes + " bytes of init packet");
                                                    writeInitData(this.mPacketCharacteristic, null);
                                                }
                                                byte[] notificationResponse2 = readNotificationResponse();
                                                statusCode3 = getStatusCode(notificationResponse2, 2);
                                                this.mService.sendLogBroadcast(10, "Response received (Op Code = " + ((int) notificationResponse2[1]) + str7 + statusCode3 + ")");
                                                if (statusCode3 != 1) {
                                                    throw new RemoteDfuException("Device returned error after sending init packet", statusCode3);
                                                }
                                            }
                                            if (!z4 || ((i16 = this.mPacketsBeforeNotification) > 0 && i16 <= 10)) {
                                                i15 = this.mPacketsBeforeNotification;
                                            } else {
                                                i15 = 10;
                                            }
                                            if (i15 > 0) {
                                                this.mPacketsBeforeNotification = i15;
                                                logi("Sending the number of packets before notifications (Op Code = 8, Value = " + i15 + ")");
                                                byte[] bArr2 = OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
                                                setNumberOfPackets(bArr2, i15);
                                                writeOpCode(this.mControlPointCharacteristic, bArr2);
                                                this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 8) sent (Value = " + i15 + ")");
                                            }
                                            logi("Sending Receive Firmware Image request (Op Code = 3)");
                                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RECEIVE_FIRMWARE_IMAGE);
                                            this.mService.sendLogBroadcast(10, "Receive Firmware Image request sent");
                                            jElapsedRealtime = SystemClock.elapsedRealtime();
                                            this.mProgressInfo.setBytesSent(0);
                                            try {
                                                logi("Uploading firmware...");
                                                this.mService.sendLogBroadcast(10, "Uploading firmware...");
                                                uploadFirmwareImage(this.mPacketCharacteristic);
                                                jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                                byte[] notificationResponse3 = readNotificationResponse();
                                                statusCode = getStatusCode(notificationResponse3, 3);
                                                logi("Response received (Op Code = " + ((int) notificationResponse3[0]) + ", Req Op Code = " + ((int) notificationResponse3[1]) + str7 + ((int) notificationResponse3[2]) + ")");
                                                DfuBaseService dfuBaseService = this.mService;
                                                StringBuilder sb4 = new StringBuilder("Response received (Op Code = ");
                                                sb4.append((int) notificationResponse3[1]);
                                                sb4.append(str7);
                                                sb4.append(statusCode);
                                                sb4.append(")");
                                                dfuBaseService.sendLogBroadcast(10, sb4.toString());
                                                if (statusCode != 1) {
                                                    throw new RemoteDfuException("Device returned error after sending file", statusCode);
                                                }
                                                StringBuilder sb5 = new StringBuilder("Transfer of ");
                                                sb5.append(this.mProgressInfo.getBytesSent());
                                                sb5.append(" bytes has taken ");
                                                long j7 = jElapsedRealtime2 - jElapsedRealtime;
                                                sb5.append(j7);
                                                sb5.append(" ms");
                                                logi(sb5.toString());
                                                this.mService.sendLogBroadcast(10, "Upload completed in " + j7 + " ms");
                                                logi("Sending Validate request (Op Code = 4)");
                                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_VALIDATE);
                                                this.mService.sendLogBroadcast(10, "Validate request sent");
                                                byte[] notificationResponse4 = readNotificationResponse();
                                                statusCode2 = getStatusCode(notificationResponse4, 4);
                                                logi("Response received (Op Code = " + ((int) notificationResponse4[0]) + ", Req Op Code = " + ((int) notificationResponse4[1]) + str7 + ((int) notificationResponse4[2]) + ")");
                                                DfuBaseService dfuBaseService2 = this.mService;
                                                StringBuilder sb6 = new StringBuilder("Response received (Op Code = ");
                                                sb6.append((int) notificationResponse4[1]);
                                                sb6.append(str7);
                                                sb6.append(statusCode2);
                                                sb6.append(")");
                                                dfuBaseService2.sendLogBroadcast(10, sb6.toString());
                                                if (statusCode2 != 1) {
                                                    throw new RemoteDfuException("Device returned validation error", statusCode2);
                                                }
                                                this.mProgressInfo.setProgress(-5);
                                                logi("Sending Activate and Reset request (Op Code = 5)");
                                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_ACTIVATE_AND_RESET);
                                                this.mService.sendLogBroadcast(10, "Activate and Reset request sent");
                                                this.mService.waitUntilDisconnected();
                                                this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
                                                if (version == 5) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                finalize(r17, z13);
                                            } catch (DeviceDisconnectedException e5) {
                                                loge("Disconnected while sending data");
                                                throw e5;
                                            }
                                        }
                                        str6 = str9;
                                        try {
                                            throw new RemoteDfuException(str6, statusCode4);
                                        } catch (RemoteDfuException e13) {
                                            e = e13;
                                            try {
                                                try {
                                                    try {
                                                        if (e.getErrorNumber() == 3) {
                                                            throw e;
                                                        }
                                                        if (i24 > 0) {
                                                        }
                                                        throw e;
                                                    } catch (RemoteDfuException e14) {
                                                        e = e14;
                                                        if (e.getErrorNumber() == 3) {
                                                            throw e;
                                                        }
                                                        throw e;
                                                    }
                                                    if (e.getErrorNumber() == 3) {
                                                        throw e;
                                                    }
                                                    throw e;
                                                } catch (RemoteDfuException e15) {
                                                    e = e15;
                                                    r15 = r16;
                                                    int errorNumber = e.getErrorNumber();
                                                    int i27 = errorNumber | 256;
                                                    loge(e.getMessage() + ": " + AbstractC31375j.m96494j(i27));
                                                    DfuBaseService dfuBaseService3 = this.mService;
                                                    Locale locale = Locale.US;
                                                    dfuBaseService3.sendLogBroadcast(20, "Remote DFU error: " + AbstractC31375j.m96494j(i27));
                                                    logi(str5);
                                                    writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                                                    this.mService.sendLogBroadcast(10, str8);
                                                    this.mService.terminateConnection(r15, errorNumber | 8448);
                                                }
                                            } catch (RemoteDfuException e16) {
                                                e = e16;
                                                str9 = "Firmware image size sent (";
                                            }
                                        }
                                    } catch (RemoteDfuException e17) {
                                        e = e17;
                                        str6 = str9;
                                        if (e.getErrorNumber() == 3) {
                                            throw e;
                                        }
                                        if (i24 > 0 || (i17 & 3) <= 0) {
                                            throw e;
                                        }
                                        this.mRemoteErrorOccurred = false;
                                        logw("DFU target does not support (SD/BL)+App update");
                                        this.mService.sendLogBroadcast(15, "DFU target does not support (SD/BL)+App update");
                                        i17 &= -5;
                                        this.mFileType = i17;
                                        byte[] bArr3 = OP_CODE_START_DFU;
                                        bArr3[1] = (byte) i17;
                                        this.mProgressInfo.setTotalPart(2);
                                        ((ArchiveInputStream) this.mFirmwareStream).setContentType(i17);
                                        this.mService.sendLogBroadcast(1, "Sending only SD/BL");
                                        logi("Resending Start DFU command (Op Code = 1, Upload Mode = " + i17 + ")");
                                        writeOpCode(this.mControlPointCharacteristic, bArr3);
                                        this.mService.sendLogBroadcast(10, "DFU Start sent (Op Code = 1, Upload Mode = " + i17 + ")");
                                        logi("Sending image size array to DFU Packet: [" + i13 + "b, " + i14 + "b, 0b]");
                                        writeImageSize(this.mPacketCharacteristic, i13, i14, 0);
                                        this.mService.sendLogBroadcast(10, "Firmware image size sent [" + i13 + "b, " + i14 + "b, 0b]");
                                        byte[] notificationResponse5 = readNotificationResponse();
                                        int statusCode5 = getStatusCode(notificationResponse5, 1);
                                        this.mService.sendLogBroadcast(10, "Response received (Op Code = " + ((int) notificationResponse5[1]) + " Status = " + statusCode5 + ")");
                                        if (statusCode5 == 2) {
                                            resetAndRestart(r16, r10);
                                            return;
                                        }
                                        if (statusCode5 != 1) {
                                            r18 = r10;
                                            throw new RemoteDfuException(str6, statusCode5);
                                        }
                                        r18 = r10;
                                        str7 = ", Status = ";
                                        z4 = true;
                                        r17 = r18;
                                        if (this.mInitPacketStream != null) {
                                            this.mService.sendLogBroadcast(10, "Writing Initialize DFU Parameters...");
                                            if (z4) {
                                                logi("Sending the Initialize DFU Parameters START (Op Code = 2, Value = 0)");
                                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS_START);
                                                logi("Sending " + this.mInitPacketSizeInBytes + " bytes of init packet");
                                                writeInitData(this.mPacketCharacteristic, null);
                                                logi("Sending the Initialize DFU Parameters COMPLETE (Op Code = 2, Value = 1)");
                                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS_COMPLETE);
                                                this.mService.sendLogBroadcast(10, "Initialize DFU Parameters completed");
                                            } else {
                                                logi("Sending the Initialize DFU Parameters (Op Code = 2)");
                                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS);
                                                logi("Sending " + this.mInitPacketSizeInBytes + " bytes of init packet");
                                                writeInitData(this.mPacketCharacteristic, null);
                                            }
                                            byte[] notificationResponse6 = readNotificationResponse();
                                            statusCode3 = getStatusCode(notificationResponse6, 2);
                                            this.mService.sendLogBroadcast(10, "Response received (Op Code = " + ((int) notificationResponse6[1]) + str7 + statusCode3 + ")");
                                            if (statusCode3 != 1) {
                                                throw new RemoteDfuException("Device returned error after sending init packet", statusCode3);
                                            }
                                        }
                                        if (z4) {
                                            i15 = this.mPacketsBeforeNotification;
                                        } else {
                                            i15 = this.mPacketsBeforeNotification;
                                        }
                                        if (i15 > 0) {
                                            this.mPacketsBeforeNotification = i15;
                                            logi("Sending the number of packets before notifications (Op Code = 8, Value = " + i15 + ")");
                                            byte[] bArr4 = OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
                                            setNumberOfPackets(bArr4, i15);
                                            writeOpCode(this.mControlPointCharacteristic, bArr4);
                                            this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 8) sent (Value = " + i15 + ")");
                                        }
                                        logi("Sending Receive Firmware Image request (Op Code = 3)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RECEIVE_FIRMWARE_IMAGE);
                                        this.mService.sendLogBroadcast(10, "Receive Firmware Image request sent");
                                        jElapsedRealtime = SystemClock.elapsedRealtime();
                                        this.mProgressInfo.setBytesSent(0);
                                        logi("Uploading firmware...");
                                        this.mService.sendLogBroadcast(10, "Uploading firmware...");
                                        uploadFirmwareImage(this.mPacketCharacteristic);
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                        byte[] notificationResponse7 = readNotificationResponse();
                                        statusCode = getStatusCode(notificationResponse7, 3);
                                        logi("Response received (Op Code = " + ((int) notificationResponse7[0]) + ", Req Op Code = " + ((int) notificationResponse7[1]) + str7 + ((int) notificationResponse7[2]) + ")");
                                        DfuBaseService dfuBaseService4 = this.mService;
                                        StringBuilder sb7 = new StringBuilder("Response received (Op Code = ");
                                        sb7.append((int) notificationResponse7[1]);
                                        sb7.append(str7);
                                        sb7.append(statusCode);
                                        sb7.append(")");
                                        dfuBaseService4.sendLogBroadcast(10, sb7.toString());
                                        if (statusCode != 1) {
                                            throw new RemoteDfuException("Device returned error after sending file", statusCode);
                                        }
                                        StringBuilder sb8 = new StringBuilder("Transfer of ");
                                        sb8.append(this.mProgressInfo.getBytesSent());
                                        sb8.append(" bytes has taken ");
                                        long j13 = jElapsedRealtime2 - jElapsedRealtime;
                                        sb8.append(j13);
                                        sb8.append(" ms");
                                        logi(sb8.toString());
                                        this.mService.sendLogBroadcast(10, "Upload completed in " + j13 + " ms");
                                        logi("Sending Validate request (Op Code = 4)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_VALIDATE);
                                        this.mService.sendLogBroadcast(10, "Validate request sent");
                                        byte[] notificationResponse8 = readNotificationResponse();
                                        statusCode2 = getStatusCode(notificationResponse8, 4);
                                        logi("Response received (Op Code = " + ((int) notificationResponse8[0]) + ", Req Op Code = " + ((int) notificationResponse8[1]) + str7 + ((int) notificationResponse8[2]) + ")");
                                        DfuBaseService dfuBaseService5 = this.mService;
                                        StringBuilder sb9 = new StringBuilder("Response received (Op Code = ");
                                        sb9.append((int) notificationResponse8[1]);
                                        sb9.append(str7);
                                        sb9.append(statusCode2);
                                        sb9.append(")");
                                        dfuBaseService5.sendLogBroadcast(10, sb9.toString());
                                        if (statusCode2 != 1) {
                                            throw new RemoteDfuException("Device returned validation error", statusCode2);
                                        }
                                        this.mProgressInfo.setProgress(-5);
                                        logi("Sending Activate and Reset request (Op Code = 5)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_ACTIVATE_AND_RESET);
                                        this.mService.sendLogBroadcast(10, "Activate and Reset request sent");
                                        this.mService.waitUntilDisconnected();
                                        this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
                                        if (version == 5) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        finalize(r17, z13);
                                        if (e.getErrorNumber() == 3 || i17 != 4) {
                                            throw e;
                                        }
                                        this.mRemoteErrorOccurred = false;
                                        logw("DFU target does not support DFU v.2");
                                        this.mService.sendLogBroadcast(15, "DFU target does not support DFU v.2");
                                        this.mService.sendLogBroadcast(1, "Switching to DFU v.1");
                                        logi("Resending Start DFU command (Op Code = 1)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_START_DFU_V1);
                                        this.mService.sendLogBroadcast(10, "DFU Start sent (Op Code = 1)");
                                        logi("Sending application image size to DFU Packet: " + this.mImageSizeInBytes + " bytes");
                                        writeImageSize(this.mPacketCharacteristic, this.mImageSizeInBytes);
                                        this.mService.sendLogBroadcast(10, str9 + this.mImageSizeInBytes + " bytes)");
                                        byte[] notificationResponse9 = readNotificationResponse();
                                        int statusCode6 = getStatusCode(notificationResponse9, 1);
                                        DfuBaseService dfuBaseService6 = this.mService;
                                        StringBuilder sb10 = new StringBuilder("Response received (Op Code = ");
                                        sb10.append((int) notificationResponse9[1]);
                                        str7 = ", Status = ";
                                        sb10.append(str7);
                                        sb10.append(statusCode6);
                                        sb10.append(")");
                                        dfuBaseService6.sendLogBroadcast(10, sb10.toString());
                                        if (statusCode6 == 2) {
                                            resetAndRestart(r16, r10);
                                            return;
                                        }
                                        if (statusCode6 != 1) {
                                            throw new RemoteDfuException(str6, statusCode6);
                                        }
                                        z4 = false;
                                        r17 = r10;
                                        if (this.mInitPacketStream != null) {
                                            this.mService.sendLogBroadcast(10, "Writing Initialize DFU Parameters...");
                                            if (z4) {
                                                logi("Sending the Initialize DFU Parameters START (Op Code = 2, Value = 0)");
                                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS_START);
                                                logi("Sending " + this.mInitPacketSizeInBytes + " bytes of init packet");
                                                writeInitData(this.mPacketCharacteristic, null);
                                                logi("Sending the Initialize DFU Parameters COMPLETE (Op Code = 2, Value = 1)");
                                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS_COMPLETE);
                                                this.mService.sendLogBroadcast(10, "Initialize DFU Parameters completed");
                                            } else {
                                                logi("Sending the Initialize DFU Parameters (Op Code = 2)");
                                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS);
                                                logi("Sending " + this.mInitPacketSizeInBytes + " bytes of init packet");
                                                writeInitData(this.mPacketCharacteristic, null);
                                            }
                                            byte[] notificationResponse10 = readNotificationResponse();
                                            statusCode3 = getStatusCode(notificationResponse10, 2);
                                            this.mService.sendLogBroadcast(10, "Response received (Op Code = " + ((int) notificationResponse10[1]) + str7 + statusCode3 + ")");
                                            if (statusCode3 != 1) {
                                                throw new RemoteDfuException("Device returned error after sending init packet", statusCode3);
                                            }
                                        }
                                        if (z4) {
                                            i15 = this.mPacketsBeforeNotification;
                                        } else {
                                            i15 = this.mPacketsBeforeNotification;
                                        }
                                        if (i15 > 0) {
                                            this.mPacketsBeforeNotification = i15;
                                            logi("Sending the number of packets before notifications (Op Code = 8, Value = " + i15 + ")");
                                            byte[] bArr5 = OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
                                            setNumberOfPackets(bArr5, i15);
                                            writeOpCode(this.mControlPointCharacteristic, bArr5);
                                            this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 8) sent (Value = " + i15 + ")");
                                        }
                                        logi("Sending Receive Firmware Image request (Op Code = 3)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RECEIVE_FIRMWARE_IMAGE);
                                        this.mService.sendLogBroadcast(10, "Receive Firmware Image request sent");
                                        jElapsedRealtime = SystemClock.elapsedRealtime();
                                        this.mProgressInfo.setBytesSent(0);
                                        logi("Uploading firmware...");
                                        this.mService.sendLogBroadcast(10, "Uploading firmware...");
                                        uploadFirmwareImage(this.mPacketCharacteristic);
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                        byte[] notificationResponse11 = readNotificationResponse();
                                        statusCode = getStatusCode(notificationResponse11, 3);
                                        logi("Response received (Op Code = " + ((int) notificationResponse11[0]) + ", Req Op Code = " + ((int) notificationResponse11[1]) + str7 + ((int) notificationResponse11[2]) + ")");
                                        DfuBaseService dfuBaseService7 = this.mService;
                                        StringBuilder sb11 = new StringBuilder("Response received (Op Code = ");
                                        sb11.append((int) notificationResponse11[1]);
                                        sb11.append(str7);
                                        sb11.append(statusCode);
                                        sb11.append(")");
                                        dfuBaseService7.sendLogBroadcast(10, sb11.toString());
                                        if (statusCode != 1) {
                                            throw new RemoteDfuException("Device returned error after sending file", statusCode);
                                        }
                                        StringBuilder sb12 = new StringBuilder("Transfer of ");
                                        sb12.append(this.mProgressInfo.getBytesSent());
                                        sb12.append(" bytes has taken ");
                                        long j14 = jElapsedRealtime2 - jElapsedRealtime;
                                        sb12.append(j14);
                                        sb12.append(" ms");
                                        logi(sb12.toString());
                                        this.mService.sendLogBroadcast(10, "Upload completed in " + j14 + " ms");
                                        logi("Sending Validate request (Op Code = 4)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_VALIDATE);
                                        this.mService.sendLogBroadcast(10, "Validate request sent");
                                        byte[] notificationResponse12 = readNotificationResponse();
                                        statusCode2 = getStatusCode(notificationResponse12, 4);
                                        logi("Response received (Op Code = " + ((int) notificationResponse12[0]) + ", Req Op Code = " + ((int) notificationResponse12[1]) + str7 + ((int) notificationResponse12[2]) + ")");
                                        DfuBaseService dfuBaseService8 = this.mService;
                                        StringBuilder sb13 = new StringBuilder("Response received (Op Code = ");
                                        sb13.append((int) notificationResponse12[1]);
                                        sb13.append(str7);
                                        sb13.append(statusCode2);
                                        sb13.append(")");
                                        dfuBaseService8.sendLogBroadcast(10, sb13.toString());
                                        if (statusCode2 != 1) {
                                            throw new RemoteDfuException("Device returned validation error", statusCode2);
                                        }
                                        this.mProgressInfo.setProgress(-5);
                                        logi("Sending Activate and Reset request (Op Code = 5)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_ACTIVATE_AND_RESET);
                                        this.mService.sendLogBroadcast(10, "Activate and Reset request sent");
                                        this.mService.waitUntilDisconnected();
                                        this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
                                        if (version == 5) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        finalize(r17, z13);
                                    }
                                } catch (RemoteDfuException e18) {
                                    e = e18;
                                    r10 = intent;
                                    str6 = str9;
                                    r16 = bluetoothGatt;
                                } catch (UnknownResponseException e19) {
                                    e = e19;
                                    obj = bluetoothGatt;
                                    str3 = str8;
                                    str4 = str5;
                                    r14 = obj;
                                    loge(e.getMessage());
                                    this.mService.sendLogBroadcast(20, e.getMessage());
                                    logi(str4);
                                    writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                                    this.mService.sendLogBroadcast(10, str3);
                                    this.mService.terminateConnection(r14, DfuBaseService.ERROR_INVALID_RESPONSE);
                                }
                            } catch (UploadAbortedException e22) {
                                e = e22;
                                str = str8;
                                str2 = str5;
                                logi(str2);
                                this.mAborted = false;
                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                                this.mService.sendLogBroadcast(10, str);
                                throw e;
                            }
                        } catch (RemoteDfuException e24) {
                            e = e24;
                            r10 = intent;
                            r16 = bluetoothGatt;
                        } catch (UnknownResponseException e25) {
                            e = e25;
                            obj = bluetoothGatt;
                            str3 = str8;
                            str4 = str5;
                            r14 = obj;
                            loge(e.getMessage());
                            this.mService.sendLogBroadcast(20, e.getMessage());
                            logi(str4);
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                            this.mService.sendLogBroadcast(10, str3);
                            this.mService.terminateConnection(r14, DfuBaseService.ERROR_INVALID_RESPONSE);
                        }
                    } catch (UnknownResponseException e26) {
                        e = e26;
                    }
                } catch (UnknownResponseException e27) {
                    e = e27;
                    str8 = "Reset request sent";
                    str5 = "Sending Reset command (Op Code = 6)";
                } catch (UploadAbortedException e28) {
                    e = e28;
                    str8 = "Reset request sent";
                    str5 = "Sending Reset command (Op Code = 6)";
                }
            } catch (RemoteDfuException e29) {
                e = e29;
                str8 = "Reset request sent";
                str5 = "Sending Reset command (Op Code = 6)";
                r15 = bluetoothGatt;
            }
        } catch (UnknownResponseException e34) {
            e = e34;
            str3 = "Reset request sent";
            str4 = "Sending Reset command (Op Code = 6)";
            r14 = bluetoothGatt;
        } catch (UploadAbortedException e35) {
            e = e35;
            str = "Reset request sent";
            str2 = "Sending Reset command (Op Code = 6)";
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public BaseCustomDfuImpl.BaseCustomBluetoothCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    private void writeImageSize(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13, int i14, int i15) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        this.mReceivedData = null;
        this.mError = 0;
        this.mImageSizeInProgress = true;
        byte[] bArr = new byte[12];
        setImageSize(bArr, i13, 0);
        setImageSize(bArr, i14, 4);
        setImageSize(bArr, i15, 8);
        this.mService.sendLogBroadcast(1, "Writing to characteristic " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bArr));
        if (Build.VERSION.SDK_INT >= 33) {
            this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ", value=" + parse(bArr) + ", WRITE_TYPE_NO_RESPONSE)");
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
                        if (!this.mImageSizeInProgress || !this.mConnected || this.mError != 0 || this.mAborted) {
                            if (!this.mPaused) {
                                break;
                            }
                            loge("Sleeping interrupted", e);
                            if (!this.mAborted) {
                                if (this.mConnected) {
                                    if (this.mError == 0) {
                                        throw new DfuException("Unable to write Image Sizes", this.mError);
                                    }
                                    return;
                                }
                                throw new DeviceDisconnectedException("Unable to write Image Sizes: device disconnected");
                            }
                            throw new UploadAbortedException();
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
        if (!this.mAborted) {
            if (this.mConnected) {
                if (this.mError == 0) {
                    throw new DfuException("Unable to write Image Sizes", this.mError);
                }
                return;
            }
            throw new DeviceDisconnectedException("Unable to write Image Sizes: device disconnected");
        }
        throw new UploadAbortedException();
    }
}
