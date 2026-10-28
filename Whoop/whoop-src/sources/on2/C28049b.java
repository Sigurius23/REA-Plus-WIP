package on2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.profile.p067di.ProfileModule;
import qi1.C30412b;
import qq1.C30551b;
import rb0.C31190g;
import rr1.C31763b;
import sf1.C32447b;
import sr2.C32919a0;
import sr2.C32924f;
import t52.C33545a;
import x52.C37994b;
import xf3.C38266c;
import yu1.C39790a;
import yx0.C39839a;
import zi2.C40701e;

/* JADX INFO: renamed from: on2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28049b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113188w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38266c f113189x;

    public /* synthetic */ C28049b(C38266c c38266c, int i13) {
        this.f113188w = i13;
        this.f113189x = c38266c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f113188w) {
            case 0:
                return C28051d.m84715z0(this.f113189x);
            case 1:
                return C28051d.m84634Q0(this.f113189x);
            case 2:
                return C28051d.m84616H0(this.f113189x);
            case 3:
                return C28051d.m84652Z0(this.f113189x);
            case 4:
                return ProfileModule.define$lambda$0$3$0(this.f113189x);
            case 5:
                return C30412b.m92942F(this.f113189x);
            case 6:
                return C30551b.m93652A(this.f113189x);
            case 7:
                return C31190g.m96056i1(this.f113189x);
            case 8:
                return C31190g.m95969N1(this.f113189x);
            case 9:
                return C31190g.m96073m2(this.f113189x);
            case 10:
                return C31190g.m95949I1(this.f113189x);
            case 11:
                return C31190g.m95970N2(this.f113189x);
            case 12:
                return C31190g.m96013Y1(this.f113189x);
            case 13:
                return C31190g.m96006W2(this.f113189x);
            case 14:
                return C31763b.m98585A(this.f113189x);
            case 15:
                return C32447b.m101322u(this.f113189x);
            case 16:
                return C32924f.m103505J3(this.f113189x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C32919a0.m103397V(this.f113189x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C33545a.m105939n(this.f113189x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C37994b.m121732m(this.f113189x);
            case 20:
                return C39790a.m127527w(this.f113189x);
            case 21:
                return C39839a.m127894q(this.f113189x);
            default:
                return C40701e.m132173p(this.f113189x);
        }
    }
}
