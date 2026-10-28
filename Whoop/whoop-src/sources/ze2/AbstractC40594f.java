package ze2;

import c13.AbstractC3855a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ze2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lze2/f;", "", "<init>", "()V", "c", "a", "b", "d", "Lze2/f$a;", "Lze2/f$b;", "Lze2/f$c;", "Lze2/f$d;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40594f {

    /* JADX INFO: renamed from: ze2.f$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lze2/f$a;", "Lze2/f;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC40594f {

        /* JADX INFO: renamed from: a */
        public static final a f174897a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ze2.f$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lze2/f$b;", "Lze2/f;", "", "scheduleId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC40594f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String scheduleId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String scheduleId) {
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
            return (other instanceof b) && AbstractC22676k.m65745e(this.scheduleId, ((b) other).scheduleId);
        }

        public int hashCode() {
            return this.scheduleId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeleteSleepSchedule(scheduleId=", this.scheduleId, ")");
        }
    }

    /* JADX INFO: renamed from: ze2.f$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lze2/f$c;", "Lze2/f;", "<init>", "()V", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC40594f {

        /* JADX INFO: renamed from: a */
        public static final c f174899a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ze2.f$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lze2/f$d;", "Lze2/f;", "", "scheduleEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC40594f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean scheduleEnabled;

        public d(boolean z4) {
            super(null);
            this.scheduleEnabled = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getScheduleEnabled() {
            return this.scheduleEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.scheduleEnabled == ((d) other).scheduleEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.scheduleEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ScheduleListToggle(scheduleEnabled=", ")", this.scheduleEnabled);
        }
    }

    public /* synthetic */ AbstractC40594f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40594f() {
    }
}
