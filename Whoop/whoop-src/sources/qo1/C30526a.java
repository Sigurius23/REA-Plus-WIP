package qo1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.BackToTodayModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CurrentCycleTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CycleJournalItemModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CycleJournalTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternButtonModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CycleSection;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HideOption;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.InfoButton;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarDomainModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogDataButtonModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodBottomSheet;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodRequest;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodToggle;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciCalendar;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciCycleResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciTileSectionModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciTrendsGraphModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MenstrualCycleInsightsResponse;

/* JADX INFO: renamed from: qo1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C30526a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125530w;

    public /* synthetic */ C30526a(int i13) {
        this.f125530w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f125530w) {
            case 0:
                return BackToTodayModel._childSerializers$_anonymous_();
            case 1:
                return CurrentCycleTileModel._childSerializers$_anonymous_();
            case 2:
                return CurrentCycleTileModel._childSerializers$_anonymous_$0();
            case 3:
                return CurrentCycleTileModel._childSerializers$_anonymous_$1();
            case 4:
                return CurrentCycleTileModel._childSerializers$_anonymous_$2();
            case 5:
                return CurrentCycleTileModel._childSerializers$_anonymous_$3();
            case 6:
                return CycleJournalItemModel._childSerializers$_anonymous_();
            case 7:
                return CycleJournalItemModel._childSerializers$_anonymous_$0();
            case 8:
                return CycleJournalItemModel._childSerializers$_anonymous_$1();
            case 9:
                return CycleJournalTileModel._childSerializers$_anonymous_();
            case 10:
                return CyclePatternButtonModel._childSerializers$_anonymous_();
            case 11:
                return CyclePatternTileModel._childSerializers$_anonymous_();
            case 12:
                return CyclePatternTileModel._childSerializers$_anonymous_$0();
            case 13:
                return CycleSection._childSerializers$_anonymous_();
            case 14:
                return HideOption._childSerializers$_anonymous_();
            case 15:
                return HormonalInsightsLoaderModel._childSerializers$_anonymous_();
            case 16:
                return InfoButton._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return LogCalendarDomainModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return LogDataButtonModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return LogPeriodBottomSheet._childSerializers$_anonymous_();
            case 20:
                return LogPeriodRequest._childSerializers$_anonymous_();
            case 21:
                return LogPeriodToggle._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return LogPeriodToggle._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MciCalendar._childSerializers$_anonymous_();
            case 24:
                return MciCalendar._childSerializers$_anonymous_$0();
            case 25:
                return MciCycleResponse._childSerializers$_anonymous_();
            case 26:
                return MciTileSectionModel._childSerializers$_anonymous_();
            case 27:
                return MciTrendsGraphModel._childSerializers$_anonymous_();
            case 28:
                return MciTrendsGraphModel._childSerializers$_anonymous_$0();
            default:
                return MenstrualCycleInsightsResponse._childSerializers$_anonymous_();
        }
    }
}
