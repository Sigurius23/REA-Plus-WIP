package live.hms.video.audio.manager;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.List;
import p031b9.AbstractC2875y;
import p031b9.C2820c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AudioManagerCompat {
    private static final int AUDIOFOCUS_GAIN = 4;
    private static final String TAG = "AudioManagerCompat";
    protected final AudioManager audioManager;
    protected boolean hasFocus;
    protected final AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    public static class Api19AudioManagerCompat extends AudioManagerCompat {
        @Override // live.hms.video.audio.manager.AudioManagerCompat
        public void abandonCallAudioFocus() {
            int iAbandonAudioFocus = this.audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
            if (iAbandonAudioFocus != 1) {
                AbstractC2875y.m8313z(iAbandonAudioFocus, "Audio focus abandon failed. Result code: ", AudioManagerCompat.TAG);
            }
        }

        @Override // live.hms.video.audio.manager.AudioManagerCompat
        public SoundPool createSoundPool() {
            return new SoundPool(1, 5, 0);
        }

        @Override // live.hms.video.audio.manager.AudioManagerCompat
        public boolean requestCallAudioFocus() {
            int iRequestAudioFocus = this.audioManager.requestAudioFocus(this.onAudioFocusChangeListener, 0, 4);
            if (iRequestAudioFocus == 1) {
                return true;
            }
            AbstractC2875y.m8313z(iRequestAudioFocus, "Audio focus not granted. Result code: ", AudioManagerCompat.TAG);
            return false;
        }

        private Api19AudioManagerCompat(Context context) {
            super(context);
        }
    }

    public static class Api21AudioManagerCompat extends Api19AudioManagerCompat {
        private static AudioAttributes AUDIO_ATTRIBUTES = new AudioAttributes.Builder().setContentType(1).setUsage(2).setLegacyStreamType(0).build();

        @Override // live.hms.video.audio.manager.AudioManagerCompat.Api19AudioManagerCompat, live.hms.video.audio.manager.AudioManagerCompat
        public SoundPool createSoundPool() {
            return new SoundPool.Builder().setAudioAttributes(AUDIO_ATTRIBUTES).setMaxStreams(1).build();
        }

        private Api21AudioManagerCompat(Context context) {
            super(context);
        }
    }

    public static class Api26AudioManagerCompat extends AudioManagerCompat {
        private static AudioAttributes AUDIO_ATTRIBUTES = new AudioAttributes.Builder().setContentType(1).setUsage(2).build();
        private AudioFocusRequest audioFocusRequest;

        @Override // live.hms.video.audio.manager.AudioManagerCompat
        public void abandonCallAudioFocus() {
            AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
            if (audioFocusRequest == null) {
                Log.w(AudioManagerCompat.TAG, "Don't currently have audio focus. Ignoring...");
                return;
            }
            int iAbandonAudioFocusRequest = this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
            if (iAbandonAudioFocusRequest != 1) {
                AbstractC2875y.m8313z(iAbandonAudioFocusRequest, "Audio focus abandon failed. Result code: ", AudioManagerCompat.TAG);
            }
            this.hasFocus = false;
            this.audioFocusRequest = null;
        }

        @Override // live.hms.video.audio.manager.AudioManagerCompat
        public SoundPool createSoundPool() {
            return new SoundPool.Builder().setAudioAttributes(AUDIO_ATTRIBUTES).setMaxStreams(1).build();
        }

        @Override // live.hms.video.audio.manager.AudioManagerCompat
        public boolean requestCallAudioFocus() {
            AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
            if (audioFocusRequest != null && this.hasFocus) {
                Log.w(AudioManagerCompat.TAG, "Already requested audio focus. Ignoring...");
                return true;
            }
            if (audioFocusRequest == null) {
                this.audioFocusRequest = new AudioFocusRequest.Builder(4).setAudioAttributes(AUDIO_ATTRIBUTES).setOnAudioFocusChangeListener(this.onAudioFocusChangeListener).build();
            } else {
                Log.w(AudioManagerCompat.TAG, "Trying again to request audio focus");
            }
            try {
                int iRequestAudioFocus = this.audioManager.requestAudioFocus(this.audioFocusRequest);
                if (iRequestAudioFocus == 1) {
                    return true;
                }
                Log.w(AudioManagerCompat.TAG, "Audio focus not granted. Result code: " + iRequestAudioFocus);
                return false;
            } catch (SecurityException unused) {
                Log.w(AudioManagerCompat.TAG, "Encountered security exception when requesting audio focus.");
                return false;
            }
        }

        private Api26AudioManagerCompat(Context context) {
            super(context);
        }
    }

    public static AudioManagerCompat create(Context context) {
        return new Api26AudioManagerCompat(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getConnectedBluetoothDevice$2(AudioDeviceInfo audioDeviceInfo) {
        return AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()) == AudioManagerUtil.AudioDevice.BLUETOOTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$isBluetoothHeadsetAvailable$1(AudioDeviceInfo audioDeviceInfo) {
        return AudioDeviceMapping.fromPlatformType(audioDeviceInfo.getType()) == AudioManagerUtil.AudioDevice.BLUETOOTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i13) {
        Log.i(TAG, "onAudioFocusChangeListener: " + i13);
        this.hasFocus = i13 == 1;
    }

    private static float logVolume(int i13, int i14) {
        if (i14 == 0 || i13 > i14) {
            return 0.5f;
        }
        int i15 = i14 + 1;
        return (float) (1.0d - (Math.log(i15 - i13) / Math.log(i15)));
    }

    public abstract void abandonCallAudioFocus();

    public void clearCommunicationDevice() {
        this.audioManager.clearCommunicationDevice();
    }

    public abstract SoundPool createSoundPool();

    public List<AudioDeviceInfo> getAvailableCommunicationDevices() {
        return this.audioManager.getAvailableCommunicationDevices();
    }

    public AudioDeviceInfo getCommunicationDevice() {
        return this.audioManager.getCommunicationDevice();
    }

    public AudioDeviceInfo getConnectedBluetoothDevice() {
        return getAvailableCommunicationDevices().stream().filter(new C24109a(0)).findAny().orElse(null);
    }

    public int getMode() {
        return this.audioManager.getMode();
    }

    public float getVoiceCallVolume() {
        return this.audioManager.getStreamVolume(0);
    }

    public boolean hasEarpiece(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public boolean isBluetoothConnected() {
        if (Build.VERSION.SDK_INT < 31) {
            return isBluetoothScoOn();
        }
        AudioDeviceInfo communicationDevice = this.audioManager.getCommunicationDevice();
        if (communicationDevice == null) {
            return false;
        }
        return AudioManagerUtil.AudioDevice.BLUETOOTH == AudioDeviceMapping.fromPlatformType(communicationDevice.getType());
    }

    public boolean isBluetoothHeadsetAvailable() {
        if (Build.VERSION.SDK_INT >= 31) {
            return this.audioManager.getAvailableCommunicationDevices().stream().anyMatch(new C24109a(1));
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled() && defaultAdapter.getProfileConnectionState(1) == 2 && isBluetoothScoAvailableOffCall();
    }

    public boolean isBluetoothScoAvailableOffCall() {
        return this.audioManager.isBluetoothScoAvailableOffCall();
    }

    public boolean isBluetoothScoOn() {
        return this.audioManager.isBluetoothScoOn();
    }

    public boolean isMicrophoneMute() {
        return this.audioManager.isMicrophoneMute();
    }

    public boolean isSpeakerphoneOn() {
        return this.audioManager.isSpeakerphoneOn();
    }

    @SuppressLint({"WrongConstant"})
    public boolean isWiredHeadsetOn() {
        for (AudioDeviceInfo audioDeviceInfo : this.audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 11) {
                return true;
            }
        }
        return false;
    }

    public void registerAudioDeviceCallback(AudioDeviceCallback audioDeviceCallback, Handler handler) {
        this.audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    public abstract boolean requestCallAudioFocus();

    public float ringVolumeWithMinimum() {
        return Math.max(logVolume(this.audioManager.getStreamVolume(2), this.audioManager.getStreamMaxVolume(2)), logVolume(15, 100));
    }

    public void setBluetoothScoOn(boolean z4) {
        this.audioManager.setBluetoothScoOn(z4);
    }

    public boolean setCommunicationDevice(AudioDeviceInfo audioDeviceInfo) {
        try {
            return this.audioManager.setCommunicationDevice(audioDeviceInfo);
        } catch (IllegalArgumentException e5) {
            Log.w(TAG, "Invalid device chosen.", e5);
            return false;
        }
    }

    public void setMicrophoneMute(boolean z4) {
        this.audioManager.setMicrophoneMute(z4);
    }

    public void setMode(int i13) {
        this.audioManager.setMode(i13);
    }

    public void setSpeakerphoneOn(boolean z4) {
        this.audioManager.setSpeakerphoneOn(z4);
    }

    public void startBluetoothSco() {
        this.audioManager.startBluetoothSco();
    }

    public void stopBluetoothSco() {
        this.audioManager.stopBluetoothSco();
    }

    public void unregisterAudioDeviceCallback(AudioDeviceCallback audioDeviceCallback) {
        this.audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }

    private AudioManagerCompat(Context context) {
        this.onAudioFocusChangeListener = new C2820c(this, 1);
        this.audioManager = (AudioManager) context.getSystemService("audio");
    }
}
