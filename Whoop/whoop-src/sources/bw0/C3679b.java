package bw0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.core.details.network.model.DetailsEditComponent;
import com.whoop.core.details.network.model.TimeSelectorSection;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import ih0.AbstractC18489d0;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import mc1.EnumC25417b;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: bw0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJG\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lbw0/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lmc1/b;", "selectedHrZone", "", "a", "(Lmc1/b;)Ljava/lang/String;", "category", "action", "label", "eventName", "", "properties", "Ll83/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "d", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "Lbw0/a;", "e", "(Lbw0/a;)V", "Lfi0/a;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3679b {

    /* JADX INFO: renamed from: c */
    public static final int f14997c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: bw0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14999a;

        static {
            int[] iArr = new int[EnumC25417b.values().length];
            try {
                iArr[EnumC25417b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25417b.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25417b.HARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25417b.MODERATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC25417b.LIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC25417b.VERY_LIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC25417b.RESTORATIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC25417b.INHALE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC25417b.EXHALE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC25417b.HOLD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC25417b.SWS_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC25417b.REM_SLEEP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC25417b.NO_DATA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC25417b.AWAKE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC25417b.LIGHT_SLEEP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC25417b.HIGH_STRESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC25417b.LOW_STRESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC25417b.MEDIUM_STRESS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f14999a = iArr;
        }
    }

    public C3679b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final String m11410a(EnumC25417b selectedHrZone) {
        switch (b.f14999a[selectedHrZone.ordinal()]) {
            case 1:
                return "";
            case 2:
                return "MAX (90-100%)";
            case 3:
                return "HARD (80-90%)";
            case 4:
                return "MODERATE (70-80%)";
            case 5:
                return "LIGHT (60-70%)";
            case 6:
                return "VERY LIGHT (50-60%)";
            case 7:
                return "RESTORATIVE (<50%)";
            case 8:
                return "INHALE";
            case 9:
                return "EXHALE";
            case 10:
                return "HOLD";
            case 11:
                return "SWS";
            case 12:
                return "REM";
            case 13:
                return "NO_DATA";
            case 14:
                return "WAKE";
            case 15:
                return "LIGHT_SLEEP";
            case 16:
                return "HIGH_STRESS";
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return "LOW_STRESS";
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return "MEDIUM_STRESS";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m11411b(String category, String action, String label, String eventName, Map<String, ? extends Object> properties) {
        this.analytics.mo41428k(category, action, label, eventName, properties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11412c(C3679b c3679b, String str, String str2, String str3, String str4, Map map, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = "";
        }
        String str5 = str3;
        if ((i13 & 16) != 0) {
            map = C25272z.f99163w;
        }
        c3679b.m11411b(str, str2, str5, str4, map);
    }

    /* JADX INFO: renamed from: d */
    public final void m11413d(AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        AbstractC14516b.m41429a(this.analytics, analyticEvent);
    }

    /* JADX INFO: renamed from: e */
    public final void m11414e(InterfaceC3678a analyticEvent) {
        String activityTypeInternalName;
        String initialValue;
        TimeSelectorSection startTimeSelector;
        String initialValue2;
        TimeSelectorSection endTimeSelector;
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        if (analyticEvent instanceof InterfaceC3678a.h) {
            InterfaceC3678a.h hVar = (InterfaceC3678a.h) analyticEvent;
            m11412c(this, "Activity", "Press", null, "Activity - Press More", AbstractC25247g0.m73990Y(new C23465k("activityID", hVar.getActivityId()), new C23465k("type", hVar.getActivityType())), 4, null);
            return;
        }
        if (analyticEvent instanceof InterfaceC3678a.f) {
            InterfaceC3678a.f fVar = (InterfaceC3678a.f) analyticEvent;
            if (fVar.getSelectedHrZone() != EnumC25417b.NONE) {
                m11411b("Activity", "Press, Open", m11410a(fVar.getSelectedHrZone()), "Activity - Press Horizontal Bar Graph", AbstractC25247g0.m73990Y(new C23465k("activityID", fVar.getActivityId()), new C23465k("type", fVar.getActivityType())));
                return;
            }
            return;
        }
        if (analyticEvent instanceof InterfaceC3678a.g) {
            InterfaceC3678a.g gVar = (InterfaceC3678a.g) analyticEvent;
            m11411b(gVar.getActivityName(), "Press", "Activity Details", "Data Scrubbing", AbstractC31061c.m95645u("type", gVar.getActivityType()));
            return;
        }
        if (analyticEvent instanceof InterfaceC3678a.a) {
            InterfaceC3678a.a aVar = (InterfaceC3678a.a) analyticEvent;
            m11411b("Activity, Reviewing Data", "Review Activity, Open", AbstractC18489d0.m53370k(aVar.getEntryPoint(), " - ", aVar.getActivityName()), "Activity - Open", AbstractC25247g0.m73990Y(new C23465k("activityID", aVar.getActivityId()), new C23465k("type", aVar.getActivityType()), new C23465k("Source", aVar.getEntryPoint()), new C23465k("new_home", Boolean.valueOf(aVar.getNewHome()))));
            return;
        }
        if (analyticEvent instanceof InterfaceC3678a.d) {
            InterfaceC3678a.d dVar = (InterfaceC3678a.d) analyticEvent;
            m11411b("Edit Activities, Edit, Reviewing Data", "Delete", dVar.getActivityName(), "Activity - Delete", AbstractC25247g0.m73990Y(new C23465k("activityID", dVar.getActivityId()), new C23465k("type", dVar.getActivityType()), new C23465k("activity", dVar.getActivityName())));
            return;
        }
        if (analyticEvent instanceof InterfaceC3678a.b) {
            InterfaceC3678a.b bVar = (InterfaceC3678a.b) analyticEvent;
            m11411b("Edit Activities, Edit, Reviewing Data", "Cancel", AbstractC2875y.m8299l(bVar.getActivityName(), " - Delete Activity Cancel"), "Activity - Delete - Cancel", AbstractC31061c.m95645u("activityID", bVar.getActivityId()));
            return;
        }
        if (!(analyticEvent instanceof InterfaceC3678a.c)) {
            if (analyticEvent instanceof InterfaceC3678a.i) {
                this.analytics.mo41426h("Recovery Details", "Toggle", "Stress Monitor", "Breathwork Recovery", ((InterfaceC3678a.i) analyticEvent).getSegmentedControlId());
                return;
            } else {
                if (!(analyticEvent instanceof InterfaceC3678a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC3678a.e eVar = (InterfaceC3678a.e) analyticEvent;
                InterfaceC14515a.m41418i(this.analytics, null, "Dismiss CTA", null, "Link Workout", null, AbstractC25247g0.m73990Y(new C23465k("activityID", eVar.getActivityId()), new C23465k("activity_type", eVar.getActivityName()), new C23465k("source", "Activity Details")), 21, null);
                return;
            }
        }
        InterfaceC3678a.c cVar = (InterfaceC3678a.c) analyticEvent;
        DetailsEditComponent previousActivityDetails = cVar.getPreviousActivityDetails();
        String str = "";
        if (previousActivityDetails == null || (activityTypeInternalName = previousActivityDetails.getActivityTypeInternalName()) == null) {
            activityTypeInternalName = "";
        }
        DetailsEditComponent previousActivityDetails2 = cVar.getPreviousActivityDetails();
        if (previousActivityDetails2 == null || (endTimeSelector = previousActivityDetails2.getEndTimeSelector()) == null || (initialValue = endTimeSelector.getInitialValue()) == null) {
            initialValue = "";
        }
        DetailsEditComponent previousActivityDetails3 = cVar.getPreviousActivityDetails();
        if (previousActivityDetails3 != null && (startTimeSelector = previousActivityDetails3.getStartTimeSelector()) != null && (initialValue2 = startTimeSelector.getInitialValue()) != null) {
            str = initialValue2;
        }
        DetailsEditComponent previousActivityDetails4 = cVar.getPreviousActivityDetails();
        m11411b("Edit Activities, Edit, Reviewing Data", "Confirm", AbstractC2875y.m8299l(previousActivityDetails4 != null ? previousActivityDetails4.getActivityTypeInternalName() : null, " - Delete Activity Confirm"), "Activity - Delete - Confirm", AbstractC25247g0.m73990Y(new C23465k("activity", activityTypeInternalName), new C23465k("activityID", cVar.getActivityId()), new C23465k("type", cVar.getActivityType()), new C23465k("Previous.Activity", activityTypeInternalName), new C23465k("Previous.StartTime", str), new C23465k("Previous.EndTime", initialValue)));
    }
}
