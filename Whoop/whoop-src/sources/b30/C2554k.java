package b30;

import l40.C23328a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C2554k {

    /* JADX INFO: renamed from: a */
    public final C2578n f9923a;

    public C2554k(C2578n billingDetailsFormState) {
        AbstractC22676k.m65750j(billingDetailsFormState, "billingDetailsFormState");
        this.f9923a = billingDetailsFormState;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7468a(String str, C23328a c23328a) {
        if (c23328a == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        String str2 = c23328a.f92491a;
        return !str.equals(str2 != null ? str2 : "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2554k) && AbstractC22676k.m65745e(this.f9923a, ((C2554k) obj).f9923a);
    }

    public final int hashCode() {
        return this.f9923a.hashCode();
    }

    public final String toString() {
        return "BillingDetailsEntry(billingDetailsFormState=" + this.f9923a + ")";
    }
}
