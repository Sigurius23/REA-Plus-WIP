package qe0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.AnnotatedTextModel;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.weeklyplan.api.ChallengeLandingCustomPlanCard;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import ln0.InterfaceC24522b;
import mn0.InterfaceC25707a;
import mt2.AbstractC25946g;
import ne0.AbstractC26596a;
import ns1.AbstractC27104b;
import oe0.AbstractC27868c;
import og0.InterfaceC27915a;
import p134f2.C14015d;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import p730qt2.AbstractC30600f;
import p730qt2.AbstractC30608n;
import p730qt2.AbstractC30609o;
import p730qt2.AbstractC30613s;
import qg0.AbstractC30343d;
import qg0.AbstractC30344e;
import qm1.AbstractC30483e;
import qn0.AbstractC30511f;
import qn0.AbstractC30513h;
import qn0.AbstractC30516k;
import qs1.AbstractC30574a;
import qs2.AbstractC30576a;

/* JADX INFO: renamed from: qe0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C30301b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f123994w;

    public /* synthetic */ C30301b(int i13) {
        this.f123994w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f123994w) {
            case 0:
                return AbstractC30302c.m92614H((AbstractC26596a) obj);
            case 1:
                return AbstractC30302c.m92611E((InterfaceC25312u) obj);
            case 2:
                return AbstractC30302c.m92615I((InterfaceC22381a.c) obj);
            case 3:
                return AbstractC30302c.m92616J((AbstractC27868c) obj);
            case 4:
                return AbstractC30302c.m92640u((AbstractC26596a) obj);
            case 5:
                return AbstractC30302c.m92641v((AbstractC27868c) obj);
            case 6:
                return AbstractC30343d.m92725p(obj);
            case 7:
                return AbstractC30343d.m92726q((C25308q) obj);
            case 8:
                return AbstractC30344e.m92738k((InterfaceC27915a) obj);
            case 9:
                return AbstractC30483e.m93307I(obj);
            case 10:
                return AbstractC30483e.m93340w(((Float) obj).floatValue());
            case 11:
                return AbstractC30511f.m93446g((InterfaceC25707a) obj);
            case 12:
                return AbstractC30511f.m93447h((InterfaceC24522b) obj);
            case 13:
                return AbstractC30513h.m93458e((C14015d) obj);
            case 14:
                return AbstractC30516k.m93471h((InterfaceC25707a) obj);
            case 15:
                return AbstractC30516k.m93472i((InterfaceC24522b) obj);
            case 16:
                return AbstractC30574a.m93743I((AbstractC27104b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC30576a.m93794h((C21536b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC30576a.m93795i((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC30576a.m93799m((C23749z0) obj);
            case 20:
                return AbstractC30576a.m93800n((EmptyTileModel) obj);
            case 21:
                return AbstractC30576a.m93796j((ChallengeLandingCustomPlanCard) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30576a.m93798l((AnnotatedTextModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30576a.m93797k((C21536b) obj);
            case 24:
                return AbstractC30600f.m93878g(obj);
            case 25:
                return p730qt2.Function1.m93910e((AbstractC25946g) obj);
            case 26:
                return AbstractC30608n.m93925e(obj);
            case 27:
                return AbstractC30609o.m93934g((AbstractC25946g) obj);
            case 28:
                return AbstractC30613s.m93967m(obj);
            default:
                return AbstractC30613s.m93970p(obj);
        }
    }
}
