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
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p474s.AbstractC32004s;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.l3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38887l3 implements InterfaceC38802c8 {
    public static final Parcelable.Creator<C38887l3> CREATOR = new C38967u2(7);

    /* JADX INFO: renamed from: E */
    public final EnumC38807d3 f167370E;

    /* JADX INFO: renamed from: F */
    public final EnumC38817e3 f167371F;

    /* JADX INFO: renamed from: G */
    public final String f167372G;

    /* JADX INFO: renamed from: H */
    public final EnumC38837g3 f167373H;

    /* JADX INFO: renamed from: I */
    public final String f167374I;

    /* JADX INFO: renamed from: J */
    public final long f167375J;

    /* JADX INFO: renamed from: K */
    public final String f167376K;

    /* JADX INFO: renamed from: L */
    public final String f167377L;

    /* JADX INFO: renamed from: M */
    public final boolean f167378M;

    /* JADX INFO: renamed from: N */
    public final C38915o4 f167379N;

    /* JADX INFO: renamed from: O */
    public final String f167380O;

    /* JADX INFO: renamed from: P */
    public final String f167381P;

    /* JADX INFO: renamed from: Q */
    public final StripeIntent$Status f167382Q;

    /* JADX INFO: renamed from: R */
    public final StripeIntent$Usage f167383R;

    /* JADX INFO: renamed from: S */
    public final C38857i3 f167384S;

    /* JADX INFO: renamed from: T */
    public final C38867j3 f167385T;

    /* JADX INFO: renamed from: U */
    public final List f167386U;

    /* JADX INFO: renamed from: V */
    public final List f167387V;

    /* JADX INFO: renamed from: W */
    public final AbstractC38792b8 f167388W;

    /* JADX INFO: renamed from: X */
    public final String f167389X;

    /* JADX INFO: renamed from: Y */
    public final boolean f167390Y;

    /* JADX INFO: renamed from: w */
    public final String f167391w;

    /* JADX INFO: renamed from: x */
    public final List f167392x;

    /* JADX INFO: renamed from: y */
    public final Long f167393y;

    /* JADX INFO: renamed from: z */
    public final long f167394z;

    public C38887l3(String str, List paymentMethodTypes, Long l7, long j7, EnumC38807d3 enumC38807d3, EnumC38817e3 captureMethod, String str2, EnumC38837g3 confirmationMethod, String str3, long j13, String str4, String str5, boolean z4, C38915o4 c38915o4, String str6, String str7, StripeIntent$Status stripeIntent$Status, StripeIntent$Usage stripeIntent$Usage, C38857i3 c38857i3, C38867j3 c38867j3, List unactivatedPaymentMethods, List linkFundingSources, AbstractC38792b8 abstractC38792b8, String str8, boolean z13) {
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
        AbstractC22676k.m65750j(captureMethod, "captureMethod");
        AbstractC22676k.m65750j(confirmationMethod, "confirmationMethod");
        AbstractC22676k.m65750j(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        AbstractC22676k.m65750j(linkFundingSources, "linkFundingSources");
        this.f167391w = str;
        this.f167392x = paymentMethodTypes;
        this.f167393y = l7;
        this.f167394z = j7;
        this.f167370E = enumC38807d3;
        this.f167371F = captureMethod;
        this.f167372G = str2;
        this.f167373H = confirmationMethod;
        this.f167374I = str3;
        this.f167375J = j13;
        this.f167376K = str4;
        this.f167377L = str5;
        this.f167378M = z4;
        this.f167379N = c38915o4;
        this.f167380O = str6;
        this.f167381P = str7;
        this.f167382Q = stripeIntent$Status;
        this.f167383R = stripeIntent$Usage;
        this.f167384S = c38857i3;
        this.f167385T = c38867j3;
        this.f167386U = unactivatedPaymentMethods;
        this.f167387V = linkFundingSources;
        this.f167388W = abstractC38792b8;
        this.f167389X = str8;
        this.f167390Y = z13;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: G */
    public final Map mo124326G() {
        Map mapM99544m;
        String str = this.f167389X;
        return (str == null || (mapM99544m = AbstractC32004s.m99544m(new JSONObject(str))) == null) ? C25272z.f99163w : mapM99544m;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: K */
    public final String mo124327K() {
        return this.f167380O;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: O */
    public final StripeIntent$NextActionType mo124328O() {
        AbstractC38792b8 abstractC38792b8 = this.f167388W;
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
        if (abstractC38792b8 instanceof C38918o7) {
            return StripeIntent$NextActionType.DisplayPayNowDetails;
        }
        if (abstractC38792b8 instanceof C38927p7) {
            return StripeIntent$NextActionType.DisplayPromptPayDetails;
        }
        if (abstractC38792b8 instanceof C39017z7) {
            return StripeIntent$NextActionType.VerifyWithMicrodeposits;
        }
        if (abstractC38792b8 instanceof C39008y7) {
            return StripeIntent$NextActionType.UpiAwaitNotification;
        }
        if (abstractC38792b8 instanceof C38871j7) {
            return StripeIntent$NextActionType.CashAppRedirect;
        }
        if (abstractC38792b8 instanceof C38861i7) {
            return StripeIntent$NextActionType.BlikAuthorize;
        }
        if (abstractC38792b8 instanceof C38999x7) {
            return StripeIntent$NextActionType.SwishRedirect;
        }
        if ((abstractC38792b8 instanceof C38851h7) || (abstractC38792b8 instanceof C38782a8) || abstractC38792b8 == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: X */
    public final boolean mo124329X() {
        return this.f167390Y;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: Y */
    public final C38915o4 mo124330Y() {
        return this.f167379N;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[RETURN] */
    /* JADX INFO: renamed from: b */
    public final boolean m124359b(String code) {
        boolean zHas;
        JSONObject jSONObjectOptJSONObject;
        boolean zM65745e;
        JSONObject jSONObjectOptJSONObject2;
        String strOptString;
        AbstractC22676k.m65750j(code, "code");
        StripeIntent$Usage stripeIntent$Usage = this.f167383R;
        int i13 = stripeIntent$Usage == null ? -1 : AbstractC38877k3.f167324a[stripeIntent$Usage.ordinal()];
        String str = this.f167389X;
        if (i13 == -1) {
            if (str != null || (jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(code)) == null) {
                zHas = false;
            } else {
                zHas = jSONObjectOptJSONObject.has("setup_future_usage");
            }
            if (zHas) {
                if (str != null) {
                    jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject(code);
                    if (jSONObjectOptJSONObject2 != null) {
                        strOptString = jSONObjectOptJSONObject2.optString("setup_future_usage");
                    } else {
                        strOptString = null;
                    }
                    zM65745e = AbstractC22676k.m65745e(strOptString, "none");
                } else {
                    zM65745e = false;
                }
                if (!zM65745e) {
                    return true;
                }
            }
        } else if (i13 == 1 || i13 == 2) {
            if (str != null) {
                jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject(code);
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString = jSONObjectOptJSONObject2.optString("setup_future_usage");
                } else {
                    strOptString = null;
                }
                zM65745e = AbstractC22676k.m65745e(strOptString, "none");
            } else {
                zM65745e = false;
            }
            if (!zM65745e) {
                return true;
            }
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (str != null) {
                zHas = false;
            } else {
                zHas = false;
            }
            if (zHas) {
                if (str != null) {
                    jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject(code);
                    if (jSONObjectOptJSONObject2 != null) {
                        strOptString = jSONObjectOptJSONObject2.optString("setup_future_usage");
                    } else {
                        strOptString = null;
                    }
                    zM65745e = AbstractC22676k.m65745e(strOptString, "none");
                } else {
                    zM65745e = false;
                }
                if (!zM65745e) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: c */
    public final StripeIntent$Status mo124331c() {
        return this.f167382Q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38887l3)) {
            return false;
        }
        C38887l3 c38887l3 = (C38887l3) obj;
        return AbstractC22676k.m65745e(this.f167391w, c38887l3.f167391w) && AbstractC22676k.m65745e(this.f167392x, c38887l3.f167392x) && AbstractC22676k.m65745e(this.f167393y, c38887l3.f167393y) && this.f167394z == c38887l3.f167394z && this.f167370E == c38887l3.f167370E && this.f167371F == c38887l3.f167371F && AbstractC22676k.m65745e(this.f167372G, c38887l3.f167372G) && this.f167373H == c38887l3.f167373H && AbstractC22676k.m65745e(this.f167374I, c38887l3.f167374I) && this.f167375J == c38887l3.f167375J && AbstractC22676k.m65745e(this.f167376K, c38887l3.f167376K) && AbstractC22676k.m65745e(this.f167377L, c38887l3.f167377L) && this.f167378M == c38887l3.f167378M && AbstractC22676k.m65745e(this.f167379N, c38887l3.f167379N) && AbstractC22676k.m65745e(this.f167380O, c38887l3.f167380O) && AbstractC22676k.m65745e(this.f167381P, c38887l3.f167381P) && this.f167382Q == c38887l3.f167382Q && this.f167383R == c38887l3.f167383R && AbstractC22676k.m65745e(this.f167384S, c38887l3.f167384S) && AbstractC22676k.m65745e(this.f167385T, c38887l3.f167385T) && AbstractC22676k.m65745e(this.f167386U, c38887l3.f167386U) && AbstractC22676k.m65745e(this.f167387V, c38887l3.f167387V) && AbstractC22676k.m65745e(this.f167388W, c38887l3.f167388W) && AbstractC22676k.m65745e(this.f167389X, c38887l3.f167389X) && this.f167390Y == c38887l3.f167390Y;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: g0 */
    public final List mo124332g0() {
        return this.f167386U;
    }

    @Override // y00.InterfaceC38802c8
    public final String getClientSecret() {
        return this.f167372G;
    }

    @Override // y00.InterfaceC38802c8
    public final String getId() {
        return this.f167391w;
    }

    public final int hashCode() {
        String str = this.f167391w;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.f167392x);
        Long l7 = this.f167393y;
        int iM30451e = AbstractC11266d.m30451e((iM31983b + (l7 == null ? 0 : l7.hashCode())) * 31, this.f167394z, 31);
        EnumC38807d3 enumC38807d3 = this.f167370E;
        int iHashCode = (this.f167371F.hashCode() + ((iM30451e + (enumC38807d3 == null ? 0 : enumC38807d3.hashCode())) * 31)) * 31;
        String str2 = this.f167372G;
        int iHashCode2 = (this.f167373H.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f167374I;
        int iM30451e2 = AbstractC11266d.m30451e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.f167375J, 31);
        String str4 = this.f167376K;
        int iHashCode3 = (iM30451e2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167377L;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f167378M);
        C38915o4 c38915o4 = this.f167379N;
        int iHashCode4 = (iM8289b + (c38915o4 == null ? 0 : c38915o4.hashCode())) * 31;
        String str6 = this.f167380O;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f167381P;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StripeIntent$Status stripeIntent$Status = this.f167382Q;
        int iHashCode7 = (iHashCode6 + (stripeIntent$Status == null ? 0 : stripeIntent$Status.hashCode())) * 31;
        StripeIntent$Usage stripeIntent$Usage = this.f167383R;
        int iHashCode8 = (iHashCode7 + (stripeIntent$Usage == null ? 0 : stripeIntent$Usage.hashCode())) * 31;
        C38857i3 c38857i3 = this.f167384S;
        int iHashCode9 = (iHashCode8 + (c38857i3 == null ? 0 : c38857i3.hashCode())) * 31;
        C38867j3 c38867j3 = this.f167385T;
        int iM31983b2 = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode9 + (c38867j3 == null ? 0 : c38867j3.hashCode())) * 31, 31, this.f167386U), 31, this.f167387V);
        AbstractC38792b8 abstractC38792b8 = this.f167388W;
        int iHashCode10 = (iM31983b2 + (abstractC38792b8 == null ? 0 : abstractC38792b8.hashCode())) * 31;
        String str8 = this.f167389X;
        return Boolean.hashCode(this.f167390Y) + ((iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: i0 */
    public final List mo124333i0() {
        return this.f167387V;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: j0 */
    public final boolean mo124334j0() {
        return AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new StripeIntent$Status[]{StripeIntent$Status.Processing, StripeIntent$Status.RequiresCapture, StripeIntent$Status.Succeeded}), this.f167382Q);
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: m */
    public final AbstractC38792b8 mo124335m() {
        return this.f167388W;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: p */
    public final List mo124336p() {
        return this.f167392x;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: q */
    public final String mo124337q() {
        return this.f167374I;
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: q0 */
    public final boolean mo124338q0() {
        return this.f167378M;
    }

    public final String toString() {
        StringBuilder sbM94766o = AbstractC30802r.m94766o("PaymentIntent(id=", this.f167391w, ", paymentMethodTypes=", ", amount=", this.f167392x);
        sbM94766o.append(this.f167393y);
        sbM94766o.append(", canceledAt=");
        sbM94766o.append(this.f167394z);
        sbM94766o.append(", cancellationReason=");
        sbM94766o.append(this.f167370E);
        sbM94766o.append(", captureMethod=");
        sbM94766o.append(this.f167371F);
        sbM94766o.append(", clientSecret=");
        sbM94766o.append(this.f167372G);
        sbM94766o.append(", confirmationMethod=");
        sbM94766o.append(this.f167373H);
        sbM94766o.append(", countryCode=");
        sbM94766o.append(this.f167374I);
        sbM94766o.append(", created=");
        sbM94766o.append(this.f167375J);
        sbM94766o.append(", currency=");
        sbM94766o.append(this.f167376K);
        sbM94766o.append(", description=");
        sbM94766o.append(this.f167377L);
        sbM94766o.append(", isLiveMode=");
        sbM94766o.append(this.f167378M);
        sbM94766o.append(", paymentMethod=");
        sbM94766o.append(this.f167379N);
        sbM94766o.append(", paymentMethodId=");
        sbM94766o.append(this.f167380O);
        sbM94766o.append(", receiptEmail=");
        sbM94766o.append(this.f167381P);
        sbM94766o.append(", status=");
        sbM94766o.append(this.f167382Q);
        sbM94766o.append(", setupFutureUsage=");
        sbM94766o.append(this.f167383R);
        sbM94766o.append(", lastPaymentError=");
        sbM94766o.append(this.f167384S);
        sbM94766o.append(", shipping=");
        sbM94766o.append(this.f167385T);
        sbM94766o.append(", unactivatedPaymentMethods=");
        sbM94766o.append(this.f167386U);
        sbM94766o.append(", linkFundingSources=");
        sbM94766o.append(this.f167387V);
        sbM94766o.append(", nextActionData=");
        sbM94766o.append(this.f167388W);
        sbM94766o.append(", paymentMethodOptionsJsonString=");
        sbM94766o.append(this.f167389X);
        sbM94766o.append(", automaticPaymentMethodsEnabled=");
        sbM94766o.append(this.f167390Y);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167391w);
        dest.writeStringList(this.f167392x);
        Long l7 = this.f167393y;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeLong(this.f167394z);
        EnumC38807d3 enumC38807d3 = this.f167370E;
        if (enumC38807d3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38807d3.name());
        }
        dest.writeString(this.f167371F.name());
        dest.writeString(this.f167372G);
        dest.writeString(this.f167373H.name());
        dest.writeString(this.f167374I);
        dest.writeLong(this.f167375J);
        dest.writeString(this.f167376K);
        dest.writeString(this.f167377L);
        dest.writeInt(this.f167378M ? 1 : 0);
        C38915o4 c38915o4 = this.f167379N;
        if (c38915o4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38915o4.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167380O);
        dest.writeString(this.f167381P);
        StripeIntent$Status stripeIntent$Status = this.f167382Q;
        if (stripeIntent$Status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(stripeIntent$Status.name());
        }
        StripeIntent$Usage stripeIntent$Usage = this.f167383R;
        if (stripeIntent$Usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(stripeIntent$Usage.name());
        }
        C38857i3 c38857i3 = this.f167384S;
        if (c38857i3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38857i3.writeToParcel(dest, i13);
        }
        C38867j3 c38867j3 = this.f167385T;
        if (c38867j3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38867j3.writeToParcel(dest, i13);
        }
        dest.writeStringList(this.f167386U);
        dest.writeStringList(this.f167387V);
        dest.writeParcelable(this.f167388W, i13);
        dest.writeString(this.f167389X);
        dest.writeInt(this.f167390Y ? 1 : 0);
    }

    @Override // y00.InterfaceC38802c8
    /* JADX INFO: renamed from: z */
    public final boolean mo124339z() {
        return this.f167382Q == StripeIntent$Status.RequiresAction;
    }

    public /* synthetic */ C38887l3(String str, List list, Long l7, long j7, EnumC38807d3 enumC38807d3, EnumC38817e3 enumC38817e3, String str2, EnumC38837g3 enumC38837g3, String str3, long j13, String str4, String str5, boolean z4, C38915o4 c38915o4, String str6, String str7, StripeIntent$Status stripeIntent$Status, StripeIntent$Usage stripeIntent$Usage, C38857i3 c38857i3, C38867j3 c38867j3, List list2, List list3, AbstractC38792b8 abstractC38792b8, String str8, boolean z13, int i13) {
        this(str, list, l7, (i13 & 8) != 0 ? 0L : j7, (i13 & 16) != 0 ? null : enumC38807d3, (i13 & 32) != 0 ? EnumC38817e3.Automatic : enumC38817e3, str2, (i13 & 128) != 0 ? EnumC38837g3.Automatic : enumC38837g3, str3, j13, str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str5, z4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c38915o4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str6, (32768 & i13) != 0 ? null : str7, (65536 & i13) != 0 ? null : stripeIntent$Status, (131072 & i13) != 0 ? null : stripeIntent$Usage, (262144 & i13) != 0 ? null : c38857i3, (524288 & i13) != 0 ? null : c38867j3, list2, (2097152 & i13) != 0 ? C25271y.f99162w : list3, (4194304 & i13) != 0 ? null : abstractC38792b8, str8, (i13 & 16777216) != 0 ? false : z13);
    }
}
