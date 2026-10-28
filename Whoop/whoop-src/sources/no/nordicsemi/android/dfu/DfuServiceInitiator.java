package no.nordicsemi.android.dfu;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.security.InvalidParameterException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class DfuServiceInitiator {
    public static final int DEFAULT_MBR_SIZE = 4096;
    public static final int DEFAULT_PRN_VALUE = 12;
    public static final long DEFAULT_SCAN_TIMEOUT = 5000;
    public static final int SCOPE_APPLICATION = 2;
    public static final int SCOPE_SYSTEM_COMPONENTS = 1;
    private Parcelable[] buttonlessDfuWithBondSharingUuids;
    private Parcelable[] buttonlessDfuWithoutBondSharingUuids;
    private final String deviceAddress;
    private String deviceName;
    private Parcelable[] experimentalButtonlessDfuUuids;
    private String filePath;
    private int fileResId;
    private Uri fileUri;
    private String initFilePath;
    private int initFileResId;
    private Uri initFileUri;
    private boolean keepBond;
    private Parcelable[] legacyDfuUuids;
    private String mimeType;
    private Boolean packetReceiptNotificationsEnabled;
    private boolean restoreBond;
    private Parcelable[] secureDfuUuids;
    private boolean disableNotification = false;
    private boolean startAsForegroundService = true;
    private int fileType = -1;
    private boolean forceDfu = false;
    private boolean forceScanningForNewAddressInLegacyDfu = false;
    private boolean enableUnsafeExperimentalButtonlessDfu = false;
    private boolean disableResume = false;
    private int numberOfRetries = 0;
    private int mbrSize = 4096;
    private long dataObjectDelay = 0;
    private long rebootTime = 0;
    private long scanTimeout = 5000;
    private int numberOfPackets = 12;
    private int mtu = 517;
    private int currentMtu = 23;

    public DfuServiceInitiator(String str) {
        this.deviceAddress = str;
    }

    public static void createDfuNotificationChannel(Context context, String str, String str2, boolean z4) {
        NotificationChannel notificationChannel = new NotificationChannel(DfuBaseService.NOTIFICATION_CHANNEL_DFU, str, 2);
        notificationChannel.setDescription(str2);
        notificationChannel.setShowBadge(z4);
        notificationChannel.setLockscreenVisibility(1);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private DfuServiceInitiator init(Uri uri, String str, int i13) {
        if ("application/zip".equals(this.mimeType)) {
            throw new InvalidParameterException("Init file must be located inside the ZIP");
        }
        this.initFileUri = uri;
        this.initFilePath = str;
        this.initFileResId = i13;
        return this;
    }

    public DfuServiceInitiator disableMtuRequest() {
        this.mtu = 0;
        return this;
    }

    public DfuServiceInitiator disableResume() {
        this.disableResume = true;
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i13, Uri uri) {
        if (i13 != 0) {
            return init(uri, null, 0, i13, DfuBaseService.MIME_TYPE_OCTET_STREAM);
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    public DfuServiceInitiator setCurrentMtu(int i13) {
        this.currentMtu = i13;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForButtonlessDfuWithBondSharing(UUID uuid, UUID uuid2) {
        this.buttonlessDfuWithBondSharingUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null};
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForButtonlessDfuWithoutBondSharing(UUID uuid, UUID uuid2) {
        this.buttonlessDfuWithoutBondSharingUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null};
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForExperimentalButtonlessDfu(UUID uuid, UUID uuid2) {
        this.experimentalButtonlessDfuUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null};
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForLegacyDfu(UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4) {
        this.legacyDfuUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null, uuid3 != null ? new ParcelUuid(uuid3) : null, uuid4 != null ? new ParcelUuid(uuid4) : null};
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForSecureDfu(UUID uuid, UUID uuid2, UUID uuid3) {
        this.secureDfuUuids = new ParcelUuid[]{uuid != null ? new ParcelUuid(uuid) : null, uuid2 != null ? new ParcelUuid(uuid2) : null, uuid3 != null ? new ParcelUuid(uuid3) : null};
        return this;
    }

    public DfuServiceInitiator setDeviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public DfuServiceInitiator setDisableNotification(boolean z4) {
        this.disableNotification = z4;
        return this;
    }

    public DfuServiceInitiator setForceDfu(boolean z4) {
        this.forceDfu = z4;
        return this;
    }

    public DfuServiceInitiator setForceScanningForNewAddressInLegacyDfu(boolean z4) {
        this.forceScanningForNewAddressInLegacyDfu = z4;
        return this;
    }

    public DfuServiceInitiator setForeground(boolean z4) {
        this.startAsForegroundService = z4;
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(Uri uri) {
        return init(uri, null, 0);
    }

    public DfuServiceInitiator setKeepBond(boolean z4) {
        this.keepBond = z4;
        return this;
    }

    public DfuServiceInitiator setMbrSize(int i13) {
        this.mbrSize = i13;
        return this;
    }

    public DfuServiceInitiator setMtu(int i13) {
        this.mtu = i13;
        return this;
    }

    public DfuServiceInitiator setNumberOfRetries(int i13) {
        this.numberOfRetries = i13;
        return this;
    }

    public DfuServiceInitiator setPacketsReceiptNotificationsEnabled(boolean z4) {
        this.packetReceiptNotificationsEnabled = Boolean.valueOf(z4);
        return this;
    }

    public DfuServiceInitiator setPacketsReceiptNotificationsValue(int i13) {
        if (i13 <= 0) {
            i13 = 12;
        }
        this.numberOfPackets = i13;
        return this;
    }

    public DfuServiceInitiator setPrepareDataObjectDelay(long j7) {
        this.dataObjectDelay = j7;
        return this;
    }

    public DfuServiceInitiator setRebootTime(long j7) {
        this.rebootTime = j7;
        return this;
    }

    public DfuServiceInitiator setRestoreBond(boolean z4) {
        this.restoreBond = z4;
        return this;
    }

    public DfuServiceInitiator setScanTimeout(long j7) {
        this.scanTimeout = j7;
        return this;
    }

    public DfuServiceInitiator setScope(int i13) {
        if (!"application/zip".equals(this.mimeType)) {
            throw new UnsupportedOperationException("Scope can be set only for a ZIP file");
        }
        if (i13 == 2) {
            this.fileType = 4;
            return this;
        }
        if (i13 == 1) {
            this.fileType = 3;
            return this;
        }
        if (i13 != 3) {
            throw new UnsupportedOperationException("Unknown scope");
        }
        this.fileType = 0;
        return this;
    }

    public DfuServiceInitiator setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(boolean z4) {
        this.enableUnsafeExperimentalButtonlessDfu = z4;
        return this;
    }

    public DfuServiceInitiator setZip(Uri uri) {
        return init(uri, null, 0, 0, "application/zip");
    }

    public DfuServiceController start(Context context, Class<? extends DfuBaseService> cls) {
        if (this.fileType == -1) {
            throw new UnsupportedOperationException("You must specify the firmware file before starting the service");
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS, this.deviceAddress);
        intent.putExtra(DfuBaseService.EXTRA_DEVICE_NAME, this.deviceName);
        intent.putExtra(DfuBaseService.EXTRA_DISABLE_NOTIFICATION, this.disableNotification);
        intent.putExtra(DfuBaseService.EXTRA_FOREGROUND_SERVICE, this.startAsForegroundService);
        intent.putExtra(DfuBaseService.EXTRA_FILE_MIME_TYPE, this.mimeType);
        intent.putExtra(DfuBaseService.EXTRA_FILE_TYPE, this.fileType);
        intent.putExtra(DfuBaseService.EXTRA_FILE_URI, this.fileUri);
        intent.putExtra(DfuBaseService.EXTRA_FILE_PATH, this.filePath);
        intent.putExtra(DfuBaseService.EXTRA_FILE_RES_ID, this.fileResId);
        intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_URI, this.initFileUri);
        intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_PATH, this.initFilePath);
        intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_RES_ID, this.initFileResId);
        intent.putExtra(DfuBaseService.EXTRA_KEEP_BOND, this.keepBond);
        intent.putExtra(DfuBaseService.EXTRA_RESTORE_BOND, this.restoreBond);
        intent.putExtra(DfuBaseService.EXTRA_FORCE_DFU, this.forceDfu);
        intent.putExtra(DfuBaseService.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU, this.forceScanningForNewAddressInLegacyDfu);
        intent.putExtra(DfuBaseService.EXTRA_DISABLE_RESUME, this.disableResume);
        intent.putExtra(DfuBaseService.EXTRA_MAX_DFU_ATTEMPTS, this.numberOfRetries);
        intent.putExtra(DfuBaseService.EXTRA_MBR_SIZE, this.mbrSize);
        intent.putExtra(DfuBaseService.EXTRA_DATA_OBJECT_DELAY, this.dataObjectDelay);
        intent.putExtra(DfuBaseService.EXTRA_SCAN_TIMEOUT, this.scanTimeout);
        intent.putExtra(DfuBaseService.EXTRA_SCAN_DELAY, this.rebootTime);
        int i13 = this.mtu;
        if (i13 > 0) {
            intent.putExtra(DfuBaseService.EXTRA_MTU, i13);
        }
        intent.putExtra(DfuBaseService.EXTRA_CURRENT_MTU, this.currentMtu);
        intent.putExtra(DfuBaseService.EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU, this.enableUnsafeExperimentalButtonlessDfu);
        Boolean bool = this.packetReceiptNotificationsEnabled;
        if (bool != null) {
            intent.putExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED, bool);
            intent.putExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE, this.numberOfPackets);
        }
        Parcelable[] parcelableArr = this.legacyDfuUuids;
        if (parcelableArr != null) {
            intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU, parcelableArr);
        }
        Parcelable[] parcelableArr2 = this.secureDfuUuids;
        if (parcelableArr2 != null) {
            intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU, parcelableArr2);
        }
        Parcelable[] parcelableArr3 = this.experimentalButtonlessDfuUuids;
        if (parcelableArr3 != null) {
            intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU, parcelableArr3);
        }
        Parcelable[] parcelableArr4 = this.buttonlessDfuWithoutBondSharingUuids;
        if (parcelableArr4 != null) {
            intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING, parcelableArr4);
        }
        Parcelable[] parcelableArr5 = this.buttonlessDfuWithBondSharingUuids;
        if (parcelableArr5 != null) {
            intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING, parcelableArr5);
        }
        if (this.startAsForegroundService) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
        return new DfuServiceController(context);
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(String str) {
        return init(null, str, 0);
    }

    public DfuServiceInitiator setZip(String str) {
        return init(null, str, 0, 0, "application/zip");
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i13, String str) {
        if (i13 != 0) {
            return init(null, str, 0, i13, DfuBaseService.MIME_TYPE_OCTET_STREAM);
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(int i13) {
        return init(null, null, i13);
    }

    public DfuServiceInitiator setZip(int i13) {
        return init(null, null, i13, 0, "application/zip");
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(Uri uri, String str) {
        return init(uri, str, 0);
    }

    public DfuServiceInitiator setZip(Uri uri, String str) {
        return init(uri, str, 0, 0, "application/zip");
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i13, Uri uri, String str) {
        if (i13 != 0) {
            return init(uri, str, 0, i13, DfuBaseService.MIME_TYPE_OCTET_STREAM);
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    private DfuServiceInitiator init(Uri uri, String str, int i13, int i14, String str2) {
        this.fileUri = uri;
        this.filePath = str;
        this.fileResId = i13;
        this.fileType = i14;
        this.mimeType = str2;
        if ("application/zip".equals(str2)) {
            this.initFileUri = null;
            this.initFilePath = null;
            this.initFileResId = 0;
        }
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i13, int i14) {
        if (i13 != 0) {
            return init(null, null, i14, i13, DfuBaseService.MIME_TYPE_OCTET_STREAM);
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    public static void createDfuNotificationChannel(Context context) {
        createDfuNotificationChannel(context, context.getString(C26930R.string.dfu_channel_name), context.getString(C26930R.string.dfu_channel_description), false);
    }
}
