package g20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.Set;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p126eq.C13433b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: g20.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C15265k extends AbstractC15266l {
    public static final Parcelable.Creator<C15265k> CREATOR = new C13433b(18);

    /* JADX INFO: renamed from: E */
    public final boolean f57321E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC38802c8 f57322F;

    /* JADX INFO: renamed from: G */
    public final Integer f57323G;

    /* JADX INFO: renamed from: w */
    public final String f57324w;

    /* JADX INFO: renamed from: x */
    public final String f57325x;

    /* JADX INFO: renamed from: y */
    public final boolean f57326y;

    /* JADX INFO: renamed from: z */
    public final Set f57327z;

    public C15265k(String publishableKey, String str, boolean z4, Set productUsage, boolean z13, InterfaceC38802c8 stripeIntent, Integer num) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        this.f57324w = publishableKey;
        this.f57325x = str;
        this.f57326y = z4;
        this.f57327z = productUsage;
        this.f57321E = z13;
        this.f57322F = stripeIntent;
        this.f57323G = num;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: b */
    public final boolean mo43361b() {
        return this.f57326y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15265k)) {
            return false;
        }
        C15265k c15265k = (C15265k) obj;
        return AbstractC22676k.m65745e(this.f57324w, c15265k.f57324w) && AbstractC22676k.m65745e(this.f57325x, c15265k.f57325x) && this.f57326y == c15265k.f57326y && AbstractC22676k.m65745e(this.f57327z, c15265k.f57327z) && this.f57321E == c15265k.f57321E && AbstractC22676k.m65745e(this.f57322F, c15265k.f57322F) && AbstractC22676k.m65745e(this.f57323G, c15265k.f57323G);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: f */
    public final boolean mo43362f() {
        return this.f57321E;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: h */
    public final Set mo43363h() {
        return this.f57327z;
    }

    public final int hashCode() {
        int iHashCode = this.f57324w.hashCode() * 31;
        String str = this.f57325x;
        int iHashCode2 = (this.f57322F.hashCode() + AbstractC2875y.m8289b(AbstractC25012a.m73368a(this.f57327z, AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57326y), 31), 31, this.f57321E)) * 31;
        Integer num = this.f57323G;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: i */
    public final String mo43364i() {
        return this.f57324w;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: k */
    public final Integer mo43365k() {
        return this.f57323G;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: s */
    public final String mo43366s() {
        return this.f57325x;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StripeIntentNextActionWithIntentArgs(publishableKey=", this.f57324w, ", stripeAccountId=", this.f57325x, ", enableLogging=");
        sbM32001t.append(this.f57326y);
        sbM32001t.append(", productUsage=");
        sbM32001t.append(this.f57327z);
        sbM32001t.append(", includePaymentSheetNextHandlers=");
        sbM32001t.append(this.f57321E);
        sbM32001t.append(", stripeIntent=");
        sbM32001t.append(this.f57322F);
        sbM32001t.append(", statusBarColor=");
        return AbstractC11478a.m30859k(sbM32001t, this.f57323G, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f57324w);
        dest.writeString(this.f57325x);
        dest.writeInt(this.f57326y ? 1 : 0);
        Set set = this.f57327z;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeInt(this.f57321E ? 1 : 0);
        dest.writeParcelable(this.f57322F, i13);
        Integer num = this.f57323G;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: x */
    public final Object mo43367x() {
        return C23454a0.f92919a;
    }
}
