package wt2;

import com.whoop.design.util.TextResource;
import ep0.C13404j;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: wt2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lwt2/f;", "", "<init>", "()V", "e", "d", "c", "b", "a", "f", "Lwt2/f$a;", "Lwt2/f$b;", "Lwt2/f$c;", "Lwt2/f$d;", "Lwt2/f$e;", "Lwt2/f$f;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37625f {

    /* JADX INFO: renamed from: wt2.f$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lwt2/f$a;", "Lwt2/f;", "", "planId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37625f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String planId) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            this.planId = planId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.planId, ((a) other).planId);
        }

        public int hashCode() {
            return this.planId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DeleteError(planId=", this.planId, ")");
        }
    }

    /* JADX INFO: renamed from: wt2.f$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwt2/f$b;", "Lwt2/f;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC37625f {

        /* JADX INFO: renamed from: a */
        public static final b f161003a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wt2.f$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwt2/f$c;", "Lwt2/f;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC37625f {

        /* JADX INFO: renamed from: a */
        public static final c f161004a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wt2.f$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwt2/f$d;", "Lwt2/f;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC37625f {

        /* JADX INFO: renamed from: a */
        public static final d f161005a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wt2.f$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwt2/f$e;", "Lwt2/f;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC37625f {

        /* JADX INFO: renamed from: a */
        public static final e f161006a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wt2.f$f */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001b\u0010(¨\u0006)"}, m65681d2 = {"Lwt2/f$f;", "Lwt2/f;", "", "planId", "Lwt2/n;", "plan", "Lcom/whoop/design/util/TextResource;", "cancelButtonText", "Lwt2/b;", "cancelPlanModal", "Lep0/j;", "screenContextMetadata", "<init>", "(Ljava/lang/String;Lwt2/n;Lcom/whoop/design/util/TextResource;Lwt2/b;Lep0/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPlanId", "b", "Lwt2/n;", "()Lwt2/n;", "c", "Lcom/whoop/design/util/TextResource;", "getCancelButtonText", "()Lcom/whoop/design/util/TextResource;", "d", "Lwt2/b;", "getCancelPlanModal", "()Lwt2/b;", "e", "Lep0/j;", "()Lep0/j;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC37625f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C37633n plan;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource cancelButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C37621b cancelPlanModal;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C37633n plan, TextResource cancelButtonText, C37621b cancelPlanModal, C13404j c13404j) {
            super(null);
            AbstractC22676k.m65750j(plan, "plan");
            AbstractC22676k.m65750j(cancelButtonText, "cancelButtonText");
            AbstractC22676k.m65750j(cancelPlanModal, "cancelPlanModal");
            this.planId = str;
            this.plan = plan;
            this.cancelButtonText = cancelButtonText;
            this.cancelPlanModal = cancelPlanModal;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C37633n getPlan() {
            return this.plan;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.planId, fVar.planId) && AbstractC22676k.m65745e(this.plan, fVar.plan) && AbstractC22676k.m65745e(this.cancelButtonText, fVar.cancelButtonText) && AbstractC22676k.m65745e(this.cancelPlanModal, fVar.cancelPlanModal) && AbstractC22676k.m65745e(this.screenContextMetadata, fVar.screenContextMetadata);
        }

        public int hashCode() {
            String str = this.planId;
            int iHashCode = (this.cancelPlanModal.hashCode() + AbstractC31061c.m95625a((this.plan.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, this.cancelButtonText, 31)) * 31;
            C13404j c13404j = this.screenContextMetadata;
            return iHashCode + (c13404j != null ? c13404j.hashCode() : 0);
        }

        public String toString() {
            return "Success(planId=" + this.planId + ", plan=" + this.plan + ", cancelButtonText=" + this.cancelButtonText + ", cancelPlanModal=" + this.cancelPlanModal + ", screenContextMetadata=" + this.screenContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC37625f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37625f() {
    }
}
