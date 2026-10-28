package em1;

import com.whoop.whoopaction.domain.models.Action;
import d13.AbstractC11478a;
import fm1.EnumC14603g;
import java.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: em1.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lem1/n;", "Lem1/t;", "<init>", "()V", "c", "b", "a", "Lem1/n$a;", "Lem1/n$b;", "Lem1/n$c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13340n implements InterfaceC13346t {

    /* JADX INFO: renamed from: em1.n$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lem1/n$a;", "Lem1/n;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC13340n {

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
            return AbstractC11478a.m30856h("HomeFeedAction(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: em1.n$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lem1/n$b;", "Lem1/n;", "Lfm1/g;", "pillarType", "<init>", "(Lfm1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm1/g;", "()Lfm1/g;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC13340n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC14603g pillarType;

        public b(EnumC14603g enumC14603g) {
            super(null);
            this.pillarType = enumC14603g;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
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

    public /* synthetic */ AbstractC13340n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13340n() {
    }

    /* JADX INFO: renamed from: em1.n$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lem1/n$c;", "Lem1/n;", "Ljava/time/LocalDate;", "requestDate", "Lfm1/g;", "pillarType", "Lem1/r;", "refreshType", "<init>", "(Ljava/time/LocalDate;Lfm1/g;Lem1/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "b", "Lfm1/g;", "()Lfm1/g;", "Lem1/r;", "()Lem1/r;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC13340n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LocalDate requestDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC14603g pillarType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC13344r refreshType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocalDate localDate, EnumC14603g enumC14603g, EnumC13344r refreshType) {
            super(null);
            AbstractC22676k.m65750j(refreshType, "refreshType");
            this.requestDate = localDate;
            this.pillarType = enumC14603g;
            this.refreshType = refreshType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC14603g getPillarType() {
            return this.pillarType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC13344r getRefreshType() {
            return this.refreshType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return AbstractC22676k.m65745e(this.requestDate, cVar.requestDate) && this.pillarType == cVar.pillarType && this.refreshType == cVar.refreshType;
        }

        public int hashCode() {
            LocalDate localDate = this.requestDate;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            EnumC14603g enumC14603g = this.pillarType;
            return this.refreshType.hashCode() + ((iHashCode + (enumC14603g != null ? enumC14603g.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Refresh(requestDate=" + this.requestDate + ", pillarType=" + this.pillarType + ", refreshType=" + this.refreshType + ")";
        }

        public /* synthetic */ c(LocalDate localDate, EnumC14603g enumC14603g, EnumC13344r enumC13344r, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : localDate, (i13 & 2) != 0 ? null : enumC14603g, (i13 & 4) != 0 ? EnumC13344r.NONE : enumC13344r);
        }
    }
}
