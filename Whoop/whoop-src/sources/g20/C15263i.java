package g20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: g20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C15263i extends AbstractC15266l {
    public static final Parcelable.Creator<C15263i> CREATOR = new C13433b(16);

    /* JADX INFO: renamed from: E */
    public final boolean f57307E;

    /* JADX INFO: renamed from: F */
    public final String f57308F;

    /* JADX INFO: renamed from: G */
    public final Integer f57309G;

    /* JADX INFO: renamed from: w */
    public final String f57310w;

    /* JADX INFO: renamed from: x */
    public final String f57311x;

    /* JADX INFO: renamed from: y */
    public final boolean f57312y;

    /* JADX INFO: renamed from: z */
    public final LinkedHashSet f57313z;

    public C15263i(String publishableKey, String str, boolean z4, LinkedHashSet linkedHashSet, boolean z13, String paymentIntentClientSecret, Integer num) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.f57310w = publishableKey;
        this.f57311x = str;
        this.f57312y = z4;
        this.f57313z = linkedHashSet;
        this.f57307E = z13;
        this.f57308F = paymentIntentClientSecret;
        this.f57309G = num;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: b */
    public final boolean mo43361b() {
        return this.f57312y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15263i)) {
            return false;
        }
        C15263i c15263i = (C15263i) obj;
        return AbstractC22676k.m65745e(this.f57310w, c15263i.f57310w) && AbstractC22676k.m65745e(this.f57311x, c15263i.f57311x) && this.f57312y == c15263i.f57312y && this.f57313z.equals(c15263i.f57313z) && this.f57307E == c15263i.f57307E && AbstractC22676k.m65745e(this.f57308F, c15263i.f57308F) && AbstractC22676k.m65745e(this.f57309G, c15263i.f57309G);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: f */
    public final boolean mo43362f() {
        return this.f57307E;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: h */
    public final Set mo43363h() {
        return this.f57313z;
    }

    public final int hashCode() {
        int iHashCode = this.f57310w.hashCode() * 31;
        String str = this.f57311x;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b((this.f57313z.hashCode() + AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57312y)) * 31, 31, this.f57307E), 31, this.f57308F);
        Integer num = this.f57309G;
        return iM30450d + (num != null ? num.hashCode() : 0);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: i */
    public final String mo43364i() {
        return this.f57310w;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: k */
    public final Integer mo43365k() {
        return this.f57309G;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: s */
    public final String mo43366s() {
        return this.f57311x;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PaymentIntentNextActionArgs(publishableKey=", this.f57310w, ", stripeAccountId=", this.f57311x, ", enableLogging=");
        sbM32001t.append(this.f57312y);
        sbM32001t.append(", productUsage=");
        sbM32001t.append(this.f57313z);
        sbM32001t.append(", includePaymentSheetNextHandlers=");
        AbstractC38963t7.m124391u(sbM32001t, this.f57307E, ", paymentIntentClientSecret=", this.f57308F, ", statusBarColor=");
        return AbstractC11478a.m30859k(sbM32001t, this.f57309G, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f57310w);
        dest.writeString(this.f57311x);
        dest.writeInt(this.f57312y ? 1 : 0);
        LinkedHashSet linkedHashSet = this.f57313z;
        dest.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeInt(this.f57307E ? 1 : 0);
        dest.writeString(this.f57308F);
        Integer num = this.f57309G;
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
