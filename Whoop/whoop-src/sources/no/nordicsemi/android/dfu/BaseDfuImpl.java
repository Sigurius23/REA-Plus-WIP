package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import ih0.AbstractC18489d0;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.UUID;
import no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerFactory;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingPermission"})
abstract class BaseDfuImpl implements DfuService {
    static final int INDICATIONS = 2;
    private static final int MAX_PACKET_SIZE_DEFAULT = 20;
    static final int NOTIFICATIONS = 1;
    private static final String TAG = "DfuImpl";
    boolean mAborted;
    private int mCurrentMtu;
    int mError;
    int mFileType;
    InputStream mFirmwareStream;
    BluetoothGatt mGatt;
    int mImageSizeInBytes;
    int mInitPacketSizeInBytes;
    InputStream mInitPacketStream;
    boolean mPaused;
    DfuProgressInfo mProgressInfo;
    boolean mRequestCompleted;
    boolean mResetRequestSent;
    DfuBaseService mService;
    static final UUID GENERIC_ATTRIBUTE_SERVICE_UUID = new UUID(26392574038016L, -9223371485494954757L);
    static final UUID SERVICE_CHANGED_UUID = new UUID(46200963207168L, -9223371485494954757L);
    static final UUID CLIENT_CHARACTERISTIC_CONFIG = new UUID(45088566677504L, -9223371485494954757L);
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    final Object mLock = new Object();
    byte[] mReceivedData = null;
    byte[] mBuffer = new byte[20];
    boolean mConnected = true;

    public class BaseBluetoothGattCallback extends DfuCallback.DfuGattCallback {
        public BaseBluetoothGattCallback() {
        }

        private String phyToString(int i13) {
            if (i13 == 1) {
                return "LE 1M";
            }
            if (i13 != 2) {
                return i13 != 3 ? AbstractC2875y.m8296i(i13, "UNKNOWN (", ")") : "LE Coded";
            }
            return "LE 2M";
        }

