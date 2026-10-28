package p00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsentUi;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29731o;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: p00.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C28580q implements Parcelable {
    public static final Parcelable.Creator<C28580q> CREATOR = new C28579p();

    /* JADX INFO: renamed from: E */
    public final boolean f115640E;

    /* JADX INFO: renamed from: F */
    public final String f115641F;

    /* JADX INFO: renamed from: G */
    public final String f115642G;

    /* JADX INFO: renamed from: H */
    public final boolean f115643H;

    /* JADX INFO: renamed from: I */
    public final boolean f115644I;

    /* JADX INFO: renamed from: J */
    public final C29731o f115645J;

    /* JADX INFO: renamed from: K */
    public final ConsentUi.ConsentSection f115646K;

    /* JADX INFO: renamed from: L */
    public final boolean f115647L;

    /* JADX INFO: renamed from: w */
    public final boolean f115648w;

    /* JADX INFO: renamed from: x */
    public final boolean f115649x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC41211c f115650y;

    /* JADX INFO: renamed from: z */
    public final boolean f115651z;

    public C28580q(boolean z4, boolean z13, InterfaceC41211c interfaceC41211c, boolean z14, boolean z15, String redactedPhoneNumber, String email, boolean z16, boolean z17, C29731o c29731o, ConsentUi.ConsentSection consentSection, boolean z18) {
        AbstractC22676k.m65750j(redactedPhoneNumber, "redactedPhoneNumber");
        AbstractC22676k.m65750j(email, "email");
        this.f115648w = z4;
        this.f115649x = z13;
        this.f115650y = interfaceC41211c;
        this.f115651z = z14;
        this.f115640E = z15;
        this.f115641F = redactedPhoneNumber;
        this.f115642G = email;
        this.f115643H = z16;
        this.f115644I = z17;
        this.f115645J = c29731o;
        this.f115646K = consentSection;
        this.f115647L = z18;
    }

    /* JADX INFO: renamed from: b */
    public static C28580q m86911b(C28580q c28580q, boolean z4, InterfaceC41211c interfaceC41211c, boolean z13, boolean z14, int i13) {
        boolean z15 = (i13 & 1) != 0 ? c28580q.f115648w : z4;
        boolean z16 = (i13 & 2) != 0 ? c28580q.f115649x : false;
        InterfaceC41211c interfaceC41211c2 = (i13 & 4) != 0 ? c28580q.f115650y : interfaceC41211c;
        boolean z17 = (i13 & 8) != 0 ? c28580q.f115651z : z13;
        boolean z18 = (i13 & 16) != 0 ? c28580q.f115640E : z14;
        String redactedPhoneNumber = c28580q.f115641F;
        String email = c28580q.f115642G;
        boolean z19 = c28580q.f115643H;
        boolean z24 = c28580q.f115644I;
        C29731o c29731o = c28580q.f115645J;
        ConsentUi.ConsentSection consentSection = c28580q.f115646K;
        boolean z25 = c28580q.f115647L;
        c28580q.getClass();
        AbstractC22676k.m65750j(redactedPhoneNumber, "redactedPhoneNumber");
        AbstractC22676k.m65750j(email, "email");
        return new C28580q(z15, z16, interfaceC41211c2, z17, z18, redactedPhoneNumber, email, z19, z24, c29731o, consentSection, z25);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28580q)) {
            return false;
        }
        C28580q c28580q = (C28580q) obj;
        return this.f115648w == c28580q.f115648w && this.f115649x == c28580q.f115649x && AbstractC22676k.m65745e(this.f115650y, c28580q.f115650y) && this.f115651z == c28580q.f115651z && this.f115640E == c28580q.f115640E && AbstractC22676k.m65745e(this.f115641F, c28580q.f115641F) && AbstractC22676k.m65745e(this.f115642G, c28580q.f115642G) && this.f115643H == c28580q.f115643H && this.f115644I == c28580q.f115644I && AbstractC22676k.m65745e(this.f115645J, c28580q.f115645J) && AbstractC22676k.m65745e(this.f115646K, c28580q.f115646K) && this.f115647L == c28580q.f115647L;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.f115648w) * 31, 31, this.f115649x);
        InterfaceC41211c interfaceC41211c = this.f115650y;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31, 31, this.f115651z), 31, this.f115640E), 31, this.f115641F), 31, this.f115642G), 31, this.f115643H), 31, this.f115644I);
        C29731o c29731o = this.f115645J;
        int iHashCode = (iM8289b2 + (c29731o == null ? 0 : c29731o.hashCode())) * 31;
        ConsentUi.ConsentSection consentSection = this.f115646K;
        return Boolean.hashCode(this.f115647L) + ((iHashCode + (consentSection != null ? consentSection.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32002u = AbstractC11895b.m32002u("VerificationViewState(isProcessing=", ", requestFocus=", ", errorMessage=", this.f115648w, this.f115649x);
        sbM32002u.append(this.f115650y);
        sbM32002u.append(", isSendingNewCode=");
        sbM32002u.append(this.f115651z);
        sbM32002u.append(", didSendNewCode=");
        AbstractC38963t7.m124391u(sbM32002u, this.f115640E, ", redactedPhoneNumber=", this.f115641F, ", email=");
        AbstractC38963t7.m124390t(sbM32002u, this.f115642G, ", isDialog=", this.f115643H, ", allowLogout=");
        sbM32002u.append(this.f115644I);
        sbM32002u.append(", defaultPayment=");
        sbM32002u.append(this.f115645J);
        sbM32002u.append(", consentSection=");
        sbM32002u.append(this.f115646K);
        sbM32002u.append(", isProcessingWebAuth=");
        sbM32002u.append(this.f115647L);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f115648w ? 1 : 0);
        dest.writeInt(this.f115649x ? 1 : 0);
        dest.writeParcelable(this.f115650y, i13);
        dest.writeInt(this.f115651z ? 1 : 0);
        dest.writeInt(this.f115640E ? 1 : 0);
        dest.writeString(this.f115641F);
        dest.writeString(this.f115642G);
        dest.writeInt(this.f115643H ? 1 : 0);
        dest.writeInt(this.f115644I ? 1 : 0);
        C29731o c29731o = this.f115645J;
        if (c29731o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c29731o.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f115646K, i13);
        dest.writeInt(this.f115647L ? 1 : 0);
    }
}
