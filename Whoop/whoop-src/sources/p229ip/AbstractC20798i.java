package p229ip;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: ip.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC20798i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f78089a = 0;

    static {
        AbstractC20798i.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m57334a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m57335b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC2875y.m8295h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m57336c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
