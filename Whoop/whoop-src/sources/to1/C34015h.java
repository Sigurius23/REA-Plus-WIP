package to1;

import ad3.C0764g;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.HorizontalImpactBarLabeledModel;
import com.whoop.design.models.items.graph.GraphCardCtaModel;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CycleJournalTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogDataButtonModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciHeaderModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciMedicalDisclaimerModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PossibleSymptomsCardModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.TileWithTitleModel;
import com.whoop.whoopaction.domain.serialization.ActionTypeAdapter;
import jb1.C21536b;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p741vn1.EnumC36205i;
import tr2.C34109g;
import u82.AbstractC34650k;
import um1.AbstractC35086d;
import un1.AbstractC35098d;
import un1.AbstractC35101g;
import v41.AbstractC35684p;
import v61.AbstractC35738c;
import v61.AbstractC35741f;
import v61.C35736a;
import vb1.AbstractC35869b;

/* JADX INFO: renamed from: to1.h */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C34015h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f142577w;

    public /* synthetic */ C34015h(int i13) {
        this.f142577w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f142577w) {
            case 0:
                return AbstractC34019l.m107522E((PossibleSymptomsCardModel) obj);
            case 1:
                return AbstractC34019l.m107518A((CycleJournalTileModel) obj);
            case 2:
                return AbstractC34019l.m107525H((HormonalInsightsLoaderModel) obj);
            case 3:
                return AbstractC34019l.m107526I((MciMedicalDisclaimerModel) obj);
            case 4:
                return AbstractC34019l.m107529L((MciHeaderModel) obj);
            case 5:
                return AbstractC34019l.m107530M((LogDataButtonModel) obj);
            case 6:
                return AbstractC34019l.m107531N((TileWithTitleModel) obj);
            case 7:
                return AbstractC34019l.m107542Y((CycleJournalTileModel) obj);
            case 8:
                return AbstractC34019l.m107540W((C21536b) obj);
            case 9:
                return AbstractC34019l.m107541X((C23749z0) obj);
            case 10:
                return AbstractC34019l.m107570z((C21536b) obj);
            case 11:
                return AbstractC34019l.m107519B((DailyTickMarkPlotModel) obj);
            case 12:
                return AbstractC34019l.m107520C((PhaseCoachingTileModel) obj);
            case 13:
                return C34109g.m107824r((InterfaceC33687a) obj);
            case 14:
                return AbstractC34650k.m109495b((C0764g) obj);
            case 15:
                return AbstractC35086d.m110956l(obj);
            case 16:
                return AbstractC35098d.m111012j(((Boolean) obj).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC35098d.m111014l(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC35098d.m111016n((EnumC36205i) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC35101g.m111043p(((Boolean) obj).booleanValue());
            case 20:
                return AbstractC35101g.m111021D(obj);
            case 21:
                return AbstractC35101g.m111023F((EnumC36205i) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ActionTypeAdapter.m28437c((C0764g) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC35684p.m113053n(((Float) obj).floatValue());
            case 24:
                return AbstractC35738c.m113206d((C35736a) obj);
            case 25:
                return AbstractC35741f.m113221e(obj);
            case 26:
                return AbstractC35869b.m113868n((C23749z0) obj);
            case 27:
                return AbstractC35869b.m113870p((GraphCardCtaModel) obj);
            case 28:
                return AbstractC35869b.m113871q((StressGraphingCardModel) obj);
            default:
                return AbstractC35869b.m113872r((HorizontalImpactBarLabeledModel) obj);
        }
    }
}
