package live.hms.video.encoder.video;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: live.hms.video.encoder.video.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC24140a implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95202w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper f95203x;

    public /* synthetic */ CallableC24140a(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper streamEncoderWrapper, int i13) {
        this.f95202w = i13;
        this.f95203x = streamEncoderWrapper;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f95202w) {
            case 0:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.release$lambda$1(this.f95203x);
            case 1:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getEncoderInfo$lambda$10(this.f95203x);
            case 2:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getImplementationName$lambda$5(this.f95203x);
            case 3:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getScalingSettings$lambda$4(this.f95203x);
            case 4:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.isHardwareEncoder$lambda$7(this.f95203x);
            case 5:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.createNativeVideoEncoder$lambda$6(this.f95203x);
            default:
                return SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.getResolutionBitrateLimits$lambda$9(this.f95203x);
        }
    }
}
