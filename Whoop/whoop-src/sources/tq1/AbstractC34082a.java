package tq1;

import com.whoop.navigation.C9598e;
import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tq1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Ltq1/a;", "", "<init>", "()V", "b", "a", "c", "e", "f", "d", "Ltq1/a$a;", "Ltq1/a$b;", "Ltq1/a$c;", "Ltq1/a$d;", "Ltq1/a$e;", "Ltq1/a$f;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34082a {

    /* JADX INFO: renamed from: tq1.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ltq1/a$a;", "Ltq1/a;", "", "cycleId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getCycleId", "()J", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC34082a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long cycleId;

        public a(long j7) {
            super(null);
            this.cycleId = j7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.cycleId == ((a) other).cycleId;
        }

        public int hashCode() {
            return Long.hashCode(this.cycleId);
        }

        public String toString() {
            return AbstractC31061c.m95636l(this.cycleId, "NavigateToCustomizeJournal(cycleId=", ")");
        }
    }

    /* JADX INFO: renamed from: tq1.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ltq1/a$b;", "Ltq1/a;", "Ljava/util/UUID;", "detailId", "", "isNew", "<init>", "(Ljava/util/UUID;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Z", "()Z", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC34082a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final UUID detailId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isNew;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UUID detailId, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(detailId, "detailId");
            this.detailId = detailId;
            this.isNew = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final UUID getDetailId() {
            return this.detailId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsNew() {
            return this.isNew;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.detailId, bVar.detailId) && this.isNew == bVar.isNew;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNew) + (this.detailId.hashCode() * 31);
        }

        public String toString() {
            return "NavigateToDetail(detailId=" + this.detailId + ", isNew=" + this.isNew + ")";
        }
    }

    /* JADX INFO: renamed from: tq1.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltq1/a$c;", "Ltq1/a;", "<init>", "()V", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC34082a {

        /* JADX INFO: renamed from: a */
        public static final c f142946a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: tq1.a$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ltq1/a$d;", "Ltq1/a;", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC34082a {

        /* JADX INFO: renamed from: b */
        public static final int f142947b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9598e navigationAction) {
            super(null);
            AbstractC22676k.m65750j(navigationAction, "navigationAction");
            this.navigationAction = navigationAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.navigationAction, ((d) other).navigationAction);
        }

        public int hashCode() {
            return this.navigationAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("NavigationActionEvent(navigationAction=", this.navigationAction, ")");
        }
    }

    /* JADX INFO: renamed from: tq1.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltq1/a$e;", "Ltq1/a;", "<init>", "()V", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC34082a {

        /* JADX INFO: renamed from: a */
        public static final e f142949a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: tq1.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltq1/a$f;", "Ltq1/a;", "<init>", "()V", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC34082a {

        /* JADX INFO: renamed from: a */
        public static final f f142950a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC34082a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34082a() {
    }
}
