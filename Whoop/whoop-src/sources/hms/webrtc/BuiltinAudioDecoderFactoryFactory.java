package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class BuiltinAudioDecoderFactoryFactory implements AudioDecoderFactoryFactory {
    private static native long nativeCreateBuiltinAudioDecoderFactory();

    @Override // hms.webrtc.AudioDecoderFactoryFactory
    public long createNativeAudioDecoderFactory() {
        return nativeCreateBuiltinAudioDecoderFactory();
    }
}
