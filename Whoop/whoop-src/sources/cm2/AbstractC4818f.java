package cm2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.trends.data.model.NavigationItemV3;
import com.whoop.trends.data.model.NavigationSectionV3;
import hy0.C17736e;
import java.util.ArrayList;
import java.util.List;
import or2.EnumC28166h0;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import x81.C38072d;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: cm2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "Lcom/whoop/trends/data/model/NavigationSectionV3;", "navSections", "Lor2/h0;", "currentGraphKey", "Lm91/u;", "b", "(Ljava/util/List;Lor2/h0;)Ljava/util/List;", "graphKey", "Ly71/g;", "a", "(Lor2/h0;)Ly71/g;", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4818f {

    /* JADX INFO: renamed from: cm2.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19827a;

        static {
            int[] iArr = new int[EnumC28166h0.values().length];
            try {
                iArr[EnumC28166h0.AVERAGE_HR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28166h0.BODY_COMPOSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC28166h0.CALORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC28166h0.DAY_STRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC28166h0.HOURS_V_NEED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC28166h0.HOURS_V_NEEDED_PERCENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC28166h0.HRV.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC28166h0.HR_ZONES_1_3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC28166h0.HR_ZONES_4_5.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC28166h0.HR_ZONES_ALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC28166h0.RECOVERY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC28166h0.RESPIRATORY_RATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC28166h0.RESTORATIVE_SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC28166h0.RESTORATIVE_SLEEP_PERCENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC28166h0.RHR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC28166h0.SLEEP_CONSISTENCY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC28166h0.SLEEP_DEBT_POST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC28166h0.SLEEP_EFFICIENCY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC28166h0.SLEEP_PERFORMANCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC28166h0.STEPS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC28166h0.STRENGTH_ACTIVITY_TIME.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC28166h0.TOTAL_VOLUME_LOAD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC28166h0.STRESS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC28166h0.STRESS_DURING_NON_STRAIN.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC28166h0.STRESS_DURING_SLEEP.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC28166h0.TIME_IN_BED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC28166h0.WEIGHT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC28166h0.PACE_OF_AGING.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC28166h0.VO2_MAX.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC28166h0.WHOOP_AGE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            f19827a = iArr;
        }
    }

    /* JADX INFO: renamed from: cm2.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f19828w = new b();

        /* JADX INFO: renamed from: a */
        public final long m15208a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15208a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f19829w = new c();

        /* JADX INFO: renamed from: a */
        public final long m15209a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15209a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C39274g m15206a(EnumC28166h0 graphKey) {
        AbstractC22676k.m65750j(graphKey, "graphKey");
        switch (a.f19827a[graphKey.ordinal()]) {
            case 1:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getHeartRate(), null, 2, null);
            case 2:
                return new C39274g(C38072d.f163053a.m121951d().getHealth().getSegmentalBodyComposition(), null, 2, null);
            case 3:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getCalories(), null, 2, null);
            case 4:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getStrain(), null, 2, null);
            case 5:
                return new C39274g(C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getHoursOfSleep(), null, 2, null);
            case 6:
                return new C39274g(C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getHoursOfSleep(), null, 2, null);
            case 7:
                return new C39274g(C38072d.f163053a.m121951d().getRecovery().getHrvOutline(), null, 2, null);
            case 8:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getHrZones3(), null, 2, null);
            case 9:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getHrZones4_5(), null, 2, null);
            case 10:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getHrZonesTraining(), null, 2, null);
            case 11:
                return new C39274g(C38072d.f163053a.m121951d().getRecovery().getRecovery(), null, 2, null);
            case 12:
                return new C39274g(C38072d.f163053a.m121951d().getRecovery().getRespiratoryRate(), null, 2, null);
            case 13:
                return new C39274g(C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getSleepCycle(), null, 2, null);
            case 14:
                return new C39274g(C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getSleepCycle(), null, 2, null);
            case 15:
                return new C39274g(C38072d.f163053a.m121951d().getRecovery().getRhr(), null, 2, null);
            case 16:
                return new C39274g(C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getConsistency(), null, 2, null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C39274g(C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getSleepDebt(), null, 2, null);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C39274g(C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getEfficiency(), null, 2, null);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C39274g(AbstractC25012a.m73369b(C38072d.f163053a), null, 2, null);
            case 20:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getSteps(), null, 2, null);
            case 21:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getTonnage(), null, 2, null);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getTotalVolumeLoad(), null, 2, null);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C39274g(C38072d.f163053a.m121951d().getVarious().getStressMonitor(), null, 2, null);
            case 24:
                return new C39274g(C38072d.f163053a.m121951d().getVarious().getNoUserInput(), null, 2, null);
            case 25:
                return new C39274g(AbstractC25012a.m73369b(C38072d.f163053a), null, 2, null);
            case 26:
                return new C39274g(C38072d.f163053a.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), null, 2, null);
            case 27:
                return new C39274g(C38072d.f163053a.m121951d().getHealth().getWeight(), null, 2, null);
            case 28:
                return new C39274g(C38072d.f163053a.m121951d().getHealth().getPaceOfAging(), null, 2, null);
            case 29:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getVo2Max(), null, 2, null);
            case 30:
                return new C39274g(C38072d.f163053a.m121951d().getHealth().getWhoopAge(), null, 2, null);
            default:
                return new C39274g(C38072d.f163053a.m121951d().getStrain().getStrain(), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List<InterfaceC25312u> m15207b(List<NavigationSectionV3> navSections, EnumC28166h0 currentGraphKey) {
        AbstractC22676k.m65750j(navSections, "navSections");
        AbstractC22676k.m65750j(currentGraphKey, "currentGraphKey");
        ArrayList arrayList = new ArrayList();
        for (NavigationSectionV3 navigationSectionV3 : navSections) {
            arrayList.add(new C17736e(null, null, AbstractC8693b.m21278l(navigationSectionV3.getSectionName()), 3, null));
            for (NavigationItemV3 navigationItemV3 : navigationSectionV3.getNavigationItems()) {
                arrayList.add(C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21278l(navigationItemV3.getName()), null, null, null, null, m15206a(navigationItemV3.getGraphKey()), null, null, null, null, null, null, null, navigationItemV3.getGraphKey() == currentGraphKey ? p745y81.Function1.m125323a(b.f19828w) : p745y81.Function1.m125323a(c.f19829w), false, false, null, false, null, null, navigationItemV3.getGraphKey(), false, null, 7331806, null));
            }
        }
        return arrayList;
    }
}
