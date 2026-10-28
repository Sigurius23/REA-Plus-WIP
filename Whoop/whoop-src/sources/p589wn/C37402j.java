package p589wn;

import java.util.List;
import java.util.Map;
import p556vm.C36136c;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41009b1;

/* JADX INFO: renamed from: wn.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C37402j extends AbstractC37406n {

    /* JADX INFO: renamed from: d */
    public final int f160028d;

    /* JADX INFO: renamed from: e */
    public final long f160029e;

    /* JADX INFO: renamed from: f */
    public final boolean f160030f;

    /* JADX INFO: renamed from: g */
    public final boolean f160031g;

    /* JADX INFO: renamed from: h */
    public final long f160032h;

    /* JADX INFO: renamed from: i */
    public final boolean f160033i;

    /* JADX INFO: renamed from: j */
    public final int f160034j;

    /* JADX INFO: renamed from: k */
    public final long f160035k;

    /* JADX INFO: renamed from: l */
    public final int f160036l;

    /* JADX INFO: renamed from: m */
    public final long f160037m;

    /* JADX INFO: renamed from: n */
    public final long f160038n;

    /* JADX INFO: renamed from: o */
    public final boolean f160039o;

    /* JADX INFO: renamed from: p */
    public final boolean f160040p;

    /* JADX INFO: renamed from: q */
    public final C36136c f160041q;

    /* JADX INFO: renamed from: r */
    public final AbstractC41023g0 f160042r;

    /* JADX INFO: renamed from: s */
    public final AbstractC41023g0 f160043s;

    /* JADX INFO: renamed from: t */
    public final C41009b1 f160044t;

    /* JADX INFO: renamed from: u */
    public final long f160045u;

    /* JADX INFO: renamed from: v */
    public final C37401i f160046v;

    public C37402j(int i13, String str, List list, long j7, boolean z4, long j13, boolean z13, int i14, long j14, int i15, long j15, long j16, boolean z14, boolean z15, boolean z16, C36136c c36136c, List list2, List list3, C37401i c37401i, Map map) {
        super(str, list, z14);
        this.f160028d = i13;
        this.f160032h = j13;
        this.f160031g = z4;
        this.f160033i = z13;
        this.f160034j = i14;
        this.f160035k = j14;
        this.f160036l = i15;
        this.f160037m = j15;
        this.f160038n = j16;
        this.f160039o = z15;
        this.f160040p = z16;
        this.f160041q = c36136c;
        this.f160042r = AbstractC41023g0.m133252m(list2);
        this.f160043s = AbstractC41023g0.m133252m(list3);
        this.f160044t = C41009b1.m133232a(map);
        if (!list3.isEmpty()) {
            C37397e c37397e = (C37397e) AbstractC41047q.m133279i(list3);
            this.f160045u = c37397e.f160012E + c37397e.f160021y;
        } else if (list2.isEmpty()) {
            this.f160045u = 0L;
        } else {
            C37399g c37399g = (C37399g) AbstractC41047q.m133279i(list2);
            this.f160045u = c37399g.f160012E + c37399g.f160021y;
        }
        this.f160029e = j7 != -9223372036854775807L ? j7 >= 0 ? Math.min(this.f160045u, j7) : Math.max(0L, this.f160045u + j7) : -9223372036854775807L;
        this.f160030f = j7 >= 0;
        this.f160046v = c37401i;
    }

    @Override // p589wn.AbstractC37406n
    /* JADX INFO: renamed from: a */
    public final Object mo119754a(List list) {
        return this;
    }
}
