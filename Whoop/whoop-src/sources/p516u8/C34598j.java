package p516u8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: u8.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C34598j implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145678a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f145678a) {
            case 0:
                return new C34602l(parcel);
            case 1:
                return new C34600k(parcel);
            default:
                return new C34601k0(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f145678a) {
            case 0:
                return new C34602l[i13];
            case 1:
                return new C34600k[i13];
            default:
                return new C34601k0[i13];
        }
    }
}
