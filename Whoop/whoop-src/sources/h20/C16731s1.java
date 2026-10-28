package h20;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.s1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16731s1 extends AbstractC16737t1 {
    public static final Parcelable.Creator<C16731s1> CREATOR = new C16699n(22);

    /* JADX INFO: renamed from: w */
    public final ArrayList f64281w;

    public C16731s1(ArrayList arrayList) {
        this.f64281w = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16731s1) && this.f64281w.equals(((C16731s1) obj).f64281w);
    }

    public final int hashCode() {
        return this.f64281w.hashCode();
    }

    public final String toString() {
        return "Disallowed(brands=" + this.f64281w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        ArrayList arrayList = this.f64281w;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((EnumC16725r1) it.next()).writeToParcel(dest, i13);
        }
    }
}
