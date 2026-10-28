package d50;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import org.joda.time.DateTimeConstants;
import p023ay.C2125b;

/* JADX INFO: renamed from: d50.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C11712f implements Parcelable, Comparable {
    public static final Parcelable.Creator<C11712f> CREATOR = new C2125b(21);

    /* JADX INFO: renamed from: w */
    public int f37852w;

    /* JADX INFO: renamed from: x */
    public int f37853x;

    /* JADX INFO: renamed from: y */
    public int f37854y;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return hashCode() - ((C11712f) obj).hashCode();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C11712f.class == obj.getClass() && hashCode() == ((C11712f) obj).hashCode();
    }

    public final int hashCode() {
        return (this.f37853x * 60) + (this.f37852w * DateTimeConstants.SECONDS_PER_HOUR) + this.f37854y;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("");
        sb4.append(this.f37852w);
        sb4.append("h ");
        sb4.append(this.f37853x);
        sb4.append("m ");
        return AbstractC18489d0.m53371l(sb4, this.f37854y, "s");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f37852w);
        parcel.writeInt(this.f37853x);
        parcel.writeInt(this.f37854y);
    }
}
