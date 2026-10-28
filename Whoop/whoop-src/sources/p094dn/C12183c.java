package p094dn;

import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import p479s4.AbstractC32126g;
import p499t9.AbstractC33618a;
import p607x8.C38059n;

/* JADX INFO: renamed from: dn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12183c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40611a = 0;

    /* JADX INFO: renamed from: b */
    public final int f40612b;

    /* JADX INFO: renamed from: c */
    public int f40613c;

    /* JADX INFO: renamed from: d */
    public int f40614d;

    /* JADX INFO: renamed from: e */
    public long f40615e;

    /* JADX INFO: renamed from: f */
    public final boolean f40616f;

    /* JADX INFO: renamed from: g */
    public int f40617g;

    /* JADX INFO: renamed from: h */
    public int f40618h;

    /* JADX INFO: renamed from: i */
    public final Object f40619i;

    /* JADX INFO: renamed from: j */
    public final Object f40620j;

    public C12183c(C13117a c13117a, C13117a c13117a2, boolean z4) throws ParserException {
        this.f40620j = c13117a;
        this.f40619i = c13117a2;
        this.f40616f = z4;
        c13117a2.m36689K(12);
        this.f40612b = c13117a2.m36680B();
        c13117a.m36689K(12);
        this.f40618h = c13117a.m36680B();
        AbstractC32126g.m100039d("first_chunk must be 1", c13117a.m36699i() == 1);
        this.f40613c = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33784a() {
        switch (this.f40611a) {
            case 0:
                C13117a c13117a = (C13117a) this.f40619i;
                C13117a c13117a2 = (C13117a) this.f40620j;
                int i13 = this.f40613c + 1;
                this.f40613c = i13;
                if (i13 == this.f40612b) {
                    return false;
                }
                this.f40615e = this.f40616f ? c13117a.m36681C() : c13117a.m36716z();
                if (this.f40613c != this.f40617g) {
                    return true;
                }
                this.f40614d = c13117a2.m36680B();
                c13117a2.m36690L(4);
                int i14 = this.f40618h - 1;
                this.f40618h = i14;
                this.f40617g = i14 > 0 ? c13117a2.m36680B() - 1 : -1;
                return true;
            default:
                C38059n c38059n = (C38059n) this.f40619i;
                C38059n c38059n2 = (C38059n) this.f40620j;
                int i15 = this.f40613c + 1;
                this.f40613c = i15;
                if (i15 == this.f40612b) {
                    return false;
                }
                this.f40615e = this.f40616f ? c38059n.m121872y() : c38059n.m121869v();
                if (this.f40613c != this.f40617g) {
                    return true;
                }
                this.f40614d = c38059n2.m121871x();
                c38059n2.m121847G(4);
                int i16 = this.f40618h - 1;
                this.f40618h = i16;
                this.f40617g = i16 > 0 ? c38059n2.m121871x() - 1 : -1;
                return true;
        }
    }

    public C12183c(C38059n c38059n, C38059n c38059n2, boolean z4) throws androidx.media3.common.ParserException {
        this.f40620j = c38059n;
        this.f40619i = c38059n2;
        this.f40616f = z4;
        c38059n2.m121846F(12);
        this.f40612b = c38059n2.m121871x();
        c38059n.m121846F(12);
        this.f40618h = c38059n.m121871x();
        AbstractC33618a.m106211c("first_chunk must be 1", c38059n.m121854g() == 1);
        this.f40613c = -1;
    }
}
