package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.recyclerview.widget.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1747w0 implements Parcelable {
    public static final Parcelable.Creator<C1747w0> CREATOR = new C1743v0(0);

    /* JADX INFO: renamed from: w */
    public int f6909w;

    /* JADX INFO: renamed from: x */
    public int f6910x;

    /* JADX INFO: renamed from: y */
    public boolean f6911y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f6909w);
        parcel.writeInt(this.f6910x);
        parcel.writeInt(this.f6911y ? 1 : 0);
    }
}
