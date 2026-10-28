package p434qq;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1312k0;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: qq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C30542b extends AbstractC35701b {
    public static final Parcelable.Creator<C30542b> CREATOR = new C1312k0(9);

    /* JADX INFO: renamed from: y */
    public boolean f125679y;

    public C30542b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C30542b.class.getClassLoader();
        }
        this.f125679y = parcel.readInt() == 1;
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f125679y ? 1 : 0);
    }
}
