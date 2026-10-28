package cr;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1312k0;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: cr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11063a extends AbstractC35701b {
    public static final Parcelable.Creator<C11063a> CREATOR = new C1312k0(2);

    /* JADX INFO: renamed from: y */
    public boolean f34931y;

    public C11063a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f34931y = parcel.readInt() == 1;
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f34931y ? 1 : 0);
    }
}
