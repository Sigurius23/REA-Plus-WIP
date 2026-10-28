package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C34028c extends AbstractC36219a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34028c> CREATOR = new C34025a0(12);

    /* JADX INFO: renamed from: w */
    public final int f142672w;

    /* JADX INFO: renamed from: x */
    public final int f142673x;

    /* JADX INFO: renamed from: y */
    public final long f142674y;

    public C34028c(int i13, long j7, int i14) {
        C34026b.m107622b(i14);
        this.f142672w = i13;
        this.f142673x = i14;
        this.f142674y = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34028c)) {
            return false;
        }
        C34028c c34028c = (C34028c) obj;
        return this.f142672w == c34028c.f142672w && this.f142673x == c34028c.f142673x && this.f142674y == c34028c.f142674y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f142672w), Integer.valueOf(this.f142673x), Long.valueOf(this.f142674y)});
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder(24);
        sb5.append("ActivityType ");
        sb5.append(this.f142672w);
        sb4.append(sb5.toString());
        sb4.append(" ");
        StringBuilder sb6 = new StringBuilder(26);
        sb6.append("TransitionType ");
        sb6.append(this.f142673x);
        sb4.append(sb6.toString());
        sb4.append(" ");
        StringBuilder sb7 = new StringBuilder(41);
        sb7.append("ElapsedRealTimeNanos ");
        sb7.append(this.f142674y);
        sb4.append(sb7.toString());
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC35135w.m111094f(parcel);
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f142672w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f142673x);
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeLong(this.f142674y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
