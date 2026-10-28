package androidx.fragment.app;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.fragment.app.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1305i1 implements Parcelable {
    public static final Parcelable.Creator<C1305i1> CREATOR = new C0113a(26);

    /* JADX INFO: renamed from: w */
    public String f5649w;

    /* JADX INFO: renamed from: x */
    public int f5650x;

    public C1305i1(String str, int i13) {
        this.f5649w = str;
        this.f5650x = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f5649w);
        parcel.writeInt(this.f5650x);
    }
}
