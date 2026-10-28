package nx1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.access.labsummary.models.LabSummaryModel;
import com.whoop.advancedlabs.actionplan.domain.models.ActionPlanResponse;
import com.whoop.advancedlabs.feature.marketingconsent.domain.models.ConfirmationStep;
import com.whoop.advancedlabs.feature.marketingconsent.domain.models.ConsentStep;
import com.whoop.design.atomic.organism.toolbar.AbstractC6718a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6720c;
import com.whoop.design.atomic.organism.toolbar.DesignToolbarView;
import com.whoop.design.models.items.graph.plot.band.BandDataPointModel;
import com.whoop.design.models.items.graph.plot.band.BandSegmentModel;
import com.whoop.realtime.presentation.StartActivityActivity;
import com.whoop.settings.gifthub.domain.models.GiftHubItemModel;
import com.whoop.settings.gifthub.domain.models.GiftHubResponse;
import com.whoop.settings.gifthub.domain.models.GiftHubSectionModel;
import com.whoop.settings.referafriendmenu.model.ItemContent;
import com.whoop.settings.referafriendmenu.model.ReferAFriendMenuModel;
import com.whoop.shepherd.feature.about.domain.models.ShepherdAboutResponse;
import nz0.AbstractC27304c;
import o01.AbstractC27346b;
import o11.C27395a;

/* JADX INFO: renamed from: nx1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27219a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f108925w;

    public /* synthetic */ C27219a(int i13) {
        this.f108925w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f108925w) {
            case 0:
                return AbstractC27220b.m81957g();
            case 1:
                return AbstractC27304c.m82401f();
            case 2:
                return AbstractC27346b.m82500h();
            case 3:
                return C27395a.m82551k();
            case 4:
                return LabSummaryModel._childSerializers$_anonymous_();
            case 5:
                return LabSummaryModel._childSerializers$_anonymous_$0();
            case 6:
                return StartActivityActivity.m23948f1();
            case 7:
                return StartActivityActivity.m23943d2();
            case 8:
                return StartActivityActivity.m23945e1();
            case 9:
                return AbstractC6718a.m20137e();
            case 10:
                return AbstractC6718a.m20138f();
            case 11:
                return AbstractC6719b.m20144e();
            case 12:
                return AbstractC6719b.m20145f();
            case 13:
                return DesignToolbarView.m20130s();
            case 14:
                return DesignToolbarView.m20131t();
            case 15:
                return AbstractC6720c.m20152e();
            case 16:
                return AbstractC6720c.m20153f();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ActionPlanResponse._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return BandDataPointModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BandSegmentModel._childSerializers$_anonymous_();
            case 20:
                return BandSegmentModel._childSerializers$_anonymous_$0();
            case 21:
                return GiftHubItemModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return GiftHubResponse._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return GiftHubSectionModel._childSerializers$_anonymous_();
            case 24:
                return ConfirmationStep._childSerializers$_anonymous_();
            case 25:
                return ConsentStep._childSerializers$_anonymous_();
            case 26:
                return ConsentStep._childSerializers$_anonymous_$0();
            case 27:
                return ItemContent._childSerializers$_anonymous_();
            case 28:
                return ReferAFriendMenuModel._childSerializers$_anonymous_();
            default:
                return ShepherdAboutResponse._childSerializers$_anonymous_();
        }
    }
}
