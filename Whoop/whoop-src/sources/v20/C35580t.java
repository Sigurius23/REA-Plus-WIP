package v20;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v20.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C35580t {

    /* JADX INFO: renamed from: a */
    public final String f151325a;

    /* JADX INFO: renamed from: b */
    public final String f151326b;

    /* JADX INFO: renamed from: c */
    public final String f151327c;

    /* JADX INFO: renamed from: d */
    public final String f151328d;

    public C35580t(String str, String str2, String accountNumber, String sortCode) {
        AbstractC22676k.m65750j(accountNumber, "accountNumber");
        AbstractC22676k.m65750j(sortCode, "sortCode");
        this.f151325a = str;
        this.f151326b = str2;
        this.f151327c = accountNumber;
        this.f151328d = sortCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35580t)) {
            return false;
        }
        C35580t c35580t = (C35580t) obj;
        return AbstractC22676k.m65745e(this.f151325a, c35580t.f151325a) && AbstractC22676k.m65745e(this.f151326b, c35580t.f151326b) && AbstractC22676k.m65745e(this.f151327c, c35580t.f151327c) && AbstractC22676k.m65745e(this.f151328d, c35580t.f151328d);
    }

    public final int hashCode() {
        return this.f151328d.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f151325a.hashCode() * 31, 31, this.f151326b), 31, this.f151327c);
    }

    public final String toString() {
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("BacsMandateData(name=", this.f151325a, ", email=", this.f151326b, ", accountNumber="), this.f151327c, ", sortCode=", this.f151328d, ")");
    }
}
