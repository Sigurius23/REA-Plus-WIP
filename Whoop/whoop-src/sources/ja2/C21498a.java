package ja2;

import la2.AbstractC23555c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vc2.AbstractC35880c;

/* JADX INFO: renamed from: ja2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lja2/a;", "", "Lla2/c;", "myAccountHeaderResult", "Lvc2/c;", "switchBillingPlanModalResult", "<init>", "(Lla2/c;Lvc2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lla2/c;", "()Lla2/c;", "b", "Lvc2/c;", "()Lvc2/c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21498a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC23555c myAccountHeaderResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC35880c switchBillingPlanModalResult;

    public C21498a(AbstractC23555c myAccountHeaderResult, AbstractC35880c switchBillingPlanModalResult) {
        AbstractC22676k.m65750j(myAccountHeaderResult, "myAccountHeaderResult");
        AbstractC22676k.m65750j(switchBillingPlanModalResult, "switchBillingPlanModalResult");
        this.myAccountHeaderResult = myAccountHeaderResult;
        this.switchBillingPlanModalResult = switchBillingPlanModalResult;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC23555c getMyAccountHeaderResult() {
        return this.myAccountHeaderResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC35880c getSwitchBillingPlanModalResult() {
        return this.switchBillingPlanModalResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21498a)) {
            return false;
        }
        C21498a c21498a = (C21498a) other;
        return AbstractC22676k.m65745e(this.myAccountHeaderResult, c21498a.myAccountHeaderResult) && AbstractC22676k.m65745e(this.switchBillingPlanModalResult, c21498a.switchBillingPlanModalResult);
    }

    public int hashCode() {
        return this.switchBillingPlanModalResult.hashCode() + (this.myAccountHeaderResult.hashCode() * 31);
    }

    public String toString() {
        return "MyAccountHeaderDomainState(myAccountHeaderResult=" + this.myAccountHeaderResult + ", switchBillingPlanModalResult=" + this.switchBillingPlanModalResult + ")";
    }
}
