package in;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: in.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18713a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C18715c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C18715c[i13];
    }
}
