package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34026b extends AbstractC36219a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34026b> CREATOR = new C34025a0(11);

    /* JADX INFO: renamed from: w */
    public final int f142670w;

    /* JADX INFO: renamed from: x */
    public final int f142671x;

    public C34026b(int i13, int i14) {
        this.f142670w = i13;
        this.f142671x = i14;
    }

    /* JADX INFO: renamed from: b */
    public static void m107622b(int i13) {
        boolean z4 = false;
        if (i13 >= 0 && i13 <= 1) {
            z4 = true;
        }
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("Transition type ");
        sb4.append(i13);
        sb4.append(" is not valid.");
        AbstractC35135w.m111090b(z4, sb4.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34026b)) {
            return false;
        }
        C34026b c34026b = (C34026b) obj;
        return this.f142670w == c34026b.f142670w && this.f142671x == c34026b.f142671x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f142670w), Integer.valueOf(this.f142671x)});
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(75);
        sb4.append("ActivityTransition [mActivityType=");
        sb4.append(this.f142670w);
        sb4.append(", mTransitionType=");
        sb4.append(this.f142671x);
        sb4.append(']');
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC35135w.m111094f(parcel);
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f142670w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f142671x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
