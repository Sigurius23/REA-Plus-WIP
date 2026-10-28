package ls2;

import c13.AbstractC3855a;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import live.hms.video.media.tracks.HMSTrackSource;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: ls2.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0014\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0014\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, m65681d2 = {"Lls2/a;", "", "<init>", "()V", "t", "a", "l", "k", "n", "p", "q", "o", "b", "g", "c", "r", "j", "s", "m", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "i", "e", "d", "Lls2/a$a;", "Lls2/a$b;", "Lls2/a$c;", "Lls2/a$d;", "Lls2/a$e;", "Lls2/a$f;", "Lls2/a$g;", "Lls2/a$h;", "Lls2/a$i;", "Lls2/a$j;", "Lls2/a$k;", "Lls2/a$l;", "Lls2/a$m;", "Lls2/a$n;", "Lls2/a$o;", "Lls2/a$p;", "Lls2/a$q;", "Lls2/a$r;", "Lls2/a$s;", "Lls2/a$t;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24716a {

    /* JADX INFO: renamed from: ls2.a$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lls2/a$a;", "Lls2/a;", "", "enableDialog", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean enableDialog;

        public a(boolean z4) {
            super(null);
            this.enableDialog = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnableDialog() {
            return this.enableDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.enableDialog == ((a) other).enableDialog;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enableDialog);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ConfirmSleepGoal(enableDialog=", ")", this.enableDialog);
        }
    }

    /* JADX INFO: renamed from: ls2.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lls2/a$b;", "Lls2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC24716a {

        /* JADX INFO: renamed from: a */
        public static final b f96658a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ls2.a$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lls2/a$c;", "Lls2/a;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", WeeklyPlanApiKt.GOAL, "", "action", "source", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "b", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "Ljava/lang/String;", "c", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TargetGoalType goal;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TargetGoalType goal, String action, String source) {
            super(null);
            AbstractC22676k.m65750j(goal, "goal");
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(source, "source");
            this.goal = goal;
            this.action = action;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TargetGoalType getGoal() {
            return this.goal;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.goal == cVar.goal && AbstractC22676k.m65745e(this.action, cVar.action) && AbstractC22676k.m65745e(this.source, cVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC11266d.m30450d(this.goal.hashCode() * 31, 31, this.action);
        }

        public String toString() {
            TargetGoalType targetGoalType = this.goal;
            String str = this.action;
            String str2 = this.source;
            StringBuilder sb4 = new StringBuilder("CustomizeGoalSetUp(goal=");
            sb4.append(targetGoalType);
            sb4.append(", action=");
            sb4.append(str);
            sb4.append(", source=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }

        public /* synthetic */ c(TargetGoalType targetGoalType, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(targetGoalType, str, (i13 & 4) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: ls2.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lls2/a$d;", "Lls2/a;", "", "action", HMSTrackSource.SCREEN, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String action, String screen) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(screen, "screen");
            this.action = action;
            this.screen = screen;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.action, dVar.action) && AbstractC22676k.m65745e(this.screen, dVar.screen);
        }

        public int hashCode() {
            return this.screen.hashCode() + (this.action.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("EditActivitiesBehaviorsMetrics(action=", this.action, ", screen=", this.screen, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$e */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lls2/a$e;", "Lls2/a;", "", "id", "", "enabled", "", "days", "<init>", "(Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean enabled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int days;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String id4, boolean z4, int i13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.enabled = z4;
            this.days = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDays() {
            return this.days;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.id, eVar.id) && this.enabled == eVar.enabled && this.days == eVar.days;
        }

        public int hashCode() {
            return Integer.hashCode(this.days) + AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.enabled);
        }

        public String toString() {
            String str = this.id;
            boolean z4 = this.enabled;
            return AbstractC18489d0.m53371l(AbstractC25012a.m73379l("EditActivityGoal(id=", str, ", enabled=", ", days=", z4), this.days, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001b"}, m65681d2 = {"Lls2/a$f;", "Lls2/a;", "", "id", "", "enabled", "avoid", "", "days", "<init>", "(Ljava/lang/String;ZZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "c", "()Z", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean enabled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean avoid;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int days;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String id4, boolean z4, boolean z13, int i13) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            this.enabled = z4;
            this.avoid = z13;
            this.days = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAvoid() {
            return this.avoid;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getDays() {
            return this.days;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.id, fVar.id) && this.enabled == fVar.enabled && this.avoid == fVar.avoid && this.days == fVar.days;
        }

        public int hashCode() {
            return Integer.hashCode(this.days) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.id.hashCode() * 31, 31, this.enabled), 31, this.avoid);
        }

        public String toString() {
            String str = this.id;
            boolean z4 = this.enabled;
            boolean z13 = this.avoid;
            int i13 = this.days;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("EditBehaviorGoal(id=", str, ", enabled=", ", avoid=", z4);
            sbM73379l.append(z13);
            sbM73379l.append(", days=");
            sbM73379l.append(i13);
            sbM73379l.append(")");
            return sbM73379l.toString();
        }
    }

    /* JADX INFO: renamed from: ls2.a$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lls2/a$g;", "Lls2/a;", "", "label", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        public g(String str) {
            super(null);
            this.label = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.label, ((g) other).label);
        }

        public int hashCode() {
            String str = this.label;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("EditOrAddGoal(label=", this.label, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lls2/a$h;", "Lls2/a;", "", HMSTrackSource.SCREEN, "planName", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String planName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String screen, String planName, String str) {
            super(null);
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(planName, "planName");
            this.screen = screen;
            this.planName = planName;
            this.category = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlanName() {
            return this.planName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.screen, hVar.screen) && AbstractC22676k.m65745e(this.planName, hVar.planName) && AbstractC22676k.m65745e(this.category, hVar.category);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.screen.hashCode() * 31, 31, this.planName);
            String str = this.category;
            return iM30450d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.category, ")", AbstractC11895b.m32001t("EditPlanDetails(screen=", this.screen, ", planName=", this.planName, ", category="));
        }
    }

    /* JADX INFO: renamed from: ls2.a$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lls2/a$i;", "Lls2/a;", "", "action", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String action, String target) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(target, "target");
            this.action = action;
            this.target = target;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.action, iVar.action) && AbstractC22676k.m65745e(this.target, iVar.target);
        }

        public int hashCode() {
            return this.target.hashCode() + (this.action.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("EditTargetGoal(action=", this.action, ", target=", this.target, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lls2/a$j;", "Lls2/a;", "", "label", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String label) {
            super(null);
            AbstractC22676k.m65750j(label, "label");
            this.label = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.label, ((j) other).label);
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("EndOfWeekRecapAction(label=", this.label, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lls2/a$k;", "Lls2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC24716a {

        /* JADX INFO: renamed from: a */
        public static final k f96678a = new k();

        private k() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ls2.a$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lls2/a$l;", "Lls2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC24716a {

        /* JADX INFO: renamed from: a */
        public static final l f96679a = new l();

        private l() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ls2.a$m */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lls2/a$m;", "Lls2/a;", "", "planName", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String planName, String str) {
            super(null);
            AbstractC22676k.m65750j(planName, "planName");
            this.planName = planName;
            this.category = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlanName() {
            return this.planName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.planName, mVar.planName) && AbstractC22676k.m65745e(this.category, mVar.category);
        }

        public int hashCode() {
            int iHashCode = this.planName.hashCode() * 31;
            String str = this.category;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("SavePlanDetailsV2(planName=", this.planName, ", category=", this.category, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$n */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lls2/a$n;", "Lls2/a;", "", "action", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.action, ((n) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SeeAlarmOverrideDialog(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lls2/a$o;", "Lls2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC24716a {

        /* JADX INFO: renamed from: a */
        public static final o f96683a = new o();

        private o() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ls2.a$p */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lls2/a$p;", "Lls2/a;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String source) {
            super(null);
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && AbstractC22676k.m65745e(this.source, ((p) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ViewEditPlan(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lls2/a$q;", "Lls2/a;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC24716a {

        /* JADX INFO: renamed from: a */
        public static final q f96685a = new q();

        private q() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ls2.a$r */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lls2/a$r;", "Lls2/a;", "", "goalsCompleted", "", "category", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int goalsCompleted;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String category;

        public r(int i13, String str) {
            super(null);
            this.goalsCompleted = i13;
            this.category = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getGoalsCompleted() {
            return this.goalsCompleted;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return this.goalsCompleted == rVar.goalsCompleted && AbstractC22676k.m65745e(this.category, rVar.category);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.goalsCompleted) * 31;
            String str = this.category;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC30007c.m91838h(this.goalsCompleted, "ViewEndOfWeekRecap(goalsCompleted=", ", category=", this.category, ")");
        }

        public /* synthetic */ r(int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, (i14 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: ls2.a$s */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lls2/a$s;", "Lls2/a;", "", "category", "carouselPlacement", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String category;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String carouselPlacement;

        public s(String str, String str2) {
            super(null);
            this.category = str;
            this.carouselPlacement = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCarouselPlacement() {
            return this.carouselPlacement;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return AbstractC22676k.m65745e(this.category, sVar.category) && AbstractC22676k.m65745e(this.carouselPlacement, sVar.carouselPlacement);
        }

        public int hashCode() {
            String str = this.category;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.carouselPlacement;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("ViewPlanDetailsV2(category=", this.category, ", carouselPlacement=", this.carouselPlacement, ")");
        }
    }

    /* JADX INFO: renamed from: ls2.a$t */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lls2/a$t;", "Lls2/a;", "", "label", "", "weeksInPast", "source", "category", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "d", "c", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class t extends AbstractC24716a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int weeksInPast;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String label, int i13, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(label, "label");
            this.label = label;
            this.weeksInPast = i13;
            this.source = str;
            this.category = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getWeeksInPast() {
            return this.weeksInPast;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof t)) {
                return false;
            }
            t tVar = (t) other;
            return AbstractC22676k.m65745e(this.label, tVar.label) && this.weeksInPast == tVar.weeksInPast && AbstractC22676k.m65745e(this.source, tVar.source) && AbstractC22676k.m65745e(this.category, tVar.category);
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.weeksInPast, this.label.hashCode() * 31, 31);
            String str = this.source;
            int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.category;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.label;
            int i13 = this.weeksInPast;
            return AbstractC11266d.m30464r(AbstractC11266d.m30467u(i13, "ViewWeeklyPlanOverview(label=", str, ", weeksInPast=", ", source="), this.source, ", category=", this.category, ")");
        }

        public /* synthetic */ t(String str, int i13, String str2, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i13, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3);
        }
    }

    public /* synthetic */ AbstractC24716a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24716a() {
    }
}
