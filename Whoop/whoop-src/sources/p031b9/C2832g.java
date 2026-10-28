package p031b9;

import java.util.Locale;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p309lo.AbstractC24567y;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: b9.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C2832g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11165a;

    /* JADX INFO: renamed from: b */
    public int f11166b;

    /* JADX INFO: renamed from: c */
    public int f11167c;

    /* JADX INFO: renamed from: d */
    public int f11168d;

    /* JADX INFO: renamed from: e */
    public int f11169e;

    /* JADX INFO: renamed from: f */
    public int f11170f;

    /* JADX INFO: renamed from: g */
    public int f11171g;

    /* JADX INFO: renamed from: h */
    public int f11172h;

    /* JADX INFO: renamed from: i */
    public int f11173i;

    /* JADX INFO: renamed from: j */
    public int f11174j;

    /* JADX INFO: renamed from: k */
    public int f11175k;

    /* JADX INFO: renamed from: l */
    public long f11176l;

    /* JADX INFO: renamed from: m */
    public int f11177m;

    public /* synthetic */ C2832g(int i13) {
        this.f11165a = i13;
    }

    public final String toString() {
        switch (this.f11165a) {
            case 0:
                int i13 = this.f11166b;
                int i14 = this.f11167c;
                int i15 = this.f11168d;
                int i16 = this.f11169e;
                int i17 = this.f11170f;
                int i18 = this.f11171g;
                int i19 = this.f11172h;
                int i24 = this.f11173i;
                int i25 = this.f11174j;
                int i26 = this.f11175k;
                long j7 = this.f11176l;
                int i27 = this.f11177m;
                int i28 = AbstractC38065t.f163031a;
                Locale locale = Locale.US;
                StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
                AbstractC30802r.m94773v(sbM30465s, i15, "\n skippedInputBuffers=", i16, "\n renderedOutputBuffers=");
                AbstractC30802r.m94773v(sbM30465s, i17, "\n skippedOutputBuffers=", i18, "\n droppedBuffers=");
                AbstractC30802r.m94773v(sbM30465s, i19, "\n droppedInputBuffers=", i24, "\n maxConsecutiveDroppedBuffers=");
                AbstractC30802r.m94773v(sbM30465s, i25, "\n droppedToKeyframeEvents=", i26, "\n totalVideoFrameProcessingOffsetUs=");
                sbM30465s.append(j7);
                sbM30465s.append("\n videoFrameProcessingOffsetCount=");
                sbM30465s.append(i27);
                sbM30465s.append("\n}");
                return sbM30465s.toString();
            default:
                int i29 = this.f11166b;
                int i34 = this.f11167c;
                int i35 = this.f11168d;
                int i36 = this.f11169e;
                int i37 = this.f11170f;
                int i38 = this.f11171g;
                int i39 = this.f11172h;
                int i44 = this.f11173i;
                int i45 = this.f11174j;
                int i46 = this.f11175k;
                long j13 = this.f11176l;
                int i47 = this.f11177m;
                int i48 = AbstractC24567y.f95875a;
                Locale locale2 = Locale.US;
                StringBuilder sbM30465s2 = AbstractC11266d.m30465s(i29, i34, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
                AbstractC30802r.m94773v(sbM30465s2, i35, "\n skippedInputBuffers=", i36, "\n renderedOutputBuffers=");
                AbstractC30802r.m94773v(sbM30465s2, i37, "\n skippedOutputBuffers=", i38, "\n droppedBuffers=");
                AbstractC30802r.m94773v(sbM30465s2, i39, "\n droppedInputBuffers=", i44, "\n maxConsecutiveDroppedBuffers=");
                AbstractC30802r.m94773v(sbM30465s2, i45, "\n droppedToKeyframeEvents=", i46, "\n totalVideoFrameProcessingOffsetUs=");
                sbM30465s2.append(j13);
                sbM30465s2.append("\n videoFrameProcessingOffsetCount=");
                sbM30465s2.append(i47);
                sbM30465s2.append("\n}");
                return sbM30465s2.toString();
        }
    }
}
