package y00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent$Usage;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38983w0 implements InterfaceC39010z0 {
    public static final Parcelable.Creator<C38983w0> CREATOR = new C38873k(29);

    /* JADX INFO: renamed from: E */
    public final String f167799E;

    /* JADX INFO: renamed from: w */
    public final long f167800w;

    /* JADX INFO: renamed from: x */
    public final String f167801x;

    /* JADX INFO: renamed from: y */
    public final StripeIntent$Usage f167802y;

    /* JADX INFO: renamed from: z */
    public final EnumC38817e3 f167803z;

    public C38983w0(long j7, String currency, StripeIntent$Usage stripeIntent$Usage, EnumC38817e3 captureMethod, String str) {
        AbstractC22676k.m65750j(currency, "currency");
        AbstractC22676k.m65750j(captureMethod, "captureMethod");
        this.f167800w = j7;
        this.f167801x = currency;
        this.f167802y = stripeIntent$Usage;
        this.f167803z = captureMethod;
        this.f167799E = str;
    }

    @Override // y00.InterfaceC39010z0
    /* JADX INFO: renamed from: D */
    public final StripeIntent$Usage mo124401D() {
        return this.f167802y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38983w0)) {
            return false;
        }
        C38983w0 c38983w0 = (C38983w0) obj;
        return this.f167800w == c38983w0.f167800w && AbstractC22676k.m65745e(this.f167801x, c38983w0.f167801x) && this.f167802y == c38983w0.f167802y && this.f167803z == c38983w0.f167803z && AbstractC22676k.m65745e(this.f167799E, c38983w0.f167799E);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.f167800w) * 31, 31, this.f167801x);
        StripeIntent$Usage stripeIntent$Usage = this.f167802y;
        int iHashCode = (this.f167803z.hashCode() + ((iM30450d + (stripeIntent$Usage == null ? 0 : stripeIntent$Usage.hashCode())) * 31)) * 31;
        String str = this.f167799E;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // y00.InterfaceC39010z0
    /* JADX INFO: renamed from: k0 */
    public final String mo124402k0() {
        return this.f167801x;
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("Payment(amount=", ", currency=", this.f167800w, this.f167801x);
        sbM114685m.append(", setupFutureUsage=");
        sbM114685m.append(this.f167802y);
        sbM114685m.append(", captureMethod=");
        sbM114685m.append(this.f167803z);
        return AbstractC2875y.m8304q(sbM114685m, ", paymentMethodOptionsJsonString=", this.f167799E, ")");
    }

    @Override // y00.InterfaceC39010z0
    /* JADX INFO: renamed from: v */
    public final String mo124403v() {
        return "payment";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeLong(this.f167800w);
        dest.writeString(this.f167801x);
        StripeIntent$Usage stripeIntent$Usage = this.f167802y;
        if (stripeIntent$Usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(stripeIntent$Usage.name());
        }
        dest.writeString(this.f167803z.name());
        dest.writeString(this.f167799E);
    }
}
