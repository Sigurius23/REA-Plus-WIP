package we2;

import af2.EnumC0819i;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xe2.EnumC38232a;

/* JADX INFO: renamed from: we2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lwe2/a;", "", "<init>", "()V", "e", "b", "d", "c", "a", "f", "Lwe2/a$a;", "Lwe2/a$b;", "Lwe2/a$c;", "Lwe2/a$d;", "Lwe2/a$e;", "Lwe2/a$f;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37232a {

    /* JADX INFO: renamed from: we2.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lwe2/a$a;", "Lwe2/a;", "Lxe2/a;", "alarmMode", "<init>", "(Lxe2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/a;", "()Lxe2/a;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37232a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC38232a alarmMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC38232a alarmMode) {
            super(null);
            AbstractC22676k.m65750j(alarmMode, "alarmMode");
            this.alarmMode = alarmMode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC38232a getAlarmMode() {
            return this.alarmMode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.alarmMode == ((a) other).alarmMode;
        }

        public int hashCode() {
            return this.alarmMode.hashCode();
        }

        public String toString() {
            return "AlarmModeSelected(alarmMode=" + this.alarmMode + ")";
        }
    }

    /* JADX INFO: renamed from: we2.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwe2/a$b;", "Lwe2/a;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC37232a {

        /* JADX INFO: renamed from: a */
        public static final b f159222a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: we2.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lwe2/a$c;", "Lwe2/a;", "", "daysSelected", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37232a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int daysSelected;

        public c(int i13) {
            super(null);
            this.daysSelected = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDaysSelected() {
            return this.daysSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.daysSelected == ((c) other).daysSelected;
        }

        public int hashCode() {
            return Integer.hashCode(this.daysSelected);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.daysSelected, "RepeatDaysSelected(daysSelected=", ")");
        }
    }

    /* JADX INFO: renamed from: we2.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lwe2/a$d;", "Lwe2/a;", "", "label", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC37232a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String label) {
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
            return (other instanceof d) && AbstractC22676k.m65745e(this.label, ((d) other).label);
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ScheduleCardClicked(label=", this.label, ")");
        }
    }

    /* JADX INFO: renamed from: we2.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwe2/a$e;", "Lwe2/a;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC37232a {

        /* JADX INFO: renamed from: a */
        public static final e f159225a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: we2.a$f */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lwe2/a$f;", "Lwe2/a;", "Lxe2/a;", "alarmModeState", "Laf2/i;", "sleepGoal", "<init>", "(Lxe2/a;Laf2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/a;", "()Lxe2/a;", "b", "Laf2/i;", "()Laf2/i;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC37232a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC38232a alarmModeState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC0819i sleepGoal;

        public f(EnumC38232a enumC38232a, EnumC0819i enumC0819i) {
            super(null);
            this.alarmModeState = enumC38232a;
            this.sleepGoal = enumC0819i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC38232a getAlarmModeState() {
            return this.alarmModeState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC0819i getSleepGoal() {
            return this.sleepGoal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.alarmModeState == fVar.alarmModeState && this.sleepGoal == fVar.sleepGoal;
        }

        public int hashCode() {
            EnumC38232a enumC38232a = this.alarmModeState;
            int iHashCode = (enumC38232a == null ? 0 : enumC38232a.hashCode()) * 31;
            EnumC0819i enumC0819i = this.sleepGoal;
            return iHashCode + (enumC0819i != null ? enumC0819i.hashCode() : 0);
        }

        public String toString() {
            return "WakeTimeSelected(alarmModeState=" + this.alarmModeState + ", sleepGoal=" + this.sleepGoal + ")";
        }
    }

    public /* synthetic */ AbstractC37232a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37232a() {
    }
}
