package live.hms.video.transport;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public /* synthetic */ class HMSTransport$getScreenShareTrack$2$hmsScreenCapturer$1 extends C22672i implements InterfaceC4339a {
    public HMSTransport$getScreenShareTrack$2$hmsScreenCapturer$1(Object obj) {
        super(0, 0, ITransportObserver.class, obj, "onStopScreenshare", "onStopScreenshare()V");
    }

    @Override // c93.InterfaceC4339a
    public /* bridge */ /* synthetic */ Object invoke() {
        m134459invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134459invoke() {
        ((ITransportObserver) this.receiver).onStopScreenshare();
    }
}
