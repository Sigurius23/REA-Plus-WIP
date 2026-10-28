package cz;

import android.os.Parcel;
import android.os.Parcelable;
import h20.AbstractC16737t1;
import h20.C16665h1;
import h20.C16671i1;
import h20.C16689l1;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p023ay.C2125b;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: cz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11190b implements Parcelable {
    public static final Parcelable.Creator<C11190b> CREATOR = new C2125b(14);

    /* JADX INFO: renamed from: E */
    public final C16689l1 f35882E;

    /* JADX INFO: renamed from: F */
    public final String f35883F;

    /* JADX INFO: renamed from: G */
    public final ArrayList f35884G;

    /* JADX INFO: renamed from: H */
    public final boolean f35885H;

    /* JADX INFO: renamed from: I */
    public final List f35886I;

    /* JADX INFO: renamed from: J */
    public final AbstractC16737t1 f35887J;

    /* JADX INFO: renamed from: K */
    public final boolean f35888K;

    /* JADX INFO: renamed from: w */
    public final C16665h1 f35889w;

    /* JADX INFO: renamed from: x */
    public final boolean f35890x;

    /* JADX INFO: renamed from: y */
    public final String f35891y;

    /* JADX INFO: renamed from: z */
    public final C16671i1 f35892z;

    public C11190b(C16665h1 appearance, boolean z4, String str, C16671i1 defaultBillingDetails, C16689l1 billingDetailsCollectionConfiguration, String merchantDisplayName, ArrayList arrayList, boolean z13, ArrayList paymentMethodOrder, AbstractC16737t1 cardBrandAcceptance, boolean z14) {
        AbstractC22676k.m65750j(appearance, "appearance");
        AbstractC22676k.m65750j(defaultBillingDetails, "defaultBillingDetails");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(merchantDisplayName, "merchantDisplayName");
        AbstractC22676k.m65750j(paymentMethodOrder, "paymentMethodOrder");
        AbstractC22676k.m65750j(cardBrandAcceptance, "cardBrandAcceptance");
        this.f35889w = appearance;
        this.f35890x = z4;
        this.f35891y = str;
        this.f35892z = defaultBillingDetails;
        this.f35882E = billingDetailsCollectionConfiguration;
        this.f35883F = merchantDisplayName;
        this.f35884G = arrayList;
        this.f35885H = z13;
        this.f35886I = paymentMethodOrder;
        this.f35887J = cardBrandAcceptance;
        this.f35888K = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11190b)) {
            return false;
        }
        C11190b c11190b = (C11190b) obj;
        return AbstractC22676k.m65745e(this.f35889w, c11190b.f35889w) && this.f35890x == c11190b.f35890x && AbstractC22676k.m65745e(this.f35891y, c11190b.f35891y) && AbstractC22676k.m65745e(this.f35892z, c11190b.f35892z) && AbstractC22676k.m65745e(this.f35882E, c11190b.f35882E) && AbstractC22676k.m65745e(this.f35883F, c11190b.f35883F) && this.f35884G.equals(c11190b.f35884G) && this.f35885H == c11190b.f35885H && AbstractC22676k.m65745e(this.f35886I, c11190b.f35886I) && AbstractC22676k.m65745e(this.f35887J, c11190b.f35887J) && this.f35888K == c11190b.f35888K;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.f35889w.hashCode() * 31, 31, this.f35890x);
        String str = this.f35891y;
        return Boolean.hashCode(this.f35888K) + ((this.f35887J.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b((this.f35884G.hashCode() + AbstractC11266d.m30450d((this.f35882E.hashCode() + ((this.f35892z.hashCode() + ((iM8289b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f35883F)) * 31, 31, this.f35885H), 31, this.f35886I)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Configuration(appearance=");
        sb4.append(this.f35889w);
        sb4.append(", googlePayEnabled=");
        sb4.append(this.f35890x);
        sb4.append(", headerTextForSelectionScreen=");
        sb4.append(this.f35891y);
        sb4.append(", defaultBillingDetails=");
        sb4.append(this.f35892z);
        sb4.append(", billingDetailsCollectionConfiguration=");
        sb4.append(this.f35882E);
        sb4.append(", merchantDisplayName=");
        sb4.append(this.f35883F);
        sb4.append(", preferredNetworks=");
        sb4.append(this.f35884G);
        sb4.append(", allowsRemovalOfLastSavedPaymentMethod=");
        sb4.append(this.f35885H);
        sb4.append(", paymentMethodOrder=");
        sb4.append(this.f35886I);
        sb4.append(", cardBrandAcceptance=");
        sb4.append(this.f35887J);
        sb4.append(", opensCardScannerAutomatically=");
        return AbstractC18489d0.m53372m(sb4, this.f35888K, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f35889w.writeToParcel(dest, i13);
        dest.writeInt(this.f35890x ? 1 : 0);
        dest.writeString(this.f35891y);
        this.f35892z.writeToParcel(dest, i13);
        this.f35882E.writeToParcel(dest, i13);
        dest.writeString(this.f35883F);
        ArrayList arrayList = this.f35884G;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeString(((EnumC38853i) it.next()).name());
        }
        dest.writeInt(this.f35885H ? 1 : 0);
        dest.writeStringList(this.f35886I);
        dest.writeParcelable(this.f35887J, i13);
        dest.writeInt(this.f35888K ? 1 : 0);
    }
}
