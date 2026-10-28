package live.hms.video.transport;

import l83.C23454a0;
import live.hms.video.media.tracks.HMSLocalTrack;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
public /* synthetic */ class HMSTransport$publish$2$1 extends C22672i implements Function1 {
    public HMSTransport$publish$2$1(Object obj) {
        super(1, 0, ITransportObserver.class, obj, "onTrackMuteChange", "onTrackMuteChange(Llive/hms/video/media/tracks/HMSLocalTrack;)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HMSLocalTrack) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(HMSLocalTrack p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((ITransportObserver) this.receiver).onTrackMuteChange(p13);
    }
}
