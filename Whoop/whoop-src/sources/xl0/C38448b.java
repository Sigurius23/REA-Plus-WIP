package xl0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.community.CommunityFragment;
import com.whoop.community.CommunityLandingHostFragment;
import com.whoop.community.CommunityShowInviteFragment;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel;
import com.whoop.weeklyplan.weeklyplan.domain.models.AddGoalCard;
import com.whoop.weeklyplan.weeklyplan.domain.models.LoggedRecoveries;
import eq0.AbstractC13512p0;
import eq0.AbstractC13522r0;
import jb1.C21536b;
import p134f2.C14015d;
import p208i2.InterfaceC17886g0;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import vp2.InterfaceC36274a;
import xp2.AbstractC38537f;
import xp2.AbstractC38538g;
import xq2.AbstractC38550b0;
import xq2.AbstractC38554c1;
import xq2.AbstractC38576l0;
import xq2.AbstractC38587r;
import xt2.AbstractC38648b;
import xz0.AbstractC38754e;
import y11.AbstractC39050c;
import y21.AbstractC39162i;
import y22.AbstractC39167b;
import y31.AbstractC39195d;
import y31.C39192a;

/* JADX INFO: renamed from: xl0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38448b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f164641w;

    public /* synthetic */ C38448b(int i13) {
        this.f164641w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f164641w) {
            case 0:
                return AbstractC38449c.m123200f(obj);
            case 1:
                return CommunityFragment.m18873f0((AbstractC13512p0) obj);
            case 2:
                return CommunityLandingHostFragment.m19002x0((AbstractC13522r0) obj);
            case 3:
                return CommunityShowInviteFragment.m19177d0(((Float) obj).floatValue());
            case 4:
                return AbstractC38537f.m123475s(obj);
            case 5:
                return AbstractC38538g.m123486j((InterfaceC36274a) obj);
            case 6:
                return AbstractC38587r.m123765d(obj);
            case 7:
                return AbstractC38550b0.m123520k((String) obj);
            case 8:
                return AbstractC38550b0.m123526q((InterfaceC18044z) obj);
            case 9:
                return AbstractC38576l0.m123699x(obj);
            case 10:
                return AbstractC38576l0.m123693r(obj);
            case 11:
                return AbstractC38576l0.m123696u(obj);
            case 12:
                return AbstractC38576l0.m123670B(obj);
            case 13:
                return AbstractC38554c1.m123576b0(((Integer) obj).intValue());
            case 14:
                return AbstractC38648b.m123881i((C21536b) obj);
            case 15:
                return AbstractC38648b.m123882j((C23749z0) obj);
            case 16:
                return AbstractC38648b.m123884l((C23749z0) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC38648b.m123886n((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC38648b.m123883k((LoggedRecoveries) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC38648b.m123887o((EmptyTileModel) obj);
            case 20:
                return AbstractC38648b.m123885m((AddGoalCard) obj);
            case 21:
                return AbstractC38754e.m124199n(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC39050c.m124489r(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC39162i.m124697M((InterfaceC17886g0) obj);
            case 24:
                return AbstractC39167b.m124753e((C21536b) obj);
            case 25:
                return AbstractC39167b.m124754f((C23749z0) obj);
            case 26:
                return AbstractC39167b.m124755g((StripeBottomSheetTileModel) obj);
            case 27:
                return AbstractC39195d.m124860o((C39192a) obj);
            case 28:
                return AbstractC39195d.m124865t((InterfaceC22129c) obj);
            default:
                return AbstractC39195d.m124864s((C14015d) obj);
        }
    }
}
