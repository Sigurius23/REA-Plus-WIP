package np0;

import kp0.AbstractC22734a;
import kp0.AbstractC22748o;
import kp0.C22736c;
import kp0.C22739f;
import kp0.C22745l;
import kp0.C22747n;
import org.joda.time.LocalTime;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: np0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lnp0/b;", "", "Lnp0/a;", "type", "Lkp0/o;", "sleepPercent", "Lorg/joda/time/LocalTime;", "latestWakeTime", "", "isAlarmEnabled", "<init>", "(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)V", "Lkp0/a;", "g", "()Lkp0/a;", "a", "(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)Lnp0/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lnp0/a;", "e", "()Lnp0/a;", "b", "Lkp0/o;", "d", "()Lkp0/o;", "c", "Lorg/joda/time/LocalTime;", "()Lorg/joda/time/LocalTime;", "Z", "f", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27009b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC27008a type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22748o sleepPercent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LocalTime latestWakeTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isAlarmEnabled;

    /* JADX INFO: renamed from: np0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f107708a;

        static {
            int[] iArr = new int[EnumC27008a.values().length];
            try {
                iArr[EnumC27008a.EXACT_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27008a.SLEEP_GOAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27008a.IN_THE_GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107708a = iArr;
        }
    }

    public C27009b(EnumC27008a type, AbstractC22748o sleepPercent, LocalTime latestWakeTime, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(sleepPercent, "sleepPercent");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        this.type = type;
        this.sleepPercent = sleepPercent;
        this.latestWakeTime = latestWakeTime;
        this.isAlarmEnabled = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27009b m80998b(C27009b c27009b, EnumC27008a enumC27008a, AbstractC22748o abstractC22748o, LocalTime localTime, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC27008a = c27009b.type;
        }
        if ((i13 & 2) != 0) {
            abstractC22748o = c27009b.sleepPercent;
        }
        if ((i13 & 4) != 0) {
            localTime = c27009b.latestWakeTime;
        }
        if ((i13 & 8) != 0) {
            z4 = c27009b.isAlarmEnabled;
        }
        return c27009b.m80999a(enumC27008a, abstractC22748o, localTime, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C27009b m80999a(EnumC27008a type, AbstractC22748o sleepPercent, LocalTime latestWakeTime, boolean isAlarmEnabled) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(sleepPercent, "sleepPercent");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        return new C27009b(type, sleepPercent, latestWakeTime, isAlarmEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalTime getLatestWakeTime() {
        return this.latestWakeTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22748o getSleepPercent() {
        return this.sleepPercent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC27008a getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27009b)) {
            return false;
        }
        C27009b c27009b = (C27009b) other;
        return this.type == c27009b.type && AbstractC22676k.m65745e(this.sleepPercent, c27009b.sleepPercent) && AbstractC22676k.m65745e(this.latestWakeTime, c27009b.latestWakeTime) && this.isAlarmEnabled == c27009b.isAlarmEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsAlarmEnabled() {
        return this.isAlarmEnabled;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC22734a m81004g() {
        int i13 = a.f107708a[this.type.ordinal()];
        if (i13 == 1) {
            return new C22736c(this.latestWakeTime, this.sleepPercent);
        }
        if (i13 == 2) {
            return new C22747n(this.latestWakeTime, this.sleepPercent);
        }
        if (i13 == 3) {
            return new C22739f(this.latestWakeTime);
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAlarmEnabled) + ((this.latestWakeTime.hashCode() + ((this.sleepPercent.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AlarmViewState(type=" + this.type + ", sleepPercent=" + this.sleepPercent + ", latestWakeTime=" + this.latestWakeTime + ", isAlarmEnabled=" + this.isAlarmEnabled + ")";
    }

    public /* synthetic */ C27009b(EnumC27008a enumC27008a, AbstractC22748o abstractC22748o, LocalTime localTime, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC27008a.EXACT_TIME : enumC27008a, (i13 & 2) != 0 ? C22745l.f89475z : abstractC22748o, (i13 & 4) != 0 ? new LocalTime(7, 30) : localTime, (i13 & 8) != 0 ? false : z4);
    }
}
