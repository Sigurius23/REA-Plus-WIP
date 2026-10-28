package t23;

import androidx.room.AbstractC1772c1;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.nio.ByteBuffer;
import org.webrtc.EglBase;
import stream.video.sfu.models.VideoDimension;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: t23.f3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33388f3 {

    /* JADX INFO: renamed from: a */
    public final EglBase.Context f139385a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f139386b;

    /* JADX INFO: renamed from: c */
    public final C13045h2 f139387c;

    /* JADX INFO: renamed from: d */
    public final C13045h2 f139388d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f139389e;

    static {
        new VideoDimension(1920, 1080, null, 4, null);
    }

    public C33388f3(C33476x1 c33476x1, EglBase.Context context) {
        this.f139385a = context;
        AbstractC1772c1.m5382S(this, "Media:ScreenShareManager");
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C33436p1.f139584a);
        this.f139386b = c13045h2M36593c;
        this.f139387c = c13045h2M36593c;
        AbstractC37926s0.m121484x(c13045h2M36593c, C33383e3.f139367w);
        this.f139388d = AbstractC13091v.m36593c(Boolean.FALSE);
    }
}
