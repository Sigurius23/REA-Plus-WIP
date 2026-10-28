package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.recyclerview.widget.u2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1741u2 implements Parcelable {
    public static final Parcelable.Creator<C1741u2> CREATOR = new C1743v0(1);

    /* JADX INFO: renamed from: w */
    public int f6883w;

    /* JADX INFO: renamed from: x */
    public int f6884x;

    /* JADX INFO: renamed from: y */
    public int[] f6885y;

    /* JADX INFO: renamed from: z */
    public boolean f6886z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f6883w + ", mGapDir=" + this.f6884x + ", mHasUnwantedGapAfter=" + this.f6886z + ", mGapPerSpan=" + Arrays.toString(this.f6885y) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f6883w);
        parcel.writeInt(this.f6884x);
        parcel.writeInt(this.f6886z ? 1 : 0);
        int[] iArr = this.f6885y;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f6885y);
        }
    }
}
