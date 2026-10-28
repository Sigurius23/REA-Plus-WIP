package vc2;

import com.whoop.settings.accountheader.model.SwitchBillingPlanModalModel;
import com.whoop.settings.accountheader.model.SwitchBillingPlanResponseModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xc2.EnumC38190a;

/* JADX INFO: renamed from: vc2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lvc2/c;", "", "<init>", "()V", "c", "a", "b", "d", "Lvc2/c$a;", "Lvc2/c$b;", "Lvc2/c$c;", "Lvc2/c$d;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35880c {

    /* JADX INFO: renamed from: vc2.c$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lvc2/c$a;", "Lvc2/c;", "Lxc2/a;", "error", "", "plan", "<init>", "(Lxc2/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxc2/a;", "()Lxc2/a;", "b", "Ljava/lang/String;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35880c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC38190a error;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String plan;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC38190a error, String plan) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(plan, "plan");
            this.error = error;
            this.plan = plan;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC38190a getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlan() {
            return this.plan;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.error == aVar.error && AbstractC22676k.m65745e(this.plan, aVar.plan);
        }

        public int hashCode() {
            return this.plan.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return "Error(error=" + this.error + ", plan=" + this.plan + ")";
        }
    }

    /* JADX INFO: renamed from: vc2.c$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lvc2/c$b;", "Lvc2/c;", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;", "result", "", "plan", "<init>", "(Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;", "b", "()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;", "Ljava/lang/String;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC35880c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SwitchBillingPlanModalModel result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String plan;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SwitchBillingPlanModalModel result, String plan) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            AbstractC22676k.m65750j(plan, "plan");
            this.result = result;
            this.plan = plan;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlan() {
            return this.plan;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SwitchBillingPlanModalModel getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.result, bVar.result) && AbstractC22676k.m65745e(this.plan, bVar.plan);
        }

        public int hashCode() {
            return this.plan.hashCode() + (this.result.hashCode() * 31);
        }

        public String toString() {
            return "LandingPlanModalResult(result=" + this.result + ", plan=" + this.plan + ")";
        }
    }

    /* JADX INFO: renamed from: vc2.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvc2/c$c;", "Lvc2/c;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC35880c {

        /* JADX INFO: renamed from: a */
        public static final c f152797a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vc2.c$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvc2/c$d;", "Lvc2/c;", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;", "result", "<init>", "(Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;", "()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC35880c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SwitchBillingPlanResponseModel result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SwitchBillingPlanResponseModel result) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SwitchBillingPlanResponseModel getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.result, ((d) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "SuccessSwitchBillingPlan(result=" + this.result + ")";
        }
    }

    public /* synthetic */ AbstractC35880c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35880c() {
    }
}
