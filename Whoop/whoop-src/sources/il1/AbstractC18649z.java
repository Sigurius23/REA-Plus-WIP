package il1;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: il1.z */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lil1/z;", "", "<init>", "()V", "c", "a", "b", "Lil1/z$a;", "Lil1/z$b;", "Lil1/z$c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18649z {

    /* JADX INFO: renamed from: il1.z$a */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lil1/z$a;", "Lil1/z;", "", "gpsEnabled", "", "startAt", "", "sportId", "<init>", "(ZLjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "I", "getSportId", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC18649z {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean gpsEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String startAt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int sportId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, String startAt, int i13) {
            super(null);
            AbstractC22676k.m65750j(startAt, "startAt");
            this.gpsEnabled = z4;
            this.startAt = startAt;
            this.sportId = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getGpsEnabled() {
            return this.gpsEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStartAt() {
            return this.startAt;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.gpsEnabled == aVar.gpsEnabled && AbstractC22676k.m65745e(this.startAt, aVar.startAt) && this.sportId == aVar.sportId;
        }

        public int hashCode() {
            return Integer.hashCode(this.sportId) + AbstractC11266d.m30450d(Boolean.hashCode(this.gpsEnabled) * 31, 31, this.startAt);
        }

        public String toString() {
            boolean z4 = this.gpsEnabled;
            String str = this.startAt;
            return AbstractC18489d0.m53371l(AbstractC13673n.m38567n("ActivityProcessNow(gpsEnabled=", ", startAt=", str, ", sportId=", z4), this.sportId, ")");
        }
    }

    /* JADX INFO: renamed from: il1.z$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/z$b;", "Lil1/z;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC18649z {

        /* JADX INFO: renamed from: a */
        public static final b f73185a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: il1.z$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lil1/z$c;", "Lil1/z;", "<init>", "()V", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC18649z {

        /* JADX INFO: renamed from: a */
        public static final c f73186a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC18649z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18649z() {
    }
}
