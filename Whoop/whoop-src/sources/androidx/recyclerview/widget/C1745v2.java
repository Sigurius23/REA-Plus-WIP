package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.v2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1745v2 implements Parcelable {
    public static final Parcelable.Creator<C1745v2> CREATOR = new C1743v0(2);

    /* JADX INFO: renamed from: E */
    public int f6895E;

    /* JADX INFO: renamed from: F */
    public int[] f6896F;

    /* JADX INFO: renamed from: G */
    public ArrayList f6897G;

    /* JADX INFO: renamed from: H */
    public boolean f6898H;

    /* JADX INFO: renamed from: I */
    public boolean f6899I;

    /* JADX INFO: renamed from: J */
    public boolean f6900J;

    /* JADX INFO: renamed from: w */
    public int f6901w;

    /* JADX INFO: renamed from: x */
    public int f6902x;

    /* JADX INFO: renamed from: y */
    public int f6903y;

    /* JADX INFO: renamed from: z */
    public int[] f6904z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f6901w);
        parcel.writeInt(this.f6902x);
        parcel.writeInt(this.f6903y);
        if (this.f6903y > 0) {
            parcel.writeIntArray(this.f6904z);
        }
        parcel.writeInt(this.f6895E);
        if (this.f6895E > 0) {
            parcel.writeIntArray(this.f6896F);
        }
        parcel.writeInt(this.f6898H ? 1 : 0);
        parcel.writeInt(this.f6899I ? 1 : 0);
        parcel.writeInt(this.f6900J ? 1 : 0);
        parcel.writeList(this.f6897G);
    }
}
