package ls2;

import androidx.core.app.NotificationCompat;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ls2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J3\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u0019\u0010\u001f\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0012J'\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u0012J!\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0014J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\u0014J#\u0010.\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b1\u0010/J/\u00106\u001a\u00020\b2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\b2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020'2\u0006\u00105\u001a\u00020\u0019H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010/J\u001f\u0010=\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010<\u001a\u00020\rH\u0002¢\u0006\u0004\b=\u0010/J)\u0010>\u001a\u00020\b2\u0006\u0010<\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b>\u0010?JU\u0010C\u001a\u00020\b2\u0006\u0010@\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0018\b\u0002\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010E¨\u0006F"}, m65681d2 = {"Lls2/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lls2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "q", "(Lls2/a;)V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "goalType", "", "c", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Ljava/lang/String;", "action", "p", "(Ljava/lang/String;)V", "s", "()V", "source", "t", "u", "label", "", "weeksInPast", "category", "x", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "d", "i", WeeklyPlanApiKt.GOAL, "e", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Ljava/lang/String;)V", "r", "goalsCompleted", "v", "(ILjava/lang/String;)V", "", "enableDialog", "b", "(Z)V", "n", "a", "carouselPlacement", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/lang/String;)V", "planName", "o", "id", "enabled", "avoid", "days", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;ZZI)V", "g", "(Ljava/lang/String;ZI)V", "target", "k", HMSTrackSource.SCREEN, "f", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "eventName", "", "otherProperties", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lfi0/a;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24717b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final int f96695c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: ls2.b$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00102\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\nR\u0014\u00103\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\nR\u0014\u00104\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\nR\u0014\u00105\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\nR\u0014\u00106\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\nR\u0014\u00107\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\nR\u0014\u00108\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\nR\u0014\u00109\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\nR\u0014\u0010:\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\nR\u0014\u0010;\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\n¨\u0006<"}, m65681d2 = {"Lls2/b$a;", "", "<init>", "()V", "", "index", "", "a", "(I)Ljava/lang/String;", "WEEKLY_RECAP", "Ljava/lang/String;", "THIS_WEEK", "EDIT_PLAN", "DISMISS", "SLEEP", "SLEEP_CONSISTENCY", "SLEEP_HOURS", "STRAIN", "ACTIVITIES", "BEHAVIORS", "METRICS", "CREATE_PLAN", "FAIL_TO_SAVE", "LOCKED", "UNLOCKED", "EMPTY_STATE", "ACTIVE_PLAN", "CUSTOMIZE", "START", "FAIL_TO_START", "COACHING", "CANCEL_PLAN", "PLAN_SUMMARY", "UPDATE_ALARM", "VIEW_TAB", "VIEW_OVERVIEW", "VALUE", "CATEGORY", "JAN_JUMP", "JAN_JUMP_RECAP", "WEIGHT", "STEPS", "METRIC", "EDIT", "ADD", "REMOVE", "SAVE", "CLOSE", "HR_ZONES_ONE_TO_THREE", "HR_ZONES_FOUR_TO_FIVE", "STRENGTH_TRAINING_TIME", "CHANGE_MY_PLAN", "CONTINUE_PLAN", "CAROUSEL_PLACEMENT", "FIRST", "SECOND", "THIRD", "AI_SUGGESTED_PLAN", "WEEKLY_PLAN_TILE_ON_HOME", "JJ_TILE_ON_WEEKLY_PLAN", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m72378a(int index) {
            if (index == 0) {
                return "first";
            }
            if (index != 1) {
                return index != 2 ? String.valueOf(index) : "third";
            }
            return "second";
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ls2.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f96697a;

        static {
            int[] iArr = new int[TargetGoalType.values().length];
            try {
                iArr[TargetGoalType.SLEEP_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetGoalType.SLEEP_CONSISTENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetGoalType.SLEEP_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TargetGoalType.STRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TargetGoalType.BEHAVIORS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TargetGoalType.ACTIVITIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TargetGoalType.WEIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TargetGoalType.STEPS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TargetGoalType.METRIC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_ONE_TO_THREE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_FOUR_TO_FIVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TargetGoalType.STRENGTH_TRAINING_TIME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f96697a = iArr;
        }
    }

    public C24717b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m72354a() {
        m72364l("Sleep Coach - Save Sleep Goal", "Weekly Plan", "Deny", "Link", AbstractC25247g0.m73990Y(new C23465k("object", "Sleep Goal"), new C23465k("source", "Weekly Plan")));
    }

    /* JADX INFO: renamed from: b */
    private final void m72355b(boolean enableDialog) {
        m72364l("Sleep Coach - Save Sleep Goal", "Weekly Plan", "Press", enableDialog ? "Prompt" : "", AbstractC31061c.m95645u("source", enableDialog ? "Weekly Plan" : ""));
    }

    /* JADX INFO: renamed from: d */
    private final void m72356d() {
        m72365m(this, "Weekly Plan", "Create Plan", "Press", "Start", null, 16, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m72357e(TargetGoalType goal, String action, String source) {
        m72364l("Weekly Plan", "Create Plan", action, m72376c(goal), AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: f */
    private final void m72358f(String action, String screen) {
        m72365m(this, "Weekly Plan", null, action, screen, null, 18, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m72359g(String id4, boolean enabled, int days) {
        m72364l("Weekly Plan", id4, enabled ? "Enable" : "Disable", "activities", AbstractC25247g0.m73989X(new C23465k("value", Integer.valueOf(days))));
    }

    /* JADX INFO: renamed from: h */
    private final void m72360h(String id4, boolean enabled, boolean avoid, int days) {
        m72364l("Weekly Plan", id4, enabled ? "Enable" : "Disable", "behaviors", AbstractC25247g0.m73990Y(new C23465k("avoid", Boolean.valueOf(avoid)), new C23465k("value", Integer.valueOf(days))));
    }

    /* JADX INFO: renamed from: i */
    private final void m72361i(String label) {
        m72365m(this, "Weekly Plan", "Edit Plan", "Press", label, null, 16, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m72362j(String screen, String planName, String category) {
        if (category == null) {
            category = "Hub and Spoke";
        }
        m72364l("Weekly Plan", category, "Edit", screen, AbstractC31061c.m95645u("source", planName));
    }

    /* JADX INFO: renamed from: k */
    private final void m72363k(String action, String target) {
        String lowerCase = "Metrics".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        m72365m(this, "Weekly Plan", null, action, lowerCase, AbstractC25247g0.m73989X(new C23465k("source", target)), 2, null);
    }

    /* JADX INFO: renamed from: l */
    private final void m72364l(String eventName, String category, String action, String label, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41428k(category, action, label, eventName, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m72365m(C24717b c24717b, String str, String str2, String str3, String str4, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            map = null;
        }
        c24717b.m72364l(str, str2, str3, str4, map);
    }

    /* JADX INFO: renamed from: n */
    private final void m72366n() {
        m72364l("Sleep Coach - Save Sleep Goal", "Weekly Plan", "Accept", "Link", AbstractC25247g0.m73990Y(new C23465k("object", "Sleep Goal"), new C23465k("source", "Weekly Plan")));
    }

    /* JADX INFO: renamed from: o */
    private final void m72367o(String planName, String category) {
        if (category == null) {
            category = "Hub and Spoke";
        }
        m72365m(this, "Weekly Plan", category, "Save", null, AbstractC31061c.m95645u("value", planName), 8, null);
    }

    /* JADX INFO: renamed from: p */
    private final void m72368p(String action) {
        m72365m(this, "Weekly Plan", "Update Alarm", action, null, null, 24, null);
    }

    /* JADX INFO: renamed from: r */
    private final void m72369r(String label) {
        m72365m(this, "Weekly Plan", "Weekly Recap", "Press", label, null, 16, null);
    }

    /* JADX INFO: renamed from: s */
    private final void m72370s() {
        m72365m(this, "Weekly Plan", "Cancel Plan", "Press", null, null, 24, null);
    }

    /* JADX INFO: renamed from: t */
    private final void m72371t(String source) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Source", source);
        m72365m(this, "Weekly Plan", "Edit Plan", "Press", null, linkedHashMap, 8, null);
    }

    /* JADX INFO: renamed from: u */
    private final void m72372u() {
        m72365m(this, "Weekly Plan", "Edit Plan", "View", null, null, 24, null);
    }

    /* JADX INFO: renamed from: v */
    private final void m72373v(int goalsCompleted, String category) {
        Map mapM73989X = AbstractC25247g0.m73989X(new C23465k("Value", Integer.valueOf(goalsCompleted)));
        if (category == null) {
            category = "Weekly Recap";
        }
        m72365m(this, "Weekly Plan", category, "View", null, mapM73989X, 8, null);
    }

    /* JADX INFO: renamed from: w */
    private final void m72374w(String category, String carouselPlacement) {
        if (category == null) {
            category = "Hub and Spoke";
        }
        m72365m(this, "Weekly Plan", category, "View", null, carouselPlacement != null ? AbstractC31061c.m95645u("carousel_placement", carouselPlacement) : null, 8, null);
    }

    /* JADX INFO: renamed from: x */
    private final void m72375x(String label, int weeksInPast, String source, String category) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Value", Integer.valueOf(weeksInPast));
        if (source != null) {
            linkedHashMap.put("Source", source);
        }
        if (category != null) {
            linkedHashMap.put("category", category);
        }
        m72364l("Weekly Plan", "Plan Summary", "View Overview", label, linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public final String m72376c(TargetGoalType goalType) {
        AbstractC22676k.m65750j(goalType, "goalType");
        switch (b.f96697a[goalType.ordinal()]) {
            case 1:
                return "Sleep";
            case 2:
                return "Sleep Consistency";
            case 3:
                return "Hours of Sleep";
            case 4:
                return "Strain";
            case 5:
                return "Behaviors";
            case 6:
                return "Activities";
            case 7:
                return "Weight";
            case 8:
                return "Steps";
            case 9:
                return "Metric";
            case 10:
                return "Heart Rate Zones 1-3";
            case 11:
                return "Heart Rate Zones 4-5";
            case 12:
                return "Strength Training Time";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m72377q(AbstractC24716a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC24716a.t) {
            AbstractC24716a.t tVar = (AbstractC24716a.t) event;
            m72375x(tVar.getLabel(), tVar.getWeeksInPast(), tVar.getSource(), tVar.getCategory());
            return;
        }
        if (event instanceof AbstractC24716a.a) {
            m72355b(((AbstractC24716a.a) event).getEnableDialog());
            return;
        }
        if (event.equals(AbstractC24716a.l.f96679a)) {
            m72366n();
            return;
        }
        if (event.equals(AbstractC24716a.k.f96678a)) {
            m72354a();
            return;
        }
        if (event instanceof AbstractC24716a.r) {
            AbstractC24716a.r rVar = (AbstractC24716a.r) event;
            m72373v(rVar.getGoalsCompleted(), rVar.getCategory());
            return;
        }
        if (event instanceof AbstractC24716a.j) {
            m72369r(((AbstractC24716a.j) event).getLabel());
            return;
        }
        if (event instanceof AbstractC24716a.c) {
            AbstractC24716a.c cVar = (AbstractC24716a.c) event;
            m72357e(cVar.getCom.whoop.weeklyplan.api.WeeklyPlanApiKt.GOAL java.lang.String(), cVar.getAction(), cVar.getSource());
            return;
        }
        if (event instanceof AbstractC24716a.g) {
            m72361i(((AbstractC24716a.g) event).getLabel());
            return;
        }
        if (event.equals(AbstractC24716a.b.f96658a)) {
            m72356d();
            return;
        }
        if (event instanceof AbstractC24716a.p) {
            m72371t(((AbstractC24716a.p) event).getSource());
            return;
        }
        if (event.equals(AbstractC24716a.o.f96683a)) {
            m72370s();
            return;
        }
        if (event instanceof AbstractC24716a.n) {
            m72368p(((AbstractC24716a.n) event).getAction());
            return;
        }
        if (event.equals(AbstractC24716a.q.f96685a)) {
            m72372u();
            return;
        }
        if (event instanceof AbstractC24716a.s) {
            AbstractC24716a.s sVar = (AbstractC24716a.s) event;
            m72374w(sVar.getCategory(), sVar.getCarouselPlacement());
            return;
        }
        if (event instanceof AbstractC24716a.m) {
            AbstractC24716a.m mVar = (AbstractC24716a.m) event;
            m72367o(mVar.getPlanName(), mVar.getCategory());
            return;
        }
        if (event instanceof AbstractC24716a.f) {
            AbstractC24716a.f fVar = (AbstractC24716a.f) event;
            m72360h(fVar.getId(), fVar.getEnabled(), fVar.getAvoid(), fVar.getDays());
            return;
        }
        if (event instanceof AbstractC24716a.e) {
            AbstractC24716a.e eVar = (AbstractC24716a.e) event;
            m72359g(eVar.getId(), eVar.getEnabled(), eVar.getDays());
            return;
        }
        if (event instanceof AbstractC24716a.i) {
            AbstractC24716a.i iVar = (AbstractC24716a.i) event;
            m72363k(iVar.getAction(), iVar.getTarget());
        } else if (event instanceof AbstractC24716a.d) {
            AbstractC24716a.d dVar = (AbstractC24716a.d) event;
            m72358f(dVar.getAction(), dVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
        } else {
            if (!(event instanceof AbstractC24716a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC24716a.h hVar = (AbstractC24716a.h) event;
            m72362j(hVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), hVar.getPlanName(), hVar.getCategory());
        }
    }
}
