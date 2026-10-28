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

/* JADX INFO: renamed from: g20.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C15264j extends AbstractC15266l {
    public static final Parcelable.Creator<C15264j> CREATOR = new C13433b(17);

    /* JADX INFO: renamed from: E */
    public final boolean f57314E;

    /* JADX INFO: renamed from: F */
    public final String f57315F;

    /* JADX INFO: renamed from: G */
    public final Integer f57316G;

    /* JADX INFO: renamed from: w */
    public final String f57317w;

    /* JADX INFO: renamed from: x */
    public final String f57318x;

    /* JADX INFO: renamed from: y */
    public final boolean f57319y;

    /* JADX INFO: renamed from: z */
    public final LinkedHashSet f57320z;

    public C15264j(String publishableKey, String str, boolean z4, LinkedHashSet linkedHashSet, boolean z13, String setupIntentClientSecret, Integer num) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(setupIntentClientSecret, "setupIntentClientSecret");
        this.f57317w = publishableKey;
        this.f57318x = str;
        this.f57319y = z4;
        this.f57320z = linkedHashSet;
        this.f57314E = z13;
        this.f57315F = setupIntentClientSecret;
        this.f57316G = num;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: b */
    public final boolean mo43361b() {
        return this.f57319y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15264j)) {
            return false;
        }
        C15264j c15264j = (C15264j) obj;
        return AbstractC22676k.m65745e(this.f57317w, c15264j.f57317w) && AbstractC22676k.m65745e(this.f57318x, c15264j.f57318x) && this.f57319y == c15264j.f57319y && this.f57320z.equals(c15264j.f57320z) && this.f57314E == c15264j.f57314E && AbstractC22676k.m65745e(this.f57315F, c15264j.f57315F) && AbstractC22676k.m65745e(this.f57316G, c15264j.f57316G);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: f */
    public final boolean mo43362f() {
        return this.f57314E;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: h */
    public final Set mo43363h() {
        return this.f57320z;
    }

    public final int hashCode() {
        int iHashCode = this.f57317w.hashCode() * 31;
        String str = this.f57318x;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b((this.f57320z.hashCode() + AbstractC2875y.m8289b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57319y)) * 31, 31, this.f57314E), 31, this.f57315F);
        Integer num = this.f57316G;
        return iM30450d + (num != null ? num.hashCode() : 0);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: i */
    public final String mo43364i() {
        return this.f57317w;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: k */
    public final Integer mo43365k() {
        return this.f57316G;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: s */
    public final String mo43366s() {
        return this.f57318x;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SetupIntentNextActionArgs(publishableKey=", this.f57317w, ", stripeAccountId=", this.f57318x, ", enableLogging=");
        sbM32001t.append(this.f57319y);
        sbM32001t.append(", productUsage=");
        sbM32001t.append(this.f57320z);
        sbM32001t.append(", includePaymentSheetNextHandlers=");
        AbstractC38963t7.m124391u(sbM32001t, this.f57314E, ", setupIntentClientSecret=", this.f57315F, ", statusBarColor=");
        return AbstractC11478a.m30859k(sbM32001t, this.f57316G, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f57317w);
        dest.writeString(this.f57318x);
        dest.writeInt(this.f57319y ? 1 : 0);
        LinkedHashSet linkedHashSet = this.f57320z;
        dest.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeInt(this.f57314E ? 1 : 0);
        dest.writeString(this.f57315F);
        Integer num = this.f57316G;
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
