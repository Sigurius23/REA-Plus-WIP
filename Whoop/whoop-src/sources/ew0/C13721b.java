package ew0;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import bw0.C3679b;
import bw0.InterfaceC3678a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.weightlifting.data.domain.WeightliftingWorkoutKt;
import d13.AbstractC11478a;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import java.util.List;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import s01.EnumC32045a;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ew0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lew0/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lbw0/b;", "analyticsManager", "", "activityId", "Lcom/whoop/navigation/ActivityDetailType;", "activityType", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Leb/a0;Lj02/o0;Lbw0/b;Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lew0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lew0/a;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Lbw0/b;", "d", "Ljava/lang/String;", "e", "Lcom/whoop/navigation/ActivityDetailType;", "f", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13721b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C3679b analyticsManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String activityId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ActivityDetailType activityType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: ew0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48724a;

        static {
            int[] iArr = new int[ActivityDetailType.values().length];
            try {
                iArr[ActivityDetailType.CARDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityDetailType.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48724a = iArr;
        }
    }

    public C13721b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, C3679b analyticsManager, String activityId, ActivityDetailType activityType, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(activityId, "activityId");
        AbstractC22676k.m65750j(activityType, "activityType");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navController = navController;
        this.navigator = navigator;
        this.analyticsManager = analyticsManager;
        this.activityId = activityId;
        this.activityType = activityType;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final void m38873a(AbstractC13720a event) {
        String string;
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC13720a.a.f48702a)) {
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC13720a.h) {
            this.analyticsManager.m11414e(new InterfaceC3678a.i("", "", ((AbstractC13720a.h) event).getSegmentedControlId()));
            return;
        }
        if (event.equals(AbstractC13720a.f.f48714a)) {
            if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_HOME_TILE_BEHAVIOR_IMPACTS)) {
                AbstractC12939a0 abstractC12939a0 = this.navController;
                Uri uri = Uri.parse("android-app://com.whoop/behavior_impact?source=Recovery Details");
                abstractC12939a0.m36404s(AbstractC11478a.m30854f(uri, "uri", uri, null, null));
                return;
            } else {
                AbstractC12939a0 abstractC12939a1 = this.navController;
                Uri uri2 = Uri.parse("android-app://com.whoop/coaching?tab=1&source=Recovery Details");
                abstractC12939a1.m36404s(AbstractC11478a.m30854f(uri2, "uri", uri2, null, null));
                return;
            }
        }
        if (event instanceof AbstractC13720a.g) {
            AbstractC13720a.g gVar = (AbstractC13720a.g) event;
            if (AbstractC22676k.m65745e(gVar.getSource(), "Edit Activity")) {
                this.navController.m36410z();
            }
            String strM95640p = AbstractC31061c.m95640p("whoop://strength.builder?screen=linkWorkoutScreen&activityId=", gVar.getActivityId(), "&source=", gVar.getSource());
            AbstractC12939a0 abstractC12939a2 = this.navController;
            Uri uri3 = Uri.parse(strM95640p);
            abstractC12939a2.m36404s(AbstractC11478a.m30854f(uri3, "uri", uri3, null, null));
            return;
        }
        if (event instanceof AbstractC13720a.e) {
            AbstractC13720a.e eVar = (AbstractC13720a.e) event;
            if (AbstractC39414r.m125890i0(eVar.getExerciseId())) {
                return;
            }
            this.navigator.mo59393b(new AbstractC21155m0.e1(eVar.getExerciseId(), false, "Activity Details", null, eVar.getIsExerciseDetailsV2ExperimentEnabled(), 8, null));
            return;
        }
        if (!(event instanceof AbstractC13720a.c)) {
            if (event instanceof AbstractC13720a.d) {
                AbstractC13720a.d dVar = (AbstractC13720a.d) event;
                this.navigator.mo59393b(new AbstractC21155m0.c1(dVar.getStartDate(), dVar.getEndDate(), dVar.getActivityInternalName(), dVar.getActivityType(), dVar.getActivityId(), null, false, 96, null));
                return;
            } else {
                if (!(event instanceof AbstractC13720a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.navigator.mo59392a(((AbstractC13720a.b) event).getAction());
                return;
            }
        }
        List listM118959K = AbstractC37056f.m118959K("powerlifting", "weightlifting", WeightliftingWorkoutKt.WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE);
        InterfaceC21159o0 interfaceC21159o0 = this.navigator;
        AbstractC13720a.c cVar = (AbstractC13720a.c) event;
        String message = cVar.getMessage();
        String str = this.activityId;
        if (listM118959K.contains(cVar.getActivityName())) {
            string = EnumC32045a.WEIGHTLIFTING_ACTIVITY.toString();
        } else {
            int i13 = a.f48724a[this.activityType.ordinal()];
            EnumC32045a enumC32045a = (i13 == 1 || i13 != 2) ? EnumC32045a.STRAIN_ACTIVITY : EnumC32045a.RECOVERY_ACTIVITY;
            string = enumC32045a.toString();
        }
        interfaceC21159o0.mo59393b(new AbstractC21155m0.z(null, null, message, str, "VoW_Activity_Details", string, null, null, false, null, null, null, 4035, null));
    }
}
