package androidx.fragment.app;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C1279c implements Parcelable {
    public static final Parcelable.Creator<C1279c> CREATOR = new C0113a(25);

    /* JADX INFO: renamed from: w */
    public final ArrayList f5556w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f5557x;

    public C1279c(ArrayList arrayList, ArrayList arrayList2) {
        this.f5556w = arrayList;
        this.f5557x = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeStringList(this.f5556w);
        parcel.writeTypedList(this.f5557x);
    }

    public C1279c(Parcel parcel) {
        this.f5556w = parcel.createStringArrayList();
        this.f5557x = parcel.createTypedArrayList(C1275b.CREATOR);
    }
}
