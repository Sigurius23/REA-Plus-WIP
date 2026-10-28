package p474s;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1312k0;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: s.r2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C32003r2 extends AbstractC35701b {
    public static final Parcelable.Creator<C32003r2> CREATOR = new C1312k0(10);

    /* JADX INFO: renamed from: y */
    public int f132817y;

    /* JADX INFO: renamed from: z */
    public boolean f132818z;

    public C32003r2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f132817y = parcel.readInt();
        this.f132818z = parcel.readInt() != 0;
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeInt(this.f132817y);
        parcel.writeInt(this.f132818z ? 1 : 0);
    }
}
