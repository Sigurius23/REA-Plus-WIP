package cq2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.communityfollowercontainer.domain.model.CommunityFilterBottomSheetModel;
import com.whoop.communityfollowercontainer.domain.model.CommunityFollowerContainerResponse;
import com.whoop.communityfollowercontainer.domain.model.OptionSection;
import com.whoop.user.journey.model.yearinreview.GaugeStep;
import com.whoop.user.journey.model.yearinreview.HorizontalBarStep;
import com.whoop.user.journey.model.yearinreview.HorizontalSleepBarStep;
import com.whoop.user.journey.model.yearinreview.ImageOnlyStep;
import com.whoop.user.journey.model.yearinreview.InReviewDesignItemStep;
import com.whoop.user.journey.model.yearinreview.LongTextStep;
import com.whoop.user.journey.model.yearinreview.NumberWithImage;
import com.whoop.user.journey.model.yearinreview.NumberWithImageFontSize;
import com.whoop.user.journey.model.yearinreview.QuizStep;
import com.whoop.user.journey.model.yearinreview.RecapStatistic;
import com.whoop.user.journey.model.yearinreview.SectionType;
import com.whoop.user.journey.model.yearinreview.StackedHorizontalBarsStep;
import com.whoop.user.journey.model.yearinreview.StatListStep;
import com.whoop.user.journey.model.yearinreview.StatStyle;
import com.whoop.user.journey.model.yearinreview.VerticalBarModel;
import com.whoop.user.journey.model.yearinreview.WhoopCoachResponse;
import com.whoop.user.journey.model.yearinreview.YearInReviewComparisonModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewHighlightsListModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewStreaksStatsCard;

/* JADX INFO: renamed from: cq2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C11062a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34930w;

    public /* synthetic */ C11062a(int i13) {
        this.f34930w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f34930w) {
            case 0:
                return GaugeStep._childSerializers$_anonymous_();
            case 1:
                return HorizontalBarStep._childSerializers$_anonymous_();
            case 2:
                return HorizontalSleepBarStep._childSerializers$_anonymous_();
            case 3:
                return HorizontalSleepBarStep._childSerializers$_anonymous_$0();
            case 4:
                return ImageOnlyStep._childSerializers$_anonymous_();
            case 5:
                return ImageOnlyStep._childSerializers$_anonymous_$0();
            case 6:
                return InReviewDesignItemStep._childSerializers$_anonymous_();
            case 7:
                return LongTextStep._childSerializers$_anonymous_();
            case 8:
                return NumberWithImage._childSerializers$_anonymous_();
            case 9:
                return NumberWithImage._childSerializers$_anonymous_$0();
            case 10:
                return NumberWithImage._childSerializers$_anonymous_$1();
            case 11:
                return NumberWithImageFontSize._init_$_anonymous_();
            case 12:
                return QuizStep._childSerializers$_anonymous_();
            case 13:
                return RecapStatistic._childSerializers$_anonymous_();
            case 14:
                return RecapStatistic._childSerializers$_anonymous_$0();
            case 15:
                return SectionType._init_$_anonymous_();
            case 16:
                return StackedHorizontalBarsStep._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return StackedHorizontalBarsStep._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return StatListStep._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return StatStyle._init_$_anonymous_();
            case 20:
                return VerticalBarModel._childSerializers$_anonymous_();
            case 21:
                return VerticalBarModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return WhoopCoachResponse._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return YearInReviewComparisonModel._childSerializers$_anonymous_();
            case 24:
                return YearInReviewHighlightsListModel._childSerializers$_anonymous_();
            case 25:
                return YearInReviewStreaksStatsCard._childSerializers$_anonymous_();
            case 26:
                return CommunityFilterBottomSheetModel._childSerializers$_anonymous_();
            case 27:
                return CommunityFollowerContainerResponse._childSerializers$_anonymous_();
            case 28:
                return CommunityFollowerContainerResponse._childSerializers$_anonymous_$0();
            default:
                return OptionSection._childSerializers$_anonymous_();
        }
    }
}
