package d00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.model.EnumC5664s;
import com.stripe.android.model.EnumC5667v;
import com.stripe.android.model.MobileFallbackWebviewParams;
import g40.AbstractC15380k2;
import i93.C18277c;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import p023ay.C2125b;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: d00.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C11433l implements Parcelable {
    public static final Parcelable.Creator<C11433l> CREATOR = new C2125b(18);

    /* JADX INFO: renamed from: E */
    public final boolean f36650E;

    /* JADX INFO: renamed from: F */
    public final String f36651F;

    /* JADX INFO: renamed from: G */
    public final String f36652G;

    /* JADX INFO: renamed from: H */
    public final String f36653H;

    /* JADX INFO: renamed from: I */
    public final boolean f36654I;

    /* JADX INFO: renamed from: J */
    public final boolean f36655J;

    /* JADX INFO: renamed from: K */
    public final boolean f36656K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC11427f f36657L;

    /* JADX INFO: renamed from: M */
    public final String f36658M;

    /* JADX INFO: renamed from: w */
    public final ConsumerSession f36659w;

    /* JADX INFO: renamed from: x */
    public final String f36660x;

    /* JADX INFO: renamed from: y */
    public final DisplayablePaymentDetails f36661y;

    /* JADX INFO: renamed from: z */
    public final C11434m f36662z;

    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    public C11433l(ConsumerSession consumerSession, String str, DisplayablePaymentDetails displayablePaymentDetails, C11434m c11434m, boolean z4) {
        boolean z13;
        Object next;
        InterfaceC11427f c11423b;
        String webviewOpenUrl;
        Object next2;
        AbstractC22676k.m65750j(consumerSession, "consumerSession");
        this.f36659w = consumerSession;
        this.f36660x = str;
        this.f36661y = displayablePaymentDetails;
        this.f36662z = c11434m;
        this.f36650E = z4;
        this.f36651F = AbstractC39421y.m125926K(consumerSession.getRedactedFormattedPhoneNumber(), "*", "•", false);
        this.f36652G = consumerSession.getClientSecret();
        this.f36653H = consumerSession.getEmailAddress();
        this.f36654I = m30675b(consumerSession);
        if (!m30675b(consumerSession) && !m30676h(consumerSession)) {
            Iterator<T> it = consumerSession.getVerificationSessions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) next2;
                if (verificationSession.getType() == EnumC5667v.LinkAuthToken && verificationSession.getState() == EnumC5664s.Verified) {
                    break;
                }
            }
            z13 = next2 != null;
        }
        this.f36655J = z13;
        this.f36656K = m30676h(this.f36659w);
        if (z13) {
            boolean z14 = this.f36654I;
            C11434m c11434m2 = this.f36662z;
            c11423b = new C11426e(z14, c11434m2 != null ? c11434m2.f36664x : null);
        } else {
            Iterator<T> it3 = this.f36659w.getVerificationSessions().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                ConsumerSession.VerificationSession verificationSession2 = (ConsumerSession.VerificationSession) next;
                if (verificationSession2.getType() == EnumC5667v.Sms && verificationSession2.getState() == EnumC5664s.Started) {
                    break;
                }
            }
            if (next != null) {
                c11423b = C11425d.f36645a;
            } else {
                MobileFallbackWebviewParams mobileFallbackWebviewParams = this.f36659w.getMobileFallbackWebviewParams();
                c11423b = new C11423b((mobileFallbackWebviewParams == null || (webviewOpenUrl = mobileFallbackWebviewParams.getWebviewOpenUrl()) == null || mobileFallbackWebviewParams.getWebViewRequirementType() != MobileFallbackWebviewParams.WebviewRequirementType.Required) ? null : webviewOpenUrl);
            }
        }
        this.f36657L = c11423b;
        MobileFallbackWebviewParams mobileFallbackWebviewParams2 = this.f36659w.getMobileFallbackWebviewParams();
        this.f36658M = mobileFallbackWebviewParams2 != null ? mobileFallbackWebviewParams2.getWebviewOpenUrl() : null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[RETURN] */
    /* JADX INFO: renamed from: b */
    public static boolean m30675b(ConsumerSession consumerSession) {
        for (Object obj : consumerSession.getVerificationSessions()) {
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
            if (verificationSession.getType() == EnumC5667v.Sms && verificationSession.getState() == EnumC5664s.Verified) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[RETURN] */
    /* JADX INFO: renamed from: h */
    public static boolean m30676h(ConsumerSession consumerSession) {
        for (Object obj : consumerSession.getVerificationSessions()) {
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
            if (verificationSession.getType() == EnumC5667v.SignUp && verificationSession.getState() == EnumC5664s.Started) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11433l)) {
            return false;
        }
        C11433l c11433l = (C11433l) obj;
        return AbstractC22676k.m65745e(this.f36659w, c11433l.f36659w) && AbstractC22676k.m65745e(this.f36660x, c11433l.f36660x) && AbstractC22676k.m65745e(this.f36661y, c11433l.f36661y) && AbstractC22676k.m65745e(this.f36662z, c11433l.f36662z) && this.f36650E == c11433l.f36650E;
    }

    /* JADX INFO: renamed from: f */
    public final String m30677f() {
        ConsumerSession consumerSession = this.f36659w;
        String unredactedPhoneNumber = consumerSession.getUnredactedPhoneNumber();
        String phoneNumberCountry = consumerSession.getPhoneNumberCountry();
        if (unredactedPhoneNumber == null || phoneNumberCountry == null) {
            return null;
        }
        C18277c c18277c = AbstractC15380k2.f57813a;
        return AbstractC12313p.m34253E(phoneNumberCountry).mo43579e(unredactedPhoneNumber);
    }

    public final int hashCode() {
        int iHashCode = this.f36659w.hashCode() * 31;
        String str = this.f36660x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DisplayablePaymentDetails displayablePaymentDetails = this.f36661y;
        int iHashCode3 = (iHashCode2 + (displayablePaymentDetails == null ? 0 : displayablePaymentDetails.hashCode())) * 31;
        C11434m c11434m = this.f36662z;
        return Boolean.hashCode(this.f36650E) + ((iHashCode3 + (c11434m != null ? c11434m.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LinkAccount(consumerSession=");
        sb4.append(this.f36659w);
        sb4.append(", consumerPublishableKey=");
        sb4.append(this.f36660x);
        sb4.append(", displayablePaymentDetails=");
        sb4.append(this.f36661y);
        sb4.append(", linkAuthIntentInfo=");
        sb4.append(this.f36662z);
        sb4.append(", viewedWebviewOpenUrl=");
        return AbstractC18489d0.m53372m(sb4, this.f36650E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f36659w, i13);
        dest.writeString(this.f36660x);
        dest.writeParcelable(this.f36661y, i13);
        C11434m c11434m = this.f36662z;
        if (c11434m == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c11434m.writeToParcel(dest, i13);
        }
        dest.writeInt(this.f36650E ? 1 : 0);
    }
}
