package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.ArrayList;
import java.util.Iterator;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.q6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38935q6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38935q6> CREATOR = new C38943r5(14);

    /* JADX INFO: renamed from: E */
    public final C38926p6 f167604E;

    /* JADX INFO: renamed from: w */
    public final Integer f167605w;

    /* JADX INFO: renamed from: x */
    public final String f167606x;

    /* JADX INFO: renamed from: y */
    public final String f167607y;

    /* JADX INFO: renamed from: z */
    public final ArrayList f167608z;

    public C38935q6(Integer num, String str, String str2, ArrayList arrayList, C38926p6 c38926p6) {
        this.f167605w = num;
        this.f167606x = str;
        this.f167607y = str2;
        this.f167608z = arrayList;
        this.f167604E = c38926p6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38935q6)) {
            return false;
        }
        C38935q6 c38935q6 = (C38935q6) obj;
        return AbstractC22676k.m65745e(this.f167605w, c38935q6.f167605w) && AbstractC22676k.m65745e(this.f167606x, c38935q6.f167606x) && AbstractC22676k.m65745e(this.f167607y, c38935q6.f167607y) && this.f167608z.equals(c38935q6.f167608z) && AbstractC22676k.m65745e(this.f167604E, c38935q6.f167604E);
    }

    public final int hashCode() {
        Integer num = this.f167605w;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f167606x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167607y;
        int iHashCode3 = (this.f167608z.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        C38926p6 c38926p6 = this.f167604E;
        return iHashCode3 + (c38926p6 != null ? c38926p6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM95643s = AbstractC31061c.m95643s("SourceOrder(amount=", ", currency=", this.f167605w, this.f167606x, ", email=");
        sbM95643s.append(this.f167607y);
        sbM95643s.append(", items=");
        sbM95643s.append(this.f167608z);
        sbM95643s.append(", shipping=");
        sbM95643s.append(this.f167604E);
        sbM95643s.append(")");
        return sbM95643s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.f167605w;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.f167606x);
        dest.writeString(this.f167607y);
        ArrayList arrayList = this.f167608z;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C38917o6) it.next()).writeToParcel(dest, i13);
        }
        C38926p6 c38926p6 = this.f167604E;
        if (c38926p6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38926p6.writeToParcel(dest, i13);
        }
    }
}
