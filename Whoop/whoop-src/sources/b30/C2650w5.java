package b30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.w5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2650w5 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10354a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10354a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C2657x5(parcel.readString());
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C2664y5.f10428w;
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C2671z5.f10463w;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f10354a) {
            case 0:
                return new C2657x5[i13];
            case 1:
                return new C2664y5[i13];
            default:
                return new C2671z5[i13];
        }
    }
}
