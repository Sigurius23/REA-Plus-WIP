package p413q4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.C1312k0;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: q4.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C29961f extends AbstractC35701b {
    public static final Parcelable.Creator<C29961f> CREATOR = new C1312k0(8);

    /* JADX INFO: renamed from: y */
    public SparseArray f122381y;

    public C29961f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i13 = parcel.readInt();
        int[] iArr = new int[i13];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f122381y = new SparseArray(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            this.f122381y.append(iArr[i14], parcelableArray[i14]);
        }
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        SparseArray sparseArray = this.f122381y;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = this.f122381y.keyAt(i14);
            parcelableArr[i14] = (Parcelable) this.f122381y.valueAt(i14);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i13);
    }
}
