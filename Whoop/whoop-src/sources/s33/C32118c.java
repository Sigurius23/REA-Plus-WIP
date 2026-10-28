package s33;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C2996c2;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import hc3.C17171d;
import io.getstream.android.video.generated.models.TranscriptionSettingsResponse;
import java.util.LinkedHashSet;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.C25437c;

/* JADX INFO: renamed from: s33.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C32118c {

    /* JADX INFO: renamed from: a */
    public final C13045h2 f133141a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f133142b;

    /* JADX INFO: renamed from: c */
    public C2996c2 f133143c;

    /* JADX INFO: renamed from: d */
    public final C13045h2 f133144d;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f133145e;

    /* JADX INFO: renamed from: f */
    public C2996c2 f133146f;

    /* JADX INFO: renamed from: g */
    public final C17171d f133147g;

    /* JADX INFO: renamed from: h */
    public final C25437c f133148h;

    public C32118c() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25271y.f99162w);
        this.f133141a = c13045h2M36593c;
        AbstractC13091v.m36598h(c13045h2M36593c);
        this.f133142b = new LinkedHashSet();
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(TranscriptionSettingsResponse.ClosedCaptionMode.Disabled.INSTANCE);
        this.f133144d = c13045h2M36593c2;
        AbstractC13091v.m36598h(c13045h2M36593c2);
        this.f133145e = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f133147g = AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d()));
        this.f133148h = AbstractC25438d.m74669a();
    }
}
