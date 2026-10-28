package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.fragment.app.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1316l0 implements Parcelable {
    public static final Parcelable.Creator<C1316l0> CREATOR = new C1312k0(0);

    /* JADX INFO: renamed from: w */
    public final Bundle f5664w;

    public C1316l0(Bundle bundle) {
        this.f5664w = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeBundle(this.f5664w);
    }

    public C1316l0(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f5664w = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }
}
