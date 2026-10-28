package bs1;

import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bs1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lbs1/g;", "", "<init>", "()V", "a", "b", "Lbs1/g$a;", "Lbs1/g$b;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3588g {

    /* JADX INFO: renamed from: bs1.g$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lbs1/g$a;", "Lbs1/g;", "", MapboxMap.QFE_OFFSET, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC3588g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int offset;

        public a(int i13) {
            super(null);
            this.offset = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.offset == ((a) other).offset;
        }

        public int hashCode() {
            return Integer.hashCode(this.offset);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.offset, "CalendarPaged(offset=", ")");
        }
    }

    /* JADX INFO: renamed from: bs1.g$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lbs1/g$b;", "Lbs1/g;", "", "cycleId", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC3588g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Long cycleId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l7, String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.cycleId = l7;
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.cycleId, bVar.cycleId) && AbstractC22676k.m65745e(this.date, bVar.date);
        }

        public int hashCode() {
            Long l7 = this.cycleId;
            return this.date.hashCode() + ((l7 == null ? 0 : l7.hashCode()) * 31);
        }

        public String toString() {
            return "DateSelected(cycleId=" + this.cycleId + ", date=" + this.date + ")";
        }
    }

    public /* synthetic */ AbstractC3588g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3588g() {
    }
}
