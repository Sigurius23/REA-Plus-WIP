package st2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.WeeklyPlanSetupScreenModel;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: st2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lst2/a;", "", "<init>", "()V", NotificationCompat.CATEGORY_EVENT, "", "category", "Lcom/whoop/navigation/e;", "b", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/whoop/navigation/e;", "carouselPlacement", "a", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32995a {

    /* JADX INFO: renamed from: a */
    public static final C32995a f137390a = new C32995a();

    private C32995a() {
    }

    /* JADX INFO: renamed from: a */
    public final C9598e m104221a(Object event, String carouselPlacement, String category) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(carouselPlacement, "carouselPlacement");
        AbstractC22676k.m65750j(category, "category");
        C9598e c9598e = event instanceof C9598e ? (C9598e) event : null;
        if (c9598e != null) {
            NavigationScreenModel parameters = c9598e.getParameters();
            WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel = parameters instanceof WeeklyPlanSetupScreenModel ? (WeeklyPlanSetupScreenModel) parameters : null;
            if (weeklyPlanSetupScreenModel != null) {
                WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel2 = weeklyPlanSetupScreenModel;
                return C9598e.m23127b(c9598e, null, weeklyPlanSetupScreenModel2.copy((57343 & 1) != 0 ? weeklyPlanSetupScreenModel2.planName : null, (57343 & 2) != 0 ? weeklyPlanSetupScreenModel2.locked : false, (57343 & 4) != 0 ? weeklyPlanSetupScreenModel2.noPlanShowMetricSelection : false, (57343 & 8) != 0 ? weeklyPlanSetupScreenModel2.analyticsSource : null, (57343 & 16) != 0 ? weeklyPlanSetupScreenModel2.initialSelection : null, (57343 & 32) != 0 ? weeklyPlanSetupScreenModel2.date : null, (57343 & 64) != 0 ? weeklyPlanSetupScreenModel2.source : null, (57343 & 128) != 0 ? weeklyPlanSetupScreenModel2.presetPlanCategory : null, (57343 & 256) != 0 ? weeklyPlanSetupScreenModel2.planTitle : null, (57343 & 512) != 0 ? weeklyPlanSetupScreenModel2.description : null, (57343 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? weeklyPlanSetupScreenModel2.explanationTitle : null, (57343 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? weeklyPlanSetupScreenModel2.explanation : null, (57343 & 4096) != 0 ? weeklyPlanSetupScreenModel2.templateId : null, (57343 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? weeklyPlanSetupScreenModel2.category : category, (57343 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? weeklyPlanSetupScreenModel2.carouselPlacement : carouselPlacement, (57343 & 32768) != 0 ? weeklyPlanSetupScreenModel2.dismissalType : null), null, 5, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C9598e m104222b(Object event, String category) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(category, "category");
        C9598e c9598e = event instanceof C9598e ? (C9598e) event : null;
        if (c9598e != null) {
            NavigationScreenModel parameters = c9598e.getParameters();
            WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel = parameters instanceof WeeklyPlanSetupScreenModel ? (WeeklyPlanSetupScreenModel) parameters : null;
            if (weeklyPlanSetupScreenModel != null) {
                WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel2 = weeklyPlanSetupScreenModel;
                return C9598e.m23127b(c9598e, null, weeklyPlanSetupScreenModel2.copy((57343 & 1) != 0 ? weeklyPlanSetupScreenModel2.planName : null, (57343 & 2) != 0 ? weeklyPlanSetupScreenModel2.locked : false, (57343 & 4) != 0 ? weeklyPlanSetupScreenModel2.noPlanShowMetricSelection : false, (57343 & 8) != 0 ? weeklyPlanSetupScreenModel2.analyticsSource : null, (57343 & 16) != 0 ? weeklyPlanSetupScreenModel2.initialSelection : null, (57343 & 32) != 0 ? weeklyPlanSetupScreenModel2.date : null, (57343 & 64) != 0 ? weeklyPlanSetupScreenModel2.source : null, (57343 & 128) != 0 ? weeklyPlanSetupScreenModel2.presetPlanCategory : null, (57343 & 256) != 0 ? weeklyPlanSetupScreenModel2.planTitle : null, (57343 & 512) != 0 ? weeklyPlanSetupScreenModel2.description : null, (57343 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? weeklyPlanSetupScreenModel2.explanationTitle : null, (57343 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? weeklyPlanSetupScreenModel2.explanation : null, (57343 & 4096) != 0 ? weeklyPlanSetupScreenModel2.templateId : null, (57343 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? weeklyPlanSetupScreenModel2.category : category, (57343 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? weeklyPlanSetupScreenModel2.carouselPlacement : null, (57343 & 32768) != 0 ? weeklyPlanSetupScreenModel2.dismissalType : null), null, 5, null);
            }
        }
        return null;
    }
}
