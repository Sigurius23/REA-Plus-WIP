package wj2;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.items.graph.ZoomableGraphModel;
import com.whoop.tiltgraph.domain.models.TiltGraphResponse;
import java.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wj2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lwj2/b;", "", "<init>", "()V", "b", "a", "c", "Lwj2/b$a;", "Lwj2/b$b;", "Lwj2/b$c;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37321b {

    /* JADX INFO: renamed from: wj2.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lwj2/b$a;", "Lwj2/b;", "Ljava/time/LocalDate;", HttpHeaders.DATE, "<init>", "(Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37321b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocalDate date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.date, ((a) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return "Error(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: wj2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwj2/b$b;", "Lwj2/b;", "<init>", "()V", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC37321b {

        /* JADX INFO: renamed from: a */
        public static final b f159552a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC37321b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37321b() {
    }

    /* JADX INFO: renamed from: wj2.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lwj2/b$c;", "Lwj2/b;", "Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;", "domainState", "", "isUpdating", "<init>", "(Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;", "()Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;", "b", "Z", "()Z", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37321b {

        /* JADX INFO: renamed from: c */
        public static final int f159553c = ZoomableGraphModel.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TiltGraphResponse domainState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isUpdating;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TiltGraphResponse domainState, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
            this.isUpdating = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TiltGraphResponse getDomainState() {
            return this.domainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.domainState, cVar.domainState) && this.isUpdating == cVar.isUpdating;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isUpdating) + (this.domainState.hashCode() * 31);
        }

        public String toString() {
            return "Success(domainState=" + this.domainState + ", isUpdating=" + this.isUpdating + ")";
        }

        public /* synthetic */ c(TiltGraphResponse tiltGraphResponse, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(tiltGraphResponse, (i13 & 2) != 0 ? false : z4);
        }
    }
}
