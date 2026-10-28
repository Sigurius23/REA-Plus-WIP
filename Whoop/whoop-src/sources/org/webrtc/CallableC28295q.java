package org.webrtc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: org.webrtc.q */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC28295q implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114091w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper f114092x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f114093y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f114094z;

    public /* synthetic */ CallableC28295q(SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper streamEncoderWrapper, Object obj, Object obj2, int i13) {
        this.f114091w = i13;
        this.f114092x = streamEncoderWrapper;
        this.f114093y = obj;
        this.f114094z = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f114091w) {
            case 0:
                return this.f114092x.lambda$initEncode$0((VideoEncoder.Settings) this.f114093y, (VideoEncoder.Callback) this.f114094z);
            default:
                return this.f114092x.lambda$encode$2((VideoFrame) this.f114093y, (VideoEncoder.EncodeInfo) this.f114094z);
        }
    }
}
