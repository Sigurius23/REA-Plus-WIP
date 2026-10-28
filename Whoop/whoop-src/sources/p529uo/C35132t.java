package p529uo;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C4969a;
import p486sp.C32854e;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: uo.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C35132t extends AbstractC36219a {
    public static final Parcelable.Creator<C35132t> CREATOR = new C32854e(25);

    /* JADX INFO: renamed from: E */
    public final boolean f149070E;

    /* JADX INFO: renamed from: w */
    public final int f149071w;

    /* JADX INFO: renamed from: x */
    public final IBinder f149072x;

    /* JADX INFO: renamed from: y */
    public final C4969a f149073y;

    /* JADX INFO: renamed from: z */
    public final boolean f149074z;

    public C35132t(int i13, IBinder iBinder, C4969a c4969a, boolean z4, boolean z13) {
        this.f149071w = i13;
        this.f149072x = iBinder;
        this.f149073y = c4969a;
        this.f149074z = z4;
        this.f149070E = z13;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35132t)) {
            return false;
        }
        C35132t c35132t = (C35132t) obj;
        if (!this.f149073y.equals(c35132t.f149073y)) {
            return false;
        }
        IBinder iBinder = this.f149072x;
        InterfaceC35119i interfaceC35119iM111054X = iBinder == null ? null : AbstractBinderC35103a.m111054X(iBinder);
        IBinder iBinder2 = c35132t.f149072x;
        return AbstractC35135w.m111097i(interfaceC35119iM111054X, iBinder2 != null ? AbstractBinderC35103a.m111054X(iBinder2) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f149071w);
        AbstractC36221c.m115327h(parcel, 2, this.f149072x);
        AbstractC36221c.m115331l(parcel, 3, this.f149073y, i13);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f149074z ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f149070E ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
