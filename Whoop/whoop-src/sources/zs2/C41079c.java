package zs2;

import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import sw0.C33050g;
import ws2.AbstractC37616h;
import ws2.C37612d;
import ws2.C37615g;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: zs2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Lzs2/c;", "", "Lzs2/n;", "strainGoalViewStateReducer", "Lzs2/k;", "sleepGoalViewStateReducer", "Lzs2/l;", "sleepHoursViewStateReducer", "Lzs2/a;", "activityGoalViewStateReducer", "Lzs2/b;", "behaviorGoalViewStateReducer", "Lzs2/q;", "weightGoalViewStateReducer", "Lzs2/m;", "stepsGoalViewStateReducer", "Lzs2/j;", "sleepConsistencyViewStateReducer", "Lzs2/e;", "hrZoneOneToThreeGoalReducer", "Lzs2/d;", "hrZoneFourToFiveGoalReducer", "Lzs2/o;", "strengthTrainingTimeGoalReducer", "<init>", "(Lzs2/n;Lzs2/k;Lzs2/l;Lzs2/a;Lzs2/b;Lzs2/q;Lzs2/m;Lzs2/j;Lzs2/e;Lzs2/d;Lzs2/o;)V", "Lws2/d;", "domainResult", "", "showSavingOnButton", "Lys2/e;", "a", "(Lws2/d;Z)Lys2/e;", "b", "(Lws2/d;)Lys2/e;", "Lzs2/n;", "Lzs2/k;", "c", "Lzs2/l;", "d", "Lzs2/a;", "e", "Lzs2/b;", "f", "Lzs2/q;", "g", "Lzs2/m;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lzs2/j;", "i", "Lzs2/e;", "j", "Lzs2/d;", "k", "Lzs2/o;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41079c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C41090n strainGoalViewStateReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C41087k sleepGoalViewStateReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C41088l sleepHoursViewStateReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C41077a activityGoalViewStateReducer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C41078b behaviorGoalViewStateReducer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C41093q weightGoalViewStateReducer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C41089m stepsGoalViewStateReducer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C41086j sleepConsistencyViewStateReducer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C41081e hrZoneOneToThreeGoalReducer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C41080d hrZoneFourToFiveGoalReducer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C41091o strengthTrainingTimeGoalReducer;

    /* JADX INFO: renamed from: zs2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f177117a;

        static {
            int[] iArr = new int[TargetGoalType.values().length];
            try {
                iArr[TargetGoalType.STEPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetGoalType.SLEEP_PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetGoalType.SLEEP_CONSISTENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TargetGoalType.SLEEP_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TargetGoalType.STRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TargetGoalType.ACTIVITIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TargetGoalType.BEHAVIORS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TargetGoalType.WEIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_ONE_TO_THREE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_FOUR_TO_FIVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TargetGoalType.STRENGTH_TRAINING_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f177117a = iArr;
        }
    }

    public C41079c(C41090n strainGoalViewStateReducer, C41087k sleepGoalViewStateReducer, C41088l sleepHoursViewStateReducer, C41077a activityGoalViewStateReducer, C41078b behaviorGoalViewStateReducer, C41093q weightGoalViewStateReducer, C41089m stepsGoalViewStateReducer, C41086j sleepConsistencyViewStateReducer, C41081e hrZoneOneToThreeGoalReducer, C41080d hrZoneFourToFiveGoalReducer, C41091o strengthTrainingTimeGoalReducer) {
        AbstractC22676k.m65750j(strainGoalViewStateReducer, "strainGoalViewStateReducer");
        AbstractC22676k.m65750j(sleepGoalViewStateReducer, "sleepGoalViewStateReducer");
        AbstractC22676k.m65750j(sleepHoursViewStateReducer, "sleepHoursViewStateReducer");
        AbstractC22676k.m65750j(activityGoalViewStateReducer, "activityGoalViewStateReducer");
        AbstractC22676k.m65750j(behaviorGoalViewStateReducer, "behaviorGoalViewStateReducer");
        AbstractC22676k.m65750j(weightGoalViewStateReducer, "weightGoalViewStateReducer");
        AbstractC22676k.m65750j(stepsGoalViewStateReducer, "stepsGoalViewStateReducer");
        AbstractC22676k.m65750j(sleepConsistencyViewStateReducer, "sleepConsistencyViewStateReducer");
        AbstractC22676k.m65750j(hrZoneOneToThreeGoalReducer, "hrZoneOneToThreeGoalReducer");
        AbstractC22676k.m65750j(hrZoneFourToFiveGoalReducer, "hrZoneFourToFiveGoalReducer");
        AbstractC22676k.m65750j(strengthTrainingTimeGoalReducer, "strengthTrainingTimeGoalReducer");
        this.strainGoalViewStateReducer = strainGoalViewStateReducer;
        this.sleepGoalViewStateReducer = sleepGoalViewStateReducer;
        this.sleepHoursViewStateReducer = sleepHoursViewStateReducer;
        this.activityGoalViewStateReducer = activityGoalViewStateReducer;
        this.behaviorGoalViewStateReducer = behaviorGoalViewStateReducer;
        this.weightGoalViewStateReducer = weightGoalViewStateReducer;
        this.stepsGoalViewStateReducer = stepsGoalViewStateReducer;
        this.sleepConsistencyViewStateReducer = sleepConsistencyViewStateReducer;
        this.hrZoneOneToThreeGoalReducer = hrZoneOneToThreeGoalReducer;
        this.hrZoneFourToFiveGoalReducer = hrZoneFourToFiveGoalReducer;
        this.strengthTrainingTimeGoalReducer = strengthTrainingTimeGoalReducer;
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC39758e m133387a(C37612d domainResult, boolean showSavingOnButton) {
        UUID planId = domainResult.getResponse().getPlanId();
        C37615g progressResult = domainResult.getProgressResult();
        C33050g currentBottomSheet = domainResult.getCurrentBottomSheet();
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = domainResult.getResponse().getScreens().get(progressResult.getCurrentStepIndex());
        switch (a.f177117a[weeklyPlanCustomizationScreenModel.getGoal().ordinal()]) {
            case 1:
                return this.stepsGoalViewStateReducer.m133410a(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            case 2:
                return this.sleepGoalViewStateReducer.m133404a(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            case 3:
                return this.sleepConsistencyViewStateReducer.m133401a(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            case 4:
                return this.sleepHoursViewStateReducer.m133407a(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            case 5:
                return this.strainGoalViewStateReducer.m133414a(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            case 6:
                return this.activityGoalViewStateReducer.m133380b(planId, weeklyPlanCustomizationScreenModel, currentBottomSheet, progressResult, showSavingOnButton);
            case 7:
                return this.behaviorGoalViewStateReducer.m133384c(planId, weeklyPlanCustomizationScreenModel, currentBottomSheet, progressResult, showSavingOnButton);
            case 8:
                return this.weightGoalViewStateReducer.m133427c(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            case 9:
                return this.hrZoneOneToThreeGoalReducer.m133392i(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            case 10:
                return this.hrZoneFourToFiveGoalReducer.m133392i(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            case 11:
                return this.strengthTrainingTimeGoalReducer.m133392i(planId, weeklyPlanCustomizationScreenModel, progressResult, showSavingOnButton);
            default:
                throw new IllegalStateException(("Type " + weeklyPlanCustomizationScreenModel.getGoal() + " not supported in this context.").toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC39758e m133388b(C37612d domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC37616h state = domainResult.getState();
        if (AbstractC22676k.m65745e(state, AbstractC37616h.c.f160937a)) {
            return AbstractC39758e.c.f171182a;
        }
        if (AbstractC22676k.m65745e(state, AbstractC37616h.i.f160944a)) {
            return m133387a(domainResult, false);
        }
        if (state instanceof AbstractC37616h.h) {
            return ((AbstractC37616h.h) domainResult.getState()).getShowFullScreenSave() ? AbstractC39758e.h.f171189a : m133387a(domainResult, true);
        }
        if (AbstractC22676k.m65745e(state, AbstractC37616h.g.f160942a)) {
            return new AbstractC39758e.g(domainResult.getProgressResult().getIsAtEnd());
        }
        if (state instanceof AbstractC37616h.e) {
            return ((AbstractC37616h.e) domainResult.getState()).getShowFullScreenSave() ? AbstractC39758e.e.f171184a : m133387a(domainResult, true);
        }
        if (AbstractC22676k.m65745e(state, AbstractC37616h.d.f160938a)) {
            return new AbstractC39758e.d(domainResult.getProgressResult().getIsAtEnd());
        }
        if (state instanceof AbstractC37616h.a) {
            return new AbstractC39758e.a(((AbstractC37616h.a) domainResult.getState()).getId(), ((AbstractC37616h.a) domainResult.getState()).getTargetGoalType(), domainResult.getProgressResult().getCurrentStepIndex());
        }
        if (state instanceof AbstractC37616h.b) {
            return new AbstractC39758e.b(((AbstractC37616h.b) domainResult.getState()).m120808a());
        }
        if (state instanceof AbstractC37616h.f) {
            return new AbstractC39758e.f(((AbstractC37616h.f) domainResult.getState()).getId(), ((AbstractC37616h.f) domainResult.getState()).getConfirmTarget(), domainResult.getProgressResult().getCurrentStepIndex());
        }
        throw new NoWhenBranchMatchedException();
    }
}
