package org.webrtc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ExternalAudioProcessingFactory implements AudioProcessingFactory {
    private long apmPtr = nativeGetDefaultApm();
    private long capturePostProcessingPtr = 0;
    private long renderPreProcessingPtr = 0;

    public interface AudioProcessing {
        @CalledByNative("AudioProcessing")
        void initialize(int i13, int i14);

        @CalledByNative("AudioProcessing")
        void process(int i13, int i14, ByteBuffer byteBuffer);

        @CalledByNative("AudioProcessing")
        void reset(int i13);
    }

    private void checkExternalAudioProcessorExists() {
        if (this.apmPtr == 0) {
            throw new IllegalStateException("ExternalAudioProcessor has been disposed.");
        }
    }

    private static native void nativeDestroy();

    private static native long nativeGetDefaultApm();

    private static native void nativeSetBypassFlagForCapturePost(boolean z4);

    private static native void nativeSetBypassFlagForRenderPre(boolean z4);

    private static native long nativeSetCapturePostProcessing(AudioProcessing audioProcessing);

    private static native long nativeSetRenderPreProcessing(AudioProcessing audioProcessing);

    @Override // org.webrtc.AudioProcessingFactory
    public long createNative(long j7) {
        if (this.apmPtr == 0) {
            this.apmPtr = nativeGetDefaultApm();
        }
        return this.apmPtr;
    }

    public void destroy() {
        checkExternalAudioProcessorExists();
        long j7 = this.renderPreProcessingPtr;
        if (j7 != 0) {
            JniCommon.nativeReleaseRef(j7);
            this.renderPreProcessingPtr = 0L;
        }
        long j13 = this.capturePostProcessingPtr;
        if (j13 != 0) {
            JniCommon.nativeReleaseRef(j13);
            this.capturePostProcessingPtr = 0L;
        }
        nativeDestroy();
        this.apmPtr = 0L;
    }

    public void setBypassFlagForCapturePost(boolean z4) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForCapturePost(z4);
    }

    public void setBypassFlagForRenderPre(boolean z4) {
        checkExternalAudioProcessorExists();
        nativeSetBypassFlagForRenderPre(z4);
    }

    public void setCapturePostProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long jNativeSetCapturePostProcessing = nativeSetCapturePostProcessing(audioProcessing);
        long j7 = this.capturePostProcessingPtr;
        if (j7 != 0) {
            JniCommon.nativeReleaseRef(j7);
            this.capturePostProcessingPtr = 0L;
        }
        this.capturePostProcessingPtr = jNativeSetCapturePostProcessing;
    }

    public void setRenderPreProcessing(AudioProcessing audioProcessing) {
        checkExternalAudioProcessorExists();
        long jNativeSetRenderPreProcessing = nativeSetRenderPreProcessing(audioProcessing);
        long j7 = this.renderPreProcessingPtr;
        if (j7 != 0) {
            JniCommon.nativeReleaseRef(j7);
            this.renderPreProcessingPtr = 0L;
        }
        this.renderPreProcessingPtr = jNativeSetRenderPreProcessing;
    }
}
