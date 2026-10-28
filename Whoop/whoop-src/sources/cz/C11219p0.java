package cz;

import androidx.profileinstaller.ProfileVerifier;
import b20.C2326f;
import b30.C2550j3;
import b30.C2598p3;
import c93.InterfaceC4339a;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import o20.C27457b;
import ou1.C28376a;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29834s;
import s20.C32077a;
import t20.C33333n;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: cz.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11219p0 extends AbstractC11227t0 {

    /* JADX INFO: renamed from: c */
    public final String f35989c;

    /* JADX INFO: renamed from: d */
    public final List f35990d;

    /* JADX INFO: renamed from: e */
    public final C27457b f35991e;

    /* JADX INFO: renamed from: f */
    public final List f35992f;

    /* JADX INFO: renamed from: g */
    public final C32077a f35993g;

    /* JADX INFO: renamed from: h */
    public final C33333n f35994h;

    /* JADX INFO: renamed from: i */
    public final AbstractC29840y f35995i;

    /* JADX INFO: renamed from: j */
    public final boolean f35996j;

    /* JADX INFO: renamed from: k */
    public final boolean f35997k;

    /* JADX INFO: renamed from: l */
    public final boolean f35998l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC41211c f35999m;

    /* JADX INFO: renamed from: n */
    public final boolean f36000n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC41211c f36001o;

    /* JADX INFO: renamed from: p */
    public final boolean f36002p;

    /* JADX INFO: renamed from: q */
    public final C2598p3 f36003q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC41211c f36004r;

    /* JADX INFO: renamed from: s */
    public final boolean f36005s;

    /* JADX INFO: renamed from: t */
    public final boolean f36006t;

    /* JADX INFO: renamed from: u */
    public final C29834s f36007u;

    /* JADX INFO: renamed from: v */
    public final C2326f f36008v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11219p0(String str, List supportedPaymentMethods, C27457b c27457b, List list, C32077a c32077a, C33333n c33333n, AbstractC29840y abstractC29840y, boolean z4, boolean z13, boolean z14, InterfaceC41211c interfaceC41211c, boolean z15, InterfaceC41211c interfaceC41211c2, boolean z16, C2598p3 c2598p3, InterfaceC41211c interfaceC41211c3, boolean z17, boolean z18, C29834s c29834s, C2326f errorReporter) {
        super(z14, !z15);
        AbstractC22676k.m65750j(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f35989c = str;
        this.f35990d = supportedPaymentMethods;
        this.f35991e = c27457b;
        this.f35992f = list;
        this.f35993g = c32077a;
        this.f35994h = c33333n;
        this.f35995i = abstractC29840y;
        this.f35996j = z4;
        this.f35997k = z13;
        this.f35998l = z14;
        this.f35999m = interfaceC41211c;
        this.f36000n = z15;
        this.f36001o = interfaceC41211c2;
        this.f36002p = z16;
        this.f36003q = c2598p3;
        this.f36004r = interfaceC41211c3;
        this.f36005s = z17;
        this.f36006t = z18;
        this.f36007u = c29834s;
        this.f36008v = errorReporter;
    }

    /* JADX INFO: renamed from: c */
    public static C11219p0 m30345c(C11219p0 c11219p0, String str, C27457b c27457b, List list, C32077a c32077a, AbstractC29840y abstractC29840y, boolean z4, boolean z13, InterfaceC41211c interfaceC41211c, C41210b c41210b, boolean z14, C2598p3 c2598p3, InterfaceC41211c interfaceC41211c2, boolean z15, boolean z16, C29834s c29834s, int i13) {
        String paymentMethodCode = (i13 & 1) != 0 ? c11219p0.f35989c : str;
        List supportedPaymentMethods = c11219p0.f35990d;
        C27457b c27457b2 = (i13 & 4) != 0 ? c11219p0.f35991e : c27457b;
        List list2 = (i13 & 8) != 0 ? c11219p0.f35992f : list;
        C32077a c32077a2 = (i13 & 16) != 0 ? c11219p0.f35993g : c32077a;
        C33333n c33333n = c11219p0.f35994h;
        AbstractC29840y abstractC29840y2 = (i13 & 64) != 0 ? c11219p0.f35995i : abstractC29840y;
        boolean z17 = (i13 & 128) != 0 ? c11219p0.f35996j : z4;
        boolean z18 = c11219p0.f35997k;
        boolean z19 = (i13 & 512) != 0 ? c11219p0.f35998l : z13;
        InterfaceC41211c interfaceC41211c3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c11219p0.f35999m : interfaceC41211c;
        boolean z24 = c11219p0.f36000n;
        InterfaceC41211c interfaceC41211c4 = (i13 & 4096) != 0 ? c11219p0.f36001o : c41210b;
        boolean z25 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c11219p0.f36002p : z14;
        C2598p3 c2598p4 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c11219p0.f36003q : c2598p3;
        InterfaceC41211c interfaceC41211c5 = (32768 & i13) != 0 ? c11219p0.f36004r : interfaceC41211c2;
        boolean z26 = (65536 & i13) != 0 ? c11219p0.f36005s : z15;
        boolean z27 = (131072 & i13) != 0 ? c11219p0.f36006t : z16;
        C29834s c29834s2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c11219p0.f36007u : c29834s;
        C2326f errorReporter = c11219p0.f36008v;
        AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
        AbstractC22676k.m65750j(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        return new C11219p0(paymentMethodCode, supportedPaymentMethods, c27457b2, list2, c32077a2, c33333n, abstractC29840y2, z17, z18, z19, interfaceC41211c3, z24, interfaceC41211c4, z25, c2598p4, interfaceC41211c5, z26, z27, c29834s2, errorReporter);
    }

    @Override // cz.AbstractC11227t0
    /* JADX INFO: renamed from: a */
    public final boolean mo30346a() {
        return this.f35998l;
    }

    @Override // cz.AbstractC11227t0
    /* JADX INFO: renamed from: b */
    public final C2550j3 mo30347b(InterfaceC4339a onEditIconPressed) {
        AbstractC22676k.m65750j(onEditIconPressed, "onEditIconPressed");
        return new C2550j3(!this.f35997k, false, false, new C28376a(7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11219p0)) {
            return false;
        }
        C11219p0 c11219p0 = (C11219p0) obj;
        return this.f35989c.equals(c11219p0.f35989c) && AbstractC22676k.m65745e(this.f35990d, c11219p0.f35990d) && AbstractC22676k.m65745e(this.f35991e, c11219p0.f35991e) && this.f35992f.equals(c11219p0.f35992f) && this.f35993g.equals(c11219p0.f35993g) && this.f35994h.equals(c11219p0.f35994h) && AbstractC22676k.m65745e(this.f35995i, c11219p0.f35995i) && this.f35996j == c11219p0.f35996j && this.f35997k == c11219p0.f35997k && this.f35998l == c11219p0.f35998l && AbstractC22676k.m65745e(this.f35999m, c11219p0.f35999m) && this.f36000n == c11219p0.f36000n && this.f36001o.equals(c11219p0.f36001o) && this.f36002p == c11219p0.f36002p && AbstractC22676k.m65745e(this.f36003q, c11219p0.f36003q) && AbstractC22676k.m65745e(this.f36004r, c11219p0.f36004r) && this.f36005s == c11219p0.f36005s && this.f36006t == c11219p0.f36006t && AbstractC22676k.m65745e(this.f36007u, c11219p0.f36007u) && AbstractC22676k.m65745e(this.f36008v, c11219p0.f36008v);
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.f35989c.hashCode() * 31, 31, this.f35990d);
        C27457b c27457b = this.f35991e;
        int iHashCode = (this.f35994h.hashCode() + ((this.f35993g.hashCode() + AbstractC11895b.m31983b((iM31983b + (c27457b == null ? 0 : c27457b.hashCode())) * 31, 31, this.f35992f)) * 31)) * 31;
        AbstractC29840y abstractC29840y = this.f35995i;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 31, 31, this.f35996j), 31, this.f35997k), 31, this.f35998l);
        InterfaceC41211c interfaceC41211c = this.f35999m;
        int iM8289b2 = AbstractC2875y.m8289b((this.f36001o.hashCode() + AbstractC2875y.m8289b((iM8289b + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31, 31, this.f36000n)) * 31, 31, this.f36002p);
        C2598p3 c2598p3 = this.f36003q;
        int iHashCode2 = (iM8289b2 + (c2598p3 == null ? 0 : c2598p3.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c2 = this.f36004r;
        int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (interfaceC41211c2 == null ? 0 : interfaceC41211c2.hashCode())) * 31, 31, this.f36005s), 31, this.f36006t);
        C29834s c29834s = this.f36007u;
        return this.f36008v.hashCode() + ((iM8289b3 + (c29834s != null ? c29834s.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM94766o = AbstractC30802r.m94766o("AddPaymentMethod(paymentMethodCode=", this.f35989c, ", supportedPaymentMethods=", ", formFieldValues=", this.f35990d);
        sbM94766o.append(this.f35991e);
        sbM94766o.append(", formElements=");
        sbM94766o.append(this.f35992f);
        sbM94766o.append(", formArguments=");
        sbM94766o.append(this.f35993g);
        sbM94766o.append(", usBankAccountFormArguments=");
        sbM94766o.append(this.f35994h);
        sbM94766o.append(", draftPaymentSelection=");
        sbM94766o.append(this.f35995i);
        sbM94766o.append(", enabled=");
        sbM94766o.append(this.f35996j);
        sbM94766o.append(", isLiveMode=");
        AbstractC38963t7.m124392v(sbM94766o, this.f35997k, ", isProcessing=", this.f35998l, ", errorMessage=");
        sbM94766o.append(this.f35999m);
        sbM94766o.append(", isFirstPaymentMethod=");
        sbM94766o.append(this.f36000n);
        sbM94766o.append(", primaryButtonLabel=");
        sbM94766o.append(this.f36001o);
        sbM94766o.append(", primaryButtonEnabled=");
        sbM94766o.append(this.f36002p);
        sbM94766o.append(", customPrimaryButtonUiState=");
        sbM94766o.append(this.f36003q);
        sbM94766o.append(", mandateText=");
        sbM94766o.append(this.f36004r);
        sbM94766o.append(", showMandateAbovePrimaryButton=");
        AbstractC38963t7.m124392v(sbM94766o, this.f36005s, ", displayDismissConfirmationModal=", this.f36006t, ", bankAccountSelection=");
        sbM94766o.append(this.f36007u);
        sbM94766o.append(", errorReporter=");
        sbM94766o.append(this.f36008v);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
