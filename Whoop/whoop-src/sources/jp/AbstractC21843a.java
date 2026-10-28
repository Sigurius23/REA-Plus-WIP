package jp;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: jp.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21843a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f84371a = 0;

    static {
        AbstractC21843a.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m61826a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m61827b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(iDataAvail).length() + 45);
        sb4.append("Parcel data not fully consumed, unread size: ");
        sb4.append(iDataAvail);
        throw new BadParcelableException(sb4.toString());
    }
}
