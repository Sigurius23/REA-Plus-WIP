package l00;

import com.stripe.android.model.ConsentUi;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l00.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C23028j {

    /* JADX INFO: renamed from: a */
    public final String f90785a;

    /* JADX INFO: renamed from: b */
    public final String f90786b;

    /* JADX INFO: renamed from: c */
    public final String f90787c;

    /* JADX INFO: renamed from: d */
    public final ConsentUi.ConsentPane f90788d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41211c f90789e;

    public C23028j(String merchantName, String userEmail, String str, ConsentUi.ConsentPane consentPane, InterfaceC41211c interfaceC41211c) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(userEmail, "userEmail");
        this.f90785a = merchantName;
        this.f90786b = userEmail;
        this.f90787c = str;
        this.f90788d = consentPane;
        this.f90789e = interfaceC41211c;
    }

    /* JADX INFO: renamed from: a */
    public static C23028j m66795a(C23028j c23028j, InterfaceC41211c interfaceC41211c) {
        String merchantName = c23028j.f90785a;
        String userEmail = c23028j.f90786b;
        String str = c23028j.f90787c;
        ConsentUi.ConsentPane consentPane = c23028j.f90788d;
        c23028j.getClass();
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(userEmail, "userEmail");
        return new C23028j(merchantName, userEmail, str, consentPane, interfaceC41211c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23028j)) {
            return false;
        }
        C23028j c23028j = (C23028j) obj;
        return AbstractC22676k.m65745e(this.f90785a, c23028j.f90785a) && AbstractC22676k.m65745e(this.f90786b, c23028j.f90786b) && AbstractC22676k.m65745e(this.f90787c, c23028j.f90787c) && AbstractC22676k.m65745e(this.f90788d, c23028j.f90788d) && AbstractC22676k.m65745e(this.f90789e, c23028j.f90789e);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f90785a.hashCode() * 31, 31, this.f90786b);
        String str = this.f90787c;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        ConsentUi.ConsentPane consentPane = this.f90788d;
        int iHashCode2 = (iHashCode + (consentPane == null ? 0 : consentPane.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c = this.f90789e;
        return iHashCode2 + (interfaceC41211c != null ? interfaceC41211c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OAuthConsentViewState(merchantName=", this.f90785a, ", userEmail=", this.f90786b, ", merchantLogoUrl=");
        sbM32001t.append(this.f90787c);
        sbM32001t.append(", consentPane=");
        sbM32001t.append(this.f90788d);
        sbM32001t.append(", errorMessage=");
        sbM32001t.append(this.f90789e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
