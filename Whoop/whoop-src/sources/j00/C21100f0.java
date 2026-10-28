package j00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j00.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C21100f0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80010a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f80010a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C21102g0(parcel.readString());
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C21104h0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), EnumC21098e0.valueOf(parcel.readString()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f80010a) {
            case 0:
                return new C21102g0[i13];
            default:
                return new C21104h0[i13];
        }
    }
}
