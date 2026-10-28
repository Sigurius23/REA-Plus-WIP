package p404pq;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1312k0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: pq.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C29456d extends AbstractC35701b {
    public static final Parcelable.Creator<C29456d> CREATOR = new C1312k0(7);

    /* JADX INFO: renamed from: E */
    public final boolean f119619E;

    /* JADX INFO: renamed from: F */
    public final boolean f119620F;

    /* JADX INFO: renamed from: G */
    public final boolean f119621G;

    /* JADX INFO: renamed from: y */
    public final int f119622y;

    /* JADX INFO: renamed from: z */
    public final int f119623z;

    public C29456d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f119622y = parcel.readInt();
        this.f119623z = parcel.readInt();
        this.f119619E = parcel.readInt() == 1;
        this.f119620F = parcel.readInt() == 1;
        this.f119621G = parcel.readInt() == 1;
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f119622y);
        parcel.writeInt(this.f119623z);
        parcel.writeInt(this.f119619E ? 1 : 0);
        parcel.writeInt(this.f119620F ? 1 : 0);
        parcel.writeInt(this.f119621G ? 1 : 0);
    }

    public C29456d(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.f119622y = bottomSheetBehavior.f20784L;
        this.f119623z = bottomSheetBehavior.f20807e;
        this.f119619E = bottomSheetBehavior.f20801b;
        this.f119620F = bottomSheetBehavior.f20781I;
        this.f119621G = bottomSheetBehavior.f20782J;
    }
}
