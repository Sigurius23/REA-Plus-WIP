package oa2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xc2.InterfaceC38193d;

/* JADX INFO: renamed from: oa2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Loa2/d;", "", "Loa2/a;", "myAccountHeader", "Lxc2/d;", "switchBillingPlanModal", "<init>", "(Loa2/a;Lxc2/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loa2/a;", "()Loa2/a;", "b", "Lxc2/d;", "getSwitchBillingPlanModal", "()Lxc2/d;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27756d {

    /* JADX INFO: renamed from: c */
    public static final int f111934c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27753a myAccountHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC38193d switchBillingPlanModal;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f111934c = i13 | i13 | i14 | i13 | i14 | i14 | i14 | i14 | AbstractC22403o.f87638a;
    }

    public C27756d(C27753a c27753a, InterfaceC38193d interfaceC38193d) {
        this.myAccountHeader = c27753a;
        this.switchBillingPlanModal = interfaceC38193d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27753a getMyAccountHeader() {
        return this.myAccountHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27756d)) {
            return false;
        }
        C27756d c27756d = (C27756d) other;
        return AbstractC22676k.m65745e(this.myAccountHeader, c27756d.myAccountHeader) && AbstractC22676k.m65745e(this.switchBillingPlanModal, c27756d.switchBillingPlanModal);
    }

    public int hashCode() {
        C27753a c27753a = this.myAccountHeader;
        int iHashCode = (c27753a == null ? 0 : c27753a.hashCode()) * 31;
        InterfaceC38193d interfaceC38193d = this.switchBillingPlanModal;
        return iHashCode + (interfaceC38193d != null ? interfaceC38193d.hashCode() : 0);
    }

    public String toString() {
        return "MyAccountHeaderViewState(myAccountHeader=" + this.myAccountHeader + ", switchBillingPlanModal=" + this.switchBillingPlanModal + ")";
    }
}
