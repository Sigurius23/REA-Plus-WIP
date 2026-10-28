package h20;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38888l4;

/* JADX INFO: renamed from: h20.p4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16716p4 implements InterfaceC16728r4 {

    /* JADX INFO: renamed from: a */
    public final C38888l4 f64254a;

    public C16716p4(C38888l4 usBankAccount) {
        AbstractC22676k.m65750j(usBankAccount, "usBankAccount");
        this.f64254a = usBankAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16716p4) && AbstractC22676k.m65745e(this.f64254a, ((C16716p4) obj).f64254a);
    }

    public final int hashCode() {
        return this.f64254a.hashCode();
    }

    public final String toString() {
        return "USBankAccount(usBankAccount=" + this.f64254a + ")";
    }
}
