package vo1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.communitymoments.domain.models.ArchMiniCommunityMomentsModel;
import com.whoop.communitymoments.domain.models.MenuAnchorButtonModel;
import com.whoop.communitymoments.domain.models.MomentCaptionBarModel;
import com.whoop.communitymoments.domain.models.MomentCardModel;
import com.whoop.communitymoments.domain.models.MomentCompactScoreGaugeModel;
import com.whoop.communitymoments.domain.models.MomentContainerModel;
import com.whoop.communitymoments.domain.models.MomentStackModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import ro1.AbstractC31635g;
import ro1.AbstractC31638j;
import sp1.AbstractC32871a;
import to1.AbstractC34020m;
import tp1.AbstractC34073m;
import us2.AbstractC35223d;
import vp1.AbstractC36272h;
import vq1.C36283a;
import vr0.AbstractC36301a;
import vr0.AbstractC36302b;
import vs2.AbstractC36479e;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: vo1.s */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36244s implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155251w;

    public /* synthetic */ C36244s(int i13) {
        this.f155251w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f155251w) {
            case 0:
                return AbstractC36245t.m115587o((AbstractC31635g) obj);
            case 1:
                return AbstractC36245t.m115589q((AbstractC39672a) obj);
            case 2:
                return AbstractC36245t.m115595w((AbstractC31635g) obj);
            case 3:
                return AbstractC36249x.m115645x((AbstractC34020m) obj);
            case 4:
                return AbstractC36249x.m115619Q((AbstractC39672a) obj);
            case 5:
                return AbstractC36249x.m115646y((AbstractC31638j) obj);
            case 6:
                return AbstractC36249x.m115647z((AbstractC39672a) obj);
            case 7:
                return AbstractC36249x.m115606D((AbstractC39672a) obj);
            case 8:
                return AbstractC36272h.m115894y0((AbstractC34073m) obj);
            case 9:
                return AbstractC36272h.m115760J0((AbstractC32871a) obj);
            case 10:
                return AbstractC36272h.m115781Q0((AbstractC39672a) obj);
            case 11:
                return AbstractC36272h.m115897z0((AbstractC32871a) obj);
            case 12:
                return AbstractC36272h.m115739C0((AbstractC39672a) obj);
            case 13:
                return AbstractC36272h.m115752G1((String) obj);
            case 14:
                return AbstractC36272h.m115879t0(((Boolean) obj).booleanValue());
            case 15:
                return AbstractC36272h.m115757I0((AbstractC34073m) obj);
            case 16:
                return C36283a.m115972d((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC36301a.m116038l((C21536b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36301a.m116024B((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC36301a.m116039m((C23749z0) obj);
            case 20:
                return AbstractC36301a.m116040n((MenuAnchorButtonModel) obj);
            case 21:
                return AbstractC36301a.m116041o((MomentCaptionBarModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC36301a.m116042p((MomentCardModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36301a.m116043q((MomentStackModel) obj);
            case 24:
                return AbstractC36301a.m116044r((ArchMiniCommunityMomentsModel) obj);
            case 25:
                return AbstractC36301a.m116045s((MomentContainerModel) obj);
            case 26:
                return AbstractC36301a.m116046t((MomentCompactScoreGaugeModel) obj);
            case 27:
                return AbstractC36301a.m116050x((C21536b) obj);
            case 28:
                return AbstractC36302b.m116061b((C25308q) obj);
            default:
                return AbstractC36479e.m116842D((AbstractC35223d) obj);
        }
    }
}
