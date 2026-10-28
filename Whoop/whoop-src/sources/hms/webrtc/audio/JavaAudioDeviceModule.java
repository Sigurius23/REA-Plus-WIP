package hms.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import hc3.AbstractC17176i;
import hms.webrtc.JniCommon;
import hms.webrtc.Logging;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes11.dex */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    private static final String TAG = "JavaAudioDeviceModule";
    private final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    private final WebRtcAudioTrack audioOutput;
    private final Context context;
    private final int inputSampleRate;
    private long nativeAudioDeviceModule;
    private final Object nativeLock = new Object();
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public AudioSamples(int i13, int i14, int i15, byte[] bArr) {
            this.audioFormat = i13;
            this.channelCount = i14;
            this.sampleRate = i15;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    public static class Builder {
        private AudioAttributes audioAttributes;
        private int audioFormat;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private AudioRecordStateCallback audioRecordStateCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private AudioTrackStateCallback audioTrackStateCallback;
        private final Context context;
        private boolean enableVolumeLogger;
        private int inputSampleRate;
        private int outputSampleRate;
        private SamplesReadyCallback samplesReadyCallback;
        private ScheduledExecutorService scheduler;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useLowLatency;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        public /* synthetic */ Builder(Context context, int i13) {
            this(context);
        }

        public JavaAudioDeviceModule createAudioDeviceModule() {
            Logging.m49570d(JavaAudioDeviceModule.TAG, "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                Logging.m49570d(JavaAudioDeviceModule.TAG, "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.m49570d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.m49570d(JavaAudioDeviceModule.TAG, "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.m49570d(JavaAudioDeviceModule.TAG, "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.m49570d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.m49570d(JavaAudioDeviceModule.TAG, "HW AEC will not be used.");
            }
            if (this.useLowLatency) {
                Logging.m49570d(JavaAudioDeviceModule.TAG, "Low latency mode will be used.");
            }
            ScheduledExecutorService scheduledExecutorServiceNewDefaultScheduler = this.scheduler;
            if (scheduledExecutorServiceNewDefaultScheduler == null) {
                scheduledExecutorServiceNewDefaultScheduler = WebRtcAudioRecord.newDefaultScheduler();
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, scheduledExecutorServiceNewDefaultScheduler, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.useLowLatency, this.enableVolumeLogger), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setAudioFormat(int i13) {
            this.audioFormat = i13;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public Builder setAudioSource(int i13) {
            this.audioSource = i13;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public Builder setEnableVolumeLogger(boolean z4) {
            this.enableVolumeLogger = z4;
            return this;
        }

        public Builder setInputSampleRate(int i13) {
            AbstractC17176i.m48509k(i13, "Input sample rate overridden to: ", JavaAudioDeviceModule.TAG);
            this.inputSampleRate = i13;
            return this;
        }

        public Builder setOutputSampleRate(int i13) {
            AbstractC17176i.m48509k(i13, "Output sample rate overridden to: ", JavaAudioDeviceModule.TAG);
            this.outputSampleRate = i13;
            return this;
        }

        public Builder setSampleRate(int i13) {
            AbstractC17176i.m48509k(i13, "Input/Output sample rate overridden to: ", JavaAudioDeviceModule.TAG);
            this.inputSampleRate = i13;
            this.outputSampleRate = i13;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setScheduler(ScheduledExecutorService scheduledExecutorService) {
            this.scheduler = scheduledExecutorService;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z4) {
            if (z4 && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.m49571e(JavaAudioDeviceModule.TAG, "HW AEC not supported");
                z4 = false;
            }
            this.useHardwareAcousticEchoCanceler = z4;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z4) {
            if (z4 && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.m49571e(JavaAudioDeviceModule.TAG, "HW NS not supported");
                z4 = false;
            }
            this.useHardwareNoiseSuppressor = z4;
            return this;
        }

        public Builder setUseLowLatency(boolean z4) {
            this.useLowLatency = z4;
            return this;
        }

        public Builder setUseStereoInput(boolean z4) {
            this.useStereoInput = z4;
            return this;
        }

        public Builder setUseStereoOutput(boolean z4) {
            this.useStereoOutput = z4;
            return this;
        }

        private Builder(Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.audioManager = audioManager;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager);
            this.useLowLatency = false;
            this.enableVolumeLogger = true;
        }
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i13, int i14, boolean z4, boolean z13) {
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i13;
        this.outputSampleRate = i14;
        this.useStereoInput = z4;
        this.useStereoOutput = z13;
    }

    public static Builder builder(Context context) {
        return new Builder(context, 0);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i13, int i14, boolean z4, boolean z13);

    @Override // hms.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j7;
        synchronized (this.nativeLock) {
            try {
                if (this.nativeAudioDeviceModule == 0) {
                    this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                }
                j7 = this.nativeAudioDeviceModule;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return j7;
    }

    @Override // hms.webrtc.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            try {
                long j7 = this.nativeAudioDeviceModule;
                if (j7 != 0) {
                    JniCommon.nativeReleaseRef(j7);
                    this.nativeAudioDeviceModule = 0L;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hms.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z4) {
        Logging.m49570d(TAG, "setMicrophoneMute: " + z4);
        this.audioInput.setMicrophoneMute(z4);
    }

    public void setPreferredInputDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.m49570d(TAG, "setPreferredInputDevice: " + audioDeviceInfo);
        this.audioInput.setPreferredDevice(audioDeviceInfo);
    }

    @Override // hms.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z4) {
        Logging.m49570d(TAG, "setSpeakerMute: " + z4);
        this.audioOutput.setSpeakerMute(z4);
    }
}
