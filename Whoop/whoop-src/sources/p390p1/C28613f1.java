package p390p1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p1.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28613f1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115756a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f115756a) {
            case 0:
                return new C28617g1(parcel.readFloat());
            case 1:
                return new C28621h1(parcel.readInt());
            default:
                return new C28625i1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f115756a) {
            case 0:
                return new C28617g1[i13];
            case 1:
                return new C28621h1[i13];
            default:
                return new C28625i1[i13];
        }
    }
}
