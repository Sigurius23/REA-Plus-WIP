package hms.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Process;
import androidx.health.platform.client.proto.C1533u;
import com.iterable.iterableapi.CallableC5355n1;
import hc3.AbstractC17176i;
import hms.webrtc.CalledByNative;
import hms.webrtc.Logging;
import hms.webrtc.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes11.dex */
public class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private static final AtomicInteger nextSchedulerId = new AtomicInteger(0);
    private final int audioFormat;
    private final AudioManager audioManager;
    private AudioRecord audioRecord;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private AudioBufferCallback bufferCallback;
    private ByteBuffer byteBuffer;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private ScheduledFuture<String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private boolean isAudioMixingNeeded;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private AudioDeviceInfo preferredDevice;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;

    public interface AudioBufferCallback {
        void onBuffer(ByteBuffer byteBuffer, int i13);
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
            WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            while (this.keepAlive) {
                int i13 = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (i13 == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.this.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (WebRtcAudioRecord.this.isAudioMixingNeeded && WebRtcAudioRecord.this.bufferCallback != null) {
                        WebRtcAudioRecord.this.bufferCallback.onBuffer(WebRtcAudioRecord.this.byteBuffer, i13);
                    }
                    if (this.keepAlive) {
                        long j7 = WebRtcAudioRecord.this.audioRecord.getTimestamp(audioTimestamp, 0) == 0 ? audioTimestamp.nanoTime : 0L;
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i13, j7);
                    }
                    if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioRecord.this.audioRecord.getAudioFormat(), WebRtcAudioRecord.this.audioRecord.getChannelCount(), WebRtcAudioRecord.this.audioRecord.getSampleRate(), Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.arrayOffset() + WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + i13;
                    Logging.m49571e(WebRtcAudioRecord.TAG, str);
                    if (i13 == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                    WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
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

    @CalledByNative
    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z4) {
        if (!z4) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static String audioStateToString(int i13) {
        if (i13 != 0) {
            return i13 != 1 ? "INVALID" : "STOP";
        }
        return "START";
    }

    private int channelCountToConfiguration(int i13) {
        return i13 == 1 ? 16 : 12;
    }

    @TargetApi(24)
    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    private AudioRecord createAudioRecordOnLowerThanM(int i13, int i14, int i15, int i16, int i17) {
        Logging.m49570d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(i13, i14, i15, i16, i17);
    }

    @TargetApi(C1533u.RECORDING_METHOD_FIELD_NUMBER)
    private AudioRecord createAudioRecordOnMOrHigher(int i13, int i14, int i15, int i16, int i17) {
        Logging.m49570d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i13).setAudioFormat(new AudioFormat.Builder().setEncoding(i16).setSampleRate(i14).setChannelMask(i15).build()).setBufferSizeInBytes(i17).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i13) {
        AbstractC17176i.m48510l("doAudioRecordStateCallback: ", audioStateToString(i13), TAG);
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i13 == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i13 == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.m49571e(TAG, "Invalid audio state");
            }
        }
    }

    @CalledByNative
    private boolean enableBuiltInAEC(boolean z4) {
        Logging.m49570d(TAG, "enableBuiltInAEC(" + z4 + ")");
        return this.effects.setAEC(z4);
    }

    @CalledByNative
    private boolean enableBuiltInNS(boolean z4) {
        Logging.m49570d(TAG, "enableBuiltInNS(" + z4 + ")");
        return this.effects.setNS(z4);
    }

    private static int getBytesPerSample(int i13) {
        int i14 = 1;
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                i14 = 4;
                if (i13 != 4) {
                    if (i13 != 13) {
                        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Bad audio format "));
                    }
                }
            }
            return i14;
        }
        return 2;
    }

    @CalledByNative
    private int initRecording(int i13, int i14) {
        Logging.m49570d(TAG, AbstractC25012a.m73372e(i13, i14, "initRecording(sampleRate=", ", channels=", ")"));
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i15 = i13 / 100;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i14 * i15);
        this.byteBuffer = byteBufferAllocateDirect;
        if (!byteBufferAllocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        AbstractC17176i.m48509k(this.byteBuffer.capacity(), "byteBuffer.capacity: ", TAG);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        int iChannelCountToConfiguration = channelCountToConfiguration(i14);
        int minBufferSize = AudioRecord.getMinBufferSize(i13, iChannelCountToConfiguration, this.audioFormat);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError(AbstractC2875y.m8295h(minBufferSize, "AudioRecord.getMinBufferSize failed: "));
            return -1;
        }
        Logging.m49570d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int iMax = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        AbstractC17176i.m48509k(iMax, "bufferSizeInBytes: ", TAG);
        try {
            try {
                this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, i13, iChannelCountToConfiguration, this.audioFormat, iMax);
                this.audioSourceMatchesRecordingSessionRef.set(null);
                AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                if (audioDeviceInfo != null) {
                    setPreferredDevice(audioDeviceInfo);
                }
                AudioRecord audioRecord = this.audioRecord;
                if (audioRecord == null || audioRecord.getState() != 1) {
                    reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                    releaseAudioResources();
                    return -1;
                }
                this.effects.enable(this.audioRecord.getAudioSessionId());
                logMainParameters();
                logMainParametersExtended();
                int iLogRecordingConfigurations = logRecordingConfigurations(this.audioRecord, false);
                if (iLogRecordingConfigurations != 0) {
                    Logging.m49574w(TAG, "Potential microphone conflict. Active sessions: " + iLogRecordingConfigurations);
                }
                return i15;
            } catch (IllegalArgumentException e5) {
                e = e5;
                reportWebRtcAudioRecordInitError(e.getMessage());
                releaseAudioResources();
                return -1;
            } catch (UnsupportedOperationException e13) {
                e = e13;
                reportWebRtcAudioRecordInitError(e.getMessage());
                releaseAudioResources();
                return -1;
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e14) {
            e = e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) throws Exception {
        if (this.audioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.m49570d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    @TargetApi(24)
    private static boolean logActiveRecordingConfigs(int i13, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Logging.m49570d(TAG, "AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            StringBuilder sb4 = new StringBuilder("  client audio source=");
            sb4.append(WebRtcAudioUtils.audioSourceToString(audioRecordingConfiguration.getClientAudioSource()));
            sb4.append(", client session id=");
            sb4.append(audioRecordingConfiguration.getClientAudioSessionId());
            sb4.append(" (");
            sb4.append(i13);
            sb4.append(")\n  Device AudioFormat: channel count=");
            AudioFormat format = audioRecordingConfiguration.getFormat();
            sb4.append(format.getChannelCount());
            sb4.append(", channel index mask=");
            sb4.append(format.getChannelIndexMask());
            sb4.append(", channel mask=");
            sb4.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb4.append(", encoding=");
            sb4.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb4.append(", sample rate=");
            sb4.append(format.getSampleRate());
            sb4.append("\n  Client AudioFormat: channel count=");
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            sb4.append(clientFormat.getChannelCount());
            sb4.append(", channel index mask=");
            sb4.append(clientFormat.getChannelIndexMask());
            sb4.append(", channel mask=");
            sb4.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb4.append(", encoding=");
            sb4.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb4.append(", sample rate=");
            sb4.append(clientFormat.getSampleRate());
            sb4.append("\n");
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb4.append("  AudioDevice: type=");
                sb4.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb4.append(", id=");
                sb4.append(audioDevice.getId());
            }
            Logging.m49570d(TAG, sb4.toString());
        }
        return true;
    }

    private void logMainParameters() {
        int audioSessionId = this.audioRecord.getAudioSessionId();
        int channelCount = this.audioRecord.getChannelCount();
        int sampleRate = this.audioRecord.getSampleRate();
        StringBuilder sbM30465s = AbstractC11266d.m30465s(audioSessionId, channelCount, "AudioRecord: session ID: ", ", channels: ", ", sample rate: ");
        sbM30465s.append(sampleRate);
        Logging.m49570d(TAG, sbM30465s.toString());
    }

    @TargetApi(C1533u.RECORDING_METHOD_FIELD_NUMBER)
    private void logMainParametersExtended() {
        AbstractC17176i.m48509k(this.audioRecord.getBufferSizeInFrames(), "AudioRecord: buffer size in frames: ", TAG);
    }

    @TargetApi(24)
    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z4) {
        if (audioRecord == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        AbstractC17176i.m48509k(size, "Number of active recording sessions: ", TAG);
        if (size > 0) {
            logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
            if (z4) {
                this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
            }
        }
        return size;
    }

    private native void nativeCacheDirectBufferAddress(long j7, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j7, int i13, long j13);

    public static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: hms.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WebRtcAudioRecordScheduler-" + WebRtcAudioRecord.nextSchedulerId.getAndIncrement() + "-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            }
        });
    }

    private void releaseAudioResources() {
        Logging.m49570d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.m49571e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.m49571e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.m49571e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(AudioRecord audioRecord) {
        Logging.m49570d(TAG, "scheduleLogRecordingConfigurationsTask");
        CallableC5355n1 callableC5355n1 = new CallableC5355n1(1, this, audioRecord);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callableC5355n1, 100L, TimeUnit.MILLISECONDS);
    }

    @CalledByNative
    private boolean startRecording() {
        Logging.m49570d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, AbstractC2875y.m8295h(this.audioRecord.getRecordingState(), "AudioRecord.startRecording failed - incorrect state: "));
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            scheduleLogRecordingConfigurationsTask(this.audioRecord);
            return true;
        } catch (IllegalStateException e5) {
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, AbstractC11266d.m30461o("AudioRecord.startRecording failed: ", e5.getMessage()));
            return false;
        }
    }

    @CalledByNative
    private boolean stopRecording() {
        Logging.m49570d(TAG, "stopRecording");
        assertTrue(this.audioThread != null);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.m49571e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    @TargetApi(24)
    private static boolean verifyAudioConfig(int i13, int i14, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i13 && audioRecordingConfiguration.getClientAudioSessionId() == i14 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    Logging.m49570d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.m49571e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    public void clearBufferCallback() {
        this.bufferCallback = null;
    }

    @CalledByNative
    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    @CalledByNative
    public boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    @CalledByNative
    public boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        Logging.m49574w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    public void isMixingNeeded(boolean z4) {
        this.isAudioMixingNeeded = z4;
    }

    @CalledByNative
    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public void setBufferCallback(AudioBufferCallback audioBufferCallback) {
        this.bufferCallback = audioBufferCallback;
    }

    public void setMicrophoneMute(boolean z4) {
        Logging.m49574w(TAG, "setMicrophoneMute(" + z4 + ")");
        this.microphoneMute = z4;
    }

    @CalledByNative
    public void setNativeAudioRecord(long j7) {
        this.nativeAudioRecord = j7;
    }

    @TargetApi(C1533u.RECORDING_METHOD_FIELD_NUMBER)
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.m49570d(TAG, "setPreferredDevice " + (audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null));
        this.preferredDevice = audioDeviceInfo;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null || audioRecord.setPreferredDevice(audioDeviceInfo)) {
            return;
        }
        Logging.m49571e(TAG, "setPreferredDevice failed");
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i13, int i14, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, boolean z4, boolean z13) {
        this.effects = new WebRtcAudioEffects();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        if (z4 && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        }
        if (z13 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new IllegalArgumentException("HW NS not supported");
        }
        this.context = context;
        this.executor = scheduledExecutorService;
        this.audioManager = audioManager;
        this.audioSource = i13;
        this.audioFormat = i14;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.isAcousticEchoCancelerSupported = z4;
        this.isNoiseSuppressorSupported = z13;
        AbstractC17176i.m48510l("ctor", WebRtcAudioUtils.getThreadInfo(), TAG);
    }
}
