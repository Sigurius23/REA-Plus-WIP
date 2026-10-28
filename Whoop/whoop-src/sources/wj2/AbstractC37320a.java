package wj2;

import com.mapbox.common.HttpHeaders;
import ih0.AbstractC18489d0;
import java.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wj2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lwj2/a;", "", "<init>", "()V", "a", "Lwj2/a$a;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37320a {

    /* JADX INFO: renamed from: wj2.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lwj2/a$a;", "Lwj2/a;", "Ljava/time/LocalDate;", HttpHeaders.DATE, "", "source", "", "shouldLogAnalytics", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37320a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean shouldLogAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocalDate date, String str, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
            this.source = str;
            this.shouldLogAnalytics = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldLogAnalytics() {
            return this.shouldLogAnalytics;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.date, aVar.date) && AbstractC22676k.m65745e(this.source, aVar.source) && this.shouldLogAnalytics == aVar.shouldLogAnalytics;
        }

        public int hashCode() {
            int iHashCode = this.date.hashCode() * 31;
            String str = this.source;
            return Boolean.hashCode(this.shouldLogAnalytics) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            LocalDate localDate = this.date;
            String str = this.source;
            boolean z4 = this.shouldLogAnalytics;
            StringBuilder sb4 = new StringBuilder("LoadData(date=");
            sb4.append(localDate);
            sb4.append(", source=");
            sb4.append(str);
            sb4.append(", shouldLogAnalytics=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    public /* synthetic */ AbstractC37320a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37320a() {
    }
}
