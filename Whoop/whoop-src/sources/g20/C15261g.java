package g20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p078d1.C11456i;
import p126eq.C13433b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: g20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C15261g extends AbstractC15266l {
    public static final Parcelable.Creator<C15261g> CREATOR = new C13433b(14);

    /* JADX INFO: renamed from: E */
    public final String f57293E;

    /* JADX INFO: renamed from: F */
    public final Integer f57294F;

    /* JADX INFO: renamed from: G */
    public final C23470p f57295G;

    /* JADX INFO: renamed from: w */
    public final String f57296w;

    /* JADX INFO: renamed from: x */
    public final boolean f57297x;

    /* JADX INFO: renamed from: y */
    public final LinkedHashSet f57298y;

    /* JADX INFO: renamed from: z */
    public final boolean f57299z;

    public C15261g(String str, boolean z4, LinkedHashSet linkedHashSet, boolean z13, String hashedValue, Integer num) {
        AbstractC22676k.m65750j(hashedValue, "hashedValue");
        this.f57296w = str;
        this.f57297x = z4;
        this.f57298y = linkedHashSet;
        this.f57299z = z13;
        this.f57293E = hashedValue;
        this.f57294F = num;
        this.f57295G = AbstractC30060g.m92088H(new C11456i(this, 23));
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: b */
    public final boolean mo43361b() {
        return this.f57297x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15261g)) {
            return false;
        }
        C15261g c15261g = (C15261g) obj;
        return AbstractC22676k.m65745e(this.f57296w, c15261g.f57296w) && this.f57297x == c15261g.f57297x && this.f57298y.equals(c15261g.f57298y) && this.f57299z == c15261g.f57299z && AbstractC22676k.m65745e(this.f57293E, c15261g.f57293E) && AbstractC22676k.m65745e(this.f57294F, c15261g.f57294F);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: f */
    public final boolean mo43362f() {
        return this.f57299z;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: h */
    public final Set mo43363h() {
        return this.f57298y;
    }

    public final int hashCode() {
        String str = this.f57296w;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b((this.f57298y.hashCode() + AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.f57297x)) * 31, 31, this.f57299z), 31, this.f57293E);
        Integer num = this.f57294F;
        return iM30450d + (num != null ? num.hashCode() : 0);
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: i */
    public final String mo43364i() {
        String str;
        Object obj = ((C23468n) this.f57295G.getValue()).f92940w;
        if (obj instanceof C23467m) {
            obj = null;
        }
        C23465k c23465k = (C23465k) obj;
        return (c23465k == null || (str = (String) c23465k.f92937w) == null) ? "UNKNOWN" : str;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: k */
    public final Integer mo43365k() {
        return this.f57294F;
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: s */
    public final String mo43366s() {
        return this.f57296w;
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("HashedPaymentIntentNextActionArgs(stripeAccountId=", this.f57296w, ", enableLogging=", ", productUsage=", this.f57297x);
        sbM73379l.append(this.f57298y);
        sbM73379l.append(", includePaymentSheetNextHandlers=");
        sbM73379l.append(this.f57299z);
        sbM73379l.append(", hashedValue=");
        sbM73379l.append(this.f57293E);
        sbM73379l.append(", statusBarColor=");
        sbM73379l.append(this.f57294F);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f57296w);
        dest.writeInt(this.f57297x ? 1 : 0);
        LinkedHashSet linkedHashSet = this.f57298y;
        dest.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeInt(this.f57299z ? 1 : 0);
        dest.writeString(this.f57293E);
        Integer num = this.f57294F;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
    }

    @Override // g20.AbstractC15266l
    /* JADX INFO: renamed from: x */
    public final Object mo43367x() {
        Object obj = ((C23468n) this.f57295G.getValue()).f92940w;
        if (obj instanceof C23467m) {
            return obj;
        }
        return C23454a0.f92919a;
    }
}
