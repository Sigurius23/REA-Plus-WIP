package ao1;

import androidx.health.platform.client.proto.C1533u;
import ar0.C1927b;
import b22.C2334a;
import b52.C2742b;
import c93.InterfaceC4351m;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: ao1.i */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1874i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7397w;

    public /* synthetic */ C1874i(int i13) {
        this.f7397w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C38266c c38266c = (C38266c) obj;
        C34911a c34911a = (C34911a) obj2;
        switch (this.f7397w) {
            case 0:
                return C1875j.m5618m0(c38266c, c34911a);
            case 1:
                return C1875j.m5620n0(c38266c, c34911a);
            case 2:
                return C1875j.m5622o0(c38266c, c34911a);
            case 3:
                return C1875j.m5624p0(c38266c, c34911a);
            case 4:
                return C1927b.m5900g(c38266c, c34911a);
            case 5:
                return C1927b.m5901h(c38266c, c34911a);
            case 6:
                return C1927b.m5902i(c38266c, c34911a);
            case 7:
                return C1927b.m5903j(c38266c, c34911a);
            case 8:
                return C2334a.m7206m(c38266c, c34911a);
            case 9:
                return C2334a.m7207n(c38266c, c34911a);
            case 10:
                return C2334a.m7208o(c38266c, c34911a);
            case 11:
                return C2334a.m7209p(c38266c, c34911a);
            case 12:
                return C2334a.m7210q(c38266c, c34911a);
            case 13:
                return C2334a.m7211r(c38266c, c34911a);
            case 14:
                return C2334a.m7212s(c38266c, c34911a);
            case 15:
                return C2334a.m7213t(c38266c, c34911a);
            case 16:
                return C2334a.m7215v(c38266c, c34911a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C2334a.m7216w(c38266c, c34911a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C2742b.m7757u(c38266c, c34911a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C2742b.m7732I(c38266c, c34911a);
            case 20:
                return C2742b.m7733J(c38266c, c34911a);
            case 21:
                return C2742b.m7734K(c38266c, c34911a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C2742b.m7735L(c38266c, c34911a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C2742b.m7736M(c38266c, c34911a);
            case 24:
                return C2742b.m7762z(c38266c, c34911a);
            case 25:
                return C2742b.m7725B(c38266c, c34911a);
            case 26:
                return C2742b.m7726C(c38266c, c34911a);
            case 27:
                return C2742b.m7727D(c38266c, c34911a);
            case 28:
                return C2742b.m7728E(c38266c, c34911a);
            default:
                return C2742b.m7758v(c38266c, c34911a);
        }
    }
}
