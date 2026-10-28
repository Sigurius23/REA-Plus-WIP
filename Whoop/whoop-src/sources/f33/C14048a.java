package f33;

import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.WrappedVideoDecoderFactory;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14048a implements VideoDecoderFactory {

    /* JADX INFO: renamed from: a */
    public final List f50135a;

    /* JADX INFO: renamed from: b */
    public final SoftwareVideoDecoderFactory f50136b;

    /* JADX INFO: renamed from: c */
    public final WrappedVideoDecoderFactory f50137c;

    public C14048a(EglBase.Context context) {
        List listM118959K = AbstractC37056f.m118959K("VP9", "AV1");
        SoftwareVideoDecoderFactory softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();
        WrappedVideoDecoderFactory wrappedVideoDecoderFactory = new WrappedVideoDecoderFactory(context);
        this.f50135a = listM118959K;
        this.f50136b = softwareVideoDecoderFactory;
        this.f50137c = wrappedVideoDecoderFactory;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        AbstractC22676k.m65750j(videoCodecInfo, "videoCodecInfo");
        List list = this.f50135a;
        return (list.isEmpty() || !list.contains(videoCodecInfo.name)) ? this.f50137c.createDecoder(videoCodecInfo) : this.f50136b.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = this.f50137c.getSupportedCodecs();
        AbstractC22676k.m65747g(supportedCodecs);
        return supportedCodecs;
    }
}
