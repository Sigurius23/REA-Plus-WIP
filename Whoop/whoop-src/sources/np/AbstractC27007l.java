package np;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: np.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27007l {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f107703a = 0;

    static {
        AbstractC27007l.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static void m80994a(Parcel parcel, boolean z4) {
        parcel.writeInt(z4 ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public static Parcelable m80995b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: c */
    public static void m80996c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m80997d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }
}
