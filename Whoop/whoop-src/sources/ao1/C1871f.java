package ao1;

import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.health.platform.client.proto.C1533u;
import b22.C2334a;
import c93.InterfaceC4339a;
import cb2.C4388a;
import gp2.AbstractC16071f;
import i62.C18156a;
import mb2.C25383a;
import nz1.C27306b;
import sa2.C32326a;
import sr2.C32924f;
import sv1.C33037c;
import to2.AbstractC34023a;
import ui1.C35018a;
import xp2.AbstractC38538g;
import xv1.C38669a;
import zo2.AbstractC40936g;

/* JADX INFO: renamed from: ao1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1871f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7391w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractActivityC1340r0 f7392x;

    public /* synthetic */ C1871f(AbstractActivityC1340r0 abstractActivityC1340r0, int i13) {
        this.f7391w = i13;
        this.f7392x = abstractActivityC1340r0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f7391w) {
            case 0:
                return C1875j.m5583Z0(this.f7392x);
            case 1:
                return C2334a.m7214u(this.f7392x);
            case 2:
                return C4388a.m13796w(this.f7392x);
            case 3:
                return AbstractC16071f.m45420t(this.f7392x);
            case 4:
                return C18156a.m52147l(this.f7392x);
            case 5:
                return C25383a.m74452p(this.f7392x);
            case 6:
                return C27306b.m82410F(this.f7392x);
            case 7:
                return C27306b.m82415K(this.f7392x);
            case 8:
                return C32326a.m100621h(this.f7392x);
            case 9:
                return C32924f.m103609c2(this.f7392x);
            case 10:
                return C32924f.m103675n2(this.f7392x);
            case 11:
                return C32924f.m103687p2(this.f7392x);
            case 12:
                return C32924f.m103645i2(this.f7392x);
            case 13:
                return C33037c.m104344Q0(this.f7392x);
            case 14:
                return C33037c.m104383h0(this.f7392x);
            case 15:
                return C33037c.m104415x0(this.f7392x);
            case 16:
                return C33037c.m104330J0(this.f7392x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC34023a.m107613t(this.f7392x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C35018a.m110653C(this.f7392x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC38538g.m123490n(this.f7392x);
            case 20:
                return C38669a.m124016n(this.f7392x);
            default:
                return AbstractC40936g.m132839p(this.f7392x);
        }
    }
}
