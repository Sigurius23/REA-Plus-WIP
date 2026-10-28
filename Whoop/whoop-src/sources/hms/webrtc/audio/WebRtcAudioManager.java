package hms.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import hms.webrtc.CalledByNative;
import hms.webrtc.Logging;

/* JADX INFO: loaded from: classes11.dex */
class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioManagerExternal";

    @CalledByNative
    public static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    @CalledByNative
    public static int getInputBufferSize(Context context, AudioManager audioManager, int i13, int i14) {
        return isLowLatencyInputSupported(context) ? getLowLatencyFramesPerBuffer(audioManager) : getMinInputFrameSize(i13, i14);
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
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

    @CalledByNative
    public static int getOutputBufferSize(Context context, AudioManager audioManager, int i13, int i14) {
        return isLowLatencyOutputSupported(context) ? getLowLatencyFramesPerBuffer(audioManager) : getMinOutputFrameSize(i13, i14);
    }

    @CalledByNative
    public static int getSampleRate(AudioManager audioManager) {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m49570d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel(audioManager);
        Logging.m49570d(TAG, "Sample rate is set to " + sampleRateForApiLevel + " Hz");
        return sampleRateForApiLevel;
    }

    private static int getSampleRateForApiLevel(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? DEFAULT_SAMPLE_RATE_HZ : Integer.parseInt(property);
    }

    private static boolean isLowLatencyInputSupported(Context context) {
        return isLowLatencyOutputSupported(context);
    }

    private static boolean isLowLatencyOutputSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
