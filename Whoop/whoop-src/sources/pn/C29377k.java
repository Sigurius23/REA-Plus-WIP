package pn;

import android.os.Parcel;
import android.os.Parcelable;
import ed3.C13117a;

/* JADX INFO: renamed from: pn.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C29377k extends AbstractC29369c {
    public static final Parcelable.Creator<C29377k> CREATOR = new C29367a(4);

    /* JADX INFO: renamed from: w */
    public final long f119157w;

    /* JADX INFO: renamed from: x */
    public final long f119158x;

    public C29377k(long j7, long j13) {
        this.f119157w = j7;
        this.f119158x = j13;
    }

    /* JADX INFO: renamed from: b */
    public static long m89533b(long j7, C13117a c13117a) {
        long jM36715y = c13117a.m36715y();
        if ((128 & jM36715y) != 0) {
            return 8589934591L & ((((jM36715y & 1) << 32) | c13117a.m36716z()) + j7);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f119157w);
        parcel.writeLong(this.f119158x);
    }
}
