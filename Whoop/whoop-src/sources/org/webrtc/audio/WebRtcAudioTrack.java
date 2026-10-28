package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes3.dex */
class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrackExternal";
    public AudioAttributes audioAttributes;
    private final AudioManager audioManager;
    private final JavaAudioDeviceModule.PlaybackSamplesReadyCallback audioSamplesReadyCallback;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private double cachedBufferSizeFactor;
    private int cachedChannels;
    private int cachedSampleRate;
    private boolean checkPlayState;
    private final Context context;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final ThreadUtils.ThreadChecker threadChecker;
    private boolean useLowLatency;
    private final VolumeLogger volumeLogger;

    public class AudioTrackThread extends Thread {
        private final LowLatencyAudioBufferManager bufferManager;
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.bufferManager = new LowLatencyAudioBufferManager();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.m85621d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioTrack.this.checkPlayState) {
                WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            }
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int iCapacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, iCapacity);
                WebRtcAudioTrack.assertTrue(iCapacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                }
                int iWrite = WebRtcAudioTrack.this.audioTrack.write(WebRtcAudioTrack.this.byteBuffer, iCapacity, 0);
                if (iWrite != iCapacity) {
                    Logging.m85622e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + iWrite);
                    if (iWrite < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError(AbstractC2875y.m8295h(iWrite, "AudioTrack.write failed: "));
                    }
                }
                if (WebRtcAudioTrack.this.audioSamplesReadyCallback != null && this.keepAlive) {
                    WebRtcAudioTrack.this.audioSamplesReadyCallback.onWebRtcAudioTrackSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioTrack.this.audioTrack.getAudioFormat(), WebRtcAudioTrack.this.audioTrack.getChannelCount(), WebRtcAudioTrack.this.audioTrack.getSampleRate(), Arrays.copyOfRange(WebRtcAudioTrack.this.byteBuffer.array(), WebRtcAudioTrack.this.byteBuffer.arrayOffset(), WebRtcAudioTrack.this.byteBuffer.arrayOffset() + iCapacity)));
                }
                if (WebRtcAudioTrack.this.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.this.audioTrack);
                }
            }
        }

        public void stopThread() {
            Logging.m85621d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    @CalledByNative
    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null, null, null, false, true);
    }

    @CalledByNative
    private int GetPlayoutUnderrunCount() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    @TargetApi(29)
    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
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

    private static AudioTrack createAudioTrackBeforeOreo(int i13, int i14, int i15, AudioAttributes audioAttributes) {
        Logging.m85621d(TAG, "createAudioTrackBeforeOreo");
        logNativeOutputSampleRate(i13);
        return new AudioTrack(getAudioAttributes(audioAttributes), new AudioFormat.Builder().setEncoding(2).setSampleRate(i13).setChannelMask(i14).build(), i15, 1, 0);
    }

    @TargetApi(26)
    private static AudioTrack createAudioTrackOnOreoOrHigher(int i13, int i14, int i15, AudioAttributes audioAttributes) {
        Logging.m85621d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i13);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i13).setChannelMask(i14).build()).setBufferSizeInBytes(i15).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i13) {
        Logging.m85621d(TAG, "doAudioTrackStateCallback: " + i13);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i13 == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i13 == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                Logging.m85622e(TAG, "Invalid audio state");
            }
        }
    }

    private static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(2).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    @CalledByNative
    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    @CalledByNative
    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    @CalledByNative
    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m85621d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    @CalledByNative
    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.m85621d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    @CalledByNative
    private int initPlayout(int i13, int i14, double d3, boolean z4) {
        if (z4) {
            this.threadChecker.checkIsOnValidThread();
        }
        this.cachedSampleRate = i13;
        this.cachedChannels = i14;
        this.cachedBufferSizeFactor = d3;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "initPlayout(sampleRate=", ", channels=", ", bufferSizeFactor=");
        sbM30465s.append(d3);
        sbM30465s.append(")");
        Logging.m85621d(TAG, sbM30465s.toString());
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((i13 / 100) * i14 * 2);
        this.byteBuffer = byteBufferAllocateDirect;
        Logging.m85621d(TAG, "byteBuffer.capacity: " + byteBufferAllocateDirect.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int iChannelCountToConfiguration = channelCountToConfiguration(i14);
        int minBufferSize = (int) (((double) AudioTrack.getMinBufferSize(i13, iChannelCountToConfiguration, 2)) * d3);
        Logging.m85621d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d3 > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            if (this.useLowLatency) {
                this.audioTrack = createAudioTrackOnOreoOrHigher(i13, iChannelCountToConfiguration, minBufferSize, this.audioAttributes);
            } else {
                this.audioTrack = createAudioTrackBeforeOreo(i13, iChannelCountToConfiguration, minBufferSize, this.audioAttributes);
            }
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            }
            this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
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
        Logging.m85621d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
    }

    private void logBufferSizeInFrames() {
        Logging.m85621d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
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
        Logging.m85621d(TAG, sbM30465s.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private static void logNativeOutputSampleRate(int i13) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.m85621d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i13 != nativeOutputSampleRate) {
            Logging.m85625w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        Logging.m85621d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
    }

    private static native void nativeCacheDirectBufferAddress(long j7, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeGetPlayoutData(long j7, int i13);

    private void releaseAudioResources() {
        Logging.m85621d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.m85622e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.m85622e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.m85622e(TAG, "Start playout error: " + String.valueOf(audioTrackStartErrorCode) + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    @CalledByNative
    private boolean setStreamVolume(int i13) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m85621d(TAG, "setStreamVolume(" + i13 + ")");
        if (this.audioManager.isVolumeFixed()) {
            Logging.m85622e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i13, 0);
        return true;
    }

    @CalledByNative
    private boolean startPlayout(boolean z4) {
        if (z4) {
            this.threadChecker.checkIsOnValidThread();
        }
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.start();
        }
        Logging.m85621d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, AbstractC2875y.m8295h(this.audioTrack.getPlayState(), "AudioTrack.play failed - incorrect state :"));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e5) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, AbstractC11266d.m30461o("AudioTrack.play failed: ", e5.getMessage()));
            releaseAudioResources();
            return false;
        }
    }

    @CalledByNative
    private boolean stopPlayout(boolean z4) {
        if (z4) {
            this.threadChecker.checkIsOnValidThread();
        }
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.stop();
        }
        Logging.m85621d(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m85621d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.m85622e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.m85621d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.m85621d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.m85621d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e5) {
                Logging.m85622e(TAG, "AudioTrack.stop failed: " + e5.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    @CalledByNative
    public void setNativeAudioTrack(long j7) {
        this.nativeAudioTrack = j7;
    }

    public void setSpeakerMute(boolean z4) {
        Logging.m85625w(TAG, "setSpeakerMute(" + z4 + ")");
        this.speakerMute = z4;
    }

    public boolean updateAudioTrackUsage(int i13) {
        Logging.m85621d(TAG, "updateAudioTrackUsage(usage=" + i13 + ")");
        if (this.audioTrack == null) {
            this.audioAttributes = getAudioAttributes(i13);
            return true;
        }
        AudioAttributes audioAttributes = this.audioAttributes;
        if (audioAttributes != null && audioAttributes.getUsage() == i13) {
            Logging.m85621d(TAG, "Usage is already set to " + i13 + ", no update needed");
            return false;
        }
        AudioTrack audioTrack = this.audioTrack;
        boolean z4 = audioTrack != null && audioTrack.getPlayState() == 3;
        if (z4) {
            Logging.m85621d(TAG, "Stopping current playout for usage change");
            if (!stopPlayout(false)) {
                Logging.m85625w(TAG, "Failed to stop playout before usage change");
                return false;
            }
        }
        this.audioAttributes = getAudioAttributes(i13);
        int i14 = this.cachedSampleRate;
        int i15 = this.cachedChannels;
        double d3 = this.cachedBufferSizeFactor;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i14, i15, "Using cached sampleRate=", ", channels=", ", usage=");
        sbM30465s.append(i13);
        Logging.m85621d(TAG, sbM30465s.toString());
        if (initPlayout(i14, i15, d3, false) < 0) {
            Logging.m85622e(TAG, "Failed to reinitialize AudioTrack with new usage");
            return false;
        }
        Logging.m85621d(TAG, "Successfully updated usage to " + i13);
        if (z4) {
            Logging.m85621d(TAG, "Restarting playout with new usage");
            if (!startPlayout(false)) {
                Logging.m85622e(TAG, "Failed to restart playout after usage change");
                return false;
            }
        }
        return true;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, JavaAudioDeviceModule.PlaybackSamplesReadyCallback playbackSamplesReadyCallback, boolean z4, boolean z13) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.checkPlayState = true;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = z13 ? new VolumeLogger(audioManager) : null;
        this.audioSamplesReadyCallback = playbackSamplesReadyCallback;
        this.useLowLatency = z4;
        Logging.m85621d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private AudioAttributes getAudioAttributes(int i13) {
        return new AudioAttributes.Builder().setUsage(i13).setContentType(i13 == 1 ? 2 : 1).build();
    }
}
