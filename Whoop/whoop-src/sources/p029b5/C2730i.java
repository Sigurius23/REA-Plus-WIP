package p029b5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: b5.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C2730i implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2731j f10741a;

    public C2730i(InterfaceC2731j interfaceC2731j) {
        this.f10741a = interfaceC2731j;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return this.f10741a.createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return this.f10741a.newArray(i13);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f10741a.createFromParcel(parcel, classLoader);
    }
}
