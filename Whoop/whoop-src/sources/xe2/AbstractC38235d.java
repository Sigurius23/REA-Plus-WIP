package xe2;

import af2.EnumC0819i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import org.joda.time.LocalTime;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xe2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m65681d2 = {"Lxe2/d;", "", "<init>", "()V", "c", "j", "g", "m", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "l", "a", "e", "f", "b", "n", "k", "o", "d", "Lxe2/d$a;", "Lxe2/d$b;", "Lxe2/d$c;", "Lxe2/d$d;", "Lxe2/d$e;", "Lxe2/d$f;", "Lxe2/d$g;", "Lxe2/d$h;", "Lxe2/d$i;", "Lxe2/d$j;", "Lxe2/d$k;", "Lxe2/d$l;", "Lxe2/d$m;", "Lxe2/d$n;", "Lxe2/d$o;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38235d {

    /* JADX INFO: renamed from: xe2.d$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$a;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final a f163881a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lxe2/d$b;", "Lxe2/d;", "", "dayOfWeek", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC38235d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String dayOfWeek;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String dayOfWeek) {
            super(null);
            AbstractC22676k.m65750j(dayOfWeek, "dayOfWeek");
            this.dayOfWeek = dayOfWeek;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDayOfWeek() {
            return this.dayOfWeek;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.dayOfWeek, ((b) other).dayOfWeek);
        }

        public int hashCode() {
            return this.dayOfWeek.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("EditRepeatDays(dayOfWeek=", this.dayOfWeek, ")");
        }
    }

    /* JADX INFO: renamed from: xe2.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$c;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final c f163883a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lxe2/d$d;", "Lxe2/d;", "", "scheduleId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC38235d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String scheduleId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String scheduleId) {
            super(null);
            AbstractC22676k.m65750j(scheduleId, "scheduleId");
            this.scheduleId = scheduleId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScheduleId() {
            return this.scheduleId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.scheduleId, ((d) other).scheduleId);
        }

        public int hashCode() {
            return this.scheduleId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("FetchSleepNeedScheduleWithId(scheduleId=", this.scheduleId, ")");
        }
    }

    /* JADX INFO: renamed from: xe2.d$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$e;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final e f163885a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$f;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final f f163886a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$g;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final g f163887a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$h;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final h f163888a = new h();

        private h() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$i;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final i f163889a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$j;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final j f163890a = new j();

        private j() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxe2/d$k;", "Lxe2/d;", "Laf2/i;", "sleepGoalState", "<init>", "(Laf2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Laf2/i;", "()Laf2/i;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC38235d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC0819i sleepGoalState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EnumC0819i sleepGoalState) {
            super(null);
            AbstractC22676k.m65750j(sleepGoalState, "sleepGoalState");
            this.sleepGoalState = sleepGoalState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC0819i getSleepGoalState() {
            return this.sleepGoalState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && this.sleepGoalState == ((k) other).sleepGoalState;
        }

        public int hashCode() {
            return this.sleepGoalState.hashCode();
        }

        public String toString() {
            return "SleepGoalSelected(sleepGoalState=" + this.sleepGoalState + ")";
        }
    }

    /* JADX INFO: renamed from: xe2.d$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$l;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final l f163892a = new l();

        private l() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxe2/d$m;", "Lxe2/d;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC38235d {

        /* JADX INFO: renamed from: a */
        public static final m f163893a = new m();

        private m() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xe2.d$n */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxe2/d$n;", "Lxe2/d;", "Lxe2/a;", "alarmModeState", "<init>", "(Lxe2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/a;", "()Lxe2/a;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC38235d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC38232a alarmModeState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(EnumC38232a alarmModeState) {
            super(null);
            AbstractC22676k.m65750j(alarmModeState, "alarmModeState");
            this.alarmModeState = alarmModeState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC38232a getAlarmModeState() {
            return this.alarmModeState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && this.alarmModeState == ((n) other).alarmModeState;
        }

        public int hashCode() {
            return this.alarmModeState.hashCode();
        }

        public String toString() {
            return "WakeModeSelected(alarmModeState=" + this.alarmModeState + ")";
        }
    }

    /* JADX INFO: renamed from: xe2.d$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxe2/d$o;", "Lxe2/d;", "Lorg/joda/time/LocalTime;", "latestWakeTime", "<init>", "(Lorg/joda/time/LocalTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/LocalTime;", "()Lorg/joda/time/LocalTime;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC38235d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalTime latestWakeTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(LocalTime latestWakeTime) {
            super(null);
            AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
            this.latestWakeTime = latestWakeTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalTime getLatestWakeTime() {
            return this.latestWakeTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && AbstractC22676k.m65745e(this.latestWakeTime, ((o) other).latestWakeTime);
        }

        public int hashCode() {
            return this.latestWakeTime.hashCode();
        }

        public String toString() {
            return "WakeTimeSelected(latestWakeTime=" + this.latestWakeTime + ")";
        }
    }

    public /* synthetic */ AbstractC38235d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC38235d() {
    }
}
