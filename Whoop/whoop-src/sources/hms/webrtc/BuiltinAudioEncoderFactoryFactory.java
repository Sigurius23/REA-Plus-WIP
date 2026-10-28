package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class BuiltinAudioEncoderFactoryFactory implements AudioEncoderFactoryFactory {
    private static native long nativeCreateBuiltinAudioEncoderFactory();

    @Override // hms.webrtc.AudioEncoderFactoryFactory
    public long createNativeAudioEncoderFactory() {
        return nativeCreateBuiltinAudioEncoderFactory();
    }
}
