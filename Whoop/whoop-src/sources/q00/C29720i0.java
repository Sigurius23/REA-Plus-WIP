package q00;

import androidx.profileinstaller.ProfileVerifier;
import com.stripe.android.core.model.CountryCode;
import com.whoop.android.R;
import h00.EnumC16519o0;
import h20.C16689l1;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import l40.C23328a;
import m83.AbstractC25265s;
import m83.C25271y;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p479s4.AbstractC32128i;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;
import y00.AbstractC38963t7;
import y00.C38774a0;
import y00.C38784b0;
import y00.C38991x;
import y00.C39000y;
import y00.EnumC38974v0;

/* JADX INFO: renamed from: q00.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29720i0 {

    /* JADX INFO: renamed from: A */
    public final boolean f121535A;

    /* JADX INFO: renamed from: a */
    public final List f121536a;

    /* JADX INFO: renamed from: b */
    public final String f121537b;

    /* JADX INFO: renamed from: c */
    public final boolean f121538c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC35320a f121539d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC35322b f121540e;

    /* JADX INFO: renamed from: f */
    public final String f121541f;

    /* JADX INFO: renamed from: g */
    public final boolean f121542g;

    /* JADX INFO: renamed from: h */
    public final boolean f121543h;

    /* JADX INFO: renamed from: i */
    public final String f121544i;

    /* JADX INFO: renamed from: j */
    public final String f121545j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC41211c f121546k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC41211c f121547l;

    /* JADX INFO: renamed from: m */
    public final List f121548m;

    /* JADX INFO: renamed from: n */
    public final boolean f121549n;

    /* JADX INFO: renamed from: o */
    public final Boolean f121550o;

    /* JADX INFO: renamed from: p */
    public final String f121551p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC41211c f121552q;

    /* JADX INFO: renamed from: r */
    public final C23328a f121553r;

    /* JADX INFO: renamed from: s */
    public final C23328a f121554s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC29707c f121555t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC41211c f121556u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC41211c f121557v;

    /* JADX INFO: renamed from: w */
    public final boolean f121558w;

    /* JADX INFO: renamed from: x */
    public final boolean f121559x;

    /* JADX INFO: renamed from: y */
    public final boolean f121560y;

    /* JADX INFO: renamed from: z */
    public final C16689l1 f121561z;

    public C29720i0(List list, String email, boolean z4, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter, String str, boolean z13, boolean z14, String merchantName, String str2, InterfaceC41211c interfaceC41211c, InterfaceC41211c interfaceC41211c2, List addPaymentMethodOptions, boolean z15, Boolean bool, String str3, InterfaceC41211c interfaceC41211c3, C23328a c23328a, C23328a c23328a2, InterfaceC29707c addBankAccountState, InterfaceC41211c interfaceC41211c4, InterfaceC41211c interfaceC41211c5, boolean z16, boolean z17, boolean z18, C16689l1 billingDetailsCollectionConfiguration, boolean z19) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(addPaymentMethodOptions, "addPaymentMethodOptions");
        AbstractC22676k.m65750j(addBankAccountState, "addBankAccountState");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        this.f121536a = list;
        this.f121537b = email;
        this.f121538c = z4;
        this.f121539d = cardBrandFilter;
        this.f121540e = cardFundingFilter;
        this.f121541f = str;
        this.f121542g = z13;
        this.f121543h = z14;
        this.f121544i = merchantName;
        this.f121545j = str2;
        this.f121546k = interfaceC41211c;
        this.f121547l = interfaceC41211c2;
        this.f121548m = addPaymentMethodOptions;
        this.f121549n = z15;
        this.f121550o = bool;
        this.f121551p = str3;
        this.f121552q = interfaceC41211c3;
        this.f121553r = c23328a;
        this.f121554s = c23328a2;
        this.f121555t = addBankAccountState;
        this.f121556u = interfaceC41211c4;
        this.f121557v = interfaceC41211c5;
        this.f121558w = z16;
        this.f121559x = z17;
        this.f121560y = z18;
        this.f121561z = billingDetailsCollectionConfiguration;
        this.f121535A = z19;
    }

    /* JADX INFO: renamed from: a */
    public static C29720i0 m91172a(C29720i0 c29720i0, ArrayList arrayList, String str, boolean z4, Boolean bool, String str2, InterfaceC41211c interfaceC41211c, C23328a c23328a, C23328a c23328a2, InterfaceC29707c interfaceC29707c, InterfaceC41211c interfaceC41211c2, int i13) {
        List list = (i13 & 1) != 0 ? c29720i0.f121536a : arrayList;
        String email = c29720i0.f121537b;
        boolean z13 = c29720i0.f121538c;
        InterfaceC35320a cardBrandFilter = c29720i0.f121539d;
        InterfaceC35322b cardFundingFilter = c29720i0.f121540e;
        String str3 = (i13 & 32) != 0 ? c29720i0.f121541f : str;
        boolean z14 = (i13 & 64) != 0 ? c29720i0.f121542g : z4;
        boolean z15 = c29720i0.f121543h;
        String merchantName = c29720i0.f121544i;
        String str4 = c29720i0.f121545j;
        InterfaceC41211c interfaceC41211c3 = c29720i0.f121546k;
        InterfaceC41211c interfaceC41211c4 = c29720i0.f121547l;
        c29720i0.getClass();
        List addPaymentMethodOptions = c29720i0.f121548m;
        boolean z16 = c29720i0.f121549n;
        Boolean bool2 = (i13 & 32768) != 0 ? c29720i0.f121550o : bool;
        String str5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c29720i0.f121551p : str2;
        InterfaceC41211c interfaceC41211c5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c29720i0.f121552q : interfaceC41211c;
        C23328a expiryDateInput = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c29720i0.f121553r : c23328a;
        C23328a cvcInput = (i13 & 524288) != 0 ? c29720i0.f121554s : c23328a2;
        List list2 = list;
        InterfaceC29707c addBankAccountState = (i13 & 1048576) != 0 ? c29720i0.f121555t : interfaceC29707c;
        InterfaceC41211c interfaceC41211c6 = (i13 & 2097152) != 0 ? c29720i0.f121556u : interfaceC41211c2;
        InterfaceC41211c interfaceC41211c7 = c29720i0.f121557v;
        boolean z17 = (i13 & 8388608) != 0 ? c29720i0.f121558w : false;
        boolean z18 = (i13 & 16777216) != 0 ? c29720i0.f121559x : true;
        boolean z19 = c29720i0.f121560y;
        C16689l1 billingDetailsCollectionConfiguration = c29720i0.f121561z;
        String str6 = str3;
        boolean z24 = (i13 & 134217728) != 0 ? c29720i0.f121535A : true;
        c29720i0.getClass();
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(addPaymentMethodOptions, "addPaymentMethodOptions");
        AbstractC22676k.m65750j(expiryDateInput, "expiryDateInput");
        AbstractC22676k.m65750j(cvcInput, "cvcInput");
        AbstractC22676k.m65750j(addBankAccountState, "addBankAccountState");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        return new C29720i0(list2, email, z13, cardBrandFilter, cardFundingFilter, str6, z14, z15, merchantName, str4, interfaceC41211c3, interfaceC41211c4, addPaymentMethodOptions, z16, bool2, str5, interfaceC41211c5, expiryDateInput, cvcInput, addBankAccountState, interfaceC41211c6, interfaceC41211c7, z17, z18, z19, billingDetailsCollectionConfiguration, z24);
    }

    /* JADX INFO: renamed from: b */
    public final C41210b m91173b() {
        String str;
        AbstractC38794c0 abstractC38794c0M91175d = m91175d();
        if (abstractC38794c0M91175d == null) {
            return null;
        }
        boolean z4 = abstractC38794c0M91175d instanceof C38991x;
        C25271y c25271y = C25271y.f99162w;
        String str2 = this.f121544i;
        boolean z13 = this.f121560y;
        if (z4) {
            return (!z13 || (str = this.f121545j) == null) ? AbstractC32128i.m100064s(R.string.stripe_wallet_bank_account_terms, new Object[0], c25271y) : AbstractC32128i.m100064s(R.string.stripe_wallet_bank_account_terms_merchant_and_seller, new Object[]{str2, str, str2}, c25271y);
        }
        if (!(abstractC38794c0M91175d instanceof C38774a0) && !(abstractC38794c0M91175d instanceof C38784b0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z13) {
            return AbstractC32128i.m100064s(R.string.stripe_paymentsheet_card_mandate_signup_toggle_off, new Object[]{str2}, c25271y);
        }
        if (this.f121543h) {
            return AbstractC32128i.m100064s(R.string.stripe_paymentsheet_card_mandate, new Object[]{str2}, c25271y);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC16519o0 m91174c() {
        AbstractC38794c0 abstractC38794c0M91175d;
        EnumC38974v0 enumC38974v0;
        boolean z4 = this.f121554s.f92492b;
        AbstractC38794c0 abstractC38794c0M91175d2 = m91175d();
        C38774a0 c38774a0 = abstractC38794c0M91175d2 instanceof C38774a0 ? (C38774a0) abstractC38794c0M91175d2 : null;
        boolean z13 = ((c38774a0 != null && c38774a0.m124312k()) && (!this.f121553r.f92492b || !z4)) || (((c38774a0 == null || (enumC38974v0 = c38774a0.f166894M) == null) ? false : enumC38974v0.m124400a()) && !z4) || this.f121551p != null || (abstractC38794c0M91175d = m91175d()) == null || !m91176e(abstractC38794c0M91175d) || (this.f121555t instanceof C29705b);
        if (this.f121542g) {
            return EnumC16519o0.Processing;
        }
        return z13 ? EnumC16519o0.Disabled : EnumC16519o0.Enabled;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC38794c0 m91175d() {
        Object next;
        List list = this.f121536a;
        String str = this.f121541f;
        if (str == null) {
            return (AbstractC38794c0) AbstractC25265s.m74100H0(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC22676k.m65745e(((AbstractC38794c0) next).getId(), str)) {
                return (AbstractC38794c0) next;
            }
        }
        next = null;
        return (AbstractC38794c0) next;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91176e(AbstractC38794c0 item) {
        boolean zContains;
        CountryCode countryCode;
        boolean zMo112183F;
        AbstractC22676k.m65750j(item, "item");
        C16689l1 billingDetailsCollectionConfiguration = this.f121561z;
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        Set setM47249b = billingDetailsCollectionConfiguration.m47249b();
        if (setM47249b.isEmpty()) {
            zContains = true;
        } else if (item instanceof C38774a0) {
            C39000y c39000y = ((C38774a0) item).f166888G;
            if (c39000y == null || (countryCode = c39000y.f167865G) == null) {
                zContains = false;
            } else {
                String upperCase = countryCode.getValue().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                zContains = setM47249b.contains(upperCase);
            }
        } else if (item instanceof C38991x) {
            CountryCode.Companion.getClass();
            zContains = setM47249b.contains(CountryCode.f22161US.getValue());
        } else {
            if (!(item instanceof C38784b0)) {
                throw new NoWhenBranchMatchedException();
            }
            zContains = false;
        }
        if (zContains) {
            boolean z4 = item instanceof C38774a0;
            if (z4) {
                if (this.f121539d.mo112179o(((C38774a0) item).f166892K)) {
                    if (item instanceof C38991x) {
                        zMo112183F = true;
                    } else if (z4) {
                        zMo112183F = this.f121540e.mo112183F(((C38774a0) item).f166895N.f167906x);
                    } else {
                        if (!(item instanceof C38784b0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zMo112183F = true;
                    }
                    if (zMo112183F) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29720i0)) {
            return false;
        }
        C29720i0 c29720i0 = (C29720i0) obj;
        return this.f121536a.equals(c29720i0.f121536a) && AbstractC22676k.m65745e(this.f121537b, c29720i0.f121537b) && this.f121538c == c29720i0.f121538c && AbstractC22676k.m65745e(this.f121539d, c29720i0.f121539d) && AbstractC22676k.m65745e(this.f121540e, c29720i0.f121540e) && AbstractC22676k.m65745e(this.f121541f, c29720i0.f121541f) && this.f121542g == c29720i0.f121542g && this.f121543h == c29720i0.f121543h && AbstractC22676k.m65745e(this.f121544i, c29720i0.f121544i) && AbstractC22676k.m65745e(this.f121545j, c29720i0.f121545j) && this.f121546k.equals(c29720i0.f121546k) && AbstractC22676k.m65745e(this.f121547l, c29720i0.f121547l) && AbstractC22676k.m65745e(this.f121548m, c29720i0.f121548m) && this.f121549n == c29720i0.f121549n && AbstractC22676k.m65745e(this.f121550o, c29720i0.f121550o) && AbstractC22676k.m65745e(this.f121551p, c29720i0.f121551p) && AbstractC22676k.m65745e(this.f121552q, c29720i0.f121552q) && this.f121553r.equals(c29720i0.f121553r) && this.f121554s.equals(c29720i0.f121554s) && AbstractC22676k.m65745e(this.f121555t, c29720i0.f121555t) && AbstractC22676k.m65745e(this.f121556u, c29720i0.f121556u) && AbstractC22676k.m65745e(this.f121557v, c29720i0.f121557v) && this.f121558w == c29720i0.f121558w && this.f121559x == c29720i0.f121559x && this.f121560y == c29720i0.f121560y && AbstractC22676k.m65745e(this.f121561z, c29720i0.f121561z) && this.f121535A == c29720i0.f121535A;
    }

    public final int hashCode() {
        int iHashCode = (this.f121540e.hashCode() + ((this.f121539d.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.f121536a.hashCode() * 31, 31, this.f121537b), 31, this.f121538c)) * 31)) * 31;
        String str = this.f121541f;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f121542g), 31, this.f121543h), 31, this.f121544i);
        String str2 = this.f121545j;
        int iHashCode2 = (this.f121546k.hashCode() + ((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        InterfaceC41211c interfaceC41211c = this.f121547l;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC2875y.m8289b((iHashCode2 + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31, 31, false), 31, this.f121548m), 31, this.f121549n);
        Boolean bool = this.f121550o;
        int iHashCode3 = (iM8289b + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f121551p;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c2 = this.f121552q;
        int iHashCode5 = (this.f121555t.hashCode() + ((this.f121554s.hashCode() + ((this.f121553r.hashCode() + ((iHashCode4 + (interfaceC41211c2 == null ? 0 : interfaceC41211c2.hashCode())) * 31)) * 31)) * 31)) * 31;
        InterfaceC41211c interfaceC41211c3 = this.f121556u;
        int iHashCode6 = (iHashCode5 + (interfaceC41211c3 == null ? 0 : interfaceC41211c3.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c4 = this.f121557v;
        return Boolean.hashCode(this.f121535A) + ((this.f121561z.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode6 + (interfaceC41211c4 != null ? interfaceC41211c4.hashCode() : 0)) * 31, 31, this.f121558w), 31, this.f121559x), 31, this.f121560y)) * 31);
    }

    public final String toString() {
        StringBuilder sbM79507k = AbstractC26725a.m79507k("WalletUiState(paymentDetailsList=", ", email=", this.f121537b, ", allowLogOut=", this.f121536a);
        sbM79507k.append(this.f121538c);
        sbM79507k.append(", cardBrandFilter=");
        sbM79507k.append(this.f121539d);
        sbM79507k.append(", cardFundingFilter=");
        sbM79507k.append(this.f121540e);
        sbM79507k.append(", selectedItemId=");
        sbM79507k.append(this.f121541f);
        sbM79507k.append(", isProcessing=");
        AbstractC38963t7.m124392v(sbM79507k, this.f121542g, ", isSettingUp=", this.f121543h, ", merchantName=");
        AbstractC11266d.m30444B(sbM79507k, this.f121544i, ", sellerBusinessName=", this.f121545j, ", primaryButtonLabel=");
        sbM79507k.append(this.f121546k);
        sbM79507k.append(", secondaryButtonLabel=");
        sbM79507k.append(this.f121547l);
        sbM79507k.append(", hasCompleted=false, addPaymentMethodOptions=");
        AbstractC26725a.m79512p(", collectMissingBillingDetailsForExistingPaymentMethods=", ", userSetIsExpanded=", sbM79507k, this.f121548m, this.f121549n);
        AbstractC13673n.m38576w(this.f121550o, ", cardBeingUpdated=", this.f121551p, ", errorMessage=", sbM79507k);
        sbM79507k.append(this.f121552q);
        sbM79507k.append(", expiryDateInput=");
        sbM79507k.append(this.f121553r);
        sbM79507k.append(", cvcInput=");
        sbM79507k.append(this.f121554s);
        sbM79507k.append(", addBankAccountState=");
        sbM79507k.append(this.f121555t);
        sbM79507k.append(", alertMessage=");
        sbM79507k.append(this.f121556u);
        sbM79507k.append(", paymentSelectionHint=");
        sbM79507k.append(this.f121557v);
        sbM79507k.append(", isAutoSelecting=");
        AbstractC38963t7.m124392v(sbM79507k, this.f121558w, ", hasAttemptedAutoSelection=", this.f121559x, ", signupToggleEnabled=");
        sbM79507k.append(this.f121560y);
        sbM79507k.append(", billingDetailsCollectionConfiguration=");
        sbM79507k.append(this.f121561z);
        sbM79507k.append(", isValidating=");
        return AbstractC18489d0.m53372m(sbM79507k, this.f121535A, ")");
    }
}
