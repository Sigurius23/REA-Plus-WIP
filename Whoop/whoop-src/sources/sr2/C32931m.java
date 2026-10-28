package sr2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: sr2.m */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C32931m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137217w;

    public /* synthetic */ C32931m(int i13) {
        this.f137217w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C38266c c38266c = (C38266c) obj;
        C34911a c34911a = (C34911a) obj2;
        switch (this.f137217w) {
            case 0:
                return C32932n.m103846d0(c38266c, c34911a);
            case 1:
                return C32932n.m103850f0(c38266c, c34911a);
            case 2:
                return C32932n.m103854h0(c38266c, c34911a);
            case 3:
                return C32932n.m103856i0(c38266c, c34911a);
            case 4:
                return C32932n.m103860k0(c38266c, c34911a);
            case 5:
                return C32932n.m103862l0(c38266c, c34911a);
            case 6:
                return C32932n.m103840a0(c38266c, c34911a);
            case 7:
                return C32932n.m103827O(c38266c, c34911a);
            case 8:
                return C32932n.m103866n0(c38266c, c34911a);
            case 9:
                return C32932n.m103870p0(c38266c, c34911a);
            case 10:
                return C32932n.m103874r0(c38266c, c34911a);
            case 11:
                return C32932n.m103876s0(c38266c, c34911a);
            case 12:
                return C32932n.m103880u0(c38266c, c34911a);
            case 13:
                return C32932n.m103882v0(c38266c, c34911a);
            case 14:
                return C32932n.m103884w0(c38266c, c34911a);
            case 15:
                return C32932n.m103828P(c38266c, c34911a);
            case 16:
                return C32932n.m103829Q(c38266c, c34911a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C32932n.m103830R(c38266c, c34911a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C32932n.m103832T(c38266c, c34911a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C32932n.m103833U(c38266c, c34911a);
            case 20:
                return C32932n.m103834V(c38266c, c34911a);
            case 21:
                return C32932n.m103835W(c38266c, c34911a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C32932n.m103837Y(c38266c, c34911a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC32934p.m103892d(c38266c, c34911a);
            case 24:
                return AbstractC32938t.m103908l(c38266c, c34911a);
            case 25:
                return AbstractC32938t.m103909m(c38266c, c34911a);
            case 26:
                return AbstractC32938t.m103910n(c38266c, c34911a);
            case 27:
                return AbstractC32938t.m103911o(c38266c, c34911a);
            case 28:
                return AbstractC32938t.m103913q(c38266c, c34911a);
            default:
                return AbstractC32938t.m103914r(c38266c, c34911a);
        }
    }
}
