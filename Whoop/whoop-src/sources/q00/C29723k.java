package q00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q00.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C29723k implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121567a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f121567a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29731o((InterfaceC29729n) parcel.readParcelable(C29731o.class.getClassLoader()), parcel.readString());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29725l(parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C29727m(parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f121567a) {
            case 0:
                return new C29731o[i13];
            case 1:
                return new C29725l[i13];
            default:
                return new C29727m[i13];
        }
    }
}
