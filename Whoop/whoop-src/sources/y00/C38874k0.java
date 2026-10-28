package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38874k0 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38874k0> CREATOR = new C38873k(23);

    /* JADX INFO: renamed from: w */
    public final ArrayList f167321w;

    public C38874k0(ArrayList arrayList) {
        this.f167321w = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38874k0) && this.f167321w.equals(((C38874k0) obj).f167321w);
    }

    public final int hashCode() {
        return this.f167321w.hashCode();
    }

    public final String toString() {
        return "ConsumerShippingAddresses(addresses=" + this.f167321w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        ArrayList arrayList = this.f167321w;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C38864j0) it.next()).writeToParcel(dest, i13);
        }
    }
}
