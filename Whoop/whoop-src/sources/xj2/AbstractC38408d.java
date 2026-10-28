package xj2;

import com.mapbox.maps.MapboxMap;
import java.time.LocalDate;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xj2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lxj2/d;", "", "<init>", "()V", "a", "b", "c", "Lxj2/d$a;", "Lxj2/d$b;", "Lxj2/d$c;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38408d {

    /* JADX INFO: renamed from: xj2.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lxj2/d$a;", "Lxj2/d;", "", MapboxMap.QFE_OFFSET, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC38408d {

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

    /* JADX INFO: renamed from: xj2.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxj2/d$b;", "Lxj2/d;", "<init>", "()V", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC38408d {

        /* JADX INFO: renamed from: a */
        public static final b f164407a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: xj2.d$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxj2/d$c;", "Lxj2/d;", "Ljava/time/LocalDate;", "specificDate", "<init>", "(Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC38408d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate specificDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocalDate specificDate) {
            super(null);
            AbstractC22676k.m65750j(specificDate, "specificDate");
            this.specificDate = specificDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getSpecificDate() {
            return this.specificDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.specificDate, ((c) other).specificDate);
        }

        public int hashCode() {
            return this.specificDate.hashCode();
        }

        public String toString() {
            return "RefreshSpecificDate(specificDate=" + this.specificDate + ")";
        }
    }

    public /* synthetic */ AbstractC38408d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC38408d() {
    }
}
