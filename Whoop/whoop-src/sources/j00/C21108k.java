package j00;

import java.util.List;
import java.util.Set;
import n00.EnumC26076d;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: j00.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C21108k {

    /* JADX INFO: renamed from: a */
    public final AbstractC21106i0 f80044a;

    /* JADX INFO: renamed from: b */
    public final String f80045b;

    /* JADX INFO: renamed from: c */
    public final EnumC21096d0 f80046c;

    /* JADX INFO: renamed from: d */
    public final List f80047d;

    /* JADX INFO: renamed from: e */
    public final Set f80048e;

    /* JADX INFO: renamed from: f */
    public final boolean f80049f;

    /* JADX INFO: renamed from: g */
    public final boolean f80050g;

    /* JADX INFO: renamed from: h */
    public final boolean f80051h;

    /* JADX INFO: renamed from: i */
    public final boolean f80052i;

    /* JADX INFO: renamed from: j */
    public final boolean f80053j;

    /* JADX INFO: renamed from: k */
    public final EnumC26076d f80054k;

    /* JADX INFO: renamed from: l */
    public final boolean f80055l;

    public C21108k(AbstractC21106i0 abstractC21106i0, String merchantName, EnumC21096d0 enumC21096d0, List fields, Set set, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, EnumC26076d signUpState, boolean z17) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(fields, "fields");
        AbstractC22676k.m65750j(signUpState, "signUpState");
        this.f80044a = abstractC21106i0;
        this.f80045b = merchantName;
        this.f80046c = enumC21096d0;
        this.f80047d = fields;
        this.f80048e = set;
        this.f80049f = z4;
        this.f80050g = z13;
        this.f80051h = z14;
        this.f80052i = z15;
        this.f80053j = z16;
        this.f80054k = signUpState;
        this.f80055l = z17;
    }

    /* JADX INFO: renamed from: a */
    public static C21108k m58928a(C21108k c21108k, AbstractC21106i0 abstractC21106i0, boolean z4, boolean z13, EnumC26076d enumC26076d, int i13) {
        AbstractC21106i0 abstractC21106i1 = (i13 & 1) != 0 ? c21108k.f80044a : abstractC21106i0;
        String merchantName = c21108k.f80045b;
        EnumC21096d0 enumC21096d0 = c21108k.f80046c;
        List fields = c21108k.f80047d;
        Set set = c21108k.f80048e;
        boolean z14 = c21108k.f80049f;
        boolean z15 = c21108k.f80050g;
        boolean z16 = (i13 & 128) != 0 ? c21108k.f80051h : true;
        boolean z17 = (i13 & 256) != 0 ? c21108k.f80052i : z4;
        boolean z18 = (i13 & 512) != 0 ? c21108k.f80053j : z13;
        EnumC26076d signUpState = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21108k.f80054k : enumC26076d;
        boolean z19 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21108k.f80055l : true;
        c21108k.getClass();
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(fields, "fields");
        AbstractC22676k.m65750j(signUpState, "signUpState");
        return new C21108k(abstractC21106i1, merchantName, enumC21096d0, fields, set, z14, z15, z16, z17, z18, signUpState, z19);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58929b() {
        if (this.f80053j) {
            return false;
        }
        EnumC21096d0 enumC21096d0 = this.f80046c;
        int i13 = enumC21096d0 == null ? -1 : AbstractC21107j.f80043a[enumC21096d0.ordinal()];
        if (i13 != -1) {
            AbstractC21106i0 abstractC21106i0 = this.f80044a;
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z4 = this.f80050g;
                boolean z13 = this.f80052i;
                if (z4) {
                    return abstractC21106i0 != null && z13;
                }
                if (this.f80049f) {
                    return abstractC21106i0 != null;
                }
                return z13;
            }
            if (abstractC21106i0 != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21108k)) {
            return false;
        }
        C21108k c21108k = (C21108k) obj;
        return AbstractC22676k.m65745e(this.f80044a, c21108k.f80044a) && AbstractC22676k.m65745e(this.f80045b, c21108k.f80045b) && this.f80046c == c21108k.f80046c && AbstractC22676k.m65745e(this.f80047d, c21108k.f80047d) && AbstractC22676k.m65745e(this.f80048e, c21108k.f80048e) && this.f80049f == c21108k.f80049f && this.f80050g == c21108k.f80050g && this.f80051h == c21108k.f80051h && this.f80052i == c21108k.f80052i && this.f80053j == c21108k.f80053j && this.f80054k == c21108k.f80054k && this.f80055l == c21108k.f80055l;
    }

    public final int hashCode() {
        AbstractC21106i0 abstractC21106i0 = this.f80044a;
        int iM30450d = AbstractC11266d.m30450d((abstractC21106i0 == null ? 0 : abstractC21106i0.hashCode()) * 31, 31, this.f80045b);
        EnumC21096d0 enumC21096d0 = this.f80046c;
        return Boolean.hashCode(this.f80055l) + ((this.f80054k.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC25012a.m73368a(this.f80048e, AbstractC11895b.m31983b((iM30450d + (enumC21096d0 != null ? enumC21096d0.hashCode() : 0)) * 31, 31, this.f80047d), 31), 31, this.f80049f), 31, this.f80050g), 31, this.f80051h), 31, this.f80052i), 31, this.f80053j)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InlineSignupViewState(userInput=");
        sb4.append(this.f80044a);
        sb4.append(", merchantName=");
        sb4.append(this.f80045b);
        sb4.append(", signupMode=");
        sb4.append(this.f80046c);
        sb4.append(", fields=");
        sb4.append(this.f80047d);
        sb4.append(", prefillEligibleFields=");
        sb4.append(this.f80048e);
        sb4.append(", allowsDefaultOptIn=");
        sb4.append(this.f80049f);
        sb4.append(", linkSignUpOptInFeatureEnabled=");
        AbstractC38963t7.m124392v(sb4, this.f80050g, ", didAskToChangeSignupDetails=", this.f80051h, ", isExpanded=");
        AbstractC38963t7.m124392v(sb4, this.f80052i, ", apiFailed=", this.f80053j, ", signUpState=");
        sb4.append(this.f80054k);
        sb4.append(", userHasInteracted=");
        sb4.append(this.f80055l);
        sb4.append(")");
        return sb4.toString();
    }
}
