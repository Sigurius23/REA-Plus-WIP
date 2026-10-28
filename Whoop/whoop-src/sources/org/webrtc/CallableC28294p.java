package org.webrtc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: org.webrtc.p */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC28294p implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114089w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f114090x;

    public /* synthetic */ CallableC28294p(Object obj, int i13) {
        this.f114089w = i13;
        this.f114090x = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f114089w) {
            case 0:
                return ((SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper) this.f114090x).lambda$getScalingSettings$4();
            case 1:
                return ((SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper) this.f114090x).lambda$getImplementationName$5();
            case 2:
                return ((SimulcastAlignedVideoEncoderFactory.StreamEncoderWrapper) this.f114090x).lambda$release$1();
            default:
                return ((TextureBufferImpl) this.f114090x).lambda$toI420$1();
        }
    }
}
