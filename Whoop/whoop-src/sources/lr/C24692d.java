package lr;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1312k0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: lr.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C24692d extends AbstractC35701b {
    public static final Parcelable.Creator<C24692d> CREATOR = new C1312k0(5);

    /* JADX INFO: renamed from: y */
    public final int f96600y;

    public C24692d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f96600y = parcel.readInt();
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f96600y);
    }

    public C24692d(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        this.f96600y = sideSheetBehavior.f21026h;
    }
}
