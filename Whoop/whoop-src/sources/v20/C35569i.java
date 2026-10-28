package v20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C35569i implements InterfaceC35571k {

    /* JADX INFO: renamed from: w */
    public static final C35569i f151303w = new C35569i();
    public static final Parcelable.Creator<C35569i> CREATOR = new C35565e(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
