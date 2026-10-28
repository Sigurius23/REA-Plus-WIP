package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.Iterator;
import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38929q0 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38929q0> CREATOR = new C38873k(24);

    /* JADX INFO: renamed from: E */
    public final boolean f167580E;

    /* JADX INFO: renamed from: F */
    public final Integer f167581F;

    /* JADX INFO: renamed from: G */
    public final String f167582G;

    /* JADX INFO: renamed from: H */
    public final String f167583H;

    /* JADX INFO: renamed from: I */
    public final String f167584I;

    /* JADX INFO: renamed from: J */
    public final boolean f167585J;

    /* JADX INFO: renamed from: w */
    public final String f167586w;

    /* JADX INFO: renamed from: x */
    public final String f167587x;

    /* JADX INFO: renamed from: y */
    public final C38860i6 f167588y;

    /* JADX INFO: renamed from: z */
    public final Object f167589z;

    public C38929q0(String str, String str2, C38860i6 c38860i6, List list, boolean z4, Integer num, String str3, String str4, String str5, boolean z13) {
        this.f167586w = str;
        this.f167587x = str2;
        this.f167588y = c38860i6;
        this.f167589z = list;
        this.f167580E = z4;
        this.f167581F = num;
        this.f167582G = str3;
        this.f167583H = str4;
        this.f167584I = str5;
        this.f167585J = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38929q0)) {
            return false;
        }
        C38929q0 c38929q0 = (C38929q0) obj;
        return AbstractC22676k.m65745e(this.f167586w, c38929q0.f167586w) && AbstractC22676k.m65745e(this.f167587x, c38929q0.f167587x) && AbstractC22676k.m65745e(this.f167588y, c38929q0.f167588y) && this.f167589z.equals(c38929q0.f167589z) && this.f167580E == c38929q0.f167580E && AbstractC22676k.m65745e(this.f167581F, c38929q0.f167581F) && AbstractC22676k.m65745e(this.f167582G, c38929q0.f167582G) && AbstractC22676k.m65745e(this.f167583H, c38929q0.f167583H) && AbstractC22676k.m65745e(this.f167584I, c38929q0.f167584I) && this.f167585J == c38929q0.f167585J;
    }

    public final int hashCode() {
        String str = this.f167586w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167587x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C38860i6 c38860i6 = this.f167588y;
        int iM8289b = AbstractC2875y.m8289b(AbstractC33745d.m106644c((iHashCode2 + (c38860i6 == null ? 0 : c38860i6.hashCode())) * 31, 31, this.f167589z), 31, this.f167580E);
        Integer num = this.f167581F;
        int iHashCode3 = (iM8289b + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f167582G;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167583H;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167584I;
        return Boolean.hashCode(this.f167585J) + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Customer(id=", this.f167586w, ", defaultSource=", this.f167587x, ", shippingInformation=");
        sbM32001t.append(this.f167588y);
        sbM32001t.append(", sources=");
        sbM32001t.append(this.f167589z);
        sbM32001t.append(", hasMore=");
        sbM32001t.append(this.f167580E);
        sbM32001t.append(", totalCount=");
        sbM32001t.append(this.f167581F);
        sbM32001t.append(", url=");
        AbstractC11266d.m30444B(sbM32001t, this.f167582G, ", description=", this.f167583H, ", email=");
        return AbstractC21702c.m61137h(sbM32001t, this.f167584I, ", liveMode=", this.f167585J, ")");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167586w);
        dest.writeString(this.f167587x);
        C38860i6 c38860i6 = this.f167588y;
        if (c38860i6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38860i6.writeToParcel(dest, i13);
        }
        ?? r10 = this.f167589z;
        dest.writeInt(r10.size());
        Iterator it = r10.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i13);
        }
        dest.writeInt(this.f167580E ? 1 : 0);
        Integer num = this.f167581F;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.f167582G);
        dest.writeString(this.f167583H);
        dest.writeString(this.f167584I);
        dest.writeInt(this.f167585J ? 1 : 0);
    }
}
