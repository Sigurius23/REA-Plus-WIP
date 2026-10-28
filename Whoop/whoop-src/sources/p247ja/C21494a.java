package p247ja;

import java.util.Collections;
import java.util.List;
import p000.AbstractC11266d;
import p607x8.C38059n;

/* JADX INFO: renamed from: ja.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C21494a extends AbstractC21495b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f82450a;

    /* JADX INFO: renamed from: b */
    public final long f82451b;

    /* JADX INFO: renamed from: c */
    public final long f82452c;

    public C21494a(long j7, long j13, int i13) {
        this.f82450a = i13;
        switch (i13) {
            case 2:
                this.f82451b = j7;
                this.f82452c = j13;
                break;
            default:
                this.f82451b = j13;
                this.f82452c = j7;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m60456b(long j7, C38059n c38059n) {
        long jM121867t = c38059n.m121867t();
        if ((128 & jM121867t) != 0) {
            return 8589934591L & ((((jM121867t & 1) << 32) | c38059n.m121869v()) + j7);
        }
        return -9223372036854775807L;
    }

    @Override // p247ja.AbstractC21495b
    public final String toString() {
        switch (this.f82450a) {
            case 0:
                StringBuilder sb4 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb4.append(this.f82451b);
                sb4.append(", identifier= ");
                return AbstractC11266d.m30457k(this.f82452c, " }", sb4);
            case 1:
                StringBuilder sb5 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb5.append(this.f82451b);
                sb5.append(", programSplicePlaybackPositionUs= ");
                return AbstractC11266d.m30457k(this.f82452c, " }", sb5);
            default:
                StringBuilder sb6 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb6.append(this.f82451b);
                sb6.append(", playbackPositionUs= ");
                return AbstractC11266d.m30457k(this.f82452c, " }", sb6);
        }
    }

    public C21494a(List list, long j7, long j13) {
        this.f82450a = 1;
        this.f82451b = j7;
        this.f82452c = j13;
        Collections.unmodifiableList(list);
    }
}
