package or2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: or2.i1 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC28170i1 {
    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m85280a(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m85281b(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
