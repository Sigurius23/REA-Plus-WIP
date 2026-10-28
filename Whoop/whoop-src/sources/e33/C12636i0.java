package e33;

import c93.InterfaceC4339a;
import org.webrtc.ResolutionAdjustment;
import org.webrtc.SimulcastAlignedVideoEncoderFactory;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: e33.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12636i0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12638j0 f43147w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12636i0(C12638j0 c12638j0) {
        super(0);
        this.f43147w = c12638j0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        return new SimulcastAlignedVideoEncoderFactory(this.f43147w.f43154d.f139517x.m105815f().getEglBaseContext(), true, true, ResolutionAdjustment.MULTIPLE_OF_16);
    }
}
