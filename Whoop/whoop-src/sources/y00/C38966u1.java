package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p499t9.C33623c0;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.u1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38966u1 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38966u1> CREATOR = new C38992x0(3);

    /* JADX INFO: renamed from: E */
    public final List f167720E;

    /* JADX INFO: renamed from: F */
    public final Map f167721F;

    /* JADX INFO: renamed from: G */
    public final C38939r1 f167722G;

    /* JADX INFO: renamed from: H */
    public final C38921p1 f167723H;

    /* JADX INFO: renamed from: I */
    public final String f167724I;

    /* JADX INFO: renamed from: J */
    public final String f167725J;

    /* JADX INFO: renamed from: K */
    public final C38785b1 f167726K;

    /* JADX INFO: renamed from: L */
    public final boolean f167727L;

    /* JADX INFO: renamed from: M */
    public final Throwable f167728M;

    /* JADX INFO: renamed from: N */
    public final Object f167729N;

    /* JADX INFO: renamed from: O */
    public final String f167730O;

    /* JADX INFO: renamed from: P */
    public final C38797c3 f167731P;

    /* JADX INFO: renamed from: Q */
    public final String f167732Q;

    /* JADX INFO: renamed from: R */
    public final String f167733R;

    /* JADX INFO: renamed from: S */
    public final String f167734S;

    /* JADX INFO: renamed from: w */
    public final C38957t1 f167735w;

    /* JADX INFO: renamed from: x */
    public final String f167736x;

    /* JADX INFO: renamed from: y */
    public final String f167737y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC38802c8 f167738z;

    public C38966u1(C38957t1 c38957t1, String str, String str2, InterfaceC38802c8 stripeIntent, List orderedPaymentMethodTypesAndWallets, Map map, C38939r1 c38939r1, C38921p1 c38921p1, String str3, String str4, C38785b1 c38785b1, boolean z4, Throwable th3, List list, String elementsSessionId, C38797c3 c38797c3, String str5, String str6, String str7) {
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        AbstractC22676k.m65750j(orderedPaymentMethodTypesAndWallets, "orderedPaymentMethodTypesAndWallets");
        AbstractC22676k.m65750j(elementsSessionId, "elementsSessionId");
        this.f167735w = c38957t1;
        this.f167736x = str;
        this.f167737y = str2;
        this.f167738z = stripeIntent;
        this.f167720E = orderedPaymentMethodTypesAndWallets;
        this.f167721F = map;
        this.f167722G = c38939r1;
        this.f167723H = c38921p1;
        this.f167724I = str3;
        this.f167725J = str4;
        this.f167726K = c38785b1;
        this.f167727L = z4;
        this.f167728M = th3;
        this.f167729N = list;
        this.f167730O = elementsSessionId;
        this.f167731P = c38797c3;
        this.f167732Q = str5;
        this.f167733R = str6;
        this.f167734S = str7;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m124397b() {
        boolean z4;
        InterfaceC38802c8 interfaceC38802c8 = this.f167738z;
        List listMo124336p = interfaceC38802c8.mo124336p();
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        boolean zContains = listMo124336p.contains("link");
        List listMo124333i0 = interfaceC38802c8.mo124333i0();
        if (!(listMo124333i0 instanceof Collection) || !listMo124333i0.isEmpty()) {
            Iterator it = listMo124333i0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                if (AbstractC38975v1.f167767a.contains((String) it.next())) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        if (!zContains || !z4) {
            C38957t1 c38957t1 = this.f167735w;
            if (!(c38957t1 != null ? c38957t1.f167691x : false)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38966u1)) {
            return false;
        }
        C38966u1 c38966u1 = (C38966u1) obj;
        return AbstractC22676k.m65745e(this.f167735w, c38966u1.f167735w) && AbstractC22676k.m65745e(this.f167736x, c38966u1.f167736x) && AbstractC22676k.m65745e(this.f167737y, c38966u1.f167737y) && AbstractC22676k.m65745e(this.f167738z, c38966u1.f167738z) && AbstractC22676k.m65745e(this.f167720E, c38966u1.f167720E) && this.f167721F.equals(c38966u1.f167721F) && AbstractC22676k.m65745e(this.f167722G, c38966u1.f167722G) && AbstractC22676k.m65745e(this.f167723H, c38966u1.f167723H) && AbstractC22676k.m65745e(this.f167724I, c38966u1.f167724I) && AbstractC22676k.m65745e(this.f167725J, c38966u1.f167725J) && AbstractC22676k.m65745e(this.f167726K, c38966u1.f167726K) && this.f167727L == c38966u1.f167727L && AbstractC22676k.m65745e(this.f167728M, c38966u1.f167728M) && this.f167729N.equals(c38966u1.f167729N) && AbstractC22676k.m65745e(this.f167730O, c38966u1.f167730O) && AbstractC22676k.m65745e(this.f167731P, c38966u1.f167731P) && AbstractC22676k.m65745e(this.f167732Q, c38966u1.f167732Q) && AbstractC22676k.m65745e(this.f167733R, c38966u1.f167733R) && AbstractC22676k.m65745e(this.f167734S, c38966u1.f167734S);
    }

    public final int hashCode() {
        C38957t1 c38957t1 = this.f167735w;
        int iHashCode = (c38957t1 == null ? 0 : c38957t1.hashCode()) * 31;
        String str = this.f167736x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167737y;
        int iM11821e = AbstractC3855a.m11821e(this.f167721F, AbstractC11895b.m31983b((this.f167738z.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f167720E), 31);
        C38939r1 c38939r1 = this.f167722G;
        int iHashCode3 = (iM11821e + (c38939r1 == null ? 0 : c38939r1.hashCode())) * 31;
        C38921p1 c38921p1 = this.f167723H;
        int iHashCode4 = (iHashCode3 + (c38921p1 == null ? 0 : c38921p1.hashCode())) * 31;
        String str3 = this.f167724I;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167725J;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C38785b1 c38785b1 = this.f167726K;
        int iM8289b = AbstractC2875y.m8289b((iHashCode6 + (c38785b1 == null ? 0 : c38785b1.hashCode())) * 31, 31, this.f167727L);
        Throwable th3 = this.f167728M;
        int iM30450d = AbstractC11266d.m30450d(AbstractC33745d.m106644c((iM8289b + (th3 == null ? 0 : th3.hashCode())) * 31, 31, this.f167729N), 31, this.f167730O);
        C38797c3 c38797c3 = this.f167731P;
        int iHashCode7 = (iM30450d + (c38797c3 == null ? 0 : c38797c3.hashCode())) * 31;
        String str5 = this.f167732Q;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167733R;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f167734S;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ElementsSession(linkSettings=");
        sb4.append(this.f167735w);
        sb4.append(", paymentMethodSpecs=");
        sb4.append(this.f167736x);
        sb4.append(", externalPaymentMethodData=");
        sb4.append(this.f167737y);
        sb4.append(", stripeIntent=");
        sb4.append(this.f167738z);
        sb4.append(", orderedPaymentMethodTypesAndWallets=");
        sb4.append(this.f167720E);
        sb4.append(", flags=");
        sb4.append(this.f167721F);
        sb4.append(", experimentsData=");
        sb4.append(this.f167722G);
        sb4.append(", customer=");
        sb4.append(this.f167723H);
        sb4.append(", merchantCountry=");
        AbstractC11266d.m30444B(sb4, this.f167724I, ", merchantLogoUrl=", this.f167725J, ", cardBrandChoice=");
        sb4.append(this.f167726K);
        sb4.append(", isGooglePayEnabled=");
        sb4.append(this.f167727L);
        sb4.append(", sessionsError=");
        sb4.append(this.f167728M);
        sb4.append(", customPaymentMethods=");
        sb4.append(this.f167729N);
        sb4.append(", elementsSessionId=");
        sb4.append(this.f167730O);
        sb4.append(", passiveCaptcha=");
        sb4.append(this.f167731P);
        sb4.append(", elementsSessionConfigId=");
        AbstractC11266d.m30444B(sb4, this.f167732Q, ", accountId=", this.f167733R, ", merchantId=");
        return AbstractC25012a.m73376i(this.f167734S, ")", sb4);
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38957t1 c38957t1 = this.f167735w;
        if (c38957t1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38957t1.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167736x);
        dest.writeString(this.f167737y);
        dest.writeParcelable(this.f167738z, i13);
        dest.writeStringList(this.f167720E);
        Map map = this.f167721F;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString(((EnumC38948s1) entry.getKey()).name());
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
        C38939r1 c38939r1 = this.f167722G;
        if (c38939r1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38939r1.writeToParcel(dest, i13);
        }
        C38921p1 c38921p1 = this.f167723H;
        if (c38921p1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38921p1.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167724I);
        dest.writeString(this.f167725J);
        C38785b1 c38785b1 = this.f167726K;
        if (c38785b1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38785b1.writeToParcel(dest, i13);
        }
        dest.writeInt(this.f167727L ? 1 : 0);
        dest.writeSerializable(this.f167728M);
        ?? r10 = this.f167729N;
        dest.writeInt(r10.size());
        Iterator it = r10.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i13);
        }
        dest.writeString(this.f167730O);
        C38797c3 c38797c3 = this.f167731P;
        if (c38797c3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38797c3.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167732Q);
        dest.writeString(this.f167733R);
        dest.writeString(this.f167734S);
    }
}
