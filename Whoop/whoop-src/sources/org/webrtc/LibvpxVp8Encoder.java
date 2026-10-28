package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j7);

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNative(long j7) {
        return nativeCreate(j7);
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
