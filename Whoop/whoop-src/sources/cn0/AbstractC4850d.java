package cn0;

import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayBottomState;
import com.whoop.design.models.calendar.CalendarDayState;
import com.whoop.design.models.calendar.CalendarPhase;
import com.whoop.design.models.calendar.archmini.CalendarDayModel;
import com.whoop.design.models.calendar.archmini.HormonalInsightsCalendarDayModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import java.time.LocalDate;
import kb1.C22325e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cn0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\" \u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lkb1/e;", "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;", "b", "(Lkb1/e;)Lkb1/e;", "Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;", "c", "(Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;)Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/navigation/models/GenericInteraction;", "a", "(Lkb1/e;)Lcom/whoop/navigation/models/GenericInteraction;", "dayInteraction", "calendar-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4850d {
    /* JADX INFO: renamed from: a */
    public static final GenericInteraction m15466a(C22325e<CalendarDayModel> c22325e) {
        AbstractC22676k.m65750j(c22325e, "<this>");
        CalendarDayModel calendarDayModelM64155g = c22325e.m64155g();
        HormonalInsightsCalendarDayModel hormonalInsightsCalendarDayModel = calendarDayModelM64155g instanceof HormonalInsightsCalendarDayModel ? (HormonalInsightsCalendarDayModel) calendarDayModelM64155g : null;
        if (hormonalInsightsCalendarDayModel != null) {
            return hormonalInsightsCalendarDayModel.getInteraction();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final C22325e<CalendarDateModel> m15467b(C22325e<CalendarDayModel> c22325e) {
        AbstractC22676k.m65750j(c22325e, "<this>");
        String contentDescription = c22325e.getContentDescription();
        boolean isCurrentDay = c22325e.getIsCurrentDay();
        boolean isSelectedDay = c22325e.getIsSelectedDay();
        boolean isFutureDay = c22325e.getIsFutureDay();
        int day = c22325e.getDay();
        String dayTitle = c22325e.getDayTitle();
        LocalDate localDate = c22325e.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        CalendarDayModel calendarDayModelM64155g = c22325e.m64155g();
        HormonalInsightsCalendarDayModel hormonalInsightsCalendarDayModel = calendarDayModelM64155g instanceof HormonalInsightsCalendarDayModel ? (HormonalInsightsCalendarDayModel) calendarDayModelM64155g : null;
        return new C22325e<>(contentDescription, isCurrentDay, isSelectedDay, isFutureDay, day, dayTitle, localDate, hormonalInsightsCalendarDayModel != null ? m15468c(hormonalInsightsCalendarDayModel) : null);
    }

    /* JADX INFO: renamed from: c */
    private static final CalendarDateModel m15468c(HormonalInsightsCalendarDayModel hormonalInsightsCalendarDayModel) {
        CalendarDayBottomState calendarDayBottomState;
        CalendarDayState calendarDayState;
        CalendarPhase calendarPhase;
        CalendarPhase calendarPhase2;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(hormonalInsightsCalendarDayModel.getDateValueDisplay());
        boolean hasData = hormonalInsightsCalendarDayModel.getHasData();
        Long cycleId = hormonalInsightsCalendarDayModel.getCycleId();
        String dayState = hormonalInsightsCalendarDayModel.getDayState();
        CalendarDayState calendarDayState2 = CalendarDayState.NO_DATA;
        CalendarDayState[] calendarDayStateArrValues = CalendarDayState.values();
        int length = calendarDayStateArrValues.length;
        int i13 = 0;
        while (true) {
            calendarDayBottomState = null;
            if (i13 >= length) {
                calendarDayState = null;
                break;
            }
            calendarDayState = calendarDayStateArrValues[i13];
            if (AbstractC22676k.m65745e(calendarDayState.name(), dayState)) {
                break;
            }
            i13++;
        }
        CalendarDayState calendarDayState3 = calendarDayState == null ? calendarDayState2 : calendarDayState;
        String phase = hormonalInsightsCalendarDayModel.getPhase();
        if (phase != null) {
            CalendarPhase calendarPhase3 = CalendarPhase.NONE;
            CalendarPhase[] calendarPhaseArrValues = CalendarPhase.values();
            int length2 = calendarPhaseArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    calendarPhase2 = null;
                    break;
                }
                calendarPhase2 = calendarPhaseArrValues[i14];
                if (AbstractC22676k.m65745e(calendarPhase2.name(), phase)) {
                    break;
                }
                i14++;
            }
            if (calendarPhase2 != null) {
                calendarPhase3 = calendarPhase2;
            }
            calendarPhase = calendarPhase3;
        } else {
            calendarPhase = null;
        }
        Boolean firstDayOfPhase = hormonalInsightsCalendarDayModel.getFirstDayOfPhase();
        Boolean lastDayOfPhase = hormonalInsightsCalendarDayModel.getLastDayOfPhase();
        String bottomState = hormonalInsightsCalendarDayModel.getBottomState();
        if (bottomState != null) {
            for (CalendarDayBottomState calendarDayBottomState2 : CalendarDayBottomState.values()) {
                if (AbstractC22676k.m65745e(calendarDayBottomState2.name(), bottomState)) {
                    calendarDayBottomState = calendarDayBottomState2;
                    break;
                }
            }
        }
        return new CalendarDateModel(textResourceM21278l, hasData, cycleId, calendarDayState3, calendarPhase, firstDayOfPhase, lastDayOfPhase, calendarDayBottomState, Boolean.valueOf(hormonalInsightsCalendarDayModel.getHidden()), hormonalInsightsCalendarDayModel.getDate(), hormonalInsightsCalendarDayModel.getOverlay());
    }
}
