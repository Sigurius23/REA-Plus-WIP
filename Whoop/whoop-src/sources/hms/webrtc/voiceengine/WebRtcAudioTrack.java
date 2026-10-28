package hms.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import hc3.AbstractC17176i;
import hms.webrtc.ContextUtils;
import hms.webrtc.Logging;
import hms.webrtc.ThreadUtils;
import java.nio.ByteBuffer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes11.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback = null;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;
    private static volatile boolean speakerMute = false;
    private static int usageAttribute = 2;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            AbstractC17176i.m48510l("AudioTrackThread", WebRtcAudioUtils.getThreadInfo(), WebRtcAudioTrack.TAG);
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(iCapacity, webRtcAudioTrack.nativeAudioTrack);
                WebRtcAudioTrack.assertTrue(iCapacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                }
                int iWrite = WebRtcAudioTrack.this.audioTrack.write(WebRtcAudioTrack.this.byteBuffer, iCapacity, 0);
                if (iWrite != iCapacity) {
                    Logging.m49571e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + iWrite);
                    if (iWrite < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + iWrite);
                    }
                }
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.m49570d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m49570d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (IllegalStateException e5) {
                    Logging.m49571e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e5.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.m49570d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    public WebRtcAudioTrack(long j7) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        AbstractC17176i.m48510l("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
        this.nativeAudioTrack = j7;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i13) {
        return i13 == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrack(int i13, int i14, int i15) {
        Logging.m49570d(TAG, "createAudioTrack");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        AbstractC17176i.m48509k(nativeOutputSampleRate, "nativeOutputSampleRate: ", TAG);
        if (i13 != nativeOutputSampleRate) {
            Logging.m49574w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        int i16 = usageAttribute;
        if (i16 != 2) {
            Logging.m49574w(TAG, "A non default usage attribute is used: " + i16);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i13).setChannelMask(i14).build(), i15, 1, 0);
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m49570d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m49570d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i13, int i14, double d3) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m49570d(TAG, "initPlayout(sampleRate=" + i13 + ", channels=" + i14 + ", bufferSizeFactor=" + d3 + ")");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((i13 / 100) * i14 * 2);
        this.byteBuffer = byteBufferAllocateDirect;
        AbstractC17176i.m48509k(byteBufferAllocateDirect.capacity(), "byteBuffer.capacity: ", TAG);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int iChannelCountToConfiguration = channelCountToConfiguration(i14);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i13, iChannelCountToConfiguration, 2)) * d3);
        AbstractC17176i.m48509k(minBufferSize, "minBufferSizeInBytes: ", TAG);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            AudioTrack audioTrackCreateAudioTrack = createAudioTrack(i13, iChannelCountToConfiguration, minBufferSize);
            this.audioTrack = audioTrackCreateAudioTrack;
            if (audioTrackCreateAudioTrack == null || audioTrackCreateAudioTrack.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            logMainParameters();
            logMainParametersExtended();
            return minBufferSize;
        } catch (IllegalArgumentException e5) {
            reportWebRtcAudioTrackInitError(e5.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private void logBufferCapacityInFrames() {
        AbstractC17176i.m48509k(this.audioTrack.getBufferCapacityInFrames(), "AudioTrack: buffer capacity in frames: ", TAG);
    }

    private void logBufferSizeInFrames() {
        AbstractC17176i.m48509k(this.audioTrack.getBufferSizeInFrames(), "AudioTrack: buffer size in frames: ", TAG);
    }

    private void logMainParameters() {
        int audioSessionId = this.audioTrack.getAudioSessionId();
        int channelCount = this.audioTrack.getChannelCount();
        int sampleRate = this.audioTrack.getSampleRate();
        float maxVolume = AudioTrack.getMaxVolume();
        StringBuilder sbM30465s = AbstractC11266d.m30465s(audioSessionId, channelCount, "AudioTrack: session ID: ", ", channels: ", ", sample rate: ");
        sbM30465s.append(sampleRate);
        sbM30465s.append(", max gain: ");
        sbM30465s.append(maxVolume);
        Logging.m49570d(TAG, sbM30465s.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        AbstractC17176i.m48509k(this.audioTrack.getUnderrunCount(), "underrun count: ", TAG);
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j7);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i13, long j7);

    private void releaseAudioResources() {
        Logging.m49570d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.m49571e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.m49571e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.m49571e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i13) {
        Logging.m49574w(TAG, "Default usage attribute is changed from: 2 to " + i13);
        usageAttribute = i13;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.m49570d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z4) {
        Logging.m49574w(TAG, "setSpeakerMute(" + z4 + ")");
        speakerMute = z4;
    }

    private boolean setStreamVolume(int i13) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m49570d(TAG, "setStreamVolume(" + i13 + ")");
        assertTrue(this.audioManager != null);
        if (this.audioManager.isVolumeFixed()) {
            Logging.m49571e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i13, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m49570d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, AbstractC2875y.m8295h(this.audioTrack.getPlayState(), "AudioTrack.play failed - incorrect state :"));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e5) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, AbstractC11266d.m30461o("AudioTrack.play failed: ", e5.getMessage()));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m49570d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m49570d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.m49571e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.m49570d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.m49570d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }
}
