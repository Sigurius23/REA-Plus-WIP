package h20;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16719q1 extends AbstractC16737t1 {
    public static final Parcelable.Creator<C16719q1> CREATOR = new C16699n(20);

    /* JADX INFO: renamed from: w */
    public final ArrayList f64258w;

    public C16719q1(ArrayList arrayList) {
        this.f64258w = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16719q1) && this.f64258w.equals(((C16719q1) obj).f64258w);
    }

    public final int hashCode() {
        return this.f64258w.hashCode();
    }

    public final String toString() {
        return "Allowed(brands=" + this.f64258w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        ArrayList arrayList = this.f64258w;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((EnumC16725r1) it.next()).writeToParcel(dest, i13);
        }
    }
}
