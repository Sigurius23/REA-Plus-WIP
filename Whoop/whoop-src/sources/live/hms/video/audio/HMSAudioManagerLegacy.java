package live.hms.video.audio;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.whoop.service.network.model.UserState;
import hn.C17508p;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.RunnableC20151r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import live.hms.video.error.ErrorFactory;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.PhoneCallState;
import live.hms.video.sdk.IErrorListener;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.ThreadUtils;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p479s4.AbstractC32122c;

/* JADX INFO: loaded from: classes3.dex */
public class HMSAudioManagerLegacy implements HMSAudioManager {
    private static final String PREF_SPEAKERPHONE_DEAFULT = "auto";
    private static final String PREF_SPEAKERPHONE_KEY = "speakerphone_preference";
    private static final String SPEAKERPHONE_AUTO = "auto";
    private static final String SPEAKERPHONE_FALSE = "false";
    private static final String SPEAKERPHONE_TRUE = "true";
    private static final String TAG = "HMSAudioManagerLegacy";
    private final AnalyticsEventsService analytics;
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private final AudioManager audioManager;
    private HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener;
    private final HMSBluetoothManager bluetoothManager;
    private HMSAudioManager.AudioDevice defaultAudioDevice;
    private IErrorListener errorListener;
    private boolean hasWiredHeadset;
    private HMSAudioTrackSettings hmsAudioTrackSettings;
    private final Context hmscontext;
    private boolean isStarted;
    Handler mainHandler;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private final String useSpeakerphone;
    private HMSAudioManager.AudioDevice userSelectedAudioDevice;
    private int savedAudioMode = -2;
    private final Object TELEPHONY_LOCK = new Object();
    private HMSAudioManager.AudioDevice selectedAudioDevice = HMSAudioManager.AudioDevice.AUTOMATIC;
    private int userSelectedAudioMode = 3;
    private Set<HMSAudioManager.AudioDevice> audioDevices = new HashSet();
    private final List<AudioManagerFocusChangeCallbacks> focusChangeCallbacks = new ArrayList();
    private PhoneStateListener phoneStateChangeListener = null;
    private final BroadcastReceiver wiredHeadsetReceiver = new WiredHeadsetReceiver();
    private HMSAudioManager.AudioManagerState amState = HMSAudioManager.AudioManagerState.UNINITIALIZED;

