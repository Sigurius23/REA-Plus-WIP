package h20;

import a30.C0290f1;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p599wz.C37708d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16652f0 implements Parcelable {
    public static final Parcelable.Creator<C16652f0> CREATOR = new C16699n(3);

    /* JADX INFO: renamed from: E */
    public final boolean f64027E;

    /* JADX INFO: renamed from: F */
    public final Set f64028F;

    /* JADX INFO: renamed from: G */
    public final String f64029G;

    /* JADX INFO: renamed from: w */
    public final C0290f1 f64030w;

    /* JADX INFO: renamed from: x */
    public final C16761x1 f64031x;

    /* JADX INFO: renamed from: y */
    public final C37708d f64032y;

    /* JADX INFO: renamed from: z */
    public final boolean f64033z;

    public C16652f0(C0290f1 state, C16761x1 configuration, C37708d linkAccountInfo, boolean z4, boolean z13, Set productUsage, String paymentElementCallbackIdentifier) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.f64030w = state;
        this.f64031x = configuration;
        this.f64032y = linkAccountInfo;
        this.f64033z = z4;
        this.f64027E = z13;
        this.f64028F = productUsage;
        this.f64029G = paymentElementCallbackIdentifier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16652f0)) {
            return false;
        }
        C16652f0 c16652f0 = (C16652f0) obj;
        return AbstractC22676k.m65745e(this.f64030w, c16652f0.f64030w) && AbstractC22676k.m65745e(this.f64031x, c16652f0.f64031x) && AbstractC22676k.m65745e(this.f64032y, c16652f0.f64032y) && this.f64033z == c16652f0.f64033z && this.f64027E == c16652f0.f64027E && AbstractC22676k.m65745e(this.f64028F, c16652f0.f64028F) && AbstractC22676k.m65745e(this.f64029G, c16652f0.f64029G);
    }

    public final int hashCode() {
        return this.f64029G.hashCode() + AbstractC25012a.m73368a(this.f64028F, AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f64032y.hashCode() + ((this.f64031x.hashCode() + (this.f64030w.hashCode() * 31)) * 31)) * 31, 31, this.f64033z), 31, this.f64027E), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(state=");
        sb4.append(this.f64030w);
        sb4.append(", configuration=");
        sb4.append(this.f64031x);
        sb4.append(", linkAccountInfo=");
        sb4.append(this.f64032y);
        sb4.append(", enableLogging=");
        sb4.append(this.f64033z);
        sb4.append(", walletButtonsRendered=");
        sb4.append(this.f64027E);
        sb4.append(", productUsage=");
        sb4.append(this.f64028F);
        sb4.append(", paymentElementCallbackIdentifier=");
        return AbstractC25012a.m73376i(this.f64029G, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f64030w.writeToParcel(dest, i13);
        this.f64031x.writeToParcel(dest, i13);
        this.f64032y.writeToParcel(dest, i13);
        dest.writeInt(this.f64033z ? 1 : 0);
        dest.writeInt(this.f64027E ? 1 : 0);
        Set set = this.f64028F;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeString(this.f64029G);
    }
}
