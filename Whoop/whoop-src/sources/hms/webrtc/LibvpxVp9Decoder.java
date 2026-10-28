package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class LibvpxVp9Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    @Override // hms.webrtc.WrappedNativeVideoDecoder, hms.webrtc.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
