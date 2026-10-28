package s51;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.achievements.domain.models.AchievementsResponse;
import com.whoop.achievements.domain.models.AchievementsSectionModel;
import com.whoop.design.atomic.organism.datahighlight.StreaksBadgeStyle;
import com.whoop.design.models.calendar.BehaviorsCalendarDayModel;
import com.whoop.design.models.calendar.BehaviorsCalendarDayStatus;
import com.whoop.design.models.calendar.BehaviorsCalendarDaysListModel;
import com.whoop.design.models.calendar.BehaviorsCalendarLegendItemModel;
import com.whoop.design.models.calendar.BehaviorsCalendarModel;
import com.whoop.design.models.calendar.BehaviorsCalendarMonthModel;
import com.whoop.design.models.calendar.CalendarOverlay;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel;
import com.whoop.design.models.items.graph.plot.scrubber.PhaseLabel;
import com.whoop.domain.model.teams.CommunityDto;
import com.whoop.domain.model.teams.FeatureCommunityDto;
import com.whoop.gps.collector.BackgroundLocationReceiver;
import com.whoop.p057ai.chat.api.AiCreateConversationRequestBody;
import com.whoop.p057ai.chat.api.AiCreateTurnRequestBody;
import com.whoop.p057ai.chat.api.AiSuggestionsResponse;
import com.whoop.p057ai.chat.api.TurnFeedbackBody;
import com.whoop.realtime.service.RealTimeActivityService;
import com.whoop.shepherd.feature.detail.domain.models.ShepherdHistoryDetailByDate;
import sc0.C32354b;
import sc1.AbstractC32361a;
import sg2.AbstractC32471v;

/* JADX INFO: renamed from: s51.p */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C32219p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133410w;

    public /* synthetic */ C32219p(int i13) {
        this.f133410w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f133410w) {
            case 0:
                return StreaksBadgeStyle._init_$_anonymous_();
            case 1:
                return RealTimeActivityService.m24224j();
            case 2:
                return AchievementsResponse._childSerializers$_anonymous_();
            case 3:
                return AchievementsResponse._childSerializers$_anonymous_$0();
            case 4:
                return AchievementsResponse._childSerializers$_anonymous_$1();
            case 5:
                return AchievementsSectionModel._childSerializers$_anonymous_();
            case 6:
                return BehaviorsCalendarDayModel._childSerializers$_anonymous_();
            case 7:
                return BehaviorsCalendarDayStatus._init_$_anonymous_();
            case 8:
                return BehaviorsCalendarDaysListModel._childSerializers$_anonymous_();
            case 9:
                return BehaviorsCalendarLegendItemModel._childSerializers$_anonymous_();
            case 10:
                return BehaviorsCalendarModel._childSerializers$_anonymous_();
            case 11:
                return BehaviorsCalendarModel._childSerializers$_anonymous_$0();
            case 12:
                return BehaviorsCalendarMonthModel._childSerializers$_anonymous_();
            case 13:
                return BehaviorsCalendarMonthModel._childSerializers$_anonymous_$0();
            case 14:
                return CalendarOverlay._childSerializers$_anonymous_();
            case 15:
                return DataScrubberDetailsModel._childSerializers$_anonymous_();
            case 16:
                return DataScrubberDetailsModel._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return PhaseLabel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C32354b.m100723e();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC32361a.m100785f();
            case 20:
                return CommunityDto._childSerializers$_anonymous_();
            case 21:
                return CommunityDto._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return FeatureCommunityDto._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ShepherdHistoryDetailByDate._childSerializers$_anonymous_();
            case 24:
                return AiCreateConversationRequestBody._childSerializers$_anonymous_();
            case 25:
                return AiCreateTurnRequestBody._childSerializers$_anonymous_();
            case 26:
                return AiSuggestionsResponse._childSerializers$_anonymous_();
            case 27:
                return TurnFeedbackBody._childSerializers$_anonymous_();
            case 28:
                return AbstractC32471v.m101425J();
            default:
                return BackgroundLocationReceiver.m21470c();
        }
    }
}
