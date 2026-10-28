package org.webrtc;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j7);

    public static native List<String> nativeGetSupportedScalabilityModes();

    public static native boolean nativeIsSupported();

    public static List<String> scalabilityModes() {
        return nativeGetSupportedScalabilityModes();
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNative(long j7) {
        return nativeCreate(j7);
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
