package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1341r1 implements Parcelable {
    public static final Parcelable.Creator<C1341r1> CREATOR = new C1337q1(0);

    /* JADX INFO: renamed from: E */
    public String f5782E;

    /* JADX INFO: renamed from: F */
    public ArrayList f5783F;

    /* JADX INFO: renamed from: G */
    public ArrayList f5784G;

    /* JADX INFO: renamed from: H */
    public ArrayList f5785H;

    /* JADX INFO: renamed from: w */
    public ArrayList f5786w;

    /* JADX INFO: renamed from: x */
    public ArrayList f5787x;

    /* JADX INFO: renamed from: y */
    public C1275b[] f5788y;

    /* JADX INFO: renamed from: z */
    public int f5789z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeStringList(this.f5786w);
        parcel.writeStringList(this.f5787x);
        parcel.writeTypedArray(this.f5788y, i13);
        parcel.writeInt(this.f5789z);
        parcel.writeString(this.f5782E);
        parcel.writeStringList(this.f5783F);
        parcel.writeTypedList(this.f5784G);
        parcel.writeTypedList(this.f5785H);
    }
}
