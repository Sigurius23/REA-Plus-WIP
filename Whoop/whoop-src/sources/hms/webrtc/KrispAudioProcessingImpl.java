package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class KrispAudioProcessingImpl implements AudioProcessingFactory {
    private static native void nativeDestroy();

    private static native void nativeEnable(boolean z4);

    private static native long nativeGetAudioProcessorModule();

    private static native boolean nativeInit(String str, String str2);

    private static native boolean nativeInitWithData(byte[] bArr, String str);

    private static native boolean nativeIsEnabled();

    public void Destroy() {
        nativeDestroy();
    }

    public void Enable(boolean z4) {
        nativeEnable(z4);
    }

    public boolean Init(String str, String str2) {
        return nativeInit(str, str2);
    }

    public boolean InitWithData(byte[] bArr, String str) {
        return nativeInitWithData(bArr, str);
    }

    public boolean IsEnabled() {
        return nativeIsEnabled();
    }

    @Override // hms.webrtc.AudioProcessingFactory
    public long createNative() {
        return nativeGetAudioProcessorModule();
    }
}
