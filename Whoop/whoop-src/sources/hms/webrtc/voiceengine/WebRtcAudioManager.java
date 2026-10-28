package hms.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import hc3.AbstractC17176i;
import hms.webrtc.ContextUtils;
import hms.webrtc.Logging;
import java.util.Timer;
import java.util.TimerTask;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes11.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;

    public static class VolumeLogger {
        private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        private static final int TIMER_PERIOD_IN_SECONDS = 30;
        private final AudioManager audioManager;
        private Timer timer;

        public class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            public LogVolumeTask(int i13, int i14) {
                this.maxRingVolume = i13;
                this.maxVoiceCallVolume = i14;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    Logging.m49570d(WebRtcAudioManager.TAG, AbstractC25012a.m73372e(VolumeLogger.this.audioManager.getStreamVolume(2), this.maxRingVolume, "STREAM_RING stream volume: ", " (max=", ")"));
                } else if (mode == 3) {
                    Logging.m49570d(WebRtcAudioManager.TAG, AbstractC25012a.m73372e(VolumeLogger.this.audioManager.getStreamVolume(0), this.maxVoiceCallVolume, "VOICE_CALL stream volume: ", " (max=", ")"));
                }
            }
        }

        public VolumeLogger(AudioManager audioManager) {
            this.audioManager = audioManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            Timer timer = new Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    public WebRtcAudioManager(long j7) {
        AbstractC17176i.m48510l("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
        this.nativeAudioManager = j7;
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.audioManager = audioManager;
        this.volumeLogger = new VolumeLogger(audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j7);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    private static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        AbstractC17176i.m48510l("dispose", WebRtcAudioUtils.getThreadInfo(), TAG);
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i13, int i14) {
        return AudioRecord.getMinBufferSize(i13, i14 == 1 ? 16 : 12, 2) / (i14 * 2);
    }

    private static int getMinOutputFrameSize(int i13, int i14) {
        return AudioTrack.getMinBufferSize(i13, i14 == 1 ? 4 : 12, 2) / (i14 * 2);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m49570d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.m49570d(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel();
        Logging.m49570d(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
        return sampleRateForApiLevel;
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        return useStereoInput;
    }

    public static synchronized boolean getStereoOutput() {
        return useStereoOutput;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        AbstractC17176i.m48510l("init", WebRtcAudioUtils.getThreadInfo(), TAG);
        if (this.initialized) {
            return true;
        }
        AbstractC17176i.m48510l("audio mode is: ", WebRtcAudioUtils.modeToString(this.audioManager.getMode()), TAG);
        this.initialized = true;
        this.volumeLogger.start();
        return true;
    }

    private boolean isAAudioSupported() {
        Logging.m49574w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        return this.audioManager.getMode() == 3;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean zDeviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (zDeviceIsBlacklistedForOpenSLESUsage) {
            Logging.m49570d(TAG, Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return zDeviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    private native void nativeCacheAudioParameters(int i13, int i14, int i15, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i16, int i17, long j7);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z4) {
        blacklistDeviceForOpenSLESUsageIsOverridden = true;
        blacklistDeviceForOpenSLESUsage = z4;
    }

    public static synchronized void setStereoInput(boolean z4) {
        Logging.m49574w(TAG, "Overriding default input behavior: setStereoInput(" + z4 + ")");
        useStereoInput = z4;
    }

    public static synchronized void setStereoOutput(boolean z4) {
        Logging.m49574w(TAG, "Overriding default output behavior: setStereoOutput(" + z4 + ")");
        useStereoOutput = z4;
    }

    private void storeAudioParameters() {
        this.outputChannels = getStereoOutput() ? 2 : 1;
        this.inputChannels = getStereoInput() ? 2 : 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
    }

    public boolean isLowLatencyInputSupported() {
        return isLowLatencyOutputSupported();
    }
}
