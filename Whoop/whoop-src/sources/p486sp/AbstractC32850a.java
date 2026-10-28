package p486sp;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: sp.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32850a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f136879a = 0;

    static {
        AbstractC32850a.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m103117a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m103118b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC2875y.m8295h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m103119c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m103120d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }
}
