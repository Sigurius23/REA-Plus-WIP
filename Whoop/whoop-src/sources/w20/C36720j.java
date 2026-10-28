package w20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16665h1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: w20.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C36720j implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157205a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f157205a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C36721k(parcel.readString(), EnumC38853i.valueOf(parcel.readString()), C16665h1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C36723m.f157212w;
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C36724n(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f157205a) {
            case 0:
                return new C36721k[i13];
            case 1:
                return new C36723m[i13];
            default:
                return new C36724n[i13];
        }
    }
}
