package il1;

import com.whoop.whoopaction.domain.models.Action;
import d13.AbstractC11478a;
import em1.EnumC13344r;
import fm1.EnumC14603g;
import java.time.LocalDate;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: il1.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lil1/u;", "", "<init>", "()V", "c", "b", "a", "Lil1/u$a;", "Lil1/u$b;", "Lil1/u$c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18644u {

    /* JADX INFO: renamed from: il1.u$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lil1/u$a;", "Lil1/u;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC18644u {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Action action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.action, ((a) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11478a.m30856h("PerformAction(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: il1.u$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lil1/u$b;", "Lil1/u;", "Lfm1/g;", "pillarType", "<init>", "(Lfm1/g;)V", "a", "(Lfm1/g;)Lil1/u$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfm1/g;", "b", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC18644u {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC14603g pillarType;

        public b(EnumC14603g enumC14603g) {
            super(null);
            this.pillarType = enumC14603g;
        }

        /* JADX INFO: renamed from: a */
        public final b m54051a(EnumC14603g pillarType) {
            return new b(pillarType);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC14603g getPillarType() {
            return this.pillarType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.pillarType == ((b) other).pillarType;
        }

        public int hashCode() {
            EnumC14603g enumC14603g = this.pillarType;
            if (enumC14603g == null) {
                return 0;
            }
            return enumC14603g.hashCode();
        }

        public String toString() {
            return "PillarChange(pillarType=" + this.pillarType + ")";
        }
    }

    public /* synthetic */ AbstractC18644u(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18644u() {
    }

    /* JADX INFO: renamed from: il1.u$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, m65681d2 = {"Lil1/u$c;", "Lil1/u;", "Ljava/time/LocalDate;", "requestDate", "Lfm1/g;", "pillarType", "", "shouldRefresh", "Lem1/r;", "refreshType", "<init>", "(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)V", "a", "(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)Lil1/u$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "e", "()Ljava/time/LocalDate;", "b", "Lfm1/g;", "c", "()Lfm1/g;", "Z", "f", "()Z", "d", "Lem1/r;", "()Lem1/r;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC18644u {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate requestDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g pillarType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean shouldRefresh;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC13344r refreshType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocalDate localDate, EnumC14603g enumC14603g, boolean z4, EnumC13344r refreshType) {
            super(null);
            AbstractC22676k.m65750j(refreshType, "refreshType");
            this.requestDate = localDate;
            this.pillarType = enumC14603g;
            this.shouldRefresh = z4;
            this.refreshType = refreshType;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m54053b(c cVar, LocalDate localDate, EnumC14603g enumC14603g, boolean z4, EnumC13344r enumC13344r, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                localDate = cVar.requestDate;
            }
            if ((i13 & 2) != 0) {
                enumC14603g = cVar.pillarType;
            }
            if ((i13 & 4) != 0) {
                z4 = cVar.shouldRefresh;
            }
            if ((i13 & 8) != 0) {
                enumC13344r = cVar.refreshType;
            }
            return cVar.m54054a(localDate, enumC14603g, z4, enumC13344r);
        }

        /* JADX INFO: renamed from: a */
        public final c m54054a(LocalDate requestDate, EnumC14603g pillarType, boolean shouldRefresh, EnumC13344r refreshType) {
            AbstractC22676k.m65750j(refreshType, "refreshType");
            return new c(requestDate, pillarType, shouldRefresh, refreshType);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC14603g getPillarType() {
            return this.pillarType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC13344r getRefreshType() {
            return this.refreshType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDate getRequestDate() {
            return this.requestDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.requestDate, cVar.requestDate) && this.pillarType == cVar.pillarType && this.shouldRefresh == cVar.shouldRefresh && this.refreshType == cVar.refreshType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        public int hashCode() {
            LocalDate localDate = this.requestDate;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            EnumC14603g enumC14603g = this.pillarType;
            return this.refreshType.hashCode() + AbstractC2875y.m8289b((iHashCode + (enumC14603g != null ? enumC14603g.hashCode() : 0)) * 31, 31, this.shouldRefresh);
        }

        public String toString() {
            return "Refresh(requestDate=" + this.requestDate + ", pillarType=" + this.pillarType + ", shouldRefresh=" + this.shouldRefresh + ", refreshType=" + this.refreshType + ")";
        }

        public /* synthetic */ c(LocalDate localDate, EnumC14603g enumC14603g, boolean z4, EnumC13344r enumC13344r, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : localDate, (i13 & 2) != 0 ? null : enumC14603g, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? EnumC13344r.NONE : enumC13344r);
        }
    }
}
