package p375op;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: op.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC28076h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f113570a = 0;

    static {
        AbstractC28076h.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m84849a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m84850b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC2875y.m8295h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m84851c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m84852d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
