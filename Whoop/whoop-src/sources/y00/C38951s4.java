package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.s4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38951s4 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38951s4> CREATOR = new C38858i4(5);

    /* JADX INFO: renamed from: E */
    public final String f167658E;

    /* JADX INFO: renamed from: F */
    public final Set f167659F;

    /* JADX INFO: renamed from: G */
    public final C38942r4 f167660G;

    /* JADX INFO: renamed from: w */
    public final String f167661w;

    /* JADX INFO: renamed from: x */
    public final Integer f167662x;

    /* JADX INFO: renamed from: y */
    public final Integer f167663y;

    /* JADX INFO: renamed from: z */
    public final String f167664z;

    public C38951s4(String str, Integer num, Integer num2, String str2, String str3, Set set, C38942r4 c38942r4) {
        this.f167661w = str;
        this.f167662x = num;
        this.f167663y = num2;
        this.f167664z = str2;
        this.f167658E = str3;
        this.f167659F = set;
        this.f167660G = c38942r4;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C23465k c23465k = new C23465k("number", this.f167661w);
        C23465k c23465k2 = new C23465k("exp_month", this.f167662x);
        C23465k c23465k3 = new C23465k("exp_year", this.f167663y);
        C23465k c23465k4 = new C23465k("cvc", this.f167664z);
        C23465k c23465k5 = new C23465k("token", this.f167658E);
        C38942r4 c38942r4 = this.f167660G;
        List<C23465k> listM118959K = AbstractC37056f.m118959K(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, new C23465k("networks", c38942r4 != null ? c38942r4.mo124325c0() : null));
        ArrayList arrayList = new ArrayList();
        for (C23465k c23465k6 : listM118959K) {
            Object obj = c23465k6.f92938x;
            C23465k c23465k7 = obj != null ? new C23465k(c23465k6.f92937w, obj) : null;
            if (c23465k7 != null) {
                arrayList.add(c23465k7);
            }
        }
        return AbstractC25247g0.m74000i0(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38951s4)) {
            return false;
        }
        C38951s4 c38951s4 = (C38951s4) obj;
        return AbstractC22676k.m65745e(this.f167661w, c38951s4.f167661w) && AbstractC22676k.m65745e(this.f167662x, c38951s4.f167662x) && AbstractC22676k.m65745e(this.f167663y, c38951s4.f167663y) && AbstractC22676k.m65745e(this.f167664z, c38951s4.f167664z) && AbstractC22676k.m65745e(this.f167658E, c38951s4.f167658E) && AbstractC22676k.m65745e(this.f167659F, c38951s4.f167659F) && AbstractC22676k.m65745e(this.f167660G, c38951s4.f167660G);
    }

    public final int hashCode() {
        String str = this.f167661w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f167662x;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f167663y;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f167664z;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167658E;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set set = this.f167659F;
        int iHashCode6 = (iHashCode5 + (set == null ? 0 : set.hashCode())) * 31;
        C38942r4 c38942r4 = this.f167660G;
        return iHashCode6 + (c38942r4 != null ? c38942r4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Card(number=");
        sb4.append(this.f167661w);
        sb4.append(", expiryMonth=");
        sb4.append(this.f167662x);
        sb4.append(", expiryYear=");
        AbstractC13673n.m38577x(this.f167663y, ", cvc=", this.f167664z, ", token=", sb4);
        sb4.append(this.f167658E);
        sb4.append(", attribution=");
        sb4.append(this.f167659F);
        sb4.append(", networks=");
        sb4.append(this.f167660G);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167661w);
        Integer num = this.f167662x;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.f167663y;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeString(this.f167664z);
        dest.writeString(this.f167658E);
        Set set = this.f167659F;
        if (set == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                dest.writeString((String) it.next());
            }
        }
        C38942r4 c38942r4 = this.f167660G;
        if (c38942r4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38942r4.writeToParcel(dest, i13);
        }
    }

    public /* synthetic */ C38951s4(String str, Integer num, Integer num2, String str2, String str3, Set set, C38942r4 c38942r4, int i13) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : set, (i13 & 64) != 0 ? null : c38942r4);
    }
}
