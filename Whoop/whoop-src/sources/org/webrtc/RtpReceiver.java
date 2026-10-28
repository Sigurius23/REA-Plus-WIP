package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class RtpReceiver {
    private final MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    public interface Observer {
        @CalledByNative("Observer")
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);

        @CalledByNative("Observer")
        default void onFirstPacketReceivedAfterReceptiveChange(MediaStreamTrack.MediaType mediaType) {
        }
    }

    @CalledByNative
    public RtpReceiver(long j7) {
        this.nativeRtpReceiver = j7;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j7));
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw new IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    private static native String nativeGetId(long j7);

    private static native RtpParameters nativeGetParameters(long j7);

    private static native long nativeGetTrack(long j7);

    private static native void nativeSetFrameDecryptor(long j7, long j13);

    private static native long nativeSetObserver(long j7, Observer observer);

    private static native void nativeUnsetObserver(long j7, long j13);

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        long j7 = this.nativeObserver;
        if (j7 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j7);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    @CalledByNative
    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j7 = this.nativeObserver;
        if (j7 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j7);
            this.nativeObserver = 0L;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0L;
    }

    public long getNativeRtpReceiver() {
        checkRtpReceiverExists();
        return this.nativeRtpReceiver;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    /* JADX INFO: renamed from: id */
    public String m85646id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
