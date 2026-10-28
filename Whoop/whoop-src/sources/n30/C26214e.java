package n30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29926q0;

/* JADX INFO: renamed from: n30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C26214e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new C26215f(parcel.readInt() == 0 ? null : C29926q0.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new C26215f[i13];
    }
}
