package vn;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: vn.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C36187r implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154911a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f154911a) {
            case 0:
                return new C36189t(parcel);
            default:
                return new C36188s(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f154911a) {
            case 0:
                return new C36189t[i13];
            default:
                return new C36188s[i13];
        }
    }
}
