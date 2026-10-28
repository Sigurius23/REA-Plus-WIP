package sr2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: sr2.u */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C32939u implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137228w;

    public /* synthetic */ C32939u(int i13) {
        this.f137228w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        boolean zM103935H0;
        C38266c c38266c = (C38266c) obj;
        C34911a c34911a = (C34911a) obj2;
        switch (this.f137228w) {
            case 0:
                return C32941w.m103929E0(c38266c, c34911a);
            case 1:
                return C32941w.m103931F0(c38266c, c34911a);
            case 2:
                return C32941w.m103933G0(c38266c, c34911a);
            case 3:
                return C32941w.m103927D0(c38266c, c34911a);
            case 4:
                zM103935H0 = C32941w.m103935H0(c38266c, c34911a);
                break;
            case 5:
                zM103935H0 = C32941w.m103937I0(c38266c, c34911a);
                break;
            case 6:
                return C32941w.m103958Z(c38266c, c34911a);
            case 7:
                return C32941w.m103939J0(c38266c, c34911a);
            case 8:
                return C32941w.m103943L0(c38266c, c34911a);
            case 9:
                return C32941w.m103945M0(c38266c, c34911a);
            case 10:
                return C32941w.m103960a0(c38266c, c34911a);
            case 11:
                return C32941w.m103962b0(c38266c, c34911a);
            case 12:
                return C32941w.m103964c0(c38266c, c34911a);
            case 13:
                return C32941w.m103966d0(c38266c, c34911a);
            case 14:
                return C32941w.m103968e0(c38266c, c34911a);
            case 15:
                return C32941w.m103970f0(c38266c, c34911a);
            case 16:
                return C32942x.m104014d(c38266c, c34911a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C32919a0.m103386K(c38266c, c34911a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C32919a0.m103401Z(c38266c, c34911a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C32919a0.m103387L(c38266c, c34911a);
            case 20:
                return C32919a0.m103411e0(c38266c, c34911a);
            case 21:
                return C32919a0.m103413f0(c38266c, c34911a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C32919a0.m103415g0(c38266c, c34911a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C32919a0.m103417h0(c38266c, c34911a);
            case 24:
                return C32919a0.m103419i0(c38266c, c34911a);
            case 25:
                return C32919a0.m103421j0(c38266c, c34911a);
            case 26:
                return C32919a0.m103407c0(c38266c, c34911a);
            case 27:
                return C32919a0.m103423k0(c38266c, c34911a);
            case 28:
                return C32919a0.m103388M(c38266c, c34911a);
            default:
                return C32919a0.m103427m0(c38266c, c34911a);
        }
        return Boolean.valueOf(zM103935H0);
    }
}
