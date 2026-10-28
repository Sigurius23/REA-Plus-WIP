package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder(long j7);

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j7) {
        return nativeCreateDecoder(j7);
    }
}
