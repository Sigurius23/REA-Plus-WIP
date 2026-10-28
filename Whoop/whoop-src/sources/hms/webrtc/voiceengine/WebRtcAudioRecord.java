package hms.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Process;
import hc3.AbstractC17176i;
import hms.webrtc.Logging;
import hms.webrtc.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes11.dex */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG = "WebRtcAudioRecord";
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            AbstractC17176i.m48510l("AudioRecordThread", WebRtcAudioUtils.getThreadInfo(), WebRtcAudioRecord.TAG);
            int i13 = 0;
            WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            System.nanoTime();
            while (this.keepAlive) {
                int i14 = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (i14 == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(i14, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity()), i13));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + i14;
                    Logging.m49571e(WebRtcAudioRecord.TAG, str);
                    if (i14 == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e5) {
                Logging.m49571e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e5.getMessage());
            }
        }

        public void stopThread() {
            Logging.m49570d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public /* synthetic */ AudioSamples(AudioRecord audioRecord, byte[] bArr, int i13) {
            this(audioRecord, bArr);
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

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    public WebRtcAudioRecord(long j7) {
        AbstractC17176i.m48510l("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
        this.nativeAudioRecord = j7;
        this.effects = WebRtcAudioEffects.create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i13) {
        return i13 == 1 ? 16 : 12;
    }

    private boolean enableBuiltInAEC(boolean z4) {
        Logging.m49570d(TAG, "enableBuiltInAEC(" + z4 + ")");
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z4);
        }
        Logging.m49571e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z4) {
        Logging.m49570d(TAG, "enableBuiltInNS(" + z4 + ")");
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z4);
        }
        Logging.m49571e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i13, int i14) {
        Logging.m49570d(TAG, AbstractC25012a.m73372e(i13, i14, "initRecording(sampleRate=", ", channels=", ")"));
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i15 = i13 / 100;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i14 * 2 * i15);
        this.byteBuffer = byteBufferAllocateDirect;
        AbstractC17176i.m48509k(byteBufferAllocateDirect.capacity(), "byteBuffer.capacity: ", TAG);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int iChannelCountToConfiguration = channelCountToConfiguration(i14);
        int minBufferSize = AudioRecord.getMinBufferSize(i13, iChannelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError(AbstractC2875y.m8295h(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
            return -1;
        }
        Logging.m49570d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int iMax = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        AbstractC17176i.m48509k(iMax, "bufferSizeInBytes: ", TAG);
        try {
            AudioRecord audioRecord = new AudioRecord(audioSource, i13, iChannelCountToConfiguration, 2, iMax);
            this.audioRecord = audioRecord;
            if (audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                return -1;
            }
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            return i15;
        } catch (IllegalArgumentException e5) {
            reportWebRtcAudioRecordInitError(AbstractC11266d.m30461o("AudioRecord ctor error: ", e5.getMessage()));
            releaseAudioResources();
            return -1;
        }
    }

    private void logMainParameters() {
        int audioSessionId = this.audioRecord.getAudioSessionId();
        int channelCount = this.audioRecord.getChannelCount();
        int sampleRate = this.audioRecord.getSampleRate();
        StringBuilder sbM30465s = AbstractC11266d.m30465s(audioSessionId, channelCount, "AudioRecord: session ID: ", ", channels: ", ", sample rate: ");
        sbM30465s.append(sampleRate);
        Logging.m49570d(TAG, sbM30465s.toString());
    }

    private void logMainParametersExtended() {
        AbstractC17176i.m48509k(this.audioRecord.getBufferSizeInFrames(), "AudioRecord: buffer size in frames: ", TAG);
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j7);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i13, long j7);

    private void releaseAudioResources() {
        Logging.m49570d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.m49571e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.m49571e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.m49571e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i13) {
        Logging.m49574w(TAG, "Audio source is changed from: " + audioSource + " to " + i13);
        audioSource = i13;
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.m49570d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z4) {
        Logging.m49574w(TAG, "setMicrophoneMute(" + z4 + ")");
        microphoneMute = z4;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        Logging.m49570d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, AbstractC2875y.m8295h(this.audioRecord.getRecordingState(), "AudioRecord.startRecording failed - incorrect state :"));
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e5) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, AbstractC11266d.m30461o("AudioRecord.startRecording failed: ", e5.getMessage()));
            return false;
        }
    }

    private boolean stopRecording() {
        Logging.m49570d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.m49571e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}
