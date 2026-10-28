package v20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16665h1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C35565e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151295a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f151295a) {
            case 0:
                AbstractC22676k.m65750j(parcel, "parcel");
                return new C35566f(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), C16665h1.CREATOR.createFromParcel(parcel));
            case 1:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C35568h.f151302w;
            case 2:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C35569i.f151303w;
            default:
                AbstractC22676k.m65750j(parcel, "parcel");
                parcel.readInt();
                return C35570j.f151304w;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f151295a) {
            case 0:
                return new C35566f[i13];
            case 1:
                return new C35568h[i13];
            case 2:
                return new C35569i[i13];
            default:
                return new C35570j[i13];
        }
    }
}
