package v20;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C35576p {

    /* JADX INFO: renamed from: a */
    public final String f151308a;

    /* JADX INFO: renamed from: b */
    public final String f151309b;

    /* JADX INFO: renamed from: c */
    public final String f151310c;

    /* JADX INFO: renamed from: d */
    public final String f151311d;

    public C35576p(String email, String nameOnAccount, String sortCode, String accountNumber) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(nameOnAccount, "nameOnAccount");
        AbstractC22676k.m65750j(sortCode, "sortCode");
        AbstractC22676k.m65750j(accountNumber, "accountNumber");
        this.f151308a = email;
        this.f151309b = nameOnAccount;
        this.f151310c = sortCode;
        this.f151311d = accountNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35576p)) {
            return false;
        }
        C35576p c35576p = (C35576p) obj;
        return AbstractC22676k.m65745e(this.f151308a, c35576p.f151308a) && AbstractC22676k.m65745e(this.f151309b, c35576p.f151309b) && AbstractC22676k.m65745e(this.f151310c, c35576p.f151310c) && AbstractC22676k.m65745e(this.f151311d, c35576p.f151311d);
    }

    public final int hashCode() {
        return this.f151311d.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f151308a.hashCode() * 31, 31, this.f151309b), 31, this.f151310c);
    }

    public final String toString() {
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("Args(email=", this.f151308a, ", nameOnAccount=", this.f151309b, ", sortCode="), this.f151310c, ", accountNumber=", this.f151311d, ")");
    }
}
