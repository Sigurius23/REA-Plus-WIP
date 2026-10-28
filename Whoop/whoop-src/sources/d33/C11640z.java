package d33;

import e33.C12659u;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import m83.C25271y;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpParameters;
import org.webrtc.RtpTransceiver;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: d33.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C11640z extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C11640z f37599w = new C11640z(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C12659u spc = (C12659u) obj;
        AbstractC22676k.m65750j(spc, "spc");
        Double dValueOf = Double.valueOf(1.0d);
        int i13 = spc.f43268h;
        RtpParameters.Encoding encoding = new RtpParameters.Encoding("q", true, Double.valueOf(4.0d));
        encoding.maxBitrateBps = Integer.valueOf(i13 / 4);
        encoding.maxFramerate = 30;
        RtpParameters.Encoding encoding2 = new RtpParameters.Encoding(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, true, Double.valueOf(2.0d));
        encoding2.maxBitrateBps = Integer.valueOf(i13 / 2);
        encoding2.maxFramerate = 30;
        RtpParameters.Encoding encoding3 = new RtpParameters.Encoding("f", true, dValueOf);
        encoding3.maxBitrateBps = Integer.valueOf(i13);
        encoding3.maxFramerate = 30;
        new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, C25271y.f99162w, AbstractC37056f.m118959K(encoding, encoding2, encoding3));
        spc.m35416e().addTransceiver(MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO);
        return spc.m35416e().addTransceiver(MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO);
    }
}
