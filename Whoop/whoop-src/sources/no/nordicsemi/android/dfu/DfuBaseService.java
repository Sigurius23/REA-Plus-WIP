package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.models.MessageType;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import no.nordicsemi.android.dfu.internal.HexInputStream;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.SizeValidationException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p417q8.C30028b;
import p460rg.AbstractC31366a;
import p479s4.AbstractC32122c;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"MissingPermission"})
public abstract class DfuBaseService extends IntentService implements DfuProgressInfo.ProgressListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ACTION_ABORT = 2;
    public static final int ACTION_PAUSE = 0;
    public static final int ACTION_RESUME = 1;
    public static final String BROADCAST_ACTION = "no.nordicsemi.android.dfu.broadcast.BROADCAST_ACTION";
    public static final String BROADCAST_ERROR = "no.nordicsemi.android.dfu.broadcast.BROADCAST_ERROR";
    public static final String BROADCAST_LOG = "no.nordicsemi.android.dfu.broadcast.BROADCAST_LOG";
    public static final String BROADCAST_PROGRESS = "no.nordicsemi.android.dfu.broadcast.BROADCAST_PROGRESS";
    static boolean DEBUG = false;
    public static final int ERROR_BLUETOOTH_DISABLED = 4106;
    public static final int ERROR_CONNECTION_MASK = 16384;
    public static final int ERROR_CONNECTION_STATE_MASK = 32768;
    public static final int ERROR_CRC_ERROR = 4109;
    public static final int ERROR_DEVICE_DISCONNECTED = 4096;
    public static final int ERROR_DEVICE_NOT_BONDED = 4110;
    public static final int ERROR_FILE_ERROR = 4098;
    public static final int ERROR_FILE_INVALID = 4099;
    public static final int ERROR_FILE_IO_EXCEPTION = 4100;
    public static final int ERROR_FILE_NOT_FOUND = 4097;
    public static final int ERROR_FILE_SIZE_INVALID = 4108;
    public static final int ERROR_FILE_TYPE_UNSUPPORTED = 4105;
    public static final int ERROR_INIT_PACKET_REQUIRED = 4107;
    public static final int ERROR_INVALID_RESPONSE = 4104;
    public static final int ERROR_MASK = 4096;
    public static final int ERROR_PROGRESS_LOST = 4111;
    public static final int ERROR_REMOTE_MASK = 8192;
    public static final int ERROR_REMOTE_TYPE_LEGACY = 256;
    public static final int ERROR_REMOTE_TYPE_SECURE = 512;
    public static final int ERROR_REMOTE_TYPE_SECURE_BUTTONLESS = 2048;
    public static final int ERROR_REMOTE_TYPE_SECURE_EXTENDED = 1024;
    public static final int ERROR_SERVICE_DISCOVERY_NOT_STARTED = 4101;
    public static final int ERROR_SERVICE_NOT_FOUND = 4102;
    public static final int ERROR_TYPE_COMMUNICATION = 2;
    public static final int ERROR_TYPE_COMMUNICATION_STATE = 1;
    public static final int ERROR_TYPE_DFU_REMOTE = 3;
    public static final int ERROR_TYPE_OTHER = 0;
    public static final String EXTRA_ACTION = "no.nordicsemi.android.dfu.extra.EXTRA_ACTION";
    public static final String EXTRA_AVG_SPEED_B_PER_MS = "no.nordicsemi.android.dfu.extra.EXTRA_AVG_SPEED_B_PER_MS";
    public static final String EXTRA_CURRENT_MTU = "no.nordicsemi.android.dfu.extra.EXTRA_CURRENT_MTU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU";
    public static final String EXTRA_DATA = "no.nordicsemi.android.dfu.extra.EXTRA_DATA";
    public static final String EXTRA_DATA_OBJECT_DELAY = "no.nordicsemi.android.dfu.extra.EXTRA_DATA_OBJECT_DELAY";
    public static final String EXTRA_DEVICE_ADDRESS = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_ADDRESS";
    public static final String EXTRA_DEVICE_NAME = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_NAME";
    static final String EXTRA_DFU_ATTEMPT = "no.nordicsemi.android.dfu.extra.EXTRA_DFU_ATTEMPT";
    public static final String EXTRA_DISABLE_NOTIFICATION = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_NOTIFICATION";
    public static final String EXTRA_DISABLE_RESUME = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_RESUME";
    public static final String EXTRA_ERROR_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_ERROR_TYPE";
    public static final String EXTRA_FILE_MIME_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_MIME_TYPE";
    public static final String EXTRA_FILE_PATH = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_PATH";
    public static final String EXTRA_FILE_RES_ID = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_RES_ID";
    public static final String EXTRA_FILE_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_TYPE";
    public static final String EXTRA_FILE_URI = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_URI";
    public static final String EXTRA_FORCE_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_FORCE_DFU";
    public static final String EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU";
    public static final String EXTRA_FOREGROUND_SERVICE = "no.nordicsemi.android.dfu.extra.EXTRA_FOREGROUND_SERVICE";
    public static final String EXTRA_INIT_FILE_PATH = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_PATH";
    public static final String EXTRA_INIT_FILE_RES_ID = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_RES_ID";
    public static final String EXTRA_INIT_FILE_URI = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_URI";
    public static final String EXTRA_KEEP_BOND = "no.nordicsemi.android.dfu.extra.EXTRA_KEEP_BOND";
    public static final String EXTRA_LOG_LEVEL = "no.nordicsemi.android.dfu.extra.EXTRA_LOG_LEVEL";
    public static final String EXTRA_LOG_MESSAGE = "no.nordicsemi.android.dfu.extra.EXTRA_LOG_INFO";
    public static final String EXTRA_MAX_DFU_ATTEMPTS = "no.nordicsemi.android.dfu.extra.EXTRA_MAX_DFU_ATTEMPTS";
    public static final String EXTRA_MBR_SIZE = "no.nordicsemi.android.dfu.extra.EXTRA_MBR_SIZE";
    public static final String EXTRA_MTU = "no.nordicsemi.android.dfu.extra.EXTRA_MTU";
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_ENABLED";
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_VALUE";
    public static final String EXTRA_PARTS_TOTAL = "no.nordicsemi.android.dfu.extra.EXTRA_PARTS_TOTAL";
    public static final String EXTRA_PART_CURRENT = "no.nordicsemi.android.dfu.extra.EXTRA_PART_CURRENT";
    public static final String EXTRA_PROGRESS = "no.nordicsemi.android.dfu.extra.EXTRA_PROGRESS";
    private static final String EXTRA_RECONNECTION_ATTEMPT = "no.nordicsemi.android.dfu.extra.EXTRA_RECONNECTION_ATTEMPT";
    public static final String EXTRA_RESTORE_BOND = "no.nordicsemi.android.dfu.extra.EXTRA_RESTORE_BOND";
    public static final String EXTRA_SCAN_DELAY = "no.nordicsemi.android.dfu.extra.EXTRA_SCAN_DELAY";
    public static final String EXTRA_SCAN_TIMEOUT = "no.nordicsemi.android.dfu.extra.EXTRA_SCAN_TIMEOUT";
    public static final String EXTRA_SPEED_B_PER_MS = "no.nordicsemi.android.dfu.extra.EXTRA_SPEED_B_PER_MS";
    public static final String EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU";
    public static final int LOG_LEVEL_APPLICATION = 10;
    public static final int LOG_LEVEL_DEBUG = 0;
    public static final int LOG_LEVEL_ERROR = 20;
    public static final int LOG_LEVEL_INFO = 5;
    public static final int LOG_LEVEL_VERBOSE = 1;
    public static final int LOG_LEVEL_WARNING = 15;
    public static final String MIME_TYPE_OCTET_STREAM = "application/octet-stream";
    public static final String MIME_TYPE_ZIP = "application/zip";
    public static final String NOTIFICATION_CHANNEL_DFU = "dfu";
    public static final int NOTIFICATION_ID = 283;
    public static final int PROGRESS_ABORTED = -7;
    public static final int PROGRESS_COMPLETED = -6;
    public static final int PROGRESS_CONNECTING = -1;
    public static final int PROGRESS_DISCONNECTING = -5;
    public static final int PROGRESS_ENABLING_DFU_MODE = -3;
    public static final int PROGRESS_STARTING = -2;
    public static final int PROGRESS_VALIDATING = -4;
    protected static final int STATE_CLOSED = -5;
    protected static final int STATE_CONNECTED = -2;
    protected static final int STATE_CONNECTED_AND_READY = -3;
    protected static final int STATE_CONNECTING = -1;
    protected static final int STATE_DISCONNECTED = 0;
    protected static final int STATE_DISCONNECTING = -4;
    private static final String TAG = "DfuBaseService";
    public static final int TYPE_APPLICATION = 4;
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_BOOTLOADER = 2;
    public static final int TYPE_SOFT_DEVICE = 1;
    private boolean mAborted;
    private BluetoothAdapter mBluetoothAdapter;
    private final BroadcastReceiver mBluetoothStateBroadcastReceiver;
    private final BroadcastReceiver mBondStateBroadcastReceiver;
    protected int mConnectionState;
    private final BroadcastReceiver mConnectionStateBroadcastReceiver;
    private String mDeviceAddress;
    private String mDeviceName;
    private final BroadcastReceiver mDfuActionReceiver;
    private DfuCallback mDfuServiceImpl;
    private boolean mDisableNotification;
    private int mError;
    private InputStream mFirmwareInputStream;
    private final BluetoothGattCallback mGattCallback;
    private InputStream mInitFileInputStream;
    private long mLastNotificationTime;
    private int mLastProgress;
    private final Object mLock;
    DfuProgressInfo mProgressInfo;

    public DfuBaseService() {
        super(TAG);
        this.mLock = new Object();
        this.mLastProgress = -1;
        this.mDfuActionReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_ACTION, 0);
                DfuBaseService.this.logi("User action received: " + intExtra);
                if (intExtra == 0) {
                    DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Pause action received");
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.pause();
                        return;
                    }
                    return;
                }
                if (intExtra == 1) {
                    DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Resume action received");
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.resume();
                        return;
                    }
                    return;
                }
                if (intExtra != 2) {
                    return;
                }
                DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Abort action received");
                DfuBaseService.this.mAborted = true;
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.abort();
                }
            }
        };
        this.mBluetoothStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 12);
                DfuBaseService.this.logw(AbstractC25012a.m73372e(intExtra, intExtra2, "Action received: android.bluetooth.adapter.action.STATE_CHANGED [state: ", ", previous state: ", "]"));
                if (intExtra2 == 12) {
                    if (intExtra == 13 || intExtra == 10) {
                        DfuBaseService.this.sendLogBroadcast(15, "Bluetooth adapter disabled");
                        DfuBaseService dfuBaseService = DfuBaseService.this;
                        dfuBaseService.mConnectionState = 0;
                        if (dfuBaseService.mDfuServiceImpl != null) {
                            DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                        }
                        synchronized (DfuBaseService.this.mLock) {
                            DfuBaseService.this.mLock.notifyAll();
                        }
                    }
                }
            }
        };
        this.mBondStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(DfuBaseService.this.mDeviceAddress) || (intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1)) == 11 || DfuBaseService.this.mDfuServiceImpl == null) {
                    return;
                }
                DfuBaseService.this.mDfuServiceImpl.onBondStateChanged(intExtra);
            }
        };
        this.mConnectionStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(DfuBaseService.this.mDeviceAddress)) {
                    return;
                }
                String action = intent.getAction();
                DfuBaseService.this.logi("Action received: " + action);
                DfuBaseService.this.sendLogBroadcast(0, "[Broadcast] Action received: " + action);
            }
        };
        this.mGattCallback = new BluetoothGattCallback() { // from class: no.nordicsemi.android.dfu.DfuBaseService.5
            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i13);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i13);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i13, int i14) {
                if (i13 != 0) {
                    if (i13 == 8 || i13 == 19) {
                        DfuBaseService.this.logw("Target device disconnected with status: " + i13);
                    } else {
                        DfuBaseService.this.loge("Connection state change error: " + i13 + " newState: " + i14);
                    }
                    DfuBaseService.this.mError = i13 | 32768;
                    if (i14 == 0) {
                        DfuBaseService dfuBaseService = DfuBaseService.this;
                        dfuBaseService.mConnectionState = 0;
                        if (dfuBaseService.mDfuServiceImpl != null) {
                            DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                        }
                    }
                } else if (i14 == 2) {
                    DfuBaseService.this.logi("Connected to GATT server");
                    DfuBaseService.this.sendLogBroadcast(5, "Connected to " + DfuBaseService.this.mDeviceAddress);
                    DfuBaseService.this.mConnectionState = -2;
                    if (bluetoothGatt.getDevice().getBondState() == 12) {
                        DfuBaseService.this.logi("Waiting 1600 ms for a possible Service Changed indication...");
                        DfuBaseService.this.waitFor(1600L);
                    }
                    DfuBaseService.this.sendLogBroadcast(1, "Discovering services...");
                    DfuBaseService.this.sendLogBroadcast(0, "gatt.discoverServices()");
                    boolean zDiscoverServices = bluetoothGatt.discoverServices();
                    DfuBaseService.this.logi("Attempting to start service discovery... ".concat(zDiscoverServices ? "succeed" : MessageType.FAILED));
                    if (zDiscoverServices) {
                        return;
                    } else {
                        DfuBaseService.this.mError = DfuBaseService.ERROR_SERVICE_DISCOVERY_NOT_STARTED;
                    }
                } else if (i14 == 0) {
                    DfuBaseService.this.logi("Disconnected from GATT server");
                    DfuBaseService dfuBaseService2 = DfuBaseService.this;
                    dfuBaseService2.mConnectionState = 0;
                    if (dfuBaseService2.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                    }
                }
                synchronized (DfuBaseService.this.mLock) {
                    DfuBaseService.this.mLock.notifyAll();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i13) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i13);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i13) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i13);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @SuppressLint({"NewApi"})
            public void onMtuChanged(BluetoothGatt bluetoothGatt, int i13, int i14) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onMtuChanged(bluetoothGatt, i13, i14);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @SuppressLint({"NewApi"})
            public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i13, int i14, int i15) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onPhyUpdate(bluetoothGatt, i13, i14, i15);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i13) {
                if (i13 == 0) {
                    DfuBaseService.this.logi("Services discovered");
                    DfuBaseService.this.mConnectionState = -3;
                } else {
                    DfuBaseService.this.loge("Service discovery error: " + i13);
                    DfuBaseService.this.mError = i13 | DfuBaseService.ERROR_CONNECTION_MASK;
                }
                synchronized (DfuBaseService.this.mLock) {
                    DfuBaseService.this.mLock.notifyAll();
                }
            }
        };
    }

    private boolean initialize() {
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        if (bluetoothManager == null) {
            loge("Unable to initialize BluetoothManager.");
            return false;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.mBluetoothAdapter = adapter;
        if (adapter != null) {
            return true;
        }
        loge("Unable to obtain a BluetoothAdapter.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loge(String str) {
        Log.e(TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logi(String str) {
        if (DEBUG) {
            Log.i(TAG, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logw(String str) {
        if (DEBUG) {
            Log.w(TAG, str);
        }
    }

    private static IntentFilter makeDfuActionIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BROADCAST_ACTION);
        return intentFilter;
    }

    private InputStream openInputStream(String str, String str2, int i13, int i14) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        if ("application/zip".equals(str2)) {
            return new ArchiveInputStream(fileInputStream, i13, i14);
        }
        return str.toLowerCase(Locale.US).endsWith("hex") ? new HexInputStream(fileInputStream, i13) : fileInputStream;
    }

    private void report(int i13) {
        sendErrorBroadcast(i13);
        if (this.mDisableNotification) {
            return;
        }
        String str = this.mDeviceAddress;
        String string = this.mDeviceName;
        if (string == null) {
            string = getString(C26930R.string.dfu_unknown_name);
        }
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_DFU).setSmallIcon(android.R.drawable.stat_sys_upload).setOnlyAlertOnce(true).setColor(-65536).setOngoing(false).setContentTitle(getString(C26930R.string.dfu_status_error)).setSmallIcon(android.R.drawable.stat_sys_upload_done).setContentText(getString(C26930R.string.dfu_status_error_msg)).setAutoCancel(true);
        Intent intent = new Intent(this, getNotificationTarget());
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, str);
        intent.putExtra(EXTRA_DEVICE_NAME, string);
        intent.putExtra(EXTRA_PROGRESS, i13);
        autoCancel.setContentIntent(PendingIntent.getActivity(this, 0, intent, 201326592));
        updateErrorNotification(autoCancel);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.notify(NOTIFICATION_ID, autoCancel.build());
        }
    }

    private void sendErrorBroadcast(int i13) {
        Intent intent = new Intent(BROADCAST_ERROR);
        if ((i13 & ERROR_CONNECTION_MASK) > 0) {
            intent.putExtra(EXTRA_DATA, i13 & (-16385));
            intent.putExtra(EXTRA_ERROR_TYPE, 2);
        } else if ((32768 & i13) > 0) {
            intent.putExtra(EXTRA_DATA, i13 & (-32769));
            intent.putExtra(EXTRA_ERROR_TYPE, 1);
        } else if ((i13 & ERROR_REMOTE_MASK) > 0) {
            intent.putExtra(EXTRA_DATA, i13 & (-8193));
            intent.putExtra(EXTRA_ERROR_TYPE, 3);
        } else {
            intent.putExtra(EXTRA_DATA, i13);
            intent.putExtra(EXTRA_ERROR_TYPE, 0);
        }
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        C30028b.m91918a(this).m91920c(intent);
    }

    private void sendProgressBroadcast(DfuProgressInfo dfuProgressInfo) {
        Intent intent = new Intent(BROADCAST_PROGRESS);
        intent.putExtra(EXTRA_DATA, dfuProgressInfo.getProgress());
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        intent.putExtra(EXTRA_PART_CURRENT, dfuProgressInfo.getCurrentPart());
        intent.putExtra(EXTRA_PARTS_TOTAL, dfuProgressInfo.getTotalParts());
        intent.putExtra(EXTRA_SPEED_B_PER_MS, dfuProgressInfo.getSpeed());
        intent.putExtra(EXTRA_AVG_SPEED_B_PER_MS, dfuProgressInfo.getAverageSpeed());
        C30028b.m91918a(this).m91920c(intent);
    }

    private void startForeground() {
        NotificationCompat.Builder ongoing = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_DFU).setSmallIcon(android.R.drawable.stat_sys_upload).setContentTitle(getString(C26930R.string.dfu_status_foreground_title)).setContentText(getString(C26930R.string.dfu_status_foreground_content)).setColor(-7829368).setPriority(-1).setOngoing(true);
        Class<? extends Activity> notificationTarget = getNotificationTarget();
        if (notificationTarget != null) {
            Intent intent = new Intent(this, notificationTarget);
            intent.addFlags(268435456);
            intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
            intent.putExtra(EXTRA_DEVICE_NAME, this.mDeviceName);
            ongoing.setContentIntent(PendingIntent.getActivity(this, 0, intent, 201326592));
        } else {
            logw("getNotificationTarget() should not return null if the service is to be started as a foreground service");
        }
        updateForegroundNotification(ongoing);
        try {
            startForeground(NOTIFICATION_ID, ongoing.build());
        } catch (SecurityException e5) {
            loge("Service cannot be started in foreground", e5);
            logi("Starting DFU service in background instead");
        }
    }

    public void close(BluetoothGatt bluetoothGatt) {
        logi("Cleaning up...");
        sendLogBroadcast(0, "gatt.disconnect()");
        bluetoothGatt.disconnect();
        sendLogBroadcast(0, "gatt.close()");
        bluetoothGatt.close();
        this.mConnectionState = -5;
    }

    public BluetoothGatt connect(String str) {
        if (!this.mBluetoothAdapter.isEnabled()) {
            return null;
        }
        this.mConnectionState = -1;
        logi("Connecting to the device...");
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, preferredPhy = LE_1M | LE_2M)");
        BluetoothGatt bluetoothGattConnectGatt = remoteDevice.connectGatt(this, false, this.mGattCallback, 2, 3);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        int i13 = this.mConnectionState;
                        if ((i13 != -1 && i13 != -2) || this.mError != 0 || this.mAborted) {
                            break;
                        }
                        this.mLock.wait();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            return bluetoothGattConnectGatt;
        } catch (InterruptedException e5) {
            loge("Sleeping interrupted", e5);
            return bluetoothGattConnectGatt;
        }
    }

    public void disconnect(BluetoothGatt bluetoothGatt) {
        if (this.mConnectionState == 0) {
            return;
        }
        sendLogBroadcast(1, "Disconnecting...");
        this.mProgressInfo.setProgress(-5);
        logi("Disconnecting from the device...");
        sendLogBroadcast(0, "gatt.disconnect()");
        bluetoothGatt.disconnect();
        waitUntilDisconnected();
        sendLogBroadcast(5, "Disconnected");
    }

    public DfuDeviceSelector getDeviceSelector() {
        return new DfuDefaultDeviceSelector();
    }

    public abstract Class<? extends Activity> getNotificationTarget();

    public boolean isDebug() {
        return false;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        DEBUG = isDebug();
        logi("DFU service created. Version: 2.5.0");
        initialize();
        C30028b c30028bM91918a = C30028b.m91918a(this);
        IntentFilter intentFilterMakeDfuActionIntentFilter = makeDfuActionIntentFilter();
        c30028bM91918a.m91919b(this.mDfuActionReceiver, intentFilterMakeDfuActionIntentFilter);
        AbstractC32122c.registerReceiver(this, this.mDfuActionReceiver, intentFilterMakeDfuActionIntentFilter, 2);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        AbstractC32122c.registerReceiver(this, this.mConnectionStateBroadcastReceiver, intentFilter, 2);
        AbstractC32122c.registerReceiver(this, this.mBondStateBroadcastReceiver, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"), 2);
        AbstractC32122c.registerReceiver(this, this.mBluetoothStateBroadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        DfuCallback dfuCallback = this.mDfuServiceImpl;
        if (dfuCallback != null) {
            dfuCallback.abort();
        }
        C30028b.m91918a(this).m91921d(this.mDfuActionReceiver);
        unregisterReceiver(this.mDfuActionReceiver);
        unregisterReceiver(this.mConnectionStateBroadcastReceiver);
        unregisterReceiver(this.mBondStateBroadcastReceiver);
        unregisterReceiver(this.mBluetoothStateBroadcastReceiver);
        try {
            InputStream inputStream = this.mFirmwareInputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            InputStream inputStream2 = this.mInitFileInputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
        } catch (IOException unused) {
        } finally {
            this.mFirmwareInputStream = null;
            this.mInitFileInputStream = null;
        }
        logi("DFU service destroyed");
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0481 A[Catch: all -> 0x0162, PHI: r2
      0x0481: PHI (r2v19 no.nordicsemi.android.dfu.DfuService) = 
      (r2v17 no.nordicsemi.android.dfu.DfuService)
      (r2v17 no.nordicsemi.android.dfu.DfuService)
      (r2v20 no.nordicsemi.android.dfu.DfuService)
      (r2v21 no.nordicsemi.android.dfu.DfuService)
      (r2v21 no.nordicsemi.android.dfu.DfuService)
     binds: [B:227:0x047f, B:242:0x04ee, B:244:0x04fe, B:219:0x042c, B:220:0x042e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0162, blocks: (B:72:0x0158, B:74:0x015d, B:93:0x0188, B:99:0x01a8, B:109:0x01ca, B:111:0x01d0, B:113:0x01d5, B:115:0x01de, B:117:0x01e2, B:120:0x01ed, B:121:0x01f4, B:122:0x01f5, B:124:0x01f9, B:127:0x0204, B:128:0x020b, B:129:0x020c, B:131:0x0210, B:134:0x021c, B:135:0x0223, B:137:0x0226, B:139:0x022c, B:141:0x0237, B:143:0x023d, B:114:0x01da, B:145:0x0249, B:147:0x0252, B:148:0x0259, B:149:0x0263, B:152:0x0271, B:155:0x0285, B:157:0x02a1, B:160:0x02b1, B:166:0x02c5, B:168:0x02e1, B:170:0x02e8, B:174:0x035b, B:176:0x0375, B:178:0x0380, B:179:0x0383, B:181:0x039e, B:182:0x03a2, B:185:0x03a9, B:171:0x0306, B:173:0x0330, B:188:0x03b2, B:190:0x03b6, B:193:0x03c6, B:195:0x03cc, B:198:0x03e1, B:206:0x040f, B:228:0x0481, B:249:0x0507, B:250:0x050a, B:237:0x04e2, B:102:0x01b3, B:103:0x01ba, B:95:0x0193, B:97:0x019b, B:88:0x0178, B:90:0x017f, B:251:0x050b, B:254:0x0530, B:257:0x0553, B:260:0x0568, B:263:0x057d, B:200:0x03eb, B:202:0x03fa, B:204:0x0405, B:218:0x0428, B:220:0x042e, B:243:0x04ef, B:222:0x0432, B:224:0x043a, B:226:0x0471, B:225:0x0456, B:230:0x0486, B:232:0x04a6, B:234:0x04d9, B:235:0x04dd, B:240:0x04e9), top: B:275:0x014f, inners: #1, #4, #5, #7, #12, #13, #12, #11 }] */
    /* JADX WARN: Code duplicated, block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        String str;
        String str2;
        int intExtra;
        InputStream byteArrayInputStream;
        int i13;
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra(EXTRA_DEVICE_ADDRESS);
        String stringExtra2 = intent.getStringExtra(EXTRA_DEVICE_NAME);
        boolean booleanExtra = intent.getBooleanExtra(EXTRA_DISABLE_NOTIFICATION, false);
        boolean booleanExtra2 = intent.getBooleanExtra(EXTRA_FOREGROUND_SERVICE, true);
        String stringExtra3 = intent.getStringExtra(EXTRA_FILE_PATH);
        Uri uri = (Uri) intent.getParcelableExtra(EXTRA_FILE_URI);
        int intExtra2 = intent.getIntExtra(EXTRA_FILE_RES_ID, 0);
        String stringExtra4 = intent.getStringExtra(EXTRA_INIT_FILE_PATH);
        Uri uri2 = (Uri) intent.getParcelableExtra(EXTRA_INIT_FILE_URI);
        int intExtra3 = intent.getIntExtra(EXTRA_INIT_FILE_RES_ID, 0);
        int intExtra4 = intent.getIntExtra(EXTRA_FILE_TYPE, 0);
        if (stringExtra3 != null && intExtra4 == 0) {
            intExtra4 = stringExtra3.toLowerCase(Locale.US).endsWith("zip") ? 0 : 4;
        }
        String stringExtra5 = intent.getStringExtra(EXTRA_FILE_MIME_TYPE);
        if (stringExtra5 != null) {
            str = "Connection error after: ";
            str2 = stringExtra5;
        } else {
            str = "Connection error after: ";
            str2 = intExtra4 == 0 ? "application/zip" : MIME_TYPE_OCTET_STREAM;
        }
        if (stringExtra == null || (stringExtra3 == null && uri == null && intExtra2 == 0)) {
            loge("Device Address of firmware location are empty. Hint: use DfuServiceInitiator to start DFU");
            return;
        }
        if ((intExtra4 & (-8)) > 0 || !("application/zip".equals(str2) || MIME_TYPE_OCTET_STREAM.equals(str2))) {
            logw("File type or file mime-type not supported");
            sendLogBroadcast(15, "File type or file mime-type not supported");
            report(ERROR_FILE_TYPE_UNSUPPORTED);
            return;
        }
        if (MIME_TYPE_OCTET_STREAM.equals(str2) && intExtra4 != 1 && intExtra4 != 2 && intExtra4 != 4) {
            logw("Unable to determine file type");
            sendLogBroadcast(15, "Unable to determine file type");
            report(ERROR_FILE_TYPE_UNSUPPORTED);
            return;
        }
        if (!booleanExtra && getNotificationTarget() == null) {
            throw new NullPointerException("getNotificationTarget() must not return null if notifications are enabled");
        }
        if (!booleanExtra2) {
            logw("Foreground service disabled. Android Oreo or newer may kill a background service few moments after user closes the application.\nConsider enabling foreground service using DfuServiceInitiator#setForeground(boolean)");
        }
        UuidHelper.assignCustomUuids(intent);
        if (booleanExtra2) {
            logi("Starting DFU service in foreground");
            startForeground();
        }
        this.mDeviceAddress = stringExtra;
        this.mDeviceName = stringExtra2;
        this.mDisableNotification = booleanExtra;
        this.mConnectionState = 0;
        this.mError = 0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (defaultSharedPreferences.contains(DfuSettingsConstants.SETTINGS_MBR_SIZE)) {
            try {
                intExtra = Integer.parseInt(defaultSharedPreferences.getString(DfuSettingsConstants.SETTINGS_MBR_SIZE, String.valueOf(4096)));
                if (intExtra < 0) {
                    intExtra = 0;
                }
            } catch (NumberFormatException unused) {
                intExtra = 4096;
            }
        } else {
            intExtra = intent.getIntExtra(EXTRA_MBR_SIZE, 4096);
            if (intExtra < 0) {
                intExtra = 0;
            }
        }
        sendLogBroadcast(1, "DFU service started");
        InputStream inputStreamOpenInputStream = this.mFirmwareInputStream;
        InputStream inputStream = this.mInitFileInputStream;
        boolean z4 = inputStreamOpenInputStream == null;
        try {
            if (z4) {
                try {
                    try {
                        try {
                            sendLogBroadcast(1, "Opening file...");
                            if (uri != null) {
                                inputStreamOpenInputStream = openInputStream(uri, str2, intExtra, intExtra4);
                            } else if (stringExtra3 != null) {
                                inputStreamOpenInputStream = openInputStream(stringExtra3, str2, intExtra, intExtra4);
                            } else if (intExtra2 > 0) {
                                inputStreamOpenInputStream = openInputStream(intExtra2, str2, intExtra, intExtra4);
                            }
                            if (uri2 != null) {
                                inputStreamOpenInputStream = inputStreamOpenInputStream;
                                byteArrayInputStream = getContentResolver().openInputStream(uri2);
                            } else if (stringExtra4 != null) {
                                byteArrayInputStream = new FileInputStream(stringExtra4);
                            } else {
                                byteArrayInputStream = intExtra3 > 0 ? getResources().openRawResource(intExtra3) : inputStream;
                            }
                            if (inputStreamOpenInputStream.available() % 4 != 0) {
                                throw new SizeValidationException("The new firmware is not word-aligned.");
                            }
                        } catch (SizeValidationException e5) {
                            loge("Firmware not word-aligned", e5);
                            sendLogBroadcast(20, "Opening file failed: Firmware size must be word-aligned");
                            report(ERROR_FILE_SIZE_INVALID);
                            if (!booleanExtra2) {
                                return;
                            }
                        }
                    } catch (FileNotFoundException e13) {
                        loge("An exception occurred while opening file", e13);
                        sendLogBroadcast(20, "Opening file failed: File not found");
                        report(ERROR_FILE_NOT_FOUND);
                        if (!booleanExtra2) {
                            return;
                        }
                    } catch (IOException e14) {
                        loge("An exception occurred while calculating file size", e14);
                        sendLogBroadcast(20, "Opening file failed: " + e14.getLocalizedMessage());
                        report(ERROR_FILE_ERROR);
                        if (!booleanExtra2) {
                            return;
                        }
                    }
                } catch (SecurityException e15) {
                    loge("A security exception occurred while opening file", e15);
                    sendLogBroadcast(20, "Opening file failed: Permission required");
                    report(ERROR_FILE_NOT_FOUND);
                    if (!booleanExtra2) {
                        return;
                    }
                } catch (Exception e16) {
                    loge("An exception occurred while opening files. Did you set the firmware file?", e16);
                    sendLogBroadcast(20, "Opening file failed: " + e16.getLocalizedMessage());
                    report(ERROR_FILE_ERROR);
                    if (!booleanExtra2) {
                        return;
                    }
                }
            } else {
                byteArrayInputStream = inputStream;
            }
            if ("application/zip".equals(str2)) {
                ArchiveInputStream archiveInputStream = (ArchiveInputStream) inputStreamOpenInputStream;
                intExtra4 = intExtra4 == 0 ? archiveInputStream.getContentType() : archiveInputStream.setContentType(intExtra4);
                if ((intExtra4 & 4) > 0 && archiveInputStream.applicationImageSize() % 4 != 0) {
                    throw new SizeValidationException("Application firmware is not word-aligned.");
                }
                if ((intExtra4 & 2) > 0 && archiveInputStream.bootloaderImageSize() % 4 != 0) {
                    throw new SizeValidationException("Bootloader firmware is not word-aligned.");
                }
                if ((intExtra4 & 1) > 0 && archiveInputStream.softDeviceImageSize() % 4 != 0) {
                    throw new SizeValidationException("Soft Device firmware is not word-aligned.");
                }
                if (intExtra4 == 4) {
                    if (archiveInputStream.getApplicationInit() != null) {
                        byteArrayInputStream = new ByteArrayInputStream(archiveInputStream.getApplicationInit());
                    }
                } else if (archiveInputStream.getSystemInit() != null) {
                    byteArrayInputStream = new ByteArrayInputStream(archiveInputStream.getSystemInit());
                }
            }
            InputStream inputStream2 = byteArrayInputStream;
            if (z4) {
                inputStreamOpenInputStream.mark(inputStreamOpenInputStream.available());
                if (inputStream2 != null) {
                    inputStream2.mark(inputStream2.available());
                }
            }
            this.mFirmwareInputStream = inputStreamOpenInputStream;
            this.mInitFileInputStream = inputStream2;
            sendLogBroadcast(5, "Firmware file opened successfully");
            this.mProgressInfo = new DfuProgressInfo(this);
            if (this.mAborted) {
                logw("Upload aborted");
                sendLogBroadcast(15, "Upload aborted");
                this.mProgressInfo.setProgress(-7);
                if (!booleanExtra2) {
                    return;
                }
            } else {
                sendLogBroadcast(1, "Connecting to DFU target...");
                this.mProgressInfo.setProgress(-1);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                InputStream inputStream3 = inputStreamOpenInputStream;
                BluetoothGatt bluetoothGattConnect = connect(stringExtra);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (bluetoothGattConnect == null) {
                    loge("Bluetooth adapter disabled");
                    sendLogBroadcast(20, "Bluetooth adapter disabled");
                    report(ERROR_BLUETOOTH_DISABLED);
                    if (!booleanExtra2) {
                        return;
                    }
                } else {
                    int i14 = this.mError;
                    if (i14 > 0) {
                        if ((i14 & 32768) > 0) {
                            int i15 = i14 & (-32769);
                            logi(str + (jElapsedRealtime2 - jElapsedRealtime) + " ms");
                            if (i15 != 133 || jElapsedRealtime2 <= jElapsedRealtime + 25000) {
                                loge("An error occurred while connecting to the device: " + i15);
                                sendLogBroadcast(20, String.format(Locale.US, "Connection failed (0x%02X): %s", Integer.valueOf(i15), AbstractC31366a.m96477q(i15)));
                            } else {
                                loge("Device not reachable. Check if the device with address " + stringExtra + " is in range, is advertising and is connectable");
                                sendLogBroadcast(20, "Error 133: Connection timeout");
                            }
                        } else {
                            int i16 = i14 & (-16385);
                            loge("An error occurred during discovering services:" + i16);
                            sendLogBroadcast(20, String.format(Locale.US, "Connection failed (0x%02X): %s", Integer.valueOf(i16), AbstractC31366a.m96476p(i16)));
                        }
                        int intExtra5 = intent.getIntExtra(EXTRA_RECONNECTION_ATTEMPT, 0);
                        StringBuilder sb4 = new StringBuilder("Attempt: ");
                        int i17 = intExtra5 + 1;
                        sb4.append(i17);
                        logi(sb4.toString());
                        if (intExtra5 < 2) {
                            sendLogBroadcast(15, "Retrying...");
                            if (this.mConnectionState != 0) {
                                disconnect(bluetoothGattConnect);
                            }
                            refreshDeviceCache(bluetoothGattConnect, true);
                            close(bluetoothGattConnect);
                            logi("Restarting the service");
                            Intent intent2 = new Intent();
                            intent2.fillIn(intent, 24);
                            intent2.putExtra(EXTRA_RECONNECTION_ATTEMPT, i17);
                            if (booleanExtra2) {
                                startForegroundService(intent2);
                            } else {
                                startService(intent2);
                            }
                            if (!booleanExtra2) {
                                return;
                            }
                        } else {
                            terminateConnection(bluetoothGattConnect, this.mError);
                            if (!booleanExtra2) {
                                return;
                            }
                        }
                    } else if (this.mConnectionState == 0) {
                        sendLogBroadcast(20, "Disconnected");
                        terminateConnection(bluetoothGattConnect, 4096);
                        if (!booleanExtra2) {
                            return;
                        }
                    } else if (this.mAborted) {
                        logw("Upload aborted");
                        sendLogBroadcast(15, "Upload aborted");
                        terminateConnection(bluetoothGattConnect, 0);
                        this.mProgressInfo.setProgress(-7);
                        if (!booleanExtra2) {
                            return;
                        }
                    } else {
                        sendLogBroadcast(5, "Services discovered");
                        intent.putExtra(EXTRA_RECONNECTION_ATTEMPT, 0);
                        DfuService serviceImpl = null;
                        try {
                            try {
                                try {
                                    DfuServiceProvider dfuServiceProvider = new DfuServiceProvider();
                                    this.mDfuServiceImpl = dfuServiceProvider;
                                    serviceImpl = dfuServiceProvider.getServiceImpl(intent, this, bluetoothGattConnect);
                                    this.mDfuServiceImpl = serviceImpl;
                                    if (serviceImpl == null) {
                                        Log.w(TAG, "DFU Service not found.");
                                        try {
                                            sendLogBroadcast(15, "DFU Service not found");
                                            terminateConnection(bluetoothGattConnect, ERROR_SERVICE_NOT_FOUND);
                                            if (serviceImpl != null) {
                                                serviceImpl.release();
                                            }
                                            if (!booleanExtra2) {
                                                return;
                                            }
                                        } catch (UploadAbortedException unused2) {
                                            i13 = 15;
                                            logw("Upload aborted");
                                            sendLogBroadcast(i13, "Upload aborted");
                                            terminateConnection(bluetoothGattConnect, 0);
                                            this.mProgressInfo.setProgress(-7);
                                            if (serviceImpl != null) {
                                                serviceImpl.release();
                                            }
                                            if (!booleanExtra2) {
                                                return;
                                            }
                                        }
                                    } else {
                                        i13 = 15;
                                        try {
                                            if (serviceImpl.initialize(intent, bluetoothGattConnect, intExtra4, inputStream3, inputStream2)) {
                                                serviceImpl.performDfu(intent);
                                            }
                                        } catch (UploadAbortedException unused3) {
                                            logw("Upload aborted");
                                            sendLogBroadcast(i13, "Upload aborted");
                                            terminateConnection(bluetoothGattConnect, 0);
                                            this.mProgressInfo.setProgress(-7);
                                            if (serviceImpl != null) {
                                            }
                                            if (!booleanExtra2) {
                                                return;
                                            }
                                            stopForeground(booleanExtra);
                                        }
                                        serviceImpl.release();
                                        if (!booleanExtra2) {
                                            return;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    if (0 != 0) {
                                        serviceImpl.release();
                                    }
                                    throw th3;
                                }
                            } catch (UploadAbortedException unused4) {
                                i13 = 15;
                            }
                            if (serviceImpl != null) {
                                serviceImpl.release();
                            }
                        } catch (DeviceDisconnectedException e17) {
                            sendLogBroadcast(20, "Device has disconnected");
                            loge(e17.getMessage());
                            close(bluetoothGattConnect);
                            int intExtra6 = intent.getIntExtra(EXTRA_DFU_ATTEMPT, 0);
                            int intExtra7 = intent.getIntExtra(EXTRA_MAX_DFU_ATTEMPTS, 0);
                            if (intExtra6 < intExtra7) {
                                StringBuilder sb5 = new StringBuilder("Restarting the service (");
                                int i18 = intExtra6 + 1;
                                sb5.append(i18);
                                sb5.append(" /");
                                sb5.append(intExtra7);
                                sb5.append(")");
                                logi(sb5.toString());
                                Intent intent3 = new Intent();
                                intent3.fillIn(intent, 24);
                                intent3.putExtra(EXTRA_DFU_ATTEMPT, i18);
                                if (booleanExtra2) {
                                    startForegroundService(intent3);
                                } else {
                                    startService(intent3);
                                }
                                if (0 != 0) {
                                    serviceImpl.release();
                                }
                                if (!booleanExtra2) {
                                    return;
                                }
                            } else {
                                report(4096);
                                if (0 != 0) {
                                }
                            }
                        } catch (DfuException e18) {
                            int errorNumber = e18.getErrorNumber();
                            if ((errorNumber & 32768) > 0) {
                                int i19 = errorNumber & (-32769);
                                sendLogBroadcast(20, String.format(Locale.US, "Error (0x%02X): %s", Integer.valueOf(i19), AbstractC31366a.m96477q(i19)));
                            } else {
                                int i24 = errorNumber & (-16385);
                                sendLogBroadcast(20, String.format(Locale.US, "Error (0x%02X): %s", Integer.valueOf(i24), AbstractC31366a.m96476p(i24)));
                            }
                            loge(e18.getMessage());
                            terminateConnection(bluetoothGattConnect, e18.getErrorNumber());
                            if (0 != 0) {
                            }
                        }
                        logw("Upload aborted");
                        sendLogBroadcast(i13, "Upload aborted");
                        terminateConnection(bluetoothGattConnect, 0);
                        this.mProgressInfo.setProgress(-7);
                        if (!booleanExtra2) {
                            return;
                        }
                    }
                }
            }
            stopForeground(booleanExtra);
        } catch (Throwable th4) {
            if (booleanExtra2) {
                stopForeground(booleanExtra);
            }
            throw th4;
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(NOTIFICATION_ID);
        }
        stopSelf();
    }

    public void refreshDeviceCache(BluetoothGatt bluetoothGatt, boolean z4) {
        if (z4 || bluetoothGatt.getDevice().getBondState() == 10) {
            sendLogBroadcast(0, "gatt.refresh() (hidden)");
            try {
                logi("Refreshing result: " + ((Boolean) bluetoothGatt.getClass().getMethod("refresh", null).invoke(bluetoothGatt, null)).booleanValue());
            } catch (Exception e5) {
                loge("An exception occurred while refreshing device", e5);
                sendLogBroadcast(15, "Refreshing failed");
            }
        }
    }

    public void sendLogBroadcast(int i13, String str) {
        String strM30461o = AbstractC11266d.m30461o("[DFU] ", str);
        Intent intent = new Intent(BROADCAST_LOG);
        intent.putExtra(EXTRA_LOG_MESSAGE, strM30461o);
        intent.putExtra(EXTRA_LOG_LEVEL, i13);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        C30028b.m91918a(this).m91920c(intent);
    }

    public void terminateConnection(BluetoothGatt bluetoothGatt, int i13) {
        if (this.mConnectionState != 0) {
            disconnect(bluetoothGatt);
        }
        refreshDeviceCache(bluetoothGatt, false);
        close(bluetoothGatt);
        waitFor(600L);
        if (i13 != 0) {
            report(i13);
        }
    }

    public void updateErrorNotification(NotificationCompat.Builder builder) {
    }

    public void updateForegroundNotification(NotificationCompat.Builder builder) {
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressInfo.ProgressListener
    public void updateProgressNotification() {
        DfuProgressInfo dfuProgressInfo = this.mProgressInfo;
        int progress = dfuProgressInfo.getProgress();
        if (this.mLastProgress == progress) {
            return;
        }
        this.mLastProgress = progress;
        sendProgressBroadcast(dfuProgressInfo);
        if (this.mDisableNotification) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.mLastNotificationTime >= 250 || -6 == progress || -7 == progress) {
            this.mLastNotificationTime = jElapsedRealtime;
            String str = this.mDeviceAddress;
            String string = this.mDeviceName;
            if (string == null) {
                string = getString(C26930R.string.dfu_unknown_name);
            }
            NotificationCompat.Builder onlyAlertOnce = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_DFU).setSmallIcon(android.R.drawable.stat_sys_upload).setOnlyAlertOnce(true);
            onlyAlertOnce.setColor(-7829368);
            switch (progress) {
                case PROGRESS_ABORTED /* -7 */:
                    onlyAlertOnce.setOngoing(false).setContentTitle(getString(C26930R.string.dfu_status_aborted)).setSmallIcon(android.R.drawable.stat_sys_upload_done).setContentText(getString(C26930R.string.dfu_status_aborted_msg)).setAutoCancel(true);
                    break;
                case PROGRESS_COMPLETED /* -6 */:
                    onlyAlertOnce.setOngoing(false).setContentTitle(getString(C26930R.string.dfu_status_completed)).setSmallIcon(android.R.drawable.stat_sys_upload_done).setContentText(getString(C26930R.string.dfu_status_completed_msg)).setAutoCancel(true).setColor(-16730086);
                    break;
                case -5:
                    onlyAlertOnce.setOngoing(true).setContentTitle(getString(C26930R.string.dfu_status_disconnecting)).setContentText(getString(C26930R.string.dfu_status_disconnecting_msg, string)).setProgress(100, 0, true);
                    break;
                case -4:
                    onlyAlertOnce.setOngoing(true).setContentTitle(getString(C26930R.string.dfu_status_validating)).setContentText(getString(C26930R.string.dfu_status_validating_msg)).setProgress(100, 0, true);
                    break;
                case -3:
                    onlyAlertOnce.setOngoing(true).setContentTitle(getString(C26930R.string.dfu_status_switching_to_dfu)).setContentText(getString(C26930R.string.dfu_status_switching_to_dfu_msg)).setProgress(100, 0, true);
                    break;
                case -2:
                    onlyAlertOnce.setOngoing(true).setContentTitle(getString(C26930R.string.dfu_status_starting)).setContentText(getString(C26930R.string.dfu_status_starting_msg)).setProgress(100, 0, true);
                    break;
                case -1:
                    onlyAlertOnce.setOngoing(true).setContentTitle(getString(C26930R.string.dfu_status_connecting)).setContentText(getString(C26930R.string.dfu_status_connecting_msg, string)).setProgress(100, 0, true);
                    break;
                default:
                    onlyAlertOnce.setOngoing(true).setContentTitle(dfuProgressInfo.getTotalParts() == 1 ? getString(C26930R.string.dfu_status_uploading) : getString(C26930R.string.dfu_status_uploading_part, Integer.valueOf(dfuProgressInfo.getCurrentPart()), Integer.valueOf(dfuProgressInfo.getTotalParts()))).setContentText(getString(C26930R.string.dfu_status_uploading_msg, string)).setProgress(100, progress, false);
                    break;
            }
            Intent intent = new Intent(this, getNotificationTarget());
            intent.addFlags(268435456);
            intent.putExtra(EXTRA_DEVICE_ADDRESS, str);
            intent.putExtra(EXTRA_DEVICE_NAME, string);
            intent.putExtra(EXTRA_PROGRESS, progress);
            onlyAlertOnce.setContentIntent(PendingIntent.getActivity(this, 0, intent, 201326592));
            updateProgressNotification(onlyAlertOnce, progress);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(NOTIFICATION_ID, onlyAlertOnce.build());
            }
        }
    }

    public void waitFor(long j7) {
        synchronized (this.mLock) {
            try {
                sendLogBroadcast(0, "wait(" + j7 + ")");
                this.mLock.wait(j7);
            } catch (InterruptedException e5) {
                loge("Sleeping interrupted", e5);
            }
        }
    }

    public void waitUntilDisconnected() {
        try {
            synchronized (this.mLock) {
                while (this.mConnectionState != 0 && this.mError == 0) {
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

    private void loge(String str, Throwable th3) {
        Log.e(TAG, str, th3);
    }

    private InputStream openInputStream(Uri uri, String str, int i13, int i14) throws IOException {
        InputStream inputStreamOpenInputStream;
        if (uri.toString().startsWith("file:///android_asset/")) {
            inputStreamOpenInputStream = getAssets().open(uri.getPath().substring(15));
        } else {
            inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        }
        if ("application/zip".equals(str)) {
            return new ArchiveInputStream(inputStreamOpenInputStream, i13, i14);
        }
        Cursor cursorQuery = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext() && cursorQuery.getString(0).toLowerCase(Locale.US).endsWith("hex")) {
                    HexInputStream hexInputStream = new HexInputStream(inputStreamOpenInputStream, i13);
                    cursorQuery.close();
                    return hexInputStream;
                }
            } catch (Throwable th3) {
                try {
                    cursorQuery.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return inputStreamOpenInputStream;
    }

    private InputStream openInputStream(int i13, String str, int i14, int i15) throws IOException {
        InputStream inputStreamOpenRawResource = getResources().openRawResource(i13);
        if ("application/zip".equals(str)) {
            return new ArchiveInputStream(inputStreamOpenRawResource, i14, i15);
        }
        inputStreamOpenRawResource.mark(2);
        int i16 = inputStreamOpenRawResource.read();
        inputStreamOpenRawResource.reset();
        return i16 == 58 ? new HexInputStream(inputStreamOpenRawResource, i14) : inputStreamOpenRawResource;
    }

    public void updateProgressNotification(NotificationCompat.Builder builder, int i13) {
        if (i13 == -7 || i13 == -6) {
            return;
        }
        Intent intent = new Intent(BROADCAST_ACTION);
        intent.putExtra(EXTRA_ACTION, 2);
        builder.addAction(C26930R.drawable.ic_action_notify_cancel, getString(C26930R.string.dfu_action_abort), PendingIntent.getBroadcast(this, 1, intent, 201326592));
    }
}
