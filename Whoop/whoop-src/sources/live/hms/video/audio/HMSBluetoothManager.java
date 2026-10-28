package live.hms.video.audio;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.List;
import java.util.Set;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.ThreadUtils;

/* JADX INFO: loaded from: classes3.dex */
class HMSBluetoothManager {
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 4000;
    private static final int MAX_SCO_CONNECTION_ATTEMPTS = 2;
    private static final String TAG = "HMSBluetoothManager";
    private final Context HMSContext;
    private final AudioManager audioManager;
    private BluetoothAdapter bluetoothAdapter;
    private BluetoothDevice bluetoothDevice;
    private BluetoothHeadset bluetoothHeadset;
    private final BroadcastReceiver bluetoothHeadsetReceiver;
    private final BluetoothProfile.ServiceListener bluetoothServiceListener;
    private State bluetoothState;
    private final Handler handler;
    private final HMSAudioManagerLegacy hmsAudioManager;
    int scoConnectionAttempts;
    private String bluetoothDeviceName = "";
    private final Runnable bluetoothTimeoutRunnable = new Runnable() { // from class: live.hms.video.audio.HMSBluetoothManager.1
        @Override // java.lang.Runnable
        public void run() {
            HMSBluetoothManager.this.bluetoothTimeout();
        }
    };

    public class BluetoothHeadsetBroadcastReceiver extends BroadcastReceiver {
        private BluetoothHeadsetBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (HMSBluetoothManager.this.bluetoothState == State.UNINITIALIZED) {
                return;
            }
            String action = intent.getAction();
            if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                Log.d(HMSBluetoothManager.TAG, "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_CONNECTION_STATE_CHANGED, s=" + HMSBluetoothManager.this.stateToString(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + HMSBluetoothManager.this.bluetoothState);
                if (intExtra == 2) {
                    HMSBluetoothManager hMSBluetoothManager = HMSBluetoothManager.this;
                    hMSBluetoothManager.scoConnectionAttempts = 0;
                    hMSBluetoothManager.updateAudioDeviceState();
                } else if (intExtra != 1 && intExtra != 3 && intExtra == 0) {
                    HMSBluetoothManager.this.stopScoAudio();
                    HMSBluetoothManager.this.updateAudioDeviceState();
                }
            } else if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                Log.d(HMSBluetoothManager.TAG, "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_AUDIO_STATE_CHANGED, s=" + HMSBluetoothManager.this.stateToString(intExtra2) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + HMSBluetoothManager.this.bluetoothState);
                if (intExtra2 == 12) {
                    HMSBluetoothManager.this.cancelTimer();
                    if (HMSBluetoothManager.this.bluetoothState == State.SCO_CONNECTING) {
                        HMSLogger.m71136d(HMSBluetoothManager.TAG, "+++ Bluetooth audio SCO is now connected");
                        HMSBluetoothManager.this.bluetoothState = State.SCO_CONNECTED;
                        HMSBluetoothManager hMSBluetoothManager2 = HMSBluetoothManager.this;
                        hMSBluetoothManager2.scoConnectionAttempts = 0;
                        hMSBluetoothManager2.updateAudioDeviceState();
                    } else {
                        Log.w(HMSBluetoothManager.TAG, "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
                    }
                } else if (intExtra2 == 11) {
                    Log.d(HMSBluetoothManager.TAG, "+++ Bluetooth audio SCO is now connecting...");
                } else if (intExtra2 == 10) {
                    Log.d(HMSBluetoothManager.TAG, "+++ Bluetooth audio SCO is now disconnectedCurrent state is: " + HMSBluetoothManager.this.getState());
                    HMSBluetoothManager.this.bluetoothState = State.SCO_DISCONNECTING;
                    if (isInitialStickyBroadcast()) {
                        Log.d(HMSBluetoothManager.TAG, "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                        return;
                    }
                    HMSBluetoothManager.this.updateAudioDeviceState();
                }
            }
            HMSLogger.m71136d(HMSBluetoothManager.TAG, "onReceive done: BT state=" + HMSBluetoothManager.this.bluetoothState);
        }
    }

