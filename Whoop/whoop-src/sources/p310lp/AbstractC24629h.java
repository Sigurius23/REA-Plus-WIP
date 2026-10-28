package p310lp;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lp.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24629h {
    static {
        AbstractC24629h.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m71962a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m71963b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m71964c(Parcel parcel) {
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
