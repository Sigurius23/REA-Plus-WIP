package u91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.celebration.SlotOptionsModel;
import com.whoop.design.models.celebration.TextOverlayStyle;
import com.whoop.design.models.items.heightweight.HeightWeightModel;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveyModels;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveySectionModel;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveyStickyModel;
import com.whoop.helpcenter.data.network.model.CallSectionDto;
import com.whoop.helpcenter.data.network.model.CommonQuestionsSection;
import com.whoop.helpcenter.data.network.model.HelpCenterLandingBffDto;
import com.whoop.settings.journalv2.JournalSettingsFragmentV2;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoCtaModel;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowItemModel;
import p739ui0.AbstractC35012n;
import p739ui0.AbstractC35014p;
import p739ui0.AbstractC35016r;
import p739ui0.Function1;
import uc1.AbstractC34760a;
import uf0.AbstractC34906g;
import uf0.C34909j;
import ug2.AbstractC34951d;
import ui1.C35018a;

/* JADX INFO: renamed from: u91.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34656a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f145989w;

    public /* synthetic */ C34656a(int i13) {
        this.f145989w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f145989w) {
            case 0:
                return SlotOptionsModel.GroupedCumulativeOptionsModel._childSerializers$_anonymous_();
            case 1:
                return SlotOptionsModel.UnknownOptionsModel._init_$_anonymous_();
            case 2:
                return TextOverlayStyle._init_$_anonymous_();
            case 3:
                return HeightWeightModel._childSerializers$_anonymous_();
            case 4:
                return HeightWeightModel._childSerializers$_anonymous_$0();
            case 5:
                return JournalSettingsFragmentV2.m25432T();
            case 6:
                return AbstractC34760a.m109767j();
            case 7:
                return "operation started";
            case 8:
                return "operation completed successfully";
            case 9:
                return "operation failed";
            case 10:
                return AbstractC34906g.m110068k();
            case 11:
                return C34909j.m110101e();
            case 12:
                return FeedbackSurveyModels._childSerializers$_anonymous_();
            case 13:
                return FeedbackSurveySectionModel._childSerializers$_anonymous_();
            case 14:
                return FeedbackSurveyStickyModel._childSerializers$_anonymous_();
            case 15:
                return AbstractC34951d.m110419n();
            case 16:
                return Function1.m110506u();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Function1.m110509x();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Function1.m110484A();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC35012n.m110595q();
            case 20:
                return AbstractC35012n.m110603y();
            case 21:
                return AbstractC35014p.m110623n();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC35016r.m110642j();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C35018a.m110671r();
            case 24:
                return C35018a.m110673t();
            case 25:
                return CallSectionDto._childSerializers$_anonymous_();
            case 26:
                return CommonQuestionsSection._childSerializers$_anonymous_();
            case 27:
                return HelpCenterLandingBffDto._childSerializers$_anonymous_();
            case 28:
                return BuyNowCheckoutInfoCtaModel._childSerializers$_anonymous_();
            default:
                return BuyNowItemModel._childSerializers$_anonymous_();
        }
    }
}
