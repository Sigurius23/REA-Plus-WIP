package c10;

import android.os.Parcel;
import android.os.Parcelable;
import h20.AbstractC16737t1;
import h20.C16636c2;
import h20.C16665h1;
import h20.C16666h2;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16756w2;
import h20.C16767y1;
import h20.EnumC16673i3;
import h20.EnumC16743u1;
import i20.C17928b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import p023ay.C2125b;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: c10.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C3831n implements Parcelable {
    public static final Parcelable.Creator<C3831n> CREATOR = new C2125b(9);

    /* JADX INFO: renamed from: E */
    public final C17928b f15667E;

    /* JADX INFO: renamed from: F */
    public final boolean f15668F;

    /* JADX INFO: renamed from: G */
    public final boolean f15669G;

    /* JADX INFO: renamed from: H */
    public final C16665h1 f15670H;

    /* JADX INFO: renamed from: I */
    public final String f15671I;

    /* JADX INFO: renamed from: J */
    public final C16689l1 f15672J;

    /* JADX INFO: renamed from: K */
    public final ArrayList f15673K;

    /* JADX INFO: renamed from: L */
    public final boolean f15674L;

    /* JADX INFO: renamed from: M */
    public final List f15675M;

    /* JADX INFO: renamed from: N */
    public final List f15676N;

    /* JADX INFO: renamed from: O */
    public final AbstractC16737t1 f15677O;

    /* JADX INFO: renamed from: P */
    public final ArrayList f15678P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f15679Q;

    /* JADX INFO: renamed from: R */
    public final boolean f15680R;

    /* JADX INFO: renamed from: S */
    public final C16756w2 f15681S;

    /* JADX INFO: renamed from: T */
    public final EnumC3832o f15682T;

    /* JADX INFO: renamed from: U */
    public final LinkedHashMap f15683U;

    /* JADX INFO: renamed from: V */
    public final boolean f15684V;

    /* JADX INFO: renamed from: W */
    public final String f15685W;

    /* JADX INFO: renamed from: w */
    public final String f15686w;

    /* JADX INFO: renamed from: x */
    public final C16636c2 f15687x;

    /* JADX INFO: renamed from: y */
    public final C16666h2 f15688y;

    /* JADX INFO: renamed from: z */
    public final C16671i1 f15689z;

    public C3831n(String merchantDisplayName, C16636c2 c16636c2, C16666h2 c16666h2, C16671i1 c16671i1, C17928b c17928b, boolean z4, boolean z13, C16665h1 appearance, String str, C16689l1 billingDetailsCollectionConfiguration, ArrayList arrayList, boolean z14, ArrayList paymentMethodOrder, ArrayList externalPaymentMethods, AbstractC16737t1 cardBrandAcceptance, ArrayList arrayList2, ArrayList arrayList3, boolean z15, C16756w2 link, EnumC3832o formSheetAction, LinkedHashMap linkedHashMap, boolean z16, String str2) {
        AbstractC22676k.m65750j(merchantDisplayName, "merchantDisplayName");
        AbstractC22676k.m65750j(appearance, "appearance");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(paymentMethodOrder, "paymentMethodOrder");
        AbstractC22676k.m65750j(externalPaymentMethods, "externalPaymentMethods");
        AbstractC22676k.m65750j(cardBrandAcceptance, "cardBrandAcceptance");
        AbstractC22676k.m65750j(link, "link");
        AbstractC22676k.m65750j(formSheetAction, "formSheetAction");
        this.f15686w = merchantDisplayName;
        this.f15687x = c16636c2;
        this.f15688y = c16666h2;
        this.f15689z = c16671i1;
        this.f15667E = c17928b;
        this.f15668F = z4;
        this.f15669G = z13;
        this.f15670H = appearance;
        this.f15671I = str;
        this.f15672J = billingDetailsCollectionConfiguration;
        this.f15673K = arrayList;
        this.f15674L = z14;
        this.f15675M = paymentMethodOrder;
        this.f15676N = externalPaymentMethods;
        this.f15677O = cardBrandAcceptance;
        this.f15678P = arrayList2;
        this.f15679Q = arrayList3;
        this.f15680R = z15;
        this.f15681S = link;
        this.f15682T = formSheetAction;
        this.f15683U = linkedHashMap;
        this.f15684V = z16;
        this.f15685W = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3831n)) {
            return false;
        }
        C3831n c3831n = (C3831n) obj;
        return AbstractC22676k.m65745e(this.f15686w, c3831n.f15686w) && AbstractC22676k.m65745e(this.f15687x, c3831n.f15687x) && AbstractC22676k.m65745e(this.f15688y, c3831n.f15688y) && AbstractC22676k.m65745e(this.f15689z, c3831n.f15689z) && AbstractC22676k.m65745e(this.f15667E, c3831n.f15667E) && this.f15668F == c3831n.f15668F && this.f15669G == c3831n.f15669G && AbstractC22676k.m65745e(this.f15670H, c3831n.f15670H) && AbstractC22676k.m65745e(this.f15671I, c3831n.f15671I) && AbstractC22676k.m65745e(this.f15672J, c3831n.f15672J) && this.f15673K.equals(c3831n.f15673K) && this.f15674L == c3831n.f15674L && AbstractC22676k.m65745e(this.f15675M, c3831n.f15675M) && AbstractC22676k.m65745e(this.f15676N, c3831n.f15676N) && AbstractC22676k.m65745e(this.f15677O, c3831n.f15677O) && this.f15678P.equals(c3831n.f15678P) && this.f15679Q.equals(c3831n.f15679Q) && this.f15680R == c3831n.f15680R && AbstractC22676k.m65745e(this.f15681S, c3831n.f15681S) && this.f15682T == c3831n.f15682T && this.f15683U.equals(c3831n.f15683U) && this.f15684V == c3831n.f15684V && AbstractC22676k.m65745e(this.f15685W, c3831n.f15685W);
    }

    public final int hashCode() {
        int iHashCode = this.f15686w.hashCode() * 31;
        C16636c2 c16636c2 = this.f15687x;
        int iHashCode2 = (iHashCode + (c16636c2 == null ? 0 : c16636c2.hashCode())) * 31;
        C16666h2 c16666h2 = this.f15688y;
        int iHashCode3 = (iHashCode2 + (c16666h2 == null ? 0 : c16666h2.hashCode())) * 31;
        C16671i1 c16671i1 = this.f15689z;
        int iHashCode4 = (iHashCode3 + (c16671i1 == null ? 0 : c16671i1.hashCode())) * 31;
        C17928b c17928b = this.f15667E;
        int iHashCode5 = (this.f15670H.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (c17928b == null ? 0 : c17928b.hashCode())) * 31, 31, this.f15668F), 31, this.f15669G)) * 31;
        String str = this.f15671I;
        int iM8289b = AbstractC2875y.m8289b((this.f15683U.hashCode() + ((this.f15682T.hashCode() + ((this.f15681S.hashCode() + AbstractC2875y.m8289b((this.f15679Q.hashCode() + ((this.f15678P.hashCode() + ((this.f15677O.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC2875y.m8289b((this.f15673K.hashCode() + ((this.f15672J.hashCode() + ((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f15674L), 31, this.f15675M), 31, this.f15676N)) * 31)) * 31)) * 31, 31, this.f15680R)) * 31)) * 31)) * 31, 31, this.f15684V);
        String str2 = this.f15685W;
        return iM8289b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Configuration(merchantDisplayName=");
        sb4.append(this.f15686w);
        sb4.append(", customer=");
        sb4.append(this.f15687x);
        sb4.append(", googlePay=");
        sb4.append(this.f15688y);
        sb4.append(", defaultBillingDetails=");
        sb4.append(this.f15689z);
        sb4.append(", shippingDetails=");
        sb4.append(this.f15667E);
        sb4.append(", allowsDelayedPaymentMethods=");
        sb4.append(this.f15668F);
        sb4.append(", allowsPaymentMethodsRequiringShippingAddress=");
        sb4.append(this.f15669G);
        sb4.append(", appearance=");
        sb4.append(this.f15670H);
        sb4.append(", primaryButtonLabel=");
        sb4.append(this.f15671I);
        sb4.append(", billingDetailsCollectionConfiguration=");
        sb4.append(this.f15672J);
        sb4.append(", preferredNetworks=");
        sb4.append(this.f15673K);
        sb4.append(", allowsRemovalOfLastSavedPaymentMethod=");
        sb4.append(this.f15674L);
        sb4.append(", paymentMethodOrder=");
        AbstractC21702c.m61148s(sb4, this.f15675M, ", externalPaymentMethods=", this.f15676N, ", cardBrandAcceptance=");
        sb4.append(this.f15677O);
        sb4.append(", allowedCardFundingTypes=");
        sb4.append(this.f15678P);
        sb4.append(", customPaymentMethods=");
        sb4.append(this.f15679Q);
        sb4.append(", embeddedViewDisplaysMandateText=");
        sb4.append(this.f15680R);
        sb4.append(", link=");
        sb4.append(this.f15681S);
        sb4.append(", formSheetAction=");
        sb4.append(this.f15682T);
        sb4.append(", termsDisplay=");
        sb4.append(this.f15683U);
        sb4.append(", opensCardScannerAutomatically=");
        sb4.append(this.f15684V);
        sb4.append(", userOverrideCountry=");
        return AbstractC25012a.m73376i(this.f15685W, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f15686w);
        C16636c2 c16636c2 = this.f15687x;
        if (c16636c2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16636c2.writeToParcel(dest, i13);
        }
        C16666h2 c16666h2 = this.f15688y;
        if (c16666h2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16666h2.writeToParcel(dest, i13);
        }
        C16671i1 c16671i1 = this.f15689z;
        if (c16671i1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16671i1.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f15667E, i13);
        dest.writeInt(this.f15668F ? 1 : 0);
        dest.writeInt(this.f15669G ? 1 : 0);
        this.f15670H.writeToParcel(dest, i13);
        dest.writeString(this.f15671I);
        this.f15672J.writeToParcel(dest, i13);
        ArrayList arrayList = this.f15673K;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeString(((EnumC38853i) it.next()).name());
        }
        dest.writeInt(this.f15674L ? 1 : 0);
        dest.writeStringList(this.f15675M);
        dest.writeStringList(this.f15676N);
        dest.writeParcelable(this.f15677O, i13);
        ArrayList arrayList2 = this.f15678P;
        dest.writeInt(arrayList2.size());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((EnumC16743u1) it3.next()).writeToParcel(dest, i13);
        }
        ArrayList arrayList3 = this.f15679Q;
        dest.writeInt(arrayList3.size());
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((C16767y1) it4.next()).writeToParcel(dest, i13);
        }
        dest.writeInt(this.f15680R ? 1 : 0);
        this.f15681S.writeToParcel(dest, i13);
        dest.writeString(this.f15682T.name());
        LinkedHashMap linkedHashMap = this.f15683U;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeParcelable((Parcelable) entry.getKey(), i13);
            dest.writeString(((EnumC16673i3) entry.getValue()).name());
        }
        dest.writeInt(this.f15684V ? 1 : 0);
        dest.writeString(this.f15685W);
    }
}
