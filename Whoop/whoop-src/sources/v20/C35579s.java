package v20;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v20.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C35579s {

    /* JADX INFO: renamed from: a */
    public final String f151318a;

    /* JADX INFO: renamed from: b */
    public final String f151319b;

    /* JADX INFO: renamed from: c */
    public final String f151320c;

    /* JADX INFO: renamed from: d */
    public final String f151321d;

    /* JADX INFO: renamed from: e */
    public final C41210b f151322e;

    /* JADX INFO: renamed from: f */
    public final C41210b f151323f;

    /* JADX INFO: renamed from: g */
    public final C41210b f151324g;

    public C35579s(String email, String nameOnAccount, String sortCode, String accountNumber, C41210b c41210b, C41210b c41210b2, C41210b c41210b3) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(nameOnAccount, "nameOnAccount");
        AbstractC22676k.m65750j(sortCode, "sortCode");
        AbstractC22676k.m65750j(accountNumber, "accountNumber");
        this.f151318a = email;
        this.f151319b = nameOnAccount;
        this.f151320c = sortCode;
        this.f151321d = accountNumber;
        this.f151322e = c41210b;
        this.f151323f = c41210b2;
        this.f151324g = c41210b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35579s)) {
            return false;
        }
        C35579s c35579s = (C35579s) obj;
        return AbstractC22676k.m65745e(this.f151318a, c35579s.f151318a) && AbstractC22676k.m65745e(this.f151319b, c35579s.f151319b) && AbstractC22676k.m65745e(this.f151320c, c35579s.f151320c) && AbstractC22676k.m65745e(this.f151321d, c35579s.f151321d) && this.f151322e.equals(c35579s.f151322e) && this.f151323f.equals(c35579s.f151323f) && this.f151324g.equals(c35579s.f151324g);
    }

    public final int hashCode() {
        return this.f151324g.hashCode() + ((this.f151323f.hashCode() + ((this.f151322e.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f151318a.hashCode() * 31, 31, this.f151319b), 31, this.f151320c), 31, this.f151321d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BacsMandateConfirmationViewState(email=", this.f151318a, ", nameOnAccount=", this.f151319b, ", sortCode=");
        AbstractC11266d.m30444B(sbM32001t, this.f151320c, ", accountNumber=", this.f151321d, ", payer=");
        sbM32001t.append(this.f151322e);
        sbM32001t.append(", supportAddressAsHtml=");
        sbM32001t.append(this.f151323f);
        sbM32001t.append(", debitGuaranteeAsHtml=");
        sbM32001t.append(this.f151324g);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
