package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p088dc.C11897d;
import p088dc.InterfaceC11898e;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C2125b(23);

    /* JADX INFO: renamed from: w */
    public final InterfaceC11898e f7232w;

    public ParcelImpl(InterfaceC11898e interfaceC11898e) {
        this.f7232w = interfaceC11898e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        new C11897d(parcel).m32019l(this.f7232w);
    }

    public ParcelImpl(Parcel parcel) {
        this.f7232w = new C11897d(parcel).m32015h();
    }
}
