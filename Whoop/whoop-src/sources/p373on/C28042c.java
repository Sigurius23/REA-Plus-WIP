package p373on;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import mn.C25704b;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: on.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C28042c implements Parcelable {
    public static final Parcelable.Creator<C28042c> CREATOR = new C25704b(26);

    /* JADX INFO: renamed from: w */
    public final long f113177w;

    /* JADX INFO: renamed from: x */
    public final long f113178x;

    /* JADX INFO: renamed from: y */
    public final int f113179y;

    public C28042c(long j7, long j13, int i13) {
        AbstractC24543a.m71569e(j7 < j13);
        this.f113177w = j7;
        this.f113178x = j13;
        this.f113179y = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C28042c.class == obj.getClass()) {
            C28042c c28042c = (C28042c) obj;
            if (this.f113177w == c28042c.f113177w && this.f113178x == c28042c.f113178x && this.f113179y == c28042c.f113179y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f113177w), Long.valueOf(this.f113178x), Integer.valueOf(this.f113179y)});
    }

    public final String toString() {
        int i13 = AbstractC24567y.f95875a;
        Locale locale = Locale.US;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(this.f113177w, "Segment: startTimeMs=", ", endTimeMs=");
        sbM125596b.append(this.f113178x);
        sbM125596b.append(", speedDivisor=");
        sbM125596b.append(this.f113179y);
        return sbM125596b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f113177w);
        parcel.writeLong(this.f113178x);
        parcel.writeInt(this.f113179y);
    }
}
