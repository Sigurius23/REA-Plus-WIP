package y00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent$NextActionType;
import com.stripe.android.model.StripeIntent$Status;
import com.stripe.android.model.StripeIntent$Usage;
import java.util.List;
import java.util.Map;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25272z;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p474s.AbstractC32004s;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.g6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38840g6 implements InterfaceC38802c8 {
    public static final Parcelable.Creator<C38840g6> CREATOR = new C38943r5(7);

    /* JADX INFO: renamed from: E */
    public final String f167166E;

    /* JADX INFO: renamed from: F */
    public final String f167167F;

    /* JADX INFO: renamed from: G */
    public final boolean f167168G;

    /* JADX INFO: renamed from: H */
    public final C38915o4 f167169H;

    /* JADX INFO: renamed from: I */
    public final String f167170I;

    /* JADX INFO: renamed from: J */
    public final List f167171J;

    /* JADX INFO: renamed from: K */
    public final StripeIntent$Status f167172K;

    /* JADX INFO: renamed from: L */
    public final StripeIntent$Usage f167173L;

    /* JADX INFO: renamed from: M */
    public final C38830f6 f167174M;

    /* JADX INFO: renamed from: N */
    public final List f167175N;

    /* JADX INFO: renamed from: O */
    public final List f167176O;

    /* JADX INFO: renamed from: P */
    public final AbstractC38792b8 f167177P;

    /* JADX INFO: renamed from: Q */
    public final String f167178Q;

    /* JADX INFO: renamed from: R */
    public final boolean f167179R;

    /* JADX INFO: renamed from: w */
    public final String f167180w;

    /* JADX INFO: renamed from: x */
    public final EnumC38800c6 f167181x;

    /* JADX INFO: renamed from: y */
    public final long f167182y;

    /* JADX INFO: renamed from: z */
    public final String f167183z;

    public /* synthetic */ C38840g6(String str, long j7, String str2, boolean z4, List list, StripeIntent$Usage stripeIntent$Usage, List list2, List list3, boolean z13) {
        this(str, null, j7, str2, null, null, z4, null, null, list, null, stripeIntent$Usage, null, list2, list3, null, null, z13);
    }

    /* JADX INFO: renamed from: b */
    public static C38840g6 m124349b(C38840g6 c38840g6, C38915o4 c38915o4, List list, int i13) {
        String str = c38840g6.f167180w;
        EnumC38800c6 enumC38800c6 = c38840g6.f167181x;
        long j7 = c38840g6.f167182y;
        String str2 = c38840g6.f167183z;
        String str3 = c38840g6.f167166E;
        String str4 = c38840g6.f167167F;
        boolean z4 = c38840g6.f167168G;
        C38915o4 c38915o5 = (i13 & 128) != 0 ? c38840g6.f167169H : c38915o4;
        String str5 = c38840g6.f167170I;
        List paymentMethodTypes = (i13 & 512) != 0 ? c38840g6.f167171J : list;
        StripeIntent$Status stripeIntent$Status = c38840g6.f167172K;
        StripeIntent$Usage stripeIntent$Usage = c38840g6.f167173L;
        C38830f6 c38830f6 = c38840g6.f167174M;
        List unactivatedPaymentMethods = c38840g6.f167175N;
        List linkFundingSources = c38840g6.f167176O;
        AbstractC38792b8 abstractC38792b8 = c38840g6.f167177P;
        String str6 = c38840g6.f167178Q;
        boolean z13 = c38840g6.f167179R;
        c38840g6.getClass();
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
        AbstractC22676k.m65750j(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC22676k.m65750j(linkFundingSources, "linkFundingSources");
        return new C38840g6(str, enumC38800c6, j7, str2, str3, str4, z4, c38915o5, str5, paymentMethodTypes, stripeIntent$Status, stripeIntent$Usage, c38830f6, unactivatedPaymentMethods, linkFundingSources, abstractC38792b8, str6, z13);
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: G */
    public final Map mo124326G() {
        Map mapM99544m;
        String str = this.f167178Q;
        return (str == null || (mapM99544m = AbstractC32004s.m99544m(new JSONObject(str))) == null) ? C25272z.f99163w : mapM99544m;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: K */
    public final String mo124327K() {
        return this.f167170I;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: O */
    public final StripeIntent$NextActionType mo124328O() {
        AbstractC38792b8 abstractC38792b8 = this.f167177P;
        if (abstractC38792b8 instanceof AbstractC38990w7) {
            return StripeIntent$NextActionType.UseStripeSdk;
        }
        if (abstractC38792b8 instanceof C38945r7) {
            return StripeIntent$NextActionType.RedirectToUrl;
        }
        if (abstractC38792b8 instanceof C38909n7) {
            return StripeIntent$NextActionType.DisplayOxxoDetails;
        }
        if (abstractC38792b8 instanceof C38881k7) {
            return StripeIntent$NextActionType.DisplayBoletoDetails;
        }
        if (abstractC38792b8 instanceof C38891l7) {
            return StripeIntent$NextActionType.DisplayKonbiniDetails;
        }
        if (abstractC38792b8 instanceof C38900m7) {
            return StripeIntent$NextActionType.DisplayMultibancoDetails;
        }
        if (abstractC38792b8 instanceof C39017z7) {
            return StripeIntent$NextActionType.VerifyWithMicrodeposits;
        }
        if (abstractC38792b8 instanceof C38871j7) {
            return StripeIntent$NextActionType.CashAppRedirect;
        }
        if ((abstractC38792b8 instanceof C38851h7) || (abstractC38792b8 instanceof C38861i7) || (abstractC38792b8 instanceof C38782a8) || (abstractC38792b8 instanceof C39008y7) || (abstractC38792b8 instanceof C38999x7) || (abstractC38792b8 instanceof C38918o7) || (abstractC38792b8 instanceof C38927p7) || abstractC38792b8 == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: X */
    public final boolean mo124329X() {
        return this.f167179R;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: Y */
    public final C38915o4 mo124330Y() {
        return this.f167169H;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: c */
    public final StripeIntent$Status mo124331c() {
        return this.f167172K;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38840g6)) {
            return false;
        }
        C38840g6 c38840g6 = (C38840g6) obj;
        return AbstractC22676k.m65745e(this.f167180w, c38840g6.f167180w) && this.f167181x == c38840g6.f167181x && this.f167182y == c38840g6.f167182y && AbstractC22676k.m65745e(this.f167183z, c38840g6.f167183z) && AbstractC22676k.m65745e(this.f167166E, c38840g6.f167166E) && AbstractC22676k.m65745e(this.f167167F, c38840g6.f167167F) && this.f167168G == c38840g6.f167168G && AbstractC22676k.m65745e(this.f167169H, c38840g6.f167169H) && AbstractC22676k.m65745e(this.f167170I, c38840g6.f167170I) && AbstractC22676k.m65745e(this.f167171J, c38840g6.f167171J) && this.f167172K == c38840g6.f167172K && this.f167173L == c38840g6.f167173L && AbstractC22676k.m65745e(this.f167174M, c38840g6.f167174M) && AbstractC22676k.m65745e(this.f167175N, c38840g6.f167175N) && AbstractC22676k.m65745e(this.f167176O, c38840g6.f167176O) && AbstractC22676k.m65745e(this.f167177P, c38840g6.f167177P) && AbstractC22676k.m65745e(this.f167178Q, c38840g6.f167178Q) && this.f167179R == c38840g6.f167179R;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: g0 */
    public final List mo124332g0() {
        return this.f167175N;
    }

    @Override // y00.InterfaceC38802c8
    public final String getClientSecret() {
        return this.f167166E;
    }

    @Override // y00.InterfaceC38802c8
    public final String getId() {
        return this.f167180w;
    }

    public final int hashCode() {
        String str = this.f167180w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EnumC38800c6 enumC38800c6 = this.f167181x;
        int iM30451e = AbstractC11266d.m30451e((iHashCode + (enumC38800c6 == null ? 0 : enumC38800c6.hashCode())) * 31, this.f167182y, 31);
        String str2 = this.f167183z;
        int iHashCode2 = (iM30451e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167166E;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167167F;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f167168G);
        C38915o4 c38915o4 = this.f167169H;
        int iHashCode4 = (iM8289b + (c38915o4 == null ? 0 : c38915o4.hashCode())) * 31;
        String str5 = this.f167170I;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f167171J);
        StripeIntent$Status stripeIntent$Status = this.f167172K;
        int iHashCode5 = (iM31983b + (stripeIntent$Status == null ? 0 : stripeIntent$Status.hashCode())) * 31;
        StripeIntent$Usage stripeIntent$Usage = this.f167173L;
        int iHashCode6 = (iHashCode5 + (stripeIntent$Usage == null ? 0 : stripeIntent$Usage.hashCode())) * 31;
        C38830f6 c38830f6 = this.f167174M;
        int iM31983b2 = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode6 + (c38830f6 == null ? 0 : c38830f6.hashCode())) * 31, 31, this.f167175N), 31, this.f167176O);
        AbstractC38792b8 abstractC38792b8 = this.f167177P;
        int iHashCode7 = (iM31983b2 + (abstractC38792b8 == null ? 0 : abstractC38792b8.hashCode())) * 31;
        String str6 = this.f167178Q;
        return Boolean.hashCode(this.f167179R) + ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: i0 */
    public final List mo124333i0() {
        return this.f167176O;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: j0 */
    public final boolean mo124334j0() {
        return AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new StripeIntent$Status[]{StripeIntent$Status.Processing, StripeIntent$Status.Succeeded}), this.f167172K);
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: m */
    public final AbstractC38792b8 mo124335m() {
        return this.f167177P;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: p */
    public final List mo124336p() {
        return this.f167171J;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: q */
    public final String mo124337q() {
        return this.f167183z;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: q0 */
    public final boolean mo124338q0() {
        return this.f167168G;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SetupIntent(id=");
        sb4.append(this.f167180w);
        sb4.append(", cancellationReason=");
        sb4.append(this.f167181x);
        sb4.append(", created=");
        sb4.append(this.f167182y);
        sb4.append(", countryCode=");
        sb4.append(this.f167183z);
        AbstractC11266d.m30444B(sb4, ", clientSecret=", this.f167166E, ", description=", this.f167167F);
        sb4.append(", isLiveMode=");
        sb4.append(this.f167168G);
        sb4.append(", paymentMethod=");
        sb4.append(this.f167169H);
        sb4.append(", paymentMethodId=");
        sb4.append(this.f167170I);
        sb4.append(", paymentMethodTypes=");
        sb4.append(this.f167171J);
        sb4.append(", status=");
        sb4.append(this.f167172K);
        sb4.append(", usage=");
        sb4.append(this.f167173L);
        sb4.append(", lastSetupError=");
        sb4.append(this.f167174M);
        sb4.append(", unactivatedPaymentMethods=");
        sb4.append(this.f167175N);
        sb4.append(", linkFundingSources=");
        sb4.append(this.f167176O);
        sb4.append(", nextActionData=");
        sb4.append(this.f167177P);
        sb4.append(", paymentMethodOptionsJsonString=");
        sb4.append(this.f167178Q);
        sb4.append(", automaticPaymentMethodsEnabled=");
        sb4.append(this.f167179R);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167180w);
        EnumC38800c6 enumC38800c6 = this.f167181x;
        if (enumC38800c6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38800c6.name());
        }
        dest.writeLong(this.f167182y);
        dest.writeString(this.f167183z);
        dest.writeString(this.f167166E);
        dest.writeString(this.f167167F);
        dest.writeInt(this.f167168G ? 1 : 0);
        C38915o4 c38915o4 = this.f167169H;
        if (c38915o4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38915o4.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167170I);
        dest.writeStringList(this.f167171J);
        StripeIntent$Status stripeIntent$Status = this.f167172K;
        if (stripeIntent$Status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(stripeIntent$Status.name());
        }
        StripeIntent$Usage stripeIntent$Usage = this.f167173L;
        if (stripeIntent$Usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(stripeIntent$Usage.name());
        }
        C38830f6 c38830f6 = this.f167174M;
        if (c38830f6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38830f6.writeToParcel(dest, i13);
        }
        dest.writeStringList(this.f167175N);
        dest.writeStringList(this.f167176O);
        dest.writeParcelable(this.f167177P, i13);
        dest.writeString(this.f167178Q);
        dest.writeInt(this.f167179R ? 1 : 0);
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: z */
    public final boolean mo124339z() {
        return this.f167172K == StripeIntent$Status.RequiresAction;
    }

    public C38840g6(String str, EnumC38800c6 enumC38800c6, long j7, String str2, String str3, String str4, boolean z4, C38915o4 c38915o4, String str5, List paymentMethodTypes, StripeIntent$Status stripeIntent$Status, StripeIntent$Usage stripeIntent$Usage, C38830f6 c38830f6, List unactivatedPaymentMethods, List linkFundingSources, AbstractC38792b8 abstractC38792b8, String str6, boolean z13) {
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
        AbstractC22676k.m65750j(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC22676k.m65750j(linkFundingSources, "linkFundingSources");
        this.f167180w = str;
        this.f167181x = enumC38800c6;
        this.f167182y = j7;
        this.f167183z = str2;
        this.f167166E = str3;
        this.f167167F = str4;
        this.f167168G = z4;
        this.f167169H = c38915o4;
        this.f167170I = str5;
        this.f167171J = paymentMethodTypes;
        this.f167172K = stripeIntent$Status;
        this.f167173L = stripeIntent$Usage;
        this.f167174M = c38830f6;
        this.f167175N = unactivatedPaymentMethods;
        this.f167176O = linkFundingSources;
        this.f167177P = abstractC38792b8;
        this.f167178Q = str6;
        this.f167179R = z13;
    }
}
