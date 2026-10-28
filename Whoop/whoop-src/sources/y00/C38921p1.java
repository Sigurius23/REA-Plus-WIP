package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.p1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38921p1 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38921p1> CREATOR = new C38992x0(11);

    /* JADX INFO: renamed from: w */
    public final Object f167543w;

    /* JADX INFO: renamed from: x */
    public final String f167544x;

    /* JADX INFO: renamed from: y */
    public final C38912o1 f167545y;

    public C38921p1(List list, String str, C38912o1 session) {
        AbstractC22676k.m65750j(session, "session");
        this.f167543w = list;
        this.f167544x = str;
        this.f167545y = session;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38921p1)) {
            return false;
        }
        C38921p1 c38921p1 = (C38921p1) obj;
        return this.f167543w.equals(c38921p1.f167543w) && AbstractC22676k.m65745e(this.f167544x, c38921p1.f167544x) && AbstractC22676k.m65745e(this.f167545y, c38921p1.f167545y);
    }

    public final int hashCode() {
        int iHashCode = this.f167543w.hashCode() * 31;
        String str = this.f167544x;
        return this.f167545y.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Customer(paymentMethods=" + this.f167543w + ", defaultPaymentMethod=" + this.f167544x + ", session=" + this.f167545y + ")";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        ?? r10 = this.f167543w;
        dest.writeInt(r10.size());
        Iterator it = r10.iterator();
        while (it.hasNext()) {
            ((C38915o4) it.next()).writeToParcel(dest, i13);
        }
        dest.writeString(this.f167544x);
        this.f167545y.writeToParcel(dest, i13);
    }
}
