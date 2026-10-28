package live.hms.video.encoder.video;

import hms.webrtc.VideoEncoder;
import hms.webrtc.VideoFrame;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: live.hms.video.encoder.video.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC24142c implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95207w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper f95208x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f95209y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f95210z;

    public /* synthetic */ CallableC24142c(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper streamEncoderWrapper, Object obj, Object obj2, int i13) {
        this.f95207w = i13;
        this.f95208x = streamEncoderWrapper;
        this.f95209y = obj;
        this.f95210z = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f95207w) {
            case 0:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.initEncode$lambda$0(this.f95208x, (VideoEncoder.Settings) this.f95209y, (VideoEncoder.Callback) this.f95210z);
            default:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.encode$lambda$2(this.f95208x, (VideoFrame) this.f95209y, (VideoEncoder.EncodeInfo) this.f95210z);
        }
    }
}
