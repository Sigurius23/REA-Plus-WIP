package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.SystemClock;
import ih0.AbstractC18489d0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;
import java.util.zip.CRC32;
import no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuExtendedErrorException;
import no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p463rj.AbstractC31479j;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
class SecureDfuImpl extends BaseCustomDfuImpl {
    static final UUID DEFAULT_DFU_CONTROL_POINT_UUID;
    static final UUID DEFAULT_DFU_PACKET_UUID;
    static final UUID DEFAULT_DFU_SERVICE_UUID;
    static UUID DFU_CONTROL_POINT_UUID = null;
    static UUID DFU_PACKET_UUID = null;
    static UUID DFU_SERVICE_UUID = null;
    private static final int DFU_STATUS_SUCCESS = 1;
    private static final int MAX_ATTEMPTS = 3;
    private static final int OBJECT_COMMAND = 1;
    private static final int OBJECT_DATA = 2;
    private static final byte[] OP_CODE_CALCULATE_CHECKSUM;
    private static final int OP_CODE_CALCULATE_CHECKSUM_KEY = 3;
    private static final byte[] OP_CODE_CREATE_COMMAND;
    private static final byte[] OP_CODE_CREATE_DATA;
    private static final int OP_CODE_CREATE_KEY = 1;
    private static final byte[] OP_CODE_EXECUTE;
    private static final int OP_CODE_EXECUTE_KEY = 4;
    private static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 2;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 96;
    private static final byte[] OP_CODE_SELECT_OBJECT;
    private static final int OP_CODE_SELECT_OBJECT_KEY = 6;
    private final SecureBluetoothCallback mBluetoothCallback;
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private BluetoothGattCharacteristic mPacketCharacteristic;
    private long prepareObjectDelay;

    public static class ObjectChecksum {
        int CRC32;
        int offset;

        public /* synthetic */ ObjectChecksum(int i13) {
            this();
        }

        private ObjectChecksum() {
        }
    }

    public static class ObjectInfo extends ObjectChecksum {
        int maxSize;

        public /* synthetic */ ObjectInfo(int i13) {
            this();
        }

        private ObjectInfo() {
            super(0);
        }
    }

    public class SecureBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        public SecureBluetoothCallback() {
            super();
        }

