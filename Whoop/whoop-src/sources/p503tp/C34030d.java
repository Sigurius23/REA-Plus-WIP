package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p000.AbstractC11266d;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C34030d extends AbstractC36219a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34030d> CREATOR = new C34025a0(13);

    /* JADX INFO: renamed from: E */
    public static final C34035f0 f142678E = new C34035f0();

    /* JADX INFO: renamed from: w */
    public final List f142679w;

    /* JADX INFO: renamed from: x */
    public final String f142680x;

    /* JADX INFO: renamed from: y */
    public final List f142681y;

    /* JADX INFO: renamed from: z */
    public String f142682z;

    public C34030d(List list, String str, ArrayList arrayList, String str2) {
        AbstractC35135w.m111095g(list, "transitions can't be null");
        AbstractC35135w.m111090b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f142678E);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C34026b c34026b = (C34026b) it.next();
            AbstractC35135w.m111090b(treeSet.add(c34026b), "Found duplicated transition: " + c34026b + ".");
        }
        this.f142679w = Collections.unmodifiableList(list);
        this.f142680x = str;
        this.f142681y = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f142682z = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34030d.class == obj.getClass()) {
            C34030d c34030d = (C34030d) obj;
            if (AbstractC35135w.m111097i(this.f142679w, c34030d.f142679w) && AbstractC35135w.m111097i(this.f142680x, c34030d.f142680x) && AbstractC35135w.m111097i(this.f142682z, c34030d.f142682z) && AbstractC35135w.m111097i(this.f142681y, c34030d.f142681y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f142679w.hashCode() * 31;
        String str = this.f142680x;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f142681y;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f142682z;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f142679w);
        String strValueOf2 = String.valueOf(this.f142681y);
        String str = this.f142682z;
        int length = strValueOf.length();
        String str2 = this.f142680x;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb4 = new StringBuilder(length + 79 + length2 + strValueOf2.length() + String.valueOf(str).length());
        AbstractC11266d.m30444B(sb4, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str2);
        AbstractC11266d.m30444B(sb4, "', mClients=", strValueOf2, ", mAttributionTag=", str);
        sb4.append(']');
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC35135w.m111094f(parcel);
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 1, this.f142679w);
        AbstractC36221c.m115332m(parcel, 2, this.f142680x);
        AbstractC36221c.m115336q(parcel, 3, this.f142681y);
        AbstractC36221c.m115332m(parcel, 4, this.f142682z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
