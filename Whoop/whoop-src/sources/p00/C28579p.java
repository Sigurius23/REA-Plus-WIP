package p00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsentUi;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29731o;

/* JADX INFO: renamed from: p00.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C28579p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        boolean z13;
        AbstractC22676k.m65750j(parcel, "parcel");
        boolean z14 = false;
        boolean z15 = true;
        if (parcel.readInt() != 0) {
            z14 = true;
        }
        if (parcel.readInt() == 0) {
            z15 = z14;
        }
        InterfaceC41211c interfaceC41211c = (InterfaceC41211c) parcel.readParcelable(C28580q.class.getClassLoader());
        boolean z16 = parcel.readInt() != 0 ? true : z14;
        if (parcel.readInt() != 0) {
            z4 = z15;
            z13 = z4;
        } else {
            z4 = z15;
            z13 = z14;
        }
        String string = parcel.readString();
        boolean z17 = z4;
        String string2 = parcel.readString();
        boolean z18 = parcel.readInt() != 0 ? z17 : z14;
        if (parcel.readInt() == 0) {
            z17 = z14;
        }
        return new C28580q(z14, z15, interfaceC41211c, z16, z13, string, string2, z18, z17, parcel.readInt() == 0 ? null : C29731o.CREATOR.createFromParcel(parcel), (ConsentUi.ConsentSection) parcel.readParcelable(C28580q.class.getClassLoader()), parcel.readInt() != 0 ? z17 : false);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C28580q[i13];
    }
}
