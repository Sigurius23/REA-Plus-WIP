package bt0;

import androidx.room.AbstractC1848z0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bt0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m65681d2 = {"Lbt0/b;", "", "Lorg/joda/time/DateTime;", "fromDateTimeLocal", "<init>", "(Lorg/joda/time/DateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "fromDateTimeUtc", "b", "toDateTimeUtc", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3618b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DateTime fromDateTimeLocal;

    public C3618b(DateTime fromDateTimeLocal) {
        AbstractC22676k.m65750j(fromDateTimeLocal, "fromDateTimeLocal");
        this.fromDateTimeLocal = fromDateTimeLocal;
    }

    /* JADX INFO: renamed from: a */
    public final DateTime m10979a() {
        return new DateTime(this.fromDateTimeLocal, DateTimeZone.UTC);
    }

    /* JADX INFO: renamed from: b */
    public final DateTime m10980b() {
        DateTime dateTimeWithTime = m10979a().withTime(23, 59, 59, AbstractC1848z0.MAX_BIND_PARAMETER_CNT);
        AbstractC22676k.m65749i(dateTimeWithTime, "withTime(...)");
        return dateTimeWithTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C3618b) && AbstractC22676k.m65745e(this.fromDateTimeLocal, ((C3618b) other).fromDateTimeLocal);
    }

    public int hashCode() {
        return this.fromDateTimeLocal.hashCode();
    }

    public String toString() {
        return "DayBoundariesPair(fromDateTimeLocal=" + this.fromDateTimeLocal + ")";
    }
}
