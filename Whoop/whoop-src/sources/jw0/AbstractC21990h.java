package jw0;

import com.whoop.core.details.network.model.MetaData;
import com.whoop.core.details.network.model.sleep.ActivityDisplayType;
import com.whoop.core.details.network.model.sleep.MissingHRDataModel;
import com.whoop.core.details.network.model.sleep.SleepDetailsModel;
import com.whoop.core.details.network.model.sleep.SleepMetricBreakdownModel;
import com.whoop.core.details.network.model.sleep.SleepMetricBreakdownModelKt;
import com.whoop.core.details.network.model.sleep.SleepMetricTrendType;
import com.whoop.core.details.network.model.sleep.SleepMetricTypeModel;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.LayoutDirection;
import com.whoop.design.models.items.graph.plane.GraphPlaneModel;
import com.whoop.design.models.items.graph.plane.button.GraphButtons;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25247g0;
import mc1.EnumC25417b;
import mw0.C25973a;
import mw0.C25978f;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: jw0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "Ljw0/f;", "a", "(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;)Ljw0/f;", "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;", "Ljw0/j;", "label", "Lmw0/f;", "b", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21990h {

    /* JADX INFO: renamed from: jw0.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f85209a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f85210b;

        static {
            int[] iArr = new int[ActivityDisplayType.values().length];
            try {
                iArr[ActivityDisplayType.COMPLETE_SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityDisplayType.COMPLETE_NAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityDisplayType.INCOMPLETE_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f85209a = iArr;
            int[] iArr2 = new int[EnumC21992j.values().length];
            try {
                iArr2[EnumC21992j.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC21992j.AWAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC21992j.LIGHT_SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC21992j.REM_SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC21992j.SWS_SLEEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f85210b = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC21988f m62837a(SleepDetailsModel sleepDetailsModel) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        Object next9;
        Object next10;
        Object next11;
        AbstractC22676k.m65750j(sleepDetailsModel, "<this>");
        Iterator<T> it = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((SleepMetricBreakdownModel) next).getSleepMetricType() != SleepMetricTypeModel.HOURS_OF_SLEEP);
        SleepMetricBreakdownModel sleepMetricBreakdownModel = (SleepMetricBreakdownModel) next;
        if (sleepMetricBreakdownModel == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain hours of sleep metric breakdown");
        }
        Iterator<T> it3 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((SleepMetricBreakdownModel) next2).getSleepMetricType() != SleepMetricTypeModel.RESTORATIVE_SLEEP);
        SleepMetricBreakdownModel sleepMetricBreakdownModel2 = (SleepMetricBreakdownModel) next2;
        if (sleepMetricBreakdownModel2 == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain restorative sleep metric breakdown");
        }
        Iterator<T> it4 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (((SleepMetricBreakdownModel) next3).getSleepMetricType() != SleepMetricTypeModel.AWAKE);
        SleepMetricBreakdownModel sleepMetricBreakdownModel3 = (SleepMetricBreakdownModel) next3;
        if (sleepMetricBreakdownModel3 == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain awake metric breakdown");
        }
        Iterator<T> it5 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it5.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it5.next();
        } while (((SleepMetricBreakdownModel) next4).getSleepMetricType() != SleepMetricTypeModel.WAKE_EVENTS);
        SleepMetricBreakdownModel sleepMetricBreakdownModel4 = (SleepMetricBreakdownModel) next4;
        if (sleepMetricBreakdownModel4 == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain wake events metric breakdown");
        }
        Iterator<T> it6 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it6.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it6.next();
        } while (((SleepMetricBreakdownModel) next5).getSleepMetricType() != SleepMetricTypeModel.LIGHT_SLEEP);
        SleepMetricBreakdownModel sleepMetricBreakdownModel5 = (SleepMetricBreakdownModel) next5;
        if (sleepMetricBreakdownModel5 == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain light metric breakdown");
        }
        Iterator<T> it7 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it7.hasNext()) {
                next6 = null;
                break;
            }
            next6 = it7.next();
        } while (((SleepMetricBreakdownModel) next6).getSleepMetricType() != SleepMetricTypeModel.SWS_SLEEP);
        SleepMetricBreakdownModel sleepMetricBreakdownModel6 = (SleepMetricBreakdownModel) next6;
        if (sleepMetricBreakdownModel6 == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain sws metric breakdown");
        }
        Iterator<T> it8 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it8.hasNext()) {
                next7 = null;
                break;
            }
            next7 = it8.next();
        } while (((SleepMetricBreakdownModel) next7).getSleepMetricType() != SleepMetricTypeModel.REM_SLEEP);
        SleepMetricBreakdownModel sleepMetricBreakdownModel7 = (SleepMetricBreakdownModel) next7;
        if (sleepMetricBreakdownModel7 == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain rem metric breakdown");
        }
        Iterator<T> it9 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it9.hasNext()) {
                next8 = null;
                break;
            }
            next8 = it9.next();
        } while (((SleepMetricBreakdownModel) next8).getSleepMetricType() != SleepMetricTypeModel.EFFICIENCY);
        SleepMetricBreakdownModel sleepMetricBreakdownModel8 = (SleepMetricBreakdownModel) next8;
        if (sleepMetricBreakdownModel8 == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain efficiency metric breakdown");
        }
        Iterator<T> it10 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it10.hasNext()) {
                next9 = null;
                break;
            }
            next9 = it10.next();
        } while (((SleepMetricBreakdownModel) next9).getSleepMetricType() != SleepMetricTypeModel.RESPIRATORY_RATE);
        SleepMetricBreakdownModel sleepMetricBreakdownModel9 = (SleepMetricBreakdownModel) next9;
        if (sleepMetricBreakdownModel9 == null) {
            throw new IllegalStateException("Broken backend contract - response does not contain respiratory rate metric breakdown");
        }
        Iterator<T> it11 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it11.hasNext()) {
                next10 = null;
                break;
            }
            next10 = it11.next();
        } while (((SleepMetricBreakdownModel) next10).getSleepMetricType() != SleepMetricTypeModel.TOTAL_WAKE_EVENTS);
        SleepMetricBreakdownModel sleepMetricBreakdownModel10 = (SleepMetricBreakdownModel) next10;
        Iterator<T> it12 = sleepDetailsModel.getSleepMetricBreakdowns().iterator();
        do {
            if (!it12.hasNext()) {
                next11 = null;
                break;
            }
            next11 = it12.next();
        } while (((SleepMetricBreakdownModel) next11).getSleepMetricType() != SleepMetricTypeModel.LATENCY);
        SleepMetricBreakdownModel sleepMetricBreakdownModel11 = (SleepMetricBreakdownModel) next11;
        DateTimeRange.Companion companion = DateTimeRange.INSTANCE;
        LocalDateTime localDateTime = new LocalDateTime(companion.getDateTimeFormatter().withZoneUTC().parseDateTime(sleepDetailsModel.getSleepDetailsEditComponent().getSleepStartTime()).toInstant(), DateTimeZone.getDefault());
        LocalDateTime localDateTime2 = new LocalDateTime(companion.getDateTimeFormatter().withZoneUTC().parseDateTime(sleepDetailsModel.getSleepDetailsEditComponent().getSleepEndTime()).toInstant(), DateTimeZone.getDefault());
        int i13 = a.f85209a[sleepDetailsModel.getActivityDisplayType().ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            String screenTitleDisplay = sleepDetailsModel.getSleepDetailsLabelsModel().getScreenTitleDisplay();
            C21983a c21983a = new C21983a(sleepDetailsModel.getSleepDetailsLabelsModel().getSleepMetricsLabelDisplay(), sleepDetailsModel.getSleepDetailsLabelsModel().getVsThirtyDayRangeLabelDisplay(), AbstractC37056f.m118959K(sleepMetricBreakdownModel4, sleepMetricBreakdownModel8, sleepMetricBreakdownModel9, sleepMetricBreakdownModel11), sleepDetailsModel.getSleepDetailsMetricModals());
            C23465k c23465k = new C23465k(localDateTime, localDateTime2);
            boolean zM125876U = AbstractC39414r.m125876U(sleepDetailsModel.getSleepDetailsLabelsModel().getSleepMetricsLabelDisplay(), "nap", true);
            MissingHRDataModel missingHrData = sleepDetailsModel.getMissingHrData();
            C25973a c25973a = missingHrData != null ? new C25973a(AbstractC8693b.m21278l(missingHrData.getTitleDisplay()), AbstractC8693b.m21278l(missingHrData.getDurationDisplay())) : null;
            BarGraphContainerModel heartRateZoneContainer = sleepDetailsModel.getHeartRateZoneContainer();
            boolean napToSleepAvailable = sleepDetailsModel.getSleepDetailsEditComponent().getNapToSleepAvailable();
            GraphModel graphResponse = sleepDetailsModel.getGraphResponse();
            return new AbstractC21988f.b(screenTitleDisplay, c21983a, null, c23465k, c25973a, zM125876U, heartRateZoneContainer, napToSleepAvailable, graphResponse == null ? new GraphModel((GraphPlaneModel) null, (List) null, (String) null, (GraphButtons) null, (LayoutDirection) null, 31, (DefaultConstructorMarker) null) : graphResponse, 4, null);
        }
        boolean z4 = ActivityDisplayType.COMPLETE_NAP == sleepDetailsModel.getActivityDisplayType();
        String screenTitleDisplay2 = sleepDetailsModel.getSleepDetailsLabelsModel().getScreenTitleDisplay();
        String sleepDurationTimeDisplay = sleepDetailsModel.getSleepDetailsLabelsModel().getSleepDurationTimeDisplay();
        EnumC25417b enumC25417b = EnumC25417b.NONE;
        String dynamicVowDisplay = sleepDetailsModel.getVowStrings().getDynamicVowDisplay();
        EnumC21992j enumC21992j = EnumC21992j.DYNAMIC;
        C23465k c23465k2 = new C23465k(enumC25417b, new AbstractC21991i.c(dynamicVowDisplay, m62838b(sleepMetricBreakdownModel, enumC21992j), m62838b(sleepMetricBreakdownModel2, enumC21992j)));
        EnumC25417b enumC25417b2 = EnumC25417b.AWAKE;
        String awakeVowDisplay = sleepDetailsModel.getVowStrings().getAwakeVowDisplay();
        EnumC21992j enumC21992j2 = EnumC21992j.AWAKE;
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(c23465k2, new C23465k(enumC25417b2, new AbstractC21991i.a(awakeVowDisplay, m62838b(sleepMetricBreakdownModel3, enumC21992j2), sleepMetricBreakdownModel10 != null ? m62838b(sleepMetricBreakdownModel10, enumC21992j2) : null)), new C23465k(EnumC25417b.LIGHT_SLEEP, new AbstractC21991i.b(sleepDetailsModel.getVowStrings().getLightSleepVowDisplay(), m62838b(sleepMetricBreakdownModel5, EnumC21992j.LIGHT_SLEEP))), new C23465k(EnumC25417b.SWS_SLEEP, new AbstractC21991i.e(sleepDetailsModel.getVowStrings().getSwsSleepVowDisplay(), m62838b(sleepMetricBreakdownModel6, EnumC21992j.SWS_SLEEP))), new C23465k(EnumC25417b.REM_SLEEP, new AbstractC21991i.d(sleepDetailsModel.getVowStrings().getRemSleepVowDisplay(), m62838b(sleepMetricBreakdownModel7, EnumC21992j.REM_SLEEP))));
        C21983a c21983a2 = new C21983a(sleepDetailsModel.getSleepDetailsLabelsModel().getSleepMetricsLabelDisplay(), sleepDetailsModel.getSleepDetailsLabelsModel().getVsThirtyDayRangeLabelDisplay(), AbstractC37056f.m118959K(sleepMetricBreakdownModel4, sleepMetricBreakdownModel8, sleepMetricBreakdownModel9, sleepMetricBreakdownModel11), sleepDetailsModel.getSleepDetailsMetricModals());
        GraphModel graphResponse2 = sleepDetailsModel.getGraphResponse();
        GraphModel graphModel = graphResponse2 == null ? new GraphModel((GraphPlaneModel) null, (List) null, (String) null, (GraphButtons) null, (LayoutDirection) null, 31, (DefaultConstructorMarker) null) : graphResponse2;
        C23465k c23465k3 = new C23465k(localDateTime, localDateTime2);
        MissingHRDataModel missingHrData2 = sleepDetailsModel.getMissingHrData();
        C25973a c25973a2 = missingHrData2 != null ? new C25973a(AbstractC8693b.m21278l(missingHrData2.getTitleDisplay()), AbstractC8693b.m21278l(missingHrData2.getDurationDisplay())) : null;
        BarGraphContainerModel heartRateZoneContainer2 = sleepDetailsModel.getHeartRateZoneContainer();
        boolean napToSleepAvailable2 = sleepDetailsModel.getSleepDetailsEditComponent().getNapToSleepAvailable();
        WhoopCoachVowModel whoopCoachVow = sleepDetailsModel.getWhoopCoachVow();
        AdditionalInfoTextModel additionalInfoText = sleepDetailsModel.getAdditionalInfoText();
        MetaData metadata = sleepDetailsModel.getMetadata();
        return new AbstractC21988f.d(z4, screenTitleDisplay2, sleepDurationTimeDisplay, null, null, linkedHashMapM73993b0, c21983a2, null, c23465k3, c25973a2, napToSleepAvailable2, graphModel, heartRateZoneContainer2, null, null, whoopCoachVow, additionalInfoText, metadata != null ? metadata.getAiContextMetadata() : null, 24712, null);
    }

    /* JADX INFO: renamed from: b */
    private static final C25978f m62838b(SleepMetricBreakdownModel sleepMetricBreakdownModel, EnumC21992j enumC21992j) {
        EnumC39333f enumC39333f;
        TextResource textResourceM21278l;
        String sleepMetricValueDisplay = sleepMetricBreakdownModel.getSleepMetricValueDisplay();
        TextResource textResourceM21278l2 = sleepMetricValueDisplay != null ? AbstractC8693b.m21278l(sleepMetricValueDisplay) : null;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(sleepMetricBreakdownModel.getSleepMetricTitleDisplay());
        SleepMetricTrendType sleepMetricTrendType = sleepMetricBreakdownModel.getSleepMetricTrendType();
        EnumC17727b2 trendTypeState = sleepMetricTrendType != null ? SleepMetricBreakdownModelKt.toTrendTypeState(sleepMetricTrendType) : null;
        String sleepMetricComparisonDisplay = sleepMetricBreakdownModel.getSleepMetricComparisonDisplay();
        TextResource textResourceM21278l4 = sleepMetricComparisonDisplay != null ? AbstractC8693b.m21278l(sleepMetricComparisonDisplay) : null;
        int i13 = a.f85210b[enumC21992j.ordinal()];
        if (i13 == 1) {
            enumC39333f = EnumC39333f.SLEEP;
        } else if (i13 == 2) {
            enumC39333f = EnumC39333f.SLEEP_AWAKE;
        } else if (i13 == 3) {
            enumC39333f = EnumC39333f.SLEEP_LIGHT_SLEEP;
        } else if (i13 == 4) {
            enumC39333f = EnumC39333f.SLEEP_REM_SLEEP;
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            enumC39333f = EnumC39333f.SLEEP_DEEP_SLEEP;
        }
        EnumC39333f enumC39333f2 = enumC39333f;
        String tooltipDisplay = sleepMetricBreakdownModel.getTooltipDisplay();
        if (tooltipDisplay != null && (textResourceM21278l = AbstractC8693b.m21278l(tooltipDisplay)) != null) {
            return new C25978f(textResourceM21278l2, textResourceM21278l3, null, textResourceM21278l4, trendTypeState, enumC39333f2, textResourceM21278l, sleepMetricBreakdownModel.getSleepMetricType(), false, 260, null);
        }
        throw new IllegalStateException("Cannot create stat for label " + enumC21992j + " because there is no tooltip");
    }
}
