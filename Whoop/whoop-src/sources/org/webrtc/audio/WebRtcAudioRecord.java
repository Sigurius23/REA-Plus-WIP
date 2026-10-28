package org.webrtc.audio;

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
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes3.dex */
class WebRtcAudioRecord {
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
    private final JavaAudioDeviceModule.AudioBufferCallback audioBufferCallback;
    private final int audioFormat;
    private final AudioManager audioManager;
    private volatile AudioRecord audioRecord;
    private final Object audioRecordStateLock;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private final Object audioThreadStateLock;
    private ByteBuffer byteBuffer;
    private int channelCount;
    private AtomicBoolean clientCalledStartRecording;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private int expectedChannelCount;
    private int expectedSampleRate;
    private ScheduledFuture<String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private AtomicBoolean nativeCalledInitRecording;
    private AtomicBoolean nativeCalledStartRecording;
    private AudioDeviceInfo preferredDevice;
    private int sampleRate;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;
    private boolean useAudioRecord;

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioRecord audioRecord;
            boolean z4;
            int iCapacity;
            Process.setThreadPriority(-19);
            Logging.m85621d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord != null) {
                WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            }
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            while (this.keepAlive) {
                synchronized (WebRtcAudioRecord.this.audioRecordStateLock) {
                    audioRecord = WebRtcAudioRecord.this.audioRecord;
                    z4 = WebRtcAudioRecord.this.nativeCalledInitRecording.get();
                }
                AudioRecord audioRecord2 = null;
                if (audioRecord == null && WebRtcAudioRecord.this.useAudioRecord) {
                    if (WebRtcAudioRecord.this.initAudioRecord()) {
                        synchronized (WebRtcAudioRecord.this.audioRecordStateLock) {
                            audioRecord = WebRtcAudioRecord.this.audioRecord;
                        }
                        WebRtcAudioRecord.assertTrue(audioRecord != null);
                        try {
                            audioRecord.startRecording();
                        } catch (IllegalStateException e5) {
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, AbstractC11266d.m30461o("AudioRecord.startRecording failed: ", e5.getMessage()));
                            WebRtcAudioRecord.this.useAudioRecord = false;
                            audioRecord = null;
                        }
                        if (WebRtcAudioRecord.this.useAudioRecord && audioRecord.getRecordingState() != 3) {
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, AbstractC2875y.m8295h(audioRecord.getRecordingState(), "AudioRecord.startRecording failed - incorrect state: "));
                            WebRtcAudioRecord.this.useAudioRecord = false;
                            audioRecord = null;
                        }
                    } else {
                        WebRtcAudioRecord.this.useAudioRecord = false;
                    }
                }
                if (audioRecord == null || WebRtcAudioRecord.this.useAudioRecord) {
                    audioRecord2 = audioRecord;
                } else {
                    WebRtcAudioRecord.this.releaseAudioResources();
                }
                long j7 = 0;
                if (audioRecord2 != null) {
                    int i13 = audioRecord2.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                    if (i13 == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                        if (WebRtcAudioRecord.this.microphoneMute) {
                            WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                        }
                        if (this.keepAlive && audioRecord2.getTimestamp(audioTimestamp, 0) == 0) {
                            j7 = audioTimestamp.nanoTime;
                        }
                        iCapacity = i13;
                    } else {
                        String str = "AudioRecord.read failed: " + i13;
                        Logging.m85622e(WebRtcAudioRecord.TAG, str);
                        if (i13 == -3) {
                            this.keepAlive = false;
                            WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                        }
                    }
                } else {
                    WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    iCapacity = 0;
                }
                long jOnBuffer = j7;
                if (this.keepAlive && WebRtcAudioRecord.this.audioBufferCallback != null) {
                    jOnBuffer = WebRtcAudioRecord.this.audioBufferCallback.onBuffer(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.audioFormat, WebRtcAudioRecord.this.channelCount, WebRtcAudioRecord.this.sampleRate, iCapacity, jOnBuffer);
                    iCapacity = WebRtcAudioRecord.this.byteBuffer.capacity();
                }
                int i14 = iCapacity;
                long j13 = jOnBuffer;
                if (this.keepAlive && z4) {
                    WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                    webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, i14, j13);
                }
                if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                    WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioRecord.this.audioFormat, WebRtcAudioRecord.this.channelCount, WebRtcAudioRecord.this.sampleRate, Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.arrayOffset() + WebRtcAudioRecord.this.byteBuffer.capacity())));
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e13) {
                Logging.m85622e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e13.getMessage());
            }
            WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
        }

        public void stopThread() {
            Logging.m85621d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    @CalledByNative
    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported(), WebRtcAudioManager.getSampleRate(audioManager), 1);
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

    private static AudioRecord createAudioRecordOnLowerThanM(int i13, int i14, int i15, int i16, int i17) {
        Logging.m85621d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(i13, i14, i15, i16, i17);
    }

    @TargetApi(C1533u.RECORDING_METHOD_FIELD_NUMBER)
    private static AudioRecord createAudioRecordOnMOrHigher(int i13, int i14, int i15, int i16, int i17) {
        Logging.m85621d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i13).setAudioFormat(new AudioFormat.Builder().setEncoding(i16).setSampleRate(i14).setChannelMask(i15).build()).setBufferSizeInBytes(i17).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i13) {
        Logging.m85621d(TAG, "doAudioRecordStateCallback: " + audioStateToString(i13));
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i13 == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i13 == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.m85622e(TAG, "Invalid audio state");
            }
        }
    }

    @CalledByNative
    private boolean enableBuiltInAEC(boolean z4) {
        Logging.m85621d(TAG, "enableBuiltInAEC(" + z4 + ")");
        return this.effects.setAEC(z4);
    }

    @CalledByNative
    private boolean enableBuiltInNS(boolean z4) {
        Logging.m85621d(TAG, "enableBuiltInNS(" + z4 + ")");
        return this.effects.setNS(z4);
    }

    private static int getBytesPerFrame(int i13, int i14) {
        return i13 * getBytesPerSample(i14);
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

    private static int getFramesPerBuffer(int i13) {
        return i13 / 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initAudioRecord() {
        if (this.sampleRate == 0 || this.channelCount == 0) {
            Logging.m85625w(TAG, "initAudioRecord called before initRecord!");
            return false;
        }
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    reportWebRtcAudioRecordInitError("InitAudioRecord called twice without StopRecording.");
                    return false;
                }
                int iChannelCountToConfiguration = channelCountToConfiguration(this.channelCount);
                int minBufferSize = AudioRecord.getMinBufferSize(this.sampleRate, iChannelCountToConfiguration, this.audioFormat);
                if (minBufferSize != -1 && minBufferSize != -2) {
                    Logging.m85621d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
                    int iMax = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                    Logging.m85621d(TAG, "bufferSizeInBytes: " + iMax);
                    try {
                        this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, this.sampleRate, iChannelCountToConfiguration, this.audioFormat, iMax);
                        this.audioSourceMatchesRecordingSessionRef.set(null);
                        AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                        if (audioDeviceInfo != null) {
                            setPreferredDevice(audioDeviceInfo);
                        }
                        if (this.audioRecord != null && this.audioRecord.getState() == 1) {
                            this.effects.enable(this.audioRecord.getAudioSessionId());
                            logMainParameters();
                            logMainParametersExtended();
                            return true;
                        }
                        reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                        releaseAudioResources();
                        return false;
                    } catch (IllegalArgumentException | UnsupportedOperationException e5) {
                        reportWebRtcAudioRecordInitError(e5.getMessage());
                        releaseAudioResources();
                        return false;
                    }
                }
                reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @CalledByNative
    private int initRecording(int i13, int i14) {
        Logging.m85621d(TAG, AbstractC25012a.m73372e(i13, i14, "initRecording(sampleRate=", ", channels=", ")"));
        synchronized (this.audioRecordStateLock) {
            try {
                if (!this.nativeCalledInitRecording.compareAndSet(false, true)) {
                    reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
                    return -1;
                }
                if (this.audioRecord == null) {
                    return initRecordingImpl(i13, i14, true);
                }
                int framesPerBuffer = getFramesPerBuffer(i13);
                ByteBuffer byteBuffer = this.byteBuffer;
                if (byteBuffer == null) {
                    throw new IllegalStateException("initRecording: byteBuffer is null!");
                }
                nativeCacheDirectBufferAddress(this.nativeAudioRecord, byteBuffer);
                return framesPerBuffer;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private int initRecordingImpl(int i13, int i14, boolean z4) {
        Logging.m85621d(TAG, AbstractC25012a.m73372e(i13, i14, "initRecordingImpl(sampleRate=", ", channels=", ")"));
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        this.sampleRate = i13;
        this.channelCount = i14;
        int bytesPerFrame = getBytesPerFrame(i14, this.audioFormat);
        int framesPerBuffer = getFramesPerBuffer(i13);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytesPerFrame * framesPerBuffer);
        this.byteBuffer = byteBufferAllocateDirect;
        if (!byteBufferAllocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        Logging.m85621d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        if (z4) {
            nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        }
        if (this.useAudioRecord && !initAudioRecord()) {
            return -1;
        }
        int iLogRecordingConfigurations = logRecordingConfigurations(this.audioRecord, false);
        if (iLogRecordingConfigurations != 0) {
            Logging.m85625w(TAG, "Potential microphone conflict. Active sessions: " + iLogRecordingConfigurations);
        }
        return framesPerBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) throws Exception {
        if (this.audioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.m85621d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    @TargetApi(24)
    private static boolean logActiveRecordingConfigs(int i13, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        Logging.m85621d(TAG, "AudioRecordingConfigurations: ");
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
            Logging.m85621d(TAG, sb4.toString());
        }
        return true;
    }

    private void logMainParameters() {
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    Logging.m85621d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @TargetApi(C1533u.RECORDING_METHOD_FIELD_NUMBER)
    private void logMainParametersExtended() {
        synchronized (this.audioRecordStateLock) {
            try {
                if (this.audioRecord != null) {
                    Logging.m85621d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @TargetApi(24)
    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z4) {
        if (audioRecord == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        Logging.m85621d(TAG, "Number of active recording sessions: " + size);
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
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WebRtcAudioRecordScheduler-" + WebRtcAudioRecord.nextSchedulerId.getAndIncrement() + "-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseAudioResources() {
        Logging.m85621d(TAG, "releaseAudioResources");
        synchronized (this.audioRecordStateLock) {
            try {
                this.effects.release();
                if (this.audioRecord != null) {
                    this.audioRecord.release();
                    this.audioRecord = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.m85622e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.m85622e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.m85622e(TAG, "Start recording error: " + String.valueOf(audioRecordStartErrorCode) + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(final AudioRecord audioRecord) {
        Logging.m85621d(TAG, "scheduleLogRecordingConfigurationsTask");
        Callable callable = new Callable() { // from class: org.webrtc.audio.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f114053w.lambda$scheduleLogRecordingConfigurationsTask$0(audioRecord);
            }
        };
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callable, 100L, TimeUnit.MILLISECONDS);
    }

    @CalledByNative
    private boolean startRecording() {
        if (!this.nativeCalledStartRecording.compareAndSet(false, true)) {
            throw new IllegalStateException("startRecording called twice without stopRecording");
        }
        if (this.audioThread == null) {
            synchronized (this.audioRecordStateLock) {
                synchronized (this.audioThreadStateLock) {
                    if (this.audioThread == null) {
                        return startRecordingImpl();
                    }
                }
            }
        }
        return true;
    }

    private boolean startRecordingImpl() {
        Logging.m85621d(TAG, "startRecording");
        synchronized (this.audioRecordStateLock) {
            synchronized (this.audioThreadStateLock) {
                assertTrue(this.audioThread == null);
                if (this.useAudioRecord) {
                    assertTrue(this.audioRecord != null);
                    try {
                        this.audioRecord.startRecording();
                        if (this.audioRecord.getRecordingState() != 3) {
                            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecord.getRecordingState());
                            return false;
                        }
                    } catch (IllegalStateException e5) {
                        reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e5.getMessage());
                        return false;
                    }
                }
                AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                scheduleLogRecordingConfigurationsTask(this.audioRecord);
                return true;
            }
        }
    }

    @CalledByNative
    private boolean stopRecording() {
        boolean zStopRecordingIfNeededImpl;
        Logging.m85621d(TAG, "stopRecording");
        synchronized (this.audioRecordStateLock) {
            this.nativeCalledStartRecording.set(false);
            this.nativeCalledInitRecording.set(false);
            zStopRecordingIfNeededImpl = stopRecordingIfNeededImpl();
        }
        return zStopRecordingIfNeededImpl;
    }

    private boolean stopRecordingIfNeededImpl() {
        synchronized (this.audioRecordStateLock) {
            try {
                if (!this.clientCalledStartRecording.get() && !this.nativeCalledStartRecording.get()) {
                    Logging.m85621d(TAG, "stopping recording");
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
                        Logging.m85622e(TAG, "Join of AudioRecordJavaThread timed out");
                        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
                    }
                    this.audioThread = null;
                    releaseAudioResources();
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @TargetApi(24)
    private static boolean verifyAudioConfig(int i13, int i14, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i13 && audioRecordingConfiguration.getClientAudioSessionId() == i14 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    Logging.m85621d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.m85622e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    public boolean initRecordingIfNeeded() {
        synchronized (this.audioRecordStateLock) {
            try {
                boolean z4 = true;
                if (this.audioRecord != null) {
                    return true;
                }
                if (initRecordingImpl(this.expectedSampleRate, this.expectedChannelCount, false) < 0) {
                    z4 = false;
                }
                return z4;
            } catch (Throwable th3) {
                throw th3;
            }
        }
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
        Logging.m85625w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    @CalledByNative
    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public boolean prewarmRecordingIfNeeded() {
        if (this.audioThread != null) {
            return true;
        }
        synchronized (this.audioRecordStateLock) {
            synchronized (this.audioThreadStateLock) {
                if (this.audioThread != null) {
                    return true;
                }
                return startRecordingImpl();
            }
        }
    }

    public void setMicrophoneMute(boolean z4) {
        Logging.m85625w(TAG, "setMicrophoneMute(" + z4 + ")");
        this.microphoneMute = z4;
    }

    @CalledByNative
    public void setNativeAudioRecord(long j7) {
        this.nativeAudioRecord = j7;
    }

    public boolean setNoiseSuppressorEnabled(boolean z4) {
        if (!WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            Logging.m85622e(TAG, "Noise suppressor is not supported.");
            return false;
        }
        Logging.m85625w(TAG, "SetNoiseSuppressorEnabled(" + z4 + ")");
        return this.effects.toggleNS(z4);
    }

    @TargetApi(C1533u.RECORDING_METHOD_FIELD_NUMBER)
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Logging.m85621d(TAG, "setPreferredDevice " + (audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getId()) : null));
        this.preferredDevice = audioDeviceInfo;
        if (this.audioRecord == null || this.audioRecord.setPreferredDevice(audioDeviceInfo)) {
            return;
        }
        Logging.m85622e(TAG, "setPreferredDevice failed");
    }

    public void setUseAudioRecord(boolean z4) {
        Logging.m85621d(TAG, "setUseAudioRecord(" + z4 + ")");
        this.useAudioRecord = z4;
    }

    public boolean startRecordingIfNeeded() {
        this.clientCalledStartRecording.set(true);
        if (this.audioThread == null) {
            synchronized (this.audioRecordStateLock) {
                synchronized (this.audioThreadStateLock) {
                    if (this.audioThread == null) {
                        return startRecordingImpl();
                    }
                }
            }
        }
        return true;
    }

    public boolean stopRecordingIfNeeded() {
        Logging.m85621d(TAG, "stopRecordingIfNeeded");
        synchronized (this.audioRecordStateLock) {
            try {
                this.clientCalledStartRecording.set(false);
                if (this.audioThread == null) {
                    return true;
                }
                return stopRecordingIfNeededImpl();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i13, int i14, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, JavaAudioDeviceModule.AudioBufferCallback audioBufferCallback, boolean z4, boolean z13, int i15, int i16) {
        this.effects = new WebRtcAudioEffects();
        this.audioRecordStateLock = new Object();
        this.useAudioRecord = true;
        this.audioThreadStateLock = new Object();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        this.clientCalledStartRecording = new AtomicBoolean(false);
        this.nativeCalledInitRecording = new AtomicBoolean(false);
        this.nativeCalledStartRecording = new AtomicBoolean(false);
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
        this.audioBufferCallback = audioBufferCallback;
        this.isAcousticEchoCancelerSupported = z4;
        this.isNoiseSuppressorSupported = z13;
        this.expectedSampleRate = i15;
        this.expectedChannelCount = i16;
        Logging.m85621d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }
}