        @Override // no.nordicsemi.android.dfu.BaseDfuImpl.BaseBluetoothGattCallback, android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            if (bArr.length < 3) {
                SecureDfuImpl.this.loge("Empty response: " + parse(bArr));
                SecureDfuImpl secureDfuImpl = SecureDfuImpl.this;
                secureDfuImpl.mError = DfuBaseService.ERROR_INVALID_RESPONSE;
                secureDfuImpl.notifyLock();
                return;
            }
            if ((bArr[0] & 255) != SecureDfuImpl.OP_CODE_RESPONSE_CODE_KEY) {
                SecureDfuImpl.this.loge("Invalid response: " + parse(bArr));
                SecureDfuImpl.this.mError = DfuBaseService.ERROR_INVALID_RESPONSE;
            } else if ((bArr[1] & 255) != 3) {
                SecureDfuImpl secureDfuImpl2 = SecureDfuImpl.this;
                if (!secureDfuImpl2.mRemoteErrorOccurred) {
                    if ((bArr[2] & 255) != 1) {
                        secureDfuImpl2.mRemoteErrorOccurred = true;
                    }
                    handleNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
                }
            } else {
                int iIntValue = bluetoothGattCharacteristic.getIntValue(20, 3).intValue();
                if (((int) (((ArchiveInputStream) SecureDfuImpl.this.mFirmwareStream).getCrc32() & 4294967295L)) == bluetoothGattCharacteristic.getIntValue(20, 7).intValue()) {
                    SecureDfuImpl.this.mProgressInfo.setBytesReceived(iIntValue);
                } else {
                    SecureDfuImpl secureDfuImpl3 = SecureDfuImpl.this;
                    if (secureDfuImpl3.mFirmwareUploadInProgress) {
                        secureDfuImpl3.mFirmwareUploadInProgress = false;
                        secureDfuImpl3.notifyLock();
                        return;
                    }
                }
                handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic, bArr);
            }
            SecureDfuImpl.this.notifyLock();
        }
    }

    static {
        UUID uuid = new UUID(279658205548544L, -9223371485494954757L);
        DEFAULT_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8157989241631715488L, -6937650605005804976L);
        DEFAULT_DFU_CONTROL_POINT_UUID = uuid2;
        UUID uuid3 = new UUID(-8157989237336748192L, -6937650605005804976L);
        DEFAULT_DFU_PACKET_UUID = uuid3;
        DFU_SERVICE_UUID = uuid;
        DFU_CONTROL_POINT_UUID = uuid2;
        DFU_PACKET_UUID = uuid3;
        OP_CODE_CREATE_COMMAND = new byte[]{1, 1, 0, 0, 0, 0};
        OP_CODE_CREATE_DATA = new byte[]{1, 2, 0, 0, 0, 0};
        OP_CODE_PACKET_RECEIPT_NOTIF_REQ = new byte[]{2, 0, 0};
        OP_CODE_CALCULATE_CHECKSUM = new byte[]{3};
        OP_CODE_EXECUTE = new byte[]{4};
        OP_CODE_SELECT_OBJECT = new byte[]{6, 0};
    }

    public SecureDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new SecureBluetoothCallback();
    }

    private int getStatusCode(byte[] bArr, int i13) throws UnknownResponseException {
        byte b;
        if (bArr != null && bArr.length >= 3 && bArr[0] == OP_CODE_RESPONSE_CODE_KEY && bArr[1] == i13 && ((b = bArr[2]) == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 7 || b == 8 || b == 10 || b == 11)) {
            return b;
        }
        throw new UnknownResponseException("Invalid response received", bArr, OP_CODE_RESPONSE_CODE_KEY, i13);
    }

    private ObjectChecksum readChecksum() throws UploadAbortedException, RemoteDfuException, UnknownResponseException, DfuException, DeviceDisconnectedException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_CALCULATE_CHECKSUM);
        byte[] notificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(notificationResponse, 3);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Receiving Checksum failed", notificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Receiving Checksum failed", statusCode);
        }
        ObjectChecksum objectChecksum = new ObjectChecksum(0);
        objectChecksum.offset = unsignedBytesToInt(notificationResponse, 3);
        objectChecksum.CRC32 = unsignedBytesToInt(notificationResponse, 7);
        return objectChecksum;
    }

    private ObjectInfo selectObject(int i13) throws UploadAbortedException, RemoteDfuException, UnknownResponseException, DfuException, DeviceDisconnectedException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read object info: device disconnected");
        }
        byte[] bArr = OP_CODE_SELECT_OBJECT;
        bArr[1] = (byte) i13;
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] notificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(notificationResponse, 6);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Selecting object failed", notificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Selecting object failed", statusCode);
        }
        ObjectInfo objectInfo = new ObjectInfo(0);
        objectInfo.maxSize = unsignedBytesToInt(notificationResponse, 3);
        objectInfo.offset = unsignedBytesToInt(notificationResponse, 7);
        objectInfo.CRC32 = unsignedBytesToInt(notificationResponse, 11);
        return objectInfo;
    }

    private void sendFirmware(BluetoothGatt bluetoothGatt) throws UploadAbortedException, RemoteDfuException, UnknownResponseException, DfuException, DeviceDisconnectedException {
        int i13;
        String str;
        boolean z4;
        long j7;
        int i14 = this.mPacketsBeforeNotification;
        if (i14 > 0) {
            setPacketReceiptNotifications(i14);
            this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 2) sent (Value = " + i14 + ")");
        }
        logi("Setting object to Data (Op Code = 6, Type = 2)");
        ObjectInfo objectInfoSelectObject = selectObject(2);
        Locale locale = Locale.US;
        logi(String.format(locale, "Data object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(objectInfoSelectObject.maxSize), Integer.valueOf(objectInfoSelectObject.offset), Integer.valueOf(objectInfoSelectObject.CRC32)));
        this.mService.sendLogBroadcast(10, String.format(locale, "Data object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(objectInfoSelectObject.maxSize), Integer.valueOf(objectInfoSelectObject.offset), Integer.valueOf(objectInfoSelectObject.CRC32)));
        this.mProgressInfo.setMaxObjectSizeInBytes(objectInfoSelectObject.maxSize);
        int i15 = this.mImageSizeInBytes;
        int i16 = objectInfoSelectObject.maxSize;
        int i17 = ((i15 + i16) - 1) / i16;
        int i18 = objectInfoSelectObject.offset;
        if (i18 > 0) {
            try {
                i13 = i18 / i16;
                int i19 = i16 * i13;
                int i24 = i18 - i19;
                if (i24 == 0) {
                    i19 -= i16;
                } else {
                    i16 = i24;
                }
                int i25 = i19;
                if (i25 > 0) {
                    this.mFirmwareStream.read(new byte[i25]);
                    this.mFirmwareStream.mark(objectInfoSelectObject.maxSize);
                }
                this.mFirmwareStream.read(new byte[i16]);
                str = ")";
                if (((int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & 4294967295L)) == objectInfoSelectObject.CRC32) {
                    logi(objectInfoSelectObject.offset + " bytes of data sent before, CRC match");
                    this.mService.sendLogBroadcast(10, objectInfoSelectObject.offset + " bytes of data sent before, CRC match");
                    this.mProgressInfo.setBytesSent(objectInfoSelectObject.offset);
                    this.mProgressInfo.setBytesReceived(objectInfoSelectObject.offset);
                    if (i16 != objectInfoSelectObject.maxSize || objectInfoSelectObject.offset >= this.mImageSizeInBytes) {
                        z4 = true;
                    } else {
                        logi("Executing data object (Op Code = 4)");
                        try {
                            writeExecute();
                            this.mService.sendLogBroadcast(10, "Data object executed");
                        } catch (RemoteDfuException e5) {
                            if (e5.getErrorNumber() != 8) {
                                throw e5;
                            }
                            this.mService.sendLogBroadcast(10, "Data object already executed");
                            this.mRemoteErrorOccurred = false;
                        }
                    }
                } else {
                    logi(objectInfoSelectObject.offset + " bytes sent before, CRC does not match");
                    this.mService.sendLogBroadcast(15, objectInfoSelectObject.offset + " bytes sent before, CRC does not match");
                    this.mProgressInfo.setBytesSent(i25);
                    this.mProgressInfo.setBytesReceived(i25);
                    objectInfoSelectObject.offset = objectInfoSelectObject.offset - i16;
                    objectInfoSelectObject.CRC32 = 0;
                    this.mFirmwareStream.reset();
                    logi("Resuming from byte " + objectInfoSelectObject.offset + "...");
                    this.mService.sendLogBroadcast(10, "Resuming from byte " + objectInfoSelectObject.offset + "...");
                }
                z4 = false;
            } catch (IOException e13) {
                loge("Error while reading firmware stream", e13);
                this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                return;
            }
        } else {
            str = ")";
            this.mProgressInfo.setBytesSent(0);
            z4 = false;
            i13 = 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (objectInfoSelectObject.offset < this.mImageSizeInBytes) {
            int i26 = 1;
            while (this.mProgressInfo.getAvailableObjectSizeIsBytes() > 0) {
                if (z4) {
                    this.mService.sendLogBroadcast(10, "Resuming uploading firmware...");
                    z4 = false;
                } else {
                    int availableObjectSizeIsBytes = this.mProgressInfo.getAvailableObjectSizeIsBytes();
                    StringBuilder sbM30466t = AbstractC11266d.m30466t(availableObjectSizeIsBytes, "Creating Data object (Op Code = 1, Type = 2, Size = ", ") (");
                    int i27 = i13 + 1;
                    sbM30466t.append(i27);
                    boolean z13 = z4;
                    sbM30466t.append("/");
                    sbM30466t.append(i17);
                    sbM30466t.append(str);
                    logi(sbM30466t.toString());
                    writeCreateRequest(2, availableObjectSizeIsBytes);
                    this.mService.sendLogBroadcast(10, AbstractC25012a.m73372e(i27, i17, "Data object (", "/", ") created"));
                    long j13 = this.prepareObjectDelay;
                    if (j13 > 0 || i17 == 0) {
                        DfuBaseService dfuBaseService = this.mService;
                        if (j13 <= 0) {
                            j13 = 400;
                        }
                        dfuBaseService.waitFor(j13);
                    }
                    this.mService.sendLogBroadcast(10, "Uploading firmware...");
                    z4 = z13;
                }
                try {
                    logi("Uploading firmware...");
                    uploadFirmwareImage(this.mPacketCharacteristic);
                    logi("Sending Calculate Checksum command (Op Code = 3)");
                    ObjectChecksum checksum = readChecksum();
                    Locale locale2 = Locale.US;
                    logi(String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(checksum.offset), Integer.valueOf(checksum.CRC32)));
                    this.mService.sendLogBroadcast(10, String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(checksum.offset), Integer.valueOf(checksum.CRC32)));
                    int bytesSent = this.mProgressInfo.getBytesSent() - checksum.offset;
                    if (bytesSent > 0) {
                        logw(AbstractC31061c.m95635k(bytesSent, " bytes were lost!"));
                        this.mService.sendLogBroadcast(15, bytesSent + " bytes were lost");
                        try {
                            this.mFirmwareStream.reset();
                            this.mFirmwareStream.read(new byte[objectInfoSelectObject.maxSize - bytesSent]);
                            this.mProgressInfo.setBytesSent(checksum.offset);
                            int i28 = this.mPacketsBeforeNotification;
                            if (i28 == 0 || i28 > 1) {
                                this.mPacketsBeforeNotification = 1;
                                setPacketReceiptNotifications(1);
                                this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 2) sent (Value = 1)");
                            }
                        } catch (IOException e14) {
                            loge("Error while reading firmware stream", e14);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                            return;
                        } catch (Throwable th3) {
                            loge("Progress lost. Bytes sent: " + this.mProgressInfo.getBytesSent(), th3);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_PROGRESS_LOST);
                            return;
                        }
                    }
                    int crc32 = (int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & 4294967295L);
                    if (crc32 != checksum.CRC32) {
                        String str2 = String.format(locale2, "CRC does not match! Expected %08X but found %08X.", Integer.valueOf(crc32), Integer.valueOf(checksum.CRC32));
                        if (i26 >= 3) {
                            loge(str2);
                            this.mService.sendLogBroadcast(20, str2);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_CRC_ERROR);
                            return;
                        }
                        i26++;
                        String strConcat = str2.concat(" Retrying...(" + i26 + "/3)");
                        logi(strConcat);
                        this.mService.sendLogBroadcast(15, strConcat);
                        try {
                            this.mFirmwareStream.reset();
                            this.mProgressInfo.setBytesSent(((ArchiveInputStream) this.mFirmwareStream).getBytesRead());
                        } catch (IOException e15) {
                            loge("Error while resetting the firmware stream", e15);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                            return;
                        }
                    } else if (bytesSent > 0) {
                        z4 = true;
                    } else {
                        logi("Executing data object (Op Code = 4)");
                        writeExecute(this.mProgressInfo.isComplete());
                        this.mService.sendLogBroadcast(10, "Data object executed");
                        i13++;
                        this.mFirmwareStream.mark(0);
                        i26 = 1;
                    }
                } catch (DeviceDisconnectedException e16) {
                    loge("Disconnected while sending data");
                    throw e16;
                }
            }
            j7 = jElapsedRealtime;
        } else {
            j7 = jElapsedRealtime;
            logi("Executing data object (Op Code = 4)");
            writeExecute(true);
            this.mService.sendLogBroadcast(10, "Data object executed");
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb4 = new StringBuilder("Transfer of ");
        sb4.append(this.mProgressInfo.getBytesSent() - objectInfoSelectObject.offset);
        sb4.append(" bytes has taken ");
        long j14 = jElapsedRealtime2 - j7;
        logi(AbstractC11266d.m30457k(j14, " ms", sb4));
        this.mService.sendLogBroadcast(10, AbstractC31061c.m95636l(j14, "Upload completed in ", " ms"));
    }

    private void sendInitPacket(BluetoothGatt bluetoothGatt, boolean z4) throws UploadAbortedException, RemoteDfuException, UnknownResponseException, DfuException, DeviceDisconnectedException {
        boolean z13;
        boolean z14;
        int i13;
        boolean z15;
        boolean z16;
        CRC32 crc32 = new CRC32();
        logi("Setting object to Command (Op Code = 6, Type = 1)");
        int i14 = 1;
        ObjectInfo objectInfoSelectObject = selectObject(1);
        Locale locale = Locale.US;
        logi(String.format(locale, "Command object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(objectInfoSelectObject.maxSize), Integer.valueOf(objectInfoSelectObject.offset), Integer.valueOf(objectInfoSelectObject.CRC32)));
        this.mService.sendLogBroadcast(10, String.format(locale, "Command object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(objectInfoSelectObject.maxSize), Integer.valueOf(objectInfoSelectObject.offset), Integer.valueOf(objectInfoSelectObject.CRC32)));
        int i15 = this.mInitPacketSizeInBytes;
        if (!z4 || (i13 = objectInfoSelectObject.offset) <= 0 || i13 > i15) {
            z13 = false;
            z14 = false;
        } else {
            try {
                byte[] bArr = new byte[i13];
                this.mInitPacketStream.read(bArr);
                crc32.update(bArr);
                if (objectInfoSelectObject.CRC32 == ((int) (crc32.getValue() & 4294967295L))) {
                    logi("Init packet CRC is the same");
                    if (objectInfoSelectObject.offset == this.mInitPacketSizeInBytes) {
                        logi("-> Whole Init packet was sent before");
                        try {
                            this.mService.sendLogBroadcast(10, "Received CRC match Init packet");
                            z13 = true;
                            z14 = false;
                        } catch (IOException e5) {
                            e = e5;
                            z15 = true;
                            z16 = false;
                            loge(AbstractC18489d0.m53371l(new StringBuilder("Error while reading "), objectInfoSelectObject.offset, " bytes from the init packet stream"), e);
                            try {
                                this.mInitPacketStream.reset();
                                crc32.reset();
                                objectInfoSelectObject.offset = 0;
                                z13 = z15;
                                z14 = z16;
                            } catch (IOException e13) {
                                loge("Error while resetting the init packet stream", e13);
                                this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                                return;
                            }
                        }
                    } else {
                        logi("-> " + objectInfoSelectObject.offset + " bytes of Init packet were sent before");
                        try {
                            this.mService.sendLogBroadcast(10, "Resuming sending Init packet...");
                            z14 = true;
                            z13 = false;
                        } catch (IOException e14) {
                            e = e14;
                            z16 = true;
                            z15 = false;
                            loge(AbstractC18489d0.m53371l(new StringBuilder("Error while reading "), objectInfoSelectObject.offset, " bytes from the init packet stream"), e);
                            this.mInitPacketStream.reset();
                            crc32.reset();
                            objectInfoSelectObject.offset = 0;
                            z13 = z15;
                            z14 = z16;
                        }
                    }
                } else {
                    this.mInitPacketStream.reset();
                    crc32.reset();
                    objectInfoSelectObject.offset = 0;
                    z13 = false;
                    z14 = false;
                }
            } catch (IOException e15) {
                e = e15;
                z15 = false;
                z16 = false;
            }
        }
        if (!z13) {
            setPacketReceiptNotifications(0);
            this.mService.sendLogBroadcast(10, "Packet Receipt Notif disabled (Op Code = 2, Value = 0)");
            int i16 = 1;
            while (i16 <= 3) {
                if (!z14) {
                    logi(AbstractC18489d0.m53371l(new StringBuilder("Creating Init packet object (Op Code = 1, Type = 1, Size = "), this.mInitPacketSizeInBytes, ")"));
                    writeCreateRequest(i14, this.mInitPacketSizeInBytes);
                    this.mService.sendLogBroadcast(10, "Command object created");
                }
                try {
                    logi("Sending " + (this.mInitPacketSizeInBytes - objectInfoSelectObject.offset) + " bytes of init packet...");
                    writeInitData(this.mPacketCharacteristic, crc32);
                    int value = (int) (crc32.getValue() & 4294967295L);
                    DfuBaseService dfuBaseService = this.mService;
                    Locale locale2 = Locale.US;
                    dfuBaseService.sendLogBroadcast(10, String.format(locale2, "Command object sent (CRC = %08X)", Integer.valueOf(value)));
                    logi("Sending Calculate Checksum command (Op Code = 3)");
                    ObjectChecksum checksum = readChecksum();
                    this.mService.sendLogBroadcast(10, String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(checksum.offset), Integer.valueOf(checksum.CRC32)));
                    logi(String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(checksum.offset), Integer.valueOf(checksum.CRC32)));
                    if (value == checksum.CRC32) {
                        break;
                    }
                    if (i16 >= 3) {
                        loge("CRC does not match!");
                        this.mService.sendLogBroadcast(20, "CRC does not match!");
                        this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_CRC_ERROR);
                        return;
                    }
                    i16++;
                    logi(AbstractC2875y.m8296i(i16, "CRC does not match! Retrying...(", "/3)"));
                    this.mService.sendLogBroadcast(15, "CRC does not match! Retrying...(" + i16 + "/3)");
                    try {
                        objectInfoSelectObject.offset = 0;
                        objectInfoSelectObject.CRC32 = 0;
                        this.mInitPacketStream.reset();
                        crc32.reset();
                        z14 = false;
                        i14 = 1;
                    } catch (IOException e16) {
                        loge("Error while resetting the init packet stream", e16);
                        this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                        return;
                    }
                } catch (DeviceDisconnectedException e17) {
                    loge("Disconnected while sending init packet");
                    throw e17;
                }
            }
        }
        logi("Executing init packet (Op Code = 4)");
        writeExecute();
        this.mService.sendLogBroadcast(10, "Command object executed");
    }

    private void setNumberOfPackets(byte[] bArr, int i13) {
        bArr[1] = (byte) (i13 & 255);
        bArr[2] = (byte) ((i13 >> 8) & 255);
    }

    private void setObjectSize(byte[] bArr, int i13) {
        bArr[2] = (byte) (i13 & 255);
        bArr[3] = (byte) ((i13 >> 8) & 255);
        bArr[4] = (byte) ((i13 >> 16) & 255);
        bArr[5] = (byte) ((i13 >> 24) & 255);
    }

    private void setPacketReceiptNotifications(int i13) throws UploadAbortedException, RemoteDfuException, UnknownResponseException, DfuException, DeviceDisconnectedException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
        logi(AbstractC2875y.m8296i(i13, "Sending the number of packets before notifications (Op Code = 2, Value = ", ")"));
        byte[] bArr = OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
        setNumberOfPackets(bArr, i13);
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] notificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(notificationResponse, 2);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Sending the number of packets failed", notificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Sending the number of packets failed", statusCode);
        }
    }

    private int unsignedBytesToInt(byte[] bArr, int i13) {
        return (bArr[i13] & 255) + ((bArr[i13 + 1] & 255) << 8) + ((bArr[i13 + 2] & 255) << 16) + ((bArr[i13 + 3] & 255) << 24);
    }

    private void writeCreateRequest(int i13, int i14) throws UploadAbortedException, RemoteDfuException, UnknownResponseException, DfuException, DeviceDisconnectedException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to create object: device disconnected");
        }
        byte[] bArr = i13 == 1 ? OP_CODE_CREATE_COMMAND : OP_CODE_CREATE_DATA;
        setObjectSize(bArr, i14);
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] notificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(notificationResponse, 1);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Creating Command object failed", notificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Creating Command object failed", statusCode);
        }
    }

    private void writeExecute() throws UploadAbortedException, RemoteDfuException, UnknownResponseException, DfuException, DeviceDisconnectedException {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_EXECUTE);
        byte[] notificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(notificationResponse, 4);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Executing object failed", notificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Executing object failed", statusCode);
        }
    }

    private void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        writeOpCode(bluetoothGattCharacteristic, bArr, false);
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

    @Override // no.nordicsemi.android.dfu.BaseDfuImpl, no.nordicsemi.android.dfu.DfuService
    public boolean initialize(Intent intent, BluetoothGatt bluetoothGatt, int i13, InputStream inputStream, InputStream inputStream2) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        if (inputStream2 != null) {
            return super.initialize(intent, bluetoothGatt, i13, inputStream, inputStream2);
        }
        this.mService.sendLogBroadcast(20, "The Init packet is required by this version DFU Bootloader");
        this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_INIT_PACKET_REQUIRED);
        return false;
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

    @Override // no.nordicsemi.android.dfu.DfuService
    public void performDfu(Intent intent) throws UploadAbortedException, DfuException, DeviceDisconnectedException {
        logw("Secure DFU bootloader found");
        this.mProgressInfo.setProgress(-2);
        BluetoothGatt bluetoothGatt = this.mGatt;
        if (intent.hasExtra(DfuBaseService.EXTRA_MTU)) {
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_MTU, 517);
            logi(AbstractC2875y.m8295h(intExtra, "Requesting MTU = "));
            requestMtu(intExtra);
        }
        this.prepareObjectDelay = intent.getLongExtra(DfuBaseService.EXTRA_DATA_OBJECT_DELAY, 0L);
        try {
            try {
                boolean z4 = true;
                enableCCCD(this.mControlPointCharacteristic, 1);
                this.mService.sendLogBroadcast(10, "Notifications enabled");
                if (intent.hasExtra(DfuBaseService.EXTRA_DISABLE_RESUME) && intent.getBooleanExtra(DfuBaseService.EXTRA_DISABLE_RESUME, false)) {
                    z4 = false;
                }
                if (!z4) {
                    logi("Resume feature disabled. Performing fresh DFU");
                }
                try {
                    sendInitPacket(bluetoothGatt, z4);
                } catch (RemoteDfuException e5) {
                    if (this.mProgressInfo.isLastPart()) {
                        throw e5;
                    }
                    this.mRemoteErrorOccurred = false;
                    logw("Sending SD+BL failed. Trying to send App only");
                    this.mService.sendLogBroadcast(15, "Invalid system components. Trying to send application");
                    this.mFileType = 4;
                    ArchiveInputStream archiveInputStream = (ArchiveInputStream) this.mFirmwareStream;
                    archiveInputStream.setContentType(4);
                    byte[] applicationInit = archiveInputStream.getApplicationInit();
                    this.mInitPacketStream = new ByteArrayInputStream(applicationInit);
                    this.mInitPacketSizeInBytes = applicationInit.length;
                    int iApplicationImageSize = archiveInputStream.applicationImageSize();
                    this.mImageSizeInBytes = iApplicationImageSize;
                    this.mProgressInfo.init(iApplicationImageSize, 2, 2);
                    sendInitPacket(bluetoothGatt, false);
                }
                sendFirmware(bluetoothGatt);
                this.mProgressInfo.setProgress(-5);
                this.mService.waitUntilDisconnected();
                this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
                finalize(intent, false);
            } catch (RemoteDfuException e13) {
                int errorNumber = e13.getErrorNumber();
                int i13 = errorNumber | 512;
                loge(e13.getMessage() + ": " + AbstractC31479j.m96943v(i13));
                DfuBaseService dfuBaseService = this.mService;
                Locale locale = Locale.US;
                dfuBaseService.sendLogBroadcast(20, "Remote DFU error: " + AbstractC31479j.m96943v(i13));
                if (!(e13 instanceof RemoteDfuExtendedErrorException)) {
                    this.mService.terminateConnection(bluetoothGatt, errorNumber | 8704);
                    return;
                }
                RemoteDfuExtendedErrorException remoteDfuExtendedErrorException = (RemoteDfuExtendedErrorException) e13;
                int extendedErrorNumber = remoteDfuExtendedErrorException.getExtendedErrorNumber();
                int i14 = extendedErrorNumber | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                loge("Extended Error details: ".concat(AbstractC31479j.m96945x(i14)));
                this.mService.sendLogBroadcast(20, "Details: " + AbstractC31479j.m96945x(i14) + " (Code = " + remoteDfuExtendedErrorException.getExtendedErrorNumber() + ")");
                this.mService.terminateConnection(bluetoothGatt, extendedErrorNumber | 9216);
            }
        } catch (UnknownResponseException e14) {
            loge(e14.getMessage());
            this.mService.sendLogBroadcast(20, e14.getMessage());
            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_INVALID_RESPONSE);
        } catch (UploadAbortedException e15) {
            throw e15;
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public BaseDfuImpl.BaseBluetoothGattCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    private void writeExecute(boolean z4) throws UploadAbortedException, RemoteDfuException, UnknownResponseException, DfuException, DeviceDisconnectedException {
        try {
            writeExecute();
        } catch (RemoteDfuException e5) {
            if (z4 && e5.getErrorNumber() == 5) {
                logw(e5.getMessage() + ": " + AbstractC31479j.m96943v(517));
                if (this.mFileType == 1) {
                    logw("Are you sure your new SoftDevice is API compatible with the updated one? If not, update the bootloader as well");
                }
                DfuBaseService dfuBaseService = this.mService;
                Locale locale = Locale.US;
                dfuBaseService.sendLogBroadcast(15, "Remote DFU error: " + AbstractC31479j.m96943v(517) + ". SD busy? Retrying...");
                logi("SD busy? Retrying...");
                logi("Executing data object (Op Code = 4)");
                writeExecute();
                return;
            }
            throw e5;
        }
    }
}
