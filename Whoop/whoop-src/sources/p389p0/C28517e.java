package p389p0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p0.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C28517e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C28520f(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C28520f[i13];
    }
}