    public class BluetoothServiceListener implements BluetoothProfile.ServiceListener {
        private BluetoothServiceListener() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i13, BluetoothProfile bluetoothProfile) {
            if (i13 != 1 || HMSBluetoothManager.this.bluetoothState == State.UNINITIALIZED) {
                return;
            }
            HMSLogger.m71136d(HMSBluetoothManager.TAG, "BluetoothServiceListener.onServiceConnected: BT state=" + HMSBluetoothManager.this.bluetoothState);
            HMSBluetoothManager.this.bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
            HMSBluetoothManager.this.updateAudioDeviceState();
            HMSLogger.m71136d(HMSBluetoothManager.TAG, "onServiceConnected done: BT state=" + HMSBluetoothManager.this.bluetoothState);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i13) {
            if (i13 != 1 || HMSBluetoothManager.this.bluetoothState == State.UNINITIALIZED) {
                return;
            }
            HMSLogger.m71136d(HMSBluetoothManager.TAG, "BluetoothServiceListener.onServiceDisconnected: BT state=" + HMSBluetoothManager.this.bluetoothState);
            HMSBluetoothManager.this.stopScoAudio();
            HMSBluetoothManager.this.bluetoothHeadset = null;
            HMSBluetoothManager.this.bluetoothDevice = null;
            HMSBluetoothManager.this.bluetoothState = State.HEADSET_UNAVAILABLE;
            HMSBluetoothManager.this.updateAudioDeviceState();
            HMSLogger.m71136d(HMSBluetoothManager.TAG, "onServiceDisconnected done: BT state=" + HMSBluetoothManager.this.bluetoothState);
        }
    }

    public enum State {
        UNINITIALIZED,
        ERROR,
        HEADSET_UNAVAILABLE,
        HEADSET_AVAILABLE,
        SCO_DISCONNECTING,
        SCO_CONNECTING,
        SCO_CONNECTED
    }

    public HMSBluetoothManager(Context context, HMSAudioManagerLegacy hMSAudioManagerLegacy) {
        HMSLogger.m71136d(TAG, "ctor");
        this.HMSContext = context;
        this.hmsAudioManager = hMSAudioManagerLegacy;
        this.audioManager = getAudioManager(context);
        this.bluetoothState = State.UNINITIALIZED;
        this.bluetoothServiceListener = new BluetoothServiceListener();
        this.bluetoothHeadsetReceiver = new BluetoothHeadsetBroadcastReceiver();
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bluetoothTimeout() {
        if (this.bluetoothState == State.UNINITIALIZED || this.bluetoothHeadset == null) {
            return;
        }
        Log.d(TAG, "bluetoothTimeout: BT state=" + this.bluetoothState + ", attempts: " + this.scoConnectionAttempts + ", SCO is on: " + isScoOn());
        if (this.bluetoothState != State.SCO_CONNECTING) {
            return;
        }
        List<BluetoothDevice> connectedDevices = this.bluetoothHeadset.getConnectedDevices();
        if (connectedDevices.size() > 0) {
            BluetoothDevice bluetoothDevice = connectedDevices.get(0);
            this.bluetoothDevice = bluetoothDevice;
            if (this.bluetoothHeadset.isAudioConnected(bluetoothDevice)) {
                Log.d(TAG, "SCO connected with " + this.bluetoothDevice.getName());
                this.bluetoothState = State.SCO_CONNECTED;
                this.scoConnectionAttempts = 0;
            } else {
                Log.d(TAG, "SCO is not connected with " + this.bluetoothDevice.getName());
                Log.w(TAG, "BT failed to connect after timeout");
                stopScoAudio();
            }
        } else {
            Log.w(TAG, "BT failed to connect after timeout");
            stopScoAudio();
        }
        updateAudioDeviceState();
        Log.d(TAG, "bluetoothTimeout done: BT state=" + this.bluetoothState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimer() {
        Log.d(TAG, "cancelTimer");
        this.handler.removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    public static HMSBluetoothManager create(Context context, HMSAudioManagerLegacy hMSAudioManagerLegacy) {
        HMSLogger.m71136d(TAG, "create" + ThreadUtils.getThreadInfo());
        return new HMSBluetoothManager(context, hMSAudioManagerLegacy);
    }

    private boolean isScoOn() {
        return this.audioManager.isBluetoothScoOn();
    }

    private void startTimer() {
        Log.d(TAG, "startTimer");
        this.handler.postDelayed(this.bluetoothTimeoutRunnable, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String stateToString(int i13) {
        if (i13 == 0) {
            return "DISCONNECTED";
        }
        if (i13 == 1) {
            return "CONNECTING";
        }
        if (i13 == 2) {
            return "CONNECTED";
        }
        if (i13 == 3) {
            return "DISCONNECTING";
        }
        switch (i13) {
            case 10:
                return "OFF";
            case 11:
                return "TURNING_ON";
            case 12:
                return "ON";
            case 13:
                return "TURNING_OFF";
            default:
                return "INVALID";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAudioDeviceState() {
        Log.d(TAG, "updateAudioDeviceState");
        this.hmsAudioManager.updateAudioDeviceState();
    }

    public AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public String getBluetoothDeviceName() {
        return this.bluetoothDeviceName;
    }

    public boolean getBluetoothProfileProxy(Context context, BluetoothProfile.ServiceListener serviceListener, int i13) {
        return this.bluetoothAdapter.getProfileProxy(context, serviceListener, i13);
    }

    public State getState() {
        return this.bluetoothState;
    }

    public boolean hasAndroid12Permissions(Context context) {
        return context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public boolean hasPermission(Context context, String str) {
        return this.HMSContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public boolean isDeviceAndroid12AndAbove() {
        return Build.VERSION.SDK_INT > 30;
    }

    public boolean isTargetingAndroid12AndAbove() {
        return this.HMSContext.getApplicationInfo().targetSdkVersion > 30;
    }

    @SuppressLint({"HardwareIds"})
    public void logBluetoothAdapterInfo(BluetoothAdapter bluetoothAdapter) {
        Log.d(TAG, "BluetoothAdapter: enabled=" + bluetoothAdapter.isEnabled() + ", state=" + stateToString(bluetoothAdapter.getState()) + ", name=" + bluetoothAdapter.getName() + ", address=" + bluetoothAdapter.getAddress());
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        if (bondedDevices.isEmpty()) {
            return;
        }
        Log.d(TAG, "paired devices:");
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            Log.d(TAG, " name=" + bluetoothDevice.getName() + ", address=" + bluetoothDevice.getAddress());
        }
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.HMSContext.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void start(BluetoothErrors bluetoothErrors) {
        HMSLogger.m71136d(TAG, "start");
        boolean z4 = (hasPermission(this.HMSContext, "android.permission.BLUETOOTH") || (isDeviceAndroid12AndAbove() && isTargetingAndroid12AndAbove())) ? false : true;
        if (isDeviceAndroid12AndAbove() && isTargetingAndroid12AndAbove()) {
            hasAndroid12Permissions(this.HMSContext);
        }
        BluetoothErrorType bluetoothErrorType = z4 ? BluetoothErrorType.NO_BLUETOOTH_PERMISSON : null;
        if (bluetoothErrorType != null) {
            Log.w(TAG, "Process (pid=" + Process.myPid() + ") lacks either BLUETOOTH permission or BLUETOOTH_CONNECT permission (required on android 12). Bluetooth was not initialized. To use bluetooth headsets, please grant those permissions.");
            bluetoothErrors.onBluetoothError(bluetoothErrorType);
            return;
        }
        if (this.bluetoothState != State.UNINITIALIZED) {
            Log.w(TAG, "Invalid BT state");
            return;
        }
        this.bluetoothHeadset = null;
        this.bluetoothDevice = null;
        this.scoConnectionAttempts = 0;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.bluetoothAdapter = defaultAdapter;
        if (defaultAdapter == null) {
            Log.w(TAG, "Device does not support Bluetooth");
            return;
        }
        if (!this.audioManager.isBluetoothScoAvailableOffCall()) {
            Log.e(TAG, "Bluetooth SCO audio is not available off call");
            return;
        }
        logBluetoothAdapterInfo(this.bluetoothAdapter);
        if (!getBluetoothProfileProxy(this.HMSContext, this.bluetoothServiceListener, 1)) {
            Log.e(TAG, "BluetoothAdapter.getProfileProxy(HEADSET) failed");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        registerReceiver(this.bluetoothHeadsetReceiver, intentFilter);
        HMSLogger.m71136d(TAG, "HEADSET profile state: " + stateToString(this.bluetoothAdapter.getProfileConnectionState(1)));
        HMSLogger.m71136d(TAG, "Bluetooth proxy for headset profile has started");
        this.bluetoothState = State.HEADSET_UNAVAILABLE;
        HMSLogger.m71136d(TAG, "start done: BT state=" + this.bluetoothState);
    }

    public boolean startScoAudio() {
        HMSLogger.m71136d(TAG, "startSco: BT state=" + this.bluetoothState + ", attempts: " + this.scoConnectionAttempts + ", SCO is on: " + isScoOn());
        if (this.bluetoothState != State.HEADSET_AVAILABLE) {
            HMSLogger.m71137e(TAG, "BT SCO connection headset failure - sco init failure");
            return false;
        }
        Log.d(TAG, "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
        this.bluetoothState = State.SCO_CONNECTING;
        this.audioManager.startBluetoothSco();
        this.audioManager.setBluetoothScoOn(true);
        this.scoConnectionAttempts++;
        startTimer();
        Log.d(TAG, "startScoAudio done: BT state=" + this.bluetoothState + ", SCO is on: " + isScoOn());
        return true;
    }

    public void stop() {
        HMSLogger.m71136d(TAG, "stop: BT state=" + this.bluetoothState);
        if (this.bluetoothAdapter == null) {
            return;
        }
        stopScoAudio();
        State state = this.bluetoothState;
        State state2 = State.UNINITIALIZED;
        if (state == state2) {
            return;
        }
        unregisterReceiver(this.bluetoothHeadsetReceiver);
        cancelTimer();
        BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
        if (bluetoothHeadset != null) {
            this.bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
            this.bluetoothHeadset = null;
        }
        this.bluetoothAdapter = null;
        this.bluetoothDevice = null;
        this.bluetoothState = state2;
        HMSLogger.m71136d(TAG, "stop done: BT state=" + this.bluetoothState);
    }

    public void stopScoAudio() {
        Log.d(TAG, "stopScoAudio: BT state=" + this.bluetoothState + ", SCO is on: " + isScoOn());
        State state = this.bluetoothState;
        if (state == State.SCO_CONNECTING || state == State.SCO_CONNECTED) {
            cancelTimer();
            this.audioManager.stopBluetoothSco();
            this.audioManager.setBluetoothScoOn(false);
            this.bluetoothState = State.SCO_DISCONNECTING;
            Log.d(TAG, "stopScoAudio done: BT state=" + this.bluetoothState + ", SCO is on: " + isScoOn());
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        this.HMSContext.unregisterReceiver(broadcastReceiver);
    }

    public void updateDevice() {
        if (this.bluetoothState == State.UNINITIALIZED || this.bluetoothHeadset == null) {
            return;
        }
        Log.d(TAG, "updateDevice");
        List<BluetoothDevice> connectedDevices = this.bluetoothHeadset.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            this.bluetoothDevice = null;
            this.bluetoothState = State.HEADSET_UNAVAILABLE;
            this.bluetoothDeviceName = "";
            Log.d(TAG, "No connected bluetooth headset");
        } else {
            BluetoothDevice bluetoothDevice = connectedDevices.get(0);
            this.bluetoothDevice = bluetoothDevice;
            try {
                this.bluetoothDeviceName = bluetoothDevice.getName();
            } catch (Exception unused) {
            }
            this.bluetoothState = State.HEADSET_AVAILABLE;
            Log.d(TAG, "Connected bluetooth headset: name=" + this.bluetoothDevice.getName() + ", state=" + stateToString(this.bluetoothHeadset.getConnectionState(this.bluetoothDevice)) + ", SCO audio=" + this.bluetoothHeadset.isAudioConnected(this.bluetoothDevice));
        }
        Log.d(TAG, "updateDevice done: BT state=" + this.bluetoothState);
    }
}
