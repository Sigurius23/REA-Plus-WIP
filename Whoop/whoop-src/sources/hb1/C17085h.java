package hb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.communityreactions.domain.model.ReactionCommentModel;
import com.whoop.communityreactions.domain.model.ReactionsArchMiniModel;
import com.whoop.design.models.items.clinicalreportcard.ClinicalReportCardModel;
import com.whoop.design.models.items.keyinfotile.KeyInfoTileModel;
import com.whoop.design.models.items.secondaryactionbutton.SecondaryActionButtonModel;
import com.whoop.design.showcase.shared.view.DesignShowcaseView;
import com.whoop.p069ui.teams.TeamsShowInviteActivity;
import com.whoop.share.model.ShareRouteMapModel;
import hd1.AbstractC17198b;
import hd2.AbstractC17204f;
import hg0.AbstractC17255b;
import hh0.AbstractC17286f;
import hh0.AbstractC17287g;
import hh1.AbstractC17289b;
import hp2.AbstractC17557d;
import hr1.AbstractC17575a;
import hs0.AbstractC17600a;
import hs0.AbstractC17601b;
import ht2.AbstractC17633e;
import ih0.C18488d;
import jb1.C21536b;
import p270k2.InterfaceC22129c;
import p708hb2.AbstractC42784j;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;

/* JADX INFO: renamed from: hb1.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17085h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65649w;

    public /* synthetic */ C17085h(int i13) {
        this.f65649w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65649w) {
            case 0:
                return AbstractC17090m.m48214A(obj);
            case 1:
                return AbstractC17090m.m48245t((String) obj);
            case 2:
                return AbstractC17090m.m48220G(obj);
            case 3:
                return AbstractC17090m.m48222I((String) obj);
            case 4:
                return AbstractC42784j.m48321M((C18488d) obj);
            case 5:
                return AbstractC42784j.m48348x((C18488d) obj);
            case 6:
                return AbstractC17198b.m48558f(obj);
            case 7:
                return DesignShowcaseView.m21260t(obj);
            case 8:
                return AbstractC17204f.m48600f((C21536b) obj);
            case 9:
                return AbstractC17204f.m48601g((C23749z0) obj);
            case 10:
                return AbstractC17204f.m48602h((ShareRouteMapModel) obj);
            case 11:
                return AbstractC17204f.m48603i((C21536b) obj);
            case 12:
                return AbstractC17255b.m48832c((C21536b) obj);
            case 13:
                return AbstractC17286f.m48953t((InterfaceC22129c) obj);
            case 14:
                return AbstractC17287g.m48962f((Throwable) obj);
            case 15:
                return AbstractC17289b.m48970d((C21536b) obj);
            case 16:
                return TeamsShowInviteActivity.m27387V(((Float) obj).floatValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC17557d.m49962c((C25308q) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC17575a.m50035g((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC17575a.m50036h((C23749z0) obj);
            case 20:
                return AbstractC17575a.m50037i((KeyInfoTileModel) obj);
            case 21:
                return AbstractC17575a.m50038j((ClinicalReportCardModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC17575a.m50039k((SecondaryActionButtonModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC17600a.m50120f((C21536b) obj);
            case 24:
                return AbstractC17600a.m50121g((C23749z0) obj);
            case 25:
                return AbstractC17600a.m50122h((ReactionsArchMiniModel) obj);
            case 26:
                return AbstractC17600a.m50123i((ReactionCommentModel) obj);
            case 27:
                return AbstractC17601b.m50130c((C25308q) obj);
            case 28:
                return AbstractC17633e.m50214V(obj);
            default:
                return AbstractC17633e.m50244y(obj);
        }
    }
}
