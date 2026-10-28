package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import n83.C26463f;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C38982w implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38982w> CREATOR = new C38873k(9);

    /* JADX INFO: renamed from: E */
    public final C38919p f167789E;

    /* JADX INFO: renamed from: F */
    public final C38994x2 f167790F;

    /* JADX INFO: renamed from: G */
    public final Boolean f167791G;

    /* JADX INFO: renamed from: H */
    public final String f167792H;

    /* JADX INFO: renamed from: I */
    public final C38973v f167793I;

    /* JADX INFO: renamed from: J */
    public final C38901n f167794J;

    /* JADX INFO: renamed from: w */
    public final String f167795w;

    /* JADX INFO: renamed from: x */
    public final C38809d5 f167796x;

    /* JADX INFO: renamed from: y */
    public final String f167797y;

    /* JADX INFO: renamed from: z */
    public final EnumC38910o f167798z;

    public C38982w(String str, C38809d5 c38809d5, String str2, EnumC38910o enumC38910o, C38919p c38919p, C38994x2 c38994x2, Boolean bool, String str3, C38973v c38973v, C38901n c38901n) {
        this.f167795w = str;
        this.f167796x = c38809d5;
        this.f167797y = str2;
        this.f167798z = enumC38910o;
        this.f167789E = c38919p;
        this.f167790F = c38994x2;
        this.f167791G = bool;
        this.f167792H = str3;
        this.f167793I = c38973v;
        this.f167794J = c38901n;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C26463f c26463f = new C26463f();
        String str = this.f167795w;
        if (str != null) {
            c26463f.put("payment_method", str);
        }
        C38809d5 c38809d5 = this.f167796x;
        if (c38809d5 != null) {
            c26463f.put("payment_method_data", c38809d5.mo124325c0());
        }
        String str2 = this.f167797y;
        if (str2 != null) {
            c26463f.put("return_url", str2);
        }
        EnumC38910o enumC38910o = this.f167798z;
        if (enumC38910o == null || enumC38910o == EnumC38910o.Blank) {
            enumC38910o = null;
        }
        if (enumC38910o != null) {
            c26463f.put("setup_future_usage", enumC38910o.f167492w);
        }
        C38919p c38919p = this.f167789E;
        if (c38919p != null) {
            c26463f.put("shipping", c38919p.mo124325c0());
        }
        C38994x2 c38994x2 = this.f167790F;
        if (c38994x2 != null) {
            c26463f.put("mandate_data", c38994x2.mo124325c0());
        }
        Boolean bool = this.f167791G;
        if (bool != null) {
            c26463f.put("set_as_default_payment_method", bool);
        }
        String str3 = this.f167792H;
        if (str3 != null) {
            c26463f.put("payment_method_options", AbstractC25247g0.m73989X(new C23465k("card", AbstractC31061c.m95645u("cvc", str3))));
        }
        C38973v c38973v = this.f167793I;
        if (c38973v != null) {
            c26463f.put("client_context", c38973v.mo124325c0());
        }
        C38901n c38901n = this.f167794J;
        if (c38901n != null) {
            c26463f.put("client_attribution_metadata", c38901n.mo124325c0());
        }
        return c26463f.m78380b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38982w)) {
            return false;
        }
        C38982w c38982w = (C38982w) obj;
        return AbstractC22676k.m65745e(this.f167795w, c38982w.f167795w) && AbstractC22676k.m65745e(this.f167796x, c38982w.f167796x) && AbstractC22676k.m65745e(this.f167797y, c38982w.f167797y) && this.f167798z == c38982w.f167798z && AbstractC22676k.m65745e(this.f167789E, c38982w.f167789E) && AbstractC22676k.m65745e(this.f167790F, c38982w.f167790F) && AbstractC22676k.m65745e(this.f167791G, c38982w.f167791G) && AbstractC22676k.m65745e(this.f167792H, c38982w.f167792H) && AbstractC22676k.m65745e(this.f167793I, c38982w.f167793I) && AbstractC22676k.m65745e(this.f167794J, c38982w.f167794J);
    }

    public final int hashCode() {
        String str = this.f167795w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C38809d5 c38809d5 = this.f167796x;
        int iHashCode2 = (iHashCode + (c38809d5 == null ? 0 : c38809d5.hashCode())) * 31;
        String str2 = this.f167797y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC38910o enumC38910o = this.f167798z;
        int iHashCode4 = (iHashCode3 + (enumC38910o == null ? 0 : enumC38910o.hashCode())) * 31;
        C38919p c38919p = this.f167789E;
        int iHashCode5 = (iHashCode4 + (c38919p == null ? 0 : c38919p.hashCode())) * 31;
        C38994x2 c38994x2 = this.f167790F;
        int iHashCode6 = (iHashCode5 + (c38994x2 == null ? 0 : c38994x2.f167841w.hashCode())) * 31;
        Boolean bool = this.f167791G;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f167792H;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C38973v c38973v = this.f167793I;
        int iHashCode9 = (iHashCode8 + (c38973v == null ? 0 : c38973v.hashCode())) * 31;
        C38901n c38901n = this.f167794J;
        return iHashCode9 + (c38901n != null ? c38901n.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ConfirmationTokenParams(paymentMethodId=");
        sb4.append(this.f167795w);
        sb4.append(", paymentMethodData=");
        sb4.append(this.f167796x);
        sb4.append(", returnUrl=");
        sb4.append(this.f167797y);
        sb4.append(", setUpFutureUsage=");
        sb4.append(this.f167798z);
        sb4.append(", shipping=");
        sb4.append(this.f167789E);
        sb4.append(", mandateDataParams=");
        sb4.append(this.f167790F);
        sb4.append(", setAsDefaultPaymentMethod=");
        AbstractC13673n.m38576w(this.f167791G, ", cvc=", this.f167792H, ", clientContext=", sb4);
        sb4.append(this.f167793I);
        sb4.append(", clientAttributionMetadata=");
        sb4.append(this.f167794J);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167795w);
        C38809d5 c38809d5 = this.f167796x;
        if (c38809d5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38809d5.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167797y);
        EnumC38910o enumC38910o = this.f167798z;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
        C38919p c38919p = this.f167789E;
        if (c38919p == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38919p.writeToParcel(dest, i13);
        }
        C38994x2 c38994x2 = this.f167790F;
        if (c38994x2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38994x2.writeToParcel(dest, i13);
        }
        Boolean bool = this.f167791G;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        dest.writeString(this.f167792H);
        C38973v c38973v = this.f167793I;
        if (c38973v == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38973v.writeToParcel(dest, i13);
        }
        C38901n c38901n = this.f167794J;
        if (c38901n == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38901n.writeToParcel(dest, i13);
        }
    }
}
