package p623xr;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: xr.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38618n {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f166128a = 0;

    static {
        AbstractC38618n.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m123814a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m123815b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC2875y.m8295h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
