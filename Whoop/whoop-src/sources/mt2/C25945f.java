package mt2;

import androidx.core.app.NotificationCompat;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import java.util.Locale;
import live.hms.video.media.tracks.HMSTrackSource;
import ls2.AbstractC24716a;
import ls2.C24717b;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mt2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lmt2/f;", "", "Leb/a0;", "composeNavController", "Lls2/b;", "analyticHelper", "", "planName", "category", "<init>", "(Leb/a0;Lls2/b;Ljava/lang/String;Ljava/lang/String;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Ljava/lang/Object;)V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "targetGoalType", "b", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", HMSTrackSource.SCREEN, "c", "(Ljava/lang/String;)V", "action", "d", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "Leb/a0;", "Lls2/b;", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25945f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 composeNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C24717b analyticHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String planName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: mt2.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102481a;

        static {
            int[] iArr = new int[TargetGoalType.values().length];
            try {
                iArr[TargetGoalType.ACTIVITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetGoalType.BEHAVIORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetGoalType.METRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102481a = iArr;
        }
    }

    public C25945f(AbstractC12939a0 composeNavController, C24717b analyticHelper, String planName, String str) {
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        AbstractC22676k.m65750j(planName, "planName");
        this.composeNavController = composeNavController;
        this.analyticHelper = analyticHelper;
        this.planName = planName;
        this.category = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m76783a(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC25946g.b) {
            AbstractC25946g.b bVar = (AbstractC25946g.b) event;
            TargetGoalType targetGoalType = bVar.getTargetGoalType();
            int i13 = targetGoalType == null ? -1 : a.f102481a[targetGoalType.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                m76784b(bVar.getTargetGoalType());
            } else {
                m76786d("Close", bVar.getTargetGoalType());
            }
            this.composeNavController.m36410z();
            return;
        }
        if (event instanceof AbstractC25946g.g) {
            m76786d("Edit Plan", ((AbstractC25946g.g) event).getTargetGoalType());
            AbstractC12939a0.m36374y(this.composeNavController, "SLIDER_CUSTOMIZATION", null, 6);
            return;
        }
        if (event instanceof AbstractC25946g.e) {
            String lowerCase = "Metrics".toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            m76785c(lowerCase);
            AbstractC12939a0.m36374y(this.composeNavController, "CONTRIBUTOR_SELECTION", null, 6);
            return;
        }
        if (event instanceof AbstractC25946g.a) {
            String lowerCase2 = "Activities".toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            m76785c(lowerCase2);
            AbstractC12939a0.m36374y(this.composeNavController, "ACTIVITY_SELECTION", null, 6);
            return;
        }
        if (event instanceof AbstractC25946g.c) {
            String lowerCase3 = "Behaviors".toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
            m76785c(lowerCase3);
            AbstractC12939a0.m36374y(this.composeNavController, "BEHAVIOR_SELECTION", null, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76784b(TargetGoalType targetGoalType) {
        String lowerCase;
        if (targetGoalType != null) {
            C24717b c24717b = this.analyticHelper;
            int i13 = a.f102481a[targetGoalType.ordinal()];
            if (i13 == 1) {
                lowerCase = "Activities".toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            } else if (i13 != 2) {
                lowerCase = "Metrics".toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = "Behaviors".toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            }
            c24717b.m72377q(new AbstractC24716a.d("Close", lowerCase));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76785c(String screen) {
        AbstractC22676k.m65750j(screen, "screen");
        this.analyticHelper.m72377q(new AbstractC24716a.h(screen, this.planName, this.category));
    }

    /* JADX INFO: renamed from: d */
    public final void m76786d(String action, TargetGoalType targetGoalType) {
        AbstractC22676k.m65750j(action, "action");
        if (targetGoalType != null) {
            this.analyticHelper.m72377q(new AbstractC24716a.i(action, targetGoalType.name()));
        }
    }
}
