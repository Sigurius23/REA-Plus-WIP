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
import y00.InterfaceC38946s;

/* JADX INFO: renamed from: g20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C15262h extends AbstractC15266l {
    public static final Parcelable.Creator<C15262h> CREATOR = new C13433b(15);

    /* JADX INFO: renamed from: E */
    public final boolean f57300E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC38946s f57301F;

    /* JADX INFO: renamed from: G */
    public final Integer f57302G;

    /* JADX INFO: renamed from: w */
    public final String f57303w;

    /* JADX INFO: renamed from: x */
    public final String f57304x;

    /* JADX INFO: renamed from: y */
    public final boolean f57305y;

    /* JADX INFO: renamed from: z */
    public final Set f57306z;

    public C15262h(String publishableKey, String str, boolean z4, Set productUsage, boolean z13, InterfaceC38946s confirmStripeIntentParams, Integer num) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        AbstractC22676k.m65750j(confirmStripeIntentParams, "confirmStripeIntentParams");
        this.f57303w = publishableKey;
        this.f57304x = str;
        this.f57305y = z4;
        this.f57306z = productUsage;
        this.f57300E = z13;
        this.f57301F = confirmStripeIntentParams;
        this.f57302G = num;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: b */
    public final boolean mo43361b() {
        return this.f57305y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15262h)) {
            return false;
        }
        C15262h c15262h = (C15262h) obj;
        return AbstractC22676k.m65745e(this.f57303w, c15262h.f57303w) && AbstractC22676k.m65745e(this.f57304x, c15262h.f57304x) && this.f57305y == c15262h.f57305y && AbstractC22676k.m65745e(this.f57306z, c15262h.f57306z) && this.f57300E == c15262h.f57300E && AbstractC22676k.m65745e(this.f57301F, c15262h.f57301F) && AbstractC22676k.m65745e(this.f57302G, c15262h.f57302G);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: f */
    public final boolean mo43362f() {
        return this.f57300E;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: h */
    public final Set mo43363h() {
        return this.f57306z;
    }

    public final int hashCode() {
        int iHashCode = this.f57303w.hashCode() * 31;
        String str = this.f57304x;
        int iHashCode2 = (this.f57301F.hashCode() + AbstractC2875y.m8289b(AbstractC25012a.m73368a(this.f57306z, AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57305y), 31), 31, this.f57300E)) * 31;
        Integer num = this.f57302G;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: i */
    public final String mo43364i() {
        return this.f57303w;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: k */
    public final Integer mo43365k() {
        return this.f57302G;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: s */
    public final String mo43366s() {
        return this.f57304x;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntentConfirmationArgs(publishableKey=", this.f57303w, ", stripeAccountId=", this.f57304x, ", enableLogging=");
        sbM32001t.append(this.f57305y);
        sbM32001t.append(", productUsage=");
        sbM32001t.append(this.f57306z);
        sbM32001t.append(", includePaymentSheetNextHandlers=");
        sbM32001t.append(this.f57300E);
        sbM32001t.append(", confirmStripeIntentParams=");
        sbM32001t.append(this.f57301F);
        sbM32001t.append(", statusBarColor=");
        return AbstractC11478a.m30859k(sbM32001t, this.f57302G, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f57303w);
        dest.writeString(this.f57304x);
        dest.writeInt(this.f57305y ? 1 : 0);
        Set set = this.f57306z;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeInt(this.f57300E ? 1 : 0);
        dest.writeParcelable(this.f57301F, i13);
        Integer num = this.f57302G;
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