        public int getInt(byte[] bArr, int i13) {
            return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i13) {
            if (i13 == 0) {
                BaseDfuImpl.this.mService.sendLogBroadcast(5, "Read Response received from " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bArr));
                BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
                baseDfuImpl.mReceivedData = bArr;
                baseDfuImpl.mRequestCompleted = true;
            } else {
                BaseDfuImpl.this.loge(AbstractC2875y.m8295h(i13, "Characteristic read error: "));
                BaseDfuImpl.this.mError = i13 | DfuBaseService.ERROR_CONNECTION_MASK;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i13, byte[] bArr) {
            if (i13 == 0) {
                UUID uuid = bluetoothGattDescriptor.getUuid();
                UUID uuid2 = bluetoothGattDescriptor.getCharacteristic().getUuid();
                BaseDfuImpl.this.mReceivedData = bArr;
                if (BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG.equals(uuid)) {
                    BaseDfuImpl.this.mService.sendLogBroadcast(5, "Read Response received from descr." + uuid2 + ", value (0x): " + parse(bArr));
                    if (BaseDfuImpl.SERVICE_CHANGED_UUID.equals(uuid2)) {
                        BaseDfuImpl.this.mRequestCompleted = true;
                    } else {
                        BaseDfuImpl.this.loge("Unknown descriptor read");
                    }
                }
            } else {
                BaseDfuImpl.this.loge(AbstractC2875y.m8295h(i13, "Descriptor read error: "));
                BaseDfuImpl.this.mError = i13 | DfuBaseService.ERROR_CONNECTION_MASK;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i13) {
            if (i13 == 0) {
                UUID uuid = bluetoothGattDescriptor.getUuid();
                UUID uuid2 = bluetoothGattDescriptor.getCharacteristic().getUuid();
                if (BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG.equals(uuid)) {
                    BaseDfuImpl.this.mService.sendLogBroadcast(5, "Data written to descr." + uuid2);
                    if (BaseDfuImpl.SERVICE_CHANGED_UUID.equals(uuid2)) {
                        BaseDfuImpl.this.mService.sendLogBroadcast(1, "Indications enabled for " + uuid2);
                    } else {
                        BaseDfuImpl.this.mService.sendLogBroadcast(1, "Notifications enabled for " + uuid2);
                    }
                }
                BaseDfuImpl.this.mRequestCompleted = true;
            } else {
                BaseDfuImpl.this.loge(AbstractC2875y.m8295h(i13, "Descriptor write error: "));
                BaseDfuImpl.this.mError = i13 | DfuBaseService.ERROR_CONNECTION_MASK;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // no.nordicsemi.android.dfu.DfuCallback.DfuGattCallback
        public void onDisconnected() {
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            baseDfuImpl.mConnected = false;
            baseDfuImpl.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i13, int i14) {
            if (i14 == 0) {
                BaseDfuImpl.this.mService.sendLogBroadcast(5, "MTU changed to: " + i13);
                int i15 = i13 + (-3);
                BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
                if (i15 > baseDfuImpl.mBuffer.length) {
                    baseDfuImpl.mBuffer = new byte[i15];
                }
                baseDfuImpl.logi(AbstractC2875y.m8295h(i13, "MTU changed to: "));
            } else {
                BaseDfuImpl.this.logw(AbstractC25012a.m73372e(i14, i13, "Changing MTU failed: ", " (mtu: ", ")"));
                if (i14 == 4 && BaseDfuImpl.this.mCurrentMtu > 23) {
                    int i16 = BaseDfuImpl.this.mCurrentMtu - 3;
                    BaseDfuImpl baseDfuImpl2 = BaseDfuImpl.this;
                    if (i16 > baseDfuImpl2.mBuffer.length) {
                        baseDfuImpl2.mBuffer = new byte[baseDfuImpl2.mCurrentMtu - 3];
                        BaseDfuImpl.this.logi("MTU restored to: " + BaseDfuImpl.this.mCurrentMtu);
                    }
                }
            }
            BaseDfuImpl baseDfuImpl3 = BaseDfuImpl.this;
            baseDfuImpl3.mRequestCompleted = true;
            baseDfuImpl3.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i13, int i14, int i15) {
            if (i15 != 0) {
                BaseDfuImpl.this.logw(AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i15, i13, "Updating PHY failed: ", " (txPhy: ", ", rxPhy: "), i14, ")"));
                return;
            }
            BaseDfuImpl.this.mService.sendLogBroadcast(5, "PHY updated (TX: " + phyToString(i13) + ", RX: " + phyToString(i14) + ")");
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            StringBuilder sb4 = new StringBuilder("PHY updated (TX: ");
            sb4.append(phyToString(i13));
            sb4.append(", RX: ");
            baseDfuImpl.logi(AbstractC25012a.m73376i(phyToString(i14), ")", sb4));
        }

        public String parse(byte[] bArr) {
            int length;
            if (bArr == null || (length = bArr.length) == 0) {
                return "";
            }
            char[] cArr = new char[(length * 3) - 1];
            for (int i13 = 0; i13 < length; i13++) {
                byte b = bArr[i13];
                int i14 = i13 * 3;
                cArr[i14] = BaseDfuImpl.HEX_ARRAY[(b & 255) >>> 4];
                cArr[i14 + 1] = BaseDfuImpl.HEX_ARRAY[b & 15];
                if (i13 != length - 1) {
                    cArr[i14 + 2] = '-';
                }
            }
            return new String(cArr);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
            onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i13);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i13) {
            onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i13, bluetoothGattDescriptor.getValue());
        }
    }

    public BaseDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        this.mService = dfuBaseService;
        this.mProgressInfo = dfuBaseService.mProgressInfo;
    }

    private boolean createBondApi18(BluetoothDevice bluetoothDevice) {
        try {
            Method method = bluetoothDevice.getClass().getMethod("createBond", null);
            this.mService.sendLogBroadcast(0, "gatt.getDevice().createBond() (hidden)");
            return ((Boolean) method.invoke(bluetoothDevice, null)).booleanValue();
        } catch (Exception e5) {
            Log.w(TAG, "An exception occurred while creating bond", e5);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    private boolean isServiceChangedCCCDEnabled() throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattDescriptor descriptor;
        byte[] bArr;
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        BluetoothGatt bluetoothGatt = this.mGatt;
        BluetoothGattService service = bluetoothGatt.getService(GENERIC_ATTRIBUTE_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(SERVICE_CHANGED_UUID)) == null || (descriptor = characteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG)) == null) {
            return false;
        }
        this.mRequestCompleted = false;
        this.mReceivedData = null;
        this.mError = 0;
        logi("Reading Service Changed CCCD value...");
        this.mService.sendLogBroadcast(1, "Reading Service Changed CCCD value...");
        this.mService.sendLogBroadcast(0, "gatt.readDescriptor(" + descriptor.getUuid() + ")");
        bluetoothGatt.readDescriptor(descriptor);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mRequestCompleted || !this.mConnected || this.mError != 0) {
                            if (!this.mPaused) {
                                break;
                            }
                            loge("Sleeping interrupted", e);
                            if (this.mConnected) {
                                throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
                            }
                            if (this.mError == 0) {
                                throw new DfuException("Unable to read Service Changed CCCD", this.mError);
                            }
                            bArr = this.mReceivedData;
                            if (bArr == null && bArr.length == 2) {
                                byte b = bArr[0];
                                byte[] bArr2 = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
                                return b == bArr2[0] && bArr[1] == bArr2[1];
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
            throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
        }
        if (this.mError == 0) {
            throw new DfuException("Unable to read Service Changed CCCD", this.mError);
        }
        bArr = this.mReceivedData;
        return bArr == null ? false : false;
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void abort() {
        this.mPaused = false;
        this.mAborted = true;
        notifyLock();
    }

    public boolean createBond() {
        BluetoothDevice device = this.mGatt.getDevice();
        this.mRequestCompleted = false;
        this.mService.sendLogBroadcast(1, "Starting pairing...");
        this.mService.sendLogBroadcast(0, "gatt.getDevice().createBond()");
        boolean zCreateBond = device.createBond();
        try {
            synchronized (this.mLock) {
                while (zCreateBond) {
                    try {
                        if (this.mRequestCompleted || this.mAborted) {
                            break;
                        }
                        this.mLock.wait();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            return zCreateBond;
        } catch (InterruptedException e5) {
            loge("Sleeping interrupted", e5);
            return zCreateBond;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    public void enableCCCD(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        BluetoothGatt bluetoothGatt = this.mGatt;
        String str = i13 == 1 ? "notifications" : "indications";
        if (!this.mConnected) {
            throw new DeviceDisconnectedException(AbstractC11895b.m31996o("Unable to set ", str, " state: device disconnected"));
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mRequestCompleted = false;
        this.mReceivedData = null;
        this.mError = 0;
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG);
        logi(AbstractC11895b.m31996o("Enabling ", str, "..."));
        DfuBaseService dfuBaseService = this.mService;
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Enabling ", str, " for ");
        sbM53375p.append(bluetoothGattCharacteristic.getUuid());
        dfuBaseService.sendLogBroadcast(1, sbM53375p.toString());
        this.mService.sendLogBroadcast(0, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)");
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        DfuBaseService dfuBaseService2 = this.mService;
        StringBuilder sb4 = new StringBuilder("gatt.writeDescriptor(");
        sb4.append(descriptor.getUuid());
        sb4.append(i13 == 1 ? ", value=0x01-00)" : ", value=0x02-00)");
        dfuBaseService2.sendLogBroadcast(0, sb4.toString());
        if (Build.VERSION.SDK_INT >= 33) {
            bluetoothGatt.writeDescriptor(descriptor, i13 == 1 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        } else {
            descriptor.setValue(i13 == 1 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
            bluetoothGatt.writeDescriptor(descriptor);
        }
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mRequestCompleted || !this.mConnected || this.mError != 0) {
                            if (!this.mPaused) {
                                break;
                            }
                            loge("Sleeping interrupted", e);
                            if (this.mConnected) {
                                throw new DeviceDisconnectedException(AbstractC11895b.m31996o("Unable to set ", str, " state: device disconnected"));
                            }
                            if (this.mError == 0) {
                                throw new DfuException(AbstractC11895b.m31996o("Unable to set ", str, " state"), this.mError);
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
            throw new DeviceDisconnectedException(AbstractC11895b.m31996o("Unable to set ", str, " state: device disconnected"));
        }
        if (this.mError == 0) {
            throw new DfuException(AbstractC11895b.m31996o("Unable to set ", str, " state"), this.mError);
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean initialize(Intent intent, BluetoothGatt bluetoothGatt, int i13, InputStream inputStream, InputStream inputStream2) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        int iAvailable;
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        this.mGatt = bluetoothGatt;
        this.mFileType = i13;
        this.mFirmwareStream = inputStream;
        this.mInitPacketStream = inputStream2;
        int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_PART_CURRENT, 1);
        int intExtra2 = intent.getIntExtra(DfuBaseService.EXTRA_PARTS_TOTAL, 1);
        this.mCurrentMtu = intent.getIntExtra(DfuBaseService.EXTRA_CURRENT_MTU, 23);
        if (i13 > 4) {
            logw("DFU target does not support (SD/BL)+App update, splitting into 2 parts");
            this.mService.sendLogBroadcast(15, "Sending system components");
            int i14 = this.mFileType & (-5);
            this.mFileType = i14;
            ((ArchiveInputStream) this.mFirmwareStream).setContentType(i14);
            intExtra2 = 2;
        }
        if (intExtra == 2) {
            this.mService.sendLogBroadcast(15, "Sending application");
        }
        int iAvailable2 = 0;
        if (inputStream2 != null) {
            try {
                if (inputStream2.markSupported()) {
                    inputStream2.reset();
                }
                iAvailable = inputStream2.available();
            } catch (Exception unused) {
                iAvailable = 0;
            }
        } else {
            iAvailable = 0;
        }
        this.mInitPacketSizeInBytes = iAvailable;
        try {
            if (inputStream.markSupported()) {
                if (inputStream instanceof ArchiveInputStream) {
                    ((ArchiveInputStream) inputStream).fullReset();
                } else {
                    inputStream.reset();
                }
            }
            iAvailable2 = inputStream.available();
        } catch (Exception unused2) {
        }
        this.mImageSizeInBytes = iAvailable2;
        this.mProgressInfo.init(iAvailable2, intExtra, intExtra2);
        if (bluetoothGatt.getDevice().getBondState() == 12 && (service = bluetoothGatt.getService(GENERIC_ATTRIBUTE_SERVICE_UUID)) != null && (characteristic = service.getCharacteristic(SERVICE_CHANGED_UUID)) != null) {
            if (!isServiceChangedCCCDEnabled()) {
                enableCCCD(characteristic, 2);
            }
            logi("Service Changed indications enabled");
            this.mService.sendLogBroadcast(10, "Service Changed indications enabled");
        }
        return true;
    }

    public boolean isBonded() {
        return this.mGatt.getDevice().getBondState() == 12;
    }

    public void loge(String str) {
        Log.e(TAG, str);
    }

    public void logi(String str) {
        if (DfuBaseService.DEBUG) {
            Log.i(TAG, str);
        }
    }

    public void logw(String str) {
        if (DfuBaseService.DEBUG) {
            Log.w(TAG, str);
        }
    }

    public void notifyLock() {
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public void onBondStateChanged(int i13) {
        this.mRequestCompleted = true;
        notifyLock();
    }

    public String parse(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return "";
        }
        char[] cArr = new char[(length * 3) - 1];
        for (int i13 = 0; i13 < length; i13++) {
            byte b = bArr[i13];
            int i14 = i13 * 3;
            char[] cArr2 = HEX_ARRAY;
            cArr[i14] = cArr2[(b & 255) >>> 4];
            cArr[i14 + 1] = cArr2[b & 15];
            if (i13 != length - 1) {
                cArr[i14 + 2] = '-';
            }
        }
        return new String(cArr);
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void pause() {
        this.mPaused = true;
    }

    public byte[] readNotificationResponse() throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mReceivedData != null || !this.mConnected || this.mError != 0 || this.mAborted) {
                            if (!this.mPaused) {
                                break;
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
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to write Op Code: device disconnected");
        }
        if (this.mError == 0) {
            return this.mReceivedData;
        }
        throw new DfuException("Unable to write Op Code", this.mError);
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public void release() {
        this.mService = null;
    }

    public boolean removeBond() {
        BluetoothDevice device = this.mGatt.getDevice();
        if (device.getBondState() == 10) {
            return true;
        }
        this.mService.sendLogBroadcast(1, "Removing bond information...");
        boolean zBooleanValue = false;
        try {
            Method method = device.getClass().getMethod("removeBond", null);
            this.mRequestCompleted = false;
            this.mService.sendLogBroadcast(0, "gatt.getDevice().removeBond() (hidden)");
            zBooleanValue = ((Boolean) method.invoke(device, null)).booleanValue();
            try {
                synchronized (this.mLock) {
                    while (!this.mRequestCompleted && !this.mAborted) {
                        try {
                            this.mLock.wait();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (InterruptedException e5) {
                loge("Sleeping interrupted", e5);
            }
        } catch (Exception e13) {
            Log.w(TAG, "An exception occurred while removing bond information", e13);
        }
        return zBooleanValue;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    public void requestMtu(int i13) throws UploadAbortedException, DeviceDisconnectedException {
        if (Build.HARDWARE.equals("ums512_25c10")) {
            if (i13 != 516) {
                logw("MTU request disabled for this device. See https://github.com/NordicSemiconductor/Android-DFU-Library/issues/339");
                return;
            }
            logw("MTU request forced");
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mRequestCompleted = false;
        this.mService.sendLogBroadcast(1, "Requesting new MTU...");
        this.mService.sendLogBroadcast(0, "gatt.requestMtu(" + i13 + ")");
        if (this.mGatt.requestMtu(i13)) {
            try {
                synchronized (this.mLock) {
                    while (true) {
                        try {
                            if (this.mRequestCompleted || !this.mConnected || this.mError != 0) {
                                if (!this.mPaused) {
                                    break;
                                }
                                loge("Sleeping interrupted", e);
                                if (this.mConnected) {
                                    throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
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
                throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
            }
        }
    }

    public void restartService(Intent intent, boolean z4) {
        String strSearchUsing;
        if (z4) {
            long longExtra = intent.getLongExtra(DfuBaseService.EXTRA_SCAN_DELAY, 0L);
            long longExtra2 = intent.getLongExtra(DfuBaseService.EXTRA_SCAN_TIMEOUT, 5000L);
            this.mService.sendLogBroadcast(1, AbstractC31061c.m95636l(longExtra2, "Scanning for the DFU Bootloader... (timeout ", " ms)"));
            if (longExtra > 0) {
                this.mService.waitFor(longExtra);
            }
            strSearchUsing = BootloaderScannerFactory.getScanner(this.mGatt.getDevice().getAddress()).searchUsing(this.mService.getDeviceSelector(), longExtra2);
            logi(AbstractC11266d.m30461o("Scanning for new address finished with: ", strSearchUsing));
            if (strSearchUsing != null) {
                this.mService.sendLogBroadcast(5, "DFU Bootloader found with address ".concat(strSearchUsing));
            } else {
                this.mService.sendLogBroadcast(5, "DFU Bootloader not found. Trying the same address...");
            }
        } else {
            strSearchUsing = null;
        }
        if (strSearchUsing != null) {
            intent.putExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS, strSearchUsing);
        }
        intent.putExtra("no.nordicsemi.android.dfu.extra.EXTRA_DFU_ATTEMPT", 0);
        if (intent.getBooleanExtra(DfuBaseService.EXTRA_FOREGROUND_SERVICE, true)) {
            this.mService.startForegroundService(intent);
        } else {
            this.mService.startService(intent);
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void resume() {
        this.mPaused = false;
        notifyLock();
    }

    public void waitIfPaused() {
        try {
            synchronized (this.mLock) {
                while (this.mPaused) {
                    try {
                        this.mLock.wait();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (InterruptedException e5) {
            loge("Sleeping interrupted", e5);
        }
    }

    public void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, boolean z4) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mRequestCompleted = false;
        this.mResetRequestSent = z4;
        this.mService.sendLogBroadcast(1, "Writing to characteristic " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bArr));
        if (Build.VERSION.SDK_INT >= 33) {
            this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ", value=0x" + parse(bArr) + ", WRITE_TYPE_DEFAULT)");
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 2);
        } else {
            bluetoothGattCharacteristic.setWriteType(2);
            bluetoothGattCharacteristic.setValue(bArr);
            this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mRequestCompleted || !this.mConnected || this.mError != 0) {
                            if (!this.mPaused) {
                                break;
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
        boolean z13 = this.mResetRequestSent;
        if (!z13 && !this.mConnected) {
            throw new DeviceDisconnectedException(AbstractC18489d0.m53371l(new StringBuilder("Unable to write Op Code "), bArr[0], ": device disconnected"));
        }
        if (z13 || this.mError == 0) {
            return;
        }
        throw new DfuException("Unable to write Op Code " + ((int) bArr[0]), this.mError);
    }

    public void loge(String str, Throwable th3) {
        Log.e(TAG, str, th3);
    }
}