    /* JADX INFO: renamed from: live.hms.video.audio.HMSAudioManagerLegacy$3 */
    public static /* synthetic */ class C241053 {
        static final /* synthetic */ int[] $SwitchMap$live$hms$video$audio$HMSAudioManager$AudioDevice;

        static {
            int[] iArr = new int[HMSAudioManager.AudioDevice.values().length];
            $SwitchMap$live$hms$video$audio$HMSAudioManager$AudioDevice = iArr;
            try {
                iArr[HMSAudioManager.AudioDevice.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$live$hms$video$audio$HMSAudioManager$AudioDevice[HMSAudioManager.AudioDevice.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$live$hms$video$audio$HMSAudioManager$AudioDevice[HMSAudioManager.AudioDevice.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$live$hms$video$audio$HMSAudioManager$AudioDevice[HMSAudioManager.AudioDevice.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class WiredHeadsetReceiver extends BroadcastReceiver {
        private static final int HAS_MIC = 1;
        private static final int HAS_NO_MIC = 0;
        private static final int STATE_PLUGGED = 1;
        private static final int STATE_UNPLUGGED = 0;

        private WiredHeadsetReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("state", 0);
            int intExtra2 = intent.getIntExtra("microphone", 0);
            String stringExtra = intent.getStringExtra("name");
            StringBuilder sb4 = new StringBuilder("WiredHeadsetReceiver.onReceive");
            sb4.append(ThreadUtils.getThreadInfo());
            sb4.append(": a=");
            sb4.append(intent.getAction());
            sb4.append(", s=");
            sb4.append(intExtra == 0 ? "unplugged" : "plugged");
            sb4.append(", m=");
            AbstractC11266d.m30444B(sb4, intExtra2 == 1 ? "mic" : "no mic", ", n=", stringExtra, ", sb=");
            sb4.append(isInitialStickyBroadcast());
            HMSLogger.m71136d(HMSAudioManagerLegacy.TAG, sb4.toString());
            HMSAudioManagerLegacy.this.hasWiredHeadset = intExtra == 1;
            HMSAudioManagerLegacy.this.updateAudioDeviceState();
        }
    }

    public HMSAudioManagerLegacy(Context context, AnalyticsEventsService analyticsEventsService, HMSAudioTrackSettings hMSAudioTrackSettings, IErrorListener iErrorListener, HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener) {
        this.errorListener = null;
        this.hmsAudioTrackSettings = null;
        this.analytics = analyticsEventsService;
        this.hmscontext = context;
        this.errorListener = iErrorListener;
        this.mainHandler = new Handler(context.getMainLooper());
        this.hmsAudioTrackSettings = hMSAudioTrackSettings;
        this.audioManager = (AudioManager) context.getSystemService("audio");
        this.bluetoothManager = HMSBluetoothManager.create(context, this);
        this.audioManagerDeviceChangeListener = audioManagerDeviceChangeListener;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(PREF_SPEAKERPHONE_KEY, UserState.Sources.AUTO);
        this.useSpeakerphone = string;
        HMSLogger.m71136d(TAG, "useSpeakerphone: " + string);
        if (string.equals("false")) {
            this.defaultAudioDevice = HMSAudioManager.AudioDevice.EARPIECE;
        } else if (this.hasWiredHeadset) {
            this.defaultAudioDevice = HMSAudioManager.AudioDevice.WIRED_HEADSET;
        } else {
            this.defaultAudioDevice = HMSAudioManager.AudioDevice.SPEAKER_PHONE;
        }
        HMSLogger.m71136d(TAG, "defaultAudioDevice: " + this.defaultAudioDevice);
        HMSLogger.logDeviceInfo(TAG);
    }

    private void assertIsTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void deInitTelephony() {
        HMSAudioTrackSettings hMSAudioTrackSettings = this.hmsAudioTrackSettings;
        if (hMSAudioTrackSettings == null || this.mainHandler == null || this.phoneStateChangeListener == null || hMSAudioTrackSettings.getPhoneCallState() != PhoneCallState.DISABLE_MUTE_ON_VOIP_PHONE_CALL_RING) {
            return;
        }
        synchronized (this.TELEPHONY_LOCK) {
            this.mainHandler.post(new RunnableC20277c7(this, 25));
        }
    }

    private boolean hasEarpiece() {
        return this.hmscontext.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @Deprecated
    private boolean hasWiredHeadset() {
        for (AudioDeviceInfo audioDeviceInfo : this.audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                HMSLogger.m71136d(TAG, "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                HMSLogger.m71136d(TAG, "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }

    private void initTelephony(IErrorListener iErrorListener) {
        HMSAudioTrackSettings hMSAudioTrackSettings = this.hmsAudioTrackSettings;
        if (hMSAudioTrackSettings == null || this.mainHandler == null || hMSAudioTrackSettings.getPhoneCallState() != PhoneCallState.DISABLE_MUTE_ON_VOIP_PHONE_CALL_RING) {
            return;
        }
        synchronized (this.TELEPHONY_LOCK) {
            this.mainHandler.post(new RunnableC20151r0(13, this, iErrorListener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deInitTelephony$1() {
        TelephonyManager telephonyManager = (TelephonyManager) this.hmscontext.getSystemService("phone");
        if (AbstractC32122c.checkSelfPermission(this.hmscontext, "android.permission.READ_PHONE_STATE") == 0) {
            telephonyManager.listen(this.phoneStateChangeListener, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTelephony$0(IErrorListener iErrorListener) {
        if (this.phoneStateChangeListener == null) {
            this.phoneStateChangeListener = new PhoneStateListener() { // from class: live.hms.video.audio.HMSAudioManagerLegacy.1
                @Override // android.telephony.PhoneStateListener
                public void onCallStateChanged(int i13, String str) {
                    super.onCallStateChanged(i13, str);
                    if (i13 == 2) {
                        StringBuilder sb4 = new StringBuilder("onCallStateChanged: ");
                        AudioChangeEvent audioChangeEvent = AudioChangeEvent.PHONE_RINGING;
                        sb4.append(audioChangeEvent);
                        HMSLogger.m71136d(HMSAudioManagerLegacy.TAG, sb4.toString());
                        HMSAudioManagerLegacy.this.sendAudioChangeEvent(audioChangeEvent);
                    }
                }
            };
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.hmscontext.getSystemService("phone");
        if (Build.VERSION.SDK_INT < 30) {
            telephonyManager.listen(this.phoneStateChangeListener, 32);
        } else if (AbstractC32122c.checkSelfPermission(this.hmscontext, "android.permission.READ_PHONE_STATE") == 0) {
            telephonyManager.listen(this.phoneStateChangeListener, 32);
        } else {
            iErrorListener.onError(ErrorFactory.ReadPhoneStateError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$2(BluetoothErrorType bluetoothErrorType) {
        this.errorListener.onError(ErrorFactory.BluetoothError(bluetoothErrorType));
    }

    private void onProximitySensorChangedState() {
        this.useSpeakerphone.equals(UserState.Sources.AUTO);
    }

    private void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.hmscontext.registerReceiver(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAudioChangeEvent(AudioChangeEvent audioChangeEvent) {
        Iterator<AudioManagerFocusChangeCallbacks> it = this.focusChangeCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAudioFocusChange(audioChangeEvent);
        }
    }

    private void setAudioDeviceInternal(HMSAudioManager.AudioDevice audioDevice) {
        HMSLogger.m71136d(TAG, "setAudioDeviceInternal(device=" + audioDevice + ")");
        int i13 = C241053.$SwitchMap$live$hms$video$audio$HMSAudioManager$AudioDevice[audioDevice.ordinal()];
        if (i13 == 1) {
            setSpeakerphoneOn(true);
        } else if (i13 == 2 || i13 == 3 || i13 == 4) {
            setSpeakerphoneOn(false);
        } else {
            HMSLogger.m71137e(TAG, "Invalid audio device selection");
        }
        this.selectedAudioDevice = audioDevice;
    }

    private void setMicrophoneMute(boolean z4) {
        if (this.audioManager.isMicrophoneMute() == z4) {
            return;
        }
        this.audioManager.setMicrophoneMute(z4);
    }

    private void setSpeakerphoneOn(boolean z4) {
        if (this.audioManager.isSpeakerphoneOn() == z4) {
            return;
        }
        this.audioManager.setSpeakerphoneOn(z4);
    }

    private void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        this.hmscontext.unregisterReceiver(broadcastReceiver);
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void addAudioFocusChangeCallback(AudioManagerFocusChangeCallbacks audioManagerFocusChangeCallbacks) {
        this.focusChangeCallbacks.add(audioManagerFocusChangeCallbacks);
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public Set<HMSAudioManager.AudioDevice> getAudioDevices() {
        return Collections.unmodifiableSet(new HashSet(this.audioDevices));
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public List<HMSAudioDeviceInfo> getAudioDevicesInfoList() {
        HMSBluetoothManager hMSBluetoothManager;
        ArrayList arrayList = new ArrayList();
        for (HMSAudioManager.AudioDevice audioDevice : this.audioDevices) {
            if (audioDevice != HMSAudioManager.AudioDevice.BLUETOOTH || (hMSBluetoothManager = this.bluetoothManager) == null) {
                arrayList.add(new HMSAudioDeviceInfo(audioDevice, ""));
            } else {
                arrayList.add(new HMSAudioDeviceInfo(audioDevice, hMSBluetoothManager.getBluetoothDeviceName()));
            }
        }
        return arrayList;
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public HMSAudioManager.AudioDevice getSelectedAudioDevice() {
        return this.selectedAudioDevice;
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public boolean isStarted() {
        return this.isStarted;
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void removeAudioFocusChangeCallback(AudioManagerFocusChangeCallbacks audioManagerFocusChangeCallbacks) {
        this.focusChangeCallbacks.remove(audioManagerFocusChangeCallbacks);
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void selectAudioDevice(HMSAudioManager.AudioDevice audioDevice) {
        if (!this.audioDevices.contains(audioDevice)) {
            HMSLogger.m71137e(TAG, "Can not select " + audioDevice + " from available " + this.audioDevices);
        }
        this.userSelectedAudioDevice = audioDevice;
        updateAudioDeviceState();
    }

    @Override // live.hms.video.audio.HMSAudioManager
    public void setAudioMode(int i13) {
        this.userSelectedAudioMode = i13;
        AudioManager audioManager = this.audioManager;
        if (audioManager == null || !this.isStarted) {
            return;
        }
        audioManager.setMode(i13);
    }

    @Override // live.hms.video.audio.HMSAudioManager
    @SuppressLint({"WrongConstant"})
    public void start() {
        HMSLogger.m71136d(TAG, "start HMSAudioManagerLegacy");
        HMSAudioManager.AudioManagerState audioManagerState = this.amState;
        HMSAudioManager.AudioManagerState audioManagerState2 = HMSAudioManager.AudioManagerState.RUNNING;
        if (audioManagerState == audioManagerState2) {
            HMSLogger.m71137e(TAG, "AudioManager is already active");
            return;
        }
        HMSLogger.m71136d(TAG, "AudioManager starts...");
        this.amState = audioManagerState2;
        this.savedAudioMode = this.audioManager.getMode();
        this.savedIsSpeakerPhoneOn = this.audioManager.isSpeakerphoneOn();
        this.savedIsMicrophoneMute = this.audioManager.isMicrophoneMute();
        this.hasWiredHeadset = hasWiredHeadset();
        IErrorListener iErrorListener = this.errorListener;
        if (iErrorListener != null) {
            initTelephony(new C17508p(iErrorListener, 24));
        }
        this.audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: live.hms.video.audio.HMSAudioManagerLegacy.2
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i13) {
                String str;
                if (i13 == -3) {
                    HMSAudioManagerLegacy.this.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK);
                    str = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
                } else if (i13 == -2) {
                    HMSAudioManagerLegacy.this.sendAudioChangeEvent(AudioChangeEvent.AUDIOFOCUS_LOSS_TRANSIENT);
                    str = "AUDIOFOCUS_LOSS_TRANSIENT";
                } else if (i13 == -1) {
                    HMSAudioManagerLegacy.this.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_LOSS);
                    str = "AUDIOFOCUS_LOSS";
                } else if (i13 == 1) {
                    HMSAudioManagerLegacy.this.sendAudioChangeEvent(AudioChangeEvent.AUDIOFOCUS_GAIN);
                    HMSLogger.m71136d(HMSAudioManagerLegacy.TAG, "Throwing away currently saved devices (forcing new device for onDeviceUpdate) since the audio was gained again.");
                    HMSAudioManagerLegacy.this.audioDevices = new HashSet();
                    HMSAudioManagerLegacy.this.updateAudioDeviceState();
                    str = "AUDIOFOCUS_GAIN";
                } else if (i13 == 2) {
                    HMSAudioManagerLegacy.this.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_GAIN_TRANSIENT);
                    str = "AUDIOFOCUS_GAIN_TRANSIENT";
                } else if (i13 == 3) {
                    HMSAudioManagerLegacy.this.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK);
                    str = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
                } else if (i13 != 4) {
                    HMSAudioManagerLegacy.this.sendAudioChangeEvent(AudioChangeEvent.DEBUG_INVALID);
                    str = "AUDIOFOCUS_INVALID";
                } else {
                    HMSAudioManagerLegacy.this.sendAudioChangeEvent(AudioChangeEvent.DEBUG_AUDIOFOCUS_GAIN_EXCLUSIVE);
                    str = "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE";
                }
                HMSLogger.m71136d(HMSAudioManagerLegacy.TAG, "onAudioFocusChange: ".concat(str));
            }
        };
        if (this.audioManager.requestAudioFocus(new AudioFocusRequest.Builder(2).setAcceptsDelayedFocusGain(true).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setOnAudioFocusChangeListener(this.audioFocusChangeListener).build()) == 1) {
            HMSLogger.m71136d(TAG, "Audio focus request granted for VOICE_CALL streams");
        } else {
            HMSLogger.m71137e(TAG, "Audio focus request failed");
        }
        this.audioManager.setMode(this.userSelectedAudioMode);
        setMicrophoneMute(false);
        this.userSelectedAudioDevice = HMSAudioManager.AudioDevice.AUTOMATIC;
        this.audioDevices.clear();
        this.bluetoothManager.start(new C17508p(this, 25));
        updateAudioDeviceState();
        registerReceiver(this.wiredHeadsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        HMSLogger.m71136d(TAG, "AudioManager started");
        this.isStarted = true;
    }

    @Override // live.hms.video.audio.HMSAudioManager
    @SuppressLint({"WrongConstant"})
    public void stop() {
        HMSLogger.m71136d(TAG, "stop");
        if (this.amState != HMSAudioManager.AudioManagerState.RUNNING) {
            HMSLogger.m71137e(TAG, "Trying to stop AudioManager in incorrect state: " + this.amState);
            return;
        }
        this.amState = HMSAudioManager.AudioManagerState.UNINITIALIZED;
        deInitTelephony();
        unregisterReceiver(this.wiredHeadsetReceiver);
        this.bluetoothManager.stop();
        setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
        setMicrophoneMute(this.savedIsMicrophoneMute);
        this.audioManager.setMode(this.savedAudioMode);
        this.audioManager.abandonAudioFocus(this.audioFocusChangeListener);
        this.audioFocusChangeListener = null;
        HMSLogger.m71136d(TAG, "Abandoned audio focus for VOICE_CALL streams");
        this.audioManagerDeviceChangeListener = null;
        HMSLogger.m71136d(TAG, "AudioManager stopped");
        this.isStarted = false;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x019d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a1  */
    public void updateAudioDeviceState() {
        HMSAudioManager.AudioDevice audioDevice;
        HMSAudioManager.AudioDevice audioDevice2;
        HMSAudioManager.AudioDevice audioDevice3;
        HMSAudioManager.AudioDevice audioDevice4;
        HMSLogger.m71136d(TAG, "--- updateAudioDeviceState: wired headset=" + this.hasWiredHeadset + ", BT state=" + this.bluetoothManager.getState());
        HMSLogger.m71136d(TAG, "Device status: available=" + this.audioDevices + ", selected=" + this.selectedAudioDevice + ", user selected=" + this.userSelectedAudioDevice);
        HMSBluetoothManager.State state = this.bluetoothManager.getState();
        HMSBluetoothManager.State state2 = HMSBluetoothManager.State.HEADSET_AVAILABLE;
        if (state == state2 || this.bluetoothManager.getState() == HMSBluetoothManager.State.HEADSET_UNAVAILABLE || this.bluetoothManager.getState() == HMSBluetoothManager.State.SCO_DISCONNECTING) {
            this.bluetoothManager.updateDevice();
        }
        HashSet hashSet = new HashSet();
        HMSBluetoothManager.State state3 = this.bluetoothManager.getState();
        HMSBluetoothManager.State state4 = HMSBluetoothManager.State.SCO_CONNECTED;
        if (state3 == state4 || this.bluetoothManager.getState() == HMSBluetoothManager.State.SCO_CONNECTING || this.bluetoothManager.getState() == state2) {
            hashSet.add(HMSAudioManager.AudioDevice.BLUETOOTH);
        }
        HMSAudioManager.AudioDevice audioDevice5 = HMSAudioManager.AudioDevice.EARPIECE;
        hashSet.add(audioDevice5);
        if (this.hasWiredHeadset) {
            HMSAudioManager.AudioDevice audioDevice6 = HMSAudioManager.AudioDevice.WIRED_HEADSET;
            hashSet.add(audioDevice6);
            hashSet.remove(audioDevice5);
            this.defaultAudioDevice = audioDevice6;
        } else {
            hashSet.add(HMSAudioManager.AudioDevice.SPEAKER_PHONE);
            if (hasEarpiece()) {
                hashSet.add(audioDevice5);
            }
        }
        HMSAudioManager.AudioDevice audioDevice7 = HMSAudioManager.AudioDevice.SPEAKER_PHONE;
        hashSet.add(audioDevice7);
        HMSAudioManager.AudioDevice audioDevice8 = HMSAudioManager.AudioDevice.AUTOMATIC;
        hashSet.add(audioDevice8);
        boolean z4 = true;
        boolean z13 = !this.audioDevices.equals(hashSet);
        this.audioDevices = hashSet;
        if (this.bluetoothManager.getState() == HMSBluetoothManager.State.HEADSET_UNAVAILABLE && this.userSelectedAudioDevice == HMSAudioManager.AudioDevice.BLUETOOTH) {
            this.userSelectedAudioDevice = audioDevice8;
        }
        boolean z14 = this.hasWiredHeadset;
        if (z14) {
            HMSAudioManager.AudioDevice audioDevice9 = this.userSelectedAudioDevice;
            HMSAudioManager.AudioDevice audioDevice10 = HMSAudioManager.AudioDevice.WIRED_HEADSET;
            if (audioDevice9 == audioDevice10) {
                this.userSelectedAudioDevice = audioDevice10;
            }
        }
        if (!z14 && this.userSelectedAudioDevice == HMSAudioManager.AudioDevice.WIRED_HEADSET) {
            this.userSelectedAudioDevice = audioDevice7;
        }
        boolean z15 = false;
        boolean z16 = this.bluetoothManager.getState() == state2 && ((audioDevice4 = this.userSelectedAudioDevice) == audioDevice8 || audioDevice4 == HMSAudioManager.AudioDevice.BLUETOOTH);
        if ((this.bluetoothManager.getState() == state4 || this.bluetoothManager.getState() == HMSBluetoothManager.State.SCO_CONNECTING) && (audioDevice = this.userSelectedAudioDevice) != audioDevice8 && audioDevice != HMSAudioManager.AudioDevice.BLUETOOTH) {
            z15 = true;
        }
        if (this.bluetoothManager.getState() == state2 || this.bluetoothManager.getState() == HMSBluetoothManager.State.SCO_CONNECTING || this.bluetoothManager.getState() == state4) {
            StringBuilder sbM32002u = AbstractC11895b.m32002u("Need BT audio: start=", ", stop=", ", BT state=", z16, z15);
            sbM32002u.append(this.bluetoothManager.getState());
            HMSLogger.m71136d(TAG, sbM32002u.toString());
        }
        if (z15) {
            this.bluetoothManager.stopScoAudio();
            this.bluetoothManager.updateDevice();
        }
        if (!z16 || z15 || this.bluetoothManager.startScoAudio()) {
            z4 = z13;
        } else {
            HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener = this.audioManagerDeviceChangeListener;
            if (audioManagerDeviceChangeListener != null) {
                audioManagerDeviceChangeListener.onError(ErrorFactory.AudioOutputErrors.INSTANCE.bluetoothScoInitFailure());
            }
        }
        if (this.bluetoothManager.getState() == state4) {
            audioDevice3 = HMSAudioManager.AudioDevice.BLUETOOTH;
        } else if (this.bluetoothManager.getState() == HMSBluetoothManager.State.SCO_CONNECTING) {
            audioDevice3 = this.selectedAudioDevice;
        } else {
            boolean z17 = this.hasWiredHeadset;
            if (z17) {
                HMSAudioManager.AudioDevice audioDevice11 = this.userSelectedAudioDevice;
                HMSAudioManager.AudioDevice audioDevice12 = HMSAudioManager.AudioDevice.WIRED_HEADSET;
                if (audioDevice11 == audioDevice12) {
                    audioDevice3 = audioDevice12;
                } else {
                    audioDevice2 = this.userSelectedAudioDevice;
                    if (audioDevice2 == audioDevice5 && audioDevice2 != audioDevice7) {
                        if (this.defaultAudioDevice == HMSAudioManager.AudioDevice.WIRED_HEADSET && !z17) {
                            this.defaultAudioDevice = audioDevice7;
                        }
                        audioDevice3 = this.defaultAudioDevice;
                    } else {
                        audioDevice3 = audioDevice2;
                    }
                }
            } else {
                audioDevice2 = this.userSelectedAudioDevice;
                if (audioDevice2 == audioDevice5) {
                    audioDevice3 = audioDevice2;
                } else {
                    if (this.defaultAudioDevice == HMSAudioManager.AudioDevice.WIRED_HEADSET) {
                        this.defaultAudioDevice = audioDevice7;
                    }
                    audioDevice3 = this.defaultAudioDevice;
                }
            }
        }
        if (audioDevice3 != this.selectedAudioDevice || z4) {
            setAudioDeviceInternal(audioDevice3);
            HMSLogger.m71136d(TAG, "New device status: available=" + this.audioDevices + ", selected=" + audioDevice3);
            HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener2 = this.audioManagerDeviceChangeListener;
            if (audioManagerDeviceChangeListener2 != null) {
                audioManagerDeviceChangeListener2.onAudioDeviceChanged(this.selectedAudioDevice, this.audioDevices);
            }
            this.analytics.queue(AnalyticsEventFactory.INSTANCE.selectedAudioDevice(audioDevice3));
        }
        HMSLogger.m71136d(TAG, "--- updateAudioDeviceState done");
    }
}
